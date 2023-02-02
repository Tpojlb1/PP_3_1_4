package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.services.UserService;

import java.security.Principal;


@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user")
    public String getHome(Model model, Principal principal) {
        model.addAttribute("users", userService.findUserByEmail(principal.getName()));
        return "user";
    }

    @GetMapping(value = "/user/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping(value = "/admin")
    public String getAllUsers(Model model, Principal principal) {
        model.addAttribute("users", userService.findUserByEmail(principal.getName()));
        model.addAttribute("newUser", new User());
        model.addAttribute("user", userService.getAllUsers());
        return "admin";
    }

    @PostMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/admin";
    }


    @PostMapping(value = "/updateUser/{id}")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/admin";
    }

    @PostMapping(value = "/createUser")
    public String createUser(@ModelAttribute("user") User user) {
        userService.create(user);
        return "redirect:/admin";
    }
}
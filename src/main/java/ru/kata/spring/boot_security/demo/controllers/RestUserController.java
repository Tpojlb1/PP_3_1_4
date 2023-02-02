//package ru.kata.spring.boot_security.demo.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import ru.kata.spring.boot_security.demo.models.User;
//import ru.kata.spring.boot_security.demo.services.UserService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/user")
//    public class RestUserController {
//    private final UserService userService;
//    @Autowired
//    public RestUserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/{id}")
//    public User showOneUser(@PathVariable ("id") long id){
//        User user =userService.getById(id);
//        return user;
//    }
//    @GetMapping
//    public List<User> getPeople(){
//        return userService.getAllUsers();
//    }
//
//}

//package ru.kata.spring.boot_security.demo.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import ru.kata.spring.boot_security.demo.models.Role;
//import ru.kata.spring.boot_security.demo.models.User;
//import ru.kata.spring.boot_security.demo.services.RoleService;
//import ru.kata.spring.boot_security.demo.services.UserService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/rest")
//public class AdminRestController {
//private final UserService userService;
//private final RoleService roleService;
//@Autowired
//public AdminRestController(UserService userService, RoleService roleService) {
//    this.userService = userService;
//    this.roleService = roleService;
//}
//@PostMapping("/users")
//public User create(@RequestBody User user){
//    userService.create(user);
//    return user;
//}
//@PutMapping("/users")
//public User updateUser(@RequestBody User user){
//    userService.update(user);
//    return user;
//}
//@DeleteMapping("/users/{id}")
//public String deleteUser(@PathVariable long id){
//    userService.delete(id);
//    return "User with id: " + id +" was deleted";
//}
//@GetMapping("/users")
//public List<User> showAllUser(){
//    return userService.getAllUsers();
//}
//@GetMapping("/users/{id}")
//public User showUser(@PathVariable("id") Long id) {
//    return userService.getById(id);
//}
//@GetMapping("/roles")
//public List<Role> getAllRole(){
//    return roleService.getAllRole();
//}
//}

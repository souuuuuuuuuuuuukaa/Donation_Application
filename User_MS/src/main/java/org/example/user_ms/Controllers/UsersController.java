package org.example.user_ms.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.user_ms.Entity.Users;
import org.example.user_ms.Repositoris.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(path = "/getall")
    public List<Users> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping("CreateUser")
    public Users createUser(@RequestBody Users user) {
        return userRepo.save(user);
    }
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id) {
        return userRepo.findById(id).get();
    }

    @PutMapping("/Update/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users userDetails) {
        Users user = userRepo.findById(id).get();
        user.setNom(userDetails.getNom());
        user.setPrenom(userDetails.getPrenom());
        user.setEmail(userDetails.getEmail());
        return userRepo.save(user);
    }
}
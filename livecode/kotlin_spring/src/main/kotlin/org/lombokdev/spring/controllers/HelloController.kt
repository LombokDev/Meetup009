package org.lombokdev.spring.controllers

import org.lombokdev.spring.entities.User
import org.lombokdev.spring.entities.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
class HelloController(
    private val userRepo: UserRepository
) {

    @GetMapping("/hello")
    fun getHelloController(@RequestParam("name") nama: String): String {
        return "Hello $nama from Spring REST"
    }

    @PostMapping("/daftar")
    fun pendaftaran(@RequestBody data: User): User {
        // create
        val savedData = userRepo.save(data)
        return savedData
    }

    @GetMapping("/users")
    fun getAllUser(): List<User> {
        return userRepo.findAll()
    }

    @GetMapping("/user")
    fun findUserByEmail(@RequestParam email: String): User {
        return userRepo.findByEmail(email)
    }

}



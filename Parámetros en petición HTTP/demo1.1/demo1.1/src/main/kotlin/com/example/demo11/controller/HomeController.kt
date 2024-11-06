package com.example.demo11.controller

import com.example.demo11.model.Model
import com.fasterxml.jackson.annotation.JsonCreator.Mode
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/home")
class HomeController {

  /*  @GetMapping("/{id}")
    fun home(@PathVariable("id") id: Int ): String {
        return "hello world! $id"
    }*/

/*@GetMapping()
    fun home(@PathParam ("id") id: Int) : String {
        return "hello, world!  $id"
    }*/

    @GetMapping()
    fun home(@RequestBody model: Model) : String {
        return "hello, world! ${model.id} ${model.name} ${model.age}"
    }


}
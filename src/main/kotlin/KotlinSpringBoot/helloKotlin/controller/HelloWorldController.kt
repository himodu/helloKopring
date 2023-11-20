package KotlinSpringBoot.helloKotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController {
    @GetMapping("/")
    fun showHelloWorld(): String{
        println("hello");
        return "redirect:/hello.html";
    }
}
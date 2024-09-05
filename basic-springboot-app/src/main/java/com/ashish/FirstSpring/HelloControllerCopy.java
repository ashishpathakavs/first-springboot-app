package com.ashish.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControllerCopy {

    @GetMapping("/helloccopy")
    public HelloResponse hello(){
        return new HelloResponse("Hello, World!");
    }

    @GetMapping("/hellocopy/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello " + name + "!");
    }

    @PostMapping("/hellocopy")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello " + name + "!");
    }


}

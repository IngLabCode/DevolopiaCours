package com.example.task;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Search {
    @GetMapping("/home/my-resarch")
    public List<Student> search(@RequestParam(name = "",required = false,defaultValue = "false")String name) {
        List<Student> list = List.of(
                new Student("murad"),
                new Student("erebxan"),
                new Student("meherrem"),
                new Student("ingilab"),
                new Student("fuad"));
        return list.stream().filter(s->s.getName().contains(name)).toList();


    }
}

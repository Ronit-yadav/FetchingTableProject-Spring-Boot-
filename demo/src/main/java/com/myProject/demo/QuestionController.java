package com.myProject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @GetMapping("/questions")
    public String getQuestions() {
        return "Here are your questions!";
    }
}

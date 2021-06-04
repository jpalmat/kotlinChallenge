package com.example.challenge.controller

import com.example.challenge.model.Challenge
import com.example.challenge.service.InterviewService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ChallengeController {

    @Autowired
    lateinit var interviewService: InterviewService

    @GetMapping("/interviews")
    fun getInterviews(@PathVariable id: String): List<Challenge> {
        return interviewService.getInterview("")
    }
}
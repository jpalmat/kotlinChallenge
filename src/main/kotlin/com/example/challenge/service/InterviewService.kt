package com.example.challenge.service

import com.example.challenge.model.Challenge

interface InterviewService {

    fun getInterview(id: String) : List<Challenge>
}
package com.example.challenge.service

import com.example.challenge.model.Challenge

class ChallengeService {
    fun isPassing(challengeList: List<Challenge>): Boolean? {
        if(challengeList.size==0){
            return null
        }

        val correct = challengeList.count { it.correct }

        return correct.toDouble() * 100.toDouble() / challengeList.size.toDouble() > 87.5
    }
}
fun main(args: Array<String>){
    val challengeList = listOf(Challenge("", "", false),
        Challenge("", "", false))
    val correct = challengeList.count { it.correct }
    println(correct)
}
package com.example.challenge.service

import com.example.challenge.model.Challenge
import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class ChallengeServiceTest {

    private var service = ChallengeService()


    @Test
    fun `isPassing should return true is the collection has more 87 5 good`() {
        val questions = listOf(
            Challenge("q1", "a1", true),
            Challenge("q2", "a2", false),
            Challenge("q3", "a3", true),
            Challenge("q4", "a4", true),
            Challenge("q3", "a3", true),
            Challenge("q4", "a4", true),
            Challenge("q3", "a3", true),
            Challenge("q4", "a4", true),
            Challenge("q4", "a4", true))

        val actual = service.isPassing(questions)
        if (actual != null) {
            Assertions.assertTrue(actual)
        }
    }

    @Test
    fun `isPassing should return false is the collection has less 87 5 good`() {
        val questions = listOf(
            Challenge("q1", "a1", true),
            Challenge("q2", "a2", false),
            Challenge("q3", "a3", true),
            Challenge("q4", "a4", true),
            Challenge("q3", "a3", true),
            Challenge("q4", "a4", true))

        val actual = service.isPassing(questions)
        if (actual != null) {
            Assertions.assertFalse(actual)
        }
    }

    @Test
    fun `isPassing Return null if there are no challenges in the collection input`() {
        val questions = emptyList<Challenge>()
        val actual = service.isPassing(questions)
        Assertions.assertEquals(null, actual)
    }
}
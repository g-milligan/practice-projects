package com.practice.datastructures.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostfixEvaluationTest {

    private PostfixEvaluation unitUnderTest;

    @BeforeEach
    void setup() {
        unitUnderTest = new PostfixEvaluation();
    }

    @Test
    void testEvaluatePostfix() {
        int actual = unitUnderTest.EvaluatePostfix("231*+9-");

        assertEquals(-4, actual);
    }
}

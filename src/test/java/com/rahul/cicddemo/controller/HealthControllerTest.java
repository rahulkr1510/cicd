package com.rahul.cicddemo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthControllerTest {

    @Test
    void shouldReturnHealthMessage() {
        HealthController controller = new HealthController();

        String response = controller.health();

        assertEquals("CI/CD Demo App v6 is running", response);
    }
}
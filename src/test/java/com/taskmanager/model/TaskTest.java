package com.taskmanager.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task Model Tests")
public class TaskTest {
    private Task task;

    @BeforeEach
    public void setUp(){
        task = new Task(1,"Write Tests",5);
    }

    @Test
    @DisplayName("Task status by default should be incomplete")
    public void Task_status_by_default_should_be_incomplete(){
        assertFalse(task.isCompleted());
    }

    @Test
    @DisplayName("Task status should be completed after markComplete method")
    public void Task_status_should_be_completed_after_markComplete(){
        task.markComplete();
        assertTrue(task.isCompleted());
    }

    @Test
    @DisplayName("Task with priority should be high priority")
    public void Task_with_priority_should_be_high_priority(){
        assertTrue(task.isHighPriority());
    }

    @Test
    @DisplayName("Task constructor should set fields correctly")
    public void Task_constructor_should_set_fields_correctly(){
        assertEquals(1,task.getId());
        assertEquals("Write Tests",task.getTitle());
        assertEquals(5,task.getPriority());
    }
}

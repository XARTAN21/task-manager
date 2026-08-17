package com.taskmanager.model;

public class Task {
    private int id;
    private String title;
    private boolean completed;
    private int priority; // 1 = low, 5 = high

    public Task(int id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.completed = false; // new tasks start incomplete
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }
    public int getPriority() { return priority; }

    // Behavior
    public void markComplete() {
        this.completed = true;
    }

    public boolean isHighPriority() {
        return priority >= 4;
    }
}
package com.taskmanager.model;

enum Status{
    PENDING, COMPLETED, DISCARDED
}

public class Task {
    private int taskId;
    private String taskName;
    private String description;
    private int priority;
    private Status status;
    private int deadline;

    public Task(int id, String name, String desc, int priority, Status status, int deadline){
        this.taskId = id;
        this.taskName = name;
        this.description = desc;
        this.priority = priority;
        this.status = status;
        this.deadline = deadline;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}

package com.eci.cosw.springbootsecureapi.model;

public class Todo {

    public String description;
    public int priority = 1;
    public boolean completed = false;

    public Todo(String description, int priority, boolean completed) {
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    public Todo(){

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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}

package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String itemi;
    private String calendar;
    public Todo (){

    }

    public Todo(String itemi) {
        this.itemi = itemi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getitemi() {
        return itemi;
    }

    public void setitemi(String itemi) {
        this.itemi = itemi;
    }

    public String getCalendar() { return calendar; }

    public void setCalendar(String calendar) { this.calendar = calendar; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }
}

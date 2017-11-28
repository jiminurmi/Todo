package com.example.todo.com.example.model;

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
    private String item;
    private Date calendar;
    public Todo (){

    }

    public Todo(String item) {
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getCalendar() { return calendar; }

    public void setCalendar(Date calendar) { this.calendar = calendar; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }
}

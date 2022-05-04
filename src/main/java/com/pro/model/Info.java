package com.pro.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Info {
    private int id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    public Info() {
    }

    public Info(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}

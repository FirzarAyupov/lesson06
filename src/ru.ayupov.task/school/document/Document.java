package ru.ayupov.task.school.document;

import java.time.LocalDate;

public class Document {
    protected String name;
    protected LocalDate date;

    public Document(String name) {
        this.name = name;
    }

    protected Document(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDate(LocalDate date) {
        this.date = date;
    }

    protected LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

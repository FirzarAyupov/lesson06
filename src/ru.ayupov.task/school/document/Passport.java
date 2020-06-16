package ru.ayupov.task.school.document;

import java.time.LocalDate;

public class Passport extends Document {
    private static final String name = "Паспорт";
    private int series;
    private int number;

    public Passport() {
        super(name);
    }

    public Passport(String date, int series, int number) {
        super(name, date);
        this.series = series;
        this.number = number;
    }

}

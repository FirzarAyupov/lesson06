package ru.ayupov.task.school.human;

import ru.ayupov.task.school.document.Document;

import java.time.LocalDate;
import java.time.Period;

class Human {
    protected String name;
    LocalDate birthday;
    Document[] documents;

    public Human(String name, String birthdayStr) {
        this.name = name;
        this.birthday = birthdayStringToDate(birthdayStr);
    }

    private LocalDate birthdayStringToDate(String birthdayStr) {
        // TODO: 16.06.2020 Добавить проверку формата ввода
        return LocalDate.parse(birthdayStr);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(this.birthday, currentDate).getYears();
    }

    protected String getFullInfo() {
        return (getName() + ", " + getAge() + " лет");
    }
}

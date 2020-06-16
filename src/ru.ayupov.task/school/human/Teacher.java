package ru.ayupov.task.school.human;

public class Teacher extends Human {
    String lesson;
    String patronymic;

    public Teacher(String name, String patronymic, String birthday, String lesson) {
        super(name, birthday);
        this.patronymic = patronymic;
        this.lesson = lesson;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        return this.name + " " + this.patronymic;
    }

    public String getLesson() {
        return lesson;
    }

    @Override
    public String getFullInfo() {
        return (getFullName() + ", "
                + getAge() + " лет,"
                + "преподаваемый предмет - " + getLesson());
    }
}

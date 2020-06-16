package ru.ayupov.task.school.lesson;

public enum Lessons {
    ALGEBRA("Алгебра"),
    BIOLOGY("Биология"),
    DRAWING("Рисование"),
    CHEMISTRY("Химия"),
    GEOGRAPHY("География"),
    GEOMETRY("Геометрия"),
    HISTORY("История"),
    LITERATURE("Литература"),
    MATHEMATICS("Математика"),
    MUSIC("Музыка"),
    PHYSICS("Физика"),
    TECHNOLOGY("Труд");

    private String name;

    Lessons(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.name;
    }
}

package ru.ayupov.task.school.document;

public class RecordBook extends Document {
    String[] lessons;
    private static final String name = "Зачетка";

    public RecordBook() {
        super(name);
    }

    public RecordBook(String date, String[] lessons) {
        super(name, date);
        this.lessons = lessons;
    }
}

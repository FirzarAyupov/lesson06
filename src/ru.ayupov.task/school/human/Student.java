package ru.ayupov.task.school.human;

import ru.ayupov.task.school.document.Document;

public class Student extends Human {
    private int course;

    public Student(String name, String birthday) {
        super(name, birthday);
    }

    public Student(String name, String birthday, int course, Document[] documents) {
        super(name, birthday);

        this.course = course;

        int docLength = documents.length;
        this.documents = new Document[docLength];
        for (int i = 0; i < docLength; i++) {
            this.documents[i] = documents[i];
        }
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void nextCourse() {
        this.course++;
    }

    private String getDocumentsInfo(Document[] documents) {
        String result = "";
        for (Document doc : documents) {
            result += doc.toString() + " ";
        }
        return result;
    }

    @Override
    public String getFullInfo() {
        String result = getName() + ", "
                + getAge() + " лет,"
                + "учится в " + getCourse() + " классе.";
        if (this.documents != null) {
            result += System.lineSeparator() + "Документы: " + getDocumentsInfo(this.documents);
        }
        return result;
    }
}

package ru.ayupov.task;

import ru.ayupov.task.school.document.Document;
import ru.ayupov.task.school.document.Passport;
import ru.ayupov.task.school.document.RecordBook;
import ru.ayupov.task.school.human.Student;
import ru.ayupov.task.school.human.Teacher;
import ru.ayupov.task.school.lesson.Lessons;

/**
 * Домашнее задание №4.
 * <p>
 * Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
 * Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
 * <p>
 * Ограничения:
 * Минимум 3 класса
 * Наличие нескольких полей и методов
 * Использование модификаторов доступа
 * Использование принципов ООП
 */

public class Main {
    public static void main(String[] args) {

        Student Ivan = new Student("Иван", "2006-05-16");
        System.out.printf("Ученик %s зачислен в школу%n", Ivan.getName());
        System.out.println(Ivan.getFullInfo());

        Ivan.nextCourse();
        System.out.printf("Ученик %s переведен в следущий класс%n", Ivan.getName());
        System.out.println(Ivan.getFullInfo());

        Ivan.setCourse(8);
        System.out.printf("Ученик %s переведен в 8 класс%n", Ivan.getName());
        System.out.println(Ivan.getFullInfo());


        Document[] alexDocument = new Document[2];
        alexDocument[0] = new Passport("2010-05-12", 9999, 999999);
        alexDocument[1] = new RecordBook();
        Student Alex = new Student("Алекс", "2010-03-20", 4, alexDocument);
        System.out.printf("Ученик %s зачислен в школу%n", Alex.getName());
        System.out.println(Alex.getFullInfo());


        Teacher Olga = new Teacher("Ольга", "Михайловна", "1988-11-27", Lessons.ALGEBRA.toString());
        System.out.printf("%s принята в школу на должность учителя%n", Olga.getFullName());
        System.out.println(Olga.getFullInfo());

    }
}

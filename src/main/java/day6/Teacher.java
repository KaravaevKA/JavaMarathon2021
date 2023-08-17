package day6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int mark = random.nextInt(6-2) + 2;
        String markLiteral = "";
        if (mark == 5) {
            markLiteral = "Отлично";
        } else if (mark == 4) {
            markLiteral = "Хорошо";
        } else if (mark == 3) {
            markLiteral = "Удовлетворительно";
        } else if (mark == 2) {
            markLiteral = "Неудовлетворительно";
        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку " + markLiteral);
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

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

        int mark = ThreadLocalRandom.current().nextInt(2, 6);

        if (mark == 5) {
            System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку отлично");
        } else if (mark == 4) {
            System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку хорошо");
        } else if (mark == 3) {
            System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку удовлетворительно");
        } else if (mark == 2) {
            System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку неудовлетворительно");
        }
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

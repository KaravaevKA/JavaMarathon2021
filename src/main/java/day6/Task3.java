package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Олег","математика");
        Student student = new Student("Иван");
        teacher.evaluate(student);
    }
}

package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Олег","М2О-105Б-18");
        Teacher teacher = new Teacher("Александр Иванович","Сопротивление материалов");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }

}

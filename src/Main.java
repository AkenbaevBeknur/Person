import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Student> createStudents() {
        Student student1 = new Student("John Smith", 18, false);
        student1.addMark("Math", 90);
        student1.addMark("Science", 85);
        student1.addMark("History", 92);

        Student student2 = new Student("Alice Johnson", 17, false);
        student2.addMark("Math", 95);
        student2.addMark("Science", 88);
        student2.addMark("History", 79);

        Student student3 = new Student("Bob Williams", 16, false);
        student3.addMark("Math", 82);
        student3.addMark("Science", 90);
        student3.addMark("History", 87);

        return List.of(student1, student2, student3);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jane Doe", 35, true, 8);
        teacher.introduceMyself();
        System.out.println("Salary: $" + teacher.getSalary());

        List<Student> students = createStudents();
        for (Student student : students) {
            student.introduceMyself();
            for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
                String subject = entry.getKey();
                int mark = entry.getValue();
                System.out.println(subject + ": " + mark);
            }
            System.out.println("Average Mark: " + student.calculateAverageMark());
            System.out.println();
        }
    }
}

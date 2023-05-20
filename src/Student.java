import java.util.HashMap;
import java.util.Map;

class Student extends Person {
    private Map<String, Integer> marks;

    public Student(String fullName, int age, boolean isMarried) {
        super(fullName, age, isMarried);
        this.marks = new HashMap<>();
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void addMark(String subject, int mark) {
        marks.put(subject, mark);
    }

    public double calculateAverageMark() {
        if (marks.isEmpty()) {
            return 0.0;
        }

        int totalMarks = 0;
        for (int mark : marks.values()) {
            totalMarks += mark;
        }

        return (double) totalMarks / marks.size();
    }
}

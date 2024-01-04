import java.util.Arrays;
import java.util.HashMap;

public class TestPerson {
    public static void main(String[] args) {
        HashMap<String, Double> subjects = new HashMap<>();
        subjects.put("SQL", 5.0);
        subjects.put("DSA", 6.1);
        subjects.put("OOP", 5.0);

        Person student = new Person("Lê Hoàng Minh", 2003, subjects);

        for (String subjectName : student.getSubjects().keySet()) {
            System.out.println(subjectName + " - " + student.getSubjects().get(subjectName));
        }

        System.out.println("Check: " + student.doDissertation());
        System.out.println("Check: " + student.graduationExamination());
        System.out.println("Check: " + student.retakeExam());
    }
}

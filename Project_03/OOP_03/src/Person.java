import java.util.HashMap;

public class Person {
    private String fullName;
    private int yob;
    private HashMap<String, Double> subjects;

    public Person() {
    }

    public Person(String fullName, int yob, HashMap<String, Double> subjects) {
        this.fullName = fullName;
        this.yob = yob;
        this.subjects = subjects;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public HashMap<String, Double> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Double> subjects) {
        this.subjects = subjects;
    }

    public boolean doDissertation() {
        // Calculating avg score
        double sum = 0, avg;
        for (Double score : subjects.values()) {
            if (score < 5) return false;
            sum += score;
        }
        avg = sum / subjects.values().size();
        if (avg < 7) return false;
        return true;
    }

    public boolean graduationExamination() {
        // Calculating avg score
        double sum = 0, avg;
        for (Double score : subjects.values()) {
            if (score < 5) return false;
            sum += score;
        }
        avg = sum / subjects.values().size();
        if (avg > 7) return false;
        return true;
    }

    public boolean retakeExam() {
        for (Double score : subjects.values()) {
            if (score < 5) return true;
        }
        return false;
    }
}

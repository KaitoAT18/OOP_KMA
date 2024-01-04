import java.time.LocalDate;

public class MechanicalEngineeringStudent extends Student {
    private String major = "Mechanical Engineering";

    public MechanicalEngineeringStudent(String name, LocalDate birthDate, String hometown) {
        super(name, birthDate, hometown);
    }

    public String getMajor() {
        return major;
    }
}
import java.time.LocalDate;

public class ElectricalEngineeringStudent extends Student {
    private String major = "Electrical Engineering";

    public ElectricalEngineeringStudent(String name, LocalDate birthDate, String hometown) {
        super(name, birthDate, hometown);
    }

    public String getMajor() {
        return major;
    }
}
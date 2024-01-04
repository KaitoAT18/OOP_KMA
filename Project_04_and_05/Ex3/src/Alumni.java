import java.time.LocalDate;

public class Alumni extends Student {
    private LocalDate graduationDate;

    public Alumni(String name, LocalDate birthDate, String hometown, LocalDate graduationDate) {
        super(name, birthDate, hometown);
        this.graduationDate = graduationDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }
}
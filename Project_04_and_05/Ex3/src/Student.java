import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthDate;
    private String hometown;

    public Student(String name, LocalDate birthDate, String hometown) {
        this.name = name;
        this.birthDate = birthDate;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
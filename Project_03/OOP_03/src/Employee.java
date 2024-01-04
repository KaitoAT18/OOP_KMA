import java.util.Scanner;

public class Employee {
    private String fullName;
    private String id;

    public Employee() {
    }

    public Employee(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        this.fullName = sc.nextLine();
        System.out.print("Nhập số CCCD: ");
        this.id = sc.nextLine();
    }

    public void showInfo() {
        System.out.println("-------------- THÔNG TIN NHÂN VIÊN --------------");
        System.out.println("Họ và tên: " + this.fullName);
        System.out.println("Số CCCD: " + this.id);
    }
}

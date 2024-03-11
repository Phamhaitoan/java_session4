package Ex02;

public class Student {
    private String studentCode;
    private String studentName;
    private int Age;
    private boolean Sex;

//Contructor không tham số:
    public Student (){};
//contructor đủ tham số:
    public Student(String studentCode, String studentName, int age, boolean sex) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        Age = age;
        Sex = sex;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return Age;
    }

    public boolean isSex() {
        return Sex;
    }
//set
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    // phương thức hiển thị:
    public void display(){
        String sexDisplay = (Sex) ? "Nam" : "Nữ";
        System.out.println("mã sinh viên" + studentCode);
        System.out.println("tên sinh viên" + studentName);
        System.out.println("tuổi"+ Age);
        System.out.println("giới tính"+ sexDisplay);
    }
}


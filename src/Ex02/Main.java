package Ex02;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("D000834234","Toàn",18,true);
        Student student02 = new Student("D00072346","đạt",18,true);

        System.out.println(student01.getStudentName());
        System.out.println(student02.getAge());


        System.out.println("========thông tin của sinh viên 1=======");
        student01.display();
    }
}

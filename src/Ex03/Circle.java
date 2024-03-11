package Ex03;

import java.util.Scanner;


public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle(){};

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

//    get

    public double getBanKinh() {
        return banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }
//    set

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
//    public double banKinh{
//        return 0;
//    }
    public double chuVi(){
        return 2 * Math.PI * this.banKinh;
    }
    public double dienTich(){
        return Math.PI * Math.pow(this.banKinh, 2);
    }
    public void inputData(Scanner scanner){
        System.out.println("hãy nhập vào bán kinh hình tròn");
        this.banKinh = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập vào màu sắc hình tròn");
        this.mauSac = scanner.nextLine();
    }
    public  void display(){
        System.out.println("bán kính" + banKinh);
        System.out.println("màu sắc"+ mauSac);
        System.out.println("chu vi"+ chuVi());
        System.out.println("diện tích"+ dienTich());
    }
}


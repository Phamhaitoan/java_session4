package Ex04;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){};

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    get

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
//    set

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
    public void Gpt() {
        double delta = getDiscriminant();

        if (delta < 0) {
            System.out.println("phương trình không có nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("phương trình có nghiệm kép: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phương trình có hai nghiệm là: " + x1 + " và " + x2);
        }
    }

}

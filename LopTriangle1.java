/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double canh(Point a){
        return Math.sqrt((x-a.x)*(x-a.x) + (y-a.y)*(y-a.y));
    }
    public static Point nextPoint(Scanner scanner){
        return new Point(scanner.nextDouble(), scanner.nextDouble());
    }
}

class Triangle{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        double canh1 = a.canh(b);
        double canh2 = a.canh(c);
        double canh3 = b.canh(c);
        if(canh1+canh2 <= canh3 || canh2+canh3<=canh1 || canh3+canh1<=canh2){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        double canh1 = a.canh(b);
        double canh2 = a.canh(c);
        double canh3 = b.canh(c);
        double chuvi = canh1+canh2+canh3;
        return String.format("%.3f", chuvi);
    }
}

public class LopTriangle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    
}

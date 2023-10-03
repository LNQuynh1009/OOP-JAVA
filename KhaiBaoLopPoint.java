/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
class Point {
    private double x;
    private double y;
    /*
    public Point(){
        x = 0;
        y = 0;
    }
    */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /*
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    */
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    double distance(Point p1, Point p2){
        double res = (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y);
        return Math.sqrt(res);
    }
    /*
    double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public String toString(){
        return x + " " + y;
    }
    */
}
public class KhaiBaoLopPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while(TC-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            System.out.printf("%.4f", p1.distance(p1, p2));
            System.out.println();
        }
    }
    
}

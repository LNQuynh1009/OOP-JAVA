/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Rectangle{
    private double w;
    private double h;
    private String Color;

    public Rectangle(double w, double h, String Color) {
        this.w = w;
        this.h = h;
        this.Color = Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color.substring(0, 1).toUpperCase() + Color.substring(1).toLowerCase();
    }
    
    public double findArea(){
        return w*h;
    }
    public double findPerimeter(){
        return(w+h)*2;
    }
}

public class KhaiBaoLopHinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String s = sc.next();
        if(w > 0 && h > 0){
            Rectangle r = new Rectangle(w, h, s);
            System.out.print((int)r.findPerimeter() + " " + (int)r.findArea() + " " + r.getColor());
            System.out.println();
        }
        else{
            System.out.println("INVALID");
        }
    }
    
}

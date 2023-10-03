/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */

class Point3D{
    public int x;
    public int y;
    public int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        int a1 = b.x-a.x;
        int b1 = b.y-a.y;
        int c1 = b.z-a.z;
        int a2 = c.x-a.x;
        int b2 = c.y-a.y;
        int c2 = c.z-a.z;
        int a3 = b1*c2-b2*c1;
        int b3 = a2*c1-a1*c2;
        int c3 = a1*b2-b1*a2;
        int d3 = (-a3*a.x - b3*a.y - c3*a.z);
        if(a3*d.x + b3*d.y + c3*d.z + d3 == 0){
            return true;
        }
        else return false;
    }
}

public class BonDiemTrenMatPhang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
    
}

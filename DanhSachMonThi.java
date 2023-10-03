/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author QUYNH
 */

class Subject{
    private String id;
    private String name;
    private String exam;

    public Subject(String id, String name, String exam) {
        this.id = id;
        this.name = name;
        this.exam = exam;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + exam;
    }
    
}

public class DanhSachMonThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String thi = sc.nextLine();
            a.add(new Subject(ma, ten, thi));
        }
        Collections.sort(a, (Subject o1, Subject o2) -> {
            return o1.getId().compareTo(o2.getId());
        });
        for(Subject i : a){
            System.out.println(i.toString());
        }
    }
    
}

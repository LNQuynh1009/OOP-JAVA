/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LuongMuaTrungBinh;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author QUYNH
 */

 class Tram{
    public static int cur = 1;
    public String id, name;
    public double tb;
    public double lm, tg;

    public Tram(Scanner sc, String ten) {
        id = "T" + String.format("%02d", cur++);
        name = ten;
        String st = sc.next();
        String en = sc.next();
        lm = sc.nextDouble();
        tg = getTime(st, en);
        tb = 0;
    }
    public static double getTime(String t, String e){
        double t1 = ((t.charAt(0)-'0')*10+(t.charAt(1)-'0'))*60 + (t.charAt(3)-'0')*10 + (t.charAt(4)-'0');
        double t2 = ((e.charAt(0)-'0')*10+(e.charAt(1)-'0'))*60 + (e.charAt(3)-'0')*10 + (e.charAt(4)-'0');
        return (t2-t1);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", tb);
    }
    
 }

public class LuongMuaTrungBinh {
    public static double getTime(String t, String e){
        double t1 = ((t.charAt(0)-'0')*10+(t.charAt(1)-'0'))*60 + (t.charAt(3)-'0')*10 + (t.charAt(4)-'0');
        double t2 = ((e.charAt(0)-'0')*10+(e.charAt(1)-'0'))*60 + (e.charAt(3)-'0')*10 + (e.charAt(4)-'0');
        return (t2-t1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Tram> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(a.isEmpty()){
                sc.nextLine();
                String ten = sc.nextLine();
                a.add(new Tram(sc, ten));
            }
            else{
                sc.nextLine();
                int ok = 0;
                String ten = sc.nextLine();
                for(Tram tmp : a){
                    if(tmp.name.equals(ten)){
                        ok = 1;
                        String bd = sc.next();
                        String kt = sc.next();
                        double l = sc.nextDouble();
                        tmp.tg += getTime(bd, kt);
                        tmp.lm += l;
                        break;
                    }
                }
                if(ok == 0){
                    a.add(new Tram(sc, ten));
                }
            }
        }
        for(Tram i : a){
            i.tb = i.lm*60/i.tg;
        }
        for(Tram i : a){
            System.out.println(i);
        }
    }
    
}

/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
*/
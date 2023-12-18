/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThoiGianOnlineLienTuc;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author QUYNH
 */

class HS{
    private String ten;
    private long tg;

    public HS(Scanner sc)throws ParseException {
        ten = sc.nextLine();
        String sd = sc.next();
        String sh = sc.next();
        String ed = sc.next();
        String eh = sc.next();
        tg = getTime(sd, ed) + getPhut(sh, eh);
    }
    static long getTime(String sd, String ed) throws ParseException{
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date st = sdf.parse(sd);
        Date en = sdf.parse(ed);
        return (en.getTime()-st.getTime())/(60*1000);
    }
    static long getPhut(String sh, String eh){
        String[] h1 = sh.split(":");
        String[] h2 = eh.split(":");
        return (Long.parseLong(h2[0])*60 + Long.parseLong(h2[1])) - (Long.parseLong(h1[0])*60 + Long.parseLong(h1[1]));
    }
    public boolean cmp(HS o){
        if(o.tg == tg){
            return o.ten.compareTo(ten) < 1;
        }
        return o.tg > tg;
    }
    @Override
    public String toString() {
        return ten + " " + tg;
    }
    
}

public class ThoiGianOnlineLienTuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        HS[] a = new HS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new HS(sc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    HS tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}

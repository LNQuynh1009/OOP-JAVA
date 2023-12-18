/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HoaDonKhachSan;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author QUYNH
 */

class KH{
    private static int cur = 1;
    private String id, name, room;
    private long ngay;
    private long sum;

    public KH(Scanner sc) {
        id = "KH" + String.format("%02d", cur++);
        name = sc.nextLine().trim();
        room = sc.next().trim();
        String nhan = sc.next().trim();
        String tra = sc.next().trim();
        try{
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date in = sdf.parse(nhan);
            Date out = sdf.parse(tra);
            ngay = (out.getTime()-in.getTime()) / (24*60*60*1000)+1;
        } catch(ParseException e){
            Logger.getLogger(KH.class.getName()).log(Level.SEVERE, null, e);
        }
        long dvu = sc.nextLong();
        long gia = 0;
        if(room.startsWith("1")){
            gia = 25;
        }
        else if(room.startsWith("2")){
            gia = 34;
        }
        else if(room.startsWith("3")){
            gia= 50;
        }
        else gia = 80;
        sum = gia*ngay + dvu;
    }
    public boolean cmp(KH o){
        return o.sum > sum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + ngay + " " + sum;
    }
}

public class HoaDonKhachSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        KH[] a = new KH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new KH(sc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    KH tmp = a[i];
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

/*
3
Huynh Van Thanh   
103 
05/06/2010   
05/06/2010   
15
Le Duc Cong  
106 
08/03/2010   
01/05/2010   
220
Tran Thi Bich Tuyen   
207 
10/04/2010   
21/04/2010   
96*/
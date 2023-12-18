/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class Person{
    private String name;
    private String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public boolean cmp(Person o){
        int nam1 = Integer.parseInt(birthday.substring(6));
        int nam2 = Integer.parseInt(o.birthday.substring(6));
        if(nam1 != nam2){
            return nam1 > nam2;
        }
        int thang1 = (birthday.charAt(3) - '0')*10 + (birthday.charAt(4) - '0');
        int thang2 = (o.birthday.charAt(3) - '0')*10 + (o.birthday.charAt(4) - '0');
        if(thang1 != thang2){
            return thang1 > thang2;
        }
        int ngay1 = (birthday.charAt(0) - '0')*10 + (birthday.charAt(1) - '0');
        int ngay2 = (o.birthday.charAt(0) - '0')*10 + (o.birthday.charAt(1) - '0');
        return ngay1 > ngay2;
    }
    @Override
    public String toString() {
        return name;
    }
    
}

public class TreNhatGiaNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] a = new Person[n];
        for(int i = 0; i < n; i++){
            String ten = sc.next();
            String ns = sc.next();
            a[i] = new Person(ten, ns);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    Person tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(a[n-1].toString());
        System.out.println(a[0].toString());
    }
    
}

/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/
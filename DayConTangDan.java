/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Collections;
/**
 *
 * @author QUYNH
 */
public class DayConTangDan {
    public static int x[] =  new int[100];
    public static int arr[] = new int[100];
    public static int n;
    public static String res = "";
    public static ArrayList<String> ans = new ArrayList<>();
    public static void backtrack(int i){
        if(i >= n){
            return;
        }
        for(int j=i+1; j <= n; j++){
            if(arr[j] < arr[i]) continue;
            String tmp = res;
            res += arr[j] + " " ;
            if(res.split("\\s+").length > 1){
                ans.add(res);
            }
            backtrack(j);
            res = tmp;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = Integer.parseInt(sc.nextLine());
        arr[0] = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        backtrack(0);
        Collections.sort(ans);
        for(String i : ans){
            System.out.println(i);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XayConDaiNhat;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author QUYNH
 */
public class CapSoCoTongBangK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = sc.nextInt();
            HashMap<Integer, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(!mp.containsKey(arr[i])) mp.put(arr[i], 0);
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            long res = 0;
            for(int i = 0; i < n; i++){
                if(mp.get(k-arr[i]) != null){
                    res += mp.get(k-arr[i]);
                    if(k == arr[i]*2) res--;
                }
            }
            System.out.println(res/2);
        }
    }
    
}

/*
4
4 6
1 5 7 -1
5 6
1 5 7 -1 5
4 2
1 1 1 1
13 11
10 12 10 15 -1 7 6 5 4 2 1 1 1
*/
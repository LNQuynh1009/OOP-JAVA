/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TichMaTranVaChuyenViCuaNo;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class Matrix{
    public int[][] a;
    public int n, m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix trans(){
        Matrix res = new Matrix(this.m, this.n);
        for(int i = 0; i < res.n; i++){
            for(int j = 0; j < res.m; j++){
                res.a[i][j] = this.a[j][i];
            }
        }
        return res;
    }
    public Matrix mul(Matrix b){
        Matrix res = new Matrix(this.n, b.m);
        for(int i = 0; i < res.n; i++){
            for(int j = 0; j < res.m; j++){
                res.a[i][j] = 0;
                for(int k = 0; k < b.n; k++){
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                s += a[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}

public class TichMaTranVaChuyenViCuaNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
    
}

/*
1
2  2
1  2
3  4
*/
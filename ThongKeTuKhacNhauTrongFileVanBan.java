package test;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
/**
 *
 * @author QUYNH
 */

class Pair implements Comparable<Pair>{
    public String key;
    public int value;

    public Pair(String key, int value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public int compareTo(Pair o) {
        if(value == o.value){
            return key.compareTo(o.key);
        }
        return -Integer.valueOf(value).compareTo(Integer.valueOf(o.value));
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
    
}

public class LietKeTuKhacNhauTrongFileVanBan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Pair> arr = new ArrayList<>();
        for(int x = 0; x < n; x++){
            String[] s = (sc.nextLine().toLowerCase() + " ").split("\\W\\s*");
            for(String i : s){
                i = i.toLowerCase();
                if(!i.equals("")){
                    if(arr.isEmpty()){
                        arr.add(new Pair(i, 1));
                    }
                    else{
                        int ok = 0;
                        for(Pair j : arr){
                            if(j.key.equals(i)){
                                j.value++;
                                ok = 1;
                                break;
                            }
                        }
                        if(ok == 0){
                            arr.add(new Pair(i, 1));
                        }
                    }
                }
            }
        }
        Collections.sort(arr);
        for(Pair i : arr){
            System.out.println(i);
        }
    }
    
}

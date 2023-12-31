/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Set;
/**
 *
 * @author QUYNH
 */

class WordSet{
    private Set<String> set;

    public WordSet(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(String i : set){
            s += i + "\n";
        }
        return s;
    }
    
}

public class LietKeTuKhacNhau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    
}

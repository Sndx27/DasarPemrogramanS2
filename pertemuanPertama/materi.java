package pertemuanPertama;

import java.util.*;
import java.lang.Thread;

public class materi {
    public static void main(String[] args) {
        somethingToPrint(10);
    }

    public static void timer(int timerA){
        for (int i = 0; i < timerA; i++) {
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
            System.out.println("Something went wrong.");
            }
        }
    }

    public static String somethingToPrint(int cottonReap){
        Random random = new Random();
        for (int i = 0; i < cottonReap; i++) {
            timer(1);
            String[] catalog = {"Dead","Alive"};
            int luckyCatalog = random.nextInt(catalog.length);
            String whoIsLuckyCatalog = catalog[luckyCatalog];
            System.out.println(whoIsLuckyCatalog);
        }
        return "";
    }
}

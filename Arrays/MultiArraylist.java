package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initi
        for ( int i = 0 ; i< 3 ; i++){
            list.add(new ArrayList<>());

        }
        // i /p
        for (int i = 0 ; i< 3; i++){
            for ( int j = 0; j< 3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        // o / p
        System.out.println(list);
    }
}
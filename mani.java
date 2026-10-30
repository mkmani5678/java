1)

import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence;");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++){
            sb.deleteCharAt(i);
            i++;
        }
    
    System.out.println (sb);
    }
  }


2)

import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter a word:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        if(sb.length() >=2){
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt (0);
            System.out.println(sb);
        }else{
            System.out.println("Enter at least 3 Characters");
        }
    }
}


3)
import java.io.*;
public class main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int units = Integer.parseInt(br.readLine());
        double bill;
        if(units<0){
         System.out.println("Invalid units");
        return;
        }
        if(units <= 100){
            bill = units * 2;
        }else if (units <= 200){
            bill = (100 * 2) + (units - 100)*3;
        }else {
            bill = (100 * 2) +(100 * 3) + (units - 200)*5; 
        }
        System.out.println("Electricity Bill: Rs." + bill);
    }
}
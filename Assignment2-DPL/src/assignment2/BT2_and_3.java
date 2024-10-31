package assignment2;

import java.util.Scanner;

public class BT2_and_3 {
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        if (key.hasNext()) {
            String input = key.nextLine();
            System.out.println(input + " la mot chuoi");
        } else {
            System.out.println("Khong phai la chuoi");
        }
        
        System.out.println("Nhap vao mot so nguyen: ");
        if (key.hasNextInt()) {
            int num = key.nextInt();
            System.out.println(num + " la mot so nguyen");
        } else {
            System.out.println("Khong phai so nguyen");
        }
    }
}

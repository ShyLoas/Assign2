package assignment2;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BT {

    public static void main(String[] args) {
        try {
            Scanner key = new Scanner(System.in);
            
            System.out.println("Nhap ten: ");
            String name = key.nextLine();
            
            System.out.println("Nhap tuoi: ");
            int age = key.nextInt();
            key.nextLine();
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Nhap nam sinh: ");
            Date date = df.parse(key.nextLine());
            
            System.out.println("Nhap gioi tinh: ");
            String sex = key.next();
            key.nextLine();
            
            System.out.println("Nhap chuyen nganh: ");
            String major = key.nextLine();
            
            System.out.println("Nhap GPA: ");
            double GPA = key.nextDouble();
            key.nextLine();
            
            System.out.println("Nhap que quan: ");
            String country = key.nextLine();
            
            System.out.println("\nTen: " + name);
            System.out.println("Tuoi: " + age);
            System.out.println("Nam sinh: " + df.format(date));
            System.out.println("Gioi tinh: " + sex);
            System.out.println("Chuyen nganh: " + major);
            System.out.println("GPA: " + GPA);
            System.out.println("Que quan: " + country);
        } catch (ParseException ex) {
        }
    }
}

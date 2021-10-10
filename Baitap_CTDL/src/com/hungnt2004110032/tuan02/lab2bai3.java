package com.hungnt2004110032.tuan02;

import java.util.Scanner;

public class lab2bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số điện : "); 
        double soDien = scanner.nextDouble();
        if( soDien <= 50){  
           System.out.println(" thanh toán : " +(soDien * 1000));
        } else {
           System.out.println("số tiền phải trả : " + (50 * 1000 + (soDien - 50) * 1200));
        }
 
    }
}

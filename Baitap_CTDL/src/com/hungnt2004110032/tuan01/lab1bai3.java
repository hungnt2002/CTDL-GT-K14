package com.hungnt2004110032.tuan01;

import java.util.Scanner;

public class lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cạnh: ");
        double canh = scanner.nextDouble();
        double thetich = Math.pow(canh, 3);

        System.out.println("thể tích lập phương : " + thetich);
        
    }
}

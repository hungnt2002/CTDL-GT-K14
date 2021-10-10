package com.hungnt2004110032.tuan03;

import java.util.Scanner;

public class Lab3bai1 {
    public static void main(String[] args) {
        Scanner varInput = new Scanner(System.in);
        System.out.println("============Kiểm tra số nguyên tố============"); // KT snt
        System.out.println("Nhập vào số nguyên: ");
        int n = varInput.nextInt();
        boolean ok = true;
        for(int i = 2; i < n-1 ;i++){
            if(n % i == 0){
                ok = false;
                break;
            }
            i++; 
        }
        if(ok == true)
            System.out.printf("%d là số nguyên tố", n);
        else
            System.out.printf("%d không là số nguyên tố", n);
    }
}
package com.hungnt2004110032.tuan04;

import java.util.ArrayList;

import java.util.Scanner;

public class Lab4bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner varInput;
        varInput = new Scanner(System.in);
        while(true){
            Double x = varInput.nextDouble();
            list.add(x); 
            System.out.print(" Nhập thêm danh sách: ");
            if(varInput.nextLine().equals("N")){ 
                break; 
            }
            for( Double str : list){
                System.out.println(" " + str);
            }

        }
    }
}

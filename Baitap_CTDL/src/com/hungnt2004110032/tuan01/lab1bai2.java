package com.hungnt2004110032.tuan01;

import java.util.Scanner;

public class lab1bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();
        System.out.print("chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();
        double chuvi = (dai*rong)*2;
        double dientich = dai * rong;
        double canhnhonhat = Math.min(dai, rong);

        System.out.println("chu vi = " + chuvi + " diện tích = " + dientich + " cạnh nhỏ nhất = " + canhnhonhat);

    }
}

package com.hungnt2004110032.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int maID;
    int khoiluong;
    String color;
    
    Apple(){};
    
    Apple(int id, int k, String c){
        maID = id;
        khoiluong = k;
        color = c;
    }
    Scanner bienNhap = new Scanner(System.in);

    void nhapthongtin(){
        
        System.out.print("Nhập mã ID của táo: ");
        maID = bienNhap.nextInt();
        System.out.print("Nhập khối lượng: ");
        khoiluong = bienNhap.nextInt();
        System.out.print("Nhập màu: ");
        color = bienNhap.nextLine();
        bienNhap.nextLine();
    }

    void inthongtin(){

        System.out.println("=========In danh sách táo=========");
        System.out.println("mã ID: " + maID);
        System.out.println("khối lượng: " + khoiluong);
        System.out.println("màu : " + color);
    }
}

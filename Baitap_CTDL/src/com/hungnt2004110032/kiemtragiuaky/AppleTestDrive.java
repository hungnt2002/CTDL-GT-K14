package com.hungnt2004110032.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {
    static ArrayList<Apple> danhsachApple = new ArrayList<Apple>();
    static Scanner bienNhap = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    //tạo menu
    static void menu(){
        
        do{
            System.out.println("==============MENU=============");
            System.out.println("1> Nhập thêm táo vào kho ");
            System.out.println("2> Tìm táo theo màu ");
            System.out.println("3> In danh sách táo");
            System.out.println("4> Thoát");
            System.out.println("================================");
            
            int choice = bienNhap.nextInt();
            bienNhap.nextLine();
            switch(choice){
                case 1: 
                     nhap();
                     break;
                case 2: 
                     tim();
                     break;
                case 3:
                    xuat();
                    break;
                case 4: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("nhập không đúng mời bạn nhập lại: "); 
            }
        }while(true);
    }
   
   static void nhap(){
       while(true){
           Apple apple;
           apple = new Apple();

           apple.nhapthongtin();
           bienNhap.nextLine();
           danhsachApple.add(apple);

           System.out.println("Nhập thêm (y/n)? : ");
           if(bienNhap.nextLine().equals("n"))
           break;
       }
   }
   
   static void xuat(){
       for(Apple apple : danhsachApple){
           apple.inthongtin();
       }
   }
   
   static void tim(){
       System.out.print("nhập màu táo cần tìm: ");
       for(Apple apple : danhsachApple){
           if(bienNhap.nextLine().equals(apple.color)){
               apple.inthongtin();
           }
       }
   }
  
}


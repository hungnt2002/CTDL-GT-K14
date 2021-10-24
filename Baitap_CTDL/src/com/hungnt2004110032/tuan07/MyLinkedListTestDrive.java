package com.hungnt2004110032.tuan07;

import java.util.Scanner;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(6);
        myLinkedList.add(8);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(6);

        myLinkedList.print();
        myLinkedList.addHead(10);
        System.out.println("Sau khi thêm đầu");
        myLinkedList.print();

        System.out.print("Nhập phần tử muốn thêm vào phía trước : " );
        int x = Input.nextInt(); 

        System.out.print("Nhập phần tử muốn thêm : " );
        int newadd  = Input.nextInt();

        myLinkedList.findAddBefore(x, newadd);
        System.out.println("Danh sách sau khi thêm");
        myLinkedList.print();


        System.out.print("Nhập phần tử muốn  xóa  : " );
        int delete  = Input.nextInt();
        myLinkedList.remove(delete);
        System.out.println("Danh sách sau khi xóa");
        myLinkedList.print();

        System.out.println("Xóa đầu:");
        myLinkedList.removeHead();
        System.out.println("Danh sách sau khi xóa");
        myLinkedList.print();

        System.out.println("Xóa đuôi:");
        myLinkedList.removeTail();
        System.out.println("Danh sách sau khi xóa");
        myLinkedList.print();

        System.out.print("Nhập phần tử muốn sửa: ");
        int phanTu = Input.nextInt();
        System.out.print("Nhập nội dung sửa: ");
        int sua = Input.nextInt();
        myLinkedList.sua(phanTu, sua);
        System.out.println("Danh sách sau khi sửa phần tử ");
        myLinkedList.print();
    }
}

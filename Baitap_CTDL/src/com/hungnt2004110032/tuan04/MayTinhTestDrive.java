package com.hungnt2004110032.tuan04;

import java.util.Scanner;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh[] list = new MayTinh[7];
        Scanner varInput = new Scanner(System.in);
        System.out.println("Nhập thông tinh máy tính");
        for(int i = 0; i < list.length; i++){
            System.out.println("Nhập nhà sản xuất: ");
            String nhaSX = varInput.nextLine();
            System.out.println("Nhập năm sản xuất: ");
            int namSX = varInput.nextInt();
            varInput.nextLine();
            System.out.println("Nhập hệ điều hành: ");
            String heDieuHanh = varInput.nextLine();
            varInput.nextLine();
            System.out.println("Nhập CPU: ");
            String CPU = varInput.nextLine();
            varInput.nextLine();
            System.out.println("Nhập RAM: ");
            int ram = varInput.nextInt();
            varInput.nextLine();
            System.out.println("Nhập giá: ");
            float gia = varInput.nextFloat();
            varInput.nextLine();
            System.out.println("Nhập năm bảo hành: ");
            int namBaoHanh = varInput.nextInt();
            varInput.nextLine();
            list[i] = new MayTinh(nhaSX, heDieuHanh, CPU, ram, namSX , gia, namBaoHanh);
        }
        System.out.println("=======In thông tin máy tính========");
        for(MayTinh mayTinh : list){
            mayTinh.inThongTinMayTinh();
        }
    }
}

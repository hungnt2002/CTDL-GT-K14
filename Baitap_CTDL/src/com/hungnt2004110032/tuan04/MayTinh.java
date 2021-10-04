package com.hungnt2004110032.tuan04;

public class MayTinh {
    String nhaSX, heDieuHanh, CPU;
    int ram, namSX, namBaoHanh;
    float gia;
    MayTinh(String nsx, String hdh, String cpu, int r, int nam, float g, int nbh){
        nhaSX = nsx;
        heDieuHanh = hdh;
        CPU = cpu;
        ram = r;
        namSX = nam;
        gia = g;
        namBaoHanh = nbh;
    }
    void inThongTinMayTinh(){
        System.out.println("Nhà sản xuất: " + nhaSX);
        System.out.println("Năm sản xuất: " + namSX);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.printf("Ram: %d gb \n", ram );
        System.out.println("CPU: " + CPU);
        System.out.printf("Giá: %.0f đồng \n", gia);
        System.out.println("Năm bảo hành: " + namBaoHanh);
    }
}

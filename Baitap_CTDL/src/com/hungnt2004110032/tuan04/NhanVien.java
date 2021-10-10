package com.hungnt2004110032.tuan04;

public class NhanVien {
    String tenNhanVien;
    String luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;  

    NhanVien(){};

    NhanVien(String n, String l, String d, String b, String ns){
           tenNhanVien = n;
           luong = l;
           diaChi = d;
           boPhanLamViec = b;
           ngaySinh = ns;
    }
    void inThongTin(){
        System.out.println("tên nhân viên: " + tenNhanVien + "\n" + " lương: " + luong + " \n " + " địa chỉ: " + diaChi + " \n "+ " bộ phận làm việc: " + boPhanLamViec + " \n " + " ngày sinh: " + ngaySinh);
    }
}

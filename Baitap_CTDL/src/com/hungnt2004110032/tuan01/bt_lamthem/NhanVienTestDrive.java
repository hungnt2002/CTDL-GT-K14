package com.hungnt2004110032.tuan01.bt_lamthem;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        Nhanvien nhanvien;
        nhanvien = new Nhanvien();
        nhanvien.tenNhanVien = "Nguyễn Trường Hùng";
        nhanvien.ngaySinh = "23/6/2002";
        nhanvien.diaChi = "Thanh Hóa";
        nhanvien.boPhanLamViec = "developer";
        nhanvien.luong = " 9.000.000vnđ";
        
        nhanvien.inThongTin();
   }
}
 
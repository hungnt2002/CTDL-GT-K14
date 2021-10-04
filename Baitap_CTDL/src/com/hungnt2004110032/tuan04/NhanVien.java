package com.hungnt2004110032.tuan04;

public class NhanVien {
    String ten, diaChi, boPhan, ngaySinh;
    float luong;
    NhanVien(String t, String dc, String bp, String ns, float l){
        ten = t;
        diaChi = dc;
        boPhan = bp;
        ngaySinh = ns;
        luong = l;
    }
    void inThongTInNhanVien(){
        System.out.println("=======Thông tin nhân viên======: ");
        System.out.println("Tên nhân viên: " + ten);
        System.out.printf("Lương: %.0f 1 tháng \n", luong );
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Bộ phận làm việc: " + boPhan );
        System.out.println("Ngày sinh: " + ngaySinh);
    
    }
}

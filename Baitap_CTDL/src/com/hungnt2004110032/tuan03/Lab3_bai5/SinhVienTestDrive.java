package com.hungnt2004110032.tuan03.Lab3_bai5;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien[] danhSachSV = new SinhVien[4];
        danhSachSV[0] = new SinhVien(2004110001, "Nguyễn Văn A", 18, "Hà Nội");
        danhSachSV[1] = new SinhVien(2004110002, "Nguyễn Văn B", 19, "Thanh Hóa");
        danhSachSV[2] = new SinhVien(2004110003, "Nguyễn Văn C", 20, "Vũng Tàu");
        danhSachSV[3] = new SinhVien(2004110004, "Nguyễn Văn D", 21, "Đà Lạt");
        
        for(int i = 0; i < danhSachSV.length; i++)
            danhSachSV[i].inThongTinSV();
        
    }
}

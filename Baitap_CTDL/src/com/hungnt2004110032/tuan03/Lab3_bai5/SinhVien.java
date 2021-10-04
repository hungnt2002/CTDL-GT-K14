package com.hungnt2004110032.tuan03.Lab3_bai5;

public class SinhVien {
    String hoTen, queQuan;
    int mssv, tuoi;
    public SinhVien(int m, String n, int t, String q){
        mssv = m;
        hoTen = n;
        tuoi = t;
        queQuan = q;
    }
    void inThongTinSV(){
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê Quán: " + queQuan);
    }
}

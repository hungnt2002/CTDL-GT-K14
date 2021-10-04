package com.hungnt2004110032.tuan04;

public class TaiKhoan {
    String tenTaiKhoan;
    int soTaiKhoan, soDu;
    TaiKhoan(String t, int stk, int sd){
        tenTaiKhoan = t;
        soTaiKhoan = stk;
        soDu = sd;
    }
    void inThongTinTaiKhoan(){
        System.out.println("Tên tài khoản: " + tenTaiKhoan);
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.printf("Số dư: %d đồng", soDu);
    }
}

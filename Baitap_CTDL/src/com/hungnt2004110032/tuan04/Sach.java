package com.hungnt2004110032.tuan04;

public class Sach {
    int giaBan,
        namXuatBan,
        soLuong;
    String  nhaXuatBan,
            theLoai,
            tenSach;
    Sach(int g, int n, int sl, String nxb, String l, String t){
        giaBan = g;
        namXuatBan = n;
        soLuong = sl;
        nhaXuatBan = nxb;
        theLoai = l;
        tenSach = t;
    }
    void inThongTinSach(){
        System.out.println("======Thông tin sách======");
        System.out.printf("- Tên sách: " + tenSach);
        System.out.printf("- Giá bán: %d đồng\n" , giaBan);
        System.out.println("- Thể loại: " + theLoai);
        System.out.println("- Nhà xuất bản: " + nhaXuatBan);
        System.out.println("- Năm xuất bản: " + namXuatBan);
        System.out.println("- Số lượng: " + soLuong);
    }
    
}

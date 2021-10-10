package com.hungnt2004110032.tuan01.bt_lamthem;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        book.gia = "30000đ";
        book.nhaXuatBan = "Kim Đồng";
        book.giaBan = "30000đ";
        book.soLuong = 2;
        book.Loai = "truyện tranh";
        
        book.inThongTin();
    }
}

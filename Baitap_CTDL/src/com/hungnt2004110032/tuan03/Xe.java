package com.hungnt2004110032.tuan03;

public class Xe {
    String ten, hang, dong, giayPhep;
    int dungTich;
    Xe(String t, String h, String d, String gp, int dt){
        ten = t;
        hang = h;
        dong =d;
        giayPhep = gp;
        dungTich = dt;
    }
    void inThongTinXe(){
        System.out.println("Tên chủ xe: " + ten);
        System.out.println("Hãng sản xuất: " + hang);
        System.out.println("Dòng xe: " + dong);
        System.out.println("Giấy phép: " + giayPhep);
        System.out.printf("Dung tích xăng: %d lít", dungTich);
    }
}

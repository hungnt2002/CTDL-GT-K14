package com.hungnt2004110032.tuan01.bt_lamthem;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer();
        computer.nhaSanXuat = "ASUS";
        computer.heDieuHanh = "Windows 10";
        computer.namSanXuat = "2021";
        computer.CPU = "Core i5 9300H";
        computer.gia = "20.000.000đ";
        computer.namBaoHanh = "24 tháng";

        computer.inThongTin();
    }
}
 
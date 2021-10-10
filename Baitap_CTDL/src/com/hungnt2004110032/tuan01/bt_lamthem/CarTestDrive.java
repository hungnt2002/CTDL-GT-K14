package com.hungnt2004110032.tuan01.bt_lamthem;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        car.tenChuXe = "Nguyễn Trường Hùng";
        car.dong = "CUB50";
        car.hangSanXuat = "Honda";
        car.giayPhep = "loại a1";
        car.dungTichxang = "70 lít xăng";

        car.inThongtinCar();
    }
}

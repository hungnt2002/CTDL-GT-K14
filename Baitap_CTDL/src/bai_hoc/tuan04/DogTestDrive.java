package bai_hoc.tuan04;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] danhSachDog = new Dog[7];
        Dog dog0 = new Dog("La La", "Vàng", 12);
        Dog dog1 = new Dog("Lu Lu", "Trắng", 15);
        Dog dog2 = new Dog("Li Li", "Đen", 23);
        Dog dog3 = new Dog("Pika", "Vàng nâu", 11);
        Dog dog4 = new Dog("Momo", "Đen trắng", 19);
        Dog dog5 = new Dog("Tiki", "Vàng nhạt", 23);
        Dog dog6 = new Dog("Lazaha", "Nâu đỏ", 8);
        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;
        for(Dog dog : danhSachDog){
            dog.inThongTin();
        }
    }
}

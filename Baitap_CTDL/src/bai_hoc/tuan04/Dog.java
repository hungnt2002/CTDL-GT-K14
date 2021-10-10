package bai_hoc.tuan04;

public class Dog {
    public String name, color;
    public int size;
    public Dog(String n, String c, int s){
        name = n;
        color = c;
        size = s;
    }
    void inThongTin(){
        System.out.println("Name: " + name + ", Color: " + color + ", Size: " + size);
    }
}

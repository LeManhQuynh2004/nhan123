/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quynh2509_java;

import java.util.Scanner;

/**
 *
 * @author Le Manh Quynh
 */
public class Bike {

    private int id;//thuoc tinh chi cho phep truy cap trong pam vi class
    private String ten;//khai bao ten
    private String hsx;

    public Bike() {//contrustor khon co tham so chuyen vao
    }

    public Bike(int id, String ten, String hsx) {//co tham so chuyen vao
        //dac diem nhan dang la ten trung voi ten class
        // contructor dung de khoi tao gia tri cho thuoc tinh cua doi tuong moi duoc tao ra
        this.id = id;
        this.ten = ten;
        this.hsx = hsx;
        //this.id la thuoc tinh cua doi tuong
        //id la tham so truyen vao
        //this dung de thay the cho doi tuong hien tai
    }
// get and set duoc su dung khi ma lay su dung phuong thuc private
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHsx() {
        return hsx;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id bike:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten bike:");
        ten = scanner.nextLine();
        System.out.println("Nhap hsx:");
        hsx = scanner.nextLine();
    }
    void xuatTT() {
        System.out.format("\n%-15s%-15s%-15s",
                "ID",
                "Ten",
                "hsx");
        System.out.format("\n%-15d%-15s%-15s",
                this.id,
                this.ten,
                this.hsx);
    }
}

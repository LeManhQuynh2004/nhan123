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
public class ungdung extends Bike {

    private int congDung;//phuong thuc pri cho phep truy cap trong pham vi cua class

    public ungdung() {
    }

    public ungdung(int congDung) {
        this.congDung = congDung;
    }
    //co ten trung voi ten class
    //khi 1 doi tuong moi tao ra thi dung contrator

    public ungdung(int congDung, int id, String ten, String hsx) {
        super(id, ten, hsx);
        this.congDung = congDung;
    }

    public int getCongDung() {
        return congDung;
    }

    public void setCongDung(int congDung) {
        this.congDung = congDung;
    }

    void nhapTT() {
        super.nhapTT();//goi xin ham nhap tu father
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cong dung");
        this.congDung = scanner.nextInt();
        while (congDung != 1 || congDung != 2) {
            System.out.println("Nhap lai cong dung");
            this.congDung = scanner.nextInt();
        }
    }

    void xuatTT() {
        super.xuatTT();
        System.out.format("\n%-15s",
                "ung dung");
        System.out.format("\n%-15s",
                this.cd());
    }
    String cd() {
        if (congDung == 1) {
            return "Dung de tap the duc";
        } else {
            return "dung de di hoc";
        }
    }
}

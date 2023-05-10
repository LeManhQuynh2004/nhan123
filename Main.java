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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        QuanLy ql = new QuanLy();
        while (true) {
            System.out.println("\n+-----------Menu-------------+");
            System.out.println("1.Nhap danh sach");
            System.out.println("2.Xuat thong tin");
            System.out.println("3.Sua thong tin");
            System.out.println("4.Sap xep id");
            System.out.println("+----------------------------+");
            System.out.println("Moi ban lua chon:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    ql.nhapTT();
                    break;
                case 2:
                    ql.xuatTT();
                    break;
                case 3:
                    String hang = "honda";
                    ql.sua(hang);
                    break;
                case 4:
                    ql.sapxep();
                    break;
                case 5:
                    ql.keThua();
                    break;
                case 6:
                    ql.tim();
                    break;
                default:
                    System.out.println("chon tu 1 den 6?Moi ban chon lai");
            }
            if (luaChon == 0) {
                break;
            }
        }
    }
}

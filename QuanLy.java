/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quynh2509_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Le Manh Quynh
 */
public class QuanLy {

    ArrayList<Bike> list = new ArrayList();//tao moi moi arraylist ten la list cua bike

    void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Bike b = new Bike();//khoi tao mot doi tuong b moi
            b.nhapTT();
            list.add(b);//them b vao list bike
            System.out.println("Ban co muon nhap tiep khong(y/n)");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    void xuatTT() {
        int check = 0;//danh dau
        for (Bike x : list) {
            x.xuatTT();
            check = 1;
        }
        if (check == 0) {
            System.out.println("Khong co doi tuong duoc khoi tao");
        }
    }

    void sua(String hang) {
        int check = 0;
        for (Bike x : list) {
            if (x.getHsx().equalsIgnoreCase("Yamaha")) {
                x.setHsx(hang);
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Khong co doi tuong can sua");
        } else {
            System.out.println("Danh sach sau khi sua la :");
            this.xuatTT();
        }
    }

    void sapxep() {
        Comparator<Bike> com1 = new Comparator<Bike>() {///khoi tao tieu chi
            @Override
            public int compare(Bike o1, Bike o2) {
                if (o1.getId() > o2.getId()) {
                    return -1;
                } else if (o1.getId() == o2.getId()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(list, com1);//ham so sanh sánh
        //so sanh tieu tri com1 va danh sach
        System.out.println("Danh sach sau khi sap xep la");
        this.xuatTT();
    }
    void keThua(){
        ungdung u = new ungdung(12, 23,"quynh","vn");
        u.xuatTT();
    }
    void tim(){
        int check = 0;//danh dau
        for (Bike x : list) {
            if(x.getTen().substring(0,5).equalsIgnoreCase("honda")){
                list.remove(x);
                check = 1;
            }
        }
//        for (int i = 0; i <list.size();) {
//            String ten1 = list.get(i).getTen();
//            if(ten1.substring(0, 5).equalsIgnoreCase("honda")){//so sanh tuong doi
//                list.remove(i);
//                check = 1;
//            }else{
//                i++;
//            }
//        }
        if(check == 0){
            System.out.println("Khong tim thay trong danh sach");
        }else{
            System.out.println("Danh sach sau khi xoa la:");
            this.xuatTT();
        }
    }
    void min(){
        int viTri = 0;
        int min = list.get(0).getId();//dat min bàng vi tri dau tien
        int max = list.get(0).getId();
        for (Bike x : list) {
            if(x.getId()<min){//dieu khien
                min = x.getId();
                viTri = min;
            }
            if(x.getId()>max){
                max = x.getId();
                viTri = max;
            }
        }
        System.out.println("Doi tuong co id nho nhat la:"+min+"vitri:"+viTri);
        System.out.println("Doi tuong co id lon nhat la:"+max+"vitri:"+viTri);
    }
    void viTri(){
        int viTri = 0;
        int min = list.get(0).getId();
        for (Bike x : list) {
            if(x.getId()<min){
                min = x.getId();
            }
            if(viTri == min){
                viTri = min;
            }
        }
         System.out.println("Doi tuong co id nho nhat la:"+min+"|Vitri :"+viTri);
    }
    void viTri2(){
        int viTri = 0;
        int min = list.get(0).getId();
        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).getId()<min){
                min = list.get(i).getId();
            }
            if(viTri == min){
                viTri = i;
            }
        }
        System.out.println("Doi tuong co id nho nhat la:"+min+"|Vitri :"+viTri);
    }
    void xuatNhoNhat(){
        int count=0;
        int min = list.get(0).getId();
        for (Bike x : list) {
            if(x.getId()<min){
                min = x.getId();
            }
            if(min == x.getId()){
                count++;
            }
        }
        System.out.println("Dem cac doi tuong nho nhat la:"+count);
    }
}

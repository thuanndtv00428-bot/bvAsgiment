/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bv.asgiment;
import java.util.Scanner;
/**
 *
 * @author Windows
 */
public class SanPham {
protected String maSP;
    protected String tenSP;
    protected double donGia;
    protected int soLuong;

    public SanPham() {}

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void nhap(Scanner sc) {
        while (true) {
            System.out.print("Nhập mã SP : ");
            maSP = sc.nextLine();
            if (maSP.matches("SP\\d{3}")) 
              break;
            System.out.println("Mã phải dạng SPXXX");
        }

        System.out.print("Nhập tên SP: ");
        tenSP = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
    System.out.println("Mã: " + maSP +
                "  Tên: " + tenSP +
                "  Đơn giá: " + donGia +
                "  SL: " + soLuong +
                "  Thành tiền: " + tinhThanhTien());
        
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public void capNhat(Scanner sc) {
        System.out.print("Nhập tên mới: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá mới: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng mới: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public String getMaSP() 
    { return maSP; }
    public String getTenSP() 
    { return tenSP; }
    
    
}

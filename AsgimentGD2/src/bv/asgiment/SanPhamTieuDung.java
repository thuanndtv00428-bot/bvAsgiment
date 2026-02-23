/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bv.asgiment;

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class SanPhamTieuDung extends SanPham {
    private double giamGia;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhập giảm giá (%): ");
        giamGia = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia * (1 - giamGia / 100);
    }

    @Override
    public void xuat() {
        System.out.println("Mã: " + maSP +
                " | Tên: " + tenSP +
                " | Đơn giá: " + donGia +
                " | SL: " + soLuong +
                " | Giảm giá: " + giamGia + "%" +
                " | Thành tiền: " + tinhThanhTien());
    }
}
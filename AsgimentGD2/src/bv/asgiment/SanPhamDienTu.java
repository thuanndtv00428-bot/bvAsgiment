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

public class SanPhamDienTu extends SanPham {
    private String baoHanh;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhập thời gian bảo hành: ");
        baoHanh = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Bảo hành: " + baoHanh);
    }
}
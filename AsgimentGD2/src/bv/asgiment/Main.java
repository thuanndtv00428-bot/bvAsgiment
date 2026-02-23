/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bv.asgiment;

/**
 *
 * @author Windows
 */
import java.util.*;

public class Main {

    static ArrayList<SanPham> ds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int chon;

        do {
            menu();
            while (!sc.hasNextInt()) {
                System.out.println("Vui lòng nhập số!");
                sc.next();
            }
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themSanPham();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    capNhat();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    sapXep();
                    break;
                case 0:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

            if (chon != 0) {
                System.out.println("\nNhấn Enter để quay lại menu...");
                sc.nextLine();
            }

        } while (chon != 0);
    }

    static void menu() {
        System.out.println("\nMENU");
        System.out.println("1. Nhập sản phẩm");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tìm kiếm theo mã");
        System.out.println("4. Cập nhật sản phẩm");
        System.out.println("5. Xóa sản phẩm");
        System.out.println("6. Sắp xếp theo tên");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    static boolean maTonTai(String ma) {
        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) return true;
        }
        return false;
    }

    static void themSanPham() {
        System.out.println("1. SP Điện tử");
        System.out.println("2. SP Tiêu dùng");
        System.out.print("Chọn loại: ");
        int loai = Integer.parseInt(sc.nextLine());

        SanPham sp = (loai == 1) ? new SanPhamDienTu() : new SanPhamTieuDung();
        sp.nhap(sc);

        if (maTonTai(sp.getMaSP())) {
            System.out.println(" Mã sản phẩm đã tồn tại!");
            return;
        }

        ds.add(sp);
        System.out.println(" Đã Thêm thành công!");
    }

    static void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (SanPham sp : ds) {
            sp.xuat();
            System.out.println("---------------------");
        }
    }

    static void timKiem() {
        System.out.print("Nhập mã cần tìm: ");
        String ma = sc.nextLine();

        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                sp.xuat();
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    static void capNhat() {
        System.out.print("Nhập mã cần cập nhật: ");
        String ma = sc.nextLine();

        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                sp.capNhat(sc);
                System.out.println(" Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    static void xoa() {
    System.out.print("Nhập mã cần xóa: ");
    String ma = sc.nextLine();

    for (int i = 0; i < ds.size(); i++) {
        if (ds.get(i).getMaSP().equalsIgnoreCase(ma)) {
            ds.remove(i);
            System.out.println(" Đã xóa!");
            return;
        }
    }

    System.out.println("Không tìm thấy!");
}

    

    static void sapXep() {
        ds.sort(Comparator.comparing(SanPham::getTenSP));
        System.out.println(" Đã sắp xếp theo tên!");
    }
}

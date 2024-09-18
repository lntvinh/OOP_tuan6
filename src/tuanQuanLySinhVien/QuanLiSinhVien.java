package tuanQuanLySinhVien;

import java.util.Scanner;

public class QuanLiSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // T?o 3 ??i t??ng sinh vi�n
        SinhVien sv1 = new SinhVien(1, "Nguyen Van A", 8.5f, 7.0f);
        SinhVien sv2 = new SinhVien(2, "Le Thi B", 9.0f, 8.5f);
        SinhVien sv3 = new SinhVien();

        // Nh?p th�ng tin cho sv3 t? b�n ph�m
        System.out.print("Nh?p m� sinh vi�n: ");
        int maSV = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Nh?p h? t�n: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nh?p ?i?m l� thuy?t: ");
        float diemLT = scanner.nextFloat();

        System.out.print("Nh?p ?i?m th?c h�nh: ");
        float diemTH = scanner.nextFloat();

        sv3.setMaSV(maSV);
        sv3.setHoTen(hoTen);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        // In b?ng danh s�ch sinh vi�n
        System.out.println("Danh s�ch sinh vi�n:");
        System.out.println("MSSV\tH? t�n\t?i?m LT\t?i?m TH\t?i?m TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        scanner.close();
    }
}
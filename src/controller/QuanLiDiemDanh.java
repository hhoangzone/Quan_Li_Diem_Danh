package controller;

import model.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiDiemDanh {
    private List<SinhVien> sinhViens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themSinhVien(){

        System.out.print("Nhập mã sinh viên: ");
        String maSV = scanner.nextLine();

        System.out.print("Nhập tên sinh viên: ");
        String tenSinhVien = scanner.nextLine();

        System.out.print("Nhập số tiết nghỉ: ");
        int soTietNghi = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới

        System.out.print("Nhập tình trạng: ");
        String tinhTrang = scanner.nextLine();

        SinhVien sinhVien = new SinhVien(maSV, tenSinhVien, soTietNghi, tinhTrang);
        sinhViens.add(sinhVien);

        System.out.println("Sinh viên " + tenSinhVien + " đã được thêm.");
    }
    public SinhVien timSinhVien(String maSv){
        for (SinhVien sinhVien : sinhViens) {
            if(sinhVien.getMaSV().equals(maSv)){
                return sinhVien;
            }
        }
        return null;
    }
    public void suaSinhVien(){
        System.out.println("Nhập mã sinh viên bạn muốn sửa");
        String maSV = scanner.nextLine();
        SinhVien sinhVien = timSinhVien(maSV);
        if(sinhVien != null){
            System.out.println("Nhập tên mới");
            String tenSinhVien = scanner.nextLine();
            System.out.println("Nhập số tiết nghỉ: ");
            int soTietNghi = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tình trạng");
            String tinhTrang = scanner.nextLine();
            sinhVien.setTenSinhVien(tenSinhVien);
            sinhVien.setSoTietNghi(soTietNghi);
            sinhVien.setTinhTrang(tinhTrang);
        } else {
            System.out.println("Không tồn tại sinh viên có mã sinh viên là: " +maSV);
        }

    }

    public void hienThiDanhSachSinhVien(){
        for (SinhVien sinhVien : sinhViens) {
            System.out.println("------------------------");
            System.out.println("Tên Sinh viên: " + sinhVien.getTenSinhVien());
            System.out.println("Số tiết nghỉ: " + sinhVien.getSoTietNghi());
            System.out.println("Tình Trạng: " + sinhVien.getTinhTrang());
            System.out.println("------------------------");

        }
    }
}

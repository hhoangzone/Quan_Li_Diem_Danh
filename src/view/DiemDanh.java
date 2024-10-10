package view;

import controller.QuanLiDiemDanh;

import java.util.Scanner;

public class DiemDanh {
    Scanner sc = new Scanner(System.in);
    QuanLiDiemDanh q = new QuanLiDiemDanh();
    public void menu() {
        String choice;
        while (true) {
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa tên sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Nhập tên sinh viên muốn điểm danh");
            System.out.println("6. Kiểm tra số lượng sinh viên bị cấm thi");
            System.out.println("7. Thống kê");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    q.themSinhVien();
                    break;
                case "2":
                    q.suaSinhVien();
                    break;
                case "3":

                    break;
                case "4":
                    q.hienThiDanhSachSinhVien();
                    break;
                case "5":
                    break;
                case "6":
                    break;
                default:
                    break;

            }
        }
    }
}

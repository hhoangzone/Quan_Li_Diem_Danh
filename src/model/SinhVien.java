package model;

public class SinhVien {
    private String maSV;
    private String tenSinhVien;
    private int soTietNghi;
    private String tinhTrang;

    public SinhVien(String maSV, String tenSinhVien, int
            soTietNghi, String tinhTrang) {
        this.maSV = maSV;
        this.tenSinhVien = tenSinhVien;
        this.soTietNghi =  soTietNghi;
        this.tinhTrang = tinhTrang;
    }



    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}

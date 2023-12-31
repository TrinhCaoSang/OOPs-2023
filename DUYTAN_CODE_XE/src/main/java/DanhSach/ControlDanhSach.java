package DanhSach;
import Goods.PhanTu;
import java.util.Scanner;


public interface ControlDanhSach {
    public static Scanner sc = new Scanner(System.in);
    public void nhapDanhSach();
    public void xuatDanhSach();
    public void themVaoDanhSach(PhanTu pt);
    public void themKPhanTuVaoDanhSach();
    public void chinhSuaThongTinPhanTu();
    public void xoaPhanTu();
    public PhanTu timPhanTu();
    public int timViTriPhanTu();
    public PhanTu layPhanTuVoi(String thamSo);
    public void thongKe();
}

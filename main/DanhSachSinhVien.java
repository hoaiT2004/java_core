package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

//1.Thêm sinh viên vào danh sách
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

	// 2.in danh sách sinh viên
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

	// 3.Kiểm tra xem danh sách có rỗng hay k
	public boolean kiemTraDanhSach() {
		return this.danhSach.isEmpty();
	}

//4.Lấy ra số lượng sinh viên trong danh sách =>> dùng size()
	// lấy ra số lượng nên dùng kiểu trả về interger
	public int layRaSoLuongSinhVien() {
		return this.danhSach.size();
	}

	// 5.Làm rỗng danh sách sinh viên =>> removeAll()
	public void lamRongDanhSachSinhVien() {
		this.danhSach.removeAll(danhSach);
	}

	// 6.kiểm tra thông tin sinh viên có tồn tại trong danh sách hay k bằng mã sinh
	// viên
	public boolean kiemTraSuTonTaiCuaSinhVienBangMaSinhVien(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

	// 7.Xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

	// 8.Tìm kếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
	public void timKiemSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getName().indexOf(ten) >= 0) {
				System.out.println(ten);

			} else {
				System.out.println("isImage");
			}
		}
	}

//9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void xuatRaDanhSachTuCaoXuongThap() {
		// HAY
		// NÈ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				// TODO Auto-generated method stub
				if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return 1;

				} else if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}

			}
		});
	}

}

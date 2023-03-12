package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	DanhSachSinhVien dssv = new DanhSachSinhVien();
	int luaChon = 1;
	do {
		System.out.println("Vui lòng chọn chức năng:");
	System.out.println(
			"1.Thêm sinh viên vào danh sách"
			+"2.In danh sách sinh viên ra màn hình"
			+"3.kiểm tra danh sách có rỗng hãy không"
			+"4.Lấy ra số lượng sinh viên trong danh sách"
			+"5.Làm rỗng danh sách sinh viên"
			+"6.kiểm tra sinh viên có tồn tại trong danh sách hay không,dựa trên mã sinh viên"
			+"7.Xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên"
			+"8.Tìm kếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím"
			+"9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp"
			+"0.thoát chương trình"
		);
	System.out.println();
	luaChon = sc.nextInt();
	sc.nextLine();
	switch(luaChon) {
	case 1:
	
		System.out.println("Nhập mã sinh viên:");	String maSinhVien = sc.nextLine();
		System.out.println("Nhập tên sinh viên:");	String tenSinhVien = sc.nextLine();
		System.out.println("Nhập năm sinh:");	int namSinh = sc.nextInt();
		System.out.println("Nhập điểm trung bình:");	double diemTrungBinh = sc.nextDouble();
		SinhVien sv = new SinhVien(tenSinhVien, maSinhVien, namSinh, diemTrungBinh);
		dssv.themSinhVien(sv);
		break;
	
	case 2:
		dssv.inDanhSachSinhVien();
		break;
	
	case 3:
		System.out.println("Danh sách rỗng:"+dssv.kiemTraDanhSach());
		break;
	case 4:
		System.out.println(dssv.layRaSoLuongSinhVien());
		break;
	case 5:
		dssv.lamRongDanhSachSinhVien();
		break;
	case 6:
		System.out.println("Nhập mã svien:"); String maSinhVien1 = sc.nextLine();
		SinhVien sv1 = new SinhVien(maSinhVien1);
System.out.println("Kiểm tra sinh viên có trong danh sách:"+dssv.kiemTraSuTonTaiCuaSinhVienBangMaSinhVien(sv1));
		break;
	case 7:
		System.out.println("Nhập mã svien:"); String maSinhVien2 = sc.nextLine();
		SinhVien sv2 = new SinhVien(maSinhVien2);
System.out.println("Xóa 1 sinh viên ra khỏi danh sách:"+dssv.xoaSinhVien(sv2));
		break;
	case 8:
		System.out.println("Nhập tên sinh viên:");	String tenSinhVien3 = sc.nextLine();

		
	dssv.timKiemSinhVien("Kết quả tìm kiếm:"+tenSinhVien3);
		break;
	case 9:
	
		dssv.xuatRaDanhSachTuCaoXuongThap();
		dssv.inDanhSachSinhVien();
		break;
	case 0:
		System.out.println("kết thúc!!!");
		break;
	}

	
	}while(luaChon != 0);
	
}
}

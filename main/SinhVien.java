package main;

import java.util.Objects;
public class SinhVien implements Comparable<SinhVien>{
	

	private String name;
	private String maSinhVien;
	private int namSinh;
	private double diemTrungBinh;
	public SinhVien(String name, String maSinhVien, int namSinh, double diemTrungBinh) {
		
		this.name = name;
		this.maSinhVien = maSinhVien;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public SinhVien(String maSinhVien) {
		
		this.maSinhVien = maSinhVien;
	}


	public SinhVien(double diemTrungBinh) {
		super();
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "SinhVien [name=" + name + ", maSinhVien=" + maSinhVien + ", namSinh=" + namSinh + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.getMaSinhVien());
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, maSinhVien, namSinh, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return  Objects.equals(maSinhVien, other.maSinhVien) ;
				

		

	}
}

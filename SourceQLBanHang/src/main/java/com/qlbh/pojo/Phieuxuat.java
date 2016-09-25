package com.qlbh.pojo;
// Generated 24/09/2016 4:28:02 PM by Hibernate Tools 5.2.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Phieuxuat generated by hbm2java
 */
@Entity
@Table(name = "phieuxuat", catalog = "qlbh")
public class Phieuxuat implements java.io.Serializable {

	private Integer id;
	private Khachhang khachhang;
	private Khohang khohang;
	private Nhanvien nhanvien;
	private String ma;
	private String diachi;
	private Date ngaygiao;
	private Date ngaylap;
	private Double tongtien;
	private Boolean activite;
	private Set<Chitietphieuxuat> chitietphieuxuats = new HashSet<Chitietphieuxuat>(0);

	public Phieuxuat() {
	}

	public Phieuxuat(Khachhang khachhang, Khohang khohang, Nhanvien nhanvien, String ma, String diachi, Date ngaygiao,
			Date ngaylap, Double tongtien, Boolean activite, Set<Chitietphieuxuat> chitietphieuxuats) {
		this.khachhang = khachhang;
		this.khohang = khohang;
		this.nhanvien = nhanvien;
		this.ma = ma;
		this.diachi = diachi;
		this.ngaygiao = ngaygiao;
		this.ngaylap = ngaylap;
		this.tongtien = tongtien;
		this.activite = activite;
		this.chitietphieuxuats = chitietphieuxuats;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "khachhangid")
	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "khoid")
	public Khohang getKhohang() {
		return this.khohang;
	}

	public void setKhohang(Khohang khohang) {
		this.khohang = khohang;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nhanvienbanhangid")
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Column(name = "ma", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Column(name = "diachi")
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ngaygiao", length = 0)
	public Date getNgaygiao() {
		return this.ngaygiao;
	}

	public void setNgaygiao(Date ngaygiao) {
		this.ngaygiao = ngaygiao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ngaylap", length = 0)
	public Date getNgaylap() {
		return this.ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}

	@Column(name = "tongtien", precision = 22, scale = 0)
	public Double getTongtien() {
		return this.tongtien;
	}

	public void setTongtien(Double tongtien) {
		this.tongtien = tongtien;
	}

	@Column(name = "activite")
	public Boolean getActivite() {
		return this.activite;
	}

	public void setActivite(Boolean activite) {
		this.activite = activite;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phieuxuat")
	public Set<Chitietphieuxuat> getChitietphieuxuats() {
		return this.chitietphieuxuats;
	}

	public void setChitietphieuxuats(Set<Chitietphieuxuat> chitietphieuxuats) {
		this.chitietphieuxuats = chitietphieuxuats;
	}

}

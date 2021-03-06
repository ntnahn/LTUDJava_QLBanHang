package com.qlbh.pojo;
// Generated 26/10/2016 3:07:02 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bophan generated by hbm2java
 */
@Entity
@Table(name = "bophan", catalog = "qlbh")
public class Bophan implements java.io.Serializable {

	private Integer id;
	private String ma;
	private String ten;
	private String ghichu;
	private Boolean activity;
	private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);

	public Bophan() {
	}

	public Bophan(String ma, String ten, String ghichu, Boolean activity, Set<Nhanvien> nhanviens) {
		this.ma = ma;
		this.ten = ten;
		this.ghichu = ghichu;
		this.activity = activity;
		this.nhanviens = nhanviens;
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

	@Column(name = "ma", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Column(name = "ten")
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "ghichu")
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@Column(name = "activity")
	public Boolean getActivity() {
		return this.activity;
	}

	public void setActivity(Boolean activity) {
		this.activity = activity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bophan")
	public Set<Nhanvien> getNhanviens() {
		return this.nhanviens;
	}

	public void setNhanviens(Set<Nhanvien> nhanviens) {
		this.nhanviens = nhanviens;
	}

	@Override
	public String toString() {
		return this.getTen();
	}
}

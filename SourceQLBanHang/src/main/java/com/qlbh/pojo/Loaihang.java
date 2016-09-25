package com.qlbh.pojo;
// Generated 24/09/2016 4:28:02 PM by Hibernate Tools 5.2.0.Beta1

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
 * Loaihang generated by hbm2java
 */
@Entity
@Table(name = "loaihang", catalog = "qlbh")
public class Loaihang implements java.io.Serializable {

	private Integer id;
	private String ma;
	private String ten;
	private Boolean activite;
	private Set<Hanghoa> hanghoas = new HashSet<Hanghoa>(0);

	public Loaihang() {
	}

	public Loaihang(String ma, String ten, Boolean activite, Set<Hanghoa> hanghoas) {
		this.ma = ma;
		this.ten = ten;
		this.activite = activite;
		this.hanghoas = hanghoas;
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

	@Column(name = "activite")
	public Boolean getActivite() {
		return this.activite;
	}

	public void setActivite(Boolean activite) {
		this.activite = activite;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loaihang")
	public Set<Hanghoa> getHanghoas() {
		return this.hanghoas;
	}

	public void setHanghoas(Set<Hanghoa> hanghoas) {
		this.hanghoas = hanghoas;
	}

}

package com.qlbh.pojo;
// Generated 21/09/2016 7:11:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bophan generated by hbm2java
 */
@Entity
@Table(name="bophan"
    ,catalog="qlbh"
)
public class Bophan  implements java.io.Serializable {


     private int ma;
     private String ten;
     private String ghichu;
     private Byte activite;
     private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);

    public Bophan() {
    }

	
    public Bophan(int ma) {
        this.ma = ma;
    }
    public Bophan(int ma, String ten, String ghichu, Byte activite, Set<Nhanvien> nhanviens) {
       this.ma = ma;
       this.ten = ten;
       this.ghichu = ghichu;
       this.activite = activite;
       this.nhanviens = nhanviens;
    }
   
     @Id 

    
    @Column(name="ma", unique=true, nullable=false)
    public int getMa() {
        return this.ma;
    }
    
    public void setMa(int ma) {
        this.ma = ma;
    }

    
    @Column(name="ten")
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    
    @Column(name="ghichu")
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    @Column(name="activite")
    public Byte getActivite() {
        return this.activite;
    }
    
    public void setActivite(Byte activite) {
        this.activite = activite;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bophan")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }




}


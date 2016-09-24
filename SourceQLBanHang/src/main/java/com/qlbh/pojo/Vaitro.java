package com.qlbh.pojo;
// Generated 24/09/2016 3:20:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vaitro generated by hbm2java
 */
public class Vaitro  implements java.io.Serializable {


     private Integer id;
     private Vaitro vaitro;
     private String ma;
     private String ten;
     private String diengiai;
     private Boolean truycap;
     private Boolean them;
     private Boolean xem;
     private Boolean xoa;
     private Boolean sua;
     private Boolean in;
     private Boolean nhap;
     private Boolean xuat;
     private Boolean activite;
     private Set vaitros = new HashSet(0);
     private Set nguoidungs = new HashSet(0);

    public Vaitro() {
    }

    public Vaitro(Vaitro vaitro, String ma, String ten, String diengiai, Boolean truycap, Boolean them, Boolean xem, Boolean xoa, Boolean sua, Boolean in, Boolean nhap, Boolean xuat, Boolean activite, Set vaitros, Set nguoidungs) {
       this.vaitro = vaitro;
       this.ma = ma;
       this.ten = ten;
       this.diengiai = diengiai;
       this.truycap = truycap;
       this.them = them;
       this.xem = xem;
       this.xoa = xoa;
       this.sua = sua;
       this.in = in;
       this.nhap = nhap;
       this.xuat = xuat;
       this.activite = activite;
       this.vaitros = vaitros;
       this.nguoidungs = nguoidungs;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Vaitro getVaitro() {
        return this.vaitro;
    }
    
    public void setVaitro(Vaitro vaitro) {
        this.vaitro = vaitro;
    }
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiengiai() {
        return this.diengiai;
    }
    
    public void setDiengiai(String diengiai) {
        this.diengiai = diengiai;
    }
    public Boolean getTruycap() {
        return this.truycap;
    }
    
    public void setTruycap(Boolean truycap) {
        this.truycap = truycap;
    }
    public Boolean getThem() {
        return this.them;
    }
    
    public void setThem(Boolean them) {
        this.them = them;
    }
    public Boolean getXem() {
        return this.xem;
    }
    
    public void setXem(Boolean xem) {
        this.xem = xem;
    }
    public Boolean getXoa() {
        return this.xoa;
    }
    
    public void setXoa(Boolean xoa) {
        this.xoa = xoa;
    }
    public Boolean getSua() {
        return this.sua;
    }
    
    public void setSua(Boolean sua) {
        this.sua = sua;
    }
    public Boolean getIn() {
        return this.in;
    }
    
    public void setIn(Boolean in) {
        this.in = in;
    }
    public Boolean getNhap() {
        return this.nhap;
    }
    
    public void setNhap(Boolean nhap) {
        this.nhap = nhap;
    }
    public Boolean getXuat() {
        return this.xuat;
    }
    
    public void setXuat(Boolean xuat) {
        this.xuat = xuat;
    }
    public Boolean getActivite() {
        return this.activite;
    }
    
    public void setActivite(Boolean activite) {
        this.activite = activite;
    }
    public Set getVaitros() {
        return this.vaitros;
    }
    
    public void setVaitros(Set vaitros) {
        this.vaitros = vaitros;
    }
    public Set getNguoidungs() {
        return this.nguoidungs;
    }
    
    public void setNguoidungs(Set nguoidungs) {
        this.nguoidungs = nguoidungs;
    }




}



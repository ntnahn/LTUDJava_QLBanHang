package com.qlbh.pojo;
// Generated 23/09/2016 10:02:27 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Congty generated by hbm2java
 */
@Entity
@Table(name="congty"
    ,catalog="qlbh"
)
public class Congty  implements java.io.Serializable {


     private Integer id;
     private String ma;
     private String ten;
     private String diachi;
     private String masothue;
     private String tel;
     private String fax;
     private String email;
     private String website;
     private String logo;
     private Boolean activite;

    public Congty() {
    }

	
    public Congty(String ma) {
        this.ma = ma;
    }
    public Congty(String ma, String ten, String diachi, String masothue, String tel, String fax, String email, String website, String logo, Boolean activite) {
       this.ma = ma;
       this.ten = ten;
       this.diachi = diachi;
       this.masothue = masothue;
       this.tel = tel;
       this.fax = fax;
       this.email = email;
       this.website = website;
       this.logo = logo;
       this.activite = activite;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="ma", nullable=false, length=20)
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    
    @Column(name="ten")
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    
    @Column(name="diachi")
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
    @Column(name="masothue")
    public String getMasothue() {
        return this.masothue;
    }
    
    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    
    @Column(name="tel")
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    
    @Column(name="fax")
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="website")
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }

    
    @Column(name="logo", length=65535)
    public String getLogo() {
        return this.logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }

    
    @Column(name="activite")
    public Boolean getActivite() {
        return this.activite;
    }
    
    public void setActivite(Boolean activite) {
        this.activite = activite;
    }




}



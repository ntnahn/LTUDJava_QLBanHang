package com.qlbh.pojo;
// Generated 23/09/2016 10:02:27 PM by Hibernate Tools 4.3.1


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
 * Nhomhanghoa generated by hbm2java
 */
@Entity
@Table(name="nhomhanghoa"
    ,catalog="qlbh"
)
public class Nhomhanghoa  implements java.io.Serializable {


     private Integer id;
     private String ma;
     private String ten;
     private String ghichu;
     private Boolean activite;
     private Set<Hanghoa> hanghoas = new HashSet<Hanghoa>(0);

    public Nhomhanghoa() {
    }

    public Nhomhanghoa(String ma, String ten, String ghichu, Boolean activite, Set<Hanghoa> hanghoas) {
       this.ma = ma;
       this.ten = ten;
       this.ghichu = ghichu;
       this.activite = activite;
       this.hanghoas = hanghoas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="ma", length=20)
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

    
    @Column(name="ghichu")
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
    @Column(name="activite")
    public Boolean getActivite() {
        return this.activite;
    }
    
    public void setActivite(Boolean activite) {
        this.activite = activite;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhomhanghoa")
    public Set<Hanghoa> getHanghoas() {
        return this.hanghoas;
    }
    
    public void setHanghoas(Set<Hanghoa> hanghoas) {
        this.hanghoas = hanghoas;
    }




}



package com.firzap.school.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "extracurriculars")
public class Extracurricular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "extracurricular_name", nullable = false)
    private String extracurricularName;
    @Column(name = "extracurricular_desc")
    private String extracurricularDesc;

    public Extracurricular() {
    }

    public Extracurricular(String extracurricularName, String extracurricularDesc) {
        this.extracurricularName = extracurricularName;
        this.extracurricularDesc = extracurricularDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExtracurricularName() {
        return extracurricularName;
    }

    public void setExtracurricularName(String extracurricularName) {
        this.extracurricularName = extracurricularName;
    }

    public String getExtracurricularDesc() {
        return extracurricularDesc;
    }

    public void setExtracurricularDesc(String extracurricularDesc) {
        this.extracurricularDesc = extracurricularDesc;
    }
}

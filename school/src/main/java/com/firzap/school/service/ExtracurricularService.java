package com.firzap.school.service;

import com.firzap.school.entity.Extracurricular;

import java.util.List;

public interface ExtracurricularService {
    List<Extracurricular> getAllExtracurriculars();
    Extracurricular saveExtracurricular(Extracurricular ext);
    Extracurricular getExtracurricularById(Long id);
    Extracurricular updateExtracurricular(Extracurricular ext);
    void deleteExtracurricularById(Long id);
}

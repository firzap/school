package com.firzap.school.service.impl;

import com.firzap.school.entity.Extracurricular;
import com.firzap.school.repository.ExtracurricularRepository;
import com.firzap.school.service.ExtracurricularService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtracurricularServiceImpl implements ExtracurricularService {

    private ExtracurricularRepository extracurricularRepository;

    public ExtracurricularServiceImpl(ExtracurricularRepository extracurricularRepository) {
        this.extracurricularRepository = extracurricularRepository;
    }

    @Override
    public List<Extracurricular> getAllExtracurriculars() {
        return extracurricularRepository.findAll();
    }

    @Override
    public Extracurricular saveExtracurricular(Extracurricular extracurricular) {
        return extracurricularRepository.save(extracurricular);
    }

    @Override
    public Extracurricular getExtracurricularById(Long id) {
        return extracurricularRepository.findById(id).get();
    }

    @Override
    public Extracurricular updateExtracurricular(Extracurricular extracurricular) {
        return extracurricularRepository.save(extracurricular);
    }

    @Override
    public void deleteExtracurricularById(Long id) {
        extracurricularRepository.deleteById(id);
    }
}

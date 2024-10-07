package com.firzap.school.controller;

import com.firzap.school.entity.Extracurricular;
import com.firzap.school.service.ExtracurricularService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExtracurricularController {

    private ExtracurricularService extracurricularService;

    public ExtracurricularController(ExtracurricularService extracurricularService) {
        this.extracurricularService = extracurricularService;
    }

    @GetMapping("/extracurriculars")
    public String listExtracurriculars(Model model){
        model.addAttribute("extracurriculars", extracurricularService.getAllExtracurriculars());
        return "extracurriculars";
    }

    @GetMapping("/extracurriculars/new")
    public String createExtracurricular(Model model){
        Extracurricular extracurricular = new Extracurricular();
        model.addAttribute("extracurricular", extracurricular);
        return "create_extracurricular";
    }

    @PostMapping("/extracurriculars")
    public String saveExtracurricular(@ModelAttribute("extracurricular") Extracurricular extracurricular){
        extracurricularService.saveExtracurricular(extracurricular);
        return "redirect:/extracurriculars";
    }

    @GetMapping("/extracurriculars/edit/{id}")
    public String editExtracurricular(@PathVariable Long id, Model model){
        model.addAttribute("extracurricular", extracurricularService.getExtracurricularById(id));
        return "edit_extracurricular";
    }

    @PostMapping("/extracurriculars/{id}")
    public String updateExtracurricular(@PathVariable Long id, @ModelAttribute("extracurricular") Extracurricular extracurricular, Model model){
        Extracurricular existingExt = extracurricularService.getExtracurricularById(id);
        existingExt.setId(id);
        existingExt.setExtracurricularName(extracurricular.getExtracurricularName());
        existingExt.setExtracurricularDesc(extracurricular.getExtracurricularDesc());

        extracurricularService.updateExtracurricular(existingExt);
        return "redirect:/extracurriculars";
    }

    @GetMapping("/extracurriculars/{id}")
    public String deleteExtracurricular(@PathVariable Long id){
        extracurricularService.deleteExtracurricularById(id);
        return "redirect:/extracurriculars";
    }
}

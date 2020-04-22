package org.launchcode.InspectorWorkflow.controllers;

import org.launchcode.InspectorWorkflow.models.Inspector;
import org.launchcode.InspectorWorkflow.models.data.InspectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("inspector")
public class InspectorController {

    @Autowired
    private InspectorRepository inspectorRepository;

    @GetMapping
    public String displayLogInScreen(Model model) {

        model.addAttribute("title", "Login to access Inspector Database");
        model.addAttribute("userName");
        model.addAttribute("password");

        return "inspector/index";
    }

    @PostMapping
    public String processValidateCreds (@ModelAttribute @Valid Inspector newInspector, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "inspector";
        }

        return "property/index";
    }

//    @PostMapping("add")
//    public String processAddInspector (@ModelAttribute @Valid Inspector newInspector, Errors errors, Model model){
//
//        if (errors.hasErrors()) {
//            return "inspector/index";
//        }
//
//        inspectorRepository.save(newInspector);
//        return "property/index";
//    }

}

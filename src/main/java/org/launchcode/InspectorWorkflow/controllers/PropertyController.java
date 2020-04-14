package org.launchcode.InspectorWorkflow.controllers;

import org.launchcode.InspectorWorkflow.models.Property;
import org.launchcode.InspectorWorkflow.models.Inspector;
import org.launchcode.InspectorWorkflow.models.data.InspectorRepository;
import org.launchcode.InspectorWorkflow.models.data.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("property")
public class PropertyController {

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private InspectorRepository inspectorRepository;

    @GetMapping("index")
    public String index(Model model) {

        return "property/index";
    }

    @GetMapping("list")
    public String displayPropertyMenu(Model model) {

//        Add SEARCH feature or LIST ALL - currently LIST ALL is default
        model.addAttribute("title", "All Properties");
        model.addAttribute("properties", propertyRepository.findAll());

        return "property/list";
    }

    @PostMapping("list")
    public String displaySelectedProperty(Model model, @RequestParam int theId) {
//      Get property based on selection
        model.addAttribute("title", "Selected Property");
//        model.addAttribute(s:"propertyselected", propertyRepository.findById(theId))

        return "property/list";
    }

    @GetMapping("add")
    public String displayAddPropertyForm(Model model) {
        model.addAttribute(new Property());
        return "property/add";
    }

    @GetMapping("search")
    public String displaySearchPropertyForm(Model model) {

        return "property/search";
    }

    @GetMapping("edit")
    public String displayEditPropertyForm(Model model) {

        return "property/edit";
    }

    @GetMapping("remove")
    public String displayRemovePropertyForm(Model model) {

        return "property/remove";
    }

    @PostMapping("index")
    public String homeFromAdd() {

        return "property/index";
    }

    @PostMapping("add")
    public String processAddPropertyForm(@ModelAttribute @Valid Property newProperty, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "property/add";
        }

        propertyRepository.save(newProperty);
        return "property/index";
    }

//    @PostMapping("add")
//    public String homeFromAdd() {
//
//        return "property/index";
//    }


    @GetMapping("view")
//    public String displayViewProperty(Model model, @PathVariable int employerId) {
    public String displayViewProperty(Model model) {
//        Optional optEmployer = propertyRepository.findById(propertyId);
//        if (optEmployer.isPresent()) {
//            Employer employer = (Employer) optEmployer.get();
//            model.addAttribute("employer", employer);
//            return "employers/view";
//        } else {
            model.addAttribute("property", propertyRepository.findAll());
            return "redirect:../";
        }
}
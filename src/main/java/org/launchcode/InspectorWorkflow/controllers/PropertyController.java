package org.launchcode.InspectorWorkflow.controllers;

import org.launchcode.InspectorWorkflow.models.Property;
import org.launchcode.InspectorWorkflow.models.PropertyData;
import org.launchcode.InspectorWorkflow.models.Inspector;
import org.launchcode.InspectorWorkflow.models.data.InspectorRepository;
import org.launchcode.InspectorWorkflow.models.data.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;

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

        model.addAttribute("title", "All Properties");
        model.addAttribute("properties", propertyRepository.findAll());

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

    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchTerm) {

        ArrayList<Property> properties;
        properties = PropertyData.findPropertyByAddress(searchTerm, propertyRepository.findAll());
        model.addAttribute("properties", properties);

        return "property/results";
    }

        @GetMapping("edit")
        public String displayEditPropertyForm (Model model){

            return "property/edit";
        }

        @GetMapping("remove")
        public String displayRemovePropertyForm (Model model){

            return "property/remove";
        }

        @PostMapping("index")
        public String homeFromAdd () {

            return "property/index";
        }

        @PostMapping("add")
        public String processAddPropertyForm (@ModelAttribute @Valid Property newProperty, Errors errors, Model model){

            if (errors.hasErrors()) {
                return "property/add";
            }

            newProperty.setInspectionDate(LocalDate.now());
            propertyRepository.save(newProperty);
            return "property/index";
        }

        @RequestMapping(path="view/{propId}", method=RequestMethod.GET)
        public String displayViewProperty(Model model, @PathVariable("propId") int propId) {

            ArrayList<Property> properties;

            properties = PropertyData.findPropertyDataByPropertyID(propId, propertyRepository.findAll());

            Property singleProperty = properties.get(0);

            model.addAttribute("singleProperty", singleProperty);

            return "property/displayinspection";
        }
    }
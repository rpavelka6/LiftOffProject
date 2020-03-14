package org.launchcode.InspectorWorkflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inspector")
public class InspectorController {

        @GetMapping
        public String index(Model model) {

            model.addAttribute("title", "Login to access Inspector Database");
            model.addAttribute("userName");
            model.addAttribute("password");

            return "inspector/index";
        }
}

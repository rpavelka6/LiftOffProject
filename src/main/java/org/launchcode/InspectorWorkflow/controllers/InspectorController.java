package org.launchcode.InspectorWorkflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InspectorController {

        @RequestMapping("")
        public String index() {

            return "index";
        }
}

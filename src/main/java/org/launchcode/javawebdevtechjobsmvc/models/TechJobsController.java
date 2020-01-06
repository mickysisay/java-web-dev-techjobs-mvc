package org.launchcode.javawebdevtechjobsmvc.models;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {
    public static HashMap<String,String> actionChoices = new HashMap<>();
    public static HashMap<String,String> columnChoices = new HashMap<>();
    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("coreCompetency", "Skill");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("all", "All");
    }
    @ModelAttribute("actions")
    public HashMap<String,String> getActionChoices(){
        return actionChoices;
    }
    @ModelAttribute("columns")
    public HashMap<String,String> getColumnChoices(){
        return columnChoices;
    }
}

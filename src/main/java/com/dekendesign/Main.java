package com.dekendesign;
import com.dekendesign.model.*;
import com.dekendesign.util.*;
import spark.ModelAndView;

import spark.template.handlebars.HandlebarsTemplateEngine;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {

        port(8080);
        staticFiles.location("/static");
        Teams teams = new Teams();
        get("/", (rq, rs) -> {
            Map<String, ArrayList> model = new HashMap<>();
            ArrayList selectedTeamList = teams.getSelectedTeamList();
            ArrayList availableTeamList = teams.getAvailableTeamList();
            model.put("selectedTeams", selectedTeamList);
            model.put("availableTeams", availableTeamList);
            /*if(rq.cookie("message") != "" && rq.cookie("message") != null ) {
                String text = rq.cookie("message").replace('-',' ');
                model.put("message", rq.cookie("message"));
            }*/
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/teams", "application/json", (request, response) -> {
            ArrayList output = teams.getTeamList();
            return output;
        }, new JsonTransformer());

        post("/team", (rq, rs) -> {
            Map<String, String> model = new HashMap<>();
            model.put("manager", rq.queryParams("manager"));
            model.put("team", rq.queryParams("team"));
           boolean isAvailable = teams.updateSelectedTeamList(rq.queryParams("team"), rq.queryParams("manager"));
           if(isAvailable) {
               rs.removeCookie("message");
               rs.redirect("/");
               return null;
           }else {
               rs.cookie("message","That-team-has-been-already-selected");
               rs.redirect("/");
               return null;
           }
        }, new JsonTransformer());

        //Call for REST API
        get("/selected", "application/json", (request, response) -> {
            ArrayList output = teams.getSelectedTeamList();
            return output;
        }, new JsonTransformer());

        get("/available", "application/json", (request, response) -> {
            ArrayList output =  teams.getAvailableTeamList();
            return output;
        }, new JsonTransformer());

        get("/commissioner", (rq, rs) -> new ModelAndView(null, "index.hbs"), new HandlebarsTemplateEngine());

    }
}

/*
1. Start with a list of unselected teams
eg CIN: Cincinnati Bengals

2. allow manager to pick a team

3. add that team to the list of selected teams and remove from unselected with the id of the manager that picked it

4. Display updated lists of selected and unselected teams
Draft [
{team: CIN, selected: true, manager: rory}
]

5. Allow the commissioner to edit the draft

 */




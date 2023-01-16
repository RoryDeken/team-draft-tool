package com.dekendesign;
import com.dekendesign.model.DraftDAO;
import com.dekendesign.model.DraftUpdateTool;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        DraftDAO dao = new DraftUpdateTool();

        port(8080);
        staticFiles.location("/static");
        get("/", (rq, rs) -> {
            Map<String, String> model = new HashMap<>();
            model.put("team", rq.cookie("team"));
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        post("/", (rq, rs) -> {
            Map<String, String> model = new HashMap<>();
            String team = rq.queryParams("team");
            rs.cookie("team", team);
            model.put("team", team);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/commissioner", (rq, rs) -> new ModelAndView(null, "commissioner.hbs"), new HandlebarsTemplateEngine());
    }
}
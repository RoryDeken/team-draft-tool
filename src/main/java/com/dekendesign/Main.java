package com.dekendesign;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080);
        staticFiles.location("/static");
        get("/", (rq, rs) -> {
           return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
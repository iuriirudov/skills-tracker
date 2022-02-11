package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String indexPage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String formPage() {
        return "<style>label {display: block;}input {display: block}select {display: block}button {display: block}</style>" +
                "<form method='POST'>" +
                "<label for='name'>Name:</label>" +
                "<input name='user' type='text' id='name'>" +
                "<label for='favorite'>My favorite language</label>" +
                "<select name='first' id='favorite'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label for='secondFavorite'>My second favorite language</label>" +
                "<select name='second' id='secondFavorite'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label for='thirdFavorite'>My favorite language</label>" +
                "<select name='third' id='thirdFavorite'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<button>Submit</button>";
    }

    @PostMapping("form")
    public String formResult(@RequestParam String user, String first, String second, String third) {
        return "<h1>" + user + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>";
    }
}

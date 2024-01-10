package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String pageloadintro() {
        return "<html>" +
                "<body>" +
                "<h2>Skills Tracker</h2>" +
                "<h4>We have a few skills we would like to learn. Here is the list!</h4>"+
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>NOT JAVA</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form>" +
                "Name:" +
                "<input type='text' name='name'>" +
                "\n" +
                "My Favorite Language:" +
                "<select name='languages' id='languages'>" +
                    "<option value='javascript'>JavaScript</option>"+
                    "<option value='python'>Python</option>" +
                    "<option value='notjava'>Not Java</option>" +
                "My Second Favorite Language: " +
                "<select name='languages' id='languages'>" +
                    "<option value='javascript'>JavaScript</option>"+
                    "<option value='python'>Python</option>" +
                    "<option value='notjava'>Not Java</option>" +
                "My Least Favorite Language: " +
                "<select name='languages' id='languages'>" +
                    "<option value='javascript'>JavaScript</option>"+
                    "<option value='python'>Python</option>" +
                    "<option value='notjava'>Not Java</option>" +
                "\r\n" +
                "<input type='submit' value='submit'" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}

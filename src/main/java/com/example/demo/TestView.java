package com.example.demo;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

    public String getTest() {
        return "lorem ipsum sdfklj";
    }

}
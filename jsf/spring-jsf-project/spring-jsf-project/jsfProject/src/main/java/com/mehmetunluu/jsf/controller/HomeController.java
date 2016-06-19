package com.mehmetunluu.jsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by Neval Bayram on 18.06.2016.
 */
@ManagedBean(name = "homeController")
@ViewScoped
public class HomeController {

    private String name = "mehmet";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

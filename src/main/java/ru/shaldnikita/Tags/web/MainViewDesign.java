package ru.shaldnikita.Tags.web;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.CssLayout;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class MainViewDesign extends HorizontalLayout {
    protected Label projectNameLabel;
    protected Label activeViewName;
    protected Button menuButton;
    protected CssLayout menu;
    protected Button profileButton;
    protected Button settingsButton;
    protected Button mapButton;
    protected Button logout;
    protected VerticalLayout content;

    public MainViewDesign() {
        Design.read(this);
    }
}

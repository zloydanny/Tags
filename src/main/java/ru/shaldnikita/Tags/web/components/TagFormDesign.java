package ru.shaldnikita.Tags.web.components;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;
import com.vaadin.ui.declarative.Design;

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
public class TagFormDesign extends VerticalLayout {
    protected TextArea descr;
    protected ComboBox<String> categorySelect;
    protected ComboBox<VaadinIcons> markerSelect;
    protected VerticalLayout buttonsLayout;
    protected Button cancel;
    protected Button accept;

    public TagFormDesign() {
        Design.read(this);
    }

    public Button getCancel() {
        return cancel;
    }

    public Button getAccept() {
        return accept;
    }

    public ComboBox<String> getCategorySelect() {
        return categorySelect;
    }

    public ComboBox<VaadinIcons> getMarkerSelect() {
        return markerSelect;
    }

    public TextArea getDescr() {
        return descr;
    }
}

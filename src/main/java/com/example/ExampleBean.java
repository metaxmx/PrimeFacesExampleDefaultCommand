package com.example;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("example")
@ApplicationScoped
public class ExampleBean {

    public void actionOne() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Action One",  "Action One Called") );
    }

    public void actionTwo() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Action Two",  "Action Two Called") );
    }

    public void actionThree() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Action Three",  "Action Three Called") );
    }

}

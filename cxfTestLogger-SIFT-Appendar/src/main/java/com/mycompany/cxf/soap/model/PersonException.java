package com.mycompany.cxf.soap.model;

import javax.xml.ws.WebFault;

@WebFault(name="PersonException")
public class PersonException extends RuntimeException {
    private String personid;
    public PersonException(String message, String personId){
        super(message);
        this.personid = personId;
    }

    public String getPersonid(){
        return this.personid;
    }


}

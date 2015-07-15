/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist UiSkin
 */
public enum UiSkinEnum {

    // Theme1
    THEME1("Theme1"),
    // Theme2
    THEME2("Theme2"),
    // PortalDefault
    PORTALDEFAULT("PortalDefault"),
    // Webstore
    WEBSTORE("Webstore"),
    // Theme3
    THEME3("Theme3");

    final String value;

    private UiSkinEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UiSkinEnum fromValue(String value) {
        for (UiSkinEnum e : UiSkinEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
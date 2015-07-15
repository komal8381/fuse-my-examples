/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 08 20:26:47 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
public enum TypeEnum {

    // Existing Customer - Upgrade
    EXISTING_CUSTOMER___UPGRADE("Existing Customer - Upgrade"),
    // Existing Customer - Replacement
    EXISTING_CUSTOMER___REPLACEMENT("Existing Customer - Replacement"),
    // Existing Customer - Downgrade
    EXISTING_CUSTOMER___DOWNGRADE("Existing Customer - Downgrade"),
    // New Customer
    NEW_CUSTOMER("New Customer");

    final String value;

    private TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum e : TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
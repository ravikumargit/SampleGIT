
package com.equinix.gse.serviceclientv6.sim6.usermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Locale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Locale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EN_US"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="JA"/>
 *     &lt;enumeration value="EN_GB"/>
 *     &lt;enumeration value="ZH_CN"/>
 *     &lt;enumeration value="PT_BR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Locale", namespace = "http://www.equinix.com/gse/service/schema/common/v2")
@XmlEnum
public enum Locale {

    EN_US,
    DE,
    NL,
    FR,
    JA,
    EN_GB,
    ZH_CN,
    PT_BR;

    public String value() {
        return name();
    }

    public static Locale fromValue(String v) {
        return valueOf(v);
    }

}

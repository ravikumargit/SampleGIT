//comment 17July2017
package com.equinix.gse.serviceclientv6.sim6.usermanagement;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogonUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProfileDetails" type="{http://www.equinix.com/gse/service/schema/sim/entity/v6}User"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "logonUserName",
    "profileDetails"
})
@XmlRootElement(name = "ModifyUserProfileByAdminRequest", namespace = "http://www.equinix.com/gse/service/schema/sim/message/v6")
public class ModifyUserProfileByAdminRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Context", namespace = "http://www.equinix.com/gse/service/schema/sim/message/v6", required = true)
    protected String context;
    @XmlElement(name = "LogonUserName", namespace = "http://www.equinix.com/gse/service/schema/sim/message/v6", required = true)
    protected String logonUserName;
    @XmlElement(name = "ProfileDetails", namespace = "http://www.equinix.com/gse/service/schema/sim/message/v6", required = true)
    protected User profileDetails;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the logonUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogonUserName() {
        return logonUserName;
    }

    /**
     * Sets the value of the logonUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogonUserName(String value) {
        this.logonUserName = value;
    }

    /**
     * Gets the value of the profileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getProfileDetails() {
        return profileDetails;
    }

    /**
     * Sets the value of the profileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setProfileDetails(User value) {
        this.profileDetails = value;
    }

}

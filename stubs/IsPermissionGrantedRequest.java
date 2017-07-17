//comment 17July2017
package com.equinix.gse.serviceclientv6.sim6.usermanagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="LogonUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserKey" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         &lt;element name="PermissionCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "logonUserName",
    "context",
    "userKey",
    "permissionCode"
})
@XmlRootElement(name = "IsPermissionGrantedRequest", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6")
public class IsPermissionGrantedRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LogonUserName", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6", required = true)
    protected String logonUserName;
    @XmlElement(name = "Context", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6", required = true)
    protected String context;
    @XmlElement(name = "UserKey", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6", type = Long.class)
    protected List<Long> userKey;
    @XmlElement(name = "PermissionCode", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6", required = true)
    protected List<String> permissionCode;

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
     * Gets the value of the userKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUserKey() {
        if (userKey == null) {
            userKey = new ArrayList<Long>();
        }
        return this.userKey;
    }

    /**
     * Gets the value of the permissionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPermissionCode() {
        if (permissionCode == null) {
            permissionCode = new ArrayList<String>();
        }
        return this.permissionCode;
    }

}

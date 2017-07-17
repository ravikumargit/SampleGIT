
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
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogonUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestCustOrgId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SrcCustOrgId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
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
    "destCustOrgId",
    "srcCustOrgId"
})
@XmlRootElement(name = "MergeCustOrganizationsRequest", namespace = "http://www.equinix.com/gse/service/schema/sim/cust-organization/message/v6")
public class MergeCustOrganizationsRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Context", namespace = "http://www.equinix.com/gse/service/schema/sim/cust-organization/message/v6", required = true)
    protected String context;
    @XmlElement(name = "LogonUserName", namespace = "http://www.equinix.com/gse/service/schema/sim/cust-organization/message/v6", required = true)
    protected String logonUserName;
    @XmlElement(name = "DestCustOrgId", namespace = "http://www.equinix.com/gse/service/schema/sim/cust-organization/message/v6")
    protected long destCustOrgId;
    @XmlElement(name = "SrcCustOrgId", namespace = "http://www.equinix.com/gse/service/schema/sim/cust-organization/message/v6", type = Long.class)
    protected List<Long> srcCustOrgId;

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
     * Gets the value of the destCustOrgId property.
     * 
     */
    public long getDestCustOrgId() {
        return destCustOrgId;
    }

    /**
     * Sets the value of the destCustOrgId property.
     * 
     */
    public void setDestCustOrgId(long value) {
        this.destCustOrgId = value;
    }

    /**
     * Gets the value of the srcCustOrgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcCustOrgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcCustOrgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSrcCustOrgId() {
        if (srcCustOrgId == null) {
            srcCustOrgId = new ArrayList<Long>();
        }
        return this.srcCustOrgId;
    }

}

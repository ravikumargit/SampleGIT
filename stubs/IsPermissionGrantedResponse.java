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
 *         &lt;element name="UserPermissionStatus" type="{http://www.equinix.com/gse/service/schema/sim/permission/entity/v6}UserPermissionStatus" maxOccurs="unbounded"/>
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
    "userPermissionStatus"
})
@XmlRootElement(name = "IsPermissionGrantedResponse", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6")
public class IsPermissionGrantedResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UserPermissionStatus", namespace = "http://www.equinix.com/gse/service/schema/sim/permission/message/v6", required = true)
    protected List<UserPermissionStatus> userPermissionStatus;

    /**
     * Gets the value of the userPermissionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPermissionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPermissionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPermissionStatus }
     * 
     * 
     */
    public List<UserPermissionStatus> getUserPermissionStatus() {
        if (userPermissionStatus == null) {
            userPermissionStatus = new ArrayList<UserPermissionStatus>();
        }
        return this.userPermissionStatus;
    }

}

//comment 17July2017
package com.equinix.gse.serviceclientv6.sim6.usermanagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Asset" type="{http://www.equinix.com/gse/service/schema/tibsim/entity/v4}ECPAsset" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAsset", namespace = "http://www.equinix.com/gse/service/schema/tibsim/entity/v4", propOrder = {
    "asset"
})
public class ListOfAsset
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Asset", required = true)
    protected List<ECPAsset> asset;

    /**
     * Gets the value of the asset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECPAsset }
     * 
     * 
     */
    public List<ECPAsset> getAsset() {
        if (asset == null) {
            asset = new ArrayList<ECPAsset>();
        }
        return this.asset;
    }

}

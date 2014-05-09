
package com.mulesoft.samples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderCompleteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderCompleteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAcknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderCompleteResponse", propOrder = {
    "workOrderID",
    "isAcknowledged"
})
public class WorkOrderCompleteResponse {

    @XmlElement(name = "WorkOrderID")
    protected String workOrderID;
    protected boolean isAcknowledged;

    /**
     * Gets the value of the workOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderID() {
        return workOrderID;
    }

    /**
     * Sets the value of the workOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderID(String value) {
        this.workOrderID = value;
    }

    /**
     * Gets the value of the isAcknowledged property.
     * This getter has been renamed from isIsAcknowledged() to getIsAcknowledged() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getIsAcknowledged() {
        return isAcknowledged;
    }

    /**
     * Sets the value of the isAcknowledged property.
     * 
     */
    public void setIsAcknowledged(boolean value) {
        this.isAcknowledged = value;
    }

}

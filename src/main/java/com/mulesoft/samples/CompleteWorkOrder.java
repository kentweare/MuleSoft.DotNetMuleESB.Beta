
package com.mulesoft.samples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="wo" type="{http://tempuri.org/}WorkOrderCompleteRequest" minOccurs="0"/>
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
    "wo"
})
@XmlRootElement(name = "CompleteWorkOrder")
public class CompleteWorkOrder {

    protected WorkOrderCompleteRequest wo;

    /**
     * Gets the value of the wo property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderCompleteRequest }
     *     
     */
    public WorkOrderCompleteRequest getWo() {
        return wo;
    }

    /**
     * Sets the value of the wo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderCompleteRequest }
     *     
     */
    public void setWo(WorkOrderCompleteRequest value) {
        this.wo = value;
    }

}

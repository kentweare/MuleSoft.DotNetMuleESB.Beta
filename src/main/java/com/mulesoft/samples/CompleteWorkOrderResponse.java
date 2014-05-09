
package com.mulesoft.samples;

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
 *         &lt;element name="CompleteWorkOrderResult" type="{http://tempuri.org/}WorkOrderCompleteResponse" minOccurs="0"/>
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
    "completeWorkOrderResult"
})
@XmlRootElement(name = "CompleteWorkOrderResponse")
public class CompleteWorkOrderResponse {

    @XmlElement(name = "CompleteWorkOrderResult")
    protected WorkOrderCompleteResponse completeWorkOrderResult;

    /**
     * Gets the value of the completeWorkOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderCompleteResponse }
     *     
     */
    public WorkOrderCompleteResponse getCompleteWorkOrderResult() {
        return completeWorkOrderResult;
    }

    /**
     * Sets the value of the completeWorkOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderCompleteResponse }
     *     
     */
    public void setCompleteWorkOrderResult(WorkOrderCompleteResponse value) {
        this.completeWorkOrderResult = value;
    }

}

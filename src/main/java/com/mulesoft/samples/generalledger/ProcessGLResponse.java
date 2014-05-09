
package com.mulesoft.samples.generalledger;

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
 *         &lt;element name="ProcessGLResult" type="{http://tempuri.org/}TimeSheetForGLResponse" minOccurs="0"/>
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
    "processGLResult"
})
@XmlRootElement(name = "ProcessGLResponse")
public class ProcessGLResponse {

    @XmlElement(name = "ProcessGLResult")
    protected TimeSheetForGLResponse processGLResult;

    /**
     * Gets the value of the processGLResult property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSheetForGLResponse }
     *     
     */
    public TimeSheetForGLResponse getProcessGLResult() {
        return processGLResult;
    }

    /**
     * Sets the value of the processGLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSheetForGLResponse }
     *     
     */
    public void setProcessGLResult(TimeSheetForGLResponse value) {
        this.processGLResult = value;
    }

}

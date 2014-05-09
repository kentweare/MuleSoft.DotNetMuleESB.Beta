
package com.mulesoft.samples;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.samples package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.samples
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompleteWorkOrderResponse }
     * 
     */
    public CompleteWorkOrderResponse createCompleteWorkOrderResponse() {
        return new CompleteWorkOrderResponse();
    }

    /**
     * Create an instance of {@link WorkOrderCompleteResponse }
     * 
     */
    public WorkOrderCompleteResponse createWorkOrderCompleteResponse() {
        return new WorkOrderCompleteResponse();
    }

    /**
     * Create an instance of {@link CompleteWorkOrder }
     * 
     */
    public CompleteWorkOrder createCompleteWorkOrder() {
        return new CompleteWorkOrder();
    }

    /**
     * Create an instance of {@link WorkOrderCompleteRequest }
     * 
     */
    public WorkOrderCompleteRequest createWorkOrderCompleteRequest() {
        return new WorkOrderCompleteRequest();
    }

}

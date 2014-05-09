
package com.mulesoft.samples.generalledger;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.samples.generalledger package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.samples.generalledger
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessGLResponse }
     * 
     */
    public ProcessGLResponse createProcessGLResponse() {
        return new ProcessGLResponse();
    }

    /**
     * Create an instance of {@link TimeSheetForGLResponse }
     * 
     */
    public TimeSheetForGLResponse createTimeSheetForGLResponse() {
        return new TimeSheetForGLResponse();
    }

    /**
     * Create an instance of {@link ProcessGL }
     * 
     */
    public ProcessGL createProcessGL() {
        return new ProcessGL();
    }

    /**
     * Create an instance of {@link TimeSheetForGL }
     * 
     */
    public TimeSheetForGL createTimeSheetForGL() {
        return new TimeSheetForGL();
    }

}

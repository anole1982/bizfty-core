
package com.icss.regie.api.models.contact;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.icss.regie.basic.bean package. 
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


    public ObjectFactory() {
    }

    public Contact createContact() {
        return new Contact();
    }

    public Email createEmail() {
        return new Email();
    }
    
    public Phone createPhone() {
        return new Phone();
    }

}

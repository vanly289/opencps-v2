//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.12 at 02:12:11 PM ICT 
//


package org.opencps.api.user.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opencps.api.user.model package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opencps.api.user.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserSitesModel }
     * 
     */
    public UserSitesModel createUserSitesModel() {
        return new UserSitesModel();
    }

    /**
     * Create an instance of {@link UserRolesModel }
     * 
     */
    public UserRolesModel createUserRolesModel() {
        return new UserRolesModel();
    }

    /**
     * Create an instance of {@link UserSitesResults }
     * 
     */
    public UserSitesResults createUserSitesResults() {
        return new UserSitesResults();
    }

    /**
     * Create an instance of {@link UserRolesResults }
     * 
     */
    public UserRolesResults createUserRolesResults() {
        return new UserRolesResults();
    }

    /**
     * Create an instance of {@link UserProfileModel }
     * 
     */
    public UserProfileModel createUserProfileModel() {
        return new UserProfileModel();
    }

    /**
     * Create an instance of {@link UserProfileResults }
     * 
     */
    public UserProfileResults createUserProfileResults() {
        return new UserProfileResults();
    }

}
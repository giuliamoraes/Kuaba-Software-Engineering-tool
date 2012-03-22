package br.ucam.kuabaSubsystem.kuabaModel;


import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#Activity
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public interface Activity extends KuabaElement {

    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasDescription

    String getHasDescription();

//    RDFProperty getHasDescriptionProperty();

    boolean hasHasDescription();

    void setHasDescription(String newHasDescription);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasExpectedDuration

    ExpectedDuration getHasExpectedDuration();

//    RDFProperty getHasExpectedDurationProperty();

    boolean hasHasExpectedDuration();

    void setHasExpectedDuration(ExpectedDuration newHasExpectedDuration);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasFinishDate

    GregorianCalendar getHasFinishDate();

//    RDFProperty getHasFinishDateProperty();

    boolean hasHasFinishDate();

    void setHasFinishDate(GregorianCalendar newHasFinishDate);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasName

    String getHasName();

//    RDFProperty getHasNameProperty();

    boolean hasHasName();

    void setHasName(String newHasName);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasStartDate

    GregorianCalendar getHasStartDate();

//    RDFProperty getHasStartDateProperty();

    boolean hasHasStartDate();

    void setHasStartDate(GregorianCalendar newHasStartDate);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#involves

    Collection<ReasoningElement> getInvolves();

//    RDFProperty getInvolvesProperty();

    boolean hasInvolves();

    Iterator<ReasoningElement> listInvolves();

    void addInvolves(ReasoningElement newInvolves);

    void removeInvolves(ReasoningElement oldInvolves);

    void setInvolves(Collection<ReasoningElement> newInvolves);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isExecutedBy

    Collection<Person> getIsExecutedBy();

//    RDFProperty getIsExecutedByProperty();

    boolean hasIsExecutedBy();

    Iterator<Person> listIsExecutedBy();

    void addIsExecutedBy(Person newIsExecutedBy);

    void removeIsExecutedBy(Person oldIsExecutedBy);

    void setIsExecutedBy(Collection<Person> newIsExecutedBy);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#requires

    Collection<Role> getRequires();

//    RDFProperty getRequiresProperty();

    boolean hasRequires();

    Iterator<Role> listRequires();

    void addRequires(Role newRequires);

    void removeRequires(Role oldRequires);

    void setRequires(Collection<Role> newRequires);
}

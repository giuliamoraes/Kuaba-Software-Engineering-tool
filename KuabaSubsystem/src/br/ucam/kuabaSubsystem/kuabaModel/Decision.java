package br.ucam.kuabaSubsystem.kuabaModel;

//import edu.stanford.smi.protegex.owl.model.*;

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#Decision
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public interface Decision extends KuabaElement{

    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#concludes

    Idea getConcludes();

//    RDFProperty getConcludesProperty();

    boolean hasConcludes();

    void setConcludes(Idea newConcludes);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasDate

    GregorianCalendar getHasDate();

//    RDFProperty getHasDateProperty();

    boolean hasHasDate();

    void setHasDate(GregorianCalendar newHasDate);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasJustification

    Justification getHasJustification();

//    RDFProperty getHasJustificationProperty();

    boolean hasHasJustification();

    void setHasJustification(Justification newHasJustification);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isAccepted

    boolean getIsAccepted();

//    RDFProperty getIsAcceptedProperty();

    boolean hasIsAccepted();

    void setIsAccepted(boolean newIsAccepted);


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isMadeBy

    Collection<Person> getIsMadeBy();

//    RDFProperty getIsMadeByProperty();

    boolean hasIsMadeBy();

    Iterator<Person> listIsMadeBy();

    void addIsMadeBy(Person newIsMadeBy);

    void removeIsMadeBy(Person oldIsMadeBy);

    void setIsMadeBy(Collection<Person> newIsMadeBy);
}

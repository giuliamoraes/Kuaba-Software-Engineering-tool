package br.ucam.kuabaSubsystem.kuabaModel.impl;

import java.text.ParseException;
import java.util.*;

import br.ucam.kuabaSubsystem.kuabaModel.*;
import br.ucam.kuabaSubsystem.repositories.KuabaRepository;




/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#ReasoningElement
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public class DefaultReasoningElement extends DefaultKuabaElement
         implements ReasoningElement {

    
    public DefaultReasoningElement(String id, KuabaRepository repo) {
        super(id, repo);
    }


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasCreationDate

    public GregorianCalendar getHasCreationDate() {
        Collection<String> c = getDataPropertyValues("hasCreationDate");
        if (c.isEmpty()) return null;
        
    	String creationDate = c.iterator().next();
        
        DateParser parser = new DateParser();
        GregorianCalendar gregorianCreationDate = null;
    	try {
    		gregorianCreationDate = parser.toGregorianCalendar(creationDate);	
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		catch (NullPointerException npe) {
			return null;
		}
		
        return gregorianCreationDate;
    }


    public boolean hasHasCreationDate() {
        return hasProperty("hasCreationDate");
    }


    public void setHasCreationDate(GregorianCalendar newHasCreationDate) {
    	DateParser parser = new DateParser();
    	String xmlFormatedDate = parser.toStringFormat(newHasCreationDate);
    	
        Collection c = Collections.singleton(xmlFormatedDate);
        setDataPropertyValues("hasCreationDate", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasText

    public String getHasText() {
        Collection<String> c = getDataPropertyValues("hasText");
        if (c.isEmpty()) return null;
        return c.iterator().next();
    }


    public boolean hasHasText() {
        return hasProperty("hasText");
    }


    public void setHasText(String newHasText) {
        Collection c = Collections.singleton(newHasText);
        setDataPropertyValues("hasText", c);
    }


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isInvolved

    public Activity getIsInvolved() {
        Collection c = getObjectPropertyValues("isInvolved");
        if (c.isEmpty()) return null;
        return (Activity) c.iterator().next();
    }


    public boolean hasIsInvolved() {
        return hasProperty("isInvolved");
    }


    public void setIsInvolved(Activity newIsInvolved) {
        Collection c = Collections.singleton(newIsInvolved);
        setObjectPropertyValues("isInvolved", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isPresentedBy

    public Person getIsPresentedBy() {
        Collection c = getObjectPropertyValues("isPresentedBy");
        if (c.isEmpty()) return null;
        return (Person) c.iterator().next();
    }

    public boolean hasIsPresentedBy() {
        return hasProperty("isPresentedBy");
    }

    public void setIsPresentedBy(Person newIsPresentedBy) {
        Collection c = Collections.singleton(newIsPresentedBy);
        setObjectPropertyValues("isPresentedBy", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isDefinedBy

    public FormalModel getIsDefinedBy() {
        Collection c = getObjectPropertyValues("isDefinedBy");
        if(c.isEmpty()) return null;
        return (FormalModel) c.iterator().next();
    }


    public boolean hasIsDefinedBy() {
        return hasProperty("isDefinedBy");
    }


    public void setIsDefinedBy(FormalModel newIsDefinedBy) {
        Collection c = Collections.singleton(newIsDefinedBy);
        setObjectPropertyValues("isDefinedBy", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#suggests

    public Collection<Question> getSuggests() {
        return getObjectPropertyValues("suggests");
    }

    public boolean hasSuggests() {
        return hasProperty("suggests");
    }

    public Iterator<Question> listSuggests() {
        return getObjectPropertyValues("suggests").iterator();
    }

    public void addSuggests(Question newSuggests) {
        addObjectPropertyValue("suggests", newSuggests);
    }

    public void removeSuggests(Question oldSuggests) {
        removeObjectPropertyValue("suggests", oldSuggests);
    }

    public void setSuggests(Collection<Question> newSuggests) {
        setObjectPropertyValues("suggests", newSuggests);
    }
}

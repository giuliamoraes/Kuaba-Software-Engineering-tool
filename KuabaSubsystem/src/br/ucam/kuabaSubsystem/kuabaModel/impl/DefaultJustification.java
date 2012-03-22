package br.ucam.kuabaSubsystem.kuabaModel.impl;

import br.ucam.kuabaSubsystem.repositories.KuabaRepository;
import java.util.*;

import br.ucam.kuabaSubsystem.kuabaModel.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#Justification
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public class DefaultJustification extends DefaultKuabaElement implements Justification {

    public DefaultJustification(String id, KuabaRepository repo) {
        super(id, repo);
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



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isDerivedOf

    public Collection<Argument> getIsDerivedOf() {
        return getObjectPropertyValues("isDerivedOf");
    }

    public boolean hasIsDerivedOf() {
        return hasProperty("isDerivedOf");
    }

    public Iterator<Argument> listIsDerivedOf() {
        return getObjectPropertyValues("isDerivedOf").iterator();
    }

    public void addIsDerivedOf(Argument newIsDerivedOf) {
        addObjectPropertyValue("isDerivedOf", newIsDerivedOf);
    }

    public void removeIsDerivedOf(Argument oldIsDerivedOf) {
        removeObjectPropertyValue("isDerivedOf", oldIsDerivedOf);
    }

    public void setIsDerivedOf(Collection<Argument> newIsDerivedOf) {
        setObjectPropertyValues("isDerivedOf", newIsDerivedOf);
    }
}

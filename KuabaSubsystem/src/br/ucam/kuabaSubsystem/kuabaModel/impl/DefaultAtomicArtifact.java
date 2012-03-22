package br.ucam.kuabaSubsystem.kuabaModel.impl;

import br.ucam.kuabaSubsystem.kuabaModel.AtomicArtifact;
import br.ucam.kuabaSubsystem.repositories.KuabaRepository;
import java.util.Collection;
import java.util.Collections;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#AtomicArtifact
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public class DefaultAtomicArtifact extends DefaultArtifact implements AtomicArtifact {

    public DefaultAtomicArtifact(String id, KuabaRepository repo) {
        super(id, repo);
    }

    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isVersionOf

    public AtomicArtifact getIsVersionOf() {
        Collection c = getObjectPropertyValues("isVersionOf");
        if (c.isEmpty()) return null;
        return (AtomicArtifact) c.iterator().next();
    }

    public boolean hasIsVersionOf() {
        return hasProperty("isVersionOf");
    }

    public void setIsVersionOf(AtomicArtifact newIsVersionOf) {
        Collection c = Collections.singleton(newIsVersionOf);
        setObjectPropertyValues("isVersionOf", c);
    }
}

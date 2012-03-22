package br.ucam.kuabaSubsystem.kuabaModel.impl;

import br.ucam.kuabaSubsystem.repositories.KuabaRepository;

import java.sql.SQLException;
import java.util.*;

import com.compendium.core.ICoreConstants;
import com.compendium.core.datamodel.Link;
import com.compendium.core.datamodel.ModelSessionException;
import com.compendium.core.datamodel.NodeSummary;
import com.compendium.core.datamodel.View;

import br.ucam.kuabaSubsystem.kuabaModel.*;
import br.ucam.kuabaSubsystem.repositories.KuabaRepository;
import br.ucam.kuabaSubsystem.util.KuabaHelper;


/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#Question
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public class DefaultQuestion extends DefaultReasoningElement implements Question {

    public DefaultQuestion(String id, KuabaRepository repo) {
        super(id, repo);
    }
   
    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasDecision

    public Collection<Decision> getHasDecision() {
        return getObjectPropertyValues("hasDecision");
    }

    public boolean hasHasDecision() {
        return hasProperty("hasDecision");
    }


    public Iterator<Decision> listHasDecision() {
        return getObjectPropertyValues("hasDecision").iterator();
    }


    public void addHasDecision(Decision newHasDecision) {
        addObjectPropertyValue("hasDecision", newHasDecision);
    }


    public void removeHasDecision(Decision oldHasDecision) {
        removeObjectPropertyValue("hasDecision", oldHasDecision);
    }


    public void setHasDecision(Collection<Decision> newHasDecision) {
        setObjectPropertyValues("hasDecision", newHasDecision);
    }


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasType

    public String getHasType() {
        Collection<String> c = getDataPropertyValues("hasType");
        if (c.isEmpty()) return null;
        return c.iterator().next();
    }

    public boolean hasHasType() {
        return hasProperty("hasType");
    }

    public void setHasType(String newHasType) {
        Collection c = Collections.singleton(newHasType);
        setDataPropertyValues("hasType", c);
    }


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isAddressedBy

    public Collection<Idea> getIsAddressedBy() {
        return getObjectPropertyValues("isAddressedBy");
    }

    public boolean hasIsAddressedBy() {
        return hasProperty("isAddressedBy");
    }


    public Iterator<Idea> listIsAddressedBy() {
        return getObjectPropertyValues("isAddressedBy").iterator();
    }


    public void addIsAddressedBy(Idea newIsAddressedBy) {
        addObjectPropertyValue("isAddressedBy", newIsAddressedBy);
    }


    public void removeIsAddressedBy(Idea oldIsAddressedBy) {
        removeObjectPropertyValue("isAddressedBy", oldIsAddressedBy);
    }


    public void setIsAddressedBy(Collection<Idea> newIsAddressedBy) {
        setObjectPropertyValues("isAddressedBy", newIsAddressedBy);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isSuggestedBy

    public Collection<ReasoningElement> getIsSuggestedBy() {
        return getObjectPropertyValues("isSuggestedBy");
    }

    public boolean hasIsSuggestedBy() {
        return hasProperty("isSuggestedBy");
    }


    public Iterator<ReasoningElement> listIsSuggestedBy() {
        return getObjectPropertyValues("isSuggestedBy").iterator();
    }


    public void addIsSuggestedBy(ReasoningElement newIsSuggestedBy) {
        addObjectPropertyValue("isSuggestedBy", newIsSuggestedBy);
    }


    public void removeIsSuggestedBy(ReasoningElement oldIsSuggestedBy) {
        removeObjectPropertyValue("isSuggestedBy", oldIsSuggestedBy);
    }


    public void setIsSuggestedBy(Collection<ReasoningElement> newIsSuggestedBy) {
        setObjectPropertyValues("isSuggestedBy", newIsSuggestedBy);
    }


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isVersionOf

    public Question getIsVersionOf() {
        Collection c = getObjectPropertyValues("isVersionOf");
        if (c.isEmpty()) return null;
        return (Question) c.iterator().next();
    }

    public boolean hasIsVersionOf() {
        return hasProperty("isVersionOf");
    }

    public void setIsVersionOf(Question newIsVersionOf) {
        Collection c = Collections.singleton(newIsVersionOf);
        setObjectPropertyValues("isVersionOf", c);
    }


	@Override
	public Question deepCopy(Map<ReasoningElement, Integer> stageMap, KuabaRepository targetRepository) {
		HashMap<Idea, List<Decision>> decisionMap = 
			KuabaHelper.constructIdeaDecisionMap(this);
		if(!canCopy()){
			return this;
		}
		else{
			Question cloneQuestion = targetRepository.getModelFactory(
					).createQuestion(UUID.randomUUID().toString());
			cloneQuestion.setHasText(this.getHasText());
			Collection<Idea> addressedIdeaList = this.getIsAddressedBy();
			for (Idea idea : addressedIdeaList) {	
				Idea clonedIdea = idea.deepCopy(stageMap, targetRepository, cloneQuestion);
				cloneQuestion.addIsAddressedBy(clonedIdea);
				List<Decision>	decisionList = decisionMap.get(idea);
				if(!decisionList.isEmpty()){
					Decision lastDecision = decisionList.get(decisionList.size() - 1);
					Decision ideaQuestionDecision = targetRepository.getModelFactory(
					).createDecision(UUID.randomUUID().toString());
					cloneQuestion.addHasDecision(ideaQuestionDecision);
					ideaQuestionDecision.setIsAccepted(lastDecision.getIsAccepted());
					ideaQuestionDecision.setHasDate(new GregorianCalendar());
					ideaQuestionDecision.setConcludes(clonedIdea);
				}
			}
			return cloneQuestion;
		}		
	}


//	@Override
//	public NodeSummary getView(View view, int x, int y) {
//		NodeSummary node = new NodeSummary();
//		
//		try {
//			node.setId(ID_GENERATOR.nextVal() + "");
//			node.setCreationDate(new Date(), "Thiago");
//			node.setType(ICoreConstants.ISSUE, "Thiago");
//			node.setLabel(this.getHasText(), "Thiago");
//			view.addNodeToView(node, x, y);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ModelSessionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//		Collection<Idea> addressedBy = this.getIsAddressedBy();
//		int count = -200;
//		for (Idea idea : addressedBy){ 
//			Decision d = KuabaHelper.getDecision(this, idea);
//			String txt = this.getHasText(); 
//			if(txt.contains(Question.DOMAIN_QUESTION_TEXT_PREFIX)){
//				if(d != null){
//					count += 200;
//					NodeSummary ideaNS = new NodeSummary();
//					ideaNS = idea.getView(view, x+ count + x, y+200);
//					if(d.getIsAccepted())
//						try {
//							ideaNS.setType(ICoreConstants.DECISION, "");
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						} catch (ModelSessionException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//				
//					Link l = new Link(ICoreConstants.CHALLENGES_LINK,
//							ideaNS, node, "is addressed by", 
//							ICoreConstants.ARROW_FROM);
//					l.setId(ID_GENERATOR.nextVal() + "");
//					try {
//						view.addLinkToView(l);				
//						view.addNodeToView(node, x, y);
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					} catch (ModelSessionException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}			
//			else{
//				count += 200;
//				NodeSummary ideaNS = new NodeSummary();
//				ideaNS = idea.getView(view, x+ count, y+200);
//				if(d != null){					
//					if(d.getIsAccepted())
//						try {
//							ideaNS.setType(ICoreConstants.DECISION, "");
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						} catch (ModelSessionException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}					
//				}
//				Link l = new Link(ICoreConstants.CHALLENGES_LINK,
//						ideaNS, node, "is addressed by", 
//						ICoreConstants.ARROW_FROM);
//                                
//                                
//				l.setId(ID_GENERATOR.nextVal() + "");
//				try {
//					view.addLinkToView(l);				
//					view.addNodeToView(node, x, y);
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (ModelSessionException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//				
//		}		
//					
//		
//		return node;
//	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DRUnionEquivalenceSetUpPanel.java
 *
 * Created on 18/01/2012, 19:37:38
 */
package br.ucam.kuabaSubsystem.rationaleProcessor.unionui;

import br.ucam.kuabaSubsystem.rationaleProcessor.EquivalenceRuleManager;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Bruno
 */
public class DRUnionEquivalenceSetUpPanel extends javax.swing.JPanel {

    private DefaultListModel<String> baseDomainIdeasTextListModel;
    private DefaultListModel<String> otherDomainIdeasTextListModel;
    private DefaultListModel<String> equivalenceRulesListModel;
    private EquivalenceRuleManager equivalences = null;
    private boolean hasChanges;

    /** Creates new form DRUnionEquivalenceSetUpPanel */
    public DRUnionEquivalenceSetUpPanel() {
        initComponents();
        baseDomainIdeasTextListModel = new DefaultListModel<String>();
        baseDomainIdeasTextJList.setModel(baseDomainIdeasTextListModel);
        
        otherDomainIdeasTextListModel = new DefaultListModel<String>();
        otherDomainIdeasTextJList.setModel(otherDomainIdeasTextListModel);

        equivalenceRulesListModel = new DefaultListModel<String>();
        equivalenceRulesJList.setModel(equivalenceRulesListModel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createRuleButton = new javax.swing.JButton();
        removeRuleButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        equivalenceRulesJList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        editRuleButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        baseDomainIdeasTextJList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        otherDomainIdeasTextJList = new javax.swing.JList();

        jLabel1.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.jLabel1.text")); // NOI18N

        createRuleButton.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.createRuleButton.text")); // NOI18N
        createRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRuleButtonActionPerformed(evt);
            }
        });

        removeRuleButton.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.removeRuleButton.text")); // NOI18N
        removeRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRuleButtonActionPerformed(evt);
            }
        });

        equivalenceRulesJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(equivalenceRulesJList);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.jLabel3.text")); // NOI18N

        editRuleButton.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.editRuleButton.text")); // NOI18N
        editRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRuleButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.jPanel1.border.title"))); // NOI18N

        baseDomainIdeasTextJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(baseDomainIdeasTextJList);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.jLabel4.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(DRUnionEquivalenceSetUpPanel.class, "DRUnionEquivalenceSetUpPanel.jLabel5.text")); // NOI18N

        jScrollPane3.setViewportView(otherDomainIdeasTextJList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeRuleButton, 0, 0, Short.MAX_VALUE)
                            .addComponent(editRuleButton, 0, 0, Short.MAX_VALUE)
                            .addComponent(createRuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(createRuleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editRuleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeRuleButton)
                                .addGap(134, 134, 134))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRuleButtonActionPerformed

        int baseSelection = baseDomainIdeasTextJList.getSelectedIndex();
        int[] indices = otherDomainIdeasTextJList.getSelectedIndices();
        if ((indices.length == 0) || (baseSelection < 0 && indices.length < 2)) return;
        
        TreeSet<String> equivalenceRuleSet = new TreeSet<String>();
        
        String baseSelectionText;
        boolean hasBaseSelection = false;
        
        if (baseSelection >= 0) {
            baseSelectionText = baseDomainIdeasTextListModel.get(baseSelection);
            hasBaseSelection = true;
            equivalenceRuleSet.add(baseSelectionText);
        }
        
        for (int x = 0; x < indices.length; x++) {
            equivalenceRuleSet.add(otherDomainIdeasTextListModel.get(indices[x]));
        }
        
        try {   
            equivalences.addEquivalenceRule(equivalenceRuleSet);
            updateEquivalenceRulesList();
            hasChanges = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        baseDomainIdeasTextJList.clearSelection();
        otherDomainIdeasTextJList.clearSelection();
	}//GEN-LAST:event_createRuleButtonActionPerformed

    private void editRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRuleButtonActionPerformed
        
        int selection = equivalenceRulesJList.getSelectedIndex();
        if (selection<0) return;
        
        try {
            String selectionText = equivalenceRulesListModel.get(selection);
            SortedSet<String> oldRule = parseEquivalenceRuleText(selectionText);
            
            String newRuleText = JOptionPane.showInputDialog(this,"Make the necessary changes: (separate the names using \" = \", keeping the equals sign isolated)",selectionText);
            SortedSet<String> newRule = parseEquivalenceRuleText(newRuleText);
            
            equivalences.updateEquivalenceRule(oldRule, newRule);
            updateEquivalenceRulesList();
            hasChanges = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_editRuleButtonActionPerformed

    private void removeRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRuleButtonActionPerformed
        
        int selection = equivalenceRulesJList.getSelectedIndex();
        if (selection<0) return;
              
        try {
            String selectionText = equivalenceRulesListModel.get(selection);
            SortedSet<String> oldRule = parseEquivalenceRuleText(selectionText);
            
            equivalences.removeEquivalenceRule(oldRule);
            updateEquivalenceRulesList();
            hasChanges = true;
        } catch (Exception ex) {
            Logger.getLogger(DRUnionEquivalenceSetUpPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_removeRuleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList baseDomainIdeasTextJList;
    private javax.swing.JButton createRuleButton;
    private javax.swing.JButton editRuleButton;
    private javax.swing.JList equivalenceRulesJList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList otherDomainIdeasTextJList;
    private javax.swing.JButton removeRuleButton;
    // End of variables declaration//GEN-END:variables

    public void setDomainIdeasText(SortedSet<String> baseIdeasText, SortedSet<String> otherIdeasText) {
        //clearing all the lists because new data are being setted, and the previous defined rules are no longer valid.
        baseDomainIdeasTextListModel.clear();
        otherDomainIdeasTextListModel.clear();
        equivalenceRulesListModel.clear();
        equivalences = new EquivalenceRuleManager(baseIdeasText);

        for (String iText : baseIdeasText) {
            baseDomainIdeasTextListModel.addElement(iText);
        }
        
        for (String iText : otherIdeasText) {
            otherDomainIdeasTextListModel.addElement(iText);
        }

        hasChanges = true;
    }

    private void updateEquivalenceRulesList() {
        equivalences.updateListModel(equivalenceRulesListModel, true);
    }
    
    private SortedSet<String> parseEquivalenceRuleText(String equivalenceRule) throws Exception {
        String[] ideasTexts = equivalenceRule.split("\\s=\\s");
        TreeSet<String> result = new TreeSet<String>();
        
        boolean containsBaseIdea = false;
        
        for (int x=0; x<ideasTexts.length; x++) { 
            String ideaText = ideasTexts[x].trim();
            if (baseDomainIdeasTextListModel.contains(ideaText)) {
                if(containsBaseIdea) {
                    throw new Exception("You can't have two base domain ideas in the same rule!");
                } else {
                    containsBaseIdea = true;
                }               
            }
            if (!baseDomainIdeasTextListModel.contains(ideaText) && !otherDomainIdeasTextListModel.contains(ideaText)) throw new Exception("\""+ideaText+"\" was not found among domain ideas.");
            result.add(ideaText);
        }
        
        return result;
    }

    public EquivalenceRuleManager getEquivalences() {
        return equivalences;
    }
    
    public boolean doChanges() {
        if (hasChanges == true) {
            hasChanges = false;
            return true;
        } else 
            return false;
    }
    
}

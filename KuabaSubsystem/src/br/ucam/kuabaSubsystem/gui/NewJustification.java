/*
 * NewJustification.java
 *
 * Created on 19 de Dezembro de 2008, 10:51
 */

package br.ucam.kuabaSubsystem.gui;

import br.ucam.kuabaSubsystem.controller.NewJustificationController;

/**
 *
 * @author  Thiago
 */
public class NewJustification extends javax.swing.JFrame {
    private NewJustificationController controller;
    /** Creates new form NewJustification */
    public NewJustification(NewJustificationController controller) {
        initComponents();
        this.controller = controller;
        this.inFavorTable.setModel(this.controller.getInFavorTableModel());
        this.ObjectsToTable.setModel(this.controller.getObjectsToTableModel());
        this.controller.insertInFavorArguments();
        this.controller.insertObjectsToArguments();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        justificationTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        createJustificationButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inFavorTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ObjectsToTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        argumentTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        justificationTextArea.setColumns(20);
        justificationTextArea.setRows(5);
        jScrollPane1.setViewportView(justificationTextArea);

        jLabel1.setText("Justification Text:");

        createJustificationButton.setText("Create");
        createJustificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJustificationButtonActionPerformed(evt);
            }
        });

        inFavorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "In Favor Arguments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inFavorTable.setColumnSelectionAllowed(true);
        inFavorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inFavorTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inFavorTable);

        ObjectsToTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Objects To Arguments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ObjectsToTable);

        argumentTextArea.setColumns(20);
        argumentTextArea.setRows(5);
        jScrollPane4.setViewportView(argumentTextArea);

        jLabel2.setText("Argument Text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(193, 193, 193))
                    .addComponent(createJustificationButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(createJustificationButton)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createJustificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJustificationButtonActionPerformed
        this.controller.create(this.justificationTextArea.getText());
        this.dispose();
}//GEN-LAST:event_createJustificationButtonActionPerformed

    private void inFavorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inFavorTableMouseClicked
        int row = this.inFavorTable.getSelectedRow();
        String item = this.controller.getInFavorElement(row, 0);
        this.argumentTextArea.setText("");
        this.argumentTextArea.setText(item);
    }//GEN-LAST:event_inFavorTableMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ObjectsToTable;
    private javax.swing.JTextArea argumentTextArea;
    private javax.swing.JButton createJustificationButton;
    private javax.swing.JTable inFavorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea justificationTextArea;
    // End of variables declaration//GEN-END:variables
    
}

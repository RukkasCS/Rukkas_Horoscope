/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.gui;

import app.logic.Person;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import operations.ZodiacOperation;
import objects.Player;

/**
 *
 * @author User
 */
public class DisplayGUI extends javax.swing.JFrame {

    /**
     * Creates new form DisplayGUI
     */
    DefaultTableModel dtModel = new DefaultTableModel();
    
    DefaultListModel posMod = new DefaultListModel();
    DefaultListModel negMod = new DefaultListModel();
    
    String[] positives;
    String[] negatives;
    
    //Defining Characteristics of each Zodiac Sign
    
    String[] ariesPos = {"- Independent","- Generous","- Optimistic","- Enthusiastic","- Courageous"};    
    String[] ariesNeg = {"- Moody", "- Short tempered","- Self-involved","- Impulsive","- Impatient"};
    
    String[] taurusPos = {"- Dependable","- Persistent","- Loyal","- Patient","- Generous"};
    String[] taurusNeg = {"- Stubborn","- Laziness","- Possessive","- Materialistic","- Self-indulging"};
    
    String[] geminiPos = {"- Energetic","- Clever","- Imaginative","- Witty","- Adaptable"};   
    String[] geminiNeg = {"- Superficial","- Impulsive","- Restless","- Devious","- Indecisive"};
    
    String[] cancerPos = {"- Loyalty","- Dependable","- Caring","- Adaptable","- Responsive"};
    String[] cancerNeg = {"- Moody","- Clingy","- Self-pitying","- Oversensitive","- Self-absorbed"};
 
    String[] leoPos = {"- Confident","- Ambitious","- Generous","- Loyal","- Encouraging"};
    String[] leoNeg = {"- Pretentious","- Domineering","- Melodramatic","- Stubborn","- Vain"};
   
    String[] virgoPos = {"- Analytical","- Observant","- Helpful","- Reliable","- Precise"};
    String[] virgoNeg = {"- Skeptical","- Fussy","- Inflexible","- Cold","- Interfering"};
 
    String[] libraPos = {"- Diplomatic","- Graceful","- Peaceful","- Idealistic","- Hospitable"};
    String[] libraNeg = {"- Superficial","- Vain","- Indecisive","- Unreliable"};

    String[] scorpioPos = {"- Loyal","- Passionate","- Resourceful","- Observant","- Dynamic"};
    String[] scopioNeg = {"- Jealous","- Obsessive","- Suspicious","- Manipulative","- Unyielding"};    

    String[] sagittariusPos = {"- Independence"};
    String[] sagittariusNeg = {"- Unemotional"};

    String[] capricornPos = {"- Responsible","- Patient","- Ambitious","- Resourceful","- Loyal"};
    String[] capricornNeg = {"- Dictatorial","- Inhibited","- Conceited","- Distrusting","- Unimaginative"};

    String[] aquariusPos = {"- Witty","- Clever","- Humanitarian","- Inventive","- Original"};
    String[] aquariusNeg = {"- Stubborn","- Unemotional","- Sarcastic","- Rebellious","- Aloof"};

    String[] piscesPos = {"- Compassionate","- Adaptable","- Accepting","- Devoted","- Imaginative"};
    String[] piscesNeg = {"- Oversensitive","- Indecisive","- Self-pitying","- Lazy","- Escapist"};
    
    public DisplayGUI() {
        setLocation(300, 10);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Display = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_Pos = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_Neg = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Your Horoscopes!");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/images/1_top.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(255, 51, 0));

        tbl_Display.setBackground(new java.awt.Color(0, 153, 153));
        tbl_Display.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tbl_Display.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tbl_Display.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Age", "Zodiac Sign"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Display.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tbl_Display.setAutoscrolls(false);
        tbl_Display.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_Display.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tbl_Display.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_Display.setShowVerticalLines(false);
        tbl_Display.getTableHeader().setReorderingAllowed(false);
        tbl_Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Display);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/gui/images/1_bottom.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("~ Horoscope Details ~");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("(Please select a person from above table to display his / her Horoscope Details)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Positives");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Negatives");

        list_Pos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        list_Pos.setForeground(new java.awt.Color(0, 153, 0));
        jScrollPane3.setViewportView(list_Pos);

        list_Neg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        list_Neg.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane4.setViewportView(list_Neg);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DisplayMouseClicked
        posMod.removeAllElements();
        negMod.removeAllElements();
        
        int selected = tbl_Display.getSelectedRow();
        if (selected != -1)
        {            
            String zodiac =dtModel.getValueAt(selected, 2).toString();
            
            positives = getPositives(zodiac);
            //getNegatives
            
            for (String s:positives)
            {
                posMod.addElement(s);
            }
            
            list_Pos.setModel(posMod);
            
        }
    }//GEN-LAST:event_tbl_DisplayMouseClicked

    String[] getPositives(String zodiac)
    {
        String[] p = null;
        
        switch (zodiac)
        {
                case "'Aries'": p = ariesPos; break;
        }
        return p;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList list_Neg;
    private javax.swing.JList list_Pos;
    private javax.swing.JTable tbl_Display;
    // End of variables declaration//GEN-END:variables

    void getPersonList(ArrayList<Person> sendingList) 
    {
        Date today = new Date();
        String name, zodiac;
        int age;
//        DefaultTableModel dtModel = new DefaultTableModel();
//        Object[] convertedObjects = new Object[4];
//        Object[] columnNames = new Object[4];
        Object[] convertedObjects = new Object[3];
        Object[] columnNames = new Object[3];
        
        columnNames[0] = "Name";
        columnNames[1] = "Age";
        columnNames[2] = "Zodiac Sign";
        
        dtModel.setColumnIdentifiers(columnNames);
        
        //Define objects by Malinda
        ZodiacOperation zodi =new ZodiacOperation();
        ArrayList<Player> playerList=new ArrayList<>();
       
       for(Person p : sendingList)
        {
            name = p.getName();
            
            //Get the DOB and calculate the age
            Date bdate = p.getDOB();
            int bd = bdate.getYear();
            int now = today.getYear();
            age = now - bd;
            if (bdate.getMonth() > today.getMonth())    {   age = age - 1;  }            
            if (bdate.getMonth() == today.getMonth())   {   if (bdate.getDate() > today.getDate())  { age = age - 1;  }   }
            
            //Add Zodiac and Horosscope details of the Person.
            
            int bd_month = bdate.getMonth() + 1;
            int bd_date = bdate.getDate();
            
            //Operations by Malinda
            Player player=new Player();
            player.setName(name);
            player.setAge(age);
            player.setMonth(bd_month);
            player.setDay(bd_date);
            playerList.add(player);         
                
        }
       
       //Connecting to prolog logic by Malinda
        ArrayList<Player> resultPlayer=zodi.getZodiacResult(playerList);
        for (Player player : resultPlayer) 
        {
            //Display Person in the Table
            convertedObjects[0] = player.getName();
            convertedObjects[1] = player.getAge();
            convertedObjects[2] = player.getZodiacSign();
                    
            dtModel.addRow(convertedObjects);
        }
        this.tbl_Display.setModel(dtModel);
    }
    
    
}

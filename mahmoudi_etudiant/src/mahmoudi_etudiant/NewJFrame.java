package mahmoudi_etudiant;
import java.awt.Color;
import java.awt.TextField;
import static java.lang.Math.round;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mohamed_mahmoudi
 */
public class NewJFrame extends javax.swing.JFrame {
    
    
    public int getselected(){
   return( jComboBox1.getSelectedIndex());
    
    
    }
    
    
    public static  int m;
    void vesibilite(boolean a,boolean b,boolean c,boolean d,boolean e,boolean f,boolean g,boolean h,boolean y,boolean z){
    jPanel4.setVisible(a);
    text1.setVisible(b);
    jButton1.setVisible(c);
    tex1.setVisible(d);
    tex2.setVisible(e);
    tex3.setVisible(f);
    tex4.setVisible(g);
    tex5.setVisible(h);
    tex6.setVisible(y);
    button1.setVisible(z);
    
    
    }
    
    
    void enabilite(boolean b,boolean c,boolean d,boolean e,boolean f,boolean g,boolean h,boolean y,boolean z){
    text1.enable(b);
    jButton1.enable(c);
    tex1.enable(d);
    tex2.enable(e);
    tex3.enable(f);
    tex4.enable(g);
    tex5.enable(h);
    tex6.enable(y);
    button1.enable(z);
        
        
    }
    
     public void getnb(){
        try {
           rs= DB.getData("select count(idetudiant) as co from etudiant;");
           r= DB.getData("select count(idmat) as ma  from matiere;");
           while (rs.next()) {
            jLabel6.setText(rs.getString("co"));
           }
           while (r.next()) {
               jLabel7.setText(r.getString("ma"));
           }
           
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    void value(String a,String b,String c,String d,String e,String f){
    
                    tex1.setText(a);
                    tex2.setText(b);
                    tex3.setText(c);
                    tex4.setText(d);
                    tex5.setText(e);
                    tex6.setText(f);
    
    }
    /**
     * Creates new form NewJFrame
     */
    
    ResultSet rs = null;
    ResultSet r = null;
    public NewJFrame() {
        initComponents();
        jComboBox1.setSelectedIndex(1);
        jComboBox1.setSelectedIndex(0);
        jPanel4.setVisible(false);
        text1.setVisible(false);
        getnb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tex1 = new java.awt.TextField();
        tex3 = new java.awt.TextField();
        tex5 = new java.awt.TextField();
        tex2 = new java.awt.TextField();
        tex4 = new java.awt.TextField();
        tex6 = new java.awt.TextField();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        text1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setLabelFor(this);
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setDoubleBuffered(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.cyan);
        setBounds(new java.awt.Rectangle(10, 10, 100, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 20))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "operation sur les etudiants", "operation sur les matiers" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox2ItemStateChanged(evt);
            }
        });
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("update");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("get cordonne");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 10)); // NOI18N
        jLabel2.setText("saisire id de etudiant :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tex5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tex3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(tex1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tex4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(tex6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tex2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tex6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("nubre des Matieres :");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("nubre des Etudiant :");

        jLabel6.setBackground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 457, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rsultat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 20), new java.awt.Color(0, 255, 0))); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int select=jComboBox1.getSelectedIndex();
        if (select==0){
            getnb();
        ComboBox2.removeAllItems();
        ComboBox2.addItem("Afficher liste des Etudiant");
        ComboBox2.addItem("Afficher les moyen des Etudiant");
        ComboBox2.addItem("Afficher les note des Etudiant");
        ComboBox2.addItem("modifier les note des Etudiant");
        ComboBox2.addItem("Ajouter Etudiant");
        ComboBox2.addItem("supprimer Etudiant");
        ComboBox2.addItem("modifier Etudiant");
        ComboBox2.addItem("Ajouter Note pour Etudiant");
        
        
        
        
        }
        
        
        if (select==1){
            getnb();
        ComboBox2.removeAllItems();
        ComboBox2.addItem("Afficher list des matiers");
        ComboBox2.addItem("Ajouter matiers");
        ComboBox2.addItem("supprimer matiers");
        ComboBox2.addItem("modifier matiers");
        
        
        
        
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void ComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox2ItemStateChanged
        int selectd=ComboBox2.getSelectedIndex();
        int select=jComboBox1.getSelectedIndex();
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        

        if (select==0){
            
        switch(selectd){
            
            case 0:
                getnb();
                vesibilite(false,false,false,false,false,false,false,false,false,false);
            
                            try {
                rs = DB.getData("select *  from etudiant;");
            } catch (Exception ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
              model.setColumnCount(0);
                model.setNumRows(0);
                model.addColumn("id");
                model.addColumn("Nom");
                model.addColumn("Prenom");
                model.addColumn("Date naisance");
                model.addColumn("filiere");
                model.addColumn("Niveau");
                
                
            {
                try {
                    
            
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("idetudiant"),rs.getString("nom"),rs.getString("prenom"),rs.getString("datnaissance"),rs.getString("filiere"),rs.getString("niveau")});
                       
                        
                    }        } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
                
                break;
                
                
                
                
            case 1:
                getnb();
                vesibilite(false,false,false,false,false,false,false,false,false,false);
                try {
               
                    rs = DB.getData("select etudiant.niveau,etudiant.filiere,etudiant.prenom,etudiant.nom,avg(note.tp) as tpn,avg(note.ds) as dsn,avg(note.examen) as exn from note,etudiant where note.idetudiant=etudiant.idetudiant group by etudiant.idetudiant;");
                    
                    model.setColumnCount(0);
                model.setNumRows(0);
                model.addColumn("Nom");
                model.addColumn("Prenom");
                model.addColumn("filiere");
                model.addColumn("Niveau");
                model.addColumn("Moyen");
                while (rs.next()) {
                model.addRow(new Object[]{rs.getString("nom"),rs.getString("prenom"),rs.getString("filiere"),rs.getString("niveau"),(float)(((Double.parseDouble(rs.getString("dsn"))+Double.parseDouble(rs.getString("exn"))+Double.parseDouble(rs.getString("tpn")))/3))});
                }
                } catch (Exception ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
                break;
                


            case 2:
                getnb();
                vesibilite(false,false,false,false,false,false,false,false,false,false);
                
            try {
                rs = DB.getData("SELECT idnote,nom,prenom,nommatire,ds,examen,tp FROM note,etudiant,matiere WHERE etudiant.idetudiant=note.idetudiant and note.idmat=matiere.idmat;");
            } catch (Exception ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
           
              model.setColumnCount(0);
                model.setNumRows(0);
                model.addColumn("id note");
                model.addColumn("Nom");
                model.addColumn("Prenom");
                model.addColumn("Matiere");
                model.addColumn("Ds");
                model.addColumn("Examen");
                model.addColumn("Tp");
                
                
            {
                try {
                    
            
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("idnote"),rs.getString("nom"),rs.getString("prenom"),rs.getString("nommatire"),rs.getString("ds"),rs.getString("examen"),rs.getString("tp")});
                       
                        
                    }        } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
                
                break;
                
                
            case 3:
                getnb();
                jLabel3.setText("modifier les note des Etudiant");
                
                jPanel4.setBackground(new Color(0, 255, 0));
                value("","","","","","");
                m=3;
                vesibilite(true,true,true,true,true,true,false,false,false,true);
                jButton1.setLabel("get les note");
                enabilite(true,true,true,true,true,true,true,true,true);
                
                
                break;
                
            case 4:
          vesibilite(false,false,false,false,false,false,false,false,false,false);
         ajout j=new ajout();
        j.setVisible(true);
        this.setVisible(true);
        break;
        
        case 5:
            jLabel3.setText("supprimer Etudiant");
            jPanel4.setBackground(new Color(255, 153, 153));
        m=5;
        value("","","","","","");
        vesibilite(true,true,true,true,true,true,true,true,true,true);
        enabilite(true,true,false,false,false,false,false,false,true);
        button1.setLabel("supprimer");
        jButton1.setLabel("get les cordonne");
        break;
        case 6:
            getnb();
            jLabel3.setText("Modifier Etudiant");
            jPanel4.setBackground(new Color(153, 255, 0));
            m=6;
            value("","","","","","");
            vesibilite(true,true,true,true,true,true,true,true,true,true);
            enabilite(true,true,true,true,true,true,true,true,true);
            button1.setLabel("update");
            jButton1.setLabel("get les cordonne");
            break;
            
            
        case 7:
            
            getnb();
            vesibilite(false,false,false,false,false,false,false,false,false,false);
         
            try {
                ajoutN jn = new ajoutN();
                
                jn.setVisible(true);
        this.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
            break;

        }
        
        
        
        
        }
        
        if (select==1){
        
            switch(selectd){
                case 0:
                    getnb();
                    
                    vesibilite(false,false,false,false,false,false,false,false,false,false);
            
                            try {
                rs = DB.getData("select *  from matiere;");
            } catch (Exception ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
              model.setColumnCount(0);
                model.setNumRows(0);
                model.addColumn("id matiere");
                model.addColumn("Nom matiere");
                model.addColumn("filiere");
                model.addColumn("Niveau");
                
                
            {
                try {
                    
            
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("idmat"),rs.getString("nommatire"),rs.getString("filiere"),rs.getString("niveau")});
                       
                        
                    }        } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
  
                    break;
                    
                case 1:
                    getnb();
                   ajoutmm o;
                try {
                    o = new ajoutmm();
                     o.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
       
                    
                    break;
                    case 3:
                        getnb();
                        jLabel2.setText("saiser id matiere :");
                        
                jLabel3.setText("modifier  un matiere");
                
                jPanel4.setBackground(new Color(204, 255, 204));
                value("","","","","","");
                m=3;
                vesibilite(true,true,true,true,true,true,false,false,false,true);
                jButton1.setLabel("get");
                enabilite(true,true,true,true,true,true,true,true,true);
                
                
                break;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
        
        
        
        
        }
        
        
        
        
        
    }//GEN-LAST:event_ComboBox2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
{ if (jComboBox1.getSelectedIndex()==0){
    
    
    
    
    
    
    if(m==3){

    try {
        rs = DB.getData("select ds,examen,tp from note where idnote='"+text1.getText()+"'");
        while (rs.next()) {
 value(rs.getString("ds"),rs.getString("examen"),rs.getString("tp")," "," "," ");
                    
                    }
    } catch (Exception ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }





}
                try {
                    rs = DB.getData("select * from etudiant where idetudiant='"+text1.getText()+"'");
                    
                    
                    while (rs.next()) {
                        value(rs.getString("nom"),rs.getString("prenom"),rs.getString("datnaissance"),rs.getString("sexe"),rs.getString("filiere"),rs.getString("niveau"));
                    
                    }
                    
                    
                    
                    
                } catch (Exception ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }}
if (jComboBox1.getSelectedIndex()==1){
if(m==3){
    try {
        rs = DB.getData("select * from matiere where idmat='"+text1.getText()+"'");
    } catch (Exception ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        while (rs.next()) {
            value(rs.getString("nommatire"),rs.getString("filiere"),rs.getString("niveau")," "," "," ");
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }

}


}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
if (jComboBox1.getSelectedIndex()==0){
        
        
        if(m==3){

            if(tex1.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "choise vraie note plaise");
            
            }else{
                try {
                    DB.setData("update note set ds="+tex1.getText()+", examen="+tex2.getText()+", tp="+tex3.getText()+" where idnote="+text1.getText());
                JOptionPane.showMessageDialog(rootPane, "Note ete changed");
                value("","","","","","");
                
                } catch (Exception ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
                
            }

}
        if(m==5){ 
            if(tex1.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Not Etudiant choise");
            
            }else{
            try {
            // TODO add your handling code here:
            DB.setData("delete from etudiant where idetudiant='"+text1.getText()+"'");
            JOptionPane.showMessageDialog(rootPane, "le etudiant a et supprimer ");
            value("","","","","","");
            


        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }}}
        
        
        if(m==6){
            if(tex1.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Not Etudiant choise");
            
            }else{
        try {
            DB.setData("update etudiant set nom='"+tex1.getText()+"', prenom='"+tex2.getText()+"', datnaissance='"+tex3.getText()+"', sexe='"+tex4.getText()+"', filiere='"+tex5.getText()+"', niveau='"+tex6.getText()+"' where idetudiant='"+text1.getText()+"'");
        JOptionPane.showMessageDialog(rootPane, "Etudiant update");
        value("","","","","","");
        
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }}}}

if (jComboBox1.getSelectedIndex()==1){
    if(m==3){

    try {
        DB.setData("update matiere set nommatire="+"'"+tex1.getText()+"'"+", filiere="+"'"+tex2.getText()+"'"+", niveau="+"'"+tex3.getText()+"'"+" where idmat="+"'"+text1.getText()+"'");
    } catch (Exception ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }}






}
        getnb();
    }//GEN-LAST:event_button1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox2;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.TextField tex1;
    private java.awt.TextField tex2;
    private java.awt.TextField tex3;
    private java.awt.TextField tex4;
    private java.awt.TextField tex5;
    private java.awt.TextField tex6;
    private java.awt.TextField text1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree.GUI;

import BinarySearchTree.util.BinarySearchTreeManager;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Víctor Manuel
 */
public class Main extends javax.swing.JFrame {
    private BinarySearchTreeManager manager = new BinarySearchTreeManager();
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        buttons(false);
        this.txtDat.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        intFraGra = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnPut = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnPos = new javax.swing.JButton();
        btnSal = new javax.swing.JButton();
        txtDat = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        intFraGra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        intFraGra.setVisible(true);

        javax.swing.GroupLayout intFraGraLayout = new javax.swing.GroupLayout(intFraGra.getContentPane());
        intFraGra.getContentPane().setLayout(intFraGraLayout);
        intFraGraLayout.setHorizontalGroup(
            intFraGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        intFraGraLayout.setVerticalGroup(
            intFraGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(intFraGra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intFraGra)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intFraGra)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 590, 460));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(69, 21, 92));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recorridos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 230, 190, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        btnPut.setBackground(new java.awt.Color(18, 47, 63));
        btnPut.setForeground(new java.awt.Color(255, 255, 255));
        btnPut.setText("Insertar");
        btnPut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPutActionPerformed(evt);
            }
        });

        btnPre.setBackground(new java.awt.Color(18, 47, 63));
        btnPre.setForeground(new java.awt.Color(255, 255, 255));
        btnPre.setText("PreOrden");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnIn.setBackground(new java.awt.Color(18, 47, 63));
        btnIn.setForeground(new java.awt.Color(255, 255, 255));
        btnIn.setText("InOrden");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnPos.setBackground(new java.awt.Color(18, 47, 63));
        btnPos.setForeground(new java.awt.Color(255, 255, 255));
        btnPos.setText("PostOrden");
        btnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosActionPerformed(evt);
            }
        });

        btnSal.setBackground(new java.awt.Color(18, 47, 63));
        btnSal.setForeground(new java.awt.Color(255, 255, 255));
        btnSal.setText("Salir");
        btnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalActionPerformed(evt);
            }
        });

        txtDat.setBackground(new java.awt.Color(126, 181, 79));
        txtDat.setForeground(new java.awt.Color(255, 255, 255));
        txtDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatActionPerformed(evt);
            }
        });

        btnDel.setText("Borrar Nodo");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDat, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSal)
                        .addGap(167, 167, 167)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPut)
                            .addComponent(txtDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPre)
                            .addComponent(btnIn)
                            .addComponent(btnPos)))
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSal)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 590, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BinarySearchTree/GUI/fondoprogramaUPP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String haul = this.manager.InOrder();
        this.jTextArea1.setText("");
        this.jTextArea1.setText(haul);
    }                                     

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String haul = this.manager.preOrder();
        this.jTextArea1.setText("");
        this.jTextArea1.setText(haul);
    }                                      

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt) {                                       
        System.exit(0);
    }                                      

    private void btnPutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String datums = this.txtDat.getText();
        if(checkNumber(datums)){
            int datum = Integer.parseInt(datums);
            this.manager.putInNode(datum);
            grahp();
            buttons(true);
        } else isntAnInteger();
    }                                      

    private void btnPosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String haul = this.manager.postOrder();
        this.jTextArea1.setText("");
        this.jTextArea1.setText(haul);
    }                                      

    private void txtDatActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String datums = this.txtDat.getText();
        if(checkNumber(datums)){
            int datum = Integer.parseInt(datums);
            this.manager.putInNode(datum);
            grahp();
            buttons(true);
            this.txtDat.setText("");
            this.txtDat.requestFocus();
        } else isntAnInteger();
    }                                      

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String datums = JOptionPane.showInputDialog(this, "Inserte el nodo a borrar", "Eliminación de un nodo", JOptionPane.INFORMATION_MESSAGE);
        if(checkNumber(datums)){
            int datum = Integer.parseInt(datums);
            this.manager.putOffNode(datum);
            grahp();
        } else isntAnInteger();
    }                                      
     public static boolean checkNumber(String cadena){
        boolean result;
        try{
        Integer.parseInt(cadena);
        result = true;
        } catch (NumberFormatException excepcion){
        result = false;
        }
        return result;
    }
    public void isntAnInteger(){
    JOptionPane.showMessageDialog(this, "Debe de insertar un valor numérico entero", "Error", JOptionPane.ERROR_MESSAGE);
    }
    private void buttons(boolean key){
        this.btnPre.setVisible(key);
        this.btnIn.setVisible(key);
        this.btnPos.setVisible(key);
    }
    public void grahp(){
        this.drawTreeAgain();
    }
    private void drawTreeAgain(){
        this.jDesktopPane1.removeAll();
        Rectangle size = this.intFraGra.getBounds();
        this.intFraGra = null;
        this.intFraGra = new JInternalFrame("Graficación del Árbol Binario de Búsqueda", true);
        this.jDesktopPane1.add(this.intFraGra, BorderLayout.CENTER);
        this.intFraGra.setVisible(true);
        this.intFraGra.setBounds(size);
        this.intFraGra.setEnabled(false);
        this.intFraGra.add(this.manager.getDraw(), BorderLayout.CENTER);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnPos;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPut;
    private javax.swing.JButton btnSal;
    private javax.swing.JInternalFrame intFraGra;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDat;
    // End of variables declaration                   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree.GUI;

import BinarySearchTree.util.BinarySearchTreeManager;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Víctor Manuel
 */
public class Main extends javax.swing.JFrame {
    private BinarySearchTreeManager manager = new BinarySearchTreeManager();
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        buttons(false);
        this.txtDat.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        intFraGra = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnPut = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnPos = new javax.swing.JButton();
        btnSal = new javax.swing.JButton();
        txtDat = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        intFraGra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        intFraGra.setVisible(true);

        javax.swing.GroupLayout intFraGraLayout = new javax.swing.GroupLayout(intFraGra.getContentPane());
        intFraGra.getContentPane().setLayout(intFraGraLayout);
        intFraGraLayout.setHorizontalGroup(
            intFraGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        intFraGraLayout.setVerticalGroup(
            intFraGraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(intFraGra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intFraGra)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intFraGra)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 590, 460));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(69, 21, 92));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recorridos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 230, 190, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        btnPut.setBackground(new java.awt.Color(18, 47, 63));
        btnPut.setForeground(new java.awt.Color(255, 255, 255));
        btnPut.setText("Insertar");
        btnPut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPutActionPerformed(evt);
            }
        });

        btnPre.setBackground(new java.awt.Color(18, 47, 63));
        btnPre.setForeground(new java.awt.Color(255, 255, 255));
        btnPre.setText("PreOrden");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnIn.setBackground(new java.awt.Color(18, 47, 63));
        btnIn.setForeground(new java.awt.Color(255, 255, 255));
        btnIn.setText("InOrden");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnPos.setBackground(new java.awt.Color(18, 47, 63));
        btnPos.setForeground(new java.awt.Color(255, 255, 255));
        btnPos.setText("PostOrden");
        btnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosActionPerformed(evt);
            }
        });

        btnSal.setBackground(new java.awt.Color(18, 47, 63));
        btnSal.setForeground(new java.awt.Color(255, 255, 255));
        btnSal.setText("Salir");
        btnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalActionPerformed(evt);
            }
        });

        txtDat.setBackground(new java.awt.Color(126, 181, 79));
        txtDat.setForeground(new java.awt.Color(255, 255, 255));
        txtDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatActionPerformed(evt);
            }
        });

        btnDel.setText("Borrar Nodo");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDat, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSal)
                        .addGap(167, 167, 167)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPut)
                            .addComponent(txtDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPre)
                            .addComponent(btnIn)
                            .addComponent(btnPos)))
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSal)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 590, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BinarySearchTree/GUI/fondoprogramaUPP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        String haul = this.manager.InOrder();
        this.jTextArea1.setText("");
        this.jTextArea1.setText(haul);
    }//GEN-LAST:event_btnInActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        String haul = this.manager.preOrder();
        this.jTextArea1.setText("");
        this.jTextArea1.setText(haul);
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalActionPerformed

    private void btnPutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPutActionPerformed
        String datums = this.txtDat.getText();
        if(checkNumber(datums)){
            int datum = Integer.parseInt(datums);
            this.manager.putInNode(datum);
            grahp();
            buttons(true);
        } else isntAnInteger();
    }//GEN-LAST:event_btnPutActionPerformed

    private void btnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosActionPerformed
        String haul = this.manager.postOrder();
        this.jTextArea1.setText("");
        this.jTextArea1.setText(haul);
    }//GEN-LAST:event_btnPosActionPerformed

    private void txtDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatActionPerformed
        String datums = this.txtDat.getText();
        if(checkNumber(datums)){
            int datum = Integer.parseInt(datums);
            this.manager.putInNode(datum);
            grahp();
            buttons(true);
            this.txtDat.setText("");
            this.txtDat.requestFocus();
        } else isntAnInteger();
    }//GEN-LAST:event_txtDatActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        String datums = JOptionPane.showInputDialog(this, "Inserte el nodo a borrar", "Eliminación de un nodo", JOptionPane.INFORMATION_MESSAGE);
        if(checkNumber(datums)){
            int datum = Integer.parseInt(datums);
            this.manager.putOffNode(datum);
            grahp();
        } else isntAnInteger();
    }//GEN-LAST:event_btnDelActionPerformed
     public static boolean checkNumber(String cadena){
        boolean result;
        try{
        Integer.parseInt(cadena);
        result = true;
        } catch (NumberFormatException excepcion){
        result = false;
        }
        return result;
    }
    public void isntAnInteger(){
    JOptionPane.showMessageDialog(this, "Debe de insertar un valor numérico entero", "Error", JOptionPane.ERROR_MESSAGE);
    }
    private void buttons(boolean key){
        this.btnPre.setVisible(key);
        this.btnIn.setVisible(key);
        this.btnPos.setVisible(key);
    }
    public void grahp(){
        this.drawTreeAgain();
    }
    private void drawTreeAgain(){
        this.jDesktopPane1.removeAll();
        Rectangle size = this.intFraGra.getBounds();
        this.intFraGra = null;
        this.intFraGra = new JInternalFrame("Graficación del Árbol Binario de Búsqueda", true);
        this.jDesktopPane1.add(this.intFraGra, BorderLayout.CENTER);
        this.intFraGra.setVisible(true);
        this.intFraGra.setBounds(size);
        this.intFraGra.setEnabled(false);
        this.intFraGra.add(this.manager.getDraw(), BorderLayout.CENTER);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnPos;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPut;
    private javax.swing.JButton btnSal;
    private javax.swing.JInternalFrame intFraGra;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDat;
    // End of variables declaration//GEN-END:variables
}
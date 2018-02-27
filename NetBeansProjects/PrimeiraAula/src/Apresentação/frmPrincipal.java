
package Apresentação;


public class frmPrincipal extends javax.swing.JFrame
{

    public frmPrincipal()
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPrimeiroNumero = new javax.swing.JLabel();
        txfPrimeiroNumero = new javax.swing.JTextField();
        lblSegundoNumero = new javax.swing.JLabel();
        txfSegundoNumero = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        btnSomar1 = new javax.swing.JButton();
        btnSomar2 = new javax.swing.JButton();
        btnSomar3 = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Somar dois números");

        lblPrimeiroNumero.setText("Digite o primeiro número");

        lblSegundoNumero.setText("Digite o segundo número");

        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomarActionPerformed(evt);
            }
        });

        btnSomar1.setText("-");
        btnSomar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomar1ActionPerformed(evt);
            }
        });

        btnSomar2.setText("*");
        btnSomar2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomar2ActionPerformed(evt);
            }
        });

        btnSomar3.setText("/");
        btnSomar3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txfPrimeiroNumero)
                        .addComponent(txfSegundoNumero)
                        .addComponent(lblPrimeiroNumero, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSegundoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSomar)
                                .addComponent(btnSomar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSomar3)
                                .addComponent(btnSomar1))
                            .addGap(8, 8, 8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimeiroNumero)
                .addGap(13, 13, 13)
                .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblSegundoNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSomar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSomar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSomar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomarActionPerformed
    {//GEN-HEADEREND:event_btnSomarActionPerformed
        
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 + n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSomar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomar1ActionPerformed
    {//GEN-HEADEREND:event_btnSomar1ActionPerformed
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 - n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSomar1ActionPerformed

    private void btnSomar2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomar2ActionPerformed
    {//GEN-HEADEREND:event_btnSomar2ActionPerformed
           Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 * n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSomar2ActionPerformed

    private void btnSomar3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomar3ActionPerformed
    {//GEN-HEADEREND:event_btnSomar3ActionPerformed
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        n1 = Double.parseDouble(txfPrimeiroNumero.getText());
        n2 = Double.parseDouble(txfSegundoNumero.getText());
        resultado = n1 / n2;
        lblResultado.setText(resultado.toString());
    }//GEN-LAST:event_btnSomar3ActionPerformed

   
    public static void main(String args[])
    {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSomar1;
    private javax.swing.JButton btnSomar2;
    private javax.swing.JButton btnSomar3;
    private javax.swing.JLabel lblPrimeiroNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundoNumero;
    private javax.swing.JTextField txfPrimeiroNumero;
    private javax.swing.JTextField txfSegundoNumero;
    // End of variables declaration//GEN-END:variables
}

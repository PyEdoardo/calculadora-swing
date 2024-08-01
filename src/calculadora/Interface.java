/*
 * @Edoardo Tombolesi, 2024
 * Permitido a distribuição apenas mantendo esse header, de acordo com a licensa do projeto.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;
import javax.swing.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
/**
 *
 * @author edoar
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    int base;
    int baseFinal;
    double numeroConverter; 
            
    public Interface() {
        initComponents();
        setTitle("Calculadora de Bases by Edoardo");
    }

    /**
     * Esse método chama o construtor da classe, e inicia o form.
     * EM CASO DE UTILIZAÇÃO DO NETBEANS, NÃO MODIFIQUE O CONSTRUTOR, pois o NETBEANS irá regenerar o código.
     */
    @SuppressWarnings("unchecked")
    public int pegarBase(int base){
        //rotina para trocar o índice do box, pela base de fato, adicionar mais bases aqui.
        // Índices de conversão: 0 Decimal, 1 Binário, 2 Octal, 3 Hexadecimal.
        //rotina para trocar a base inicial.
        switch (base){
            case 0:
                return 10;
            case 1:
                return 2;
            case 2:
                return 8;
            case 3:
                return 16;
            default:
                throw new IllegalArgumentException("ìndice de base não suportado " + base);
        }
    }
    public String conversaoBases(String numeroConverter,int base,int baseFinal){
        String resultado;
        String baseString;
        String baseFinalString;
        
        
        baseString = Integer.toString(pegarBase(base));
        baseFinalString = Integer.toString(pegarBase(baseFinal));
        
        // Converter base de origem para decimal.
        int numeroDecimal = Integer.parseInt(numeroConverter);
        //int StringNumeroDecimal = String.valueOf(numeroDecimal);
        
        //Converter de Decimal para a base desejada.
        resultado = Integer.toString(numeroDecimal, baseFinal);
        return resultado;
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        converterField = new javax.swing.JTextField();
        resultadoLabel = new javax.swing.JLabel();
        boxBaseFinal = new javax.swing.JComboBox<>();
        boxBaseInicial = new javax.swing.JComboBox<>();
        botaoConverter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        converterField.setText("Número a Converter");
        converterField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                converterFieldMouseClicked(evt);
            }
        });
        converterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterFieldActionPerformed(evt);
            }
        });

        resultadoLabel.setText("Resultado: ");

        boxBaseFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binário", "Octal", "Hexadecimal" }));
        boxBaseFinal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxBaseFinalItemStateChanged(evt);
            }
        });
        boxBaseFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBaseFinalActionPerformed(evt);
            }
        });

        boxBaseInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binário", "Octal", "Hexadecimal" }));
        boxBaseInicial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxBaseInicialItemStateChanged(evt);
            }
        });
        boxBaseInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBaseInicialActionPerformed(evt);
            }
        });

        botaoConverter.setText("Converter");
        botaoConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(converterField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(boxBaseInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(botaoConverter)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxBaseFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(converterField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxBaseFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxBaseInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConverter))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxBaseInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBaseInicialActionPerformed
        
        
    }//GEN-LAST:event_boxBaseInicialActionPerformed

    private void converterFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_converterFieldMouseClicked
        // Rotina para limpar a tela de conversão.
        converterField.setText("");
    }//GEN-LAST:event_converterFieldMouseClicked

    private void boxBaseInicialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxBaseInicialItemStateChanged
        // Índices de conversão: 0 Decimal, 1 Binário, 2 Octal, 3 Hexadecimal.
        base =  boxBaseInicial.getSelectedIndex();
    }//GEN-LAST:event_boxBaseInicialItemStateChanged

    private void boxBaseFinalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxBaseFinalItemStateChanged
        // Índices de conversão: 0 Decimal, 1 Binário, 2 Octal, 3 Hexadecimal.
        baseFinal = boxBaseFinal.getSelectedIndex();
    }//GEN-LAST:event_boxBaseFinalItemStateChanged

    private void converterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_converterFieldActionPerformed

    private void botaoConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConverterActionPerformed
       // Botão que chama o método de conversão de base, e depois exibe no Field usando o método setText.
       String numero = converterField.getText();
       String res = conversaoBases(numero,base,baseFinal);
       resultadoLabel.setText(res);
        
    }//GEN-LAST:event_botaoConverterActionPerformed

    private void boxBaseFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBaseFinalActionPerformed

    }//GEN-LAST:event_boxBaseFinalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Esse try tenta trocar o "Look And Feel" do Swing, que no caso irá trocar para o tema FlatMacDarkLaf.
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatMacDarkLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Cria a Inteface inicializando o Form.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConverter;
    private javax.swing.JComboBox<String> boxBaseFinal;
    private javax.swing.JComboBox<String> boxBaseInicial;
    private javax.swing.JTextField converterField;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Programa.Pjuego;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author john_
 */


public final class Ventana extends javax.swing.JFrame {
    
    private    Pjuego L = new Pjuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    static int puntaje = 0;
   
    /**
     *  la ventana se maximixa
     */
    public Ventana() {    
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        Ocartas();
    }

    /**
     * Creamos el metodo 
     * para cargar las immagenes de 
     * las cartas 
     * aleatoriamente 
     */
    public void Ocartas(){
    
    int [] car =L.getCardNumbers();
        btn1.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[0]+".jpeg")));
        btn2.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[1]+".jpeg")));
        btn3.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[2]+".jpeg")));
        btn4.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[3]+".jpeg")));
        btn5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/f"+car[4]+".jpeg")));
        btn6.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[5]+".jpeg")));
        btn7.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[6]+".jpeg")));
        btn8.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[7]+".jpeg")));
        btn9.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[8]+".jpeg")));
        btn10.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[9]+".jpeg")));
        btn11.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[10]+".jpeg")));
        btn12.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/f"+car[11]+".jpeg")));
       
    }
    
    
    /**
     * Metodo de estados de los botones 
     */
     private void Habilitarbtn (JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            Ganar();
        }
    }
     /**
      * Metodo para comparar 
      * las cartas 
      */
     
     
     private  void comparar() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10 ) puntaje -= 10;
            }
            caraUp = false;
        }
    }
     /**
      * boton de reinicio 
      */
     
         private void reiniciar() {
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
       
        primerc = false;
        caraUp = false;
        puntaje = 0;
        
         }
         
          private void Ganar() {
              
                if(!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() && !btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled() && 
                !btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled() && !btn10.isEnabled() && !btn11.isEnabled() && 
                !btn12.isEnabled() ) {
                    
         /**
     * muestra el otro nivel del juego 
     * muetra otra ventana 
     * la hace visible
     * ciierra la ventana y abre otra 
     */
                      Nivel1 niv = new Nivel1();
                       niv.setVisible(true);
                       dispose();
                    
                    
            JOptionPane.showMessageDialog(this, "Felicidades, has pasado al siguiente nivel . Su puntaje es: " +puntaje, " ", JOptionPane.INFORMATION_MESSAGE);
        }
                }
    
              
              
          
          
       


     
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btnRe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIDACTY MEMORY");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Engravers MT", 2, 18)); // NOI18N
        setIconImages(null);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIDACTY MEMORY");
        jLabel2.setAutoscrolls(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 1222, -1));

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 1, true));

        btn1.setForeground(new java.awt.Color(51, 255, 51));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setFocusable(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setForeground(new java.awt.Color(51, 255, 51));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setFocusable(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setForeground(new java.awt.Color(51, 255, 51));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setFocusable(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setForeground(new java.awt.Color(51, 255, 51));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setFocusable(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setForeground(new java.awt.Color(51, 255, 51));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setFocusable(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setForeground(new java.awt.Color(51, 255, 51));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setFocusable(false);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setForeground(new java.awt.Color(51, 255, 51));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setFocusable(false);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setForeground(new java.awt.Color(51, 255, 51));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setFocusable(false);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setForeground(new java.awt.Color(51, 255, 51));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setFocusable(false);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setForeground(new java.awt.Color(51, 255, 51));
        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn10.setBorder(null);
        btn10.setBorderPainted(false);
        btn10.setContentAreaFilled(false);
        btn10.setFocusable(false);
        btn10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn10MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setForeground(new java.awt.Color(51, 255, 51));
        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn11.setBorder(null);
        btn11.setBorderPainted(false);
        btn11.setContentAreaFilled(false);
        btn11.setFocusable(false);
        btn11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setForeground(new java.awt.Color(51, 255, 51));
        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.jpeg"))); // NOI18N
        btn12.setBorder(null);
        btn12.setBorderPainted(false);
        btn12.setContentAreaFilled(false);
        btn12.setFocusable(false);
        btn12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta1.jpeg"))); // NOI18N
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn12MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1)
                    .addComponent(btn5)
                    .addComponent(btn9))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6)
                    .addComponent(btn5)
                    .addComponent(btn7)
                    .addComponent(btn8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn10)
                    .addComponent(btn9)
                    .addComponent(btn11)
                    .addComponent(btn12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 62, -1, -1));

        btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Re.jpeg"))); // NOI18N
        btnRe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 0)));
        btnRe.setContentAreaFilled(false);
        btnRe.setFocusable(false);
        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReActionPerformed(evt);
            }
        });
        getContentPane().add(btnRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 572, -1, 57));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Encuentra las parejas de la familia!..");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 266, 556, 56));

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("La familia ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 166, 556, 94));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Habilitarbtn ( btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Habilitarbtn ( btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       Habilitarbtn ( btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Habilitarbtn ( btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
      Habilitarbtn ( btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       Habilitarbtn ( btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
      Habilitarbtn ( btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
      Habilitarbtn ( btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        Habilitarbtn ( btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
         Habilitarbtn ( btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
       Habilitarbtn ( btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         Habilitarbtn ( btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
      comparar();
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
       comparar();
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
      comparar();
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
         comparar();
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
         comparar();
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
         comparar();
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
        comparar();
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited
        comparar();
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited
        comparar();
    }//GEN-LAST:event_btn9MouseExited

    private void btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseExited
         comparar();
    }//GEN-LAST:event_btn10MouseExited

    private void btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseExited
        comparar();
    }//GEN-LAST:event_btn11MouseExited

    private void btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseExited
        comparar();
    }//GEN-LAST:event_btn12MouseExited

    private void btnReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnRe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Command.Invoker;
import Command.CreateWagonsCommand;
import Command.MoveWagonCommand;
import Command.NewPlayersCommand;
import Control.GameControl;
import Control.GameImplementation;
import Control.Observer;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class NewMain extends javax.swing.JFrame implements Observer {

    public NewMain() {
        this.ci = new Invoker();
        this.gameCtrl = new GameImplementation();
        this.gameCtrl.addObserver(this);
        initComponents();

    }

    public Invoker getCi() {
        return ci;
    }

    public void setCi(Invoker ci) {
        this.ci = ci;
    }

    public GameControl getGameCtrl() {
        return gameCtrl;
    }

    public void setGameCtrl(GameControl gameCtrl) {
        this.gameCtrl = gameCtrl;
    }

    public void newPlayer(String player1Name, String player2Name) {
        ci.add(new NewPlayersCommand(gameCtrl, player1Name, player2Name));
        ci.execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB111 = new javax.swing.JButton();
        jB112 = new javax.swing.JButton();
        jB113 = new javax.swing.JButton();
        jB121 = new javax.swing.JButton();
        jB122 = new javax.swing.JButton();
        jB131 = new javax.swing.JButton();
        jB132 = new javax.swing.JButton();
        jB141 = new javax.swing.JButton();
        jB142 = new javax.swing.JButton();
        jB151 = new javax.swing.JButton();
        jB152 = new javax.swing.JButton();
        jB211 = new javax.swing.JButton();
        jB212 = new javax.swing.JButton();
        jB221 = new javax.swing.JButton();
        jB222 = new javax.swing.JButton();
        jB231 = new javax.swing.JButton();
        jB232 = new javax.swing.JButton();
        jB241 = new javax.swing.JButton();
        jB251 = new javax.swing.JButton();
        jB252 = new javax.swing.JButton();
        jB311 = new javax.swing.JButton();
        jB312 = new javax.swing.JButton();
        jB313 = new javax.swing.JButton();
        jB321 = new javax.swing.JButton();
        jB322 = new javax.swing.JButton();
        jB331 = new javax.swing.JButton();
        jB332 = new javax.swing.JButton();
        jB341 = new javax.swing.JButton();
        jB342 = new javax.swing.JButton();
        jB351 = new javax.swing.JButton();
        jB352 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        wagonsE = new ArrayList<>();
        wagonsD = new ArrayList<>();
        componentsByName = new HashMap<>();
        componentsByName.put("1", jB1);
        componentsByName.put("2", jB2);
        componentsByName.put("3", jB3);
        componentsByName.put("4", jB4);
        componentsByName.put("5", jB5);
        componentsByName.put("6", jB6);
        componentsByName.put("7", jB7);
        componentsByName.put("8", jB8);
        componentsByName.put("9", jB9);
        componentsByName.put("10", jB10);
        componentsByName.put("111", jB111);
        componentsByName.put("112", jB112);
        componentsByName.put("113", jB113);
        componentsByName.put("121", jB121);
        componentsByName.put("122", jB122);
        componentsByName.put("131", jB131);
        componentsByName.put("132", jB132);
        componentsByName.put("141", jB141);
        componentsByName.put("142", jB142);
        componentsByName.put("151", jB151);
        componentsByName.put("152", jB152);

        wagonsE.add(jB1);
        wagonsE.add(jB2);
        wagonsE.add(jB3);
        wagonsE.add(jB4);
        wagonsE.add(jB5);
        wagonsD.add(jB6);
        wagonsD.add(jB7);
        wagonsD.add(jB8);
        wagonsD.add(jB9);
        wagonsD.add(jB10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jB1.setName("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        jB2.setName("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setName("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB4.setName("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setName("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setName("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        jB7.setName("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        jB8.setName("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        jB9.setName("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        jB10.setName("10");
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB111.setName("111");
        jB111.setText("111");
        jB111.setBackground(new java.awt.Color(0, 0, 0));
        jB111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB111ActionPerformed(evt);
            }
        });

        jB112.setName("112");
        jB112.setText("112");
        jB112.setBackground(new java.awt.Color(0, 0, 0));
        jB112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB112ActionPerformed(evt);
            }
        });

        jB113.setName("113");
        jB113.setText("113");
        jB113.setBackground(new java.awt.Color(0, 0, 0));
        jB113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB113ActionPerformed(evt);
            }
        });
        jB121.setName("121");
        jB121.setText("121");
        jB121.setBackground(new java.awt.Color(0, 0, 0));
        jB121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB121ActionPerformed(evt);
            }
        });
        jB122.setName("122");
        jB122.setText("122");
        jB122.setBackground(new java.awt.Color(0, 0, 0));
        jB122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB122ActionPerformed(evt);
            }
        });
        jB131.setName("131");
        jB131.setText("131");
        jB131.setBackground(new java.awt.Color(0, 0, 0));
        jB131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB131ActionPerformed(evt);
            }
        });
        jB132.setName("132");
        jB132.setText("132");
        jB132.setBackground(new java.awt.Color(0, 0, 0));
        jB132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB132ActionPerformed(evt);
            }
        });
        jB141.setName("141");
        jB141.setText("141");
        jB141.setBackground(new java.awt.Color(0, 0, 0));
        jB141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB141ActionPerformed(evt);
            }
        });
        jB142.setName("142");
        jB142.setText("142");
        jB142.setBackground(new java.awt.Color(0, 0, 0));
        jB142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB142ActionPerformed(evt);
            }
        });
        jB151.setName("151");
        jB151.setText("151");
        jB151.setBackground(new java.awt.Color(0, 0, 0));
        jB151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB151ActionPerformed(evt);
            }
        });
        jB152.setName("152");
        jB152.setText("152");
        jB152.setBackground(new java.awt.Color(0, 0, 0));
        jB152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB152ActionPerformed(evt);
            }
        });

        jB121.setBackground(new java.awt.Color(0, 0, 0));

        jB122.setBackground(new java.awt.Color(0, 0, 0));

        jB131.setBackground(new java.awt.Color(0, 0, 0));

        jB132.setBackground(new java.awt.Color(0, 0, 0));

        jB141.setBackground(new java.awt.Color(0, 0, 0));

        jB142.setBackground(new java.awt.Color(0, 0, 0));

        jB151.setBackground(new java.awt.Color(0, 0, 0));

        jB152.setBackground(new java.awt.Color(0, 0, 0));

        jB211.setBackground(new java.awt.Color(153, 153, 153));

        jB212.setBackground(new java.awt.Color(153, 153, 153));

        jB221.setBackground(new java.awt.Color(153, 153, 153));

        jB222.setBackground(new java.awt.Color(153, 153, 153));

        jB231.setBackground(new java.awt.Color(153, 153, 153));

        jB232.setBackground(new java.awt.Color(153, 153, 153));

        jB241.setBackground(new java.awt.Color(153, 153, 153));

        jB251.setBackground(new java.awt.Color(153, 153, 153));

        jB252.setBackground(new java.awt.Color(153, 153, 153));

        jB311.setBackground(new java.awt.Color(0, 0, 0));

        jB312.setBackground(new java.awt.Color(0, 0, 0));

        jB313.setBackground(new java.awt.Color(0, 0, 0));

        jB321.setBackground(new java.awt.Color(0, 0, 0));

        jB322.setBackground(new java.awt.Color(0, 0, 0));

        jB331.setBackground(new java.awt.Color(0, 0, 0));

        jB332.setBackground(new java.awt.Color(0, 0, 0));

        jB341.setBackground(new java.awt.Color(0, 0, 0));

        jB342.setBackground(new java.awt.Color(0, 0, 0));

        jB351.setBackground(new java.awt.Color(0, 0, 0));

        jB352.setBackground(new java.awt.Color(0, 0, 0));

        ci.add(new CreateWagonsCommand(gameCtrl, "D"));
        ci.execute();
        ci.add(new CreateWagonsCommand(gameCtrl, "E"));
        ci.execute();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Strada Romana");

        jLabel4.setText("Placar");

        jLabel5.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jB113, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jB122, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jB112, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jB111, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jB121, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addGap(20, 20, 20)
                                                                                                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(36, 36, 36)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(388, 388, 388)
                                                                        .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                                                        .addGap(28, 28, 28))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jB131, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(91, 91, 91)
                                                                                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(19, 19, 19)
                                                                                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(22, 22, 22))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jB132, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(jB142, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                .addComponent(jB141, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                .addComponent(jButton56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jB152, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jB151, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jB212, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jB211, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jB222, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jB221, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(88, 88, 88)
                                                                                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jB232, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                .addComponent(jB231, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(20, 20, 20)
                                                                                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jButton58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jB241, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jB252, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jB251, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(19, 19, 19)
                                                                                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(440, 440, 440)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(84, 84, 84)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(118, 118, 118)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4))))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jB313, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jB312, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jB311, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jB322, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB321, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(19, 19, 19)
                                                                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jB332, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB331, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jB342, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB341, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton60, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                                                        .addComponent(jButton61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jB352, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jB351, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jB311, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jB312, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jB313, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addGap(61, 61, 61)
                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jButton52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addComponent(jButton54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(jB321, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jB322, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(jB331, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jB332, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(jB351, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jB352, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(28, 28, 28)
                                                                                        .addComponent(jB341, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jB342, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(32, 32, 32))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(69, 69, 69)
                                                                                .addComponent(jB131, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jB132, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jB111, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jB112, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jB113, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jButton47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB221, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB222, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB231, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB232, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB251, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB252, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                        .addGap(43, 43, 43)
                                                                                                                        .addComponent(jB211, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                        .addComponent(jB212, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                        .addGap(36, 36, 36)
                                                                                                                        .addComponent(jB241, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                .addComponent(jB151, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jB152, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB141, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB142, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB121, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB122, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(3, 3, 3)))))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(25, 25, 25)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(7, 7, 7)))))
                                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 22, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>    

    private void setIconD(ArrayList<Integer> numeros, ArrayList<JButton> jButtonE, ArrayList<JButton> jButtonD) {

        for (int i = 0; i < 5; i++) {
            if (numeros.get(i) > 5) {
                jButtonD.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + numeros.get(i) + ".png")));
            } else {
                jButtonE.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + numeros.get(i) + ".png")));
            }
        }
    }

    public void wagonCheck(JButton jb) {
        if (jb.getIcon() == null && jButton1st == null) {
            JOptionPane.showMessageDialog(null, "Wagon Inválida");
        } else if (!(jb.getIcon() == null)) {
            jButton1st = jb;
        } else {
            jButton2nd = jb;
            ci.add(new MoveWagonCommand(gameCtrl, jButton1st.getName(), jButton2nd.getName()));
            ci.execute();

        }
    }

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB1);

    }

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB2);
    }

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB3);
    }

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB4);
    }

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB5);
    }

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jB111ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB111);
    }

    private void jB112ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB112);
    }

    private void jB113ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB113);
    }
    private void jB121ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB121);
    }
    private void jB122ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB122);
    }
    private void jB131ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB131);
    }
    private void jB132ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB132);
    }
    private void jB141ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB141);
    }
    private void jB142ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB142);
    }
    private void jB151ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB151);
    }
    private void jB152ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB152);
    }

    private JButton jButton1st;
    private JButton jButton2nd;

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
            java.util.logging.Logger.getLogger(NewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB111;
    private javax.swing.JButton jB112;
    private javax.swing.JButton jB113;
    private javax.swing.JButton jB121;
    private javax.swing.JButton jB122;
    private javax.swing.JButton jB131;
    private javax.swing.JButton jB132;
    private javax.swing.JButton jB141;
    private javax.swing.JButton jB142;
    private javax.swing.JButton jB151;
    private javax.swing.JButton jB152;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB211;
    private javax.swing.JButton jB212;
    private javax.swing.JButton jB221;
    private javax.swing.JButton jB222;
    private javax.swing.JButton jB231;
    private javax.swing.JButton jB232;
    private javax.swing.JButton jB241;
    private javax.swing.JButton jB251;
    private javax.swing.JButton jB252;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB311;
    private javax.swing.JButton jB312;
    private javax.swing.JButton jB313;
    private javax.swing.JButton jB321;
    private javax.swing.JButton jB322;
    private javax.swing.JButton jB331;
    private javax.swing.JButton jB332;
    private javax.swing.JButton jB341;
    private javax.swing.JButton jB342;
    private javax.swing.JButton jB351;
    private javax.swing.JButton jB352;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private ArrayList<JButton> wagonsE;
    private ArrayList<JButton> wagonsD;
    private Map<String, JButton> componentsByName;
    private Invoker ci;
    private GameControl gameCtrl;
    // End of variables declaration                   

    @Override
    public void notifyRandomizedWagons(ArrayList<Integer> numeros) {
        setIconD(numeros, wagonsE, wagonsD);
    }

    @Override
    public void notificaMovimentacaoConcluida(String wagonName, String wagonLocation) {
        System.out.println("Botão 1 = " + wagonName);
        System.out.println("Botão 2 = " + wagonLocation);

        (componentsByName.get(wagonLocation)).setIcon((componentsByName.get(wagonName)).getIcon());
        (componentsByName.get(wagonName)).setIcon(null);
        jButton1st = null;
    }

    @Override
    public void notificaPlayersCriados() {
        jLabel2.setText(gameCtrl.getPlayer1().getName());
        jLabel3.setText(gameCtrl.getPlayer2().getName());
    }
}

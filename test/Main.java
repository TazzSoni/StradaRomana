
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Command.Invoker;
import Command.CreateWagonsCommand;
import Command.EndRoundCommand;
import Command.MoveWagonCommand;
import Command.NewPlayersCommand;
import Command.SetActionTypeCommand;
import Command.TakeCubeCommand;
import Command.TakeWareCommand;
import Control.GameControl;
import Control.GameImplementation;
import Control.Observer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Main extends javax.swing.JFrame implements Observer {

    public Main() {
        this.ci = new Invoker();
        this.gameCtrl = new GameImplementation();
        this.gameCtrl.addObserver(this);
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);

    }

    public void setParâmetrosIniciais(String player1, String player2, boolean view) {
        newPlayer(player1, player2);
        setVisible(view);
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
        jB313 = new javax.swing.JButton();
        jB312 = new javax.swing.JButton();
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
        jBCube112 = new javax.swing.JButton();
        jBCube132 = new javax.swing.JButton();
        jBCube121 = new javax.swing.JButton();
        jBCube151 = new javax.swing.JButton();
        jBCube152 = new javax.swing.JButton();
        jBCube221 = new javax.swing.JButton();
        jBCube232 = new javax.swing.JButton();
        jBCube251 = new javax.swing.JButton();
        jBCube312 = new javax.swing.JButton();
        jBCube322 = new javax.swing.JButton();
        jBCube321 = new javax.swing.JButton();
        jBCube331 = new javax.swing.JButton();
        jBCube351 = new javax.swing.JButton();
        jBCube352 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabeP1Name = new javax.swing.JLabel();
        jLabeP2Name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelPlacarP2 = new javax.swing.JLabel();
        jLabelPlacarP1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelWTP1 = new javax.swing.JLabel();
        jLabelWTP2 = new javax.swing.JLabel();
        jBWare11 = new javax.swing.JButton();
        jBWare12 = new javax.swing.JButton();
        jBWare21 = new javax.swing.JButton();
        jBWare22 = new javax.swing.JButton();
        jBWare31 = new javax.swing.JButton();
        jBWare32 = new javax.swing.JButton();
        jBWagonTile = new javax.swing.JButton();
        jBWagonTile1P1 = new javax.swing.JButton();
        jBWagonTile2P1 = new javax.swing.JButton();
        jBWagonTile3P1 = new javax.swing.JButton();
        jBWagonTile3P2 = new javax.swing.JButton();
        jBWagonTile1P2 = new javax.swing.JButton();
        jBWagonTile2P2 = new javax.swing.JButton();
        jBFinalizaTurno = new javax.swing.JButton();
        jLJdV = new javax.swing.JLabel();
        jLJogadorVez = new javax.swing.JLabel();
        jLSsA = new javax.swing.JLabel();
        jComboAcao = new javax.swing.JComboBox<>();
        jBConfirmaAcao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboMovimento = new javax.swing.JComboBox<>();
        jLabelCoinsP1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelCoinsP2 = new javax.swing.JLabel();

        wagonsE = new ArrayList<>();
        wagonsD = new ArrayList<>();
        cubes = new ArrayList<>();
        wares = new ArrayList<>();
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
        componentsByName.put("152", jB152);
        componentsByName.put("211", jB211);
        componentsByName.put("212", jB212);
        componentsByName.put("221", jB221);
        componentsByName.put("222", jB222);
        componentsByName.put("231", jB231);
        componentsByName.put("232", jB232);
        componentsByName.put("241", jB241);
        componentsByName.put("251", jB251);
        componentsByName.put("252", jB252);
        componentsByName.put("311", jB311);
        componentsByName.put("312", jB312);
        componentsByName.put("313", jB313);
        componentsByName.put("321", jB321);
        componentsByName.put("322", jB322);
        componentsByName.put("331", jB331);
        componentsByName.put("332", jB332);
        componentsByName.put("341", jB341);
        componentsByName.put("342", jB342);
        componentsByName.put("351", jB351);
        componentsByName.put("352", jB352);
        componentsByName.put("ware11", jBWare11);
        componentsByName.put("ware12", jBWare12);
        componentsByName.put("ware21", jBWare21);
        componentsByName.put("ware22", jBWare22);
        componentsByName.put("ware31", jBWare31);
        componentsByName.put("ware32", jBWare32);
        componentsByName.put("cube112", jBCube112);
        componentsByName.put("cube121", jBCube121);
        componentsByName.put("cube132", jBCube132);
        componentsByName.put("cube151", jBCube151);
        componentsByName.put("cube152", jBCube152);
        componentsByName.put("cube221", jBCube221);
        componentsByName.put("cube232", jBCube232);
        componentsByName.put("cube251", jBCube251);
        componentsByName.put("cube312", jBCube312);
        componentsByName.put("cube321", jBCube321);
        componentsByName.put("cube322", jBCube322);
        componentsByName.put("cube331", jBCube331);
        componentsByName.put("cube351", jBCube351);
        componentsByName.put("cube352", jBCube352);
        componentsByName.put("wagonTile1P1", jBWagonTile1P1);
        componentsByName.put("wagonTile2P1", jBWagonTile2P1);
        componentsByName.put("wagonTile3P1", jBWagonTile3P1);
        componentsByName.put("wagonTile1P2", jBWagonTile1P2);
        componentsByName.put("wagonTile2P2", jBWagonTile2P2);
        componentsByName.put("wagonTile3P2", jBWagonTile3P2);

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

        cubes.add(jBCube112);
        cubes.add(jBCube121);
        cubes.add(jBCube132);
        cubes.add(jBCube151);
        cubes.add(jBCube152);
        cubes.add(jBCube221);
        cubes.add(jBCube232);
        cubes.add(jBCube251);
        cubes.add(jBCube312);
        cubes.add(jBCube321);
        cubes.add(jBCube322);
        cubes.add(jBCube331);
        cubes.add(jBCube351);
        cubes.add(jBCube352);

        wares.add(jBWare11);
        wares.add(jBWare12);
        wares.add(jBWare21);
        wares.add(jBWare22);
        wares.add(jBWare31);
        wares.add(jBWare32);

        jBWagonTile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wagonTile.png")));

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
                jB7ActionPerformed(evt);
            }
        });
        jB8.setName("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        jB9.setName("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        jB10.setName("10");
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });

        jB111.setName("111");
        //jB111.setText("111");
        jB111.setBackground(new java.awt.Color(0, 0, 0));
        jB111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB111ActionPerformed(evt);
            }
        });

        jB112.setName("112");
        //jB112.setText("112");
        jB112.setBackground(new java.awt.Color(0, 0, 0));
        jB112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB113ActionPerformed(evt);
            }
        });

        jB113.setName("113");
        //jB112.setText("112");
        jB113.setBackground(new java.awt.Color(0, 0, 0));
        jB113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB112ActionPerformed(evt);
            }
        });
        jB121.setName("121");
        // jB121.setText("121");
        jB121.setBackground(new java.awt.Color(0, 0, 0));
        jB121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB121ActionPerformed(evt);
            }
        });
        jB122.setName("122");
        // jB122.setText("122");
        jB122.setBackground(new java.awt.Color(0, 0, 0));
        jB122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB122ActionPerformed(evt);
            }
        });
        jB131.setName("131");
        // jB131.setText("131");
        jB131.setBackground(new java.awt.Color(0, 0, 0));
        jB131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB131ActionPerformed(evt);
            }
        });
        jB132.setName("132");
        //   jB132.setText("132");
        jB132.setBackground(new java.awt.Color(0, 0, 0));
        jB132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB132ActionPerformed(evt);
            }
        });
        jB141.setName("141");
        //   jB141.setText("141");
        jB141.setBackground(new java.awt.Color(0, 0, 0));
        jB141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB141ActionPerformed(evt);
            }
        });
        jB142.setName("142");
        // jB142.setText("142");
        jB142.setBackground(new java.awt.Color(0, 0, 0));
        jB142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB142ActionPerformed(evt);
            }
        });
        jB151.setName("151");
        //    jB151.setText("151");
        jB151.setBackground(new java.awt.Color(0, 0, 0));
        jB151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB151ActionPerformed(evt);
            }
        });
        jB152.setName("152");
        //   jB152.setText("152");
        jB152.setBackground(new java.awt.Color(0, 0, 0));
        jB152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB152ActionPerformed(evt);
            }
        });
        jB211.setName("211");
        //  jB211.setText("211");
        jB211.setBackground(new java.awt.Color(0, 0, 0));
        jB211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB211ActionPerformed(evt);
            }

        });
        jB212.setName("212");
        //  jB212.setText("212");
        jB212.setBackground(new java.awt.Color(0, 0, 0));
        jB212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB212ActionPerformed(evt);
            }

        });
        jB221.setName("221");
        //     jB221.setText("221");
        jB221.setBackground(new java.awt.Color(0, 0, 0));
        jB221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB221ActionPerformed(evt);
            }

        });
        jB222.setName("222");
        //     jB222.setText("222");
        jB222.setBackground(new java.awt.Color(0, 0, 0));
        jB222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB222ActionPerformed(evt);
            }

        });
        jB231.setName("231");
        //    jB231.setText("231");
        jB231.setBackground(new java.awt.Color(0, 0, 0));
        jB231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB231ActionPerformed(evt);
            }

        });
        jB232.setName("232");
        //   jB232.setText("232");
        jB232.setBackground(new java.awt.Color(0, 0, 0));
        jB232.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB232ActionPerformed(evt);
            }

        });

        jB241.setName("241");
        //     jB241.setText("241");
        jB241.setBackground(new java.awt.Color(0, 0, 0));
        jB241.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB241ActionPerformed(evt);
            }

        });
        jB251.setName("251");
        //       jB251.setText("251");
        jB251.setBackground(new java.awt.Color(0, 0, 0));
        jB251.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB251ActionPerformed(evt);
            }

        });
        jB252.setName("252");
        //     jB252.setText("252");
        jB252.setBackground(new java.awt.Color(0, 0, 0));
        jB252.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB252ActionPerformed(evt);
            }
        });
        jB311.setName("311");
        // jB311.setText("311");
        jB311.setBackground(new java.awt.Color(0, 0, 0));
        jB311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB311ActionPerformed(evt);
            }
        });
        //313
        jB313.setName("313");
        // jB313.setText("313");
        jB313.setBackground(new java.awt.Color(0, 0, 0));
        jB313.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB312ActionPerformed(evt);
            }
        });
        //312
        jB312.setName("312");
        //jB312.setText("312");
        jB312.setBackground(new java.awt.Color(0, 0, 0));
        jB312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB313ActionPerformed(evt);
            }
        });
        jB321.setName("321");
        //      jB321.setText("321");
        jB321.setBackground(new java.awt.Color(0, 0, 0));
        jB321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB321ActionPerformed(evt);
            }
        });
        jB322.setName("322");
        //     jB322.setText("322");
        jB322.setBackground(new java.awt.Color(0, 0, 0));
        jB322.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB322ActionPerformed(evt);
            }
        });
        jB331.setName("331");
        //     jB331.setText("331");
        jB331.setBackground(new java.awt.Color(0, 0, 0));
        jB331.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB331ActionPerformed(evt);
            }
        });
        jB332.setName("332");
        //    jB332.setText("332");
        jB332.setBackground(new java.awt.Color(0, 0, 0));
        jB332.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB332ActionPerformed(evt);
            }
        });
        jB341.setName("341");
        //    jB341.setText("341");
        jB341.setBackground(new java.awt.Color(0, 0, 0));
        jB341.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB341ActionPerformed(evt);
            }
        });
        jB342.setName("342");
        //     jB342.setText("342");
        jB342.setBackground(new java.awt.Color(0, 0, 0));
        jB342.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB342ActionPerformed(evt);
            }
        });
        jB351.setName("351");
        //    jB351.setText("351");
        jB351.setBackground(new java.awt.Color(0, 0, 0));
        jB351.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB351ActionPerformed(evt);
            }
        });
        jB352.setName("352");
        //     jB352.setText("352");
        jB352.setBackground(new java.awt.Color(0, 0, 0));
        jB352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB352ActionPerformed(evt);
            }
        });
        jBCube112.setName("cube112");
        jBCube112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube113ActionPerformed(evt);
            }
        });
        jBCube121.setName("cube121");
        jBCube121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube121ActionPerformed(evt);
            }
        });
        jBCube132.setName("cube132");
        jBCube132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube132ActionPerformed(evt);
            }
        });
        jBCube151.setName("cube151");
        jBCube151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube151ActionPerformed(evt);
            }
        });
        jBCube152.setName("cube152");
        jBCube152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube152ActionPerformed(evt);
            }
        });
        jBCube221.setName("cube221");
        jBCube221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube221ActionPerformed(evt);
            }
        });
        jBCube232.setName("cube232");
        jBCube232.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube232ActionPerformed(evt);
            }
        });
        jBCube251.setName("cube251");
        jBCube251.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube251ActionPerformed(evt);
            }
        });
        jBCube312.setName("cube312");
        jBCube312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube313ActionPerformed(evt);
            }
        });
        jBCube321.setName("cube321");
        jBCube321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube321ActionPerformed(evt);
            }
        });
        jBCube322.setName("cube322");
        jBCube322.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube322ActionPerformed(evt);
            }
        });
        jBCube331.setName("cube331");
        jBCube331.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube331ActionPerformed(evt);
            }
        });
        jBCube351.setName("cube351");
        jBCube351.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube351ActionPerformed(evt);
            }
        });
        jBCube352.setName("cube352");
        jBCube352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCube352ActionPerformed(evt);
            }
        });
        jBWare11.setName("ware11");
        //    jBWare11.setText("ware11");
        jBWare11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWare1ActionPerformed(evt);
            }
        });
        jBWare12.setName("ware12");
        //    jBWare12.setText("ware12");
        jBWare12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWare2ActionPerformed(evt);
            }
        });
        jBWare21.setName("ware21");
        //     jBWare21.setText("ware21");
        jBWare21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWare3ActionPerformed(evt);
            }
        });
        jBWare22.setName("ware22");
        //    jBWare22.setText("ware22");
        jBWare22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWare4ActionPerformed(evt);
            }
        });
        jBWare31.setName("ware31");
        //    jBWare31.setText("ware31");
        jBWare31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWare5ActionPerformed(evt);
            }
        });
        jBWare32.setName("ware32");
        //    jBWare32.setText("ware32");
        jBWare32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWare6ActionPerformed(evt);
            }
        });
        jBWagonTile.setName("wagonTile");
        jBWagonTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWagonTileActionPerformed(evt);
            }
        });
        jBConfirmaAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmaAcaoActionPerformed(evt);
            }
        });
        jBFinalizaTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizaTurnoActionPerformed(evt);
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

        jB313.setBackground(new java.awt.Color(0, 0, 0));

        jB312.setBackground(new java.awt.Color(0, 0, 0));

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

        jLabel7.setText("Wagon Tiles jogador:");
        jLabel2.setText("Wagon Tiles jogador:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Strada Romana");

        jLabel4.setText("Placar");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));

        jLabel5.setText("X");

        jBFinalizaTurno.setText("Finalizar Turno");

        jLJdV.setText("Jogador da vez:");

        jLJogadorVez.setText("");
        jLJogadorVez.setFont(new java.awt.Font("Times New Roman", 0, 16));

        jLSsA.setText("Selecione sua ação");

        jComboAcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione", "Movimentar wagon", "Pegar wagon tile", "Passar a vez"}));

        jBConfirmaAcao.setText("Confirmar Ação");
        jLabel6.setText("Tipo de movimento");

        jComboMovimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione", "Normal", "Especial"}));

        jLabelCoinsP1.setText("0");
        jLabelCoinsP1.setFont(new java.awt.Font("Times New Roman", 0, 16));
        jLabelCoinsP2.setText("0");
        jLabelCoinsP2.setFont(new java.awt.Font("Times New Roman", 0, 16));

        jLabel8.setText("Moedas:");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel9.setText("Moedas:");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabeP1Name.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabeP2Name.setFont(new java.awt.Font("Times New Roman", 1, 24));

        jLabelPlacarP1.setText("0");
        jLabelPlacarP2.setText("0");

        jLabelPlacarP1.setFont(new java.awt.Font("Times New Roman", 0, 48));
        jLabelPlacarP2.setFont(new java.awt.Font("Times New Roman", 0, 48));

        jBFinalizaTurno.setBackground(Color.GREEN);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLJdV)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLJogadorVez))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLSsA)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jComboAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jComboMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jBWagonTile1P1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBWagonTile2P1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBWagonTile3P1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(207, 207, 207)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                                                .addComponent(jB112, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jB122, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jB113, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jB111, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jB121, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(20, 20, 20)
                                                                                                .addComponent(jBCube121, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(jBCube112, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabelWTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(276, 276, 276)
                                                                .addComponent(jLabelPlacarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel4)
                                                                                .addGap(115, 115, 115))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(14, 14, 14)
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabelPlacarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(41, 41, 41)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel9)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabelCoinsP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(342, 342, 342))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabeP2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jBWagonTile1P2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jBWagonTile2P2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jBWagonTile3P2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(jLabel7)
                                                                                        .addComponent(jLabelWTP2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(45, 45, 45))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(jBFinalizaTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jBConfirmaAcao))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGap(19, 19, 19)
                                                                                                                .addComponent(jBCube132, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(jBCube152, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(22, 22, 22))
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                .addComponent(jB131, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(91, 91, 91)
                                                                                                                                .addComponent(jBCube151, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                .addComponent(jB132, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                        .addComponent(jB142, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                                                        .addComponent(jB141, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                                                        .addComponent(jBWare11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                        .addComponent(jB152, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addComponent(jB151, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                .addGap(67, 67, 67)
                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                        .addComponent(jLabeP1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabelCoinsP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                                                .addGap(7, 7, 7)))
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
                                                                                                                .addComponent(jBCube221, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(jB232, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                        .addComponent(jB231, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGap(20, 20, 20)
                                                                                                                .addComponent(jBCube232, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addComponent(jBWare21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jB241, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jBWare22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jB252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jB251, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(19, 19, 19)
                                                                                                .addComponent(jBCube251, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jB312, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jB313, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jB311, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGap(20, 20, 20)
                                                                                                                .addComponent(jBCube312, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGap(22, 22, 22)
                                                                                                                .addComponent(jBCube322, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jBWagonTile, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jB322, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jB321, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addGap(19, 19, 19)
                                                                                                                                        .addComponent(jBCube321, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jB332, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jB331, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                .addComponent(jB342, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                                                .addComponent(jBWare31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                .addComponent(jB341, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                                                                                                .addComponent(jBWare32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(155, 155, 155)
                                                                                                .addComponent(jBCube331, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addComponent(jBWare12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jBCube351, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jB352, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jB351, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jBCube352, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabeP1Name)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabeP2Name)
                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(76, 76, 76))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabelWTP2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jBWagonTile1P2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBWagonTile2P2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBWagonTile3P2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelWTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jBWagonTile1P1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBWagonTile2P1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBWagonTile3P1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(8, 8, 8)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelPlacarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelPlacarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabelCoinsP2)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabelCoinsP1))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(69, 69, 69)
                                                                .addComponent(jB131, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jB132, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jBCube132, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jBWare11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jBWare21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                                                .addComponent(jB113, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jB112, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(jBCube221, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB221, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB222, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jB231, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                        .addComponent(jB232, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                                        .addComponent(jB241, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addGap(32, 32, 32)))
                                                                                                        .addComponent(jBCube232, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addGap(43, 43, 43)
                                                                                                        .addComponent(jB211, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jB212, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(jBCube121, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jBCube151, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                                                                .addComponent(jBCube152, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(3, 3, 3)))))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBCube112, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(jBWare12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(94, 94, 94)
                                                                .addComponent(jB311, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jB313, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jB312, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jBCube312, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(100, 100, 100)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jBCube321, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jBCube331, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addComponent(jBCube351, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBWare31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(49, 49, 49)
                                                                                .addComponent(jB341, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jB342, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jBCube322, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBCube352, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(43, 43, 43)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(39, 39, 39)
                                                        .addComponent(jBCube251, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jB251, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jB252, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(54, 54, 54)
                                                        .addComponent(jBWare22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(258, 258, 258)
                                                .addComponent(jBWare32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLJdV)
                                                        .addComponent(jLJogadorVez))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLSsA)
                                                                        .addComponent(jComboAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(4, 4, 4)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jComboMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jBWagonTile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jBConfirmaAcao)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBFinalizaTurno)))
                                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 22, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pack();
    }// </editor-fold>    

    private void setIcon(ArrayList<Integer> numeros, ArrayList<JButton> jButton) {
        for (int i = 0; i < 5; i++) {
            jButton.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + numeros.get(i) + ".png")));
        }
    }

    private void setWagonTileIcon(int posicao, String wagonTileName, int player) {
        String nome = "wagonTile" + posicao + "P" + player;
        (componentsByName.get(nome)).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + wagonTileName + ".png")));

    }

    private void setCubeColors(List<Color> cores, ArrayList<JButton> jButton) {
        for (int i = 0; i < jButton.size(); i++) {
            jButton.get(i).setBackground(cores.get(i));
            gameCtrl.setCubeLocation(jButton.get(i).getName(), jButton.get(i).getBackground());
        }
    }

    private void setWareColors(List<Color> cores, ArrayList<JButton> jButton) {
        for (int i = 0; i < jButton.size(); i++) {
            jButton.get(i).setBackground(cores.get(i));
            gameCtrl.setWareLocation(jButton.get(i).getName(), jButton.get(i).getBackground());
        }
    }

    public void wagonCheck(JButton jb) {
        ci.add(new MoveWagonCommand(gameCtrl, jb.getName()));
        ci.execute();
    }

    public void takeCube(JButton jb) {
        ci.add(new TakeCubeCommand(gameCtrl, jb.getName()));
        ci.execute();
    }

    public void takeWare(JButton jb) {
        ci.add(new TakeWareCommand(gameCtrl, jb.getName()));
        ci.execute();
    }

    public void refreshCoinsScore(int label1, int label2) {
        jLabelCoinsP1.setText("" + label1);
        jLabelCoinsP2.setText("" + label2);

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
        wagonCheck(jB6);
    }

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB7);
    }

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB8);
    }

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB9);
    }

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB10);
    }

    private void jB111ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB111);
    }

    private void jB112ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB113);
    }

    private void jB113ActionPerformed(java.awt.event.ActionEvent evt) {
        wagonCheck(jB112);
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

    private void jB211ActionPerformed(ActionEvent evt) {
        wagonCheck(jB211);
    }

    private void jB212ActionPerformed(ActionEvent evt) {
        wagonCheck(jB212);
    }

    private void jB221ActionPerformed(ActionEvent evt) {
        wagonCheck(jB221);
    }

    private void jB222ActionPerformed(ActionEvent evt) {
        wagonCheck(jB222);
    }

    private void jB231ActionPerformed(ActionEvent evt) {
        wagonCheck(jB231);
    }

    private void jB232ActionPerformed(ActionEvent evt) {
        wagonCheck(jB232);
    }

    private void jB241ActionPerformed(ActionEvent evt) {
        wagonCheck(jB241);
    }

    private void jB251ActionPerformed(ActionEvent evt) {
        wagonCheck(jB251);
    }

    private void jB252ActionPerformed(ActionEvent evt) {
        wagonCheck(jB252);
    }

    private void jB311ActionPerformed(ActionEvent evt) {
        wagonCheck(jB311);
    }

    private void jB312ActionPerformed(ActionEvent evt) {
        wagonCheck(jB313);
    }

    private void jB313ActionPerformed(ActionEvent evt) {
        wagonCheck(jB312);
    }

    private void jB321ActionPerformed(ActionEvent evt) {
        wagonCheck(jB321);
    }

    private void jB322ActionPerformed(ActionEvent evt) {
        wagonCheck(jB322);
    }

    private void jB331ActionPerformed(ActionEvent evt) {
        wagonCheck(jB331);
    }

    private void jB332ActionPerformed(ActionEvent evt) {
        wagonCheck(jB332);
    }

    private void jB341ActionPerformed(ActionEvent evt) {
        wagonCheck(jB341);
    }

    private void jB342ActionPerformed(ActionEvent evt) {
        wagonCheck(jB342);
    }

    private void jB351ActionPerformed(ActionEvent evt) {
        wagonCheck(jB351);
    }

    private void jB352ActionPerformed(ActionEvent evt) {
        wagonCheck(jB352);
    }

    private void jBCube113ActionPerformed(ActionEvent evt) {
        takeCube(jBCube112);
    }

    private void jBCube121ActionPerformed(ActionEvent evt) {
        takeCube(jBCube121);
    }

    private void jBCube132ActionPerformed(ActionEvent evt) {
        takeCube(jBCube132);
    }

    private void jBCube151ActionPerformed(ActionEvent evt) {
        takeCube(jBCube151);

    }

    private void jBCube152ActionPerformed(ActionEvent evt) {
        takeCube(jBCube152);

    }

    private void jBCube221ActionPerformed(ActionEvent evt) {
        takeCube(jBCube221);

    }

    private void jBCube232ActionPerformed(ActionEvent evt) {
        takeCube(jBCube232);

    }

    private void jBCube251ActionPerformed(ActionEvent evt) {
        takeCube(jBCube251);

    }

    private void jBCube313ActionPerformed(ActionEvent evt) {
        takeCube(jBCube312);

    }

    private void jBCube321ActionPerformed(ActionEvent evt) {
        takeCube(jBCube321);

    }

    private void jBCube331ActionPerformed(ActionEvent evt) {
        takeCube(jBCube331);

    }

    private void jBCube322ActionPerformed(ActionEvent evt) {
        takeCube(jBCube322);

    }

    private void jBCube351ActionPerformed(ActionEvent evt) {
        takeCube(jBCube351);

    }

    private void jBCube352ActionPerformed(ActionEvent evt) {
        takeCube(jBCube352);

    }

    private void jBWare1ActionPerformed(ActionEvent evt) {
        takeWare(jBWare11);
    }

    private void jBWare2ActionPerformed(ActionEvent evt) {
        takeWare(jBWare12);
    }

    private void jBWare3ActionPerformed(ActionEvent evt) {
        takeWare(jBWare21);
    }

    private void jBWare4ActionPerformed(ActionEvent evt) {
        takeWare(jBWare22);
    }

    private void jBWare5ActionPerformed(ActionEvent evt) {
        takeWare(jBWare31);
    }

    private void jBWare6ActionPerformed(ActionEvent evt) {
        takeWare(jBWare32);
    }

    private void jBWagonTileActionPerformed(ActionEvent evt) {
        telaWagonTile = new ChooseWagonTile(gameCtrl.getWagonTile().getArray().get(2), gameCtrl, ci);
        telaWagonTile.setVisible(true);
    }

    private void jBConfirmaAcaoActionPerformed(ActionEvent evt) {
        ci.add(new SetActionTypeCommand(gameCtrl, jComboAcao.getSelectedItem().toString()));
        ci.execute();
    }

    private void jBFinalizaTurnoActionPerformed(ActionEvent evt) {
        ci.add(new EndRoundCommand(gameCtrl));
        ci.execute();
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
    private javax.swing.JButton jB313;
    private javax.swing.JButton jB312;
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
    private javax.swing.JButton jBCube112;
    private javax.swing.JButton jBCube132;
    private javax.swing.JButton jBCube121;
    private javax.swing.JButton jBCube151;
    private javax.swing.JButton jBCube152;
    private javax.swing.JButton jBCube221;
    private javax.swing.JButton jBCube232;
    private javax.swing.JButton jBCube251;
    private javax.swing.JButton jBCube312;
    private javax.swing.JButton jBCube322;
    private javax.swing.JButton jBCube321;
    private javax.swing.JButton jBCube331;
    private javax.swing.JButton jBCube351;
    private javax.swing.JButton jBCube352;
    private javax.swing.JButton jBWare11;
    private javax.swing.JButton jBWare12;
    private javax.swing.JButton jBWare21;
    private javax.swing.JButton jBWare22;
    private javax.swing.JButton jBWare31;
    private javax.swing.JButton jBWare32;
    private javax.swing.JButton jBWagonTile;
    private javax.swing.JButton jBWagonTile1P1;
    private javax.swing.JButton jBWagonTile2P1;
    private javax.swing.JButton jBWagonTile3P1;
    private javax.swing.JButton jBWagonTile3P2;
    private javax.swing.JButton jBWagonTile1P2;
    private javax.swing.JButton jBWagonTile2P2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabeP1Name;
    private javax.swing.JLabel jLabeP2Name;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelWTP1;
    private javax.swing.JLabel jLabelWTP2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabelPlacarP2;
    private javax.swing.JLabel jLabelPlacarP1;
    private javax.swing.JLabel jLJdV;
    private javax.swing.JLabel jLJogadorVez;
    private javax.swing.JButton jBFinalizaTurno;
    private javax.swing.JLabel jLSsA;
    private javax.swing.JLabel jLabelCoinsP1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCoinsP2;
    private javax.swing.JComboBox<String> jComboAcao;
    private javax.swing.JButton jBConfirmaAcao;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jComboMovimento;
    private ArrayList<JButton> wagonsE;
    private ArrayList<JButton> wagonsD;
    private ArrayList<JButton> cubes;
    private ArrayList<JButton> wares;
    private Map<String, JButton> componentsByName;
    private Invoker ci;
    private GameControl gameCtrl;
    private ChooseWagonTile telaWagonTile;

    @Override
    public void notificaWaresTilesCriados(ArrayList<Integer> numeros) {

    }

    @Override
    public void notificaWaresTilesPego(String wagonTileName, String wagonTileMessage, int posicao, int player) {
        JOptionPane.showMessageDialog(null, wagonTileMessage);
        setWagonTileIcon(posicao, wagonTileName, player);
    }

    @Override
    public void notifyRandomizedWagonsE(ArrayList<Integer> numeros) {
        setIcon(numeros, wagonsE);
    }

    @Override
    public void notifyRandomizedWagonsD(ArrayList<Integer> numeros) {
        setIcon(numeros, wagonsD);
    }

    @Override
    public void notificaPlayersCriados() {
        jLabeP1Name.setText(gameCtrl.getPlayer1().getName());
        jLabeP2Name.setText(gameCtrl.getPlayer2().getName());
        jLabelWTP1.setText(gameCtrl.getPlayer1().getName());
        jLabelWTP2.setText(gameCtrl.getPlayer2().getName());
        jLJogadorVez.setText(gameCtrl.getRoundPlayer());
        refreshCoinsScore(gameCtrl.getPlayer1().getCoins(), gameCtrl.getPlayer2().getCoins());
    }

    @Override
    public void notificaMovimentacaoConcluida(String wagonName, String wagonLocation, String stateText) {
        (componentsByName.get(wagonLocation)).setIcon((componentsByName.get(wagonName)).getIcon());
        (componentsByName.get(wagonName)).setIcon(null);
        JOptionPane.showMessageDialog(null, stateText);
    }

    @Override
    public void notificaAcaoFalhou(String stateText) {
        JOptionPane.showMessageDialog(null, stateText);
    }

    @Override
    public void notificaTipoDeAcaoDefinido(String actionDefinedMessage) {
        JOptionPane.showMessageDialog(null, actionDefinedMessage);

    }

    @Override
    public void notificaRoundFinalizado(String endRoundMesssage) {
        JOptionPane.showMessageDialog(null, endRoundMesssage);
        refreshCoinsScore(gameCtrl.getPlayer1().getCoins(), gameCtrl.getPlayer2().getCoins());
        jLJogadorVez.setText(gameCtrl.getRoundPlayer());
        jLabelPlacarP1.setText("" + gameCtrl.getPlayer1().getTotalScore());
        jLabelPlacarP2.setText("" + gameCtrl.getPlayer2().getTotalScore());
        jComboAcao.setSelectedIndex(0);
        jComboMovimento.setSelectedIndex(0);
    }

    @Override
    public void notificaCubePego(String cubeMessage) {
        JOptionPane.showMessageDialog(null, cubeMessage);
    }

    @Override
    public void notificaWarePego(String wareMessage) {
        JOptionPane.showMessageDialog(null, wareMessage);
    }

    @Override
    public void notificaPrimeirosCubosAdicionados(List<Color> colors) {
        setCubeColors(colors, cubes);
    }

    @Override
    public void notificaPrimeirosWaresAdicionados(List<Color> colors) {
        setWareColors(colors, wares);
    }

    @Override
    public void notificaNovoCuboAtualizado(Color color, String cubeLocation) {
        (componentsByName.get(cubeLocation)).setBackground(color);
    }

    @Override
    public void notificaNovoWareAtualizado(Color color, String wareLocation) {
        (componentsByName.get(wareLocation)).setBackground(color);
    }

    @Override
    public void notificarTipoMovimentacaoDefinido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

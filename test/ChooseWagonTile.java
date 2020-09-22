import Command.Invoker;
import Command.TakeWagonTileCommand;
import Control.GameControl;
import Model.WagonTile.Item;
import Model.WagonTile.WagonTile;
import java.util.ArrayList;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rodrigo
 */
public class ChooseWagonTile extends javax.swing.JFrame {

    /**
     * Creates new form ChooseWagonTile
     */
    public ChooseWagonTile(Item wagonTiles, GameControl gameCtrl, Invoker ci) {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);

        this.wagonTiles = wagonTiles;
        this.ci = ci;
        this.gameCtrl = gameCtrl;
        popularBotoes();
    }

    private void popularBotoes() {

        for (JButton bt : botoes) {
            bt.setIcon(null);
        }
        
        for (int i = 0; i < wagonTiles.size(); i++) {
            botoes.get(i).setName(wagonTiles.getWagonTiles(i).toString());
            botoes.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagens/" + wagonTiles.getWagonTiles(i).toString() + ".png")));
        }
        for (JButton bt : botoes) {
           if(bt.getIcon() == null){
               bt.setVisible(false);
           }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jBWT1 = new javax.swing.JButton();
        jBWT2 = new javax.swing.JButton();
        jBWT3 = new javax.swing.JButton();
        jBWT4 = new javax.swing.JButton();
        jBWT5 = new javax.swing.JButton();
        jBWT6 = new javax.swing.JButton();
        jBWT7 = new javax.swing.JButton();
        jBWT8 = new javax.swing.JButton();
        jBWT9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botoes = new ArrayList<>();

        botoes.add(jBWT1);
        botoes.add(jBWT2);
        botoes.add(jBWT3);
        botoes.add(jBWT4);
        botoes.add(jBWT5);
        botoes.add(jBWT6);
        botoes.add(jBWT7);
        botoes.add(jBWT8);
        botoes.add(jBWT9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBWT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT1ActionPerformed(evt);
            }
        });
        jBWT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT2ActionPerformed(evt);
            }
        });
        jBWT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT3ActionPerformed(evt);
            }
        });
        jBWT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT4ActionPerformed(evt);
            }
        });
        jBWT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT5ActionPerformed(evt);
            }
        });
        jBWT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT6ActionPerformed(evt);
            }
        });
        jBWT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT7ActionPerformed(evt);
            }
        });
        jBWT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT8ActionPerformed(evt);
            }
        });
        jBWT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWT9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Escolha uma Wagon Tile");

        jBWT1.setName("1");
        jBWT2.setName("2");
        jBWT3.setName("3");
        jBWT4.setName("4");
        jBWT5.setName("5");
        jBWT6.setName("6");
        jBWT7.setName("7");
        jBWT8.setName("8");
        jBWT9.setName("9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBWT6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBWT7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBWT8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBWT9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jBWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jBWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jBWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jBWT5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBWT6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBWT9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void selecionaWagonTile(JButton jb, String wagonTileName) {
        ci.add(new TakeWagonTileCommand(gameCtrl, wagonTileName));
        ci.execute();
        this.dispose();

    }

    private void jBWT1ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT1, jBWT1.getName());
    }

    private void jBWT2ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT2, jBWT2.getName());

    }

    private void jBWT3ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT3, jBWT3.getName());

    }

    private void jBWT4ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT4, jBWT4.getName());

    }

    private void jBWT5ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT5, jBWT5.getName());

    }

    private void jBWT6ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT6, jBWT6.getName());

    }

    private void jBWT7ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT7, jBWT7.getName());

    }

    private void jBWT8ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT8, jBWT8.getName());

    }

    private void jBWT9ActionPerformed(java.awt.event.ActionEvent evt) {
        selecionaWagonTile(jBWT9, jBWT9.getName());

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBWT1;
    private javax.swing.JButton jBWT2;
    private javax.swing.JButton jBWT3;
    private javax.swing.JButton jBWT4;
    private javax.swing.JButton jBWT5;
    private javax.swing.JButton jBWT6;
    private javax.swing.JButton jBWT7;
    private javax.swing.JButton jBWT8;
    private javax.swing.JButton jBWT9;
    private javax.swing.JLabel jLabel1;
    private Item wagonTiles;
    private ArrayList<JButton> botoes;
    private GameControl gameCtrl;
    private Invoker ci;
    // End of variables declaration                   
}

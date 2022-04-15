
package Demo_8_o;

import java.util.ArrayList;
import java.util.PriorityQueue;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrameGame extends javax.swing.JFrame {

    private ImageIcon[][] sprites;
    private ImageIcon[] spritesFullImage;
    private ArrayList<JLabel> lbs;
    //private ButtonGroup chosseHerictis;
    private int indexImage = 1;
    private int her = 1;
    private static int numberImage = 3;
    private int[][] a ;
    private int x = 1, y = 1;
    public FrameGame() {
        
        initComponents();
        
        areaSolution.setEditable(false);
        
//        chosseHerictis = new ButtonGroup();
//        chosseHerictis.add(radioHerictis1);
//        chosseHerictis.add(radioHerictis2);
//        chosseHerictis.add(radioHerictis3);
//        radioHerictis1.setSelected(true);
        
        lbs = new ArrayList<>();
        lbs.add(lb0);lbs.add(lb1);lbs.add(lb2);lbs.add(lb3);lbs.add(lb4);lbs.add(lb5);lbs.add(lb6);lbs.add(lb7);lbs.add(lb8);
        
        //load image
        spritesFullImage = new ImageIcon[numberImage+1];
        for(int i = 1; i <= numberImage; i++){
            spritesFullImage[i] = new ImageIcon(getClass().getResource("/Image/fullImage"+i+".jpg"));
        }
        sprites = new ImageIcon[numberImage+1][9];
        for(int i = 1;i <= numberImage; i++){
            for(int j = 0; j < 9; j++){
                sprites[i][j] = new ImageIcon(getClass().getResource("/Image/i"+i+"_"+j+".jpg"));
            }
        }
        // khoi tao ma tran ban dau
        a = Handle.new_matric();
        find();
        setSprites();
    }
    
    public void setSprites(){
        int indexOfLBS = 0;
        lbImage.setIcon(spritesFullImage[indexImage]);
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                lbs.get(indexOfLBS++).setIcon(sprites[indexImage][a[i][j]]);
            }
        }
    }
    public void find(){
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(a[i][j] == 0){
                    x = i; y = j;
                    break;
                }
            }
        }
    }
    //lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/i2.jpg")));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb0 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        btUp = new javax.swing.JButton();
        btRight = new javax.swing.JButton();
        btLeft = new javax.swing.JButton();
        btDown = new javax.swing.JButton();
        btNewGame = new javax.swing.JButton();
        btShowSolution = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSolution = new javax.swing.JTextArea();
        btChangeImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb0, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb0, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btUp.setText("UP");
        btUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpActionPerformed(evt);
            }
        });

        btRight.setText("RIGHT");
        btRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRightActionPerformed(evt);
            }
        });

        btLeft.setText("LEFT");
        btLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeftActionPerformed(evt);
            }
        });

        btDown.setText("DOWN");
        btDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDownActionPerformed(evt);
            }
        });

        btNewGame.setText("NewGame");
        btNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewGameActionPerformed(evt);
            }
        });

        btShowSolution.setText("Solution");
        btShowSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowSolutionActionPerformed(evt);
            }
        });

        areaSolution.setColumns(20);
        areaSolution.setRows(5);
        jScrollPane1.setViewportView(areaSolution);

        btChangeImage.setText("Change Image");
        btChangeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangeImageActionPerformed(evt);
            }
        });

        jLabel1.setText("Show Solution");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btChangeImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDown, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btNewGame)
                            .addComponent(btRight))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btShowSolution))
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btUp)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btRight)
                            .addComponent(btLeft))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDown)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNewGame)
                            .addComponent(btShowSolution)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btChangeImage)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpActionPerformed
        if(a[x-1][y] != -1){
            int tmp = a[x-1][y];
            a[x-1][y] = 0;
            a[x][y] = tmp;
            x -= 1;
        }
        setSprites();
    }//GEN-LAST:event_btUpActionPerformed

    private void btDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDownActionPerformed
        if(a[x+1][y] != -1){
            int tmp = a[x+1][y];
            a[x+1][y] = 0;
            a[x][y] = tmp;
            x += 1;
        }
        setSprites();
    }//GEN-LAST:event_btDownActionPerformed

    private void btLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeftActionPerformed
        if(a[x][y+1] != -1){
            int tmp = a[x][y+1];
            a[x][y+1] = 0;
            a[x][y] = tmp;
            y += 1;
        }
        setSprites();
    }//GEN-LAST:event_btLeftActionPerformed

    private void btRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRightActionPerformed
        if(a[x][y-1] != -1){
            int tmp = a[x][y-1];
            a[x][y-1] = 0;
            a[x][y] = tmp;
            y -= 1;
        }
        setSprites();
    }//GEN-LAST:event_btRightActionPerformed

    private void btShowSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowSolutionActionPerformed
       Step n_0 = new Step(a, 0, null, null);
       if(n_0.isEnd()){
           JOptionPane.showMessageDialog(null, "Hình đã được sắp xếp đúng");
           return;
       }
       Step goal = null;
       ArrayList<Step> close = new ArrayList<>();
       ArrayList<Node> road = new ArrayList<>();
       PriorityQueue<Step> open = new PriorityQueue<>();
       open.add(n_0);
       boolean check = true;
       while(check){
           if(open.isEmpty()) break ;
           else {
               Step tmp = open.poll();
               //close.add(tmp);
               if(tmp.isEnd()){
                   check = false;
                   goal = tmp;
               }
               else{
                   //System.out.println("m");
                   ArrayList<Step> ni = new ArrayList<>();
                   ni = tmp.next();
                   for(Step s : ni){
                       //s.print_matric();
                       open.add(s);
                       Node node = new Node(tmp, s);
                       road.add(node);
                   }
               }
           }
       }
       int size = road.size();
       for(int i = size-1; i >= 0; i--){
           if(road.get(i).getChilde().equals(goal)){
               close.add(goal);
               goal = road.get(i).getParent();
           }
       }
       int t = 1;
       for(int i = close.size()-1; i >= 0; i--){
           areaSolution.append("Step #" + t++ + " : " + close.get(i).getParentString()+"\n");
           //System.out.println("Step #" + t++ + " " + close.get(i).getParentString());
       }
       areaSolution.append("\n");
    }//GEN-LAST:event_btShowSolutionActionPerformed

    private void btChangeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChangeImageActionPerformed
       if(indexImage < numberImage){
           indexImage++;
       }
       else {
           indexImage = 1;
       }
       setSprites();
    }//GEN-LAST:event_btChangeImageActionPerformed

    private void btNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewGameActionPerformed
        a = Handle.new_matric();
        find();
        setSprites();
    }//GEN-LAST:event_btNewGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaSolution;
    private javax.swing.JButton btChangeImage;
    private javax.swing.JButton btDown;
    private javax.swing.JButton btLeft;
    private javax.swing.JButton btNewGame;
    private javax.swing.JButton btRight;
    private javax.swing.JButton btShowSolution;
    private javax.swing.JButton btUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb0;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lbImage;
    // End of variables declaration//GEN-END:variables
}

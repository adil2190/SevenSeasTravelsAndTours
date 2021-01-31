
package SDAproject;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicButtonUI;


public class UserHomePage extends javax.swing.JFrame {

    PackageFactory pkf;
    Package pk;
    login l;
    public UserHomePage() {
        initComponents();
    }
    
    String uname;
    int Id;
    
    public UserHomePage(String username, int id){
        initComponents();
        uname = username;
        Id = id;
        String displayuname = username.substring(0, 1).toUpperCase() + username.substring(1);
        signinuserdisplay.setText("        "+displayuname);
        JButton btns[] = {jButton1, jButton2, jButton3, basicbtn, standardbtn, premiumbtn, dubaiback1, dubaiback2, dubaibtn,
        abuback1, abuback2, abubtn, malaysiaback1, malaysiaback2, malaysiabtn, singaporebtn, singback1, singback2, 
        thaiback1, thaiback2, thaibtn, azerback1, azerback2, azerbtn, parisback1, parisback2, parisbtn, franceback1, franceback2,
        francebtn, germanyback1, germanyback2, germanybtn, ukback1, ukback2, ukbtn, switzback1, switzback2, switzbtn, italyback1, 
        italyback2, italybtn, ausback1, ausback2, ausbtn, americaback1, americaback2, americabtn, canadaback, canadaback1, canadabtn,
        spainback, spainback1, spainbtn, mexicoback, mexicoback1, mexicobtn, netherback, netherback1, netherbtn, travelersconfirm,
        onlinebtn, onlineconfirm, offlinebtn, offlineconfirm};
        for (JButton btn : btns) {
            btn.setBackground(new Color(21, 25, 28));
            btn.setForeground(new Color(255,255,255));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseInputListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(102,102,102));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21, 25, 28));

                }

                @Override
                public void mouseDragged(MouseEvent e) {
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                    
                }
            });
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        signinuserdisplay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        panel_center = new javax.swing.JPanel();
        pc1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        standardbtn = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        basicbtn = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        premiumbtn = new javax.swing.JButton();
        jPanel81 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pc2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Confirmationlabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pc3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        pc4 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        BasicPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        dubaibtn = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        abubtn = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        malaysiabtn = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        singaporebtn = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        thaibtn = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        azerbtn = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        StandardPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        parisbtn = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        francebtn = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        ukbtn = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        switzbtn = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        germanybtn = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        italybtn = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        PremiumPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        ausbtn = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        americabtn = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        spainbtn = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        mexicobtn = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        canadabtn = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        netherbtn = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        dubaipanel = new javax.swing.JPanel();
        dubaiback1 = new javax.swing.JButton();
        dubaiback2 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        abudhabipanel = new javax.swing.JPanel();
        abuback1 = new javax.swing.JButton();
        abuback2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        malaysiapanel = new javax.swing.JPanel();
        malaysiaback1 = new javax.swing.JButton();
        malaysiaback2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        singaporepanel = new javax.swing.JPanel();
        singback1 = new javax.swing.JButton();
        singback2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        thailandpanel = new javax.swing.JPanel();
        thaiback1 = new javax.swing.JButton();
        thaiback2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        azerbaijanpanel = new javax.swing.JPanel();
        azerback1 = new javax.swing.JButton();
        azerback2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        parispanel = new javax.swing.JPanel();
        parisback1 = new javax.swing.JButton();
        parisback2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        francepanel = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        franceback1 = new javax.swing.JButton();
        franceback2 = new javax.swing.JButton();
        germanypanel = new javax.swing.JPanel();
        germanyback1 = new javax.swing.JButton();
        germanyback2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        ukpanel = new javax.swing.JPanel();
        ukback1 = new javax.swing.JButton();
        ukback2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        switzpanel = new javax.swing.JPanel();
        switzback1 = new javax.swing.JButton();
        switzback2 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        italypanel = new javax.swing.JPanel();
        italyback1 = new javax.swing.JButton();
        italyback2 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        auspanel = new javax.swing.JPanel();
        ausback1 = new javax.swing.JButton();
        ausback2 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        americapanel = new javax.swing.JPanel();
        americaback1 = new javax.swing.JButton();
        americaback2 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        canadapanel = new javax.swing.JPanel();
        canadaback = new javax.swing.JButton();
        canadaback1 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        spainpanel = new javax.swing.JPanel();
        spainback = new javax.swing.JButton();
        spainback1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        mexicopanel = new javax.swing.JPanel();
        mexicoback = new javax.swing.JButton();
        mexicoback1 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        netherpanel = new javax.swing.JPanel();
        netherback = new javax.swing.JButton();
        netherback1 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        payment = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        onlinebtn = new javax.swing.JButton();
        offlinebtn = new javax.swing.JButton();
        travelersconfirm = new javax.swing.JButton();
        travelersfield = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        OnlinePayment = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cardfield = new javax.swing.JTextField();
        onlineconfirm = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        onlinepaymentlabel = new javax.swing.JLabel();
        OfflinePayment = new javax.swing.JPanel();
        offlineconfirm = new javax.swing.JButton();
        addressfield = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        offlinepaymentlabel = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1721, 273));

        jPanel82.setBackground(new java.awt.Color(102, 102, 102));
        jPanel82.setPreferredSize(new java.awt.Dimension(360, 273));

        jLabel27.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\logo2.png")); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        jLabel28.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\icon 1-01 (1).png")); // NOI18N
        jLabel28.setText("  ");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        signinuserdisplay.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        signinuserdisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Sign Out ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\title.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signinuserdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(signinuserdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 720));

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseenterred(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Select Package");

        jLabel32.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\select.png")); // NOI18N

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        p2.setBackground(new java.awt.Color(102, 102, 102));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseenterred(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Confirmation");

        jLabel58.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\confirmation.png")); // NOI18N

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58))
                .addContainerGap())
        );

        p3.setBackground(new java.awt.Color(102, 102, 102));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseenterred(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("About Us");

        jLabel64.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\aboutus.png")); // NOI18N

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64))
                .addContainerGap())
        );

        p4.setBackground(new java.awt.Color(102, 102, 102));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseenterred(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("New Package");

        jLabel63.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\new.png")); // NOI18N

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, java.awt.BorderLayout.LINE_START);

        panel_center.setBackground(new java.awt.Color(0, 0, 0));
        panel_center.setPreferredSize(new java.awt.Dimension(1378, 720));
        panel_center.setLayout(new java.awt.CardLayout());

        pc1.setBackground(new java.awt.Color(153, 153, 153));
        pc1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Browse Package ");
        pc1.add(jLabel1);
        jLabel1.setBounds(580, 60, 282, 50);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        standardbtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        standardbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        standardbtn.setText("  Continue");
        standardbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseClicked(evt);
            }
        });
        standardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardbtnActionPerformed(evt);
            }
        });

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("      Standard");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel70.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\standardbox.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel70)
                .addGap(55, 55, 55))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(standardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(standardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pc1.add(jPanel4);
        jPanel4.setBounds(550, 220, 370, 440);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        basicbtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        basicbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        basicbtn.setText("  Continue ");
        basicbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseClicked(evt);
            }
        });
        basicbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicbtnActionPerformed(evt);
            }
        });

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("        Basic");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel48.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\basicbox.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basicbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basicbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pc1.add(jPanel5);
        jPanel5.setBounds(130, 220, 370, 440);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        premiumbtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        premiumbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        premiumbtn.setText("  Continue");
        premiumbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserHomePage.this.mouseClicked(evt);
            }
        });
        premiumbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumbtnActionPerformed(evt);
            }
        });

        jPanel81.setBackground(new java.awt.Color(0, 0, 0));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("       Premium");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel71.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\premiumbox.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(premiumbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(premiumbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pc1.add(jPanel6);
        jPanel6.setBounds(970, 220, 370, 440);

        jLabel9.setText("----------------------------------------------------------------------");
        pc1.add(jLabel9);
        jLabel9.setBounds(580, 110, 280, 10);

        panel_center.add(pc1, "card2");

        pc2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Thank You");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Confirmationlabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("For choosing our services");

        jLabel8.setText("----------------------------------------------------------------------------------------------------------------");

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setText("See Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pc2Layout = new javax.swing.GroupLayout(pc2);
        pc2.setLayout(pc2Layout);
        pc2Layout.setHorizontalGroup(
            pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc2Layout.createSequentialGroup()
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Confirmationlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(512, Short.MAX_VALUE))
        );
        pc2Layout.setVerticalGroup(
            pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(Confirmationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        panel_center.add(pc2, "card3");

        pc3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel47.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\about us-01.png")); // NOI18N

        javax.swing.GroupLayout pc3Layout = new javax.swing.GroupLayout(pc3);
        pc3.setLayout(pc3Layout);
        pc3Layout.setHorizontalGroup(
            pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc3Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        pc3Layout.setVerticalGroup(
            pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        panel_center.add(pc3, "card4");

        pc4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel49.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel49.setText("New Package");

        jLabel50.setText("-----------------------------------------------------------");

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel51.setText("<html><p>Please delete previous package if any <br> to book a new package<p></html>");

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("Delete !");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pc4Layout = new javax.swing.GroupLayout(pc4);
        pc4.setLayout(pc4Layout);
        pc4Layout.setHorizontalGroup(
            pc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc4Layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addGroup(pc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(677, Short.MAX_VALUE))
        );
        pc4Layout.setVerticalGroup(
            pc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        panel_center.add(pc4, "card29");

        BasicPanel.setBackground(new java.awt.Color(153, 153, 153));
        BasicPanel.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Basic");
        BasicPanel.add(jLabel10);
        jLabel10.setBounds(600, 10, 70, 50);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        dubaibtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        dubaibtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        dubaibtn.setText("  View more");
        dubaibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        dubaibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubaibtnActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        jLabel18.setBackground(new java.awt.Color(204, 255, 0));
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("     Package no 1");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel79.setBackground(new java.awt.Color(153, 153, 153));

        jLabel239.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel240.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel240.setForeground(new java.awt.Color(0, 0, 0));
        jLabel240.setText("from Karachi");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel79Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel239, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel79Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel240, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel80.setBackground(new java.awt.Color(153, 153, 153));

        jLabel241.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel242.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(0, 0, 0));
        jLabel242.setText("Dubai");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(dubaibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(dubaibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        BasicPanel.add(jPanel8);
        jPanel8.setBounds(90, 80, 310, 300);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        abubtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        abubtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        abubtn.setText("  View more");
        abubtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        abubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abubtnActionPerformed(evt);
            }
        });

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));

        jLabel55.setBackground(new java.awt.Color(204, 255, 0));
        jLabel55.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setText("    Package no 2");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel45.setBackground(new java.awt.Color(153, 153, 153));

        jLabel171.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel172.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(0, 0, 0));
        jLabel172.setText("from Karachi");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel46.setBackground(new java.awt.Color(153, 153, 153));

        jLabel173.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel174.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(0, 0, 0));
        jLabel174.setText("Abu Dhabi");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(abubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        BasicPanel.add(jPanel7);
        jPanel7.setBounds(530, 80, 310, 300);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        malaysiabtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        malaysiabtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        malaysiabtn.setText("  View more");
        malaysiabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        malaysiabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malaysiabtnActionPerformed(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(0, 0, 0));

        jLabel56.setBackground(new java.awt.Color(204, 255, 0));
        jLabel56.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 204, 204));
        jLabel56.setText("     Package no 3");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(153, 153, 153));

        jLabel175.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel176.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(0, 0, 0));
        jLabel176.setText("from Karachi");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel48.setBackground(new java.awt.Color(153, 153, 153));

        jLabel177.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel178.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(0, 0, 0));
        jLabel178.setText("Malaysia");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(malaysiabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(malaysiabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        BasicPanel.add(jPanel9);
        jPanel9.setBounds(980, 80, 310, 300);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        singaporebtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        singaporebtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        singaporebtn.setText("  View more");
        singaporebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        singaporebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singaporebtnActionPerformed(evt);
            }
        });

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        jLabel57.setBackground(new java.awt.Color(204, 255, 0));
        jLabel57.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 204, 204));
        jLabel57.setText("    Package no 4");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel53.setBackground(new java.awt.Color(153, 153, 153));

        jLabel187.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel188.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(0, 0, 0));
        jLabel188.setText("from Karachi");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel187, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel54.setBackground(new java.awt.Color(153, 153, 153));

        jLabel189.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel190.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(0, 0, 0));
        jLabel190.setText("Singapore");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel189, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(singaporebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(singaporebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        BasicPanel.add(jPanel10);
        jPanel10.setBounds(90, 410, 310, 300);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        thaibtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        thaibtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        thaibtn.setText("  View more");
        thaibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        thaibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thaibtnActionPerformed(evt);
            }
        });

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        jLabel59.setBackground(new java.awt.Color(204, 255, 0));
        jLabel59.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setText("    Package no 5");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel51.setBackground(new java.awt.Color(153, 153, 153));

        jLabel183.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel184.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(0, 0, 0));
        jLabel184.setText("from Karachi");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel51Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel51Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel52.setBackground(new java.awt.Color(153, 153, 153));

        jLabel185.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel186.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(0, 0, 0));
        jLabel186.setText("Thailand");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel185, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(thaibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(thaibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        BasicPanel.add(jPanel11);
        jPanel11.setBounds(530, 410, 310, 300);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        azerbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        azerbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        azerbtn.setText("  View more");
        azerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        azerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azerbtnActionPerformed(evt);
            }
        });

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        jLabel60.setBackground(new java.awt.Color(204, 255, 0));
        jLabel60.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 204, 204));
        jLabel60.setText("    Package no 6");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(153, 153, 153));

        jLabel179.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel180.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(0, 0, 0));
        jLabel180.setText("from Karachi");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel49Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel179, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel49Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel50.setBackground(new java.awt.Color(153, 153, 153));

        jLabel181.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel182.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(0, 0, 0));
        jLabel182.setText("Azerbaijan");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel181, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(azerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(azerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        BasicPanel.add(jPanel12);
        jPanel12.setBounds(980, 410, 310, 300);

        panel_center.add(BasicPanel, "card5");

        StandardPanel.setBackground(new java.awt.Color(153, 153, 153));
        StandardPanel.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Standard");
        StandardPanel.add(jLabel11);
        jLabel11.setBounds(490, 10, 110, 50);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        parisbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        parisbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        parisbtn.setText("  View more");
        parisbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        parisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parisbtnActionPerformed(evt);
            }
        });

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        jLabel61.setBackground(new java.awt.Color(204, 255, 0));
        jLabel61.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 204, 204));
        jLabel61.setText("    Package no 1");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel55.setBackground(new java.awt.Color(153, 153, 153));

        jLabel191.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel192.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(0, 0, 0));
        jLabel192.setText("from Karachi");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel191, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel56.setBackground(new java.awt.Color(153, 153, 153));

        jLabel193.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel194.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(0, 0, 0));
        jLabel194.setText("Paris");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel193, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(parisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(parisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        StandardPanel.add(jPanel13);
        jPanel13.setBounds(90, 80, 310, 300);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        francebtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        francebtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        francebtn.setText("  View more");
        francebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        francebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francebtnActionPerformed(evt);
            }
        });

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));

        jLabel62.setBackground(new java.awt.Color(204, 255, 0));
        jLabel62.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 204, 204));
        jLabel62.setText("    Package no 2");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel57.setBackground(new java.awt.Color(153, 153, 153));

        jLabel195.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel196.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(0, 0, 0));
        jLabel196.setText("from Karachi");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel57Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel195, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel57Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel58.setBackground(new java.awt.Color(153, 153, 153));

        jLabel197.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel198.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(0, 0, 0));
        jLabel198.setText("Dubai");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel197, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(francebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(francebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        StandardPanel.add(jPanel14);
        jPanel14.setBounds(530, 80, 310, 300);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        ukbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ukbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        ukbtn.setText("  View more");
        ukbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        ukbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukbtnActionPerformed(evt);
            }
        });

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        jLabel74.setBackground(new java.awt.Color(204, 255, 0));
        jLabel74.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(204, 204, 204));
        jLabel74.setText("    Package no 4");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel65.setBackground(new java.awt.Color(153, 153, 153));

        jLabel211.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel212.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(0, 0, 0));
        jLabel212.setText("from Karachi");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel65Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel211, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel65Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel66.setBackground(new java.awt.Color(153, 153, 153));

        jLabel213.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel214.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(0, 0, 0));
        jLabel214.setText("United Kingdom");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel213, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(ukbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(ukbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        StandardPanel.add(jPanel15);
        jPanel15.setBounds(90, 410, 310, 300);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        switzbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        switzbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        switzbtn.setText("  View more");
        switzbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        switzbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switzbtnActionPerformed(evt);
            }
        });

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        jLabel73.setBackground(new java.awt.Color(204, 255, 0));
        jLabel73.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 204, 204));
        jLabel73.setText("    Package no 5");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel63.setBackground(new java.awt.Color(153, 153, 153));

        jLabel207.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel208.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(0, 0, 0));
        jLabel208.setText("from Karachi");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel63Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel207, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel63Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel208, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel64.setBackground(new java.awt.Color(153, 153, 153));

        jLabel209.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel210.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(0, 0, 0));
        jLabel210.setText("Switzerland");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel209, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(switzbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(switzbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        StandardPanel.add(jPanel16);
        jPanel16.setBounds(530, 410, 310, 300);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        germanybtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        germanybtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        germanybtn.setText("  View more");
        germanybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        germanybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                germanybtnActionPerformed(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        jLabel72.setBackground(new java.awt.Color(204, 255, 0));
        jLabel72.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(204, 204, 204));
        jLabel72.setText("    Package no 3");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel59.setBackground(new java.awt.Color(153, 153, 153));

        jLabel199.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel200.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(0, 0, 0));
        jLabel200.setText("from Karachi");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel199, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel60.setBackground(new java.awt.Color(153, 153, 153));

        jLabel201.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel202.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(0, 0, 0));
        jLabel202.setText("Germany");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel201, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(germanybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(germanybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        StandardPanel.add(jPanel17);
        jPanel17.setBounds(980, 80, 310, 300);

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        italybtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        italybtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        italybtn.setText("  View more");
        italybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        italybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italybtnActionPerformed(evt);
            }
        });

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        jLabel75.setBackground(new java.awt.Color(204, 255, 0));
        jLabel75.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 204, 204));
        jLabel75.setText("    Package no 6");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel61.setBackground(new java.awt.Color(153, 153, 153));

        jLabel203.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel204.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(0, 0, 0));
        jLabel204.setText("from Karachi");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel61Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel203, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel61Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel62.setBackground(new java.awt.Color(153, 153, 153));

        jLabel205.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel206.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(0, 0, 0));
        jLabel206.setText("Italy");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel205, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(italybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(italybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        StandardPanel.add(jPanel18);
        jPanel18.setBounds(980, 410, 310, 300);

        panel_center.add(StandardPanel, "card6");

        PremiumPanel.setBackground(new java.awt.Color(153, 153, 153));
        PremiumPanel.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Premium");
        PremiumPanel.add(jLabel12);
        jLabel12.setBounds(530, 10, 100, 50);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));

        ausbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ausbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        ausbtn.setText("  View more");
        ausbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        ausbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ausbtnActionPerformed(evt);
            }
        });

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));

        jLabel76.setBackground(new java.awt.Color(204, 255, 0));
        jLabel76.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 204, 204));
        jLabel76.setText("    Package no 1");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel67.setBackground(new java.awt.Color(153, 153, 153));

        jLabel215.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel216.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(0, 0, 0));
        jLabel216.setText("from Karachi");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel67Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel215, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel67Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel216, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel68.setBackground(new java.awt.Color(153, 153, 153));

        jLabel217.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel218.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(0, 0, 0));
        jLabel218.setText("Austrailia");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel217, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel218, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(ausbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(ausbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        PremiumPanel.add(jPanel19);
        jPanel19.setBounds(90, 80, 310, 300);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        americabtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        americabtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        americabtn.setText("  View more");
        americabtn.setToolTipText("");
        americabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        americabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americabtnActionPerformed(evt);
            }
        });

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));

        jLabel77.setBackground(new java.awt.Color(204, 255, 0));
        jLabel77.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(204, 204, 204));
        jLabel77.setText("    Package no 2");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel69.setBackground(new java.awt.Color(153, 153, 153));

        jLabel219.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel220.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(0, 0, 0));
        jLabel220.setText("from Karachi");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel69Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel219, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel69Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel220, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel70.setBackground(new java.awt.Color(153, 153, 153));

        jLabel221.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel222.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(0, 0, 0));
        jLabel222.setText("America");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel221, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel222, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(americabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(americabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        PremiumPanel.add(jPanel20);
        jPanel20.setBounds(530, 80, 310, 300);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

        spainbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        spainbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        spainbtn.setText("  View more");
        spainbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        spainbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spainbtnActionPerformed(evt);
            }
        });

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        jLabel81.setBackground(new java.awt.Color(204, 255, 0));
        jLabel81.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(204, 204, 204));
        jLabel81.setText("    Package no 4");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel77.setBackground(new java.awt.Color(153, 153, 153));

        jLabel235.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel236.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(0, 0, 0));
        jLabel236.setText("from Karachi");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel77Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel235, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel77Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel236, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel78.setBackground(new java.awt.Color(153, 153, 153));

        jLabel237.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel238.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(0, 0, 0));
        jLabel238.setText("Spain");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel238, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel237, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel238, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(spainbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(spainbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        PremiumPanel.add(jPanel21);
        jPanel21.setBounds(90, 410, 310, 300);

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));

        mexicobtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        mexicobtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        mexicobtn.setText("  View more");
        mexicobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        mexicobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexicobtnActionPerformed(evt);
            }
        });

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));

        jLabel82.setBackground(new java.awt.Color(204, 255, 0));
        jLabel82.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(204, 204, 204));
        jLabel82.setText("    Package no 5");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel75.setBackground(new java.awt.Color(153, 153, 153));

        jLabel231.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel232.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel232.setForeground(new java.awt.Color(0, 0, 0));
        jLabel232.setText("from Karachi");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel75Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel232, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel231, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel75Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel232, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel76.setBackground(new java.awt.Color(153, 153, 153));

        jLabel233.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel234.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(0, 0, 0));
        jLabel234.setText("Mexico");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel233, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel234, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(mexicobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(mexicobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        PremiumPanel.add(jPanel22);
        jPanel22.setBounds(530, 410, 310, 300);

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));

        canadabtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        canadabtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        canadabtn.setText("  View more");
        canadabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        canadabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canadabtnActionPerformed(evt);
            }
        });

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));

        jLabel78.setBackground(new java.awt.Color(204, 255, 0));
        jLabel78.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(204, 204, 204));
        jLabel78.setText("    Package no 3");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel71.setBackground(new java.awt.Color(153, 153, 153));

        jLabel223.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel224.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(0, 0, 0));
        jLabel224.setText("from Karachi");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel71Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel224, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel223, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel71Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel224, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel72.setBackground(new java.awt.Color(153, 153, 153));

        jLabel225.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel226.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(0, 0, 0));
        jLabel226.setText("Canada");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel225, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel226, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(canadabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(canadabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        PremiumPanel.add(jPanel23);
        jPanel23.setBounds(980, 80, 310, 300);

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));

        netherbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        netherbtn.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        netherbtn.setText("  View more");
        netherbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicmouseclicked(evt);
            }
        });
        netherbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netherbtnActionPerformed(evt);
            }
        });

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));

        jLabel79.setBackground(new java.awt.Color(204, 255, 0));
        jLabel79.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(204, 204, 204));
        jLabel79.setText("    Package no 6");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel73.setBackground(new java.awt.Color(153, 153, 153));

        jLabel227.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        jLabel228.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel228.setForeground(new java.awt.Color(0, 0, 0));
        jLabel228.setText("from Karachi");

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel73Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel227, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel73Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel228, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel74.setBackground(new java.awt.Color(153, 153, 153));

        jLabel229.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\destination.png")); // NOI18N

        jLabel230.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel230.setForeground(new java.awt.Color(0, 0, 0));
        jLabel230.setText("Netherlands");

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel229, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel230, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(netherbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(netherbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        PremiumPanel.add(jPanel24);
        jPanel24.setBounds(980, 410, 310, 300);

        panel_center.add(PremiumPanel, "card7");

        dubaipanel.setBackground(new java.awt.Color(153, 153, 153));

        dubaiback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dubaiback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        dubaiback1.setText("  Continue");
        dubaiback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        dubaiback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubaiback1ActionPerformed(evt);
            }
        });

        dubaiback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dubaiback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        dubaiback2.setText("  Back");
        dubaiback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\dubai done-01-01.png")); // NOI18N

        javax.swing.GroupLayout dubaipanelLayout = new javax.swing.GroupLayout(dubaipanel);
        dubaipanel.setLayout(dubaipanelLayout);
        dubaipanelLayout.setHorizontalGroup(
            dubaipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dubaipanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dubaipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dubaipanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dubaiback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dubaiback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dubaipanelLayout.setVerticalGroup(
            dubaipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dubaipanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(dubaipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dubaiback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dubaiback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(dubaipanel, "card8");

        abudhabipanel.setBackground(new java.awt.Color(153, 153, 153));

        abuback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        abuback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        abuback1.setText("  Continue");
        abuback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        abuback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abuback1ActionPerformed(evt);
            }
        });

        abuback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        abuback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        abuback2.setText("  Back");
        abuback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\abudhabi done-01-01.png")); // NOI18N

        javax.swing.GroupLayout abudhabipanelLayout = new javax.swing.GroupLayout(abudhabipanel);
        abudhabipanel.setLayout(abudhabipanelLayout);
        abudhabipanelLayout.setHorizontalGroup(
            abudhabipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abudhabipanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abudhabipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abudhabipanelLayout.createSequentialGroup()
                        .addGap(0, 1032, Short.MAX_VALUE)
                        .addComponent(abuback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abuback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        abudhabipanelLayout.setVerticalGroup(
            abudhabipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abudhabipanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(abudhabipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abuback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abuback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(abudhabipanel, "card9");

        malaysiapanel.setBackground(new java.awt.Color(153, 153, 153));

        malaysiaback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        malaysiaback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        malaysiaback1.setText("  Continue");
        malaysiaback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        malaysiaback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malaysiaback1ActionPerformed(evt);
            }
        });

        malaysiaback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        malaysiaback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        malaysiaback2.setText("  Back");
        malaysiaback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\malaysia done-01-01.png")); // NOI18N

        javax.swing.GroupLayout malaysiapanelLayout = new javax.swing.GroupLayout(malaysiapanel);
        malaysiapanel.setLayout(malaysiapanelLayout);
        malaysiapanelLayout.setHorizontalGroup(
            malaysiapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(malaysiapanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(malaysiaback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(malaysiaback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(malaysiapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        malaysiapanelLayout.setVerticalGroup(
            malaysiapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(malaysiapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(malaysiapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(malaysiaback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(malaysiaback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(malaysiapanel, "card10");

        singaporepanel.setBackground(new java.awt.Color(153, 153, 153));

        singback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        singback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        singback1.setText("  Continue");
        singback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        singback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singback1ActionPerformed(evt);
            }
        });

        singback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        singback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        singback2.setText("  Back");
        singback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\singapore done-02-02.png")); // NOI18N

        javax.swing.GroupLayout singaporepanelLayout = new javax.swing.GroupLayout(singaporepanel);
        singaporepanel.setLayout(singaporepanelLayout);
        singaporepanelLayout.setHorizontalGroup(
            singaporepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singaporepanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(singback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(singaporepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        singaporepanelLayout.setVerticalGroup(
            singaporepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singaporepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(singaporepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(singaporepanel, "card11");

        thailandpanel.setBackground(new java.awt.Color(153, 153, 153));

        thaiback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        thaiback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        thaiback1.setText("  Continue");
        thaiback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        thaiback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thaiback1ActionPerformed(evt);
            }
        });

        thaiback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        thaiback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        thaiback2.setText("  Back");
        thaiback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });
        thaiback2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thaiback2ActionPerformed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\thailand done-01-01-01.png")); // NOI18N

        javax.swing.GroupLayout thailandpanelLayout = new javax.swing.GroupLayout(thailandpanel);
        thailandpanel.setLayout(thailandpanelLayout);
        thailandpanelLayout.setHorizontalGroup(
            thailandpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thailandpanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(thaiback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thaiback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(thailandpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thailandpanelLayout.setVerticalGroup(
            thailandpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thailandpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(thailandpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thaiback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thaiback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(thailandpanel, "card12");

        azerbaijanpanel.setBackground(new java.awt.Color(153, 153, 153));

        azerback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        azerback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        azerback1.setText("  Continue");
        azerback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        azerback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azerback1ActionPerformed(evt);
            }
        });

        azerback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        azerback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        azerback2.setText("  Back");
        azerback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\azerbaijan done-02-02-02.png")); // NOI18N

        javax.swing.GroupLayout azerbaijanpanelLayout = new javax.swing.GroupLayout(azerbaijanpanel);
        azerbaijanpanel.setLayout(azerbaijanpanelLayout);
        azerbaijanpanelLayout.setHorizontalGroup(
            azerbaijanpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azerbaijanpanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(azerback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(azerback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(azerbaijanpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        azerbaijanpanelLayout.setVerticalGroup(
            azerbaijanpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azerbaijanpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(azerbaijanpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azerback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(azerback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(azerbaijanpanel, "card13");

        parispanel.setBackground(new java.awt.Color(153, 153, 153));

        parisback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        parisback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        parisback1.setText("  Continue");
        parisback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        parisback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parisback1ActionPerformed(evt);
            }
        });

        parisback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        parisback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        parisback2.setText("  Back");
        parisback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\paris done-01-01.png")); // NOI18N

        javax.swing.GroupLayout parispanelLayout = new javax.swing.GroupLayout(parispanel);
        parispanel.setLayout(parispanelLayout);
        parispanelLayout.setHorizontalGroup(
            parispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parispanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(parisback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parisback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(parispanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parispanelLayout.setVerticalGroup(
            parispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parispanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(parispanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parisback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parisback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(parispanel, "card14");

        francepanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel117.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\amsterdam done-02.png")); // NOI18N

        franceback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        franceback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        franceback1.setText("  Continue");
        franceback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        franceback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                franceback1ActionPerformed(evt);
            }
        });

        franceback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        franceback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        franceback2.setText("  Back");
        franceback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        javax.swing.GroupLayout francepanelLayout = new javax.swing.GroupLayout(francepanel);
        francepanel.setLayout(francepanelLayout);
        francepanelLayout.setHorizontalGroup(
            francepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(francepanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(franceback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(franceback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(francepanelLayout.createSequentialGroup()
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        francepanelLayout.setVerticalGroup(
            francepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(francepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(francepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(franceback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(franceback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(francepanel, "card15");

        germanypanel.setBackground(new java.awt.Color(153, 153, 153));

        germanyback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        germanyback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        germanyback1.setText("  Continue");
        germanyback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        germanyback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                germanyback1ActionPerformed(evt);
            }
        });

        germanyback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        germanyback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        germanyback2.setText("  Back");
        germanyback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\germany done-01-01.png")); // NOI18N

        javax.swing.GroupLayout germanypanelLayout = new javax.swing.GroupLayout(germanypanel);
        germanypanel.setLayout(germanypanelLayout);
        germanypanelLayout.setHorizontalGroup(
            germanypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(germanypanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(germanyback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(germanyback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(germanypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        germanypanelLayout.setVerticalGroup(
            germanypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(germanypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(germanypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(germanyback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(germanyback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(germanypanel, "card16");

        ukpanel.setBackground(new java.awt.Color(153, 153, 153));

        ukback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ukback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        ukback1.setText("  Continue");
        ukback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        ukback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukback1ActionPerformed(evt);
            }
        });

        ukback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ukback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        ukback2.setText("  Back");
        ukback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel38.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\uk done-02-02.png")); // NOI18N

        javax.swing.GroupLayout ukpanelLayout = new javax.swing.GroupLayout(ukpanel);
        ukpanel.setLayout(ukpanelLayout);
        ukpanelLayout.setHorizontalGroup(
            ukpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ukpanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(ukback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ukback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(ukpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ukpanelLayout.setVerticalGroup(
            ukpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ukpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(ukpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ukback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ukback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(ukpanel, "card17");

        switzpanel.setBackground(new java.awt.Color(153, 153, 153));

        switzback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        switzback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        switzback1.setText("  Continue");
        switzback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        switzback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switzback1ActionPerformed(evt);
            }
        });

        switzback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        switzback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        switzback2.setText("  Back");
        switzback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\switzerland done-01-01.png")); // NOI18N

        javax.swing.GroupLayout switzpanelLayout = new javax.swing.GroupLayout(switzpanel);
        switzpanel.setLayout(switzpanelLayout);
        switzpanelLayout.setHorizontalGroup(
            switzpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(switzpanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(switzback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switzback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(switzpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 1241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        switzpanelLayout.setVerticalGroup(
            switzpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(switzpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(switzpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switzback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switzback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(switzpanel, "card18");

        italypanel.setBackground(new java.awt.Color(153, 153, 153));

        italyback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        italyback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        italyback1.setText("  Continue");
        italyback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        italyback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italyback1ActionPerformed(evt);
            }
        });

        italyback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        italyback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        italyback2.setText("  Back");
        italyback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\italy done-02-02.png")); // NOI18N

        javax.swing.GroupLayout italypanelLayout = new javax.swing.GroupLayout(italypanel);
        italypanel.setLayout(italypanelLayout);
        italypanelLayout.setHorizontalGroup(
            italypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(italypanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(italyback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(italyback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(italypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        italypanelLayout.setVerticalGroup(
            italypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(italypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(italypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(italyback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(italyback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(italypanel, "card19");

        auspanel.setBackground(new java.awt.Color(153, 153, 153));

        ausback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ausback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        ausback1.setText("  Continue");
        ausback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        ausback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ausback1ActionPerformed(evt);
            }
        });

        ausback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ausback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        ausback2.setText("  Back");
        ausback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\aus done-01-01.png")); // NOI18N

        javax.swing.GroupLayout auspanelLayout = new javax.swing.GroupLayout(auspanel);
        auspanel.setLayout(auspanelLayout);
        auspanelLayout.setHorizontalGroup(
            auspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auspanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(ausback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ausback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(auspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        auspanelLayout.setVerticalGroup(
            auspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(auspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ausback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ausback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(auspanel, "card20");

        americapanel.setBackground(new java.awt.Color(153, 153, 153));

        americaback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        americaback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        americaback1.setText("  Continue");
        americaback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        americaback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americaback1ActionPerformed(evt);
            }
        });

        americaback2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        americaback2.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        americaback2.setText("  Back");
        americaback2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\america done-02-02.png")); // NOI18N

        javax.swing.GroupLayout americapanelLayout = new javax.swing.GroupLayout(americapanel);
        americapanel.setLayout(americapanelLayout);
        americapanelLayout.setHorizontalGroup(
            americapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(americapanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(americaback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(americaback2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(americapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        americapanelLayout.setVerticalGroup(
            americapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(americapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(americapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(americaback2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(americaback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(americapanel, "card21");

        canadapanel.setBackground(new java.awt.Color(153, 153, 153));

        canadaback.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        canadaback.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        canadaback.setText("  Continue");
        canadaback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        canadaback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canadabackActionPerformed(evt);
            }
        });

        canadaback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        canadaback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        canadaback1.setText("  Back");
        canadaback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });
        canadaback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canadaback1ActionPerformed(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\canada done-01.png")); // NOI18N

        javax.swing.GroupLayout canadapanelLayout = new javax.swing.GroupLayout(canadapanel);
        canadapanel.setLayout(canadapanelLayout);
        canadapanelLayout.setHorizontalGroup(
            canadapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canadapanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(canadaback, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canadaback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(canadapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        canadapanelLayout.setVerticalGroup(
            canadapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canadapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(canadapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canadaback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canadaback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(canadapanel, "card22");

        spainpanel.setBackground(new java.awt.Color(153, 153, 153));

        spainback.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spainback.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        spainback.setText("  Continue");
        spainback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        spainback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spainbackActionPerformed(evt);
            }
        });

        spainback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spainback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        spainback1.setText("  Back");
        spainback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\spain done-01.png")); // NOI18N

        javax.swing.GroupLayout spainpanelLayout = new javax.swing.GroupLayout(spainpanel);
        spainpanel.setLayout(spainpanelLayout);
        spainpanelLayout.setHorizontalGroup(
            spainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spainpanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(spainback, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spainback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(spainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        spainpanelLayout.setVerticalGroup(
            spainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(spainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spainback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spainback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(spainpanel, "card23");

        mexicopanel.setBackground(new java.awt.Color(153, 153, 153));

        mexicoback.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mexicoback.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        mexicoback.setText("  Continue");
        mexicoback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        mexicoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexicobackActionPerformed(evt);
            }
        });

        mexicoback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mexicoback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        mexicoback1.setText("  Back");
        mexicoback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\mexico done-02.png")); // NOI18N

        javax.swing.GroupLayout mexicopanelLayout = new javax.swing.GroupLayout(mexicopanel);
        mexicopanel.setLayout(mexicopanelLayout);
        mexicopanelLayout.setHorizontalGroup(
            mexicopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mexicopanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(mexicoback, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mexicoback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mexicopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mexicopanelLayout.setVerticalGroup(
            mexicopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mexicopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(mexicopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mexicoback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mexicoback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(mexicopanel, "card24");

        netherpanel.setBackground(new java.awt.Color(153, 153, 153));

        netherback.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        netherback.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\continue.png")); // NOI18N
        netherback.setText("  Continue");
        netherback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuemouseclicked(evt);
            }
        });
        netherback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netherbackActionPerformed(evt);
            }
        });

        netherback1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        netherback1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\back.png")); // NOI18N
        netherback1.setText("  Back");
        netherback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backmouseclicked(evt);
            }
        });
        netherback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netherback1ActionPerformed(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\nether done-02.png")); // NOI18N

        javax.swing.GroupLayout netherpanelLayout = new javax.swing.GroupLayout(netherpanel);
        netherpanel.setLayout(netherpanelLayout);
        netherpanelLayout.setHorizontalGroup(
            netherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(netherpanelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(netherback, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(netherback1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(netherpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        netherpanelLayout.setVerticalGroup(
            netherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(netherpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(netherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netherback1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netherback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_center.add(netherpanel, "card25");

        payment.setBackground(new java.awt.Color(153, 153, 153));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Select no of Travelers");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Select Paymrnt Method");

        onlinebtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        onlinebtn.setText("Online Payment");
        onlinebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentmouseclicked(evt);
            }
        });
        onlinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlinebtnActionPerformed(evt);
            }
        });

        offlinebtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        offlinebtn.setText("Offline Payment");
        offlinebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentmouseclicked(evt);
            }
        });
        offlinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlinebtnActionPerformed(evt);
            }
        });

        travelersconfirm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        travelersconfirm.setText("Confirm !");
        travelersconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelersconfirmActionPerformed(evt);
            }
        });

        travelersfield.setBackground(new java.awt.Color(51, 51, 51));
        travelersfield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        travelersfield.setForeground(new java.awt.Color(204, 204, 204));
        travelersfield.setText("Enter number of travelers");
        travelersfield.setOpaque(false);
        travelersfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                travelersfieldFocusGained(evt);
            }
        });

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("--------------------------------------------------------------");

        jLabel66.setText("--------------------------------------------------------------");

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment);
        payment.setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travelersfield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travelersconfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(paymentLayout.createSequentialGroup()
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(16, 16, 16)))
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addComponent(onlinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offlinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66))
                .addGap(25, 25, 25)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(onlinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offlinebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(travelersfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(travelersconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        panel_center.add(payment, "card26");

        OnlinePayment.setBackground(new java.awt.Color(153, 153, 153));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Online Payment");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Enter card number");

        cardfield.setBackground(new java.awt.Color(51, 51, 51));
        cardfield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cardfield.setForeground(new java.awt.Color(204, 204, 204));
        cardfield.setText("Credit Card");
        cardfield.setOpaque(false);
        cardfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardfieldFocusGained(evt);
            }
        });
        cardfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardfieldActionPerformed(evt);
            }
        });

        onlineconfirm.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        onlineconfirm.setText("Confirm");
        onlineconfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentconfirmclicked(evt);
            }
        });
        onlineconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineconfirmActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("----------------------------------------------------------------");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Your total amout is");

        jPanel86.setBackground(new java.awt.Color(102, 102, 102));

        onlinepaymentlabel.setFont(new java.awt.Font("Trajan Pro 3", 0, 48)); // NOI18N
        onlinepaymentlabel.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onlinepaymentlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onlinepaymentlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout OnlinePaymentLayout = new javax.swing.GroupLayout(OnlinePayment);
        OnlinePayment.setLayout(OnlinePaymentLayout);
        OnlinePaymentLayout.setHorizontalGroup(
            OnlinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OnlinePaymentLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addGroup(OnlinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onlineconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardfield, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OnlinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel86, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
                .addContainerGap(679, Short.MAX_VALUE))
        );
        OnlinePaymentLayout.setVerticalGroup(
            OnlinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OnlinePaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(28, 28, 28)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(onlineconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        panel_center.add(OnlinePayment, "card27");

        OfflinePayment.setBackground(new java.awt.Color(153, 153, 153));

        offlineconfirm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        offlineconfirm.setText("Confirm");
        offlineconfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentconfirmclicked(evt);
            }
        });
        offlineconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlineconfirmActionPerformed(evt);
            }
        });

        addressfield.setBackground(new java.awt.Color(51, 51, 51));
        addressfield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        addressfield.setForeground(new java.awt.Color(204, 204, 204));
        addressfield.setText("house address");
        addressfield.setOpaque(false);
        addressfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressfieldFocusGained(evt);
            }
        });
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Enter house address");

        jPanel87.setBackground(new java.awt.Color(102, 102, 102));

        offlinepaymentlabel.setFont(new java.awt.Font("Trajan Pro 3", 0, 48)); // NOI18N
        offlinepaymentlabel.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(offlinepaymentlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(offlinepaymentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel67.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Your total amout is");

        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("----------------------------------------------------------------");

        jLabel69.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Offline Payment");

        javax.swing.GroupLayout OfflinePaymentLayout = new javax.swing.GroupLayout(OfflinePayment);
        OfflinePayment.setLayout(OfflinePaymentLayout);
        OfflinePaymentLayout.setHorizontalGroup(
            OfflinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfflinePaymentLayout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addGroup(OfflinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressfield, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(offlineconfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(649, Short.MAX_VALUE))
        );
        OfflinePaymentLayout.setVerticalGroup(
            OfflinePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfflinePaymentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addGap(28, 28, 28)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(offlineconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        panel_center.add(OfflinePayment, "card28");

        jPanel3.add(panel_center, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void visibility(boolean PC1, boolean PC2, boolean PC3, boolean basic, boolean standard, boolean premium,
            boolean dubai, boolean abu, boolean malaysia, boolean singapore, boolean thai, boolean azer, 
            boolean paris, boolean france, boolean germany, boolean uk, boolean switz, boolean italy,
            boolean aus, boolean america, boolean canada, boolean spain, boolean mexico, boolean nether, boolean pay,
            boolean online, boolean offline, boolean PC4){
            pc1.setVisible(PC1);
            pc2.setVisible(PC2);
            pc3.setVisible(PC3);
            BasicPanel.setVisible(basic);
            StandardPanel.setVisible(standard);
            PremiumPanel.setVisible(premium);
            dubaipanel.setVisible(dubai);
            abudhabipanel.setVisible(abu);
            malaysiapanel.setVisible(malaysia);
            singaporepanel.setVisible(singapore);
            thailandpanel.setVisible(thai);
            azerbaijanpanel.setVisible(azer);
            parispanel.setVisible(paris);
            francepanel.setVisible(france);
            germanypanel.setVisible(germany);
            ukpanel.setVisible(uk);
            switzpanel.setVisible(switz);
            italypanel.setVisible(italy);
            auspanel.setVisible(aus);
            americapanel.setVisible(america);
            canadapanel.setVisible(canada);
            spainpanel.setVisible(spain);
            mexicopanel.setVisible(mexico);
            netherpanel.setVisible(nether);
            payment.setVisible(pay);
            OnlinePayment.setVisible(online);
            OfflinePayment.setVisible(offline);
            pc4.setVisible(PC4);
    }
    
    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked
if(evt.getSource()==p1){
            visibility(true, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        if(evt.getSource()==p2){
            visibility(false, true, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
            confirmationpanel();
        }
        
        if(evt.getSource()==p3){
            visibility(false, false, true, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false, false);
        }
        if(evt.getSource()==p4){
                visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,true);
          }
    }//GEN-LAST:event_mouseclicked

    private void mouseenterred(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseenterred
   if(evt.getSource()==p1)
       {
           p1.setBackground(new Color(153, 153, 153));
       }
       if(evt.getSource()==p2)
       {
           p2.setBackground(new Color(153, 153, 153));
       }
       if(evt.getSource()==p3)
       {
           p3.setBackground(new Color(153, 153, 153));
       }
       if(evt.getSource()==p4)
       {
           p4.setBackground(new Color(153, 153, 153));
       }
       
    }//GEN-LAST:event_mouseenterred

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
   if(evt.getSource() == p1) {
           p1.setBackground(new Color(102, 102, 102));
       }
       if(evt.getSource()==p2)
       {
           p2.setBackground(new Color(102, 102, 102));
       }
       if(evt.getSource()==p3)
       {
           p3.setBackground(new Color(102, 102, 102));
       }
       if(evt.getSource()==p4)
       {
           p4.setBackground(new Color(102, 102, 102));
       }
    }//GEN-LAST:event_mouseExited

    private void premiumbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumbtnActionPerformed
        // TODO add your handling code here:
        
//        pkf = new PackageFactory();
//        pk = pkf.getPackage("premium");
//        pk.select(Id, uname);
    }//GEN-LAST:event_premiumbtnActionPerformed

    private void basicbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicbtnActionPerformed
        // TODO add your handling code here:
        
//        pkf = new PackageFactory();
//        pk = pkf.getPackage("basic");
//        pk.select(Id, uname);
    }//GEN-LAST:event_basicbtnActionPerformed

    private void standardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardbtnActionPerformed
        // TODO add your handling code here:
        
//        pkf = new PackageFactory();
//        pk = pkf.getPackage("standard");
//        pk.select(Id, uname);
    }//GEN-LAST:event_standardbtnActionPerformed

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==basicbtn){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==standardbtn){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==premiumbtn){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);    
        }
        
    }//GEN-LAST:event_mouseClicked

    private void azerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azerbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_azerbtnActionPerformed

    private void singaporebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singaporebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singaporebtnActionPerformed

    private void thaibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thaibtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thaibtnActionPerformed

    private void malaysiabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malaysiabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malaysiabtnActionPerformed

    private void abubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abubtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abubtnActionPerformed

    private void dubaibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubaibtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dubaibtnActionPerformed

    private void parisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parisbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parisbtnActionPerformed

    private void francebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_francebtnActionPerformed

    private void ukbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ukbtnActionPerformed

    private void switzbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switzbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switzbtnActionPerformed

    private void germanybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_germanybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_germanybtnActionPerformed

    private void italybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_italybtnActionPerformed

    private void ausbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ausbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ausbtnActionPerformed

    private void americabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_americabtnActionPerformed

    private void spainbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spainbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spainbtnActionPerformed

    private void mexicobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexicobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mexicobtnActionPerformed

    private void canadabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canadabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canadabtnActionPerformed

    private void netherbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netherbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netherbtnActionPerformed

    private void basicmouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basicmouseclicked
        // TODO add your handling code here:
        if(evt.getSource()==dubaibtn){
            visibility(false, false, false, false, false, false, true, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==abubtn){
            visibility(false, false, false, false, false, false, false, true, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==malaysiabtn){
           visibility(false, false, false, false, false, false, false, false, true, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==singaporebtn){
            visibility(false, false, false, false, false, false, false, false, false, true, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==thaibtn){
            visibility(false, false, false, false, false, false, false, false, false, false, true, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==azerbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, true,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        if(evt.getSource()==parisbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            true, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==francebtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, true, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==germanybtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, true, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==ukbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, true, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==switzbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, true, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==italybtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, true, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==ausbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, true, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==americabtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, true, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==canadabtn){
           visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, true, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==spainbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, true, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==mexicobtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, true, false,false,false,false,false);
        }
        
        if(evt.getSource()==netherbtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, true,false,false,false,false);
        }
        
    }//GEN-LAST:event_basicmouseclicked

    private void backmouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backmouseclicked
        // TODO add your handling code here:
        if(evt.getSource()==dubaiback2){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==abuback2){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==malaysiaback2){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==singback2){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==thaiback2){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==azerback2){
            visibility(false, false, false, true, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==parisback2){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==franceback2){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==germanyback2){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==ukback2){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==switzback2){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==italyback2){
            visibility(false, false, false, false, true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==ausback2){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==americaback2){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        if(evt.getSource()==canadaback1){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==spainback1){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==mexicoback1){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
        
        if(evt.getSource()==netherback1){
            visibility(false, false, false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
        }
        
    }//GEN-LAST:event_backmouseclicked

    private void thaiback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thaiback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("basic");
        pk.select(Id, uname, 5, "Thailand", 30000);
    }//GEN-LAST:event_thaiback1ActionPerformed

    private void canadabackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canadabackActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("premium");
        pk.select(Id, uname, 23, "Canada", 70000);
    }//GEN-LAST:event_canadabackActionPerformed

    private void canadaback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canadaback1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canadaback1ActionPerformed

    private void thaiback2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thaiback2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thaiback2ActionPerformed

    private void dubaiback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubaiback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("basic");
        pk.select(Id, uname, 1, "Dubai", 20000);
    }//GEN-LAST:event_dubaiback1ActionPerformed

    private void netherback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netherback1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netherback1ActionPerformed

    private void continuemouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuemouseclicked
        // TODO add your handling code here:
        if(evt.getSource()==dubaiback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==abuback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==malaysiaback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==singback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==thaiback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==azerback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==parisback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==franceback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==germanyback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==ukback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==switzback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==italyback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==ausback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==americaback1){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        if(evt.getSource()==canadaback){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==spainback){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==mexicoback){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
        
        if(evt.getSource()==netherback){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,true,false,false,false);
        }
        
    }//GEN-LAST:event_continuemouseclicked

    private void abuback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abuback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("basic");
        pk.select(Id, uname, 2, "Abu Dhabi", 20000);
    }//GEN-LAST:event_abuback1ActionPerformed

    private void malaysiaback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malaysiaback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("basic");
        pk.select(Id, uname, 3, "Malaysia", 25000);
    }//GEN-LAST:event_malaysiaback1ActionPerformed

    private void singback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("basic");
        pk.select(Id, uname, 4, "Singapore", 30000);
    }//GEN-LAST:event_singback1ActionPerformed

    private void azerback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azerback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("basic");
        pk.select(Id, uname, 6, "Azerbaijan", 20000);
    }//GEN-LAST:event_azerback1ActionPerformed

    private void parisback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parisback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("standard");
        pk.select(Id, uname, 11, "Paris", 45000);
    }//GEN-LAST:event_parisback1ActionPerformed

    private void franceback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_franceback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("standard");
        pk.select(Id, uname, 12, "France", 45000);
    }//GEN-LAST:event_franceback1ActionPerformed

    private void germanyback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_germanyback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("standard");
        pk.select(Id, uname, 13, "Germany", 50000);
    }//GEN-LAST:event_germanyback1ActionPerformed

    private void ukback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("standard");
        pk.select(Id, uname, 14, "United Kingdom", 60000);
    }//GEN-LAST:event_ukback1ActionPerformed

    private void switzback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switzback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("standard");
        pk.select(Id, uname, 15, "Switzerland", 50000);
    }//GEN-LAST:event_switzback1ActionPerformed

    private void italyback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italyback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("standard");
        pk.select(Id, uname, 16, "Italy", 40000);
    }//GEN-LAST:event_italyback1ActionPerformed

    private void ausback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ausback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("premium");
        pk.select(Id, uname, 21, "Austrailia", 75000);
    }//GEN-LAST:event_ausback1ActionPerformed

    private void americaback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americaback1ActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("premium");
        pk.select(Id, uname, 22, "America", 70000);
    }//GEN-LAST:event_americaback1ActionPerformed

    private void spainbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spainbackActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("premium");
        pk.select(Id, uname, 24, "Spain", 55000);
    }//GEN-LAST:event_spainbackActionPerformed

    private void mexicobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexicobackActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("premium");
        pk.select(Id, uname, 25, "Mexico", 60000);
    }//GEN-LAST:event_mexicobackActionPerformed

    private void netherbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netherbackActionPerformed
        // TODO add your handling code here:
        pkf = new PackageFactory();
        pk = pkf.getPackage("premium");
        pk.select(Id, uname, 26, "Netherlands", 65000);
    }//GEN-LAST:event_netherbackActionPerformed

    private void travelersconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelersconfirmActionPerformed
        // TODO add your handling code here:
        Travelers t = new Travelers();
        int num = Integer.parseInt(travelersfield.getText());
        t.selectTravelers(num, Id);
        myconnection mc = new myconnection();
        String amount = "";
        String sql = "select payment from selection where userID = " + Id;
        try{
           ResultSet rs = mc.st.executeQuery(sql);
           if(rs.next()){
              amount = rs.getString("payment");
           }
        }catch(Exception e){System.out.println(e);}
        
        onlinepaymentlabel.setText("Rs. " + amount);
        offlinepaymentlabel.setText("Rs. " + amount);
    }//GEN-LAST:event_travelersconfirmActionPerformed

    private void cardfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardfieldActionPerformed

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

    private void paymentmouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentmouseclicked
        // TODO add your handling code here:
        if(evt.getSource() == onlinebtn){
        visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,true,false,false);
        }
        
        if(evt.getSource() == offlinebtn){
            visibility(false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,true,false);
        }
    }//GEN-LAST:event_paymentmouseclicked

    private void paymentconfirmclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentconfirmclicked
        // TODO add your handling code here:
        OfflinePayment payment = new OfflinePayment();
        
        if(evt.getSource() == onlineconfirm){
            payment.confirmPayment("creditcard",  null, Id, cardfield.getText());
            visibility(false, true, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
            confirmationpanel();
            
        }
        if(evt.getSource() == offlineconfirm){
            payment.confirmPayment("cash", addressfield.getText(), Id, null);
            visibility(false, true, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,false,false,false,false);
            confirmationpanel();
}
    }//GEN-LAST:event_paymentconfirmclicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        myconnection mc = new myconnection();
        String sql = "select * from selection where userID = " + Id;
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
                int bill = rs.getInt("payment");
                if(rs.getString("confirmation") == null){
                    JOptionPane.showMessageDialog(null, "Your tickets are not confirmed yet !!");
                }
                else{
                    System.out.println(uname + " " + Id);
                     Invoice inv = new Invoice(uname, Id, bill);
                     inv.setVisible(true);
                }
            }
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        myconnection mc = new myconnection();
        String sql = "delete from selection where userID = " + Id;
        String sql2 = "delete from ticketsinfo where userID = " + Id;
        String sql3 = "select * from selection where userID = " + Id;
       
        try{
            ResultSet rs = mc.st.executeQuery(sql3);
            if(rs.next()){
               
                    System.out.println("h m m m ");
                    int x = mc.st.executeUpdate(sql);
                    mc.st.executeUpdate(sql2);
                    if(x > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Records deleted Successfully !!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Not successfull");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "You have not selected any package yet.");
                }
        
            
           
        }catch(Exception e){System.out.println(e);}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void travelersfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_travelersfieldFocusGained
        // TODO add your handling code here:
        travelersfield.setText("");
    }//GEN-LAST:event_travelersfieldFocusGained

    private void onlineconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onlineconfirmActionPerformed

    private void offlineconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlineconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offlineconfirmActionPerformed

    private void cardfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardfieldFocusGained
        // TODO add your handling code here:
        cardfield.setText("");
    }//GEN-LAST:event_cardfieldFocusGained

    private void addressfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressfieldFocusGained
        // TODO add your handling code here:
        addressfield.setText("");
    }//GEN-LAST:event_addressfieldFocusGained

    private void onlinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlinebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onlinebtnActionPerformed

    private void offlinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlinebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offlinebtnActionPerformed

     
     public void confirmationpanel(){
         myconnection mc = new myconnection();
         String sql = "select confirmation from selection where userID="+Id;
         try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
            if(rs.getString("confirmation") == null){
                Confirmationlabel.setText("<html>Not Confirmed Yet!!</html>");
            }else{
                Confirmationlabel.setText(rs.getString("confirmation"));
            }
            }
        }catch(Exception e){System.out.println(e);}
     }
   
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
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new UserHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasicPanel;
    private javax.swing.JLabel Confirmationlabel;
    private javax.swing.JPanel OfflinePayment;
    private javax.swing.JPanel OnlinePayment;
    private javax.swing.JPanel PremiumPanel;
    private javax.swing.JPanel StandardPanel;
    private javax.swing.JButton abuback1;
    private javax.swing.JButton abuback2;
    private javax.swing.JButton abubtn;
    private javax.swing.JPanel abudhabipanel;
    private javax.swing.JTextField addressfield;
    private javax.swing.JButton americaback1;
    private javax.swing.JButton americaback2;
    private javax.swing.JButton americabtn;
    private javax.swing.JPanel americapanel;
    private javax.swing.JButton ausback1;
    private javax.swing.JButton ausback2;
    private javax.swing.JButton ausbtn;
    private javax.swing.JPanel auspanel;
    private javax.swing.JButton azerback1;
    private javax.swing.JButton azerback2;
    private javax.swing.JPanel azerbaijanpanel;
    private javax.swing.JButton azerbtn;
    private javax.swing.JButton basicbtn;
    private javax.swing.JButton canadaback;
    private javax.swing.JButton canadaback1;
    private javax.swing.JButton canadabtn;
    private javax.swing.JPanel canadapanel;
    private javax.swing.JTextField cardfield;
    private javax.swing.JButton dubaiback1;
    private javax.swing.JButton dubaiback2;
    private javax.swing.JButton dubaibtn;
    private javax.swing.JPanel dubaipanel;
    private javax.swing.JButton franceback1;
    private javax.swing.JButton franceback2;
    private javax.swing.JButton francebtn;
    private javax.swing.JPanel francepanel;
    private javax.swing.JButton germanyback1;
    private javax.swing.JButton germanyback2;
    private javax.swing.JButton germanybtn;
    private javax.swing.JPanel germanypanel;
    private javax.swing.JButton italyback1;
    private javax.swing.JButton italyback2;
    private javax.swing.JButton italybtn;
    private javax.swing.JPanel italypanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton malaysiaback1;
    private javax.swing.JButton malaysiaback2;
    private javax.swing.JButton malaysiabtn;
    private javax.swing.JPanel malaysiapanel;
    private javax.swing.JButton mexicoback;
    private javax.swing.JButton mexicoback1;
    private javax.swing.JButton mexicobtn;
    private javax.swing.JPanel mexicopanel;
    private javax.swing.JButton netherback;
    private javax.swing.JButton netherback1;
    private javax.swing.JButton netherbtn;
    private javax.swing.JPanel netherpanel;
    private javax.swing.JButton offlinebtn;
    private javax.swing.JButton offlineconfirm;
    private javax.swing.JLabel offlinepaymentlabel;
    private javax.swing.JButton onlinebtn;
    private javax.swing.JButton onlineconfirm;
    private javax.swing.JLabel onlinepaymentlabel;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel panel_center;
    private javax.swing.JButton parisback1;
    private javax.swing.JButton parisback2;
    private javax.swing.JButton parisbtn;
    private javax.swing.JPanel parispanel;
    private javax.swing.JPanel payment;
    private javax.swing.JPanel pc1;
    private javax.swing.JPanel pc2;
    private javax.swing.JPanel pc3;
    private javax.swing.JPanel pc4;
    private javax.swing.JButton premiumbtn;
    private javax.swing.JLabel signinuserdisplay;
    private javax.swing.JButton singaporebtn;
    private javax.swing.JPanel singaporepanel;
    private javax.swing.JButton singback1;
    private javax.swing.JButton singback2;
    private javax.swing.JButton spainback;
    private javax.swing.JButton spainback1;
    private javax.swing.JButton spainbtn;
    private javax.swing.JPanel spainpanel;
    private javax.swing.JButton standardbtn;
    private javax.swing.JButton switzback1;
    private javax.swing.JButton switzback2;
    private javax.swing.JButton switzbtn;
    private javax.swing.JPanel switzpanel;
    private javax.swing.JButton thaiback1;
    private javax.swing.JButton thaiback2;
    private javax.swing.JButton thaibtn;
    private javax.swing.JPanel thailandpanel;
    private javax.swing.JButton travelersconfirm;
    private javax.swing.JTextField travelersfield;
    private javax.swing.JButton ukback1;
    private javax.swing.JButton ukback2;
    private javax.swing.JButton ukbtn;
    private javax.swing.JPanel ukpanel;
    // End of variables declaration//GEN-END:variables
}

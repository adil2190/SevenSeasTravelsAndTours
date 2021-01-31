
package SDAproject;
import java.util.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicButtonUI;


public class login extends javax.swing.JFrame {
//    myconnection mc;
    Scanner in = new Scanner(System.in);
//    Registration r =  Registration.getInstance();
    UserLogin ul = UserLogin.getInstance();
    
    public login() {
        initComponents();
        JButton btns[] = {UserLoginBtn, AdminLoginBtn, signupbtn};
        for (JButton btn : btns) {
            btn.setBackground(new Color(21, 25, 28));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_centre = new javax.swing.JPanel();
        pc1 = new javax.swing.JPanel();
        AdminHeading = new javax.swing.JLabel();
        userloginarea = new javax.swing.JPanel();
        AdminUsernName = new javax.swing.JLabel();
        AdminPassword = new javax.swing.JLabel();
        Usernamefield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userpassfield = new javax.swing.JPasswordField();
        UserLoginBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pc3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        signupuname = new javax.swing.JLabel();
        signuppass = new javax.swing.JLabel();
        signupemail = new javax.swing.JLabel();
        signupcontact = new javax.swing.JLabel();
        signupage = new javax.swing.JLabel();
        signupuserField = new javax.swing.JTextField();
        signupemailField = new javax.swing.JTextField();
        signupcontactField = new javax.swing.JTextField();
        signupageField = new javax.swing.JTextField();
        signuppassField = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        pc2 = new javax.swing.JPanel();
        UserHeading = new javax.swing.JLabel();
        adminloginarea = new javax.swing.JPanel();
        UsernName = new javax.swing.JLabel();
        UserPassword = new javax.swing.JLabel();
        adminuserfield = new javax.swing.JTextField();
        adminpassfield = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AdminLoginBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\title.png")); // NOI18N

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel18.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\logo2.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 595));

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login.this.mouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Admin");

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\icons8-admin-settings-male-50.png")); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(102, 102, 102));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login.this.mouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User");

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\icons8-signin-50.png")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p3.setBackground(new java.awt.Color(102, 102, 102));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login.this.mouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sign Up");

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\icons8-add-user-male-50.png")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        panel_centre.setBackground(new java.awt.Color(155, 155, 222));
        panel_centre.setLayout(new java.awt.CardLayout());

        pc1.setBackground(new java.awt.Color(153, 153, 153));

        AdminHeading.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        AdminHeading.setForeground(new java.awt.Color(0, 0, 0));
        AdminHeading.setText("Login as User");

        userloginarea.setBackground(new java.awt.Color(153, 153, 153));

        AdminUsernName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        AdminUsernName.setForeground(new java.awt.Color(0, 0, 0));
        AdminUsernName.setText("Username");

        AdminPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        AdminPassword.setForeground(new java.awt.Color(0, 0, 0));
        AdminPassword.setText("Password");

        Usernamefield.setBackground(new java.awt.Color(153, 153, 153));
        Usernamefield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Usernamefield.setForeground(new java.awt.Color(51, 51, 51));
        Usernamefield.setText("Enter Username");
        Usernamefield.setBorder(null);
        Usernamefield.setOpaque(false);
        Usernamefield.setPreferredSize(new java.awt.Dimension(5, 20));
        Usernamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernamefieldFocusGained(evt);
            }
        });
        Usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamefieldActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("-----------------------------------------------------------------------------------------------------------");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("-----------------------------------------------------------------------------------------------------------");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        userpassfield.setBackground(new java.awt.Color(153, 153, 153));
        userpassfield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        userpassfield.setForeground(new java.awt.Color(51, 51, 51));
        userpassfield.setText("jPasswordField1");
        userpassfield.setBorder(null);
        userpassfield.setOpaque(false);
        userpassfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userpassfieldFocusGained(evt);
            }
        });
        userpassfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpassfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userloginareaLayout = new javax.swing.GroupLayout(userloginarea);
        userloginarea.setLayout(userloginareaLayout);
        userloginareaLayout.setHorizontalGroup(
            userloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userloginareaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(userloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usernamefield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(userloginareaLayout.createSequentialGroup()
                        .addGroup(userloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminUsernName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(userpassfield))
                .addContainerGap())
        );
        userloginareaLayout.setVerticalGroup(
            userloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userloginareaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(AdminUsernName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        UserLoginBtn.setBackground(new java.awt.Color(0, 0, 0));
        UserLoginBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        UserLoginBtn.setForeground(java.awt.Color.white);
        UserLoginBtn.setText("Login!");
        UserLoginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        UserLoginBtn.setBorderPainted(false);
        UserLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginBtnActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("----------------------------------------------------------------------");

        javax.swing.GroupLayout pc1Layout = new javax.swing.GroupLayout(pc1);
        pc1.setLayout(pc1Layout);
        pc1Layout.setHorizontalGroup(
            pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc1Layout.createSequentialGroup()
                .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pc1Layout.createSequentialGroup()
                            .addGap(341, 341, 341)
                            .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AdminHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pc1Layout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(userloginarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        pc1Layout.setVerticalGroup(
            pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userloginarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        panel_centre.add(pc1, "card2");

        pc3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SIgn Up !!");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        signupuname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        signupuname.setForeground(new java.awt.Color(0, 0, 0));
        signupuname.setText("Username");

        signuppass.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        signuppass.setForeground(new java.awt.Color(0, 0, 0));
        signuppass.setText("Password");

        signupemail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        signupemail.setForeground(new java.awt.Color(0, 0, 0));
        signupemail.setText("Email");

        signupcontact.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        signupcontact.setForeground(new java.awt.Color(0, 0, 0));
        signupcontact.setText("Contact");

        signupage.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        signupage.setForeground(new java.awt.Color(0, 0, 0));
        signupage.setText("Age");

        signupuserField.setBackground(new java.awt.Color(153, 153, 153));
        signupuserField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        signupuserField.setForeground(new java.awt.Color(51, 51, 51));
        signupuserField.setText("Enter Username");
        signupuserField.setBorder(null);
        signupuserField.setOpaque(false);
        signupuserField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupuserFieldFocusGained(evt);
            }
        });
        signupuserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupuserFieldActionPerformed(evt);
            }
        });

        signupemailField.setBackground(new java.awt.Color(153, 153, 153));
        signupemailField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        signupemailField.setForeground(new java.awt.Color(51, 51, 51));
        signupemailField.setText("Enter Email");
        signupemailField.setBorder(null);
        signupemailField.setOpaque(false);
        signupemailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupemailFieldFocusGained(evt);
            }
        });

        signupcontactField.setBackground(new java.awt.Color(153, 153, 153));
        signupcontactField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        signupcontactField.setForeground(new java.awt.Color(51, 51, 51));
        signupcontactField.setText("Enter Contact");
        signupcontactField.setBorder(null);
        signupcontactField.setOpaque(false);
        signupcontactField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupcontactFieldFocusGained(evt);
            }
        });

        signupageField.setBackground(new java.awt.Color(153, 153, 153));
        signupageField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        signupageField.setForeground(new java.awt.Color(51, 51, 51));
        signupageField.setText("Enter Age");
        signupageField.setBorder(null);
        signupageField.setOpaque(false);
        signupageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupageFieldFocusGained(evt);
            }
        });

        signuppassField.setBackground(new java.awt.Color(153, 153, 153));
        signuppassField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        signuppassField.setForeground(new java.awt.Color(51, 51, 51));
        signuppassField.setText("Enter Password");
        signuppassField.setBorder(null);
        signuppassField.setOpaque(false);
        signuppassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signuppassFieldFocusGained(evt);
            }
        });
        signuppassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuppassFieldActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("----------------------------------------------------------------------------------------------------------------");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("----------------------------------------------------------------------------------------------------------------");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("----------------------------------------------------------------------------------------------------------------");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("----------------------------------------------------------------------------------------------------------------");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("----------------------------------------------------------------------------------------------------------------");

        signupbtn.setBackground(new java.awt.Color(0, 0, 0));
        signupbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("SIgn up ");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signupbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(signupuserField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signupuname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signuppass, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signupemail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signupcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signupage, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(signuppassField)
                    .addComponent(signupemailField)
                    .addComponent(signupcontactField)
                    .addComponent(signupageField)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signupuname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupuserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signuppass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signuppassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupemailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupcontact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupcontactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("---------------------------------------------------");

        javax.swing.GroupLayout pc3Layout = new javax.swing.GroupLayout(pc3);
        pc3.setLayout(pc3Layout);
        pc3Layout.setHorizontalGroup(
            pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc3Layout.createSequentialGroup()
                .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        pc3Layout.setVerticalGroup(
            pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        panel_centre.add(pc3, "card4");

        pc2.setBackground(new java.awt.Color(153, 153, 153));

        UserHeading.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        UserHeading.setForeground(new java.awt.Color(0, 0, 0));
        UserHeading.setText("Login as Admin");

        adminloginarea.setBackground(new java.awt.Color(153, 153, 153));

        UsernName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        UsernName.setForeground(new java.awt.Color(0, 0, 0));
        UsernName.setText("Username");

        UserPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        UserPassword.setForeground(new java.awt.Color(0, 0, 0));
        UserPassword.setText("Password");

        adminuserfield.setBackground(new java.awt.Color(153, 153, 153));
        adminuserfield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        adminuserfield.setForeground(new java.awt.Color(51, 51, 51));
        adminuserfield.setText("Enter Username");
        adminuserfield.setBorder(null);
        adminuserfield.setOpaque(false);
        adminuserfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminuserfieldFocusGained(evt);
            }
        });
        adminuserfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminuserfieldActionPerformed(evt);
            }
        });

        adminpassfield.setBackground(new java.awt.Color(153, 153, 153));
        adminpassfield.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        adminpassfield.setForeground(new java.awt.Color(51, 51, 51));
        adminpassfield.setText("Enter Password");
        adminpassfield.setBorder(null);
        adminpassfield.setOpaque(false);
        adminpassfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminpassfieldFocusGained(evt);
            }
        });
        adminpassfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminpassfieldActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("---------------------------------------------------------------------------------------------------------------------");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("---------------------------------------------------------------------------------------------------------------------");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout adminloginareaLayout = new javax.swing.GroupLayout(adminloginarea);
        adminloginarea.setLayout(adminloginareaLayout);
        adminloginareaLayout.setHorizontalGroup(
            adminloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminloginareaLayout.createSequentialGroup()
                .addGroup(adminloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminuserfield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminpassfield)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminloginareaLayout.createSequentialGroup()
                        .addGroup(adminloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adminloginareaLayout.setVerticalGroup(
            adminloginareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminloginareaLayout.createSequentialGroup()
                .addComponent(UsernName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminuserfield, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        AdminLoginBtn.setBackground(new java.awt.Color(0, 0, 0));
        AdminLoginBtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        AdminLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdminLoginBtn.setText("Login!");
        AdminLoginBtn.setBorder(null);
        AdminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginBtnActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("--------------------------------------------------------------------------------");

        javax.swing.GroupLayout pc2Layout = new javax.swing.GroupLayout(pc2);
        pc2.setLayout(pc2Layout);
        pc2Layout.setHorizontalGroup(
            pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc2Layout.createSequentialGroup()
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminloginarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        pc2Layout.setVerticalGroup(
            pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(UserHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(35, 35, 35)
                .addComponent(adminloginarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        panel_centre.add(pc2, "card3");

        jPanel1.add(panel_centre, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked
        if(evt.getSource()==p1){
            pc1.setVisible(false);
            pc2.setVisible(true);
            pc3.setVisible(false);
        }
        if(evt.getSource()==p2){
            pc1.setVisible(true);
            pc2.setVisible(false);
            pc3.setVisible(false);
        }
        if(evt.getSource()==p3){
            pc1.setVisible(false);
            pc2.setVisible(false);
            pc3.setVisible(true);
        }
    }//GEN-LAST:event_mouseclicked

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
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
    }//GEN-LAST:event_mouseEntered

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
    }//GEN-LAST:event_mouseExited

    private void UsernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamefieldActionPerformed

    private void UserLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginBtnActionPerformed

             if(ul.signIn(Usernamefield.getText(), userpassfield.getText())){

                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Please try again");
                Usernamefield.setText("");
                userpassfield.setText("");
            }
            

    }//GEN-LAST:event_UserLoginBtnActionPerformed

    private void adminuserfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminuserfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminuserfieldActionPerformed

    private void AdminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginBtnActionPerformed
       try{

             AdminLogin al = new AdminLogin();
             if(al.signIn(adminuserfield.getText(), adminpassfield.getText())){
                 dispose();
             }else{
                 JOptionPane.showMessageDialog(null, "Invalid username or password");
                 adminuserfield.setText("");
                 adminpassfield.setText("");
             }
            
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_AdminLoginBtnActionPerformed

  
    
    private void signupuserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupuserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupuserFieldActionPerformed

    private void signuppassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuppassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signuppassFieldActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        try{
        ul.registration(signupuserField.getText(), signuppassField.getText(), signupemailField.getText(),
                signupcontactField.getText(), Integer.parseInt(signupageField.getText()));
        pc1.setVisible(false);
        pc2.setVisible(true);
        pc3.setVisible(false);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Please Enter all required fields");}
    }//GEN-LAST:event_signupbtnActionPerformed

    private void UsernamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernamefieldFocusGained
        // TODO add your handling code here:
        Usernamefield.setText("");
    }//GEN-LAST:event_UsernamefieldFocusGained

    private void adminpassfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpassfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminpassfieldActionPerformed

    private void adminuserfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminuserfieldFocusGained
        // TODO add your handling code here:
        adminuserfield.setText("");
    }//GEN-LAST:event_adminuserfieldFocusGained

    private void adminpassfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminpassfieldFocusGained
        // TODO add your handling code here:
        adminpassfield.setText("");
    }//GEN-LAST:event_adminpassfieldFocusGained

    private void signupuserFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupuserFieldFocusGained
        // TODO add your handling code here:
        signupuserField.setText("");
    }//GEN-LAST:event_signupuserFieldFocusGained

    private void signuppassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signuppassFieldFocusGained
        // TODO add your handling code here:
        signuppassField.setText("");
    }//GEN-LAST:event_signuppassFieldFocusGained

    private void signupemailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupemailFieldFocusGained
        // TODO add your handling code here:
        signupemailField.setText("");
    }//GEN-LAST:event_signupemailFieldFocusGained

    private void signupcontactFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupcontactFieldFocusGained
        // TODO add your handling code here:
        signupcontactField.setText("");
    }//GEN-LAST:event_signupcontactFieldFocusGained

    private void signupageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupageFieldFocusGained
        // TODO add your handling code here:
        signupageField.setText("");
    }//GEN-LAST:event_signupageFieldFocusGained

    private void userpassfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpassfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpassfieldActionPerformed

    private void userpassfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userpassfieldFocusGained
        // TODO add your handling code here:
        userpassfield.setText("");
    }//GEN-LAST:event_userpassfieldFocusGained

    String username;
    int Id;
    public void setUsername(String name){
        username = name;
    }
    
    public void setId(int id){
        Id = id;
    }
    
    public String getUsername(){
        return username;
    }
    
    public int getId(){
        return Id;
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    public void setPanel(boolean pp1, boolean pp2, boolean pp3){
            this.pc1.setVisible(pp1);
            this.pc2.setVisible(pp2);
            this.pc3.setVisible(pp3);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminHeading;
    private javax.swing.JButton AdminLoginBtn;
    private javax.swing.JLabel AdminPassword;
    private javax.swing.JLabel AdminUsernName;
    private javax.swing.JLabel UserHeading;
    private javax.swing.JButton UserLoginBtn;
    private javax.swing.JLabel UserPassword;
    private javax.swing.JLabel UsernName;
    private javax.swing.JTextField Usernamefield;
    private javax.swing.JPanel adminloginarea;
    private javax.swing.JPasswordField adminpassfield;
    private javax.swing.JTextField adminuserfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel panel_centre;
    private javax.swing.JPanel pc1;
    private javax.swing.JPanel pc2;
    private javax.swing.JPanel pc3;
    private javax.swing.JLabel signupage;
    private javax.swing.JTextField signupageField;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel signupcontact;
    private javax.swing.JTextField signupcontactField;
    private javax.swing.JLabel signupemail;
    private javax.swing.JTextField signupemailField;
    private javax.swing.JLabel signuppass;
    private javax.swing.JPasswordField signuppassField;
    private javax.swing.JLabel signupuname;
    private javax.swing.JTextField signupuserField;
    private javax.swing.JPanel userloginarea;
    private javax.swing.JPasswordField userpassfield;
    // End of variables declaration//GEN-END:variables
}


package SDAproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;


public class AdminPanell extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    
    public AdminPanell() {
        initComponents();
        show_requests();
        show_flights();
        show_buses();
        JButton btns[] = {selectbtn, ticketbookbusbtn, ticketbookflightbtn, confirmbtn, busbookbtn, flightbookbtn, signoutbtn};
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

    

    myconnection mc;
    public ArrayList<Users> requests(){
        ArrayList<Users> requests = new ArrayList();
        String sql = "select userID, packageID, requestNo, travelers, username, destination, PackageType from selection";
        mc = new myconnection();
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            Users user;
            while(rs.next()){
                user = new Users(rs.getInt("userID"), rs.getInt("packageID"), rs.getInt("requestNo"), rs.getInt("travelers"), rs.getString("username"), rs.getString("destination"), rs.getString("PackageType"));
                requests.add(user);
            }
        }catch(Exception e){System.out.println(e);}
        
        return requests;
    } 
    
    public void show_requests(){
        
        ArrayList<Users> list = requests();
        model = (DefaultTableModel)requests_table.getModel();
        Object rows [] = new Object[7];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getUserId();
            rows[1] = list.get(i).getUserName();
            rows[2] = list.get(i).getPackageId();
            rows[3] = list.get(i).getRequestNo();
            rows[4] = list.get(i).getTravelers();
            rows[5] = list.get(i).getDestination();
            rows[6] = list.get(i).getPackageType();
            model.addRow(rows);
        }
        
    }
    
     public ArrayList<Flights> browse_flights(){
        ArrayList<Flights> flights = new ArrayList();
        String sql = "select * from flights";
        mc = new myconnection();
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            Flights flight;
            while(rs.next()){
                flight = new Flights(rs.getString("destination"), rs.getString("flightType"), rs.getInt("price"), rs.getInt("TicketNo"));
                flights.add(flight);
            }
        }catch(Exception e){System.out.println(e);}
        
        return flights;
    } 
    
    public void show_flights(){
        ArrayList<Flights> list = browse_flights();
        model = (DefaultTableModel)flights_table.getModel();
        Object rows [] = new Object[4];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getDestination();
            rows[1] = list.get(i).getType();
            rows[2] = list.get(i).getPrice();
            rows[3] = list.get(i).getTicketNo();
            model.addRow(rows);
        }
        
    }
    
         public ArrayList<Bus> browse_buses(){
        ArrayList<Bus> buses = new ArrayList();
        String sql = "select * from buses";
        mc = new myconnection();
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            Bus bus;
            while(rs.next()){
                bus = new Bus(rs.getString("country"), rs.getString("BusType"), rs.getInt("price"), rs.getInt("TicketNo"));
                buses.add(bus);
            }
        }catch(Exception e){System.out.println(e);}
        
        return buses;
    } 
    
    public void show_buses(){
        ArrayList<Bus> list = browse_buses();
        model = (DefaultTableModel)bus_table.getModel();
        Object rows [] = new Object[4];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getCountry();
            rows[1] = list.get(i).getType();
            rows[2] = list.get(i).getPrice();
            rows[3] = list.get(i).getTicketNo();
            model.addRow(rows);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        signoutbtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        panelcenter = new javax.swing.JPanel();
        pc1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requests_table = new javax.swing.JTable();
        ticketbookflightbtn = new javax.swing.JButton();
        ticketbookbusbtn = new javax.swing.JButton();
        selectbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        statuslabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        selectedlabel = new javax.swing.JLabel();
        flightpanel = new javax.swing.JPanel();
        flightlabel = new javax.swing.JLabel();
        buspanel = new javax.swing.JPanel();
        buslabel = new javax.swing.JLabel();
        confirmbtn = new javax.swing.JButton();
        pc2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        flights_table = new javax.swing.JTable();
        flightbookbtn = new javax.swing.JButton();
        flightsearchfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        flightdatepicker = new org.jdesktop.swingx.JXDatePicker();
        flighttimefield = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        flightplusbtn = new javax.swing.JButton();
        flightminusbtn = new javax.swing.JButton();
        pc3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bus_table = new javax.swing.JTable();
        busbookbtn = new javax.swing.JButton();
        bussearchfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        busdatepicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        busplusbtn = new javax.swing.JButton();
        bustimefield = new javax.swing.JTextField();
        busminusbtn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(338, 650));

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseenterred(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Check Requests");

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\check.png")); // NOI18N

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
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
                mouseexited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Search Flights");

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\flight (1).png")); // NOI18N

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                mouseexited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Search Buses");

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\bus.png")); // NOI18N

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1552, 250));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(338, 179));

        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\logo2.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\icon 2-02 (1).png")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel14.setText("      Admin");

        signoutbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        signoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        signoutbtn.setText("Sign Out");
        signoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbtnActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\packagescover\\title.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(signoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        panelcenter.setPreferredSize(new java.awt.Dimension(1214, 700));
        panelcenter.setLayout(new java.awt.CardLayout());

        pc1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setText("Check Requests");

        requests_table.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        requests_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "userID", "Username", "packageID", "requestNo", "Travelers", "Destination", "Package Type"
            }
        ));
        requests_table.setFocusable(false);
        requests_table.setGridColor(new java.awt.Color(51, 51, 51));
        requests_table.setOpaque(false);
        requests_table.setRowHeight(25);
        requests_table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        requests_table.getTableHeader().setReorderingAllowed(false);
        requests_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requests_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requests_table);

        ticketbookflightbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ticketbookflightbtn.setForeground(new java.awt.Color(255, 255, 255));
        ticketbookflightbtn.setText("Book Flight Tickets");
        ticketbookflightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketbookflightbtnActionPerformed(evt);
            }
        });

        ticketbookbusbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ticketbookbusbtn.setForeground(new java.awt.Color(255, 255, 255));
        ticketbookbusbtn.setText("Book Bus Tickets");
        ticketbookbusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketbookbusbtnActionPerformed(evt);
            }
        });

        selectbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        selectbtn.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn.setText("Select");
        selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Status");

        statuslabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(253, 160));

        selectedlabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        selectedlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectedlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(selectedlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        flightpanel.setBackground(new java.awt.Color(102, 102, 102));
        flightpanel.setPreferredSize(new java.awt.Dimension(253, 160));

        flightlabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        flightlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout flightpanelLayout = new javax.swing.GroupLayout(flightpanel);
        flightpanel.setLayout(flightpanelLayout);
        flightpanelLayout.setHorizontalGroup(
            flightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        flightpanelLayout.setVerticalGroup(
            flightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightpanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(flightlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        buspanel.setBackground(new java.awt.Color(102, 102, 102));
        buspanel.setPreferredSize(new java.awt.Dimension(253, 160));

        buslabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        buslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout buspanelLayout = new javax.swing.GroupLayout(buspanel);
        buspanel.setLayout(buspanelLayout);
        buspanelLayout.setHorizontalGroup(
            buspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        buspanelLayout.setVerticalGroup(
            buspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buspanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(buslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        confirmbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        confirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pc1Layout = new javax.swing.GroupLayout(pc1);
        pc1.setLayout(pc1Layout);
        pc1Layout.setHorizontalGroup(
            pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
            .addGroup(pc1Layout.createSequentialGroup()
                .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(selectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ticketbookflightbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ticketbookbusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pc1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pc1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pc1Layout.setVerticalGroup(
            pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ticketbookflightbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ticketbookbusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelcenter.add(pc1, "card2");

        pc2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Search Flights");

        flights_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Flight Type", "Price", "TicketNo"
            }
        ));
        flights_table.setFocusable(false);
        flights_table.setOpaque(false);
        flights_table.setRowHeight(25);
        flights_table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(flights_table);

        flightbookbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        flightbookbtn.setForeground(new java.awt.Color(255, 255, 255));
        flightbookbtn.setText("Book");
        flightbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightbookbtnActionPerformed(evt);
            }
        });

        flightsearchfield.setBackground(new java.awt.Color(51, 51, 51));
        flightsearchfield.setForeground(new java.awt.Color(255, 255, 255));
        flightsearchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightsearchfieldActionPerformed(evt);
            }
        });
        flightsearchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                flightsearchfieldKeyReleased(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\search.png")); // NOI18N

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("----------------------------------------------------------------------------");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Select Departure Date");

        flightdatepicker.setBackground(new java.awt.Color(51, 51, 51));
        flightdatepicker.setForeground(new java.awt.Color(51, 51, 51));
        flightdatepicker.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        flightdatepicker.setOpaque(true);

        flighttimefield.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        flighttimefield.setText("12 PM");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel21.setText("Select Departure Time");

        flightplusbtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        flightplusbtn.setText("+");
        flightplusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightplusbtnActionPerformed(evt);
            }
        });

        flightminusbtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        flightminusbtn.setText("-");
        flightminusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightminusbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pc2Layout = new javax.swing.GroupLayout(pc2);
        pc2.setLayout(pc2Layout);
        pc2Layout.setHorizontalGroup(
            pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
            .addGroup(pc2Layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pc2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(flightminusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flighttimefield))
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flightsearchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pc2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flightplusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(flightbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)))
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flightdatepicker, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(158, 158, 158))
        );
        pc2Layout.setVerticalGroup(
            pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pc2Layout.createSequentialGroup()
                                .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(flightsearchfield, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(pc2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(pc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flighttimefield)
                            .addComponent(flightbookbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(flightminusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flightplusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pc2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(flightdatepicker, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
        );

        panelcenter.add(pc2, "card3");

        pc3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Search Buses");

        bus_table.setForeground(new java.awt.Color(0, 0, 0));
        bus_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "Bus Type", "Price", "TicketNo"
            }
        ));
        bus_table.setFocusable(false);
        bus_table.setOpaque(false);
        bus_table.setRowHeight(25);
        bus_table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(bus_table);

        busbookbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        busbookbtn.setForeground(new java.awt.Color(255, 255, 255));
        busbookbtn.setText("Book");
        busbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busbookbtnActionPerformed(evt);
            }
        });

        bussearchfield.setBackground(new java.awt.Color(51, 51, 51));
        bussearchfield.setForeground(new java.awt.Color(255, 255, 255));
        bussearchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bussearchfieldKeyReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\programs\\projects\\TravelsAndTours\\src\\SDAproject\\icons\\search.png")); // NOI18N

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("-----------------------------------------------------------------------");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Select Date");

        busplusbtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        busplusbtn.setText("+");
        busplusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busplusbtnActionPerformed(evt);
            }
        });

        bustimefield.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        bustimefield.setText("12 PM");

        busminusbtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        busminusbtn.setText("-");
        busminusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busminusbtnActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel22.setText("Select Departure Time");

        javax.swing.GroupLayout pc3Layout = new javax.swing.GroupLayout(pc3);
        pc3.setLayout(pc3Layout);
        pc3Layout.setHorizontalGroup(
            pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pc3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(455, 455, 455))
            .addGroup(pc3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(busminusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bustimefield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busplusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bussearchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(busbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busdatepicker, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        pc3Layout.setVerticalGroup(
            pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pc3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bustimefield)
                            .addComponent(busminusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(busplusbtn)))
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(busdatepicker, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pc3Layout.createSequentialGroup()
                        .addGroup(pc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bussearchfield)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(busbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
        );

        panelcenter.add(pc3, "card4");

        getContentPane().add(panelcenter, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked
        // TODO add your handling code here:
        if(evt.getSource()==p1){
            visibility(true, false, false);
        }
        if(evt.getSource()==p2){
           visibility(false, true, false);
            
        }
        
        if(evt.getSource()==p3){
            visibility(false, false, true);
        }
    }//GEN-LAST:event_mouseclicked

    private void mouseenterred(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseenterred
        // TODO add your handling code here:
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
    }//GEN-LAST:event_mouseenterred

    private void mouseexited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseexited
        // TODO add your handling code here:
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
    }//GEN-LAST:event_mouseexited

    private void requests_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requests_tableMouseClicked
        // TODO add your handling code here:
        
        mc = new myconnection();
        int row = requests_table.getSelectedRow();
        String clicked = (requests_table.getModel().getValueAt(row, 0).toString());
        String sql = "select * from selection where userID = " + clicked;
        String sql2 = "select * from ticketsinfo where userID = " + clicked;
//        String sql3 = "select * from ticketsinfo where userID = " + clicked;
//        String sql4 = "select * from ticketsinfo where userID = " + clicked;
        try{
             ResultSet rs = mc.st.executeQuery(sql);
             
             
             
             while(rs.next()){
                 if(rs.getString("confirmation") != null){
                     statuslabel.setText("Request Fullfilled");
                 }
                 else{
                     statuslabel.setText("Request Pending");
                 }
             }
         
             ResultSet rs1 = mc.st.executeQuery(sql2);
             
             if(rs1.next()){
//                 if(rs1.getInt("userID") == Integer.parseInt(clicked)){
                     selectedlabel.setText("Selected");
                 }
                 else{
                     selectedlabel.setText("Not Selected");
                 }
//             }
             ResultSet rs2 = mc.st.executeQuery(sql2);
             
             if(rs2.next()){
//                 if(rs2.getString("flightticketno") != null && rs2.getInt("userID") == Integer.parseInt(clicked)){
                     flightlabel.setText("<html><p>Flight Tickets<br>Booked<p></html>");
                 }
                 else{
                     flightlabel.setText("<html><p>Flight Tickets<br>Not Booked<p></html>");
                 }
//             }
             
             ResultSet rs3 = mc.st.executeQuery(sql2);
             
             if(rs3.next()){
//                 if(rs3.getString("busticketno") != null && rs3.getInt("userID") == Integer.parseInt(clicked)){
                     buslabel.setText("<html><p>Bus Tickets<br>Booked<p></html>");
                 }
                 else{
                     buslabel.setText("<html><p>Flight Tickets<br>Not Booked<p></html>");
                 }
//             }
             
              
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_requests_tableMouseClicked

    private void ticketbookflightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketbookflightbtnActionPerformed
        // TODO add your handling code here:
        visibility(false, true, false);
    }//GEN-LAST:event_ticketbookflightbtnActionPerformed

    private void ticketbookbusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketbookbusbtnActionPerformed
        // TODO add your handling code here:
        visibility(false, false, true);

    }//GEN-LAST:event_ticketbookbusbtnActionPerformed

   
    private void selectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnActionPerformed
        // TODO add your handling code here:
        try{
        int row = requests_table.getSelectedRow();
        String clicked = (requests_table.getModel().getValueAt(row, 0).toString());
        String username = (requests_table.getModel().getValueAt(row, 1).toString());
        String travelers = (requests_table.getModel().getValueAt(row, 4).toString());
        int travelno = Integer.parseInt(travelers);
        int userid = Integer.parseInt(clicked);
        mc = new myconnection();
        //String sql = "insert into ticketsInfo (userID, username) values(" + userid + ", '" + username +"')";
        try{
            for(int i=0; i<travelno; i++){
            mc.st.executeUpdate("insert into ticketsInfo (userID, username, traveler) values(" + userid + ", '" + username +"', "+ (i+1)+")");}
        }catch(Exception e){System.out.println(e);}
        
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Please select a row");}
        
    }//GEN-LAST:event_selectbtnActionPerformed

    private void flightbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightbookbtnActionPerformed
        // TODO add your handling code here:
        try{
        mc = new myconnection();
        int t = 0;
        String date = flightdatepicker.getDate().toString();
        date = date.substring(0, 7) + date.substring(date.length()-5, date.length());
        String time = flighttimefield.getText(); 
        int row = flights_table.getSelectedRow();
        String clicked = (flights_table.getModel().getValueAt(row, 3).toString());
        int ticketno = Integer.parseInt(clicked);
        System.out.println(ticketno);
        String result = JOptionPane.showInputDialog("Enter user ID");
        int id = Integer.parseInt(result);
        System.out.println(id);
        String sql = "select traveler from ticketsinfo where userID = " + id;
        String sql2 = "update ticketsinfo set departuredate = '" + date + "', departuretime = '" + time + "' where userID = "+id;
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
                t = rs.getInt("traveler");
            }
            mc.st.executeUpdate(sql2);
        }catch(Exception e){System.out.println(e);}
        ReservationBuilder reservetickets = new ReservationBuilder();
        reservetickets.FlightReservation(id, ticketno, t);
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_flightbookbtnActionPerformed

    private void busbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busbookbtnActionPerformed
        // TODO add your handling code here:
        try{
        int t = 0;
        mc = new myconnection();
        int row = bus_table.getSelectedRow();
        String clicked = (bus_table.getModel().getValueAt(row, 3).toString());
        int ticketno = Integer.parseInt(clicked);
        String result = JOptionPane.showInputDialog("Enter user ID");
        int id = Integer.parseInt(result);
        System.out.println(id);
         String sql = "select traveler from ticketsinfo where userID = " + id;
        try{
            ResultSet rs = mc.st.executeQuery(sql);
            while(rs.next()){
                t = rs.getInt("traveler");
            }
        }catch(Exception e){System.out.println(e);}
        ReservationBuilder reservetickets = new ReservationBuilder();
        reservetickets.BusReservation(id, ticketno, t);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Please select a row");}
    }//GEN-LAST:event_busbookbtnActionPerformed

    private void flightsearchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsearchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightsearchfieldActionPerformed

    private void flightsearchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightsearchfieldKeyReleased
        // TODO add your handling code here:
       model = (DefaultTableModel)flights_table.getModel();
       String search = flightsearchfield.getText();
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       flights_table.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_flightsearchfieldKeyReleased

    private void bussearchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bussearchfieldKeyReleased
        // TODO add your handling code here:
       model = (DefaultTableModel)bus_table.getModel();
       String search = bussearchfield.getText();
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       bus_table.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_bussearchfieldKeyReleased

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        // TODO add your handling code here:
        mc = new myconnection();
        int row = requests_table.getSelectedRow();
        String clicked = (requests_table.getModel().getValueAt(row, 0).toString());
        int id = Integer.parseInt(clicked);
        String sql = "update selection set confirmation = '<html><p>Your tickets has been confirmed.. <br><br> Please click to see details</p></html>' where userID = " + id;
        try{
            mc.st.executeUpdate(sql);
        }catch(Exception e){System.out.println(e);}

        
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void signoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_signoutbtnActionPerformed

    private void flightplusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightplusbtnActionPerformed
        // TODO add your handling code here:
        String prefix = flighttimefield.getText().substring(0, 2);
        String suffix = flighttimefield.getText().substring(2,flighttimefield.getText().length());
        suffix = suffix.replaceAll("\\s", "");
        prefix = prefix.replaceAll("\\s+","");
        int time = Integer.parseInt(prefix);
        
        time++;
        String completetime = "";
        if(time > 12 && suffix.equalsIgnoreCase("PM")){
            time = 1;
            suffix = "AM";
        }else if(time > 12 && suffix.equalsIgnoreCase("AM")){
            time = 1;
            suffix = "PM";
        }
        completetime = time +" "+ suffix;
        flighttimefield.setText(completetime);
        
    }//GEN-LAST:event_flightplusbtnActionPerformed

    private void flightminusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightminusbtnActionPerformed
        // TODO add your handling code here:
        String prefix = flighttimefield.getText().substring(0, 2);
        String suffix = flighttimefield.getText().substring(2,flighttimefield.getText().length());
        suffix = suffix.replaceAll("\\s", "");
        prefix = prefix.replaceAll("\\s+","");
        int time = Integer.parseInt(prefix);
        
        time--;
        String completetime = "";
        if(time < 1 && suffix.equalsIgnoreCase("PM")){
            time = 12;
            suffix = "AM";
        }else if(time < 1 && suffix.equalsIgnoreCase("AM")){
            time = 12;
            suffix = "PM";
        }
        completetime = time +" "+ suffix;
        flighttimefield.setText(completetime);
    }//GEN-LAST:event_flightminusbtnActionPerformed

    private void busplusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busplusbtnActionPerformed
        // TODO add your handling code here:
        String prefix = bustimefield.getText().substring(0, 2);
        String suffix = bustimefield.getText().substring(2,bustimefield.getText().length());
        suffix = suffix.replaceAll("\\s", "");
        prefix = prefix.replaceAll("\\s+","");
        int time = Integer.parseInt(prefix);
        
        time++;
        String completetime = "";
        if(time > 12 && suffix.equalsIgnoreCase("PM")){
            time = 1;
            suffix = "AM";
        }else if(time > 12 && suffix.equalsIgnoreCase("AM")){
            time = 1;
            suffix = "PM";
        }
        completetime = time +" "+ suffix;
        bustimefield.setText(completetime);
    }//GEN-LAST:event_busplusbtnActionPerformed

    private void busminusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busminusbtnActionPerformed
        // TODO add your handling code here:
        String prefix = bustimefield.getText().substring(0, 2);
        String suffix = bustimefield.getText().substring(2,bustimefield.getText().length());
        suffix = suffix.replaceAll("\\s", "");
        prefix = prefix.replaceAll("\\s+","");
        int time = Integer.parseInt(prefix);
        
        time--;
        String completetime = "";
        if(time < 1 && suffix.equalsIgnoreCase("PM")){
            time = 12;
            suffix = "AM";
        }else if(time < 1 && suffix.equalsIgnoreCase("AM")){
            time = 12;
            suffix = "PM";
        }
        completetime = time +" "+ suffix;
        bustimefield.setText(completetime);
    }//GEN-LAST:event_busminusbtnActionPerformed

    public void visibility(boolean PC1, boolean PC2, boolean PC3){
        pc1.setVisible(PC1);
        pc2.setVisible(PC2);
        pc3.setVisible(PC3);
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
            java.util.logging.Logger.getLogger(AdminPanell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bus_table;
    private javax.swing.JButton busbookbtn;
    private org.jdesktop.swingx.JXDatePicker busdatepicker;
    private javax.swing.JLabel buslabel;
    private javax.swing.JButton busminusbtn;
    private javax.swing.JPanel buspanel;
    private javax.swing.JButton busplusbtn;
    private javax.swing.JTextField bussearchfield;
    private javax.swing.JTextField bustimefield;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JButton flightbookbtn;
    private org.jdesktop.swingx.JXDatePicker flightdatepicker;
    private javax.swing.JLabel flightlabel;
    private javax.swing.JButton flightminusbtn;
    private javax.swing.JPanel flightpanel;
    private javax.swing.JButton flightplusbtn;
    private javax.swing.JTable flights_table;
    private javax.swing.JTextField flightsearchfield;
    private javax.swing.JTextField flighttimefield;
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
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel panelcenter;
    private javax.swing.JPanel pc1;
    private javax.swing.JPanel pc2;
    private javax.swing.JPanel pc3;
    private javax.swing.JTable requests_table;
    private javax.swing.JButton selectbtn;
    private javax.swing.JLabel selectedlabel;
    private javax.swing.JButton signoutbtn;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JButton ticketbookbusbtn;
    private javax.swing.JButton ticketbookflightbtn;
    // End of variables declaration//GEN-END:variables
}

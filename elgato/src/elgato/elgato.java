/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgato;

import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.Frame.ICONIFIED;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author john
 */
public class elgato extends javax.swing.JFrame {
     private int pointX;
    private int pointY;
    


    
   

    public elgato() {
     JLabel backgroundLabel = createBackgroundLabel();
      
      try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(elgato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(elgato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(elgato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(elgato.class.getName()).log(Level.SEVERE, null, ex);
        }
SwingUtilities.updateComponentTreeUI ( this ) ;

           

   
                  
   
                  
           
                  
                  

               
      
        
        
        
        
        
        
        
        
        
  

  JButton jButton1 = new JButton("1ST INSTALL");
                jButton1.setHorizontalAlignment(JButton.CENTER);

             jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
                          String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/elgato/src/elgato/1.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }

			}
		});
             
              JButton jButton2 = new JButton("2ND");
                         jButton2.setHorizontalAlignment(JButton.CENTER);

        jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/elgato/src/elgato/2.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
  
        JButton jButton3 = new JButton("3RD");
        jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/elgato/src/elgato/3.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
		
               
        
        
        
                    JButton jButton5 = new JButton("MINIMIZE");
        jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				   		setState(ICONIFIED);


			}
		});
        
        
        JButton jButton6 = new JButton("CLOSE");
        jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
           System.exit(0);
			}
		});
        
              JButton jButton7 = new JButton("RUN ELGATO");
        jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
      	     String command[] = {"/bin/sh", "-c", 
                            "gnome-terminal --execute /home/john/NetBeansProjects/elgato/src/elgato/4.sh"};
        Runtime rt = Runtime.getRuntime();                                       
        try {                                                                    
            rt.exec(command);                                                    
        } catch(Exception ex) {                                                  
            // handle ex                                               
                            }
                                	}
		});
               
    JPanel panel1 = new JPanel();
    
    panel1.setOpaque( false );
    


  

 

    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(jButton1);
    buttonBox.add(jButton2);
    buttonBox.add(jButton3);





    addItem(panel1, buttonBox, 7, 4, 9, 1, GridBagConstraints.PAGE_END);
 





        
        setContentPane(backgroundLabel);

        
          setLayout(new FlowLayout());     
            


                  
        add(jButton1);
          add(new JLabel(""));
         
        add(jButton2);
                            add(new JLabel(""));

                    add(new JLabel(""));


                            add(new JLabel(""));

        add(jButton5);
                            add(new JLabel(""));

        add(jButton6);
                            add(new JLabel(""));
        add(jButton3);

                            add(new JLabel(""));
        add(jButton7);

                            add(new JLabel(""));

                            add(new JLabel(""));

                            add(new JLabel(""));

                            add(new JLabel(""));

                            add(new JLabel(""));

                   add(new JLabel(""));

       add(new JLabel(""));

add(new JLabel(""));

add(new JLabel(""));

 add(new JLabel(""));

                 add(new JLabel(""));

                             add(new JLabel(""));

                          add(new JLabel(""));

                                    add(new JLabel(""));

                                            add(new JLabel(""));

                                              add(new JLabel(""));

                                           add(new JLabel(""));

                                              add(new JLabel(""));

                                                add(new JLabel(""));

                                                          add(new JLabel(""));

                                                          add(new JLabel(""));

                                                         add(new JLabel(""));

                                                                    add(new JLabel(""));

                                                                         add(new JLabel(""));

                                                                          add(new JLabel(""));

                                                                               add(new JLabel(""));

                                                                                             add(new JLabel(""));

                                                                                 add(new JLabel(""));

                                                                          add(new JLabel(""));

                                                                          add(new JLabel(""));

                                                                              add(new JLabel(""));

                                                                               add(new JLabel(""));

                                                                                    add(new JLabel(""));

                                                                                          add(new JLabel(""));

                                                                                                  add(new JLabel(""));

        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    
         
    }



      private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
    GridBagConstraints gc = new GridBagConstraints();
    gc.gridx = x;
    gc.gridy = y;
    gc.gridwidth = width;
    gc.gridheight = height;
    gc.weightx = 100.0;
    gc.weighty = 100.0;
    gc.insets = new Insets(5, 5, 5, 5);
    gc.anchor = align;
    gc.fill = GridBagConstraints.PAGE_END;
    p.add(c, gc);
  }




    
    private JLabel createBackgroundLabel() {
        JLabel label = new JLabel(new ImageIcon());
        label.setLayout(new GridBagLayout());
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elgato/31.png"))); // NOI18N;
        label.setDoubleBuffered(true);
         
        label.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                elgato.this.setLocation(elgato.this.getLocation().x + e.getX() - pointX,
                      elgato.this.getLocation().y + e.getY() - pointY);
            }
        });
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                pointX = e.getX();
                pointY = e.getY();
            }
        });

        return label;
    }
    



    
    public static void main(String[] args) {
        


        
        
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new elgato();
            }
        });
    }






   

}






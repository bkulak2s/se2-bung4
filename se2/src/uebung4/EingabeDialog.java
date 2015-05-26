package uebung4;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.Toolkit;

public class EingabeDialog extends javax.swing.JFrame {

	
	  private Toolkit t;
	    private int x = 0;
	    private int y = 0; 
	    private int b = 800; // Breite
	    private int h = 600; // Höhe
	    
	    // Komponenten
	    private JMenuBar menubar1;
	    
	    private JMenu menubar1_menu1;
	    private JMenu menubar1_menu2;
	    private JMenu menubar1_menu3;
	    
	    private JMenuItem menubar1_menu1_menuitem1;
	    private JMenuItem menubar1_menu1_menuitem2;
	    private JMenuItem menubar1_menu1_menuitem3;
	    
	    private JMenuItem menubar1_menu2_menuitem1;
	    private JMenuItem menubar1_menu2_menuitem2;
	    private JMenuItem menubar1_menu2_menuitem3;
	    
	    private JMenuItem menubar1_menu3_menuitem1;
	    private JMenuItem menubar1_menu3_menuitem2;
	    private JMenuItem menubar1_menu3_menuitem3;
	    
	    public EingabeDialog() {
	        t = Toolkit.getDefaultToolkit();
	        
	        Dimension d = t.getScreenSize();
	        x = (int) ((d.getWidth() - b) / 2);
	        y = (int) ((d.getHeight() - h) /2);
	        
	        setTitle("Eingabe von User Stories");
	        setBounds(x, y, b, h);

	        
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        setVisible(true);
	    }
	    
	    private void initComponents() {
	        this.menubar1 = new JMenuBar();
	        this.menubar1_menu1 = new JMenu("Menu 1");
	    }
	    
	    public static void main(String[] args) {
	        new EingabeDialog();
	    }
	    
}

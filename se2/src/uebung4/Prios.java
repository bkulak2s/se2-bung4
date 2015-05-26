package uebung4;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Prios {

	 static int style = Font.PLAIN, 
             size = 12; 
  public Prios() {
  
  Panel panel1 = new Panel();
      panel1.setLayout(new GridLayout(2, 2));
          
      Label taLabel = new Label("User Story 1: ");
      taLabel.setAlignment(Label.LEFT);
      TextArea  ta = new TextArea(6,20);
          
      panel1.add(taLabel);
      panel1.add(ta);
          
      Panel panel2 = new Panel();
      panel2.setLayout(new GridLayout());
      
      Label pfLabel = new Label("Priorität von User Story 1:");
      pfLabel.setAlignment(Label.LEFT);
      TextField pf = new TextField();
      pf.setEchoChar('*');
          
      panel1.add(pfLabel);
      panel1.add(pf);
  } 
  public static void main( String[] args ) { 
    JFrame z = new JFrame(); 
  
    z.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
 
    final JTextArea t = new JTextArea("User Story 1: "); 
    final JTextArea a = new JTextArea("User Story 2: "); 
    final JTextArea c = new JTextArea("User Story 3: "); 
    final JTextArea d = new JTextArea("User Story 4: ");
    final JTextArea e = new JTextArea("User Story 5: "); 
    final JTextArea j = new JTextArea("User Story 6: ");
    final JTextArea k = new JTextArea("User Story 7: ");
    final JTextArea l = new JTextArea("User Story 8: ");
    final JTextArea m = new JTextArea("User Story 9: ");
    final JTextArea n = new JTextArea("User Story 10: ");
    final JTextArea o = new JTextArea("User Story 11: ");
    final JTextArea p = new JTextArea("User Story 12: ");
    final JTextArea q = new JTextArea("User Story 13: ");
    final JTextArea r = new JTextArea("User Story 14: ");
    final JTextArea s = new JTextArea("User Story 15: ");
    final JTextArea x = new JTextArea("User Story 16: ");
    final JTextArea u = new JTextArea("User Story 17: ");
    final JTextArea y = new JTextArea("User Story 18: ");
    final JTextArea v = new JTextArea("User Story 19: ");
    final JTextArea w = new JTextArea("User Story 20: ");
    
    t.setFont( new Font(Font.SANS_SERIF, style, size) ); 
    z.add( new JScrollPane( t ) ); 
    a.setFont( new Font(Font.SANS_SERIF, style, size) ); 
    z.add( new JScrollPane( a ) ); 
    c.setFont( new Font(Font.SANS_SERIF, style, size) ); 
    z.add( new JScrollPane( c ) ); 
 
    ActionListener al = new ActionListener() 
    { 
      public void actionPerformed( ActionEvent e ) 
      { 
        if ( "Ende".equals(e.getActionCommand()) ) 
          System.exit( 0 ); 
 
        t.setFont( new Font(Font.SANS_SERIF, style, size) ); 
        a.setFont( new Font(Font.SANS_SERIF, style, size) ); 
        c.setFont( new Font(Font.SANS_SERIF, style, size) );

      } 
    }; 
 
    JPanel p1 = new JPanel( new GridLayout(1,3) ); 
    t.add( p1, BorderLayout.PAGE_START ); 
    JPanel p2 = new JPanel( new GridLayout(1,3) ); 
    a.add( p2, BorderLayout.PAGE_START ); 
    JPanel p3 = new JPanel( new GridLayout(1,3) ); 
    c.add( p3, BorderLayout.PAGE_START ); 
    
    AbstractButton b; 
 
    t.add( b = new JButton("Ende") ); 
    b.addActionListener( al ); 
 
    
    z.setSize( 400, 600 );
    z.setVisible( true ); 
    
  } 
}


package uebung4;

import  java.awt.*;

public class EingabeUserStory extends Panel {

	

	   public EingabeUserStory() {
	      setLayout(new BorderLayout());
	          
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
	          
	      add(panel1, BorderLayout.NORTH);
	      add(panel2, BorderLayout.CENTER);
	   }
	      
	   public static void main(String args[]) {
	      EingabeUserStory ts = new EingabeUserStory();
	      Frame f = new Frame("User Stories eingeben");
	      f.add(ts, BorderLayout.CENTER);
	      f.pack();
	      f.setVisible(true);   
	   }
}

package uebung4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class MyGuiUserStory extends JFrame implements ActionListener {
    JTable table = null;
    JPanel panel = new JPanel();
    JScrollPane scrollPane=null;
    JLabel namevalue=null;
    JLabel name=null;
    JButton button1,button2,button3,button4,button5;
    
    public MyGuiUserStory() {
        JButton button1 = new JButton("Enter");
        button1.addActionListener(this);
        button1.setBounds(10, 5, 100, 50);
        panel.add(button1);
        
        
        JButton button2 = new JButton("dump");
        button2.addActionListener(this);
        button2.setBounds(10, 5, 150, 50);
        panel.add(button2);
        
        JButton button3 = new JButton("Exit");
        button3.addActionListener(this);
        button3.setBounds(40, 25, 400, 150);
        panel.add(button3);
        
        JButton button4 = new JButton("Store");
        button4.addActionListener(this);
        button4.setBounds(40, 25, 400, 150);
        panel.add(button4);
        
        JButton button5 = new JButton("Load");
        button5.addActionListener(this);
        button5.setBounds(40, 25, 400, 150);
        panel.add(button5);
        
        
        
        Object[][] data = { };
  
       String[] columnNames = {"ID der User Story:","Titel der User Story:","Risiko der User Story:"
                                ,"Mehrwert der User Story:","Strafe der User Story:","Priorisierung"};
       table = new JTable(data, columnNames);
       scrollPane = new JScrollPane(table);
  
       panel.setLayout(new FlowLayout());
       scrollPane.setLayout(new ScrollPaneLayout());
       panel.add(scrollPane);
       
       
      
       getContentPane().add(panel, BorderLayout.NORTH);
       getContentPane().add(scrollPane, BorderLayout.CENTER);
        
       setSize(900,200);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
  
    }
  
    private void printDebugData(){
        String NameValue_strtable=table.getValueAt(table.getSelectedRow(),0).toString();
        namevalue.setText(NameValue_strtable);
        repaint();
    }
     
    public static void main(String[] args) {
        MyGuiUserStory frame = new MyGuiUserStory();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
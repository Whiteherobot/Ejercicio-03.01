package a.ventanasypaneles;
//@michi

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana03 extends JFrame{
       private JPanel jPanel3;
    private List<JLabel> jLabelList;
    
    public Ventana03(String title) {
        super(title);
        this.setSize(500, 100);
        this.setLocation(80, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setLayout(new FlowLayout());
        this.setContentPane(this.jPanel3);
    }
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
        
    }
    public void iniciarPanel(){
       this.jPanel3 = new JPanel();
       this.jPanel3.setBackground(Color.BLUE);
       this.jPanel3.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
       this.jPanel3.setLayout(new FlowLayout());
   }
     public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("    Button 1    ");
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("    Button 3    ");
       this.jLabelList.get(2).setBackground(Color.LIGHT_GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("   2   ");
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("    Button 5    ");
       this.jLabelList.get(4).setBackground(Color.LIGHT_GRAY);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Long-Named Button 4"); 
      
       this.jPanel3.add(this.jLabelList.get(0));
       this.jPanel3.add(this.jLabelList.get(2));
       this.jPanel3.add(this.jLabelList.get(1));
       this.jPanel3.add(this.jLabelList.get(4));
       this.jPanel3.add(this.jLabelList.get(3));
       
       
     }
}

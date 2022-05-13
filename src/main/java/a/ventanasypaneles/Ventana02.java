package a.ventanasypaneles;
//@michi

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana02 extends JFrame{
    private JPanel jPanel2;
    private List<JLabel> jLabelList;
    
    public Ventana02(String title) {
        super(title);
        this.setSize(400, 200);
        this.setLocation(500, 40);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel2);
    }
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
        
    }
    public void iniciarPanel(){
       this.jPanel2 = new JPanel();
       this.jPanel2.setBackground(Color.BLUE);
       this.jPanel2.setBorder(BorderFactory.createTitledBorder("GridLayoud"));
       this.jPanel2.setLayout(new GridLayout(3,2));
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
       this.jLabelList.get(1).setBackground(Color.LIGHT_GRAY);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("    Button 3    ");
       this.jLabelList.get(2).setBackground(Color.LIGHT_GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("   2   ");
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("    Button 5    ");
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Long-Named Button 4"); 
      
       this.jPanel2.add(this.jLabelList.get(0));
       this.jPanel2.add(this.jLabelList.get(2));
       this.jPanel2.add(this.jLabelList.get(1));
       this.jPanel2.add(this.jLabelList.get(4));
       this.jPanel2.add(this.jLabelList.get(3));
       
       
     }
}

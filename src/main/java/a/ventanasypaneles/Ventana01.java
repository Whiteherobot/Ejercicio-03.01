package a.ventanasypaneles;
//@michi
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana01 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
    public Ventana01(String title) {
        super(title);
        this.setSize(400, 200);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
        
    }
    public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.BLUE);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("BorderLayaut"));
       this.jPanel1.setLayout(new BorderLayout());
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
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("   2   ");
       this.jLabelList.get(3).setBackground(Color.LIGHT_GRAY);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("    Button 5    ");
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Long-Named Button 4");        
       
       this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
       this.jPanel1.add(this.jLabelList.get(1),BorderLayout.WEST);
       this.jPanel1.add(this.jLabelList.get(2),BorderLayout.CENTER);
       this.jPanel1.add(this.jLabelList.get(3),BorderLayout.EAST);
       this.jPanel1.add(this.jLabelList.get(4),BorderLayout.SOUTH);
       
     
       
   }
    
}

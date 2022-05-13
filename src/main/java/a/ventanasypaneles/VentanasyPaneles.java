package a.ventanasypaneles;
//@michi
public class VentanasyPaneles {

    public static void main(String[] args) {
        var v1 = new Ventana01("BorderLayaut");
        v1.setVisible(true);
        var v2 = new Ventana02("GridLayaut");
        v2.setVisible(true);
        var v3 = new Ventana03("FlowLayout");
        v3.setVisible(true);
        var v4 = new VentanaBandera01("Bandera");
        v4.setVisible(true);
    }
}

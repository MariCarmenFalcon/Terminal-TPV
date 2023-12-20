import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonProducto extends JButton {
    private String nombre;
    private int cantidad;
    private ImageIcon imagen;
    //Incluyo una referencia al boton producto
    private BotonProducto botonProducto;    

    // Constructor
    public BotonProducto(String nombre, int cantidad, ImageIcon imagen) {
        super(nombre);
        this.nombre = nombre;
        this.cantidad = cantidad;        
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

  
}

import java.util.List;

public class Producto {
    private String nombre;
    private double precio;
    private int numeroReferencia;
    private int cantidad;
    private List <String> categoria;

    public Producto(String nombre, double precio, int numeroReferencia, int cantidad, List<String> categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.numeroReferencia = numeroReferencia;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getNumeroReferencia() {
        return numeroReferencia;
    }


    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public List<String> getCategoria() {
        return categoria;
    }


    public void setCategoria(List<String> categoria) {
        this.categoria = categoria;
    }


    public void agregar(){
        categoria.add("computadores");
        categoria.add("Celulares");
        categoria.add("Electrodomesticos");
        categoria.add("TV");
        categoria.add("Accesorios");
        categoria.add("Videjuegos");
        categoria.add("Audio y video");

        Producto producto1 = new Producto(nombre, precio, numeroReferencia, cantidad, categoria);

        
    }

    public void disminucion(){}

    public void eliminar(){}

    public void mostrar(){}
    
}

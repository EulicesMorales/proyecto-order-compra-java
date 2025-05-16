import java.util.Date;

public class OrdenCompra {
    private Integer ultimoIdentificador = 0;
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.identificador = ++ultimoIdentificador;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto){
        for(int i=0;i<productos.length;i++){
            if(productos[i]==null){
                productos[i] = producto;
                break;
            }
        }
    }

    public int calcularTotal(){
        int total = 0;
        for(Producto producto : productos){
            if(producto != null ){
                total += producto.getPrecio();
            }
        }
        return total;
    }
}

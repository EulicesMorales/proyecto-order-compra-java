import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana","Martinez");
        Cliente cliente2 = new Cliente("Fernando","Murcia");

        Producto  producto1 =  new Producto("LG", "Monitor",200);
        Producto  producto2 = new Producto("Sony","Teclado", 50);
        Producto  producto3 = new Producto("Hp","Mouse", 20);
        Producto  producto4 = new Producto("Lenovo","airpods", 40);
        Producto  producto5 = new Producto("LG","Televisor", 500);
        Producto  producto6 = new Producto("Samsung","Telefono", 400);
        Producto  producto7 = new Producto("Huawei","Telefono", 300);
        Producto  producto8 = new Producto("Kalley","Proyetector", 300);
        Producto  producto9 = new Producto("Mac","MacBook", 800);
        Producto  producto10 = new Producto("Mac","Iphone", 900);
        Producto  producto11 = new Producto("LG","Control", 10);
        Producto  producto12 = new Producto("Lenovo","Laptop", 600);

        OrdenCompra orden1 = new OrdenCompra("Compra de electrodomesticos");

        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto5);
        orden1.addProducto(producto6);
        orden1.addProducto(producto7);
        orden1.addProducto(producto9);

        System.out.println("Orden 1 = " + orden1.getIdentificador());
        System.out.println("Cliente = " + orden1.getCliente().getNombre());
        System.out.println("Productos:");
        for(Producto p : orden1.getProductos()){
            System.out.println(p.getNombre());
        }
        System.out.println("Total = " + orden1.calcularTotal());




    }
}

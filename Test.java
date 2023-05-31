package exam;
//
//import java.util.PriorityQueue;
//
//public class Test {
//    public static void main(String[] args) {
//        // Crear los pedidos
//        Pedido pedido1 = new Pedido("Juan", "helados", 20, 4);
//        Pedido pedido2 = new Pedido("Pedro", "pollo", 58, 2);
//        Pedido pedido3 = new Pedido("Miguel", "Chocolates", 35, 3);
//        Pedido pedido4 = new Pedido("Maria", "Pizza", 75, 1);
//        Pedido pedido5 = new Pedido("Rosa", "Torta", 65, 2);
//        Pedido pedido6 = new Pedido("Americo", "gaseosa", 15, 4);
//        Pedido pedido7 = new Pedido("Lucio", "pan", 7, 4);
//        Pedido pedido8 = new Pedido("Laura", "torta helada", 90, 1);
//        Pedido pedido9 = new Pedido("Joab", "pasteles", 44, 3);
//        Pedido pedido10 = new Pedido("Ralph", "golosinas", 9, 4);
//
//        // Crear la cola de prioridades y agregar los pedidos
//        PriorityQueue<Pedido> colaPrioridades = new PriorityQueue<>((p1, p2) -> p2.getPrioridad() - p1.getPrioridad());
//        colaPrioridades.add(pedido1);
//        colaPrioridades.add(pedido2);
//        colaPrioridades.add(pedido3);
//        colaPrioridades.add(pedido4);
//        colaPrioridades.add(pedido5);
//        colaPrioridades.add(pedido6);
//        colaPrioridades.add(pedido7);
//        colaPrioridades.add(pedido8);
//        colaPrioridades.add(pedido9);
//        colaPrioridades.add(pedido10);
//
//        // Mostrar la asignación de prioridades a cada pedido
//        System.out.println("Asignación de prioridades:");
//        for (Pedido pedido : colaPrioridades) {
//            System.out.println(pedido.getNombre() + " - " + pedido.getMonto() + " soles - Prioridad: " + pedido.getPrioridad());
//        }
//
//        // Mostrar el orden de atención de los pedidos
//        System.out.println("\nOrden de atención de los pedidos:");
//        while (!colaPrioridades.isEmpty()) {
//            Pedido pedido = colaPrioridades.poll();
//            System.out.println(pedido.getNombre() + " - " + pedido.getProducto() + " - " + pedido.getMonto() + " soles");
//        }
//    }
//}
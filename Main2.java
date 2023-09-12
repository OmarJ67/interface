public class Main2 {
 public static void main(String[] args) {
Planta planta1 = new PlantaInterior("Perejil", "Aromática");
Planta planta2 = new PlantaExterior("Madreselva", "Trepadora");

System.out.println("Planta 1");
System.out.println("Nombre: " + planta1.obtenerNombre() + ", Tipo: " + planta1.obtenerTipo());
planta1.podar();
planta1.regar();
System.out.println("-------------------------------------------------");
System.out.println("Planta 2");
System.out.println("Nombre: " + planta2.obtenerNombre() + ", Tipo: " + planta2.obtenerTipo());
planta2.podar();
planta2.regar();
    }
}

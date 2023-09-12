public class PlantaExterior implements Planta {
private String nombre;
 private String tipo;
 public PlantaExterior(String nombre, String tipo) {
this.nombre = nombre;
this.tipo = tipo;
    }
@Override
public String obtenerNombre(){
return nombre;
  }
 @Override
public String obtenerTipo(){
return tipo;
 }
 @Override
  public void regar(){
 System.out.println("Se esta regando");
 }
 @Override
 public void podar(){
 System.out.println("No es necesario podar");
  }
}

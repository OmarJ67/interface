public class PlantaInterior implements Planta{
    private String nombre;
    private String tipo;
public PlantaInterior (String nombre, String tipo) {
        this.tipo = tipo;
        this.nombre = nombre;
    }
    @Override
    public String obtenerNombre() {
        return nombre;
    }
@Override
    public String obtenerTipo() {
        return tipo;
            }
@Override
    public void regar() {
        System.out.println("No se esta regando");
    }
@Override
    public void podar() {
        System.out.println("Se esta podando");
    }
  
}

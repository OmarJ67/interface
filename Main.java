public class Main {
    public static void main(String[] args) {
        EmpleadoMedioTiempo empleado1 = new EmpleadoMedioTiempo("Samuel", 3000);
        EmpleadoMedioTiempo empleado2 = new EmpleadoMedioTiempo("Jose", 6000); 
        EmpleadoTiempoCompleto empleado3 = new EmpleadoTiempoCompleto("Andres", 4500);
        EmpleadoTiempoCompleto empleado4 = new EmpleadoTiempoCompleto("Luis", 3200); 
 
        System.out.println("mostrar datos");
        System.out.println("Nombre" + empleado1.obtenerNombre());
        System.out.println("Salario" + empleado1.calcularSalario());
        System.out.println("-------------------------------------------");
        System.out.println("Nombre" + empleado2.obtenerNombre());
        System.out.println("Salario" + empleado2.calcularSalario());
        System.out.println("------------------------------------------");
        System.out.println("Nombre" + empleado3.obtenerNombre());
        System.out.println("Salario" + empleado3.calcularSalario());
        System.out.println("------------------------------------------");
        System.out.println("Nombre" + empleado4.obtenerNombre());
        System.out.println("Salario" + empleado4.calcularSalario());

    }
    }
    


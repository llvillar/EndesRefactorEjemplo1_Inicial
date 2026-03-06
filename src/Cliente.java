public class Cliente {

    public String nombre;
    public String email;
    public String telefono;

    public Cliente(String n, String e, String t) {
        nombre = n;
        email = e;
        telefono = t;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + email + " - " + telefono);
    }
}
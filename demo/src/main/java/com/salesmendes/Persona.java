package com.salesmendes;
/**
 * Clase persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    /**
     * Contrucutor con parametos
     * @param nombre
     * @param apellidos
     * @param edad
     * @param email
     */
    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Contructor Vacio
     */
    public Persona() {
    }

    /**
     * Factory method
     * @param datos
     * @return
     */
    public static Persona fromCsv(String datos) {
        if(datos==null){
            throw new IllegalArgumentException("Argumentos invladios");
        }
        String[] partes = datos.split(",");
        Persona persona = new Persona();
        persona.nombre = partes[0].trim();
        persona.apellidos = partes[1].trim();
        persona.edad = Integer.parseInt(partes[2].trim());
        persona.email = partes[3].trim();
        return persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

/*
 * INTERFASE
 */
package utlistas;

/**
 * @author EQUIPO
 */
public interface IPersona {

    String getId();
    
    String getNombre();

    void setNombre(String nombre);

    String getApellido();

    void setApellido(String apellido);

    int getEdad();

    void setEdad(int edad);
    
}

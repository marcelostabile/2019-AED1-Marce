 package parcial2fromta9;

/**
 * @author EQUIPO 1
 */
public class Afiliado implements IAfiliado {
    
    private Integer cedula;
    private String nombre;
    private String apellido;
    
    /*
     * Constructor.
     */
    public Afiliado(Integer cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /*
     * Lista Consultas Anotadas.
     */
    public ILista<IConsulta> listaConsultasAnotadas = new Lista<>();

    /*
     * Lista Consultas Históricas.
     */
    public ILista<IConsulta> listaConsultasHistoricas = new Lista<>();

    /*
     * Cédula.
     */ 
    @Override
    public Integer getCedula() {
        return this.cedula;
    }

    @Override
    public void setCedula(Integer unaCedula) {
        this.cedula = unaCedula;
    }
    
    /*
     * Nombre.
     */ 
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    /*
     * Apellido.
     */ 
    @Override
    public String getApellido() {
        return this.apellido;
    }
    
    @Override
    public void setApellido(String unApellido) {
        this.nombre = unApellido;
    }

    /**
     * Obtiene el listado de las consultas en las que el afiliado se encuentra anotado. 
     *
     * @return Lista de consultas anotadas.
     */
    @Override
    public ILista<IConsulta> getConsultasAnotadas() {
        return this.listaConsultasAnotadas;
    }
    
    /**
     * Obtiene el listado de las consultas históricas.
     *
     * @return Lista de consultas anotadas.
     */
    @Override
    public ILista<IConsulta> getConsultasHistoricas() {
        return this.listaConsultasHistoricas;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellido;
    }
}


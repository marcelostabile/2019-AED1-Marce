package parcial2fromta9;

/**
 *
 * @author bernardorychtenberg
 */
public interface IPadronAfiliados {

    /**
     *
     * Actualiza las consultas según: 1) Para cada afiliado, remueva de la lista
     * las consultas pendientes del día anterior y las inserte en la lista
     * histórica de consultas pasadas. 2) Devuelva una lista de los afiliados
     * que, estando anotados, no hayan concurrido a su consulta el día anterior
     */
    public void actualizarConsultas();

    /**
     *
     * Consulta que retorna los afiliados a una especialidad particular.
     */
    ILista<IAfiliado> afiliadosPorEspecialidad(String especialidad);

    public ILista<Afiliado> limpiar();

}

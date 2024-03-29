package pruebas.medicosas;
import tdaarbolbb.*;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 */
public class PlantillaMedicos extends TArbolBB<Medico> implements IPlantillaMedicos {

    @Override
    public DirectorioEspecialidad obtenerDirectorio(String laEspecialidad) {
        DirectorioEspecialidad miPlantilla = new DirectorioEspecialidad();
        LinkedList<Medico> misMedicos = inOrdenLinkedList();
        if (getRaiz()!= null){
            for (Medico medico : misMedicos){
                if (medico.getEspecialidad().equals(laEspecialidad)){
                    TElementoAB elementoMedico = new TElementoAB(medico.getNombre(),medico);
                    miPlantilla.insertar(elementoMedico);
                }
            }
        }
        return miPlantilla;
    }

  
  
}

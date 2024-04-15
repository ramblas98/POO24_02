import java.util.*;

class CuadroMedico {
    private List<Medico>[] medicosPorEspecialidad;
    
    public CuadroMedico() {
        medicosPorEspecialidad = new List[Especialidad.values().length];
        for (int i = 0; i < medicosPorEspecialidad.length; i++) {
            medicosPorEspecialidad[i] = new ArrayList<>();
        }
    }
    
    // Método para insertar un médico en el cuadro médico
    public void insertarMedico(Medico medico) {
        Especialidad especialidad = medico.getEspecialidad();
        medicosPorEspecialidad[especialidad.ordinal()].add(medico);
        ordenarMedicos(especialidad);
    }
    
    // Método para eliminar un médico del cuadro médico
    public void eliminarMedico(Medico medico) {
        Especialidad especialidad = medico.getEspecialidad();
        medicosPorEspecialidad[especialidad.ordinal()].remove(medico);
    }
    
    // Método para obtener el médico de mayor disponibilidad para una especialidad dada
    public Medico obtenerMedico(Especialidad especialidad) {
        List<Medico> medicosEspecialidad = medicosPorEspecialidad[especialidad.ordinal()];
        for (Medico medico : medicosEspecialidad) {
            if (medico.disponibilidad()) {
                return medico;
            }
        }
        return null;
    }
    
    // Método para ordenar los médicos por disponibilidad en una especialidad dada
    private void ordenarMedicos(Especialidad especialidad) {
        List<Medico> medicosEspecialidad = medicosPorEspecialidad[especialidad.ordinal()];
        medicosEspecialidad.sort((m1, m2) -> Integer.compare(m1.getCupo(), m2.getCupo()));
    }
}
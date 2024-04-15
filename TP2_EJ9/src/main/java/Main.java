import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    List<Medico> medicos = new ArrayList<>();
	    List<Historia> historias = new ArrayList<>();
	    
	    String lmedicos[] = {"Nortes", "Gutierrez", "Mayor", "Guillén", "Mateo"};
        int matriculas[] = {5677, 4568, 7890, 4567, 8976};
        Especialidad especialidades[] = {Especialidad.familia, Especialidad.traumatología, Especialidad.pediatría, Especialidad.internista, Especialidad.otorrino};
        String pacientes[] = {"Rocío", "Andrés", "Juan", "Marieta", "Alfonso"};
        EstadoInicial estados[] = {EstadoInicial.LEVE, EstadoInicial.GRAVE, EstadoInicial.MEDIO, EstadoInicial.LEVE, EstadoInicial.MEDIO};
        Especialidad area[] = {Especialidad.familia, Especialidad.traumatología, Especialidad.pediatría, Especialidad.internista, Especialidad.otorrino};
		
		for (int i=0; i<5; i++) {
		    Medico m = new Medico(lmedicos[i], matriculas[i], especialidades[i]);
    		medicos.add(m);
		}
		
		CuadroMedico cuadro = new CuadroMedico();
		for (Medico medico : medicos) {
		    cuadro.insertarMedico(medico);
		}
		
		for (int i=0; i<5; i++) {
		    Historia historia = new Historia(pacientes[i], estados[i], area[i]);
		    historias.add(historia);
		}
		
		for (Historia historia : historias) {
		    Especialidad especialidad = historia.getEspecialidad();
		    Medico medico = cuadro.obtenerMedico(especialidad);
		    medico.asignar(historia);
		    System.out.println(medico.getNombre() + " - " + historia.getCodigo() + " - " + historia.getId());
		}
	}
}



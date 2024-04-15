import java.util.HashMap;
import java.util.Map;



public class Medico {
    
    
    private String nombre;
    private Especialidad especialidad;
    private int cupo;
    private int matricula;
    private int numeroH; // posiblemente el número actual de pacientes
    private Map<Integer, Historia> misHistorias;

    public Medico(String nombre, int matricula, Especialidad especialidad, int cupo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cupo = cupo;
        this.matricula = matricula;
        this.numeroH = 0;
        this.misHistorias = new HashMap<>();
    }
    public Medico(String nombre, int matricula, Especialidad especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cupo = 10;
        this.matricula = matricula;
        this.numeroH = 0;
        this.misHistorias = new HashMap<>();
    }
    public Medico(String nombre, int matricula) {
        this.nombre = nombre;
        this.especialidad = Especialidad.familia;
        this.cupo = 10;
        this.matricula = matricula;
        this.numeroH = 0;
        this.misHistorias = new HashMap<>();
    }

    // Método para comprobar si el médico tiene disponibilidad para nuevos pacientes
    public boolean disponibilidad() {
        return numeroH < cupo;
    }

    // Método para asignar una nueva historia clínica a un paciente
    public void asignar(Historia h) {
        if (disponibilidad()) {
            misHistorias.put(h.getId(), h);
            numeroH++;
        } else {
            System.out.println("No hay cupo disponible para nuevos pacientes.");
        }
    }

    // Método para dar de alta a un paciente por su ID
    public void darAlta(int id) {
        if (misHistorias.containsKey(id)) {
            misHistorias.remove(id);
            numeroH--;
            System.out.println("Paciente dado de alta.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    // Método para dar de alta a un paciente por un código de cadena
    public void darAlta(String codigo) {
        Historia historiaARemover = null;
        for (Historia h : misHistorias.values()) {
            if (h.getCodigo().equals(codigo)) {
                historiaARemover = h;
                break;
            }
        }
        if (historiaARemover != null) {
            misHistorias.remove(historiaARemover.getId());
            numeroH--;
            System.out.println("Paciente dado de alta.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

   
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */
public class Historia {
    private static int contador = 1;
    private int id;
    private String codigo;
    private EstadoInicial estadoInicial;
    private Especialidad especialidad;
    private Medico medicoAsignado;
    private boolean alta;

    private EstadoInicial estado;
    
    public Historia(String codigo, EstadoInicial estadoInicial, Especialidad especialidad){
        this.id = contador++;
        this.codigo = codigo;
        this.estadoInicial = estadoInicial;
        this.especialidad = especialidad;
        this.medicoAsignado = null;
        this.alta = false;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public EstadoInicial getEstado() {
        return estado;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
}

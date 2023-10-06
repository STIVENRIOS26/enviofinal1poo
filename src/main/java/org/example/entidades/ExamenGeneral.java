package org.example.entidades;

import org.example.validaciones.ValidacionExamenGeneral;

import java.time.LocalDate;

public class ExamenGeneral {
    private String idExamen;
    private String nombreExamen;
    private LocalDate fecha;
    private String diagnostico;
    private String imagenExamen;
    private ValidacionExamenGeneral validacionExamenGeneral = new ValidacionExamenGeneral();

    public ExamenGeneral() {
    }

    public ExamenGeneral(String idExamen, String nombreExamen, LocalDate fecha, String diagnostico, String imagenExamen) {
        this.idExamen = idExamen;
        this.nombreExamen = nombreExamen;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.imagenExamen = imagenExamen;
    }

   public String getId() {return idExamen;}
    public void setId(String id) {
        try {
            this.validacionExamenGeneral.validarId(idExamen);
            this.idExamen = idExamen;
            System.out.println("Id cargado con exito");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getNombreExamen() {return nombreExamen;}
    public void setNombreExamen(String nombreExamen) {
        try{
            this.validacionExamenGeneral.validarNombreExamen(nombreExamen);
            this.nombreExamen=nombreExamen;
            System.out.println("Nombre del examen cargado con exito");
        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFecha() {return fecha;}
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {return diagnostico;}
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getImagenExamen() {return imagenExamen;}
    public void setImagenExamen(String imagenExamen) {
        try{
            this.validacionExamenGeneral.validarImagenExamen(imagenExamen);
            this.imagenExamen = imagenExamen;
            System.out.println("La imagen del examen cargada con exito");
        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }


}

package org.example.validaciones;

import org.example.utilidades.Utilidad;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidacionExamenGeneral {
    Utilidad utilidad = new Utilidad();

    public ValidacionExamenGeneral(){
    }

    public Boolean validarId(String idExamen) throws  Exception{
        if (idExamen.length() <0){
            throw new Exception("El id debe ser entero positivo");
        }
        String expresionRegularN ="^[0-9]+$";

        if (!this.utilidad.buscarCoincidencia(expresionRegularN, idExamen)) {
            throw new Exception("El id no cumple los parametros");
        }
        return true;
    }
    public Boolean validarNombreExamen(String nombreExamen) throws Exception {
        if (nombreExamen.length() < 10 || nombreExamen.length() > 150) {
            throw new Exception("El nombre del examen debe tener entre 10 y 150 caracteres");
        }
        String expresionRegular = "[a-zA-Z]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombreExamen)) {
            throw new Exception("El nombre del examen no cumple los parametros");
        }
        return true;
    }

    public Boolean validarImagenExamen(String imagenExamen) throws Exception {
        if (imagenExamen.length() < 0 || imagenExamen.length() >= 200) {
            throw new Exception("LA longitud maxima de la imagen es de 200 caracteres");
        }
        String expresionRegular = "[a-zA-Z]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, imagenExamen)) {
            throw new Exception("El nombre del examen no cumple los parametros");
        }
        return true;
    }

}

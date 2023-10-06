package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidacionSignoVital {
    Utilidad utilidad = new Utilidad();

    public ValidacionSignoVital(){
    }

    public Boolean validarId(Integer id) throws Exception{
        if (id<0){
            throw new Exception("El Id no puede ser negativo.");
        }
        return true;
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() > 100) {
            throw new Exception("El nombre debe tener entre 10 y 100 caracteres");
        }
        String expresionRegular = "[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)){
            throw new Exception("El nombre no cumple con los parametros");
        }
        return true;
    }

    public Boolean validarUnidadMedida(Integer unidadMedida) throws Exception {
        if (unidadMedida <0) {
            throw new Exception("La unidad de medida debe ser un numero entero positivo.");
        }
        String expresionRelugar ="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRelugar, unidadMedida.toString())) {
            throw new Exception("La unudad de medida no cumple los parametros");
        }
        return true;
    }



}

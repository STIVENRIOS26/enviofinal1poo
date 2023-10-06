package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    Utilidad utilidad = new Utilidad();

    public ValidacionAfiliado() {
    }

    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception("El id no puede ser negativo");
        }
        //PASE TODAS LAS VALIDACIONES
        return true;
    }

    public Boolean validarDocumento(String documento)throws Exception{
        if(documento.length()<7 || documento.length()>10){
            throw new Exception("Documento con longitud inválida");
        }
        String expresionRegular="[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("Revise el formato ingresado");
        }
        return true;
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() < 3 || nombre.length() > 40) {
            throw new Exception("El nombre debe tener entre 3 y 40 caracteres");
        }
        String expresionRegular = "[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception("el nombre no cumple los parametros");
        }
        return true;
    }

    public Boolean validarApellido(String apellido) throws Exception {
        if (apellido.length() < 10 || apellido.length() > 50) {
            throw new Exception("El apellido debe tener entre 10 y 50 caracteres");
        }
        String expresionRegular = "[a-zA-Z]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, apellido)) {
            throw new Exception("El apellido no cumple los parametros");
        }
        return true;
    }

    public Boolean validarCiudad(Integer ciudad) throws Exception {
        if (ciudad < 0 || ciudad >= 1123) {
            throw new Exception("La ciudad debe estar entre 1 y 1123");
        }
        String expresionRelugar = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRelugar, ciudad.toString())) {
            throw new Exception("LA ciudad no cumple los parametros");
        }
        return true;
    }

    public Boolean validarDepartamento(Integer departamento) throws Exception {
        if (departamento < 0 || departamento >= 32) {
            throw new Exception("El departamento debe estar entre 1 y 32");
        }
        String expresionRelugar = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRelugar, departamento.toString())) {
            throw new Exception("El departamento no cumple los parametros");
        }
        return true;
    }

    public Boolean validarCorreoElectronico(String correoElectronico) throws Exception {
        if (correoElectronico.length() < 10 || correoElectronico.length() > 50) {
            throw new Exception("El correo electronico entre 10 y 50 caracteres");
        }
        String expresionRegular = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, correoElectronico)) {
            throw new Exception("El apellido no cumple los parametros");
        }
        return true;
    }

    public Boolean validarTelefono(String telefono) throws Exception {
        if (telefono.length() == 11) {
            throw new Exception("El teléfono unicamente debe tener 10 numeros");
        }
        String expresionRegular = "^[0-9]+$";

        if (!this.utilidad.buscarCoincidencia(expresionRegular, telefono)) {
            throw new Exception("El teléfono no cumple los parametros");
        }
        return true;
    }

    public void trabajarFechas(){

        //fecha mas simple que se pueda crear en java
        LocalDate fechaSistema = LocalDate.now();
        System.out.println(fechaSistema);
    }

}
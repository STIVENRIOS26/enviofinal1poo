package org.example;

import org.example.entidades.Afiliado;
import org.example.entidades.ExamenGeneral;
import org.example.entidades.SignoVital;
import org.example.validaciones.ValidacionAfiliado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner entradaTeclado=new Scanner(System.in);

        Afiliado afiliado = new Afiliado();

        System.out.println("Digita el id del usuario: ");
        afiliado.setId(entradaTeclado.nextInt());

        System.out.println("Digita el nombre: ");
        afiliado.setNombre(entradaTeclado.nextLine());

        System.out.println("Digita el apellido del usuario: ");
        afiliado.setApellido(entradaTeclado.nextLine());

        System.out.println("Digita el documento del usuario: ");
        afiliado.setDocumento(entradaTeclado.nextLine());

        System.out.println("Digita el numero de ciudad del usuario: ");
        afiliado.setCiudad(entradaTeclado.nextInt());

        System.out.println("Digita el numero de departamento del usuario: ");
        afiliado.setDepartamento(entradaTeclado.nextInt());

        System.out.println("Digita el correo electronico del usuario: ");
        afiliado.setCorreoElectronico(entradaTeclado.nextLine());

        System.out.println("Digita el teléfono del usuario: ");
        afiliado.setTelefono(entradaTeclado.nextLine());


        SignoVital signoVital = new SignoVital();

        System.out.println("Digita el Id del signo vital: ");
        signoVital.setId(entradaTeclado.nextInt());

        System.out.println("Digita el nombre del signo vital: ");
        signoVital.setNombre(entradaTeclado.nextLine());

        System.out.println("Digita la unidad de medida del signo vital: ");
        signoVital.setUnidadMedida(entradaTeclado.nextInt());


        ExamenGeneral examenGeneral = new ExamenGeneral();

        System.out.println("Digita el Id del examen general: ");
        examenGeneral.setId(entradaTeclado.nextLine());

        System.out.println("Digita el nombre del examen general: ");
        examenGeneral.setNombreExamen(entradaTeclado.nextLine());

        System.out.println("Imagen del examen general: ");
        examenGeneral.setImagenExamen(entradaTeclado.nextLine());

        ValidacionAfiliado validacionAfiliado = new ValidacionAfiliado();
        validacionAfiliado.trabajarFechas();

/*
        //configurar manualmente una fecha
        LocalDate fechaNacimiento=LocalDate.of(2003,12,26);
        System.out.println(fechaNacimiento);

        //usa la clase scanner para pedir mes,año y dia
        //y armas una fecha

        //diferencias entre dos fechas*/


    }

}
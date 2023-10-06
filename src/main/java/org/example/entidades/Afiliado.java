package org.example.entidades;

import org.example.validaciones.ValidacionAfiliado;

import java.time.LocalDate;

public class Afiliado {

    //Datos


    // todos los elementos de una clase son variables o atributos un atributo es una variable y
    // una variable sirve para asignar valores o datos es decir para que algo tenga valor y
    // en este caso las variables estan asignadas a la clase Afiliado.


    //La clase nos sirven para ordenar las variables y optimizar describiendo

    //la palabra antes del tipo de dato es el modificador de acceso y es indispensable para poder
    // hacer un sout en el main
    private Integer id;
    private String documento;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Integer ciudad; // es integer porque va a ser una lista de datos
    private Integer departamento; // es integer porque va a ser una lista de datos
    private String correoElectronico;
    private String telefono;
    private ValidacionAfiliado validacionAfiliado = new ValidacionAfiliado(); //inyectar dependencias

    // como esta vacio hay que asignarle un valor y se asigna con un constructor
    public Afiliado() { //constructor vacio
    }


    //constructor lleno
    public Afiliado(Integer id, String documento, String nombre, String apellido, LocalDate fechaNacimiento, Integer ciudad, Integer departamento, String correoElectronico, String telefono) {
        //this es un operador y un atributo de la clase
        //cuando aparezca this y una letra en morado es un atributo y lo que sigue es el blanco el cual es una variable

        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.correoElectronico = correoElectronico;
        this.telefono= telefono;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {
        try{//intento
            this.validacionAfiliado.validarId(id);
            this.id = id;
            System.out.println("Id cargado con exito.");

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDocumento() {return documento;}
        public void setDocumento(String documento) {
            try{
                this.validacionAfiliado.validarDocumento(documento);
                this.documento = documento;
                System.out.println("Documento cargado con exito");

            }catch (Exception error){
                System.out.println(error.getMessage());
            }
        }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre){
        try{
            this.validacionAfiliado.validarNombre(nombre);
            this.nombre = nombre;
            System.out.println("Nombre cargado con exito.");

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {
        try{
            this.validacionAfiliado.validarApellido(apellido);
            this.apellido = apellido;
            System.out.println("Apellido cargado con exito.");
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCiudad() {return ciudad;}
    public void setCiudad(Integer ciudad) {
        try{
            this.validacionAfiliado.validarCiudad(ciudad);
            this.ciudad=ciudad;
            System.out.println("Ciudad cargada con exito");
        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getDepartamento() {return departamento;}
    public void setDepartamento(Integer departamento) {
        try{
            this.validacionAfiliado.validarDepartamento(departamento);
            this.departamento=departamento;
            System.out.println("Departamento cargado con exito");
        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico) {
        try{
            this.validacionAfiliado.validarCorreoElectronico(correoElectronico);
            this.correoElectronico=correoElectronico;
            System.out.println("Correo Electronico cargado con exito");
        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

        public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {
        try {
            this.validacionAfiliado.validarTelefono(telefono);
            this.telefono = telefono;
            System.out.println("Telefono cargado con exito.");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}

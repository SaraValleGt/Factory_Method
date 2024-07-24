package org.adaschool.api.model;

public class User {
    private Long id;
    private String nombre;
    private String correo;
    private String empresa;
    private String contraseña;
    private String direccion;
    private String rol;
    private String disponibilidad;

    // Constructor vacío
    public User() {
    }

    // Constructor con parámetros (opcional)
    public User(Long id, String nombre, String correo, String empresa, String contraseña, String direccion, String rol, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.rol = rol;
        this.disponibilidad = disponibilidad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

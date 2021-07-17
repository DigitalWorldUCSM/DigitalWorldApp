package com.example.hoteles;

public class DataHoteles {
    String Nombre, Direccion, Habitacion,precio;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String habitacion) {
        Habitacion = habitacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

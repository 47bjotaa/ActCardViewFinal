package com.example.actcardview;

// Clase que representa un elemento en la lista, conteniendo información relevante sobre una institución.
public class ListadoDeElementos {
    // Atributos que almacenan la información del elemento.
    private String nombre; // Nombre de la institución.
    private String ciudad; // Ciudad donde se encuentra la institución.
    private String descripcion; // Descripción de la institución.
    private int imageResId; // ID del recurso de imagen para el logo.
    private String direccion; // Dirección de la institución.
    private String telefono; // Teléfono de contacto.
    private String sitioWeb; // URL del sitio web.

    // Constructor que inicializa todos los atributos de la clase.
    public ListadoDeElementos(String nombre, String ciudad, String descripcion, int imageResId,
                              String direccion, String telefono, String sitioWeb) {
        this.nombre = nombre; // Asignamos el nombre.
        this.ciudad = ciudad; // Asignamos la ciudad.
        this.descripcion = descripcion; // Asignamos la descripción.
        this.imageResId = imageResId; // Asignamos el ID de la imagen.
        this.direccion = direccion; // Asignamos la dirección.
        this.telefono = telefono; // Asignamos el teléfono.
        this.sitioWeb = sitioWeb; // Asignamos el sitio web.
    }

    // Métodos getter para acceder a los atributos de forma segura.
    public String getNombre() { return nombre; } // Retorna el nombre de la institución.
    public String getCiudad() { return ciudad; } // Retorna la ciudad.
    public String getDescripcion() { return descripcion; } // Retorna la descripción.
    public int getImageResId() { return imageResId; } // Retorna el ID de la imagen.
    public String getDireccion() { return direccion; } // Retorna la dirección.
    public String getTelefono() { return telefono; } // Retorna el número de teléfono.
    public String getSitioWeb() { return sitioWeb; } // Retorna la URL del sitio web.
}
package com.example.examgrader;

import android.util.Log;

public class DatosExamen {
    private String nombre_materia;
    private String nombre_examen;
    private Integer num_preguntas;
    private Integer num_opciones;
    private Double pntos_correcta;
    private Double pntos_incorrecta;

    /*public DatosExamen(String nombre_materia, String nombre_examen, Integer num_preguntas, Integer num_opciones, Double pntos_correcta, Double pntos_incorrecta) {
        this.nombre_materia = nombre_materia;
        this.nombre_examen = nombre_examen;
        this.num_preguntas = num_preguntas;
        this.num_opciones = num_opciones;
        this.pntos_correcta = pntos_correcta;
        this.pntos_incorrecta = pntos_incorrecta;
    }*/

    //NOMBRE MATERIA
    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }
//NOMBRE EXAMEN
    public String getNombre_examen() {
        return nombre_examen;
    }

    public void setNombre_examen(String nombre_examen) {
        this.nombre_examen = nombre_examen;
    }
//NUMERO PREGUNTAS
    public Integer getNum_preguntas() {
        return num_preguntas;
    }

    public void setNum_preguntas(Integer num_preguntas) {
        this.num_preguntas = num_preguntas;
    }
//NUMERO RESPUESTAS
    public Integer getNum_opciones() {
        return num_opciones;
    }

    public void setNum_opciones(Integer num_opciones) {
        this.num_opciones = num_opciones;
    }
//PUNTOS POR CORRECTA
    public Double getPntos_correcta() {
        return pntos_correcta;
    }

    public void setPntos_correcta(Double pntos_correcta) {
        this.pntos_correcta = pntos_correcta;
    }
//PUNTOS MENOS POR INCORRECTA
    public Double getPntos_incorrecta() {
        return pntos_incorrecta;
    }

    public void setPntos_incorrecta(Double pntos_incorrecta) {
        this.pntos_incorrecta = pntos_incorrecta;
    }

    @Override
    public String toString() {
        return "DatosExamen{" +
                "nombre_materia='" + nombre_materia + '\'' +
                ", nombre_examen='" + nombre_examen + '\'' +
                ", num_preguntas=" + num_preguntas +
                ", num_opciones=" + num_opciones +
                ", pntos_correcta=" + pntos_correcta +
                ", pntos_incorrecta=" + pntos_incorrecta +
                '}';
    }
}

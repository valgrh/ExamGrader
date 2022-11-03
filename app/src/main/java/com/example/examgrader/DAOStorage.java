package com.example.examgrader;

import android.net.Uri;

import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class DAOStorage {

    private StorageReference storageReference;

    public DAOStorage(){


       //storageReference = FirebaseStorage.getInstance().getReference();

    }





    public String mostrar_foto(DatosExamen datosExamen){



        int num_opciones = datosExamen.getNum_opciones();
        int num_preguntas = datosExamen.getNum_preguntas();
        String tipo_examen = "";
        //storageReference = FirebaseStorage.getInstance().getReference();


        if (num_opciones == 4 && num_preguntas == 5){
            tipo_examen="fotos_examen/4o5p.jpg";
            //tipo_examen = String.valueOf(storageReference.child("fotos_examen/4o5p.jpg"));

        }
        else if (num_opciones == 4 && num_preguntas == 10) {
            tipo_examen = "fotos_examen/4o10p.jpg";
            //tipo_examen = String.valueOf(storageReference.child("fotos_examen/4o10p.jpg"));
        }
        else if (num_opciones == 4 && num_preguntas == 15){
            tipo_examen = "fotos_examen/4o15p.jpg";
            //tipo_examen = String.valueOf(storageReference.child("fotos_examen/4o15p.jpg"));
        }
        else if (num_opciones == 4 && num_preguntas == 20) {
            tipo_examen = "fotos_examen/4o20p.jpg";
            //tipo_examen = String.valueOf(storageReference.child("fotos_examen/4o20p.jpg"));
        }

        else if (num_opciones == 4 && num_preguntas == 25){
            tipo_examen = "fotos_examen/4o25p.jpg";
            //tipo_examen = String.valueOf(storageReference.child("fotos_examen/4o25p.jpg"));
        }
        else if (num_opciones == 4 && num_preguntas == 30){
            tipo_examen = "fotos_examen/4o30p.jpg";
            //tipo_examen = String.valueOf(storageReference.child("fotos_examen/4o30p.jpg"));
        }

        return tipo_examen;

    }

    public String nombre_archivo(DatosExamen datosExamen){



        int num_opciones = datosExamen.getNum_opciones();
        int num_preguntas = datosExamen.getNum_preguntas();

        String nombre = "";

        if (num_opciones == 4 && num_preguntas == 5){

            nombre = "4o5p";

        }
        else if (num_opciones == 4 && num_preguntas == 10) {
            nombre = "4o10p";

        }
        else if (num_opciones == 4 && num_preguntas == 15){
            nombre = "4o15p";
        }
        else if (num_opciones == 4 && num_preguntas == 20){
            nombre = "4o20p";
        }
        else if (num_opciones == 4 && num_preguntas == 25){
            nombre = "4o25p";
        }
        else if (num_opciones == 4 && num_preguntas == 30){
            nombre = "4o30p";
        }

        return nombre;

    }




}

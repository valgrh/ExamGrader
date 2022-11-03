package com.example.examgrader;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;

public class DAOExamen {
    private DatabaseReference databaseReference;
    private StorageReference storageReference;
    public DAOExamen(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(DatosExamen.class.getSimpleName());
    }


    public Task<Void> agregar (DatosExamen datosExamen){
        return databaseReference.push().setValue(datosExamen);
    }

    public Task<Void> editar (String llave, HashMap<String, Object> hashMap){

        return databaseReference.child(llave).updateChildren(hashMap);
    }

    public Query get(){

        return databaseReference.orderByKey();

    }

}

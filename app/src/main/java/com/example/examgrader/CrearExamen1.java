package com.example.examgrader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrearExamen1 extends AppCompatActivity {

    Button btnatras1;
    Button btnsiguiente1;
    Button btnterminar;
    EditText txtbmateria;
    EditText txtbnombre_examen;
    EditText txtb_num_preguntas;
    EditText txtb_num_opciones;
    EditText txtb_pnts_correcta;
    EditText txtb_pnts_incorrecta;
    ImageView btnvista_previa;
    private ProgressDialog progressDialog;

    StorageReference mStorage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_examen1);

        btnatras1 = (Button) findViewById(R.id.btnatras2);
        btnsiguiente1 = (Button) findViewById(R.id.btnsiguiente2);
        btnterminar = (Button) findViewById(R.id.btnterminar);
        txtbmateria = (EditText) findViewById(R.id.txtbmateria);
        txtbnombre_examen = (EditText) findViewById(R.id.txtbnombre_examen);
        txtb_num_preguntas = (EditText) findViewById(R.id.txtbnum_preguntas);
        txtb_num_opciones = (EditText) findViewById(R.id.txtbnum_opciones);
        txtb_pnts_correcta = (EditText) findViewById(R.id.txtbpnts_correcta);
        txtb_pnts_incorrecta = (EditText) findViewById(R.id.txtbpnts_incorrecta);
        btnvista_previa = (ImageView) findViewById(R.id.btnvista_previa);
        progressDialog = new ProgressDialog(this);


        btnatras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crear2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(crear2);
            }
        });

        DAOExamen dao = new DAOExamen();
        DAOStorage daoStorage =  new DAOStorage();




        btnsiguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer preg = Integer.parseInt(String.valueOf(txtb_num_preguntas.getText()));
                Integer opciones = Integer.parseInt(String.valueOf(txtb_num_opciones.getText()));
                Double correcta = Double.parseDouble(String.valueOf(txtb_pnts_correcta.getText()));
                Double incorrecta = Double.parseDouble(String.valueOf(txtb_pnts_incorrecta.getText()));





              /*  DatosExamen datosExamen = new DatosExamen(txtbmateria.getText().toString(), txtbnombre_examen.getText().toString(),
                        preg, opciones, correcta, incorrecta);

                mStorage = FirebaseStorage.getInstance().getReference().child(daoStorage.mostrar_foto(datosExamen));


                dao.agregar(datosExamen).addOnSuccessListener(suc ->{


                    Toast.makeText(CrearExamen1.this, "Se inserto con exito",
                            Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er ->{
                    Toast.makeText(CrearExamen1.this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();

                });

                try {
                    File localfile = File.createTempFile(daoStorage.nombre_archivo(datosExamen), "jpg");
                    mStorage.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(CrearExamen1.this, "Imagen", Toast.LENGTH_SHORT).show();
                            Bitmap bitmap = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.btnvista_previa)).setImageBitmap(bitmap);



                            btnsiguiente1.setVisibility(View.GONE);
                            btnatras1.setVisibility(View.GONE);
                            btnterminar.setVisibility(View.VISIBLE);
                            btnvista_previa.setVisibility(View.VISIBLE);

                            btnterminar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent crear2p1 = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(crear2p1);
                                }
                            });



                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(CrearExamen1.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }




*/




            }
        });


    }



}
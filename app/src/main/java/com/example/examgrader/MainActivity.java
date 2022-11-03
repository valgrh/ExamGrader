package com.example.examgrader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fabagregar;
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    RVAdapter adapter;
    DAOExamen daoExamen;
    Button btncontenido;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabagregar = (FloatingActionButton) findViewById(R.id.fabbtn);
        //swipeRefreshLayout = findViewById(R.id.swipe_refrescar);
        //recyclerView = findViewById(R.id.rv);
        btncontenido = findViewById(R.id.btncontenido);



//        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setHasFixedSize(true);
//        adapter = new RVAdapter(MainActivity.this);
//
//        recyclerView.setAdapter(adapter);

        daoExamen = new DAOExamen();
        //cargarDatos();


        fabagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crear1 = new Intent(getApplicationContext(), CrearExamen1.class);
                startActivity(crear1);
            }
        });

        btncontenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RvActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void cargarDatos() {
//
//        daoExamen.get().addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                ArrayList<DatosExamen> datosExamenArrayList = new ArrayList<>();
//                for (DataSnapshot data : snapshot.getChildren()){
//                    DatosExamen datosExamen = data.getValue(DatosExamen.class);
//                    datosExamenArrayList.add(datosExamen);
//                }
//                adapter.setItems(datosExamenArrayList);
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//    }
}
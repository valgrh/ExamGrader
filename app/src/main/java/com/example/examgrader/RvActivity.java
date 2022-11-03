package com.example.examgrader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class RvActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    RVAdapter adapter;
    DAOExamen daoExamen;
    ArrayList<DatosExamen> list;

    //DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        swipeRefreshLayout = findViewById(R.id.swipe);
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //adapter = new RVAdapter(this);
//        adapter = new RVAdapter();
        //recyclerView.setAdapter(adapter);

        //LinearLayoutManager manager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(manager);

        //database = FirebaseDatabase.getInstance().getReference("DatosExamen");

        daoExamen = new DAOExamen();

        list = new ArrayList<>();
        adapter = new RVAdapter(this, list);
        recyclerView.setAdapter(adapter);
        //loadData();

        daoExamen.get().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    DatosExamen datosExamen = dataSnapshot.getValue(DatosExamen.class);
                    list.add(datosExamen);
                }

                adapter.notifyDataSetChanged();
                

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

//    private void loadData() {
//
//        daoExamen.get().addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//
//
//
//
//                ArrayList<DatosExamen> listaexamen = new ArrayList<>();
//                for (DataSnapshot data: snapshot.getChildren()){
//
//                    DatosExamen datosExamen = data.getValue(DatosExamen.class);
//                    listaexamen.add(datosExamen);
//
//
//                }
//
//                adapter.setItems(listaexamen);
//                adapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//                Toast.makeText(RvActivity.this, ""+ error.getMessage(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//
//
//    }

}
package com.example.recyclerviewycardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //se define un objeto ArrayList utilizando el modelo creado
    ArrayList<Model>models=new ArrayList<>();

    RecyclerView mRecycleView;
    Adapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView=findViewById(R.id.recyclerView1);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter= new Adapter(this, getMyList());
        mRecycleView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){
        Model m=new Model();
	
	//estableciendo valores a los atributos según el modelo

        m.setTitle("Facultativa II");
        m.setDescription ("Descripción de Facultativa II");
        m.setImg(R.drawable.app);
        m.setNameP("Saira Cienfuego");
        m.setDayC("25 de mayo del 2020");
        m.setHora("12:00");		 
        m.setWork("26 de mayo del 2020");
        models.add(m);

        m=new Model();

        m.setTitle("Investigación");
        m.setDescription ("Descripción de Investigacion");
        m.setImg(R.drawable.files);
        m.setNameP("Jazcar Bravo");
        m.setDayC("25 de mayo del 2020");
        m.setHora("12:00");		 
        m.setWork("26 de mayo del 2020");
        models.add(m);

        m=new Model();
        m.setTitle("Planificación TIC");
        m.setDescription ("Descripción de Planificación");
        m.setNameP("Miriam Cienfuego");
        m.setDayC("25 de mayo del 2020");
        m.setHora("12:00");
        m.setWork("26 de mayo del 2020");
        m.setImg(R.drawable.pc);
        models.add(m);

        return models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itemclosed:
                System.exit(0);
            case R.id.itemguardar:

                final Dialog dlg = new Dialog(this);
                dlg.setContentView(R.layout.activity_activityadd);//se hace referencia a que layout se esta llamando
                dlg.setTitle("Registro Asignatura");
                dlg.setCancelable(false);

                Button buttonagregar = (Button) dlg.findViewById(R.id.btnRegistrar);
                Button buttoncancelar = (Button) dlg.findViewById(R.id.btncancelar);

                buttonagregar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editText_asigna=(EditText) dlg.findViewById(R.id.editText_Asig);
                        EditText editText_descrip=(EditText)dlg.findViewById(R.id.editText_Desc);
                        EditText editText_profe=(EditText)dlg.findViewById(R.id.editText_prof);
                        EditText editText_dia=(EditText)dlg.findViewById(R.id.editText_dia);
                        EditText editText_hora=(EditText)dlg.findViewById(R.id.editText_hora);
                        EditText editText_fechaentr=(EditText)dlg.findViewById(R.id.editText_ProxTrab);
			

                        Model model=new Model();//se define un objeto del modelo creado en la clase Model
                        model.setTitle(editText_asigna.getText().toString());
                        model.setDescription(editText_descrip.getText().toString());
                        model.setNameP(editText_profe.getText().toString());
                        model.setImg(R.drawable.book);
                        model.setDayC(editText_dia.getText().toString());
                        model.setHora(editText_hora.getText().toString());
                        model.setWork(editText_fechaentr.getText().toString());



                        models.add(model);/// guardar los datos obetenidos al ArrayList
                        myAdapter= new Adapter(v.getContext(), models);//se recarga el RecyclerView
                        mRecycleView.setAdapter(myAdapter);
                        dlg.cancel();
                    }


                });

                buttoncancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dlg.cancel();
                    }
                });

                dlg.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

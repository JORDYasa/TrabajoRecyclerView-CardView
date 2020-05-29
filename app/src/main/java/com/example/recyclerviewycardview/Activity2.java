package com.example.recyclerviewycardview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView mTitleView, mDescriptionView, mProfesorView, mDiacView, mHoraView, mTareaView;
    ImageView mImagenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

	//se utlizara para mostrar el titulo del item en la barra superior
        ActionBar actionBar=getSupportActionBar();


	//se hace referencia a los elemnetos de la activity_2.xml, en donde ser muestran
	//los datos seleccionados que viene de la actividad principal.

        mTitleView=findViewById(R.id.titleView);
        mDescriptionView=findViewById(R.id.descriptionView);
        mImagenView=findViewById(R.id.imageView);
        mProfesorView=findViewById(R.id.teacherView);
        mDiacView=findViewById(R.id.dayView);
        mHoraView=findViewById(R.id.horaView);
        mTareaView=findViewById(R.id.workView);

	
	// se obtienen todoslos datos con Intent
        Intent intent=getIntent();
        String mTitle=intent.getStringExtra("iTitle");
        String mDesc=intent.getStringExtra("iDesc");
        String mProfe=intent.getStringExtra("iProf");
        String mDiac=intent.getStringExtra("iDay");
        String mHora=intent.getStringExtra("iHora");
        String mTarea=intent.getStringExtra("iWork");

        byte[] mBytes=getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap= BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);
	
	//se asignan los datos obtenidos a los elementos que se crearon
	//de la activity_2.xml
        actionBar.setTitle(mTitle);
        mTitleView.setText(mTitle);
        mDescriptionView.setText(mDesc);
        mProfesorView.setText(mProfe);
        mDiacView.setText(mDiac);
        mHoraView.setText(mHora);
        mTareaView.setText(mTarea);
        mImagenView.setImageBitmap(bitmap);

    }
}

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

        ActionBar actionBar=getSupportActionBar();

        mTitleView=findViewById(R.id.titleView);
        mDescriptionView=findViewById(R.id.descriptionView);
        mImagenView=findViewById(R.id.imageView);
        mProfesorView=findViewById(R.id.teacherView);
        mDiacView=findViewById(R.id.dayView);
        mHoraView=findViewById(R.id.horaView);
        mTareaView=findViewById(R.id.workView);

        Intent intent=getIntent();
        String mTitle=intent.getStringExtra("iTitle");
        String mDesc=intent.getStringExtra("iDesc");
        String mProfe=intent.getStringExtra("iProf");
        String mDiac=intent.getStringExtra("iDay");
        String mHora=intent.getStringExtra("iHora");
        String mTarea=intent.getStringExtra("iWork");

        byte[] mBytes=getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap= BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

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

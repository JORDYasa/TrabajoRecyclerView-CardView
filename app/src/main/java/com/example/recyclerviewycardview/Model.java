package com.example.recyclerviewycardview;

import java.util.ArrayList;

public class Model {

    /*static ArrayList<Model> Models=new ArrayList<Model>();

    public static void AddModel (Model model) {
        Models.add(model);
    }

    public static ArrayList<Model> getModels(){
        return Models;
    }*/

    private String title;
    private String description;
    private int img;

    // Definición de varibles para guardar datos orientados en el trabajo de RecyclerView y Cardview
    private String nameP;// Nombre del profesor
    private String dayC;// Dia en que se imparte la clase
    private String hora;// Hora en la que se recibe
    private String work;// Próxima fecha de entrega de trabajo

    //de igual manera se generan sus getter y setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String getDayC() {
        return dayC;
    }

    public void setDayC(String dayC) {
        this.dayC = dayC;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}

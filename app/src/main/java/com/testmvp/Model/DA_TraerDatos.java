package com.testmvp.Model;

import com.testmvp.Entity.Alumno;
import com.testmvp.Presenter.InterGetNombres;

import java.util.ArrayList;
import java.util.List;

public class DA_TraerDatos implements InterGetNombres.Model {

    List<Alumno> listAlumn;

    public DA_TraerDatos() {
        listAlumn = new ArrayList<>();
        listAlumn.add(new Alumno("Dennis Richard", "Mendez Adriano"));
        listAlumn.add(new Alumno("Mayra", "Quispe Rodriguez"));
        listAlumn.add(new Alumno("Monica", "Jaqueline Adriano"));
    }

    @Override
    public List<Alumno> getAlumnos() {
        return listAlumn;
    }
}

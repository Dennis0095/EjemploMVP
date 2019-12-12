package com.testmvp.Presenter;

import com.testmvp.Entity.Alumno;

import java.util.List;

public interface InterGetNombres {

    interface View{
        void MostrarNombres(List<Alumno> listAlumnos);
    }

    interface Model{
        List<Alumno> getAlumnos();
    }

    interface Presenter{
        void ListarNombres();
        void DestroyView();
    }
}

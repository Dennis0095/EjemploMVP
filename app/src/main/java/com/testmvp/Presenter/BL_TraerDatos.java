package com.testmvp.Presenter;

import com.testmvp.Entity.Alumno;

import java.util.List;

public class BL_TraerDatos implements InterGetNombres.Presenter {

    InterGetNombres.Model objModel;
    InterGetNombres.View objView;

    public BL_TraerDatos(InterGetNombres.Model objModel, InterGetNombres.View objView) {
        this.objModel = objModel;
        this.objView = objView;
    }

    @Override
    public void ListarNombres() {
        List<Alumno> objAlum =  objModel.getAlumnos();
        objView.MostrarNombres(objAlum);// este debe de implementar el view
    }

    @Override
    public void DestroyView() {
        objView = null;
    }
}

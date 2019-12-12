package com.testmvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.testmvp.Entity.Alumno;
import com.testmvp.Model.DA_TraerDatos;
import com.testmvp.Presenter.BL_TraerDatos;
import com.testmvp.Presenter.InterGetNombres;
import com.testmvp.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements InterGetNombres.View {

    Button button;
    BL_TraerDatos objTraerDatos;
    TextView tvTitulo, tvNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objTraerDatos = new BL_TraerDatos( new DA_TraerDatos(), this);
        button = findViewById(R.id.button);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvNombres = findViewById(R.id.tvNombres);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objTraerDatos.ListarNombres();
            }
        });
    }

    @Override
    public void MostrarNombres(List<Alumno> listAlumnos) {

        for (Alumno a: listAlumnos){
            tvNombres.append(a.getNombre() + " " + a.getApellido() + "\n");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        objTraerDatos.DestroyView();
    }
}

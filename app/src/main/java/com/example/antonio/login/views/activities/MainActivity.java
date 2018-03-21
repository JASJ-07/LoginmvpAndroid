package com.example.antonio.login.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.example.antonio.login.R;
import com.example.antonio.login.views.presenters.Ipresenters;
import com.example.antonio.login.views.presenters.Presenters;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;
public class MainActivity extends AppCompatActivity implements IView{

    @BindView(R.id.txtusuario)
    TextView txtusuario;

    @BindView(R.id.txtpass)
    TextView txtpass;

    @BindView(R.id.btnLogin)
    Button btnLogin;

    private Ipresenters Presenters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Presenters = new Presenters(this);
    }

    @Override
    public void mostrarLoading() {
        //progress mostrar
        Log.i("MainActivity", "Mostrando Loading");

    }

    @Override
    public void ocultarLoading() {
        //progress ocultar
        Log.i("MainActivity", "Ocultando Loading");

    }

    @OnClick(R.id.btnLogin)
    public void onClickLogin() {
        String user = txtusuario.getText().toString();
        String password = txtpass.getText().toString();
        Presenters.Access(user, password);
    }

    @Override
    public void mostrarError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void mostarAcceso(String entry) {
        Toast.makeText(this,
                "Access:" + entry, Toast.LENGTH_SHORT).show();

    }


}

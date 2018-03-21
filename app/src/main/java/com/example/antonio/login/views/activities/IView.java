package com.example.antonio.login.views.activities;

/**
 * Created by antonio on 19/03/18.
 */

public interface IView {
    void mostrarLoading();
    void ocultarLoading();
    void onClickLogin();
    void mostrarError(String msg);
    void mostarAcceso(String entry);

}

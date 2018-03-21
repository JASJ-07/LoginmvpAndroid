package com.example.antonio.login.views.presenters;

import com.example.antonio.login.domain.IIteractorOperations;
import com.example.antonio.login.domain.InteractorOperations;
import com.example.antonio.login.views.activities.IView;

/**
 * Created by antonio on 19/03/18.
 */

public class Presenters implements Ipresenters {

    private IView view;
    private IIteractorOperations operations;

    public Presenters(IView view) {
        this.view = view;
        operations = new InteractorOperations();

    }

    @Override
    public void Access(String user, String pass) {
        try {
            view.mostrarLoading();
            String entrada = operations.validauser(user, pass);
            view.mostarAcceso(entrada);
            view.ocultarLoading();
        } catch (Exception e) {
            view.mostrarError(e.getMessage());
        }

    }
}

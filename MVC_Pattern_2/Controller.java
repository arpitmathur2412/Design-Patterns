package com.MVC_Pattern_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addButtonListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int count = model.getCount();
        count++;
        model.setCount(count);

        view.setLabelText(Integer.toString(count));
    }
}

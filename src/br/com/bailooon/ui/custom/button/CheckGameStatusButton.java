package br.com.bailooon.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckGameStatusButton extends JButton {

    public  CheckGameStatusButton(final ActionListener actionListener) {
        this.setText("verificar Jogo");
        this.addActionListener(actionListener);
    }


}

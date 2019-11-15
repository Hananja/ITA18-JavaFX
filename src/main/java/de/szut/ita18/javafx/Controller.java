package de.szut.ita18.javafx;

import javafx.event.ActionEvent;

public class Controller {
    public void handleButtonHello(ActionEvent actionEvent) {
        System.out.println("Hello World!");
    }

    public void handleBreakButton(ActionEvent actionEvent) {
        System.out.println("Nun ist Pause!");
    }
}

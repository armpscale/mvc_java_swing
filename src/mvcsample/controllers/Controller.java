package mvcsample.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvcsample.models.*;
import mvcsample.views.*;

public class Controller {

    private Model model;
    private View view;
    private ActionListener actionListener;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
                          
    }
    
    public void control(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
                  linkBtnAndTextField();
              }
        };                
        view.getButton().addActionListener(actionListener);   
    }
    
    private void linkBtnAndTextField(){
        
//        model.incX();
        int number = Integer.parseInt(view.getText());
        model.sum(number);
        view.setText(Integer.toString(model.getX()));
    }    
}
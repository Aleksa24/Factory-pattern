/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.fields.PanelInputTextField;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class SimplePersonViewFactory extends PersonViewFactory{

    @Override
    public JPanel getPersonView() {
        panel=new JPanel();
        
        panel.setLayout(new GridLayout(4, 1));
        inputFirstName=new PanelInputTextField();
        inputLastName=new PanelInputTextField();
        inputDate=new PanelInputTextField();
        inputGender=new PanelInputTextField();
        
        ((PanelInputTextField)inputFirstName).getLblFieldText().setText("First name:");
        ((PanelInputTextField)inputFirstName).getLblError().setText("");
        ((PanelInputTextField)inputLastName).getLblFieldText().setText("Last name:");
        ((PanelInputTextField)inputLastName).getLblError().setText("");
        ((PanelInputTextField)inputDate).getLblFieldText().setText("Date:");
        ((PanelInputTextField)inputDate).getLblError().setText("");
        ((PanelInputTextField)inputGender).getLblFieldText().setText("Gender:");
        ((PanelInputTextField)inputGender).getLblError().setText("");
        
        panel.add((Component) inputFirstName);
        panel.add((Component) inputLastName);
        panel.add((Component) inputDate);
        panel.add((Component) inputGender);
        
        return panel;
    }
    
}

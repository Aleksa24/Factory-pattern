/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class AdvancedPersonViewFactory extends PersonViewFactory{

   @Override
    public JPanel getPersonView() {
        panel=new JPanel();
        
        panel.setLayout(new GridLayout(4, 1));
        inputFirstName=new PanelInputTextField();
        inputLastName=new PanelInputTextField();
        inputDate=new PanelInputDate();
        inputGender=new PanelInputComboBox();
        
        ((PanelInputTextField)inputFirstName).getLblFieldText().setText("First name:");
        ((PanelInputTextField)inputFirstName).getLblError().setText("");
        ((PanelInputTextField)inputLastName).getLblFieldText().setText("Last name:");
        ((PanelInputTextField)inputLastName).getLblError().setText("");
        ((PanelInputDate)inputDate).getLblFieldText().setText("Date:");
        ((PanelInputDate)inputDate).getLblError().setText("");
        ((PanelInputDate)inputDate).initialize("2000");
        ((PanelInputComboBox)inputGender).getLblFieldText().setText("Gender:");
        ((PanelInputComboBox)inputGender).getLblError().setText("");
        ((PanelInputComboBox)inputGender).initialize(new ArrayList<Gender>(Arrays.asList(Gender.MALE,Gender.FEMALE)));
        
        panel.add((Component) inputFirstName);
        panel.add((Component) inputLastName);
        panel.add((Component) inputDate);
        panel.add((Component) inputGender);
        
        return panel;
    }
    
}

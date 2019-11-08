/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory;

import components.IValue;
import javax.swing.JPanel;


/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public abstract class PersonViewFactory {
    
    
    //delovi proizvoda
    protected IValue inputFirstName;
    protected IValue inputLastName;
    protected IValue inputDate;
    protected IValue inputGender;
    //ponuda ili izlazni proizvod
    protected JPanel panel;
    
    public void kreiraj(){panel = getPersonView();}
    public JPanel getPanelPerson(){return panel;}
    public abstract JPanel getPersonView();
    
    
}

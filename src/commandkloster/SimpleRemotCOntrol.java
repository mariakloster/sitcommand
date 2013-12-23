/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandkloster;

import bsuir.mycommand.Command;

/**
 *
 * @author Alexander
 */
public class SimpleRemotCOntrol {
    Command slot;
    public SimpleRemotCOntrol(){
        
    }
    public void setCOmmand(Command command){
        slot=command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}

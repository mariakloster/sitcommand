/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandkloster;

import bsuir.mycommand.Command;

/**
 *
 * @author Alexander
 */
public class HottubOffCOmmand implements Command{

    Hottub hottub;
    public HottubOffCOmmand(Hottub hottub){
        this.hottub=hottub;
    }
    @Override
    public void execute() {
       hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
    
}

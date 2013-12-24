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
public class TVOnCommand implements Command{
    TV tv;
    public TVOnCommand( TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
         tv.off();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

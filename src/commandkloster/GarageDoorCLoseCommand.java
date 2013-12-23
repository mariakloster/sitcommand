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
public class GarageDoorCLoseCommand implements Command {
    private GarageDoor door;
    public GarageDoorCLoseCommand( GarageDoor door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

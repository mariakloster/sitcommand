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
public class GarageDoorOpenCommand implements Command{
    private GarageDoor door;
    public GarageDoorOpenCommand( GarageDoor door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.open();
    }
    
}

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
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand( Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }
    
}

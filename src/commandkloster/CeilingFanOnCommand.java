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
public class CeilingFanOnCommand implements Command {
    CeiligFan ceilingFan;
    public CeilingFanOnCommand( CeiligFan fan){
        this.ceilingFan=fan;
    }
    @Override
    public void execute() {
        ceilingFan.on();
    }
}

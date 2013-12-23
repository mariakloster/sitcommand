package commandkloster;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class RemoteControlTest {
    public static void main(String [] args){
        SimpleRemotCOntrol remote= new SimpleRemotCOntrol();
         Light light=new Light();
         GarageDoor garageDoor=new GarageDoor();
         LightOnCommand lightOn = new LightOnCommand(light);
         GarageDoorOpenCommand garageOpen
                 =new GarageDoorOpenCommand(garageDoor);
         remote.setCOmmand(garageOpen);
         remote.buttonWasPressed();
         remote.setCOmmand(lightOn);
         remote.buttonWasPressed();
    }  
    
}

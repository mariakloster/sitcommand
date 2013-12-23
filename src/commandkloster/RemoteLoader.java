/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandkloster;

/**
 *
 * @author Alexander
 */
public class RemoteLoader {
    public static void main(String [] args){
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight =new Light("Living Room");
        Light kitchenLight =new Light("Kitchen");
        GarageDoor garageDoor=new GarageDoor("");
        CeiligFan ceilingFan=new  CeiligFan("Living Room");
        Stereo stereo=new Stereo("Living room");
        
        LightOnCommand livingRoomLightOn=
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff=
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn=
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff=
                new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn=
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff=
                new CeilingFanOffCommand(ceilingFan);
        
        GarageDoorCLoseCommand garageDoorCLose=
                new GarageDoorCLoseCommand(garageDoor);
        GarageDoorOpenCommand garageDoorOpen=
                new GarageDoorOpenCommand(garageDoor);
        
        StereoOffCommand stereoOff=
                new StereoOffCommand(stereo);
        StereoOnWithCDCommand stereoOn=
                new StereoOnWithCDCommand(stereo);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        //remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
       // remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        //remoteControl.setCommand(3, stereoOn, stereoOff);
        
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        //remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        //remoteControl.offButtonWasPushed(3);
        
    }
}

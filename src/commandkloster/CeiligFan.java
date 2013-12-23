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
public class CeiligFan {
    private String fan;
    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    private int speed;
    public CeiligFan(){
        
    }
    public CeiligFan(String fan){
        this.fan=fan;
        speed=OFF;
    }
    public void high(){
        speed=HIGH;
    }
    public void medium(){
        speed=MEDIUM;
    }
    public void low(){
        speed=LOW;
    }
    public void OFF(){
        speed=OFF;
    }
    public int getSpeed(){
        return speed;
    }
    public void on(){
        
    }
    public void off(){
        
    }
}

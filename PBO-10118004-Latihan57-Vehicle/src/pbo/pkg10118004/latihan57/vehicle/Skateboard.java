/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118004.latihan57.vehicle;

/**
 *
 * @author ASUS A411UF
 */
public class Skateboard extends Vehicle{
    
    private double myBoardLength;
    
    public Skateboard (){
        System.out.println("Skateboard");
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}

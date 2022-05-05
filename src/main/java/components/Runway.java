/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Runway implements Command{
    private IATCMediator atcMediator;
    
    public Runway(IATCMediator atcMediator) 
    {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }
    
    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        atcMediator.setLandingStatus(true);
    }
    
}

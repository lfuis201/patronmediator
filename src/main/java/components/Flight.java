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
public class Flight implements Command{
    
    private IATCMediator atcMediator;
    
    public Flight(IATCMediator atcMediator) 
    {
        this.atcMediator = atcMediator;
    }
    @Override
    public void land() {
        if (atcMediator.isLandingOk()) 
        {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(true);
        }
        else
            System.out.println("Waiting for landing.");
    }
    
    public void getReady() 
    {
        System.out.println("Ready for landing.");
    }
    
}

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
public interface IATCMediator {
    public void registerRunway(Runway runway);
  
    public void registerFlight(Flight flight);
  
    public boolean isLandingOk();
  
    public void setLandingStatus(boolean status);
}

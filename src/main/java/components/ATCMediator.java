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
public class ATCMediator implements IATCMediator{
    private Flight flight;
    private Runway runway;
    public boolean land;
    
    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }
    
}

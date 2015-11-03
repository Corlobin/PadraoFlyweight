/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.padraobridge.cdp;

import ifes.edu.padraobridge.util.DiagnosticTool;

/**
 *
 * @author 20122bsi0387
 */
public abstract class AbstractEngine implements Engine {
    private int size;
    private boolean turbo;
    

    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;
      
    }
   
    public int getSize() {
        return size;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void diagnose(DiagnosticTool tool) {
        
    }

    
    
    
}

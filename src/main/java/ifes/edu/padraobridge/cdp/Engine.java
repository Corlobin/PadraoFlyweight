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
public interface Engine {
    public int getSize();
    public boolean isTurbo();
    public void diagnose(DiagnosticTool tool);
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.padraobridge.util;

/**
 *
 * @author 20122bsi0387
 */
public class EngineDiagnosticTool implements DiagnosticTool {

    public void runDiagnosis(Object obj) {
        System.out.println("Starting engine diagnostic tool for " + obj);
        try {
            Thread.sleep(5000);
            System.out.println("Engine diagnosis complete");
        } catch(InterruptedException ex) {
            System.out.println("Engine diagnosis interruped");
        }
    }
    
}

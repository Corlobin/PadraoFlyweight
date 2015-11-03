package ifes.edu.padraoflyweigth;

import ifes.edu.padraobridge.cdp.*;
import ifes.edu.padraobridge.util.*;

/**
 * Hello world!
 *
 */
public class App {
    /*
     The Flyweight pattern allow you to reference a multitude of objects of the same type 
    and having the same state, but only by instantiating the minimum number of actual objects needed. 
    This is typically done by allocating a 'pool' of objects which can be shared, and this is determined by a 'flyweight factory' class.
    
     */

    public static void main(String[] args) {
        // create the flyweight factory
        EngineFlyweightFactory factory = new EngineFlyweightFactory();
        // create the diagnostic tool
        DiagnosticTool tool = new EngineDiagnosticTool();
        // get the flyweights and run diagnostics on them
        Engine standart1 = factory.getStandartEnginePool(1300);
        standart1.diagnose(tool);
        
        Engine standart2 = factory.getStandartEnginePool(1300);
        standart2.diagnose(tool);
        
        Engine standart3 = factory.getStandartEnginePool(1300);
        standart3.diagnose(tool);
        
        
    }
}

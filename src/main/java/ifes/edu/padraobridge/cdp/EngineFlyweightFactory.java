/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.padraobridge.cdp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20122bsi0387
 */
public class EngineFlyweightFactory {
    private Map<Integer, Engine> standartEnginePool;
    private Map<Integer, Engine> turboEnginePool;

    public EngineFlyweightFactory() {
        standartEnginePool = new HashMap<Integer, Engine>(); 
        turboEnginePool = new HashMap<Integer, Engine>(); 
    }
    
    public Engine getStandartEnginePool(int size){
        Engine e = standartEnginePool.get(size);
        if(e == null) {
            e = new StandartEngine(size);
            standartEnginePool.put(size, e);
            
        }
        return e;
    }
    public Engine getTurboEnginePool(int size){
        Engine e = turboEnginePool.get(size);
        if(e == null) {
            e = new TurboEngine(size);
            turboEnginePool.put(size, e);            
        }
        return e;
    }
}

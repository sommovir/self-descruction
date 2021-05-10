/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.sd.self.destruction;

/**
 *
 * @author sommovir
 */
public class LoggerManager {
    private static LoggerManager _instance = null;
    
    public static LoggerManager getInstance() {
        if (_instance == null) {
            _instance = new LoggerManager();
        }        
        return _instance;        
    }
    
    private LoggerManager() {
        super();
    }
    
    public int getTurns(){
        return -1;
    }
}

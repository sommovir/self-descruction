/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.sd.self.destruction;

/**
 *
 * @author Matteo
 */
public class BhoNonSo {
    private static BhoNonSo _instance = null;
    
    public static BhoNonSo getInstance() {
        if (_instance == null) {
            _instance = new BhoNonSo();
        }        
        return _instance;        
    }
    
    private BhoNonSo() {
        super();
    }
}

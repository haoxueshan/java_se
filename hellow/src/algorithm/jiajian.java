package algorithm;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class jiajian {  
  
    static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        String strs = "1+2*3+4";  
        try {  
            System.out.println(jse.eval(strs));  
        } catch (Exception t) {  
        }  
    }  
}  
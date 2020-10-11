/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythontojava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Júlia Nunes
 */
public class ArqHandler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BindingHelper b = new BindingHelper();
        OutputHelper o = new OutputHelper();
        PythonHelper p = null;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Júlia Nunes\\Desktop\\PythonCode\\PythonCode.txt"))) {
                  
		    for(String line; (line = br.readLine()) != null; ) {
		        if (line.contains("=") && !line.contains("==") && !line.contains("<=") && !line.contains(">=") && !line.contains("!=")) {
                                p = b;
                                p.nextline(line);
		        }else if(line.contains("print")){
                                p = o;
                                p.nextline(line);
                        }
		        //tratar outros casos
		        
		    }
		}
    }
    
    
}

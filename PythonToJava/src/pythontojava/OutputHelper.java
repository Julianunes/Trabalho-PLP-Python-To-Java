/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythontojava;

/**
 *
 * @author Júlia Nunes
 */
public class OutputHelper implements PythonHelper{

    Lexer l = new Lexer();
    PrintLine p = new PrintLine();
    @Override
    public void nextline(String line) {
      String [] part = line.split("print");
      l.setLexema(l.getLexema() + "System.out.println" + part[1] + ";");
      p.print(l);
      l.setLexema("");

    }    
}

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
public class BindingHelper implements PythonHelper{

    Lexer l = new Lexer();
    PrintLine p = new PrintLine();
    @Override
    public void nextline(String line) {
        line = line.replaceAll(" ", "");
        String[] sides = line.split("=");
        if(sides[1].startsWith("int")){
            l.setLexema(l.getLexema() + "int " + sides[0] + " = ");
            if(sides[1].contains("input")){
            l.setLexema(l.getLexema() + "in.nextInt();");
            p.print(l);
            l.setLexema("");
            }else{
            l.setLexema(l.getLexema() + sides[1] + ";");
            p.print(l);
            l.setLexema("");
            }
        }else if(sides[1].startsWith("float")){
            l.setLexema(l.getLexema() + "float " + sides[0] + " = ");
            if(sides[1].contains("input")){
            l.setLexema(l.getLexema() + "in.nextFloat();");
            p.print(l);
            l.setLexema("");
            }else{
            l.setLexema(l.getLexema() + sides[1] + ";");
            p.print(l);
            l.setLexema("");
            }
        }else if(sides[1].startsWith("True")){
            l.setLexema(l.getLexema() + "boolean " + sides[0] + " = ");
            if(sides[1].contains("input")){
            l.setLexema(l.getLexema() + "in.nextBoolean();");
            p.print(l);
            l.setLexema("");
            }else{
            l.setLexema(sides[0] + " = " + "true;");
            p.print(l);
            l.setLexema("");
            }
        }else if(sides[1].startsWith("False")){
            l.setLexema(l.getLexema() + "boolean " + sides[0] + " = ");
            if(sides[1].contains("input")){
            l.setLexema(l.getLexema() + "in.nextBoolean();");
            p.print(l);
            l.setLexema("");
            }else{
            l.setLexema(l.getLexema() + "false;");
            p.print(l);
            l.setLexema("");
            }      
        }else if(sides[1].startsWith("input")){
            l.setLexema(l.getLexema() + "char " + sides[0] + " = ");
            if(sides[1].contains("input")){
            l.setLexema(l.getLexema() + "in.next().charAt(0);");
            p.print(l);
            l.setLexema("");
            }else{
            l.setLexema(l.getLexema() + sides[1] + ";");
            p.print(l);
            l.setLexema("");
            }
        }else{
            l.setLexema(l.getLexema() + "float " + sides[0] + " = " + sides[1] + ";");
            p.print(l);
            l.setLexema("");
        }
        
    }
    
}

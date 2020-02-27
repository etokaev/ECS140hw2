package nada;

import nada.*;
import nada.lexer.*;
import nada.parser.*;
import nada.node.*;
import nada.analysis.*;
import nada.visitors.*;
import java.io.*;
import java.util.*;

public class nada {
	public static void main(String[] arguments) {
		try {

               		

           if (arguments.length == 2 && arguments[1].charAt(0) == 'D' ) {new Parser(new Lexer
           (new PushbackReader(new BufferedReader(new FileReader(arguments[0])), 1024))).parse().apply(new DebugAdapter());} 
           else if (arguments.length == 1) 
           {new Parser(new Lexer(new PushbackReader(new BufferedReader(
           new FileReader(arguments[0])), 1024))).parse().apply(new CodeGeneration());}
            
                  
		} catch (ParserException e) {
			System.out.println("\nPARSER ERROR: " + e.getMessage());
		} catch (LexerException e) {
			System.out.println("\nLEXER ERROR: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("\nGENERAL ERROR: " + e.getMessage() + "\n\n");
			e.printStackTrace(System.out);
		}
	}
}


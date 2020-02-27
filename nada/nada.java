package nada;

import nada.*;
import nada.lexer.*;
import nada.parser.*;
import nada.node.*;
import nada.analysis.*;
import nada.visitors.*;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.PrintStream;
import java.lang.*;


public class nada {
	public static void main(String[] arguments) {
		try {

			PrintStream originalOut = System.out;
        
			Scanner input = new Scanner(System.in);
			//System.out.print("Enter the desired name of your file: ");
			String fileName = arguments[0].substring(0,arguments[0].indexOf("."));
			fileName = fileName + ".java";
		
			PrintStream fileOut = new PrintStream(fileName);
			System.setOut(fileOut);					

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


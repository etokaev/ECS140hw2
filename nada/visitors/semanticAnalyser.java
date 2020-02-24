package nada.vistors;

import nada.analysis.*;
import nada.node.*;
import java.util.*;

public class SemanticAnalyzer extends DepthFirstAdapter {
  Hashtable symbol_table = new Hashtable();

  public void outASingleIdentifierList(AidentifierList Node){
    TIdentifier ident = node.getIdentifier();

    String key = ident.getText().toUpperCase();
    if (symbol_table.containsKey(key)) {            
      System.out.println("Identifier already defined.");
      System.exit(0);
    }

    else {
            symbol_table.put(key, key);
        }
    }

  public void outASingleIdentifierList(AidentifierList node) {
        // identifier to be stored in the symbol table
    TIdentifier ident = node.getIdentifier();
 
        // name of the identifier to be stored in the table
    String key = ident.getText().toUpperCase(); // is the identifier in the table?
 
    if (symbol_table.containsKey(key)) { // report an error
      System.out.println("Error: [" ident.getLine() + "," + ident.getPos() + "] Identifier already defined.");
      System.exit(0);
      }
        else {
            symbol_table.put(key, key);
        }
    }



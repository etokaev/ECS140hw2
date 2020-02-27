package nada.visitors;

import nada.analysis.*;
import nada.lexer.*;
import nada.node.*;
import java.util.*;


public class CodeGeneration extends DepthFirstAdapter 
{

  public void caseStart(Start node)
  {
    inStart(node);
    System.out.print("public class ");
    System.out.println(" {");
    node.getPNada().apply(this);
    node.getEOF().apply(this);
    outStart(node);

  
  }


    public void caseASubprogramBody(ASubprogramBody node)

    {
        inASubprogramBody(node);
        System.out.println(node.getIdent());
        if(node.getSubprogramSpec() != null)
        {
            node.getSubprogramSpec().apply(this);
        }
        if(node.getIs() != null)
        {
            node.getIs().apply(this);
        }
        if(node.getDeclPart() != null)
        {
            node.getDeclPart().apply(this);
        }
        if(node.getBegin() != null)
        {
            node.getBegin().apply(this);
        }
        if(node.getStmtSeq() != null)
        {
            node.getStmtSeq().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outASubprogramBody(node);
    }

 
   
}



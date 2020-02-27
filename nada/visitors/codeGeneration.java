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
    node.getPNada().apply(this);
    node.getEOF().apply(this);
    System.out.println(" }");
    outStart(node);


  
  }


    public void caseASubprogramBody(ASubprogramBody node)

    {
        inASubprogramBody(node);
    
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



  public void caseASubprogramSpec(ASubprogramSpec node)
    {
        inASubprogramSpec(node);
        if(node.getProc() != null)
        {
                    
            node.getProc().apply(this);
        }
        if(node.getIdent() != null)
        {
            System.out.print(node.getIdent());
            System.out.println("{");
            System.out.println("  public static void main(String[] args) {");

            node.getIdent().apply(this);
        }
        if(node.getFormalPart() != null)
        {

            node.getFormalPart().apply(this);
        }
        outASubprogramSpec(node);
    }

   public void caseAWritelnWriteStmt(AWritelnWriteStmt node)
    {
        inAWritelnWriteStmt(node);
        System.out.print("System.out.println(");
        if(node.getWriteln() != null)
        {
            node.getWriteln().apply(this);
        }
        if(node.getLParen() != null)
        {
            node.getLParen().apply(this);
        }
        if(node.getWriteExpr() != null)
        {
            node.getWriteExpr().apply(this);
        }
        if(node.getRParen() != null)
        {
            node.getRParen().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAWritelnWriteStmt(node);
    }


 
   
}



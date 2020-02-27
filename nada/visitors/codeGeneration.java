package nada.visitors;
import nada.analysis.*;
import nada.lexer.*;
import nada.node.*;
import java.util.*;


class codeGeneration extends DepthFirstAdaptor
{
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
}



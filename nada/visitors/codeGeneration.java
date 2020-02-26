package nada.visitors;

import nada.analysis.*;
import java.util.*;

class codeGenerator extends DepthFirstAdaptor
{
  public void inASubprogramBody(ASubprogramBody node)
    {
        System.out.print("public class ");

    }

  public void inASubprogramSpec(ASubprogramSpec node)
  {
    System.out.print(node.getIdent());
    System.out.println("{");
  }
  public void outASubprogramSpec(ASubprogramSpec node)
  {
    System.out.println("}");
  }

  public


}





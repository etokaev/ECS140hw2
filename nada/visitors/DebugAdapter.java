package nada.visitors;
import nada.analysis.*;
import nada.lexer.*;
import nada.node.*;
import java.util.*;

public class DebugAdapter extends DepthFirstAdapter
{
  public void defaultIn(Node node)
  {
    System.err.println("IN:" + node.getClass().getSimpleName() + ":" + node);
  }
  public void defaultOut(Node node){
  System.err.println("OUT:" + node.getClass().getSimpleName() + ":" + node);
}
}
:w:

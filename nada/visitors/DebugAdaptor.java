package nada.visitors;
import nada.analysis.*;
import nada.lexor.*;
import nada.node.*;
import java.util.*;

class DebugAdaptor extends DepthFirstAdaptor
{
  public void defaulIn(Node node)
  {
    System.err.println("IN:" + node.getClass().getSimpleName() + ":" + node);
  }
  public void defaulOut(Node node){
  System.err.println("OUT:" + node.getClass().getSimpleName() + ":" + node);
}
}


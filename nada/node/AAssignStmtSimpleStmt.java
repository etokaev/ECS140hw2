/* This file was generated by SableCC (http://www.sablecc.org/). */

package nada.node;

import nada.analysis.*;

@SuppressWarnings("nls")
public final class AAssignStmtSimpleStmt extends PSimpleStmt
{
    private PAssignStmt _assignStmt_;

    public AAssignStmtSimpleStmt()
    {
        // Constructor
    }

    public AAssignStmtSimpleStmt(
        @SuppressWarnings("hiding") PAssignStmt _assignStmt_)
    {
        // Constructor
        setAssignStmt(_assignStmt_);

    }

    @Override
    public Object clone()
    {
        return new AAssignStmtSimpleStmt(
            cloneNode(this._assignStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignStmtSimpleStmt(this);
    }

    public PAssignStmt getAssignStmt()
    {
        return this._assignStmt_;
    }

    public void setAssignStmt(PAssignStmt node)
    {
        if(this._assignStmt_ != null)
        {
            this._assignStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._assignStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._assignStmt_ == child)
        {
            this._assignStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._assignStmt_ == oldChild)
        {
            setAssignStmt((PAssignStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

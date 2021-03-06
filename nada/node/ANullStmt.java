/* This file was generated by SableCC (http://www.sablecc.org/). */

package nada.node;

import nada.analysis.*;

@SuppressWarnings("nls")
public final class ANullStmt extends PNullStmt
{
    private TNull _null_;
    private TSemi _semi_;

    public ANullStmt()
    {
        // Constructor
    }

    public ANullStmt(
        @SuppressWarnings("hiding") TNull _null_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setNull(_null_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new ANullStmt(
            cloneNode(this._null_),
            cloneNode(this._semi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANullStmt(this);
    }

    public TNull getNull()
    {
        return this._null_;
    }

    public void setNull(TNull node)
    {
        if(this._null_ != null)
        {
            this._null_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._null_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._null_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._null_ == child)
        {
            this._null_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._null_ == oldChild)
        {
            setNull((TNull) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

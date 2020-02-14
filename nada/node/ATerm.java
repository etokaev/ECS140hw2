/* This file was generated by SableCC (http://www.sablecc.org/). */

package nada.node;

import nada.analysis.*;

@SuppressWarnings("nls")
public final class ATerm extends PTerm
{
    private PFactor _left_;
    private PMulOp _mulOp_;
    private PFactor _right_;

    public ATerm()
    {
        // Constructor
    }

    public ATerm(
        @SuppressWarnings("hiding") PFactor _left_,
        @SuppressWarnings("hiding") PMulOp _mulOp_,
        @SuppressWarnings("hiding") PFactor _right_)
    {
        // Constructor
        setLeft(_left_);

        setMulOp(_mulOp_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ATerm(
            cloneNode(this._left_),
            cloneNode(this._mulOp_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATerm(this);
    }

    public PFactor getLeft()
    {
        return this._left_;
    }

    public void setLeft(PFactor node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public PMulOp getMulOp()
    {
        return this._mulOp_;
    }

    public void setMulOp(PMulOp node)
    {
        if(this._mulOp_ != null)
        {
            this._mulOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mulOp_ = node;
    }

    public PFactor getRight()
    {
        return this._right_;
    }

    public void setRight(PFactor node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._mulOp_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._mulOp_ == child)
        {
            this._mulOp_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PFactor) newChild);
            return;
        }

        if(this._mulOp_ == oldChild)
        {
            setMulOp((PMulOp) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

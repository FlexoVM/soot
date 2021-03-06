/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class ACmplBinop extends PBinop
{
    private TCmpl _cmpl_;

    public ACmplBinop()
    {
    }

    public ACmplBinop(
        TCmpl _cmpl_)
    {
        setCmpl(_cmpl_);

    }
    public Object clone()
    {
        return new ACmplBinop(
            (TCmpl) cloneNode(_cmpl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmplBinop(this);
    }

    public TCmpl getCmpl()
    {
        return _cmpl_;
    }

    public void setCmpl(TCmpl node)
    {
        if(_cmpl_ != null)
        {
            _cmpl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cmpl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_cmpl_);
    }

    void removeChild(Node child)
    {
        if(_cmpl_ == child)
        {
            _cmpl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_cmpl_ == oldChild)
        {
            setCmpl((TCmpl) newChild);
            return;
        }

    }
}

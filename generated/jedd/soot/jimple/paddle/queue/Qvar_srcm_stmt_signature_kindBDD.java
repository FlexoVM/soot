package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Qvar_srcm_stmt_signature_kindBDD extends Qvar_srcm_stmt_signature_kind {
    public Qvar_srcm_stmt_signature_kindBDD(String name) { super(name); }
    
    private LinkedList readers = new LinkedList();
    
    public void add(VarNode _var, SootMethod _srcm, Unit _stmt, NumberedString _signature, Kind _kind) {
        this.add(new jedd.internal.RelationContainer(new Attribute[] { var.v(), srcm.v(), stmt.v(), signature.v(), kind.v() },
                                                     new PhysicalDomain[] { V1.v(), MS.v(), ST.v(), SG.v(), KD.v() },
                                                     ("this.add(jedd.internal.Jedd.v().literal(new java.lang.Object" +
                                                      "[...], new jedd.Attribute[...], new jedd.PhysicalDomain[...]" +
                                                      ")) at /home/research/ccl/olhota/soot-trunk/src/soot/jimple/p" +
                                                      "addle/queue/Qvar_srcm_stmt_signature_kindBDD.jedd:34,8-11"),
                                                     jedd.internal.Jedd.v().literal(new Object[] { _var, _srcm, _stmt, _signature, _kind },
                                                                                    new Attribute[] { var.v(), srcm.v(), stmt.v(), signature.v(), kind.v() },
                                                                                    new PhysicalDomain[] { V1.v(), MS.v(), ST.v(), SG.v(), KD.v() })));
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        for (Iterator it = readers.iterator(); it.hasNext(); ) {
            Rvar_srcm_stmt_signature_kindBDD reader = (Rvar_srcm_stmt_signature_kindBDD) it.next();
            reader.add(new jedd.internal.RelationContainer(new Attribute[] { stmt.v(), signature.v(), srcm.v(), var.v(), kind.v() },
                                                           new PhysicalDomain[] { ST.v(), SG.v(), MS.v(), V1.v(), KD.v() },
                                                           ("reader.add(in) at /home/research/ccl/olhota/soot-trunk/src/s" +
                                                            "oot/jimple/paddle/queue/Qvar_srcm_stmt_signature_kindBDD.jed" +
                                                            "d:39,12-18"),
                                                           in));
        }
    }
    
    public Rvar_srcm_stmt_signature_kind reader(String rname) {
        Rvar_srcm_stmt_signature_kind ret = new Rvar_srcm_stmt_signature_kindBDD(name + ":" + rname);
        readers.add(ret);
        return ret;
    }
}
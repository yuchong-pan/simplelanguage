package com.oracle.truffle.sl.builtins;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.runtime.TaintString;

@NodeInfo(shortName = "sanitize")
public abstract class SanitizeTaintStringBuiltin extends SLBuiltinNode {
    @Specialization
    public String sanitize(TaintString ts) {
        return ts.getValue();
    }
}

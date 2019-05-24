package com.oracle.truffle.sl.runtime;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;

@ExportLibrary(InteropLibrary.class)
public class TaintString implements TruffleObject, Comparable<TaintString> {
    private final String value;

    public TaintString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    @TruffleBoundary
    public int compareTo(TaintString o) {
        return value.compareTo(o.getValue());
    }
}

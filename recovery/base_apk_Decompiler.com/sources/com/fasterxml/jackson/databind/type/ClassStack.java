package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }

    public final ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public final void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public final void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public final ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        do {
            this = this._parent;
            if (this == null) {
                return null;
            }
        } while (this._current != cls);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        sb.append(arrayList == null ? SessionDescription.SUPPORTED_SDP_VERSION : String.valueOf(arrayList.size()));
        sb.append(')');
        while (this != null) {
            sb.append(' ');
            sb.append(this._current.getName());
            this = this._parent;
        }
        sb.append(']');
        return sb.toString();
    }
}

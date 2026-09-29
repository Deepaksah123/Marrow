package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ClassIntrospector extends RuntimeException {
    private final List<String> AudioAttributesCompatParcelizer;

    public ClassIntrospector() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.AudioAttributesCompatParcelizer = null;
    }

    public final _add AudioAttributesCompatParcelizer() {
        return new _add(getMessage());
    }
}

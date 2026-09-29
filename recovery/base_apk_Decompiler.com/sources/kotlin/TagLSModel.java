package kotlin;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TagLSModel {
    private final List<?> AudioAttributesCompatParcelizer;
    private final Method write;

    TagLSModel(Method method, List<?> list) {
        this.write = method;
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list);
    }

    public final Method IconCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.write.getDeclaringClass().getName(), this.write.getName(), this.AudioAttributesCompatParcelizer);
    }
}

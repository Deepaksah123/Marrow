package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes5.dex */
public class SevenZMethodConfiguration {
    private final SevenZMethod method;
    private final Object options;

    public SevenZMethodConfiguration(SevenZMethod sevenZMethod) {
        this(sevenZMethod, null);
    }

    public SevenZMethodConfiguration(SevenZMethod sevenZMethod, Object obj) {
        this.method = sevenZMethod;
        this.options = obj;
        if (obj == null || Coders.findByMethod(sevenZMethod).canAcceptOptions(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder("The ");
        sb.append(sevenZMethod);
        sb.append(" method doesn't support options of type ");
        sb.append(obj.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    public SevenZMethod getMethod() {
        return this.method;
    }

    public Object getOptions() {
        return this.options;
    }
}

package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class SchemaAware extends IOException {
    public final boolean IconCompatParcelizer;
    public final int write;

    public static SchemaAware read(String str, Throwable th) {
        return new SchemaAware(str, th, true, 0);
    }

    public static SchemaAware RemoteActionCompatParcelizer(String str, Throwable th) {
        return new SchemaAware(str, th, true, 1);
    }

    public static SchemaAware AudioAttributesCompatParcelizer(String str, Throwable th) {
        return new SchemaAware(str, th, true, 4);
    }

    public static SchemaAware RemoteActionCompatParcelizer(String str) {
        return new SchemaAware(str, null, false, 1);
    }

    public SchemaAware(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.IconCompatParcelizer = z;
        this.write = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", dataType=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }
}

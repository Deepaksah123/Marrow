package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/_skipString;", "Lo/_writeQuotedRaw;", "", "p0", "IconCompatParcelizer", "(I)I", "", "", "read", "(ILjava/lang/Object;)Z", "write", "", "(I)Ljava/lang/String;", "I", "RemoteActionCompatParcelizer", "androidAutofillType"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
final class _skipString implements _writeQuotedRaw {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public static int IconCompatParcelizer(int i) {
        return i;
    }

    private /* synthetic */ _skipString(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public static final /* synthetic */ _skipString AudioAttributesCompatParcelizer(int i) {
        return new _skipString(i);
    }

    public static boolean read(int i, Object obj) {
        return (obj instanceof _skipString) && i == ((_skipString) obj).getRemoteActionCompatParcelizer();
    }

    public static int write(int i) {
        return Integer.hashCode(i);
    }

    public static String read(int i) {
        StringBuilder sb = new StringBuilder("AndroidContentDataType(androidAutofillType=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return read(this.RemoteActionCompatParcelizer, obj);
    }

    public final int hashCode() {
        return write(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return read(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}

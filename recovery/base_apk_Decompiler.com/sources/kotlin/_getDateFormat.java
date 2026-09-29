package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Lo/_getDateFormat;", "", "", "Lo/NativePointerButtons;", "p0", "write", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _getDateFormat {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int write;

    public static int write(int i) {
        return i;
    }

    public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
        return (obj instanceof _getDateFormat) && i == ((_getDateFormat) obj).getWrite();
    }

    public static int read(int i) {
        return Integer.hashCode(i);
    }

    public static String IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("PointerButtons(packedValue=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return read(this.write);
    }

    public final String toString() {
        return IconCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ int getWrite() {
        return this.write;
    }
}

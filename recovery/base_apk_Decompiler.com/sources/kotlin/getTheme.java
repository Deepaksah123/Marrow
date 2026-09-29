package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a"}, d2 = {"Lo/getTheme;", "Lo/onCreateView;", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;)I", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;)I", "write", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getTheme implements onCreateView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public getTheme(int i, int i2, int i3, int i4) {
        this.read = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.IconCompatParcelizer = i4;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return this.read;
    }

    @Override // kotlin.onCreateView
    public final int AudioAttributesCompatParcelizer(bufferMapProperty p0) {
        return this.write;
    }

    @Override // kotlin.onCreateView
    public final int write(bufferMapProperty p0, tryToResolveUnresolved p1) {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.onCreateView
    public final int RemoteActionCompatParcelizer(bufferMapProperty p0) {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.read);
        sb.append(", top=");
        sb.append(this.write);
        sb.append(", right=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", bottom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getTheme)) {
            return false;
        }
        getTheme gettheme = (getTheme) p0;
        return this.read == gettheme.read && this.write == gettheme.write && this.RemoteActionCompatParcelizer == gettheme.RemoteActionCompatParcelizer && this.IconCompatParcelizer == gettheme.IconCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.read;
        return (((((i * 31) + this.write) * 31) + this.RemoteActionCompatParcelizer) * 31) + this.IconCompatParcelizer;
    }
}

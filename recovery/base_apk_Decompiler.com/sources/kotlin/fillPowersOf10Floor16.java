package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Lo/fillPowersOf10Floor16;", "", "Lo/splitFloor16;", "p0", "read", "(Lo/splitFloor16;)Lo/splitFloor16;", "", "(Z)Lo/splitFloor16;", "write", "(Lo/splitFloor16;)Z", "", "AudioAttributesCompatParcelizer", "(Lo/splitFloor16;Z)V", "(Lo/splitFloor16;Z)Z", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/splitFloor16;", "IconCompatParcelizer", "wrapped"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class fillPowersOf10Floor16 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final splitFloor16 IconCompatParcelizer;

    public static splitFloor16 read(splitFloor16 splitfloor16) {
        return splitfloor16;
    }

    public static splitFloor16 read(boolean z) {
        return read(new splitFloor16(z ? 1 : 0));
    }

    public static final boolean write(splitFloor16 splitfloor16) {
        return splitfloor16.get() != 0;
    }

    public static final void AudioAttributesCompatParcelizer(splitFloor16 splitfloor16, boolean z) {
        splitfloor16.set(z ? 1 : 0);
    }

    public static final boolean write(splitFloor16 splitfloor16, boolean z) {
        return splitfloor16.compareAndSet(1, z ? 1 : 0);
    }

    public static boolean RemoteActionCompatParcelizer(splitFloor16 splitfloor16, Object obj) {
        return (obj instanceof fillPowersOf10Floor16) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(splitfloor16, ((fillPowersOf10Floor16) obj).getIconCompatParcelizer());
    }

    public static int RemoteActionCompatParcelizer(splitFloor16 splitfloor16) {
        return splitfloor16.hashCode();
    }

    public static String AudioAttributesCompatParcelizer(splitFloor16 splitfloor16) {
        StringBuilder sb = new StringBuilder("AtomicBoolean(wrapped=");
        sb.append(splitfloor16);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ splitFloor16 getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}

package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004"}, d2 = {"Lo/subtractInto;", "", "K", "V", "Lo/setKeyListener;", "p0", "AudioAttributesCompatParcelizer", "(Lo/setKeyListener;)Lo/setKeyListener;", "", "read", "(Lo/setKeyListener;)V", "", "RemoteActionCompatParcelizer", "(Lo/setKeyListener;)Z", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/setKeyListener;", "map"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class subtractInto<K, V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> read;

    public static <K, V> setKeyListener<Object, Object> AudioAttributesCompatParcelizer(setKeyListener<Object, Object> setkeylistener) {
        return setkeylistener;
    }

    public static /* synthetic */ setKeyListener read(setKeyListener setkeylistener, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        int i2 = 1;
        if ((i & 1) != 0) {
            setkeylistener = new setKeyListener(0, i2, null);
        }
        return AudioAttributesCompatParcelizer(setkeylistener);
    }

    public static final void read(setKeyListener<Object, Object> setkeylistener) {
        setkeylistener.AudioAttributesCompatParcelizer();
    }

    public static final boolean RemoteActionCompatParcelizer(setKeyListener<Object, Object> setkeylistener) {
        return setkeylistener.RemoteActionCompatParcelizer();
    }

    public static boolean read(setKeyListener<Object, Object> setkeylistener, Object obj) {
        return (obj instanceof subtractInto) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setkeylistener, ((subtractInto) obj).getRead());
    }

    public static int write(setKeyListener<Object, Object> setkeylistener) {
        return setkeylistener.hashCode();
    }

    public static String IconCompatParcelizer(setKeyListener<Object, Object> setkeylistener) {
        StringBuilder sb = new StringBuilder("SafeMultiValueMap(map=");
        sb.append(setkeylistener);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return read(this.read, p0);
    }

    public final int hashCode() {
        return write(this.read);
    }

    public final String toString() {
        return IconCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ setKeyListener getRead() {
        return this.read;
    }
}

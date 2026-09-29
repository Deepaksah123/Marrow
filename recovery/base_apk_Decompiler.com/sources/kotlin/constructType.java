package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Lo/constructType;", "", "Landroid/view/KeyEvent;", "Lo/AudioAttributesCompatParcelizer;", "p0", "write", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/view/KeyEvent;", "read", "nativeKeyEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class constructType {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final KeyEvent read;

    public static KeyEvent write(KeyEvent keyEvent) {
        return keyEvent;
    }

    private /* synthetic */ constructType(KeyEvent keyEvent) {
        this.read = keyEvent;
    }

    public static final /* synthetic */ constructType read(KeyEvent keyEvent) {
        return new constructType(keyEvent);
    }

    public static boolean AudioAttributesCompatParcelizer(KeyEvent keyEvent, Object obj) {
        return (obj instanceof constructType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(keyEvent, ((constructType) obj).getRead());
    }

    public static int RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String IconCompatParcelizer(KeyEvent keyEvent) {
        StringBuilder sb = new StringBuilder("KeyEvent(nativeKeyEvent=");
        sb.append(keyEvent);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.read);
    }

    public final String toString() {
        return IconCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ KeyEvent getRead() {
        return this.read;
    }
}

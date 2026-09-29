package kotlin;

import android.window.BackEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012"}, d2 = {"Lo/AudioAttributesImplApi26Parcelizer;", "", "Landroid/window/BackEvent;", "p0", "<init>", "(Landroid/window/BackEvent;)V", "", "p1", "p2", "", "p3", "(FFFI)V", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "F", "read", "()F", "write", "I", "()I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AudioAttributesImplApi26Parcelizer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public AudioAttributesImplApi26Parcelizer(float f, float f2, float f3, int i) {
        this.IconCompatParcelizer = f;
        this.read = f2;
        this.write = f3;
        this.AudioAttributesCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioAttributesImplApi26Parcelizer(BackEvent backEvent) {
        this(MediaBrowserCompatCustomActionResultReceiver.INSTANCE.bv_(backEvent), MediaBrowserCompatCustomActionResultReceiver.INSTANCE.bw_(backEvent), MediaBrowserCompatCustomActionResultReceiver.INSTANCE.bt_(backEvent), MediaBrowserCompatCustomActionResultReceiver.INSTANCE.bu_(backEvent));
        toMagicModuleMetaRepoModel.write(backEvent, "");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", touchY=");
        sb.append(this.read);
        sb.append(", progress=");
        sb.append(this.write);
        sb.append(", swipeEdge=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}

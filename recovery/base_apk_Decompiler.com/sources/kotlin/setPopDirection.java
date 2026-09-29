package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0006J\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006R+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\r\u0010\fR+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0010\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\r\u0010\u0019"}, d2 = {"Lo/setPopDirection;", "", "", "p0", "p1", "<init>", "(II)V", "Lo/setEnterTransition;", "", "read", "(Lo/setEnterTransition;)V", "AudioAttributesCompatParcelizer", "(I)V", "RemoteActionCompatParcelizer", "Lo/performStart;", "(Lo/performStart;I)I", "write", "Lo/hasMoreBytes;", "()I", "IconCompatParcelizer", "", "Z", "Ljava/lang/Object;", "Lo/clearAuxEffectInfo;", "Lo/clearAuxEffectInfo;", "()Lo/clearAuxEffectInfo;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPopDirection {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Object IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final clearAuxEffectInfo read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final hasMoreBytes RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final hasMoreBytes AudioAttributesCompatParcelizer;

    public setPopDirection(int i, int i2) {
        this.AudioAttributesCompatParcelizer = _appendByte.RemoteActionCompatParcelizer(i);
        this.RemoteActionCompatParcelizer = _appendByte.RemoteActionCompatParcelizer(i2);
        this.read = new clearAuxEffectInfo(i, 30, 100);
    }

    public /* synthetic */ setPopDirection(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    private final void write(int i) {
        this.RemoteActionCompatParcelizer.read(i);
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final clearAuxEffectInfo getRead() {
        return this.read;
    }

    public final void read(setEnterTransition p0) {
        setAllowReturnTransitionOverlap read = p0.getRead();
        this.IconCompatParcelizer = read != null ? read.getMediaMetadataCompat() : null;
        if (this.write || p0.getMediaMetadataCompat() > 0) {
            this.write = true;
            int iconCompatParcelizer = p0.getIconCompatParcelizer();
            if (iconCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                getRootStableInsets.AudioAttributesCompatParcelizer("scrollOffset should be non-negative");
            }
            setAllowReturnTransitionOverlap read2 = p0.getRead();
            read(read2 != null ? read2.getIconCompatParcelizer() : 0, iconCompatParcelizer);
        }
    }

    public final void RemoteActionCompatParcelizer(int p0, int p1) {
        read(p0, p1);
        this.IconCompatParcelizer = null;
    }

    public final int RemoteActionCompatParcelizer(performStart p0, int p1) {
        int iWrite = DrmInitData.write(p0, this.IconCompatParcelizer, p1);
        if (p1 != iWrite) {
            RemoteActionCompatParcelizer(iWrite);
            this.read.read(p1);
        }
        return iWrite;
    }

    private final void read(int p0, int p1) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder("Index should be non-negative (");
            sb.append(p0);
            sb.append(')');
            getRootStableInsets.RemoteActionCompatParcelizer(sb.toString());
        }
        RemoteActionCompatParcelizer(p0);
        this.read.read(p0);
        write(p1);
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            getRootStableInsets.AudioAttributesCompatParcelizer("scrollOffset should be non-negative");
        }
        write(p0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setPopDirection() {
        int i = 0;
        this(i, i, 3, null);
    }
}

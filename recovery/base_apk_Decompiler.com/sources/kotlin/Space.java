package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0006R+\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\t\u0010\fR+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0010\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019"}, d2 = {"Lo/Space;", "", "", "p0", "p1", "<init>", "(II)V", "Lo/destroyInternalPathIterator;", "", "AudioAttributesCompatParcelizer", "(Lo/destroyInternalPathIterator;)V", "IconCompatParcelizer", "(I)V", "Lo/onPostResume;", "write", "(Lo/onPostResume;I)I", "read", "Lo/hasMoreBytes;", "()I", "", "RemoteActionCompatParcelizer", "Z", "Ljava/lang/Object;", "Lo/clearAuxEffectInfo;", "Lo/clearAuxEffectInfo;", "()Lo/clearAuxEffectInfo;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Space {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final hasMoreBytes read;
    private final clearAuxEffectInfo IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final hasMoreBytes AudioAttributesCompatParcelizer;

    public Space(int i, int i2) {
        this.read = _appendByte.RemoteActionCompatParcelizer(i);
        this.AudioAttributesCompatParcelizer = _appendByte.RemoteActionCompatParcelizer(i2);
        this.IconCompatParcelizer = new clearAuxEffectInfo(i, 90, 200);
    }

    public /* synthetic */ Space(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        this.read.read(i);
    }

    public final int IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    private final void read(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final clearAuxEffectInfo getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(destroyInternalPathIterator p0) {
        createInternalPathIterator[] read;
        createInternalPathIterator createinternalpathiterator;
        createInternalPathIterator[] read2;
        createInternalPathIterator createinternalpathiterator2;
        PathIteratorPreApi34Impl iconCompatParcelizer = p0.getIconCompatParcelizer();
        this.RemoteActionCompatParcelizer = (iconCompatParcelizer == null || (read2 = iconCompatParcelizer.getRead()) == null || (createinternalpathiterator2 = (createInternalPathIterator) getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(read2)) == null) ? null : createinternalpathiterator2.getMediaMetadataCompat();
        if (this.write || p0.getOnAddQueueItem() > 0) {
            this.write = true;
            int audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
            if (audioAttributesCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                StringBuilder sb = new StringBuilder("scrollOffset should be non-negative (");
                sb.append(audioAttributesCompatParcelizer);
                sb.append(')');
                getRootStableInsets.AudioAttributesCompatParcelizer(sb.toString());
            }
            PathIteratorPreApi34Impl iconCompatParcelizer2 = p0.getIconCompatParcelizer();
            int iconCompatParcelizer3 = 0;
            if (iconCompatParcelizer2 != null && (read = iconCompatParcelizer2.getRead()) != null && (createinternalpathiterator = (createInternalPathIterator) getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(read)) != null) {
                iconCompatParcelizer3 = createinternalpathiterator.getIconCompatParcelizer();
            }
            read(iconCompatParcelizer3, audioAttributesCompatParcelizer);
        }
    }

    public final void IconCompatParcelizer(int p0, int p1) {
        read(p0, p1);
        this.RemoteActionCompatParcelizer = null;
    }

    public final int write(onPostResume p0, int p1) {
        int iWrite = DrmInitData.write(p0, this.RemoteActionCompatParcelizer, p1);
        if (p1 != iWrite) {
            AudioAttributesCompatParcelizer(iWrite);
            this.IconCompatParcelizer.read(p1);
        }
        return iWrite;
    }

    public final void IconCompatParcelizer(int p0) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            getRootStableInsets.AudioAttributesCompatParcelizer("scrollOffset should be non-negative");
        }
        read(p0);
    }

    private final void read(int p0, int p1) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            getRootStableInsets.RemoteActionCompatParcelizer("Index should be non-negative");
        }
        AudioAttributesCompatParcelizer(p0);
        this.IconCompatParcelizer.read(p0);
        read(p1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Space() {
        int i = 0;
        this(i, i, 3, null);
    }
}

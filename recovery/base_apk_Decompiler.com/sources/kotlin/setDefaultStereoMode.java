package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u0011\u0010\u0016R+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001a\u0010#\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\u0011\u0010\""}, d2 = {"Lo/setDefaultStereoMode;", "", "", "p0", "", "p1", "Lo/ApicFrame;", "p2", "<init>", "(IFLo/ApicFrame;)V", "Lo/removeEventListener;", "", "AudioAttributesCompatParcelizer", "(Lo/removeEventListener;)V", "write", "(IF)V", "Lo/disable;", "RemoteActionCompatParcelizer", "(Lo/disable;I)I", "read", "(F)V", "IconCompatParcelizer", "(I)V", "AudioAttributesImplApi26Parcelizer", "Lo/ApicFrame;", "Lo/hasMoreBytes;", "()I", "Lo/nextTokenToRead;", "()F", "", "Z", "Ljava/lang/Object;", "Lo/clearAuxEffectInfo;", "Lo/clearAuxEffectInfo;", "()Lo/clearAuxEffectInfo;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDefaultStereoMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final clearAuxEffectInfo MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final ApicFrame read;
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final nextTokenToRead RemoteActionCompatParcelizer;
    private final hasMoreBytes write;

    public setDefaultStereoMode(int i, float f, ApicFrame apicFrame) {
        this.read = apicFrame;
        this.write = _appendByte.RemoteActionCompatParcelizer(i);
        this.RemoteActionCompatParcelizer = getInputCodeUtf8.AudioAttributesCompatParcelizer(f);
        this.MediaBrowserCompatItemReceiver = new clearAuxEffectInfo(i, 30, 100);
    }

    private final void RemoteActionCompatParcelizer(int i) {
        this.write.read(i);
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    private final void read(float f) {
        this.RemoteActionCompatParcelizer.write(f);
    }

    public final float IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final clearAuxEffectInfo getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void AudioAttributesCompatParcelizer(removeEventListener p0) {
        getMediaItem mediaDescriptionCompat = p0.getMediaDescriptionCompat();
        this.AudioAttributesCompatParcelizer = mediaDescriptionCompat != null ? mediaDescriptionCompat.getRead() : null;
        if (this.IconCompatParcelizer || !p0.RatingCompat().isEmpty()) {
            this.IconCompatParcelizer = true;
            getMediaItem mediaDescriptionCompat2 = p0.getMediaDescriptionCompat();
            read(mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getWrite() : 0, p0.getMediaBrowserCompatSearchResultReceiver());
        }
    }

    public final void write(int p0, float p1) {
        read(p0, p1);
        this.AudioAttributesCompatParcelizer = null;
    }

    public final int RemoteActionCompatParcelizer(disable p0, int p1) {
        int iWrite = DrmInitData.write(p0, this.AudioAttributesCompatParcelizer, p1);
        if (p1 != iWrite) {
            RemoteActionCompatParcelizer(iWrite);
            this.MediaBrowserCompatItemReceiver.read(p1);
        }
        return iWrite;
    }

    private final void read(int p0, float p1) {
        RemoteActionCompatParcelizer(p0);
        this.MediaBrowserCompatItemReceiver.read(p0);
        read(p1);
    }

    public final void AudioAttributesCompatParcelizer(float p0) {
        read(p0);
    }

    public final void IconCompatParcelizer(int p0) {
        read(IconCompatParcelizer() + (this.read.onPause() == 0 ? BitmapDescriptorFactory.HUE_RED : p0 / this.read.onPause()));
    }
}

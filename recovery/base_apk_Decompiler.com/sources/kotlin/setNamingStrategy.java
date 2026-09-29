package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lo/setNamingStrategy;", "", "<init>", "()V", "p0", "", "read", "(Lo/setNamingStrategy;)V", "Lo/validateAppend;", "AudioAttributesCompatParcelizer", "(Lo/validateAppend;)V", "", "IconCompatParcelizer", "(Lo/setNamingStrategy;)Z", "", "F", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Lo/findCreatorAnnotation;", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setNamingStrategy {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer = 1.0f;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private float write = 1.0f;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float MediaBrowserCompatCustomActionResultReceiver = 8.0f;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi21Parcelizer = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();

    public final void read(setNamingStrategy p0) {
        this.RemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer;
        this.write = p0.write;
        this.IconCompatParcelizer = p0.IconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer;
        this.read = p0.read;
        this.MediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver;
        this.AudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = p0.MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = p0.AudioAttributesImplApi21Parcelizer;
    }

    public final void AudioAttributesCompatParcelizer(validateAppend p0) {
        this.RemoteActionCompatParcelizer = p0.AudioAttributesImplApi21Parcelizer();
        this.write = p0.AudioAttributesImplApi26Parcelizer();
        this.IconCompatParcelizer = p0.MediaBrowserCompatMediaItem();
        this.AudioAttributesCompatParcelizer = p0.MediaBrowserCompatSearchResultReceiver();
        this.read = p0.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = p0.read();
        this.AudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = p0.write();
        this.AudioAttributesImplApi21Parcelizer = p0.MediaBrowserCompatItemReceiver();
    }

    public final boolean IconCompatParcelizer(setNamingStrategy p0) {
        return this.RemoteActionCompatParcelizer == p0.RemoteActionCompatParcelizer && this.write == p0.write && this.IconCompatParcelizer == p0.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == p0.AudioAttributesCompatParcelizer && this.read == p0.read && this.MediaBrowserCompatItemReceiver == p0.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == p0.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == p0.MediaBrowserCompatCustomActionResultReceiver && findCreatorAnnotation.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, p0.AudioAttributesImplApi21Parcelizer);
    }
}

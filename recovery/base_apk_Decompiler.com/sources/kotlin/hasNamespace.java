package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011"}, d2 = {"Lo/hasNamespace;", "Lo/_checkRangeBoundsForCharArray;", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "", "p1", "", "RemoteActionCompatParcelizer", "(ILo/_assertNotNull;)V", "AudioAttributesCompatParcelizer", "(II)V", "p2", "write", "(III)V", "read", "()V", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasNamespace extends _checkRangeBoundsForCharArray<_assertNotNull> {
    public static final int IconCompatParcelizer = _checkRangeBoundsForCharArray.read;

    @Override // kotlin._closeInput
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void write(int p0, _assertNotNull p1) {
    }

    public hasNamespace(_assertNotNull _assertnotnull) {
        super(_assertnotnull);
    }

    @Override // kotlin._closeInput
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(int p0, _assertNotNull p1) {
        write().AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesCompatParcelizer(int p0, int p1) {
        write().IconCompatParcelizer(p0, p1);
    }

    @Override // kotlin._closeInput
    public final void write(int p0, int p1, int p2) {
        write().AudioAttributesCompatParcelizer(p0, p1, p2);
    }

    @Override // kotlin._checkRangeBoundsForCharArray
    public final void read() {
        RemoteActionCompatParcelizer().getLastCustomNonConfigurationInstance();
    }

    @Override // kotlin._closeInput
    public final void MediaBrowserCompatItemReceiver() {
        super.MediaBrowserCompatItemReceiver();
        _configureGenerator onMediaButtonEvent = RemoteActionCompatParcelizer().getOnMediaButtonEvent();
        if (onMediaButtonEvent != null) {
            onMediaButtonEvent.onSeekTo();
        }
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesImplApi26Parcelizer() {
        write().read();
    }
}

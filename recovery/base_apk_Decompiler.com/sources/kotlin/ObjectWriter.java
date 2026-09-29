package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R \u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012"}, d2 = {"Lo/ObjectWriter;", "", "<init>", "()V", "", "read", "()Z", "Lo/_assertNotNull;", "p0", "", "(Lo/_assertNotNull;)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "", "[Lo/_assertNotNull;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObjectWriter {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private _assertNotNull[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<_assertNotNull> AudioAttributesCompatParcelizer = new UTF32Reader<>(new _assertNotNull[16], 0);
    public static final int IconCompatParcelizer = 8;

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() != 0;
    }

    public final void read(_assertNotNull p0) {
        if (p0.getAddOnMultiWindowModeChangedListener() > 0) {
            this.AudioAttributesCompatParcelizer.read(p0);
            p0.AudioAttributesImplBaseParcelizer(true);
        }
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
    }

    public final void IconCompatParcelizer(_assertNotNull p0) {
        if (p0.getAddOnMultiWindowModeChangedListener() > 0) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            this.AudioAttributesCompatParcelizer.read(p0);
            p0.AudioAttributesImplBaseParcelizer(true);
        }
    }

    public final void write() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Companion.IconCompatParcelizer.read);
        int audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        _assertNotNull[] _assertnotnullArr = this.RemoteActionCompatParcelizer;
        if (_assertnotnullArr == null || _assertnotnullArr.length < audioAttributesCompatParcelizer) {
            _assertnotnullArr = new _assertNotNull[Math.max(16, this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())];
        }
        this.RemoteActionCompatParcelizer = null;
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertnotnullArr[i] = this.AudioAttributesCompatParcelizer.IconCompatParcelizer[i];
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        for (int i2 = audioAttributesCompatParcelizer - 1; i2 >= 0; i2--) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i2];
            toMagicModuleMetaRepoModel.write(_assertnotnull);
            if (_assertnotnull.getAddOnPictureInPictureModeChangedListener()) {
                AudioAttributesCompatParcelizer(_assertnotnull);
            }
            _assertnotnullArr[i2] = null;
        }
        this.RemoteActionCompatParcelizer = _assertnotnullArr;
    }

    private final void AudioAttributesCompatParcelizer(_assertNotNull p0) {
        if (p0.getAddOnMultiWindowModeChangedListener() > 0) {
            p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            p0.AudioAttributesImplBaseParcelizer(false);
            UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = p0.addObserverForBackInvoker();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                AudioAttributesCompatParcelizer(_assertnotnullArr[i]);
            }
        }
    }
}

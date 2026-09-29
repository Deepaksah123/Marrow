package kotlin;

import kotlin.AudioAttributesCompat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0016R\u00020\u00000\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/AudioAttributesCompat;", "", "Lo/subtractTimesI;", "p0", "Lkotlin/Function0;", "Lo/AudioAttributesImplApi21;", "p1", "<init>", "(Lo/subtractTimesI;Lo/getCreatedOnDateMs;)V", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "p2", "", "RemoteActionCompatParcelizer", "(ILjava/lang/Object;Ljava/lang/Object;)Lo/MagicModuleSubmissionRequestBody;", "Lo/subtractTimesI;", "AudioAttributesCompatParcelizer", "write", "Lo/getCreatedOnDateMs;", "()Lo/getCreatedOnDateMs;", "Lo/setKeyListener;", "Lo/AudioAttributesCompat$IconCompatParcelizer;", "read", "Lo/setKeyListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioAttributesCompat {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final subtractTimesI AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setKeyListener<Object, IconCompatParcelizer> write = setAutoSizeTextTypeUniformWithPresetSizes.read();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<AudioAttributesImplApi21> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioAttributesCompat(subtractTimesI subtracttimesi, getCreatedOnDateMs<? extends AudioAttributesImplApi21> getcreatedondatems) {
        this.AudioAttributesCompatParcelizer = subtracttimesi;
        this.IconCompatParcelizer = getcreatedondatems;
    }

    public final getCreatedOnDateMs<AudioAttributesImplApi21> write() {
        return this.IconCompatParcelizer;
    }

    public final Object IconCompatParcelizer(Object p0) {
        if (p0 == null) {
            return null;
        }
        IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer(p0);
        if (iconCompatParcelizerAudioAttributesImplApi26Parcelizer != null) {
            return iconCompatParcelizerAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer();
        }
        AudioAttributesImplApi21 audioAttributesImplApi21Invoke = this.IconCompatParcelizer.invoke();
        int iWrite = audioAttributesImplApi21Invoke.write(p0);
        if (iWrite != -1) {
            return audioAttributesImplApi21Invoke.RemoteActionCompatParcelizer(iWrite);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lo/AudioAttributesCompat$IconCompatParcelizer;", "", "", "p0", "p1", "p2", "<init>", "(Lo/AudioAttributesCompat;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "write", "()Lo/MagicModuleSubmissionRequestBody;", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "read", "I", "()I", "Lo/MagicModuleSubmissionRequestBody;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> write;
        private final Object IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final Object AudioAttributesCompatParcelizer;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class read implements _wrapError {
            public read() {
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                IconCompatParcelizer.this.write = null;
            }
        }

        public IconCompatParcelizer(int i, Object obj, Object obj2) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer = obj2;
            this.RemoteActionCompatParcelizer = i;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final Object getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer() {
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = this.write;
            if (magicModuleSubmissionRequestBody != null) {
                return magicModuleSubmissionRequestBody;
            }
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBodyWrite = write();
            this.write = magicModuleSubmissionRequestBodyWrite;
            return magicModuleSubmissionRequestBodyWrite;
        }

        private final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write() {
            final AudioAttributesCompat audioAttributesCompat = AudioAttributesCompat.this;
            return multiplyFft.IconCompatParcelizer(818252804, true, new MagicModuleSubmissionRequestBody() { // from class: o.takeContentChanged
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return AudioAttributesCompat.IconCompatParcelizer.IconCompatParcelizer(audioAttributesCompat, this, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup IconCompatParcelizer(AudioAttributesCompat audioAttributesCompat, final IconCompatParcelizer iconCompatParcelizer, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(818252804, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                AudioAttributesImplApi21 audioAttributesImplApi21Invoke = audioAttributesCompat.write().invoke();
                int iWrite = iconCompatParcelizer.RemoteActionCompatParcelizer;
                if ((iWrite >= audioAttributesImplApi21Invoke.read() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesImplApi21Invoke.IconCompatParcelizer(iWrite), iconCompatParcelizer.AudioAttributesCompatParcelizer)) && (iWrite = audioAttributesImplApi21Invoke.write(iconCompatParcelizer.AudioAttributesCompatParcelizer)) != -1) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer = iWrite;
                }
                int i2 = iWrite;
                if (i2 != -1) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1664741271);
                    getInstance.read(audioAttributesImplApi21Invoke, setSeekParameters.read(audioAttributesCompat.AudioAttributesCompatParcelizer), i2, setSeekParameters.read(iconCompatParcelizer.AudioAttributesCompatParcelizer), _handleunrecognizedcharacterescape, 0);
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1668376610);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                Object obj = iconCompatParcelizer.AudioAttributesCompatParcelizer;
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(iconCompatParcelizer);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getAnswerMap() { // from class: o.unregisterOnLoadCanceledListener
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return AudioAttributesCompat.IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer, (StreamConstraintsException) obj2);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                StreamReadException.RemoteActionCompatParcelizer(obj, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 0);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final _wrapError read(IconCompatParcelizer iconCompatParcelizer, StreamConstraintsException streamConstraintsException) {
            return iconCompatParcelizer.new read();
        }
    }

    public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer(int p0, Object p1, Object p2) {
        IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer(p1);
        if (iconCompatParcelizerAudioAttributesImplApi26Parcelizer != null && iconCompatParcelizerAudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer() == p0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizerAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer(), p2)) {
            return iconCompatParcelizerAudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(p0, p1, p2);
        this.write.RemoteActionCompatParcelizer(p1, iconCompatParcelizer);
        return iconCompatParcelizer.IconCompatParcelizer();
    }
}

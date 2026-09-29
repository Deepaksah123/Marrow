package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "p0", "", "p1", "Lo/getAudioComponent;", "p2", "Lkotlin/Function0;", "", "p3", "write", "(Ljava/lang/Object;ILo/getAudioComponent;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createMessage {
    public static final void write(final Object obj, final int i, final getAudioComponent getaudiocomponent, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(872548579);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getaudiocomponent) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 1171) != 1170, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(872548579, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(obj);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getaudiocomponent);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new clearVideoFrameMetadataListener(obj, getaudiocomponent);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final clearVideoFrameMetadataListener clearvideoframemetadatalistener = (clearVideoFrameMetadataListener) objOnPause;
            clearvideoframemetadatalistener.IconCompatParcelizer(i);
            clearvideoframemetadatalistener.IconCompatParcelizer((replaceDelegatee) _handleunrecognizedcharacterescapeWrite.write(_buildMessage.AudioAttributesCompatParcelizer()));
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(clearvideoframemetadatalistener);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.getAnalyticsCollector
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return createMessage.read(clearvideoframemetadatalistener, (StreamConstraintsException) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            StreamReadException.RemoteActionCompatParcelizer(clearvideoframemetadatalistener, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 0);
            resetAsNaN.write(_buildMessage.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(clearvideoframemetadatalistener), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, ((i3 >> 6) & 112) | ContentReference.write);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getAudioDecoderCounters
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return createMessage.AudioAttributesCompatParcelizer(obj, i, getaudiocomponent, magicModuleSubmissionRequestBody, i2, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements _wrapError {
        final /* synthetic */ clearVideoFrameMetadataListener RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(clearVideoFrameMetadataListener clearvideoframemetadatalistener) {
            this.RemoteActionCompatParcelizer = clearvideoframemetadatalistener;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(clearVideoFrameMetadataListener clearvideoframemetadatalistener, StreamConstraintsException streamConstraintsException) {
        return new RemoteActionCompatParcelizer(clearvideoframemetadatalistener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Object obj, int i, getAudioComponent getaudiocomponent, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(obj, i, getaudiocomponent, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}

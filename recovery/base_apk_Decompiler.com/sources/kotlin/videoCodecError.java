package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class videoCodecError {

    public static final class AudioAttributesCompatParcelizer implements _wrapError {
        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
        }
    }

    public static final void AudioAttributesCompatParcelizer(final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1750164651);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 3) != 2, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                j = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1750164651, i3, -1, "com.marrow2.ui.common.composeUtilis.FullScreenComposer (FullScreenController.kt:10)");
            }
            final DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2 drmSessionEventListenerEventDispatcherExternalSyntheticLambda2RemoteActionCompatParcelizer = DrmSessionEventListenerEventDispatcherExternalSyntheticLambda3.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(drmSessionEventListenerEventDispatcherExternalSyntheticLambda2RemoteActionCompatParcelizer);
            boolean z = (i3 & 14) == 4;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.videoSizeChanged
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return videoCodecError.read(drmSessionEventListenerEventDispatcherExternalSyntheticLambda2RemoteActionCompatParcelizer, j, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.RemoteActionCompatParcelizer(drmSessionEventListenerEventDispatcherExternalSyntheticLambda2RemoteActionCompatParcelizer, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.VideoRendererEventListenerEventDispatcherExternalSyntheticLambda1
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return videoCodecError.write(j, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError read(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2 drmSessionEventListenerEventDispatcherExternalSyntheticLambda2, long j, StreamConstraintsException streamConstraintsException) {
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2.read(drmSessionEventListenerEventDispatcherExternalSyntheticLambda2, j, false, null, 6);
        drmSessionEventListenerEventDispatcherExternalSyntheticLambda2.read();
        drmSessionEventListenerEventDispatcherExternalSyntheticLambda2.IconCompatParcelizer();
        return new AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(long j, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(j, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}

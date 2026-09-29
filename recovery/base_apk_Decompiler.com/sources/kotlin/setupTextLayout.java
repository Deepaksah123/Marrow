package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes3.dex */
public final class setupTextLayout {
    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        final _handleOddName _handleoddname3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1611452756);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i2 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i4 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i2;
        } else {
            _handleoddname2 = _handleoddname;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        int i6 = i4;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 19) != 18, i6 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleoddname3 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1611452756, i6, -1, "com.marrow2.core.common_composables.PieChart (PieChart.kt:9)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            final long onPlayFromMediaId = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPlayFromMediaId();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            boolean z = (i6 & 112) == 32;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(onPlayFromMediaId);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | z | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                getAnswerMap getanswermap = new getAnswerMap() { // from class: o.getUserCaptionStyle
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setupTextLayout.AudioAttributesCompatParcelizer(i, onPlayFromMediaId, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, (findSetterInfo) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(getanswermap);
                objOnPause = getanswermap;
            }
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(_handleoddname3, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescapeWrite, i6 & 14);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getCuesWithStylingPreferencesApplied
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setupTextLayout.RemoteActionCompatParcelizer(_handleoddname3, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, long j, long j2, findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        float f = (i * 360) / 100.0f;
        findSetterInfo.write$default(findsetterinfo, j, -90.0f, f, true, 0L, 0L, BitmapDescriptorFactory.HUE_RED, (findViews) null, (switchAndReturnNext) null, 0, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, (Object) null);
        findSetterInfo.write$default(findsetterinfo, j2, f - 90.0f, ((100 - i) * 360) / 100.0f, true, 0L, 0L, BitmapDescriptorFactory.HUE_RED, (findViews) null, (switchAndReturnNext) null, 0, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, (Object) null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, i, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}

package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class setEventNumber {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(kotlin._handleOddName r33, int r34, int r35, kotlin._handleUnrecognizedCharacterEscape r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEventNumber.write(o._handleOddName, int, int, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    public static final void read(int i, int i2, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3, final int i4) {
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(964890147);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 147) != 146, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i6 != 0) {
                i = R.string.text_empty_gta_head;
            }
            if (i7 != 0) {
                i2 = R.string.text_empty_gta_body;
            }
            if (i8 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(964890147, i5, -1, "com.marrow2.ui.test.gtanalytics.composable.GtaSectionEmptyState (GtaEmptyState.kt:72)");
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isAdded.AudioAttributesCompatParcelizer(getParentFragment.write$default(isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 2, null), assignParameter.IconCompatParcelizer(351.0f));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            write(CmcdHeadersFactoryObjectType.read(_handleoddnameAudioAttributesCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(1.0f), assignParameter.IconCompatParcelizer(4.0f), assignParameter.IconCompatParcelizer(4.0f)), i, i2, _handleunrecognizedcharacterescapeWrite, (i5 << 3) & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, 0);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(80.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final int i9 = i;
        final int i10 = i2;
        final _handleOddName _handleoddname2 = _handleoddname;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setInfoModuleDataHexBackgroundColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setEventNumber.AudioAttributesCompatParcelizer(i9, i10, _handleoddname2, i3, i4, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, int i, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, i, i2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, int i2, _handleOddName _handleoddname, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(i, i2, _handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }
}

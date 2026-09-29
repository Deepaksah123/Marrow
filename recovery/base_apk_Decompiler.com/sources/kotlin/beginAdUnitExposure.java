package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class beginAdUnitExposure {
    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final String str, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(2088421192);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2088421192, i3, -1, "com.marrow2.ui.review_components.ui.description.child.MagicTextLayout (MagicTextLayout.kt:15)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            final long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddname3, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getMediaBrowserCompatMediaItem(), null, 2, null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(onPrepareFromUri);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zzbU
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return beginAdUnitExposure.read(onPrepareFromUri, (_reportInvalidChar) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = getParentFragment.AudioAttributesCompatParcelizer(WriterBasedJsonGenerator.RemoteActionCompatParcelizer(_handleoddnameIconCompatParcelizer$default, (getAnswerMap) objOnPause), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(12.0f), assignParameter.IconCompatParcelizer(12.0f), assignParameter.IconCompatParcelizer(12.0f));
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            Nulls.AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getMediaBrowserCompatMediaItem(), 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(1294018956, true, new MagicModuleSubmissionRequestBody() { // from class: o.endAdUnitExposure
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return beginAdUnitExposure.RemoteActionCompatParcelizer(str, getcreatedondatems, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 1572864, 58);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.clearMeasurementEnabled
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return beginAdUnitExposure.write(_handleoddname4, str, getcreatedondatems, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseMediumName read(final long j, _reportInvalidChar _reportinvalidchar) {
        toMagicModuleMetaRepoModel.write(_reportinvalidchar, "");
        return _reportinvalidchar.write(new getAnswerMap() { // from class: o.getAppInstanceId
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return beginAdUnitExposure.RemoteActionCompatParcelizer(j, (findSetterInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, final getCreatedOnDateMs getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1294018956, i, -1, "com.marrow2.ui.review_components.ui.description.child.MagicTextLayout.<anonymous> (MagicTextLayout.kt:35)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.generateEventId
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return beginAdUnitExposure.write(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            VideoSizeExternalSyntheticLambda0.RemoteActionCompatParcelizer(str, _handleoddnameRemoteActionCompatParcelizer$default, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 48, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(long j, findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        long j2 = -1;
        findSetterInfo.read$default(findsetterinfo, j, 0L, calloc.write((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(findsetterinfo.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)))) << 32)), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, String str, getCreatedOnDateMs getcreatedondatems, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, str, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}

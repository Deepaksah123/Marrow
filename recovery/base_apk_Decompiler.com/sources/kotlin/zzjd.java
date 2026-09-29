package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.Map;
import kotlin.AbstractDeserializer;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjd {
    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final int i, final createNotificationChannel createnotificationchannel, final boolean z, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(createnotificationchannel, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-653805631);
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
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(createnotificationchannel) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i4) != 74898, i4 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-653805631, i4, -1, "com.marrow2.ui.review_components.ui.misc.ReviewListItem (ReviewListItem.kt:46)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            final long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            _handleOddName _handleoddnameIconCompatParcelizer$default = _writeSegment.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleoddname4, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(1.0f), null, false, 0L, 0L, 30, null);
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            boolean z2 = (57344 & i4) == 16384;
            boolean z3 = (i4 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | z3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.zzjg
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return zzjd.AudioAttributesCompatParcelizer(getanswermap, i);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddname5 = _handleoddname4;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            setOnAnimationStop.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause, _handleoddnameIconCompatParcelizer$default, false, null, 0L, 0L, null, fIconCompatParcelizer, null, multiplyFft.AudioAttributesCompatParcelizer(-991791205, true, new MagicModuleSubmissionRequestBody() { // from class: o.zzje
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzjd.write(z, onPrepareFromUri, i, createnotificationchannel, magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescape2, 817889280, 380);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname5;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzji
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzjd.RemoteActionCompatParcelizer(_handleoddname3, i, createnotificationchannel, z, getanswermap, magicModuleSubmissionRequestBody, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final boolean z, final long j, int i, createNotificationChannel createnotificationchannel, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-991791205, i2, -1, "com.marrow2.ui.review_components.ui.misc.ReviewListItem.<anonymous> (ReviewListItem.kt:57)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(j);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zziz
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return zzjd.RemoteActionCompatParcelizer(z, j, (_reportInvalidChar) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = WriterBasedJsonGenerator.RemoteActionCompatParcelizer(companion, (getAnswerMap) objOnPause);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            WindowInsetsCompatImpl30.RatingCompat ratingCompatMediaBrowserCompatCustomActionResultReceiver = WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f));
            withTypeHandler withtypehandler = setValue.read(ratingCompatMediaBrowserCompatCustomActionResultReceiver, _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 6);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerIconCompatParcelizer2 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, 0);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getView.INSTANCE, _handleOddName.INSTANCE, 1.0f, false, 2, null);
            String mediaBrowserCompatCustomActionResultReceiver = createnotificationchannel.getMediaBrowserCompatCustomActionResultReceiver();
            StringBuilder sb = new StringBuilder();
            sb.append(i + 1);
            sb.append(". ");
            sb.append(mediaBrowserCompatCustomActionResultReceiver);
            _copyCurrentStringValue.IconCompatParcelizer(sb.toString(), _handleoddnameRemoteActionCompatParcelizer$default2, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65528);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            zzij.RemoteActionCompatParcelizer((_handleOddName) null, createnotificationchannel.getRead(), createnotificationchannel.getIconCompatParcelizer(), false, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 3072, 1);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            _findCustomMapDeserializer _findcustommapdeserializer = new _findCustomMapDeserializer(setResolver.RemoteActionCompatParcelizer(14), setResolver.RemoteActionCompatParcelizer(14), _handleSingleArgumentCreator.INSTANCE.AudioAttributesCompatParcelizer(), null);
            zziu zziuVar = zziu.RemoteActionCompatParcelizer;
            Map map = VideoTimelineResponseBody.read(setAction.write("schemaIcon", new setControllerHideDuringAds(_findcustommapdeserializer, zziu.IconCompatParcelizer())));
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
            iconCompatParcelizer.RemoteActionCompatParcelizer(createnotificationchannel.getAudioAttributesImplBaseParcelizer());
            iconCompatParcelizer.RemoteActionCompatParcelizer("  ");
            if (!createnotificationchannel.IconCompatParcelizer().isEmpty()) {
                setControllerAnimationEnabled.read$default(iconCompatParcelizer, "schemaIcon", null, 2, null);
                iconCompatParcelizer.RemoteActionCompatParcelizer("  ");
                iconCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(createnotificationchannel.IconCompatParcelizer(), ", ", null, null, 0, null, null, 62));
            }
            AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
            deserializeWithObjectId audioAttributesImplBaseParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.read(abstractDeserializerRemoteActionCompatParcelizer, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map, null, audioAttributesImplBaseParcelizer, _handleunrecognizedcharacterescape, 0, 0, 98298);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseMediumName RemoteActionCompatParcelizer(final boolean z, final long j, _reportInvalidChar _reportinvalidchar) {
        toMagicModuleMetaRepoModel.write(_reportinvalidchar, "");
        return _reportinvalidchar.write(new getAnswerMap() { // from class: o.zzja
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return zzjd.AudioAttributesCompatParcelizer(z, j, (findSetterInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(boolean z, long j, findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        if (z) {
            long j2 = -1;
            findSetterInfo.read$default(findsetterinfo, j, 0L, calloc.write((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(findsetterinfo.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)))) << 32)), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, int i, createNotificationChannel createnotificationchannel, boolean z, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, i, createnotificationchannel, z, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}

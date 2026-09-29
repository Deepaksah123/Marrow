package kotlin;

import android.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqf {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final zzqa zzqaVar, final boolean z, final zzpx zzpxVar, final boolean z2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super SystemHandlerWrapper1, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getAnswerMap<? super zzpy, getShowPopup> getanswermap2, final getAnswerMap<? super String, getShowPopup> getanswermap3, final getAnswerMap<? super String, getShowPopup> getanswermap4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems5, final getCreatedOnDateMs<getShowPopup> getcreatedondatems6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleOddName _handleoddname2;
        toMagicModuleMetaRepoModel.write(zzqaVar, "");
        toMagicModuleMetaRepoModel.write(zzpxVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(getanswermap4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems5, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems6, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1320243033);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzqaVar) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(zzpxVar) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 67108864 : 33554432;
        }
        if ((i & C.ENCODING_PCM_32BIT) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap4) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems5) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems6) ? 16384 : 8192;
        }
        int i8 = i5;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true, i7 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
        } else {
            _handleOddName.Companion companion = i6 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1320243033, i7, i8, "com.marrow2.ui.schema.listing.ui.SchemaListMainLayout (SchemaListMainLayout.kt:47)");
            }
            boolean z3 = (zzpxVar.getRead() == null || zzpxVar.getWrite() == null) ? false : true;
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddname3 = onInflate.read(getFrameEndSchedulerui.IconCompatParcelizer$default(onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null)), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname3);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            int i9 = i7 >> 6;
            boolean z4 = z3;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            zzqh.IconCompatParcelizer((_handleOddName) null, zzpxVar.getAudioAttributesImplApi26Parcelizer(), z4, zzqaVar.getWrite(), !zzqaVar.IconCompatParcelizer().isEmpty(), getcreatedondatems2, getcreatedondatems5, _handleunrecognizedcharacterescape2, (i9 & 458752) | ((i8 << 9) & 3670016), 1);
            _handleOddName.Companion companion2 = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, companion2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescape2.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape2);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            if (z) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1016027573);
                areCharSequencesEqual.AudioAttributesCompatParcelizer(null, null, null, _handleunrecognizedcharacterescape2, 0, 7);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1015911757);
                _handleOddName _handleoddnameIconCompatParcelizer$default3 = getFrameEndSchedulerui.IconCompatParcelizer$default(companion, enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).read(), null, 2, null);
                withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape2, 0);
                int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameIconCompatParcelizer$default3);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer4);
                } else {
                    _handleunrecognizedcharacterescape2.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescape2);
                NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
                zzqw.AudioAttributesCompatParcelizer(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, null, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), zzqaVar.getRemoteActionCompatParcelizer(), zzqaVar.getIconCompatParcelizer(), getcreatedondatems3, getanswermap2, _handleunrecognizedcharacterescape2, (i7 >> 15) & 64512, 0);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                JsonGeneratorFeature.AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer, assignParameter.IconCompatParcelizer(1.0f), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), _handleunrecognizedcharacterescape2, 48, 0);
                zzrm.RemoteActionCompatParcelizer(isAdded.IconCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), zzqaVar.IconCompatParcelizer(), zzqaVar.getIconCompatParcelizer() == zzpy.IconCompatParcelizer, zzqaVar.AudioAttributesCompatParcelizer(), zzqaVar.getIconCompatParcelizer(), z2, getcreatedondatems, getanswermap, _handleunrecognizedcharacterescape2, (i7 << 3) & R.attr.shouldUseDefaultUnfoldTransition, 0);
                _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (zzqaVar.getRemoteActionCompatParcelizer() || zzqaVar.getWrite()) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1014250498);
                isInLayout.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_parseFloatThatStartsWithPeriod.IconCompatParcelizer(_handleOddName.INSTANCE, 4.0f), BitmapDescriptorFactory.HUE_RED, 1, null), switchToNext.AudioAttributesCompatParcelizer$default(switchToNext.INSTANCE.AudioAttributesCompatParcelizer(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null), _handleunrecognizedcharacterescape2, 6);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1019026389);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            if (!zzpxVar.getAudioAttributesImplApi26Parcelizer()) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1019026389);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1013861634);
                int i10 = i8 << 6;
                zzqt.AudioAttributesCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), zzpxVar, getanswermap3, getanswermap4, getcreatedondatems4, getcreatedondatems5, getcreatedondatems6, _handleunrecognizedcharacterescape2, 6 | (i9 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752) | (i10 & 3670016), 0);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = companion;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzqe
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzqf.AudioAttributesCompatParcelizer(_handleoddname4, zzqaVar, z, zzpxVar, z2, getcreatedondatems, getanswermap, getcreatedondatems2, getcreatedondatems3, getanswermap2, getanswermap3, getanswermap4, getcreatedondatems4, getcreatedondatems5, getcreatedondatems6, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, zzqa zzqaVar, boolean z, zzpx zzpxVar, boolean z2, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getAnswerMap getanswermap2, getAnswerMap getanswermap3, getAnswerMap getanswermap4, getCreatedOnDateMs getcreatedondatems4, getCreatedOnDateMs getcreatedondatems5, getCreatedOnDateMs getcreatedondatems6, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, zzqaVar, z, zzpxVar, z2, getcreatedondatems, getanswermap, getcreatedondatems2, getcreatedondatems3, getanswermap2, getanswermap3, getanswermap4, getcreatedondatems4, getcreatedondatems5, getcreatedondatems6, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}

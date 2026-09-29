package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class putHeader {
    public static final void read(_handleOddName _handleoddname, final boolean z, final boolean z2, final boolean z3, final boolean z4, final getAnswerMap<? super Boolean, getShowPopup> getanswermap, final getAnswerMap<? super Boolean, getShowPopup> getanswermap2, final getAnswerMap<? super Boolean, getShowPopup> getanswermap3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname2;
        _handleOddName _handleoddname3;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        boolean z5;
        boolean z6;
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-358343573);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 67108864 : 33554432;
        }
        if ((i & C.ENCODING_PCM_32BIT) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((306783379 & i6) != 306783378, i6 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
        } else {
            _handleOddName _handleoddname4 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-358343573, i6, -1, "com.marrow2.ui.dialogs.feedbackReport.CheckBoxStageLayout (CheckBoxStageLayout.kt:41)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-979636266);
                _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescapeWrite, 48);
                int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview = getView.INSTANCE;
                getLastSignedInAccount getlastsignedinaccount = getLastSignedInAccount.write;
                z5 = false;
                _handleoddname3 = _handleoddname4;
                i4 = i6;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                JacksonInjectValue.IconCompatParcelizer(getcreatedondatems, null, false, null, getLastSignedInAccount.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, ((i6 >> 24) & 14) | CpioConstants.C_ISBLK, 14);
                _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.feedback_dialog_title, _handleunrecognizedcharacterescape3, 6), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape3, 0, 0, 65530);
                _handleunrecognizedcharacterescape3.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape3.MediaBrowserCompatCustomActionResultReceiver();
                z6 = true;
            } else {
                _handleoddname3 = _handleoddname4;
                i4 = i6;
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                z5 = false;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(-978981484);
                z6 = true;
                _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.feedback_dialog_title, _handleunrecognizedcharacterescape3, 6), isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape3, 48, 0, 65016);
                _handleunrecognizedcharacterescape3.MediaBrowserCompatCustomActionResultReceiver();
            }
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), _handleunrecognizedcharacterescape3, 6);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.reporting_what_text, _handleunrecognizedcharacterescape3, 6), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape3, 0, 0, 65530);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = _handleunrecognizedcharacterescape3;
            boolean z7 = z5;
            splitRtspMessageBody.IconCompatParcelizer((_handleOddName) null, z2, singleArgCreatorDefaultsToProperties.read(R.string.factual_error, _handleunrecognizedcharacterescape3, 6), onSetPlaybackSpeed, setResolver.RemoteActionCompatParcelizer(16), enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), false, getanswermap, _handleunrecognizedcharacterescape6, ((i4 >> 3) & 112) | CpioConstants.C_ISBLK | ((i4 << 12) & 1879048192), 257);
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed2 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape6;
            splitRtspMessageBody.IconCompatParcelizer((_handleOddName) null, z3, singleArgCreatorDefaultsToProperties.read(R.string.confusing_question, _handleunrecognizedcharacterescape6, 6), onSetPlaybackSpeed2, setResolver.RemoteActionCompatParcelizer(16), enabled.INSTANCE.write(_handleunrecognizedcharacterescape6, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, enabled.INSTANCE.write(_handleunrecognizedcharacterescape6, enabled.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), false, getanswermap2, _handleunrecognizedcharacterescape2, ((i4 >> 6) & 112) | CpioConstants.C_ISBLK | ((i4 << 9) & 1879048192), 257);
            MarrowTheme marrowTheme5 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed3 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme6 = MarrowTheme.INSTANCE;
            splitRtspMessageBody.IconCompatParcelizer((_handleOddName) null, z4, singleArgCreatorDefaultsToProperties.read(R.string.inadequate_exp, _handleunrecognizedcharacterescape2, 6), onSetPlaybackSpeed3, setResolver.RemoteActionCompatParcelizer(16), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), false, getanswermap3, _handleunrecognizedcharacterescape2, ((i4 >> 9) & 112) | CpioConstants.C_ISBLK | ((i4 << 6) & 1879048192), 257);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), _handleunrecognizedcharacterescape2, 6);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = drawerLayoutSavedState.AudioAttributesCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(200.0f), assignParameter.IconCompatParcelizer(40.0f)), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer());
            if (z2 || z3 || z4) {
                z7 = z6;
            }
            getLastSignedInAccount getlastsignedinaccount2 = getLastSignedInAccount.write;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems2, _handleoddnameAudioAttributesCompatParcelizer, z7, null, null, null, null, null, null, getLastSignedInAccount.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescape2, ((i4 >> 27) & 14) | C.ENCODING_PCM_32BIT, TarConstants.SPARSELEN_GNU_SPARSE);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), _handleunrecognizedcharacterescape2, 6);
            String str = singleArgCreatorDefaultsToProperties.read(R.string.text_feedback_report_error_disclaimer, _handleunrecognizedcharacterescape2, 6);
            MarrowTheme marrowTheme7 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.createErrorProxyResponse
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return putHeader.AudioAttributesCompatParcelizer(_handleoddname2, z, z2, z3, z4, getanswermap, getanswermap2, getanswermap3, getcreatedondatems, getcreatedondatems2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, boolean z, boolean z2, boolean z3, boolean z4, getAnswerMap getanswermap, getAnswerMap getanswermap2, getAnswerMap getanswermap3, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, z, z2, z3, z4, getanswermap, getanswermap2, getanswermap3, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}

package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes3.dex */
public final class createServiceInterface {
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(28.0f);
    private static final float read = assignParameter.IconCompatParcelizer(12.0f);

    public static final void write(final HashAccumulator hashAccumulator, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final int i3;
        toMagicModuleMetaRepoModel.write(hashAccumulator, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-557015268);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(hashAccumulator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 256 : 128;
        }
        int i4 = i2;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i4 & 147) != 146, i4 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            i3 = i;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-557015268, i4, -1, "com.marrow2.ui.dialogs.new_edition.NewEditionPopupContent (NewEditionPopupContent.kt:55)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer((Configuration) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.read()));
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = Boolean.valueOf(CmcdConfigurationRequestConfig.AudioAttributesImplApi21Parcelizer(context));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            boolean zBooleanValue = ((Boolean) objOnPause).booleanValue();
            int i5 = zBooleanValue ? R.drawable.ic_edition_8_5_tablet : R.drawable.ic_edition_8_5_mobile;
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(250.0f);
            float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(164.0f);
            if (zBooleanValue) {
                fIconCompatParcelizer = assignParameter.IconCompatParcelizer(fIconCompatParcelizer * 1.5f);
            }
            if (zBooleanValue) {
                fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(fIconCompatParcelizer2 * 2.0f);
            }
            float f = fIconCompatParcelizer2;
            _handleOddName _handleoddnameIconCompatParcelizer = setVerticalAlign.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1), false, null, false, 14, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isAdded.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), fIconCompatParcelizer);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer);
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
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(i5, _handleunrecognizedcharacterescapeWrite, 0), null, isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer(), getContentType.INSTANCE.AudioAttributesCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 28080, 96);
            ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_clinical_edge_hero_logo, _handleunrecognizedcharacterescapeWrite, 6), null, isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, f), null, getContentType.INSTANCE.RemoteActionCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 24624, 104);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(getParentFragment.write$default(isAdded.write$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(500.0f), 1, null), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 2, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(32.0f), 7, null);
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(40.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            String str = singleArgCreatorDefaultsToProperties.read(hashAccumulator.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            deserializeWithObjectId remoteActionCompatParcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetShuffleMode(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, remoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0, 0, 65018);
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            float f2 = RemoteActionCompatParcelizer;
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(companion, f2), _handleunrecognizedcharacterescapeWrite, 6);
            read(hashAccumulator.AudioAttributesCompatParcelizer(), hashAccumulator.write(), hashAccumulator.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, f2), _handleunrecognizedcharacterescapeWrite, 6);
            i3 = i;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems, isAdded.AudioAttributesCompatParcelizer(isAdded.write(getParentFragment.write$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f), BitmapDescriptorFactory.HUE_RED, 2, null), assignParameter.IconCompatParcelizer(200.0f), assignParameter.IconCompatParcelizer(220.0f)), assignParameter.IconCompatParcelizer(40.0f)), false, null, null, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), null, null, null, multiplyFft.AudioAttributesCompatParcelizer(-471454728, true, new getModuleData() { // from class: o.setResult
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return createServiceInterface.RemoteActionCompatParcelizer(hashAccumulator, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 805306416 | ((i4 >> 3) & 14), 476);
            Integer numAudioAttributesImplBaseParcelizer = hashAccumulator.AudioAttributesImplBaseParcelizer();
            if (numAudioAttributesImplBaseParcelizer == null) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(163898257);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(163898258);
                int iIntValue = numAudioAttributesImplBaseParcelizer.intValue();
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, read), _handleunrecognizedcharacterescape2, 6);
                String str2 = singleArgCreatorDefaultsToProperties.read(iIntValue, _handleunrecognizedcharacterescape2, 0);
                deserializeWithObjectId deserializewithobjectidAudioAttributesImplApi26Parcelizer = TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str2, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape2, 0, 0, 65018);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
            Integer num = hashAccumulator.read();
            if (num == null) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(164325220);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(164325221);
                int iIntValue2 = num.intValue();
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), _handleunrecognizedcharacterescape2, 6);
                String str3 = singleArgCreatorDefaultsToProperties.read(iIntValue2, _handleunrecognizedcharacterescape2, 0);
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, false, null, null, null, getcreatedondatems2, 15, null);
                deserializeWithObjectId deserializewithobjectidRemoteActionCompatParcelizer = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str3, _handleoddnameRemoteActionCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidRemoteActionCompatParcelizer, _handleunrecognizedcharacterescape2, 0, 0, 65016);
                getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
            }
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zbw
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return createServiceInterface.read(hashAccumulator, getcreatedondatems, getcreatedondatems2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(HashAccumulator hashAccumulator, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-471454728, i, -1, "com.marrow2.ui.dialogs.new_edition.NewEditionPopupContent.<anonymous>.<anonymous>.<anonymous> (NewEditionPopupContent.kt:133)");
            }
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(hashAccumulator.IconCompatParcelizer(), _handleunrecognizedcharacterescape, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.IconCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-412181835);
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i != 0, i & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-412181835, i, -1, "com.marrow2.ui.dialogs.new_edition.NewEditionSwitchLoaderOverlay (NewEditionPopupContent.kt:168)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), 0.7f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = isConsumed.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            hashCode hashcode = (hashCode) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.createFailedResult
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return createServiceInterface.IconCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = getLocalSavedStateRegistryOwner.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, hashcode, null, false, null, null, (getCreatedOnDateMs) objOnPause2, 28, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default2);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            JsonIdentityReference.read(null, 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, _handleunrecognizedcharacterescapeWrite, 0, 31);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.onCreateLoader
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return createServiceInterface.AudioAttributesCompatParcelizer(i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    private static final void read(final int i, final int i2, final Integer num, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3) {
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-612020024);
        if ((i3 & 6) == 0) {
            i4 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(num) ? 256 : 128;
        }
        int i5 = i4;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 147) != 146, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-612020024, i5, -1, "com.marrow2.ui.dialogs.new_edition.NewEditionHighlights (NewEditionPopupContent.kt:187)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(read), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 6);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(i, _handleunrecognizedcharacterescapeWrite, i5 & 14), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescapeWrite, 0, 0, 65530);
            boolean z = true;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = _handleunrecognizedcharacterescapeWrite;
            int i6 = 6;
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape4, 6);
            int i7 = 0;
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape4.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape4.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape4.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape4.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape4.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape4.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape4);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            _handleunrecognizedcharacterescape4.IconCompatParcelizer(-1423399087);
            String[] strArrAudioAttributesCompatParcelizer = singleArgCreatorDefaultsToProperties.AudioAttributesCompatParcelizer(i2, _handleunrecognizedcharacterescape4, (i5 >> 3) & 14);
            int length = strArrAudioAttributesCompatParcelizer.length;
            int i8 = 0;
            int i9 = 0;
            while (i9 < length) {
                String str = strArrAudioAttributesCompatParcelizer[i9];
                int i10 = i8 + 1;
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape4, i7);
                int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, i7));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape4.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, companion);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescape4.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescape4.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescape4.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescape4.read(getcreatedondatemsIconCompatParcelizer3);
                } else {
                    _handleunrecognizedcharacterescape4.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescape4);
                NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview = getView.INSTANCE;
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape7 = _handleunrecognizedcharacterescape4;
                _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.new_edition_highlight_number, new Object[]{Integer.valueOf(i10)}, _handleunrecognizedcharacterescape4, i6), isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape4, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape4, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape7, 48, 0, 65528);
                _copyCurrentStringValue.IconCompatParcelizer(str, null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape7, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape7, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape7, 0, 0, 65530);
                _handleunrecognizedcharacterescape7.AudioAttributesImplBaseParcelizer();
                i9++;
                _handleunrecognizedcharacterescape4 = _handleunrecognizedcharacterescape7;
                i8 = i10;
                i6 = i6;
                length = length;
                z = z;
                i7 = 0;
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape8 = _handleunrecognizedcharacterescape4;
            _handleunrecognizedcharacterescape8.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape8.AudioAttributesImplBaseParcelizer();
            if (num == null) {
                _handleunrecognizedcharacterescape8.IconCompatParcelizer(1954422202);
                _handleunrecognizedcharacterescape8.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape8;
            } else {
                _handleunrecognizedcharacterescape8.IconCompatParcelizer(1954422203);
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape8;
                _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(num.intValue(), _handleunrecognizedcharacterescape8, 0), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape8, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape8, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 0, 0, 65530);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.providesSignIn
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return createServiceInterface.write(i, i2, num, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static {
        new HashAccumulator(R.string.new_edition_e8_title, R.array.new_edition_highlights_neetpg, Integer.valueOf(R.string.new_edition_e8_note), R.string.new_edition_cta_got_it, null, null, false);
        new HashAccumulator(R.string.new_edition_e6_5_title, R.array.new_edition_highlights_neetpg, null, R.string.new_edition_cta_switch, Integer.valueOf(R.string.new_edition_switch_back_note), Integer.valueOf(R.string.new_edition_stay_with_e6_5), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(int i, int i2, Integer num, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(i, i2, num, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(HashAccumulator hashAccumulator, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(hashAccumulator, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

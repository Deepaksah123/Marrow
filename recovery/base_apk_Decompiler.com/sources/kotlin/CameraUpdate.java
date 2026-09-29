package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import com.marrow2.ui.settings.kyc.disclaimer.Kyc1DisclaimerViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraUpdate {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final int i, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(757660241);
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
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 16384 : 8192;
        }
        int i6 = i4;
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 9363) != 9362, i6 & 1)) {
            _handleOddName _handleoddname4 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(757660241, i6, -1, "com.marrow2.ui.settings.kyc.disclaimer.Kyc1DisclaimerMainLayout (KycDisclaimerMainLayout.kt:47)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            _handleOddName _handleoddname5 = _handleoddname4;
            ExperimentalBandwidthMeterExternalSyntheticLambda0 experimentalBandwidthMeterExternalSyntheticLambda0 = (ExperimentalBandwidthMeterExternalSyntheticLambda0) isSetterVisible.AudioAttributesCompatParcelizer(((Kyc1DisclaimerViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(Kyc1DisclaimerViewModel.class), typeResolutionContextIconCompatParcelizer, null, typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral ? ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE, _handleunrecognizedcharacterescapeWrite, 0)).IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            Object[] objArr = new Object[0];
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.getDefaultSleepSegmentRequest
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CameraUpdate.RemoteActionCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final InputAccessor inputAccessor = (InputAccessor) addTimesI.read(objArr, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, 48);
            boolean z = (i6 & 112) == 32;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | zAudioAttributesCompatParcelizer) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.getRequestedDataType
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CameraUpdate.RemoteActionCompatParcelizer(i, inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            MediaSessionCompatToken.write(true, (getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescapeWrite, 6, 0);
            _handleOddName _handleoddname6 = getParentFragment.read(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleoddname5, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), onDestroy.write(onPrimaryNavigationFragmentChanged.write(onCreateView.INSTANCE, _handleunrecognizedcharacterescapeWrite, 6), _handleunrecognizedcharacterescapeWrite, 0));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname6);
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
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.IconCompatParcelizer$default(getParentFragment.write(setVerticalAlign.IconCompatParcelizer(_handleOddName.INSTANCE, setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1), false, null, false, 14, null), assignParameter.IconCompatParcelizer(28.0f), assignParameter.IconCompatParcelizer(20.0f)), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), 7, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 6);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer$default);
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
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor);
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer2 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.newLatLngBounds
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CameraUpdate.read(inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            getCreatedOnDateMs getcreatedondatems4 = (getCreatedOnDateMs) objOnPause3;
            boolean z2 = (i6 & 7168) == 2048;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z2 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.newLatLngZoom
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CameraUpdate.write(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            deactivate.read(null, 1, i, getcreatedondatems4, (getCreatedOnDateMs) objOnPause4, _handleunrecognizedcharacterescapeWrite, ((i6 << 3) & 896) | 48, 1);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescapeWrite, 6);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            ViewFactoryHolder.write(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.admin_panel_settings, _handleunrecognizedcharacterescapeWrite, 6), null, getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(22.0f)), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), null, BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 3504, 112);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.kyc_verification, _handleunrecognizedcharacterescapeWrite, 6), getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 48, 0, 65016);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.kyc_text_guidelines, _handleunrecognizedcharacterescapeWrite, 6), isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(22.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48, 0, 65016);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer4);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver());
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode5 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler5 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer5 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer5 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer5);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape7 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape7, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape7, _getchardescHandleMediaPlayPauseIfPendingOnHandler5, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, Integer.valueOf(iHashCode5), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape7, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape7, _handleoddnameRemoteActionCompatParcelizer5, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            String str = singleArgCreatorDefaultsToProperties.read(R.string.acceptable_doc, _handleunrecognizedcharacterescapeWrite, 6);
            deserializeWithObjectId audioAttributesImplApi21Parcelizer = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesImplApi21Parcelizer();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), 5, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, audioAttributesImplApi21Parcelizer, _handleunrecognizedcharacterescapeWrite, 48, 0, 65528);
            List<ExponentialWeightedAverageStatistic> list = experimentalBandwidthMeterExternalSyntheticLambda0.read();
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1831790434);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SleepSegmentRequest.RemoteActionCompatParcelizer(((ExponentialWeightedAverageStatistic) it.next()).getRemoteActionCompatParcelizer(), R.drawable.ic_blue_check, _handleunrecognizedcharacterescapeWrite, 48);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = setdrawerelevation2.AudioAttributesCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(getParentFragment.write$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(46.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), assignParameter.IconCompatParcelizer(24.0f), BitmapDescriptorFactory.HUE_RED, 2, null), assignParameter.IconCompatParcelizer(100.0f)), _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer());
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            JsonGeneratorFeature.RemoteActionCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer2, fIconCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), _handleunrecognizedcharacterescapeWrite, 48, 0);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer3 = setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat());
            withTypeHandler withtypehandler3 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape2, 0);
            int iHashCode6 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler6 = _handleunrecognizedcharacterescape2.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer6 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameAudioAttributesCompatParcelizer3);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer6 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape2.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape2.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer6);
            } else {
                _handleunrecognizedcharacterescape2.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape8 = NumberOutput.read(_handleunrecognizedcharacterescape2);
            NumberOutput.write(_handleunrecognizedcharacterescape8, withtypehandler3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape8, _getchardescHandleMediaPlayPauseIfPendingOnHandler6, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape8, Integer.valueOf(iHashCode6), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape8, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape8, _handleoddnameRemoteActionCompatParcelizer6, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState3 = DrawerLayoutSavedState.INSTANCE;
            String str2 = singleArgCreatorDefaultsToProperties.read(R.string.unacceptable_doc, _handleunrecognizedcharacterescape2, 6);
            deserializeWithObjectId audioAttributesImplApi21Parcelizer2 = enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).getAudioAttributesImplApi21Parcelizer();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str2, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), 5, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, audioAttributesImplApi21Parcelizer2, _handleunrecognizedcharacterescape2, 48, 0, 65528);
            List<ExponentialWeightedAverageStatistic> listIconCompatParcelizer = experimentalBandwidthMeterExternalSyntheticLambda0.IconCompatParcelizer();
            _handleunrecognizedcharacterescape2.IconCompatParcelizer(-921555244);
            Iterator<T> it2 = listIconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                SleepSegmentRequest.RemoteActionCompatParcelizer(((ExponentialWeightedAverageStatistic) it2.next()).getRemoteActionCompatParcelizer(), R.drawable.ic_red_close, _handleunrecognizedcharacterescape2, 48);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.kyc_head_3, _handleunrecognizedcharacterescape2, 6), isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(28.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape2, 48, 0, 65016);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.text_document_bullet_1, _handleunrecognizedcharacterescape2, 6), getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape2, 48, 0, 65528);
            isInLayout.RemoteActionCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(getParentFragment.write$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(20.0f), 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), _handleunrecognizedcharacterescape2, 6);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            String str3 = singleArgCreatorDefaultsToProperties.read(R.string.btn_upload_documents, _handleunrecognizedcharacterescape2, 6);
            _handleOddName _handleoddnameWrite = getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(setdrawerelevation.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer()), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(8.0f));
            boolean z3 = (57344 & i6) == 16384;
            Object objOnPause5 = _handleunrecognizedcharacterescape2.onPause();
            if (z3 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.newLatLng
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CameraUpdate.IconCompatParcelizer(getcreatedondatems3);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause5);
            }
            deactivate.write(str3, _handleoddnameWrite, BitmapDescriptorFactory.HUE_RED, 0L, false, 0L, (getCreatedOnDateMs<getShowPopup>) objOnPause5, _handleunrecognizedcharacterescape2, 0, 60);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (IconCompatParcelizer((InputAccessor<Boolean>) inputAccessor)) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1409025113);
                boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(inputAccessor);
                Object objOnPause6 = _handleunrecognizedcharacterescape2.onPause();
                if (zAudioAttributesCompatParcelizer3 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause6 = new getCreatedOnDateMs() { // from class: o.newCameraPosition
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return CameraUpdate.AudioAttributesCompatParcelizer(inputAccessor);
                        }
                    };
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause6);
                }
                getCreatedOnDateMs getcreatedondatems5 = (getCreatedOnDateMs) objOnPause6;
                boolean z4 = (i6 & 896) == 256;
                Object objOnPause7 = _handleunrecognizedcharacterescape2.onPause();
                if (z4 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause7 = new getCreatedOnDateMs() { // from class: o.scrollBy
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return CameraUpdate.AudioAttributesImplApi21Parcelizer(getcreatedondatems);
                        }
                    };
                    _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause7);
                }
                GoogleMap.RemoteActionCompatParcelizer((getCreatedOnDateMs<getShowPopup>) getcreatedondatems5, (getCreatedOnDateMs<getShowPopup>) objOnPause7, _handleunrecognizedcharacterescape2, 0);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1401519889);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname5;
        } else {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zoomTo
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CameraUpdate.IconCompatParcelizer(_handleoddname3, i, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final boolean IconCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor RemoteActionCompatParcelizer() {
        return available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, InputAccessor inputAccessor) {
        if (!getOrderDetails.write(new int[]{6, 9}, i)) {
            RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, true);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, true);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor, false);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, int i, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, i, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }
}

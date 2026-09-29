package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSettingsResponse {
    public static final void IconCompatParcelizer(final String str, final int i, final LocationStatusCodes locationStatusCodes, final int i2, final getAnswerMap<? super String, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3) {
        int i4;
        int i5;
        final InputAccessor inputAccessor;
        boolean z;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(locationStatusCodes, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1849442822);
        if ((i3 & 6) == 0) {
            i4 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(locationStatusCodes.ordinal()) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 2048 : 1024;
        }
        if ((i3 & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i3) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i6 = i4;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i6) != 599186, i6 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1849442822, i6, -1, "com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeOtpScreen (KycAuthBridgeOtpScreen.kt:47)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default);
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
            Object[] objArr = new Object[0];
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.addLocationRequest
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return LocationSettingsResponse.IconCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final InputAccessor inputAccessor2 = (InputAccessor) addTimesI.read(objArr, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, 48);
            _handleOddName _handleoddnameIconCompatParcelizer = setVerticalAlign.IconCompatParcelizer(getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), setVerticalAlign.write(0, _handleunrecognizedcharacterescapeWrite, 0, 1), false, null, false, 14, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.getLocationSettingsStates
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return LocationSettingsResponse.read();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause2;
            int i7 = i6 >> 3;
            deactivate.read(null, 5, i2, null, getcreatedondatems3, _handleunrecognizedcharacterescapeWrite, (i7 & 896) | 24624, 9);
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.otp_verification, _handleunrecognizedcharacterescapeWrite, 6), drawerLayoutSavedState.AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _skipWSOrEnd.INSTANCE.RatingCompat()), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0, 0, 65528);
            String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.otp_verify_desc, new Object[]{str}, _handleunrecognizedcharacterescapeWrite, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strRemoteActionCompatParcelizer, isAdded.RemoteActionCompatParcelizer$default(drawerLayoutSavedState.AudioAttributesCompatParcelizer(getParentFragment.write$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), 1, null), _skipWSOrEnd.INSTANCE.RatingCompat()), BitmapDescriptorFactory.HUE_RED, 1, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0, 0, 65528);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(6.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, 10, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 54);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            String str2 = (String) inputAccessor2.getRemoteActionCompatParcelizer();
            deserializeWithObjectId deserializewithobjectid = TypeKt.read(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            FormatFeature formatFeature = FormatFeature.write;
            long j = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            long onPrepareFromUri = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            long jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed2 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme5 = MarrowTheme.INSTANCE;
            long onSetPlaybackSpeed3 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed();
            MarrowTheme marrowTheme6 = MarrowTheme.INSTANCE;
            FormatSchema formatSchema = formatFeature.read(jMediaBrowserCompatItemReceiver, 0L, j, onSetPlaybackSpeed3, 0L, onPrepareFromUri, onSetPlaybackSpeed, 0L, 0L, onSetPlaybackSpeed2, 0L, 0L, 0L, 0L, 0L, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, 0L, 0L, 0L, 0L, _handleunrecognizedcharacterescapeWrite, 0, 0, 48, 2063762);
            setKeepContentOnPlayerReset setkeepcontentonplayerreset = new setKeepContentOnPlayerReset(0, null, getPropertyName.INSTANCE.RemoteActionCompatParcelizer(), ResolvableDeserializer.INSTANCE.RemoteActionCompatParcelizer(), null, null, null, 115, null);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor2);
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.isGpsPresent
                    private /* synthetic */ int write = 6;

                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return LocationSettingsResponse.write(this.write, inputAccessor2, (String) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            LocationRequestBuilder locationRequestBuilder = LocationRequestBuilder.read;
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> magicModuleSubmissionRequestBodyWrite = LocationRequestBuilder.write();
            LocationRequestBuilder locationRequestBuilder2 = LocationRequestBuilder.read;
            _getBufferRecycler.IconCompatParcelizer(str2, (getAnswerMap) objOnPause3, _handleoddnameRemoteActionCompatParcelizer$default2, true, false, deserializewithobjectid, magicModuleSubmissionRequestBodyWrite, LocationRequestBuilder.RemoteActionCompatParcelizer(), null, null, false, null, setkeepcontentonplayerreset, null, false, 1, 0, null, null, formatSchema, _handleunrecognizedcharacterescapeWrite, 14159232, 196992, 487184);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (locationStatusCodes != LocationStatusCodes.AudioAttributesCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1742071291);
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default3 = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f), assignParameter.IconCompatParcelizer(20.0f)), BitmapDescriptorFactory.HUE_RED, 1, null);
                withTypeHandler withtypehandlerIconCompatParcelizer2 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescapeWrite, 6);
                int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default3);
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
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerIconCompatParcelizer2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                getView getview2 = getView.INSTANCE;
                String str3 = singleArgCreatorDefaultsToProperties.read(R.string.otp_not_receiving, _handleunrecognizedcharacterescapeWrite, 6);
                deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer2 = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme7 = MarrowTheme.INSTANCE;
                i5 = 6;
                _copyCurrentStringValue.IconCompatParcelizer(str3, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(2.0f), BitmapDescriptorFactory.HUE_RED, 11, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer2, _handleunrecognizedcharacterescapeWrite, 48, 0, 65528);
                String str4 = singleArgCreatorDefaultsToProperties.read(R.string.contact_legal_team, _handleunrecognizedcharacterescapeWrite, 6);
                deserializeWithObjectId deserializewithobjectidRemoteActionCompatParcelizer = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme8 = MarrowTheme.INSTANCE;
                long r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                boolean z2 = (i6 & 458752) == 131072;
                Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z2 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getCreatedOnDateMs() { // from class: o.isBleUsable
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return LocationSettingsResponse.write(getcreatedondatems);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
                }
                _copyCurrentStringValue.IconCompatParcelizer(str4, getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(companion, false, null, null, null, (getCreatedOnDateMs) objOnPause4, 15, null), r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidRemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0, 0, 65528);
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1741917469);
                boolean z3 = (i6 & 3670016) == 1048576;
                Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z3 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause5 = new getCreatedOnDateMs() { // from class: o.isBlePresent
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return LocationSettingsResponse.IconCompatParcelizer(getcreatedondatems2);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
                }
                isGpsUsable.IconCompatParcelizer(i, (getCreatedOnDateMs) objOnPause5, _handleunrecognizedcharacterescapeWrite, i7 & 14);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                i5 = 6;
            }
            String str5 = singleArgCreatorDefaultsToProperties.read(R.string.text_otp_clause, _handleunrecognizedcharacterescapeWrite, i5);
            deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer3 = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme9 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str5, isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), BitmapDescriptorFactory.HUE_RED, 1, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.AudioAttributesImplBaseParcelizer()), 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer3, _handleunrecognizedcharacterescapeWrite, 48, 0, 65016);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            String str6 = singleArgCreatorDefaultsToProperties.read(R.string.btn_continue, _handleunrecognizedcharacterescapeWrite, i5);
            boolean z4 = ((CharSequence) inputAccessor2.getRemoteActionCompatParcelizer()).length() > 0;
            _handleOddName _handleoddnameWrite = getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(setdrawerelevation.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer()), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), assignParameter.IconCompatParcelizer(18.0f), assignParameter.IconCompatParcelizer(8.0f));
            if ((i6 & 57344) != 16384) {
                inputAccessor = inputAccessor2;
                z = false;
            } else {
                inputAccessor = inputAccessor2;
                z = true;
            }
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(inputAccessor);
            Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer2 | z) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getCreatedOnDateMs() { // from class: o.LocationSettingsStates
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return LocationSettingsResponse.write(getanswermap, inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
            }
            deactivate.write(str6, _handleoddnameWrite, BitmapDescriptorFactory.HUE_RED, 0L, z4, 0L, (getCreatedOnDateMs<getShowPopup>) objOnPause6, _handleunrecognizedcharacterescapeWrite, 0, 44);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.LocationSettingsResult
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return LocationSettingsResponse.write(str, i, locationStatusCodes, i2, getanswermap, getcreatedondatems, getcreatedondatems2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor IconCompatParcelizer() {
        return available.RemoteActionCompatParcelizer$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(int i, InputAccessor inputAccessor, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (str.length() > i) {
            return getShowPopup.INSTANCE;
        }
        inputAccessor.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAnswerMap getanswermap, InputAccessor inputAccessor) {
        getanswermap.invoke(inputAccessor.getRemoteActionCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, int i, LocationStatusCodes locationStatusCodes, int i2, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(str, i, locationStatusCodes, i2, getanswermap, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1));
        return getShowPopup.INSTANCE;
    }
}

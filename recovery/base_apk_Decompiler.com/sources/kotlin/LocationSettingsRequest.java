package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeViewModel;
import kotlin.setIntervalMillis;
import kotlin.setMinUpdateDistanceMeters;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSettingsRequest {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void read(final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        withFieldVisibility.write defaultViewModelCreationExtras;
        int i3;
        setMinUpdateDistanceMeters setminupdatedistancemeters;
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-281333736);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-281333736, i2, -1, "com.marrow2.ui.settings.kyc.authbridge.KycAuthBridgeOtpScreenMainLayout (KycAuthBridgeOtpMainLayout.kt:27)");
            }
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final KycAuthBridgeViewModel kycAuthBridgeViewModel = (KycAuthBridgeViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(KycAuthBridgeViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescapeWrite, 0);
            isNetworkLocationPresent isnetworklocationpresent = (isNetworkLocationPresent) isSetterVisible.AudioAttributesCompatParcelizer(kycAuthBridgeViewModel.IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            setMinUpdateDistanceMeters setminupdatedistancemeters2 = (setMinUpdateDistanceMeters) isSetterVisible.AudioAttributesCompatParcelizer(kycAuthBridgeViewModel.read(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(kycAuthBridgeViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer()).booleanValue();
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            String str = singleArgCreatorDefaultsToProperties.read(R.string.subject_otp_fail, _handleunrecognizedcharacterescapeWrite, 6);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.addAllLocationRequests
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return LocationSettingsRequest.RemoteActionCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            MediaSessionCompatToken.write(true, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescapeWrite, 54, 0);
            if (zBooleanValue) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1731544438);
                deactivate.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1733011606);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddname = getParentFragment.read(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), onDestroy.write(onPrimaryNavigationFragmentChanged.write(onCreateView.INSTANCE, _handleunrecognizedcharacterescapeWrite, 6), _handleunrecognizedcharacterescapeWrite, 0));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
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
            String remoteActionCompatParcelizer = isnetworklocationpresent.getRemoteActionCompatParcelizer();
            int write = isnetworklocationpresent.getWrite();
            LocationStatusCodes audioAttributesCompatParcelizer = isnetworklocationpresent.getAudioAttributesCompatParcelizer();
            int read = isnetworklocationpresent.getRead();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(kycAuthBridgeViewModel);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.getGeofencingClient
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return LocationSettingsRequest.RemoteActionCompatParcelizer(kycAuthBridgeViewModel, (String) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause2;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(kycAuthBridgeViewModel);
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer2 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.LocationSettingsRequestBuilder
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return LocationSettingsRequest.AudioAttributesCompatParcelizer(kycAuthBridgeViewModel);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause3;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(kycAuthBridgeViewModel);
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer3 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.setAlwaysShow
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return LocationSettingsRequest.write(kycAuthBridgeViewModel);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            int i4 = i2;
            LocationSettingsResponse.IconCompatParcelizer(remoteActionCompatParcelizer, write, audioAttributesCompatParcelizer, read, getanswermap, getcreatedondatems2, (getCreatedOnDateMs) objOnPause4, _handleunrecognizedcharacterescapeWrite, 0);
            String str2 = singleArgCreatorDefaultsToProperties.read(R.string.otp_verification_success, _handleunrecognizedcharacterescapeWrite, 6);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setminupdatedistancemeters2);
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str);
            boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(kycAuthBridgeViewModel);
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str2);
            boolean z = (i4 & 14) == 4;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((zAudioAttributesCompatParcelizer | zIconCompatParcelizer4 | zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer5 | zAudioAttributesCompatParcelizer3) || z) || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i3 = 0;
                setminupdatedistancemeters = setminupdatedistancemeters2;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(setminupdatedistancemeters2, context, str, kycAuthBridgeViewModel, str2, getcreatedondatems, null);
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            } else {
                i3 = 0;
                setminupdatedistancemeters = setminupdatedistancemeters2;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            }
            StreamReadException.IconCompatParcelizer(setminupdatedistancemeters, (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescape2, i3);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setNeedBle
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return LocationSettingsRequest.write(getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(KycAuthBridgeViewModel kycAuthBridgeViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        kycAuthBridgeViewModel.read(new setIntervalMillis.read(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(KycAuthBridgeViewModel kycAuthBridgeViewModel) {
        kycAuthBridgeViewModel.read(setIntervalMillis.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(KycAuthBridgeViewModel kycAuthBridgeViewModel) {
        kycAuthBridgeViewModel.read(setIntervalMillis.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ KycAuthBridgeViewModel MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ setMinUpdateDistanceMeters RemoteActionCompatParcelizer;
        private /* synthetic */ Context read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            setMinUpdateDistanceMeters setminupdatedistancemeters = this.RemoteActionCompatParcelizer;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setminupdatedistancemeters, setMinUpdateDistanceMeters.AudioAttributesCompatParcelizer.INSTANCE)) {
                scheduleUpdate.AudioAttributesCompatParcelizer(this.read, "legal@marrowmed.com", this.IconCompatParcelizer, "");
                this.MediaBrowserCompatCustomActionResultReceiver.read(setIntervalMillis.RemoteActionCompatParcelizer.INSTANCE);
            } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setminupdatedistancemeters, setMinUpdateDistanceMeters.write.INSTANCE)) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setminupdatedistancemeters, setMinUpdateDistanceMeters.RemoteActionCompatParcelizer.INSTANCE)) {
                    if (!(setminupdatedistancemeters instanceof setMinUpdateDistanceMeters.IconCompatParcelizer)) {
                        throw new RenewEligibleCreator();
                    }
                    CmcdConfigurationRequestConfig.read(this.read, ((setMinUpdateDistanceMeters.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), 0);
                    this.MediaBrowserCompatCustomActionResultReceiver.read(setIntervalMillis.RemoteActionCompatParcelizer.INSTANCE);
                }
            } else {
                CmcdConfigurationRequestConfig.read(this.read, this.write, 0);
                this.AudioAttributesCompatParcelizer.invoke();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(setMinUpdateDistanceMeters setminupdatedistancemeters, Context context, String str, KycAuthBridgeViewModel kycAuthBridgeViewModel, String str2, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = setminupdatedistancemeters;
            this.read = context;
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompatCustomActionResultReceiver = kycAuthBridgeViewModel;
            this.write = str2;
            this.AudioAttributesCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

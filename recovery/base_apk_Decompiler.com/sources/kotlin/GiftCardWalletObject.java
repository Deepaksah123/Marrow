package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import java.util.Locale;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import kotlin.isUiRequired;
import kotlin.setEmailRequired;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class GiftCardWalletObject {

    public static final class read implements getAnswerMap {
        public static final read read = new read();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final void RemoteActionCompatParcelizer(final getSavedState getsavedstate, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final getAnswerMap<? super PaymentDataRequestBuilder, getShowPopup> getanswermap2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, final getAnswerMap<? super Integer, getShowPopup> getanswermap3, final getAnswerMap<? super String, getShowPopup> getanswermap4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(getsavedstate, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(getanswermap4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1503431119);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getsavedstate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 67108864 : 33554432;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((38347923 & i2) != 38347922, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1503431119, i2, -1, "com.marrow2.ui.test.gtanalytics.composable.GtaAnalyticsContent (GtaAnalyticsContent.kt:64)");
            }
            _handleOddName _handleoddname = onInflate.read(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null));
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, 0, 15), BitmapDescriptorFactory.HUE_RED, 2, null);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (29360128 & i2) == 8388608;
            boolean z3 = (234881024 & i2) == 67108864;
            boolean z4 = (i2 & 112) == 32;
            boolean z5 = (458752 & i2) == 131072;
            boolean z6 = (3670016 & i2) == 1048576;
            boolean z7 = (i2 & 896) == 256;
            boolean z8 = (i2 & 7168) == 2048;
            boolean z9 = (i2 & 57344) == 16384;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z | z2 | z3 | z4 | z5 | z6 | z7 | z8) || z9) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                getAnswerMap getanswermap5 = new getAnswerMap() { // from class: o.getBalanceMicros
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return GiftCardWalletObject.AudioAttributesCompatParcelizer(getsavedstate, getanswermap2, getcreatedondatems, magicModuleSubmissionRequestBody, getcreatedondatems2, getcreatedondatems3, getanswermap, getanswermap3, getanswermap4, (setReenterTransition) obj);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(getanswermap5);
                objOnPause = getanswermap5;
            } else {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            }
            performContextItemSelected.write(_handleoddname, null, getreturntransitionWrite$default, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape2, 0, 506);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getBarcodeLabel
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GiftCardWalletObject.AudioAttributesCompatParcelizer(getsavedstate, getanswermap, getanswermap2, getcreatedondatems, magicModuleSubmissionRequestBody, getanswermap3, getanswermap4, getcreatedondatems2, getcreatedondatems3, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final getSavedState getsavedstate, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, final getCreatedOnDateMs getcreatedondatems2, final getCreatedOnDateMs getcreatedondatems3, final getAnswerMap getanswermap2, final getAnswerMap getanswermap3, final getAnswerMap getanswermap4, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        if (getsavedstate.getWrite()) {
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(151258783, true, new getModuleData() { // from class: o.getCardIdentifier
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return GiftCardWalletObject.IconCompatParcelizer(getcreatedondatems2, getcreatedondatems3, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(-1757656294, true, new getModuleData() { // from class: o.getCardNumber
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return GiftCardWalletObject.write(getsavedstate, getanswermap2, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(-538445245, true, new getModuleData() { // from class: o.getBarcodeType
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return GiftCardWalletObject.RemoteActionCompatParcelizer(getsavedstate, getanswermap3, getanswermap4, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        read(setreentertransition, getsavedstate, getanswermap, getcreatedondatems, magicModuleSubmissionRequestBody);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(151258783, i, -1, "com.marrow2.ui.test.gtanalytics.composable.GtaAnalyticsContent.<anonymous>.<anonymous>.<anonymous> (GtaAnalyticsContent.kt:73)");
            }
            getProgramName.IconCompatParcelizer(getcreatedondatems, getcreatedondatems2, getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f)), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getSavedState getsavedstate, getAnswerMap getanswermap, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1757656294, i, -1, "com.marrow2.ui.test.gtanalytics.composable.GtaAnalyticsContent.<anonymous>.<anonymous>.<anonymous> (GtaAnalyticsContent.kt:82)");
            }
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer = WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(10.0f), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 8, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer, readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape, 54);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            String upperCase = singleArgCreatorDefaultsToProperties.read(R.string.gta_analytics_header, _handleunrecognizedcharacterescape, 6).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatItemReceiver = TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            C0208streamReadConstraints.write(upperCase, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, 0, 0, 131066);
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver2 = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer2 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver2, _handleunrecognizedcharacterescape, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview2 = getView.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default2 = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 11, null);
            String str = singleArgCreatorDefaultsToProperties.read(R.string.gta_limit_filter_prefix, _handleunrecognizedcharacterescape, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplApi26Parcelizer = TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            C0208streamReadConstraints.write(str, _handleoddnameAudioAttributesCompatParcelizer$default2, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape, 48, 0, 131064);
            addLinksModuleDataUri.IconCompatParcelizer(getsavedstate.getRead(), (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getSavedState getsavedstate, getAnswerMap getanswermap, getAnswerMap getanswermap2, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-538445245, i, -1, "com.marrow2.ui.test.gtanalytics.composable.GtaAnalyticsContent.<anonymous>.<anonymous>.<anonymous> (GtaAnalyticsContent.kt:109)");
            }
            setEmailRequired audioAttributesCompatParcelizer = getsavedstate.getAudioAttributesCompatParcelizer();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, setEmailRequired.read.INSTANCE) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, setEmailRequired.RemoteActionCompatParcelizer.INSTANCE)) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(880685448);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(18.0f)), _handleunrecognizedcharacterescape, 6);
                setEventNumber.write(getFrameEndSchedulerui.IconCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(getParentFragment.write$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 2, null), assignParameter.IconCompatParcelizer(364.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(16.0f))), 0, 0, _handleunrecognizedcharacterescape, 0, 6);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!(audioAttributesCompatParcelizer instanceof setEmailRequired.AudioAttributesCompatParcelizer)) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-2049803451);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(881253585);
                setEmailRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (setEmailRequired.AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer;
                getClassId.write(audioAttributesCompatParcelizer2.read(), audioAttributesCompatParcelizer2.IconCompatParcelizer(), true, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getAnswerMap<? super String, getShowPopup>) getanswermap2, (_handleOddName) null, _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 32);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void read(setReenterTransition setreentertransition, final getSavedState getsavedstate, final getAnswerMap<? super PaymentDataRequestBuilder, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody) {
        final withSavedState withsavedstateAudioAttributesCompatParcelizer;
        final PaymentDataRequestBuilder paymentDataRequestBuilderWrite;
        setEmailRequired audioAttributesCompatParcelizer = getsavedstate.getAudioAttributesCompatParcelizer();
        setEmailRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer instanceof setEmailRequired.AudioAttributesCompatParcelizer ? (setEmailRequired.AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer : null;
        if (audioAttributesCompatParcelizer2 == null || (withsavedstateAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer()) == null) {
            withsavedstateAudioAttributesCompatParcelizer = withSavedState.RemoteActionCompatParcelizer;
        }
        if (audioAttributesCompatParcelizer2 == null || (paymentDataRequestBuilderWrite = audioAttributesCompatParcelizer2.write()) == null) {
            paymentDataRequestBuilderWrite = PaymentDataRequestBuilder.RemoteActionCompatParcelizer;
        }
        setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(1360451378, true, new getModuleData() { // from class: o.getBalanceUpdateTime
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return GiftCardWalletObject.AudioAttributesCompatParcelizer(getsavedstate, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        isUiRequired iconCompatParcelizer = getsavedstate.getIconCompatParcelizer();
        if (iconCompatParcelizer instanceof isUiRequired.IconCompatParcelizer) {
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(1702936874, true, new getModuleData() { // from class: o.getBalanceCurrencyCode
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return GiftCardWalletObject.read(withsavedstateAudioAttributesCompatParcelizer, getcreatedondatems, paymentDataRequestBuilderWrite, getanswermap, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
            List<setCardRequirements> listWrite = ((isUiRequired.IconCompatParcelizer) iconCompatParcelizer).write();
            setreentertransition.RemoteActionCompatParcelizer(listWrite.size(), new write(new getAnswerMap() { // from class: o.getBarcodeAlternateText
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return GiftCardWalletObject.read((setCardRequirements) obj);
                }
            }, listWrite), new IconCompatParcelizer(read.read, listWrite), multiplyFft.IconCompatParcelizer(802480018, true, new AudioAttributesCompatParcelizer(listWrite, paymentDataRequestBuilderWrite, magicModuleSubmissionRequestBody)));
            whenAllComplete whenallcomplete = whenAllComplete.RemoteActionCompatParcelizer;
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, whenAllComplete.MediaBrowserCompatItemReceiver(), 3, null);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, isUiRequired.AudioAttributesCompatParcelizer.INSTANCE)) {
            whenAllComplete whenallcomplete2 = whenAllComplete.RemoteActionCompatParcelizer;
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, whenAllComplete.MediaBrowserCompatCustomActionResultReceiver(), 3, null);
        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, isUiRequired.RemoteActionCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getSavedState getsavedstate, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1360451378, i, -1, "com.marrow2.ui.test.gtanalytics.composable.gtaSubjectStatsSection.<anonymous> (GtaAnalyticsContent.kt:158)");
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(28.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            String upperCase = singleArgCreatorDefaultsToProperties.read(R.string.subject_wise_performance_header, _handleunrecognizedcharacterescape, 6).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatItemReceiver = TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            C0208streamReadConstraints.write(upperCase, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, 48, 0, 131064);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            C0208streamReadConstraints.write(singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.gta_subj_wise_intro, new Object[]{Integer.valueOf(getsavedstate.getRead())}, _handleunrecognizedcharacterescape, 6), getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(28.0f), BitmapDescriptorFactory.HUE_RED, 10, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).IconCompatParcelizer(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 48, 0, 131064);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final class IconCompatParcelizer implements getAnswerMap<Integer, Object> {
        private /* synthetic */ getAnswerMap IconCompatParcelizer;
        private /* synthetic */ List RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return AudioAttributesCompatParcelizer(num.intValue());
        }

        private Object AudioAttributesCompatParcelizer(int i) {
            return this.IconCompatParcelizer.invoke(this.RemoteActionCompatParcelizer.get(i));
        }

        public IconCompatParcelizer(getAnswerMap getanswermap, List list) {
            this.IconCompatParcelizer = getanswermap;
            this.RemoteActionCompatParcelizer = list;
        }
    }

    public static final class write implements getAnswerMap<Integer, Object> {
        private /* synthetic */ getAnswerMap AudioAttributesCompatParcelizer;
        private /* synthetic */ List IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return write(num.intValue());
        }

        private Object write(int i) {
            return this.AudioAttributesCompatParcelizer.invoke(this.IconCompatParcelizer.get(i));
        }

        public write(getAnswerMap getanswermap, List list) {
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.IconCompatParcelizer = list;
        }
    }

    public static final class AudioAttributesCompatParcelizer implements getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ List AudioAttributesCompatParcelizer;
        private /* synthetic */ PaymentDataRequestBuilder RemoteActionCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody write;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(performDestroy performdestroy, Integer num, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num2) {
            read(performdestroy, num.intValue(), _handleunrecognizedcharacterescape, num2.intValue());
            return getShowPopup.INSTANCE;
        }

        private void read(performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = i2 | (_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(performdestroy) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16;
            }
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            setCardRequirements setcardrequirements = (setCardRequirements) this.AudioAttributesCompatParcelizer.get(i);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(286901660);
            PaymentDataRequestBuilder paymentDataRequestBuilder = this.RemoteActionCompatParcelizer;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this.write);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setcardrequirements);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (getCreatedOnDateMs) new RemoteActionCompatParcelizer(this.write, setcardrequirements);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            InstrumentInfoCardClass.IconCompatParcelizer(setcardrequirements, paymentDataRequestBuilder, (getCreatedOnDateMs<getShowPopup>) objOnPause, getParentFragment.write$default(performDestroy.read$default(performdestroy, _handleOddName.INSTANCE, null, null, null, 7, null), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 2, null), _handleunrecognizedcharacterescape, 0, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        public AudioAttributesCompatParcelizer(List list, PaymentDataRequestBuilder paymentDataRequestBuilder, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody) {
            this.AudioAttributesCompatParcelizer = list;
            this.RemoteActionCompatParcelizer = paymentDataRequestBuilder;
            this.write = magicModuleSubmissionRequestBody;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(withSavedState withsavedstate, getCreatedOnDateMs getcreatedondatems, PaymentDataRequestBuilder paymentDataRequestBuilder, getAnswerMap getanswermap, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1702936874, i, -1, "com.marrow2.ui.test.gtanalytics.composable.gtaSubjectStatsSection.<anonymous> (GtaAnalyticsContent.kt:178)");
            }
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(28.0f)), _handleunrecognizedcharacterescape, 6);
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer = WindowInsetsCompatImpl30.INSTANCE.RemoteActionCompatParcelizer();
            _handleOddName _handleoddnameWrite$default = getParentFragment.write$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, 2, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer, readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape, 54);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite$default);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            InstrumentInfo.write(withsavedstate, getcreatedondatems, null, 0L, 0L, null, null, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 0, 252);
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver2 = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer2 = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver2, _handleunrecognizedcharacterescape, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview2 = getView.INSTANCE;
            String str = singleArgCreatorDefaultsToProperties.read(R.string.gta_show_label, _handleunrecognizedcharacterescape, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplApi26Parcelizer = TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            C0208streamReadConstraints.write(str, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 11, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape, 48, 0, 131064);
            addLinksModuleDataUri.AudioAttributesCompatParcelizer(paymentDataRequestBuilder, (getAnswerMap<? super PaymentDataRequestBuilder, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f)), _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(setCardRequirements setcardrequirements) {
        toMagicModuleMetaRepoModel.write(setcardrequirements, "");
        return setcardrequirements.write();
    }

    static final class RemoteActionCompatParcelizer implements getCreatedOnDateMs<getShowPopup> {
        private /* synthetic */ MagicModuleSubmissionRequestBody<String, String, getShowPopup> read;
        private /* synthetic */ setCardRequirements write;

        private void RemoteActionCompatParcelizer() {
            this.read.invoke(this.write.write(), this.write.RemoteActionCompatParcelizer());
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, setCardRequirements setcardrequirements) {
            this.read = magicModuleSubmissionRequestBody;
            this.write = setcardrequirements;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getSavedState getsavedstate, getAnswerMap getanswermap, getAnswerMap getanswermap2, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap3, getAnswerMap getanswermap4, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(getsavedstate, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getAnswerMap<? super PaymentDataRequestBuilder, getShowPopup>) getanswermap2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, (getAnswerMap<? super Integer, getShowPopup>) getanswermap3, (getAnswerMap<? super String, getShowPopup>) getanswermap4, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

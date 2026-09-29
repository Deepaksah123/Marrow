package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.ThemeKt;
import java.util.List;
import kotlin._handleOddName;
import kotlin.getTransactionInfo;
import kotlin.isPhoneNumberRequired;
import kotlin.setPaymentMethodTokenizationParameters;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setCreateMode {
    public static final void RemoteActionCompatParcelizer(final isPhoneNumberRequired isphonenumberrequired, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super Integer, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getAnswerMap<? super String, getShowPopup> getanswermap2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        toMagicModuleMetaRepoModel.write(isphonenumberrequired, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1715819293);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(isphonenumberrequired) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i2) != 74898, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1715819293, i2, -1, "com.marrow2.ui.test.gtanalytics.composable.GtAnalyticsSubjectScreen (GtAnalyticsSubjectScreen.kt:38)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(156847517, true, new MagicModuleSubmissionRequestBody() { // from class: o.CreateWalletObjectsRequestCreateMode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCreateMode.IconCompatParcelizer(isphonenumberrequired, getcreatedondatems, getanswermap, getcreatedondatems2, getanswermap2, getcreatedondatems3, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setOfferWalletObject
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCreateMode.read(isphonenumberrequired, getcreatedondatems, getanswermap, getcreatedondatems2, getanswermap2, getcreatedondatems3, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(isPhoneNumberRequired isphonenumberrequired, getCreatedOnDateMs getcreatedondatems, final getAnswerMap getanswermap, final getCreatedOnDateMs getcreatedondatems2, final getAnswerMap getanswermap2, final getCreatedOnDateMs getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(156847517, i, -1, "com.marrow2.ui.test.gtanalytics.composable.GtAnalyticsSubjectScreen.<anonymous> (GtAnalyticsSubjectScreen.kt:40)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddname = onInflate.read(getFrameEndSchedulerui.IconCompatParcelizer$default(onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read(), null, 2, null));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddname);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isphonenumberrequired, isPhoneNumberRequired.IconCompatParcelizer.INSTANCE)) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1974974590);
                setInfoModuleDataHexFontColor.write(_handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (isphonenumberrequired instanceof isPhoneNumberRequired.read) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1094485632);
                final getShippingAddressRequirements getshippingaddressrequirementsRemoteActionCompatParcelizer = ((isPhoneNumberRequired.read) isphonenumberrequired).RemoteActionCompatParcelizer();
                _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
                int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer$default2);
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
                NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
                isExistingPaymentMethodRequired.write(getcreatedondatems, 0, singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.gta_subject_performance_title, new Object[]{getshippingaddressrequirementsRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()}, _handleunrecognizedcharacterescape, 6), _handleunrecognizedcharacterescape, 0, 2);
                _handleOddName _handleoddnameIconCompatParcelizer$default3 = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 0, 15), BitmapDescriptorFactory.HUE_RED, 2, null);
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getshippingaddressrequirementsRemoteActionCompatParcelizer);
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
                boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems2);
                boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap2);
                boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems3);
                Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4 | zAudioAttributesCompatParcelizer5) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getAnswerMap() { // from class: o.setLoyaltyWalletObject
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return setCreateMode.write(getshippingaddressrequirementsRemoteActionCompatParcelizer, getcreatedondatems2, getanswermap2, getcreatedondatems3, getanswermap, (setReenterTransition) obj);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                }
                performContextItemSelected.write(_handleoddnameIconCompatParcelizer$default3, null, getreturntransitionWrite$default, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 6, 506);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!(isphonenumberrequired instanceof isPhoneNumberRequired.RemoteActionCompatParcelizer)) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1974975942);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1974849445);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final getShippingAddressRequirements getshippingaddressrequirements, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, final getCreatedOnDateMs getcreatedondatems2, final getAnswerMap getanswermap2, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        final setPaymentMethodTokenizationParameters write = getshippingaddressrequirements.getWrite();
        if (write instanceof setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer) {
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(1463283, true, new getModuleData() { // from class: o.setGiftCardWalletObject
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setCreateMode.write(write, getanswermap2, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write, setPaymentMethodTokenizationParameters.AudioAttributesCompatParcelizer.INSTANCE) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write, setPaymentMethodTokenizationParameters.IconCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        getTransactionInfo iconCompatParcelizer = getshippingaddressrequirements.getIconCompatParcelizer();
        if (iconCompatParcelizer instanceof getTransactionInfo.read) {
            getTransactionInfo.read readVar = (getTransactionInfo.read) iconCompatParcelizer;
            getCardInfo.read(setreentertransition, readVar.write(), readVar.getIconCompatParcelizer(), getcreatedondatems, readVar.RemoteActionCompatParcelizer(), getshippingaddressrequirements.getRemoteActionCompatParcelizer(), getshippingaddressrequirements.getRead(), getanswermap, getcreatedondatems2);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, getTransactionInfo.write.INSTANCE)) {
            setReenterTransition.AudioAttributesCompatParcelizer$default(setreentertransition, null, null, multiplyFft.IconCompatParcelizer(1416305043, true, new getModuleData() { // from class: o.FullWallet
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setCreateMode.AudioAttributesCompatParcelizer(getshippingaddressrequirements, getcreatedondatems2, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer, getTransactionInfo.IconCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setPaymentMethodTokenizationParameters setpaymentmethodtokenizationparameters, getAnswerMap getanswermap, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1463283, i, -1, "com.marrow2.ui.test.gtanalytics.composable.GtAnalyticsSubjectScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GtAnalyticsSubjectScreen.kt:73)");
            }
            setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer) setpaymentmethodtokenizationparameters;
            List<withTimeout> listAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            int i2 = remoteActionCompatParcelizer.read();
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.CreateWalletObjectsRequestBuilder
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setCreateMode.read((String) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getClassId.write(listAudioAttributesCompatParcelizer, i2, false, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getAnswerMap<? super String, getShowPopup>) objOnPause, getParentFragment.write$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), 1, null), _handleunrecognizedcharacterescape, 221568, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getShippingAddressRequirements getshippingaddressrequirements, getCreatedOnDateMs getcreatedondatems, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1416305043, i, -1, "com.marrow2.ui.test.gtanalytics.composable.GtAnalyticsSubjectScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GtAnalyticsSubjectScreen.kt:105)");
            }
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
            addAllowedPaymentMethod.RemoteActionCompatParcelizer(getshippingaddressrequirements.getRemoteActionCompatParcelizer(), getshippingaddressrequirements.getRead(), (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, 0);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f)), _handleunrecognizedcharacterescape, 6);
            setEventNumber.read(R.string.gta_topic_empty_head, R.string.gta_topic_empty_body, null, _handleunrecognizedcharacterescape, 54, 4);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isPhoneNumberRequired isphonenumberrequired, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems2, getAnswerMap getanswermap2, getCreatedOnDateMs getcreatedondatems3, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(isphonenumberrequired, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getAnswerMap<? super String, getShowPopup>) getanswermap2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

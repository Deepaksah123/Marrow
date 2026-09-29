package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin.AbstractDeserializer;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class moveCamera {
    public static final void RemoteActionCompatParcelizer(final String str, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1996716564);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1996716564, i2, -1, "com.marrow2.ui.settings.kyc.name.KycConfirmSubmissionDialog (KycNameConfirmDialog.kt:43)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.resetMinMaxZoomPreference
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return moveCamera.read();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _fromInt.AudioAttributesCompatParcelizer((getCreatedOnDateMs) objOnPause, null, multiplyFft.AudioAttributesCompatParcelizer(1662899189, true, new MagicModuleSubmissionRequestBody() { // from class: o.setContentDescription
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return moveCamera.IconCompatParcelizer(str, getcreatedondatems2, getcreatedondatems, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 390, 2);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setInfoWindowAdapter
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return moveCamera.RemoteActionCompatParcelizer(str, getcreatedondatems, getcreatedondatems2, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, final getCreatedOnDateMs getcreatedondatems, final getCreatedOnDateMs getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1662899189, i, -1, "com.marrow2.ui.settings.kyc.name.KycConfirmSubmissionDialog.<anonymous> (KycNameConfirmDialog.kt:48)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.read(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 6);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer$default);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer = getParentFragment.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), assignParameter.IconCompatParcelizer(24.0f));
            withTypeHandler withtypehandler2 = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape, 48);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState2 = DrawerLayoutSavedState.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.confirm_submission, _handleunrecognizedcharacterescape, 6), isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.IconCompatParcelizer()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape, 48, 0, 65016);
            String str2 = singleArgCreatorDefaultsToProperties.read(R.string.text_submit_desc, _handleunrecognizedcharacterescape, 6);
            AbstractDeserializer abstractDeserializer = new AbstractDeserializer(singleArgCreatorDefaultsToProperties.read(R.string.doc_submission_bullet1, _handleunrecognizedcharacterescape, 6), null, 2, null);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1389574);
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1388562);
            _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt();
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            int i2 = iconCompatParcelizer.read(_findpropertyunwrapperOnRemoveQueueItemAt.write((65503 & 1) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.read() : MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), (65503 & 2) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt.onCustomAction : null));
            try {
                iconCompatParcelizer.RemoteActionCompatParcelizer(singleArgCreatorDefaultsToProperties.read(R.string.doc_submission_bullet2, _handleunrecognizedcharacterescape, 6));
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                iconCompatParcelizer.read(i2);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt2 = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)).onRemoveQueueItemAt();
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                i2 = iconCompatParcelizer.read(_findpropertyunwrapperOnRemoveQueueItemAt2.write((65503 & 1) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.read() : MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetShuffleMode(), (65503 & 2) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperOnRemoveQueueItemAt2.onCustomAction : null));
                try {
                    StringBuilder sb = new StringBuilder(" ");
                    sb.append(str);
                    iconCompatParcelizer.RemoteActionCompatParcelizer(sb.toString());
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    iconCompatParcelizer.read(i2);
                    AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    List<AbstractDeserializer> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new AbstractDeserializer[]{abstractDeserializer, abstractDeserializerRemoteActionCompatParcelizer, new AbstractDeserializer(singleArgCreatorDefaultsToProperties.read(R.string.doc_submission_bullet3, _handleunrecognizedcharacterescape, 6), null, 2, null)});
                    AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer2 = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
                    for (AbstractDeserializer abstractDeserializer2 : listRemoteActionCompatParcelizer) {
                        iconCompatParcelizer2.RemoteActionCompatParcelizer("\n  ");
                        iconCompatParcelizer2.RemoteActionCompatParcelizer("• ");
                        iconCompatParcelizer2.RemoteActionCompatParcelizer(abstractDeserializer2);
                    }
                    AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer2 = iconCompatParcelizer2.RemoteActionCompatParcelizer();
                    AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer3 = new AbstractDeserializer.IconCompatParcelizer(0, 1, null);
                    iconCompatParcelizer3.RemoteActionCompatParcelizer(str2);
                    iconCompatParcelizer3.RemoteActionCompatParcelizer(abstractDeserializerRemoteActionCompatParcelizer2);
                    AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer3 = iconCompatParcelizer3.RemoteActionCompatParcelizer();
                    long jRemoteActionCompatParcelizer = setResolver.RemoteActionCompatParcelizer(20);
                    int iIconCompatParcelizer = assignIndexes.INSTANCE.IconCompatParcelizer();
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                    MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                    _copyCurrentStringValue.read(abstractDeserializerRemoteActionCompatParcelizer3, _handleoddnameRemoteActionCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, assignIndexes.write(iIconCompatParcelizer), jRemoteActionCompatParcelizer, 0, false, 0, 0, null, null, TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 48, 6, 129528);
                    Object[] objArr = new Object[0];
                    Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                    if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getCreatedOnDateMs() { // from class: o.isTrafficEnabled
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return moveCamera.RemoteActionCompatParcelizer();
                            }
                        };
                        _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause);
                    } else {
                        _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                    }
                    final InputAccessor inputAccessor = (InputAccessor) addTimesI.read(objArr, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape2, 48);
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(drawerLayoutSavedState2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.RatingCompat()), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                    AbstractDeserializer abstractDeserializer3 = new AbstractDeserializer(singleArgCreatorDefaultsToProperties.read(R.string.doc_valid_confirmation, _handleunrecognizedcharacterescape2, 6), null, 2, null);
                    boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(inputAccessor);
                    Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                    if (zAudioAttributesCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause2 = new getAnswerMap() { // from class: o.isBuildingsEnabled
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return moveCamera.AudioAttributesCompatParcelizer(inputAccessor, ((Boolean) obj).booleanValue());
                            }
                        };
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause2);
                    }
                    deactivate.RemoteActionCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default2, abstractDeserializer3, (getAnswerMap<? super Boolean, getShowPopup>) objOnPause2, _handleunrecognizedcharacterescape, 0, 0);
                    String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.text_submit, new Object[]{str}, _handleunrecognizedcharacterescape2, 6);
                    boolean zWrite = write((InputAccessor<Boolean>) inputAccessor);
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer = drawerLayoutSavedState2.AudioAttributesCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer());
                    boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(getcreatedondatems);
                    Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
                    if (zAudioAttributesCompatParcelizer2 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause3 = new getCreatedOnDateMs() { // from class: o.isIndoorEnabled
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return moveCamera.write(getcreatedondatems);
                            }
                        };
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause3);
                    }
                    deactivate.write(strRemoteActionCompatParcelizer, _handleoddnameAudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 0L, zWrite, 0L, (getCreatedOnDateMs<getShowPopup>) objOnPause3, _handleunrecognizedcharacterescape, 0, 44);
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(getcreatedondatems2);
                    Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
                    if (zAudioAttributesCompatParcelizer3 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause4 = new getCreatedOnDateMs() { // from class: o.setIndoorEnabled
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return moveCamera.IconCompatParcelizer(getcreatedondatems2);
                            }
                        };
                        _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause4);
                    }
                    addPolyline addpolyline = addPolyline.write;
                    CloseImageView.RemoteActionCompatParcelizer((getCreatedOnDateMs) objOnPause4, _handleoddnameAudioAttributesCompatParcelizer$default, false, null, null, null, null, null, null, addPolyline.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape, 805306416, TarConstants.XSTAR_MAGIC_OFFSET);
                    _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                    _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                } finally {
                }
            } finally {
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final boolean write(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAccessor RemoteActionCompatParcelizer() {
        return available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, boolean z) {
        RemoteActionCompatParcelizer(inputAccessor, z);
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

    private static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(str, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

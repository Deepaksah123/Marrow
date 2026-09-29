package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class GeofenceStatusCodes {
    public static final void write(_handleOddName _handleoddname, final getInitialTrigger getinitialtrigger, final CurrentLocationRequestBuilder currentLocationRequestBuilder, final getAnswerMap<? super Boolean, getShowPopup> getanswermap, final getAnswerMap<? super Integer, getShowPopup> getanswermap2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final getAnswerMap<? super getMediaMimeType, getShowPopup> getanswermap3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        toMagicModuleMetaRepoModel.write(getinitialtrigger, "");
        toMagicModuleMetaRepoModel.write(currentLocationRequestBuilder, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1476573924);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getinitialtrigger) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(currentLocationRequestBuilder) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 536870912 : 268435456;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((306783379 & i3) != 306783378, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            if (i4 != 0) {
                _handleoddname2 = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1476573924, i3, -1, "com.marrow2.ui.schema.schemaReview.ui.SchemeReview (SchemaReview.kt:57)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(currentLocationRequestBuilder);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                InputAccessor inputAccessorRemoteActionCompatParcelizer$default = available.RemoteActionCompatParcelizer$default(Boolean.valueOf(currentLocationRequestBuilder.getWrite() != getMediaMimeType.AudioAttributesImplBaseParcelizer), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(inputAccessorRemoteActionCompatParcelizer$default);
                objOnPause = inputAccessorRemoteActionCompatParcelizer$default;
            }
            final InputAccessor inputAccessor = (InputAccessor) objOnPause;
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            int i5 = MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
            final onSetRating iconCompatParcelizer = onsetshufflemodeRemoteActionCompatParcelizer != null ? onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer() : null;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final InputAccessor inputAccessor2 = (InputAccessor) objOnPause2;
            int i6 = i3;
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleoddname2, BitmapDescriptorFactory.HUE_RED, 1, null);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddname4 = onInflate.read(getFrameEndSchedulerui.IconCompatParcelizer$default(onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameIconCompatParcelizer$default, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null)), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _handleOddName _handleoddname5 = _handleoddname2;
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(setDrawerElevation.INSTANCE.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver()), BitmapDescriptorFactory.HUE_RED, 1, null);
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
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            pushChargedEvent.write(multiplyFft.AudioAttributesCompatParcelizer(-363089364, true, new MagicModuleSubmissionRequestBody() { // from class: o.GeofencingApi
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GeofenceStatusCodes.AudioAttributesCompatParcelizer(getinitialtrigger, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), null, multiplyFft.AudioAttributesCompatParcelizer(-261719378, true, new MagicModuleSubmissionRequestBody() { // from class: o.GeofenceGeofenceTransition
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GeofenceStatusCodes.AudioAttributesCompatParcelizer(iconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), multiplyFft.AudioAttributesCompatParcelizer(1093706903, true, new getModuleData() { // from class: o.getTriggeringGeofences
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return GeofenceStatusCodes.read(getinitialtrigger, getcreatedondatems2, getcreatedondatems, getanswermap, inputAccessor, inputAccessor2, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), 0L, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), _handleunrecognizedcharacterescape2, 1576326, 34);
            final parseDouble parsedouble = _qbuf.read(Boolean.valueOf(getinitialtrigger.getAudioAttributesImplApi21Parcelizer()), _handleunrecognizedcharacterescape2, 0);
            _handleOddName _handleoddnameIconCompatParcelizer$default3 = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            List<String> listWrite = getinitialtrigger.write();
            int audioAttributesCompatParcelizer = getinitialtrigger.getAudioAttributesCompatParcelizer();
            String iconCompatParcelizer2 = getinitialtrigger.getIconCompatParcelizer();
            zzhs write = getinitialtrigger.getWrite();
            boolean audioAttributesImplApi21Parcelizer = getinitialtrigger.getAudioAttributesImplApi21Parcelizer();
            zzhx zzhxVar = getinitialtrigger.getMediaBrowserCompatCustomActionResultReceiver() ? zzhx.write : zzhx.RemoteActionCompatParcelizer;
            boolean z = (i6 & 57344) == 16384;
            Object objOnPause3 = _handleunrecognizedcharacterescape2.onPause();
            if (z || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.getGeofenceTransition
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return GeofenceStatusCodes.write(getanswermap2, ((Integer) obj).intValue());
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause3);
            }
            getAnswerMap getanswermap4 = (getAnswerMap) objOnPause3;
            boolean z2 = (i6 & 7168) == 2048;
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape2.AudioAttributesCompatParcelizer(parsedouble);
            Object objOnPause4 = _handleunrecognizedcharacterescape2.onPause();
            if ((zAudioAttributesCompatParcelizer2 | z2) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.GeofencingEvent
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return GeofenceStatusCodes.RemoteActionCompatParcelizer(getanswermap, parsedouble);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause4);
            }
            getZIndex.AudioAttributesCompatParcelizer(_handleoddnameIconCompatParcelizer$default3, listWrite, audioAttributesCompatParcelizer, iconCompatParcelizer2, true, write, audioAttributesImplApi21Parcelizer, zzhxVar, getanswermap4, (getCreatedOnDateMs) objOnPause4, _handleunrecognizedcharacterescape2, 24582);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (!getinitialtrigger.getMediaBrowserCompatItemReceiver()) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(961870148);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(969060877);
                int i7 = i6 >> 12;
                int i8 = 57344 & i7;
                setCircularRegion.write((_handleOddName) null, currentLocationRequestBuilder, getcreatedondatems3, getcreatedondatems2, getcreatedondatems4, getanswermap3, _handleunrecognizedcharacterescape2, (i7 & 458752) | i8 | ((i6 >> 9) & 7168) | ((i6 >> 3) & 112) | ((i6 >> 15) & 896), 1);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname5;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getTriggeringLocation
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GeofenceStatusCodes.read(_handleoddname3, getinitialtrigger, currentLocationRequestBuilder, getanswermap, getanswermap2, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getanswermap3, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final boolean read(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final boolean write(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getInitialTrigger getinitialtrigger, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-363089364, i, -1, "com.marrow2.ui.schema.schemaReview.ui.SchemeReview.<anonymous>.<anonymous>.<anonymous> (SchemaReview.kt:91)");
            }
            String strRemoteActionCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(getinitialtrigger.getAudioAttributesImplBaseParcelizer(), singleArgCreatorDefaultsToProperties.read(R.string.btn_review_module, _handleunrecognizedcharacterescape, 6));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strRemoteActionCompatParcelizer, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0L, null, null, null, 0L, null, null, 0L, paramName.INSTANCE.read(), false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0, 48, 63482);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-261719378, i, -1, "com.marrow2.ui.schema.schemaReview.ui.SchemeReview.<anonymous>.<anonymous>.<anonymous> (SchemaReview.kt:98)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(onsetrating);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.hasError
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return GeofenceStatusCodes.RemoteActionCompatParcelizer(onsetrating);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            FusedLocationProviderApi fusedLocationProviderApi = FusedLocationProviderApi.IconCompatParcelizer;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause, null, false, null, FusedLocationProviderApi.read(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(onSetRating onsetrating) {
        if (onsetrating != null) {
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final getInitialTrigger getinitialtrigger, final getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, final getAnswerMap getanswermap, InputAccessor inputAccessor, final InputAccessor inputAccessor2, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1093706903, i, -1, "com.marrow2.ui.schema.schemaReview.ui.SchemeReview.<anonymous>.<anonymous>.<anonymous> (SchemaReview.kt:106)");
            }
            WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = WindowInsetsCompatImpl30.INSTANCE.read();
            _skipWSOrEnd.write writeVarAudioAttributesImplApi21Parcelizer = _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandler = setValue.read(mediaBrowserCompatItemReceiver, writeVarAudioAttributesImplApi21Parcelizer, _handleunrecognizedcharacterescape, 54);
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
            resetAsNaN.write(hasId.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(Boolean.FALSE), multiplyFft.AudioAttributesCompatParcelizer(-1706663135, true, new MagicModuleSubmissionRequestBody() { // from class: o.getGeofences
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GeofenceStatusCodes.IconCompatParcelizer(getinitialtrigger, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, ContentReference.write | 48);
            String str = singleArgCreatorDefaultsToProperties.read(R.string.show_answers, _handleunrecognizedcharacterescape, 6);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.AudioAttributesImplBaseParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65530);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            boolean mediaBrowserCompatItemReceiver2 = getinitialtrigger.getMediaBrowserCompatItemReceiver();
            boolean z = read((InputAccessor<Boolean>) inputAccessor);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.addGeofence
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return GeofenceStatusCodes.AudioAttributesCompatParcelizer(getcreatedondatems, inputAccessor2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            onVisibilityChanged.AudioAttributesCompatParcelizer(null, mediaBrowserCompatItemReceiver2, z, 0L, 0L, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0, 25);
            JacksonInjectValue.IconCompatParcelizer(getcreatedondatems2, null, !write((InputAccessor<Boolean>) inputAccessor2), null, multiplyFft.AudioAttributesCompatParcelizer(-1514114693, true, new MagicModuleSubmissionRequestBody() { // from class: o.GeofencingRequestBuilder
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GeofenceStatusCodes.IconCompatParcelizer(getinitialtrigger, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 10);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getInitialTrigger getinitialtrigger, getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1706663135, i, -1, "com.marrow2.ui.schema.schemaReview.ui.SchemeReview.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaReview.kt:111)");
            }
            boolean audioAttributesImplApi21Parcelizer = getinitialtrigger.getAudioAttributesImplApi21Parcelizer();
            getScope getscope = getScope.RemoteActionCompatParcelizer;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            long audioAttributesCompatParcelizer = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            long onRemoveQueueItemAt = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRemoveQueueItemAt();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            forScope.write(audioAttributesImplApi21Parcelizer, getanswermap, null, false, null, getscope.AudioAttributesCompatParcelizer(onRemoveQueueItemAt, audioAttributesCompatParcelizer, 1.0f, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnStop(), r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 1.0f, 0L, 0L, 0L, 0L, _handleunrecognizedcharacterescape, 196992, getScope.read, 960), _handleunrecognizedcharacterescape, 0, 28);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems, InputAccessor inputAccessor) {
        if (!write((InputAccessor<Boolean>) inputAccessor)) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getInitialTrigger getinitialtrigger, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long onFastForward;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1514114693, i, -1, "com.marrow2.ui.schema.schemaReview.ui.SchemeReview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaReview.kt:141)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.grid_view_rv, _handleunrecognizedcharacterescape, 6);
            if (getinitialtrigger.getMediaBrowserCompatCustomActionResultReceiver()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(929701353);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                onFastForward = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRewind();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(929702603);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                onFastForward = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnFastForward();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, onFastForward, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, parseDouble parsedouble) {
        getanswermap.invoke(Boolean.valueOf(!read((parseDouble<Boolean>) parsedouble)));
        return getShowPopup.INSTANCE;
    }

    private static final boolean read(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, getInitialTrigger getinitialtrigger, CurrentLocationRequestBuilder currentLocationRequestBuilder, getAnswerMap getanswermap, getAnswerMap getanswermap2, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, getAnswerMap getanswermap3, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, getinitialtrigger, currentLocationRequestBuilder, (getAnswerMap<? super Boolean, getShowPopup>) getanswermap, (getAnswerMap<? super Integer, getShowPopup>) getanswermap2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (getAnswerMap<? super getMediaMimeType, getShowPopup>) getanswermap3, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}

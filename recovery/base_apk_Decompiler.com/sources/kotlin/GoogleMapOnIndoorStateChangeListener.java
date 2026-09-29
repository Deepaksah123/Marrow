package kotlin;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import kotlin.lambdamaybeNotifySurfaceSizeChanged27;
import kotlin.setAnalyticsCollector;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class GoogleMapOnIndoorStateChangeListener {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final Uri uri, final String str, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(537406420);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(uri) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 16384 : 8192;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 9363) != 9362, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(537406420, i5, -1, "com.marrow2.ui.settings.kyc.upload.DynamicImageUploadBox (DynamicImageUploadBox.kt:50)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(isAdded.AudioAttributesCompatParcelizer$default(getParentFragment.AudioAttributesCompatParcelizer$default(_handleoddname3, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(22.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(200.0f), 1, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z = (57344 & i5) == 16384;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.GoogleMapOnInfoWindowClickListener
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return GoogleMapOnIndoorStateChangeListener.AudioAttributesCompatParcelizer(getcreatedondatems2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default2);
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
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, Uri.EMPTY)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1933541264);
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default3 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default3, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), null, 2, null);
                withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default);
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
                NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
                Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
                lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27RemoteActionCompatParcelizer = new lambdamaybeNotifySurfaceSizeChanged27.read(context).read(uri).AudioAttributesCompatParcelizer(900, 900).RemoteActionCompatParcelizer(new lambdaupdatePlaybackInfo19((byte) 0)).RemoteActionCompatParcelizer();
                setAnalyticsCollector.Companion companion = setAnalyticsCollector.INSTANCE;
                ViewFactoryHolder.write(ExoPlayerBuilderExternalSyntheticLambda12.read(lambdamaybenotifysurfacesizechanged27RemoteActionCompatParcelizer, setAnalyticsCollector.Companion.RemoteActionCompatParcelizer(context), null, _handleunrecognizedcharacterescapeWrite, 4), "Thumbnail Image", getParentFragment.write$default(getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), assignParameter.IconCompatParcelizer(30.0f), BitmapDescriptorFactory.HUE_RED, 2, null), null, getContentType.INSTANCE.IconCompatParcelizer(), BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, 25008, 104);
                isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_delete_red, _handleunrecognizedcharacterescapeWrite, 6);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setdrawerelevation2.AudioAttributesCompatParcelizer(isAdded.AudioAttributesCompatParcelizer$default((_handleOddName) _handleOddName.INSTANCE, (_skipWSOrEnd) null, false, 3, (Object) null), _skipWSOrEnd.INSTANCE.IconCompatParcelizer());
                boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, Uri.EMPTY);
                boolean z2 = (i5 & 7168) == 2048;
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.onInfoWindowClick
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return GoogleMapOnIndoorStateChangeListener.write(getcreatedondatems);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                }
                ViewFactoryHolder.write(isannotationbundleRemoteActionCompatParcelizer, "", getParentFragment.AudioAttributesCompatParcelizer$default(getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameAudioAttributesCompatParcelizer, !zRemoteActionCompatParcelizer, null, null, null, (getCreatedOnDateMs) objOnPause2, 14, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), assignParameter.IconCompatParcelizer(8.0f), 3, null), null, null, BitmapDescriptorFactory.HUE_RED, null, _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 48, 120);
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1931479516);
                _handleOddName _handleoddnameIconCompatParcelizer = setdrawerelevation.IconCompatParcelizer(_handleOddName.INSTANCE);
                Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getAnswerMap() { // from class: o.onIndoorLevelActivated
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return GoogleMapOnIndoorStateChangeListener.read((findSetterInfo) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                }
                setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(_handleoddnameIconCompatParcelizer, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescapeWrite, 48);
                _handleOddName _handleoddnameIconCompatParcelizer2 = getParentFragment.IconCompatParcelizer(setdrawerelevation.IconCompatParcelizer(_handleOddName.INSTANCE), assignParameter.IconCompatParcelizer(10.0f));
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                _handleOddName _handleoddnameIconCompatParcelizer3 = getFrameEndSchedulerui.IconCompatParcelizer(_handleoddnameIconCompatParcelizer2, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(12.0f)));
                withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer3);
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
                NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation3 = setDrawerElevation.INSTANCE;
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                _handleOddName _handleoddnameIconCompatParcelizer4 = getParentFragment.IconCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f));
                deserializeWithObjectId deserializewithobjectidRemoteActionCompatParcelizer = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _copyCurrentStringValue.IconCompatParcelizer(str, _handleoddnameIconCompatParcelizer4, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidRemoteActionCompatParcelizer, _handleunrecognizedcharacterescape2, ((i5 >> 6) & 14) | 48, 0, 65016);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname4 = _handleoddname2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.onIndoorBuildingFocused
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return GoogleMapOnIndoorStateChangeListener.AudioAttributesCompatParcelizer(_handleoddname4, uri, str, getcreatedondatems, getcreatedondatems2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        long j = -1;
        findSetterInfo.RemoteActionCompatParcelizer$default(findsetterinfo, switchToNext.INSTANCE.RemoteActionCompatParcelizer(), 0L, 0L, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(20.0f)) << 32) | (((long) Float.floatToRawIntBits(20.0f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), new findValueInstantiator(2.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, setCurrentLength.INSTANCE.write(new float[]{10.0f, 10.0f}, 2.0f), 14, null), BitmapDescriptorFactory.HUE_RED, null, 0, 230, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, Uri uri, String str, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, uri, str, getcreatedondatems, getcreatedondatems2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}

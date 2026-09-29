package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class handleProcessingError {
    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final int i, final List<? extends getLastUpdatedTimeMs> list, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2, final int i3) {
        _handleOddName _handleoddname2;
        int i4;
        _handleOddName _handleoddname3;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-175568170);
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
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        int i6 = i4;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 1171) != 1170, i6 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleoddname3 = i5 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-175568170, i6, -1, "com.marrow2.ui.video.revision_video.listing.RevisionListingTabs (RevisionListingTabs.kt:25)");
            }
            if (!list.isEmpty()) {
                Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = Boolean.valueOf(DeviceProperties.isPhone(context) && CmcdConfigurationRequestConfig.MediaBrowserCompatItemReceiver(context));
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                boolean zBooleanValue = ((Boolean) objOnPause).booleanValue();
                FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer = multiplyFft.AudioAttributesCompatParcelizer(-1309823011, true, new getModuleData() { // from class: o.nestedMaplambda1
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return handleProcessingError.RemoteActionCompatParcelizer(i, (List) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescapeWrite, 54);
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
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
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = setDrawerElevation.INSTANCE.AudioAttributesCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(1.0f)), _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer());
                float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                updatePositions.read(_handleoddnameAudioAttributesCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), fIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescapeWrite, RendererCapabilities.MODE_SUPPORT_MASK, 8);
                if (zBooleanValue) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-97419652);
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddname3, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), null, false, 3, null), null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15);
                    int iAudioAttributesCompatParcelizer = lambdadecodeBitmap1.AudioAttributesCompatParcelizer(i, list.size(), "revision_listing_scrollable", _handleunrecognizedcharacterescapeWrite, ((i6 >> 3) & 14) | RendererCapabilities.MODE_SUPPORT_MASK);
                    long jAudioAttributesImplBaseParcelizer = switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer();
                    MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                    acceptsPaddingOnRead.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, _handleoddnameAudioAttributesCompatParcelizer2, jAudioAttributesImplBaseParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), fastIntegerMathUInt128AudioAttributesCompatParcelizer, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) null, multiplyFft.AudioAttributesCompatParcelizer(1466470581, true, new MagicModuleSubmissionRequestBody() { // from class: o.toMarrowResponse
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return handleProcessingError.write(i, list, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 12804480, 64);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-96677419);
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer3 = VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(_handleoddname3, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15);
                    int iAudioAttributesCompatParcelizer2 = lambdadecodeBitmap1.AudioAttributesCompatParcelizer(i, list.size(), "revision_listing_fixed", _handleunrecognizedcharacterescapeWrite, ((i6 >> 3) & 14) | RendererCapabilities.MODE_SUPPORT_MASK);
                    long j = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read();
                    MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
                    acceptsPaddingOnRead.read(iAudioAttributesCompatParcelizer2, _handleoddnameAudioAttributesCompatParcelizer3, j, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3(), fastIntegerMathUInt128AudioAttributesCompatParcelizer, null, multiplyFft.AudioAttributesCompatParcelizer(798956884, true, new MagicModuleSubmissionRequestBody() { // from class: o.toMarrowResponselambda5
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return handleProcessingError.AudioAttributesCompatParcelizer(i, list, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 1597440, 32);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                }
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
                if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
                    final _handleOddName _handleoddname4 = _handleoddname3;
                    magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.nestedMaplambda00
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return handleProcessingError.IconCompatParcelizer(_handleoddname4, i, list, getanswermap, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                        }
                    };
                    releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(magicModuleSubmissionRequestBody);
                }
                return;
            }
        }
        releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname3;
            magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.toMarrowResponselambda1
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return handleProcessingError.write(_handleoddname5, i, list, getanswermap, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            };
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(magicModuleSubmissionRequestBody);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, List list, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        long jAudioAttributesImplApi26Parcelizer;
        float fIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(list, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1309823011, i2, -1, "com.marrow2.ui.video.revision_video.listing.RevisionListingTabs.<anonymous> (RevisionListingTabs.kt:38)");
        }
        int i3 = 0;
        for (Object obj : list) {
            if (i3 < 0) {
                IntermediateLoginResponseBody.read();
            }
            _reportBase64UnexpectedPadding _reportbase64unexpectedpadding = (_reportBase64UnexpectedPadding) obj;
            boolean z = i3 == i;
            Base64Variant base64Variant = Base64Variant.write;
            _handleOddName _handleoddnameAudioAttributesImplApi26Parcelizer = isAdded.AudioAttributesImplApi26Parcelizer(Base64Variant.write.read(_handleOddName.INSTANCE, _reportbase64unexpectedpadding), _reportbase64unexpectedpadding.getWrite());
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(734971402);
                jAudioAttributesImplApi26Parcelizer = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(735045089);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                jAudioAttributesImplApi26Parcelizer = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).get_init_lambda3();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            long j = jAudioAttributesImplApi26Parcelizer;
            if (z) {
                fIconCompatParcelizer = assignParameter.IconCompatParcelizer(3.0f);
            } else {
                fIconCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
            }
            base64Variant.write(_handleoddnameAudioAttributesImplApi26Parcelizer, fIconCompatParcelizer, j, _handleunrecognizedcharacterescape, Base64Variant.RemoteActionCompatParcelizer << 9, 0);
            i3++;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(int i, List list, getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1466470581, i2, -1, "com.marrow2.ui.video.revision_video.listing.RevisionListingTabs.<anonymous>.<anonymous> (RevisionListingTabs.kt:84)");
            }
            read(i, list, getanswermap, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, List list, getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(798956884, i2, -1, "com.marrow2.ui.video.revision_video.listing.RevisionListingTabs.<anonymous>.<anonymous> (RevisionListingTabs.kt:93)");
            }
            read(i, list, getanswermap, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private static final void read(final int i, final List<? extends getLastUpdatedTimeMs> list, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1808637473);
        int i3 = (i2 & 6) == 0 ? (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 256 : 128;
        }
        int i4 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i4 & 147) != 146, i4 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1808637473, i4, -1, "com.marrow2.ui.video.revision_video.listing.TabsContent (RevisionListingTabs.kt:108)");
            }
            int i5 = 0;
            for (Object obj : list) {
                if (i5 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                write(i5, (getLastUpdatedTimeMs) obj, i == i5, getanswermap, _handleunrecognizedcharacterescapeWrite, (i4 << 3) & 7168);
                i5++;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.toMarrowResponselambda3
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return handleProcessingError.AudioAttributesCompatParcelizer(i, list, getanswermap, i2, (_handleUnrecognizedCharacterEscape) obj2);
                }
            });
        }
    }

    private static final void write(final int i, final getLastUpdatedTimeMs getlastupdatedtimems, final boolean z, final getAnswerMap<? super Integer, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-15477428);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(getlastupdatedtimems.ordinal()) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 1171) != 1170, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-15477428, i3, -1, "com.marrow2.ui.video.revision_video.listing.TabItem (RevisionListingTabs.kt:125)");
            }
            boolean z2 = (i3 & 7168) == 2048;
            boolean z3 = (i3 & 14) == 4;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | z3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.nestedMap
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return handleProcessingError.AudioAttributesCompatParcelizer(getanswermap, i);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            bindItem.AudioAttributesCompatParcelizer(z, (getCreatedOnDateMs) objOnPause, null, false, multiplyFft.AudioAttributesCompatParcelizer(1833127334, true, new MagicModuleSubmissionRequestBody() { // from class: o.toMarrowResponselambda0
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return handleProcessingError.RemoteActionCompatParcelizer(getlastupdatedtimems, z, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), null, null, 0L, 0L, _handleunrecognizedcharacterescape2, ((i3 >> 6) & 14) | CpioConstants.C_ISBLK, 492);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.nestedMaplambda0
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return handleProcessingError.read(i, getlastupdatedtimems, z, getanswermap, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getAnswerMap getanswermap, int i) {
        getanswermap.invoke(Integer.valueOf(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getLastUpdatedTimeMs getlastupdatedtimems, boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long jMediaBrowserCompatItemReceiver;
        deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1833127334, i, -1, "com.marrow2.ui.video.revision_video.listing.TabItem.<anonymous> (RevisionListingTabs.kt:130)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, null, false, 3, null);
            String read = getlastupdatedtimems.getRead();
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(187389464);
                jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(187462934);
                jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            long j = jMediaBrowserCompatItemReceiver;
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(187573945);
                deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(187646578);
                deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            _copyCurrentStringValue.IconCompatParcelizer(read, _handleoddnameRemoteActionCompatParcelizer$default, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 48, 0, 65528);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, int i, List list, getAnswerMap getanswermap, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, i, (List<? extends getLastUpdatedTimeMs>) list, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, int i, List list, getAnswerMap getanswermap, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, i, (List<? extends getLastUpdatedTimeMs>) list, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(int i, getLastUpdatedTimeMs getlastupdatedtimems, boolean z, getAnswerMap getanswermap, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(i, getlastupdatedtimems, z, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, List list, getAnswerMap getanswermap, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(i, list, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}

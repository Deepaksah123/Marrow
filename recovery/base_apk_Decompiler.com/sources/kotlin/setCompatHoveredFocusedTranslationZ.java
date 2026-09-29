package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import java.util.Locale;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setCompatHoveredFocusedTranslationZ {

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[readBlockToCache.values().length];
            try {
                iArr[readBlockToCache.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[readBlockToCache.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
            int[] iArr2 = new int[setDouble.values().length];
            try {
                iArr2[setDouble.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[setDouble.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[setDouble.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[setDouble.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            RemoteActionCompatParcelizer = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(int i) {
        return i;
    }

    public static final void write(_handleOddName _handleoddname, final boolean z, final boolean z2, final setDouble setdouble, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super Boolean, getShowPopup> getanswermap, final getAnswerMap<? super setDouble, getShowPopup> getanswermap2, final getAnswerMap<? super AppMeasurementEventInterceptor, getShowPopup> getanswermap3, final getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup> getanswermap4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, readBlockToCache readblocktocache, final boolean z3, final boolean z4, final getAnswerMap<? super String, getShowPopup> getanswermap5, final getAnswerMap<? super AppMeasurementConditionalUserProperty, getShowPopup> getanswermap6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname2;
        readBlockToCache readblocktocache2;
        final setDouble setdouble2;
        toMagicModuleMetaRepoModel.write(setdouble, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(getanswermap4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getanswermap5, "");
        toMagicModuleMetaRepoModel.write(getanswermap6, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-158416497);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(setdouble.ordinal()) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 536870912 : 268435456;
        }
        int i7 = i4;
        int i8 = i3 & 1024;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readblocktocache == null ? -1 : readblocktocache.ordinal()) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap5) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap6) ? 16384 : 8192;
        }
        int i9 = i5;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i7 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true, i7 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
            readblocktocache2 = readblocktocache;
        } else {
            _handleOddName _handleoddname3 = i6 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            readBlockToCache readblocktocache3 = i8 != 0 ? readBlockToCache.AudioAttributesImplApi26Parcelizer : readblocktocache;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-158416497, i7, i9, "com.marrow2.ui.test.testplay.ui.TestBottomBar (TestBottomBar.kt:43)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname3);
            _handleOddName _handleoddname4 = _handleoddname3;
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
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.CheckableImageButton
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(setCompatHoveredFocusedTranslationZ.RemoteActionCompatParcelizer(((Integer) obj).intValue()));
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            setDropDownVerticalOffset setdropdownverticaloffsetWrite = AppCompatRatingBar.write((SwitchCompat) null, (getAnswerMap) objOnPause, 1, (Object) null);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.setContentPaddingRelative
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(setCompatHoveredFocusedTranslationZ.write(((Integer) obj).intValue()));
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final readBlockToCache readblocktocache4 = readblocktocache3;
            readBlockToCache readblocktocache5 = readblocktocache3;
            AppCompatPopupWindow.AudioAttributesCompatParcelizer(drawerLayoutSavedState, z, null, setdropdownverticaloffsetWrite, AppCompatRatingBar.AudioAttributesCompatParcelizer((SwitchCompat) null, (getAnswerMap) objOnPause2, 1, (Object) null), null, multiplyFft.AudioAttributesCompatParcelizer(-1817144319, true, new getModuleData() { // from class: o.FloatingActionButtonBehavior
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setCompatHoveredFocusedTranslationZ.RemoteActionCompatParcelizer(readblocktocache4, getanswermap3, z4, getanswermap5, getanswermap4, getcreatedondatems2, (setSupportImageTintMode) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, (i7 & 112) | 1600518, 18);
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.setCompatHoveredFocusedTranslationZResource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCompatHoveredFocusedTranslationZ.read();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = getParentFragment.AudioAttributesCompatParcelizer(splitRtspMessageBody.write(_handleoddnameIconCompatParcelizer$default, (getCreatedOnDateMs) objOnPause3), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(4.0f), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(4.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
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
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            boolean z5 = (57344 & i7) == 16384;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z5 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.setCustomSize
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCompatHoveredFocusedTranslationZ.write(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause4, null, false, null, multiplyFft.AudioAttributesCompatParcelizer(-144784423, true, new MagicModuleSubmissionRequestBody() { // from class: o.setCompatPressedTranslationZ
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCompatHoveredFocusedTranslationZ.write(z, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, CpioConstants.C_ISBLK, 14);
            boolean z6 = (458752 & i7) == 131072;
            boolean z7 = (i7 & 896) == 256;
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z6 | z7) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.setMaxImageSize
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCompatHoveredFocusedTranslationZ.read(getanswermap, z2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause5, null, false, null, multiplyFft.AudioAttributesCompatParcelizer(-312070078, true, new MagicModuleSubmissionRequestBody() { // from class: o.setExpandedComponentIdHint
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCompatHoveredFocusedTranslationZ.IconCompatParcelizer(z2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, CpioConstants.C_ISBLK, 14);
            isInLayout.RemoteActionCompatParcelizer(getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            _handleOddName _handleoddnameAudioAttributesImplApi26Parcelizer = isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(150.0f));
            getReturnTransition getreturntransitionWrite$default = getParentFragment.write$default(BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(12.0f), 1, null);
            boolean z8 = (i9 & 112) == 32;
            boolean z9 = (i9 & 57344) == 16384;
            boolean z10 = (3670016 & i7) == 1048576;
            boolean z11 = (i7 & 7168) == 2048;
            Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z8 | z9 | z10) || z11) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                setdouble2 = setdouble;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                objOnPause6 = new getCreatedOnDateMs() { // from class: o.setCompatPressedTranslationZResource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCompatHoveredFocusedTranslationZ.AudioAttributesCompatParcelizer(z3, getanswermap6, getanswermap2, setdouble2);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause6);
            } else {
                setdouble2 = setdouble;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            }
            CloseImageView.AudioAttributesCompatParcelizer((getCreatedOnDateMs) objOnPause6, _handleoddnameAudioAttributesImplApi26Parcelizer, false, null, null, null, null, null, getreturntransitionWrite$default, multiplyFft.AudioAttributesCompatParcelizer(-239824891, true, new getModuleData() { // from class: o.setTranslationZ
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setCompatHoveredFocusedTranslationZ.IconCompatParcelizer(setdouble2, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape2, 905969712, 252);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            readblocktocache2 = readblocktocache5;
            _handleoddname2 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final readBlockToCache readblocktocache6 = readblocktocache2;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ShapeableImageView
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCompatHoveredFocusedTranslationZ.RemoteActionCompatParcelizer(_handleoddname2, z, z2, setdouble, getcreatedondatems, getanswermap, getanswermap2, getanswermap3, getanswermap4, getcreatedondatems2, readblocktocache6, z3, z4, getanswermap5, getanswermap6, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(readBlockToCache readblocktocache, final getAnswerMap getanswermap, final boolean z, final getAnswerMap getanswermap2, final getAnswerMap getanswermap3, getCreatedOnDateMs getcreatedondatems, setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setsupportimagetintmode, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1817144319, i, -1, "com.marrow2.ui.test.testplay.ui.TestBottomBar.<anonymous>.<anonymous> (TestBottomBar.kt:49)");
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = isAdded.AudioAttributesCompatParcelizer$default(getParentFragment.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null), assignParameter.IconCompatParcelizer(16.0f)), (_skipWSOrEnd) null, false, 3, (Object) null);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new getCreatedOnDateMs() { // from class: o.setShadowPaddingEnabled
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setCompatHoveredFocusedTranslationZ.write();
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        _handleOddName _handleoddnameWrite = splitRtspMessageBody.write(_handleoddnameAudioAttributesCompatParcelizer$default, (getCreatedOnDateMs) objOnPause);
        withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
        int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
        _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
        _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite);
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
        int i2 = write.write[readblocktocache.ordinal()];
        int i3 = (i2 == 1 || i2 == 2) ? R.string.btn_custom_module_test_mode_bottom_dlg_submit : R.string.submit_test;
        int i4 = write.write[readblocktocache.ordinal()];
        int i5 = (i4 == 1 || i4 == 2) ? R.string.btn_custom_module_test_mode_bottom_dlg_continue_later : R.string.discard_test;
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new getCreatedOnDateMs() { // from class: o.FloatingActionButtonBaseBehavior
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setCompatHoveredFocusedTranslationZ.RemoteActionCompatParcelizer(getanswermap);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        CheckableImageButtonSavedState.IconCompatParcelizer(null, R.drawable.grid_view, R.string.btn_review_test_sheet, false, (getCreatedOnDateMs) objOnPause2, _handleunrecognizedcharacterescape, 432, 9);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap2);
        boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap3);
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new getCreatedOnDateMs() { // from class: o.BaselineLayout
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setCompatHoveredFocusedTranslationZ.IconCompatParcelizer(z, getanswermap2, getanswermap3);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        CheckableImageButtonSavedState.IconCompatParcelizer(null, R.drawable.check, i3, z, (getCreatedOnDateMs) objOnPause3, _handleunrecognizedcharacterescape, 48, 1);
        CheckableImageButtonSavedState.IconCompatParcelizer(null, R.drawable.ic_close_grey_thick, i5, false, getcreatedondatems, _handleunrecognizedcharacterescape, 48, 9);
        _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap) {
        getanswermap.invoke(AppMeasurementEventInterceptor.IconCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, getAnswerMap getanswermap, getAnswerMap getanswermap2) {
        if (!z) {
            getanswermap.invoke("left_menu");
        } else {
            getanswermap2.invoke(AppMeasurementDynamiteService.RemoteActionCompatParcelizer);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long onSetRating;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-144784423, i, -1, "com.marrow2.ui.test.testplay.ui.TestBottomBar.<anonymous>.<anonymous>.<anonymous> (TestBottomBar.kt:101)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(z ? R.drawable.ic_close_blue : R.drawable.icv_menu, _handleunrecognizedcharacterescape, 0);
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1698868506);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                onSetRating = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1698867283);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                onSetRating = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, onSetRating, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, boolean z) {
        getanswermap.invoke(Boolean.valueOf(!z));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long onSetRating;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-312070078, i, -1, "com.marrow2.ui.test.testplay.ui.TestBottomBar.<anonymous>.<anonymous>.<anonymous> (TestBottomBar.kt:112)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.star, _handleunrecognizedcharacterescape, 6);
            if (z) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(748372207);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                onSetRating = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromUri();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(748373430);
                MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
                onSetRating = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            value.read(isannotationbundleRemoteActionCompatParcelizer, null, null, onSetRating, _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(boolean z, getAnswerMap getanswermap, getAnswerMap getanswermap2, setDouble setdouble) {
        if (z) {
            getanswermap.invoke(AppMeasurementConditionalUserProperty.write);
        } else {
            getanswermap2.invoke(setdouble);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setDouble setdouble, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        String upperCase;
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-239824891, i, -1, "com.marrow2.ui.test.testplay.ui.TestBottomBar.<anonymous>.<anonymous>.<anonymous> (TestBottomBar.kt:133)");
            }
            int i2 = write.RemoteActionCompatParcelizer[setdouble.ordinal()];
            if (i2 == 1) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1456518960);
                upperCase = singleArgCreatorDefaultsToProperties.read(R.string.skip, _handleunrecognizedcharacterescape, 6).toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (i2 == 2) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1456522224);
                upperCase = singleArgCreatorDefaultsToProperties.read(R.string.next, _handleunrecognizedcharacterescape, 6).toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (i2 == 3) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1456525744);
                upperCase = singleArgCreatorDefaultsToProperties.read(R.string.complete, _handleunrecognizedcharacterescape, 6).toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (i2 != 4) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(1456515824);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1456529008);
                upperCase = singleArgCreatorDefaultsToProperties.read(R.string.done, _handleunrecognizedcharacterescape, 6).toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, _handleunrecognizedcharacterescape, 0, 0, 131070);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, boolean z, boolean z2, setDouble setdouble, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, getAnswerMap getanswermap2, getAnswerMap getanswermap3, getAnswerMap getanswermap4, getCreatedOnDateMs getcreatedondatems2, readBlockToCache readblocktocache, boolean z3, boolean z4, getAnswerMap getanswermap5, getAnswerMap getanswermap6, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, z, z2, setdouble, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Boolean, getShowPopup>) getanswermap, (getAnswerMap<? super setDouble, getShowPopup>) getanswermap2, (getAnswerMap<? super AppMeasurementEventInterceptor, getShowPopup>) getanswermap3, (getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup>) getanswermap4, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, readblocktocache, z3, z4, (getAnswerMap<? super String, getShowPopup>) getanswermap5, (getAnswerMap<? super AppMeasurementConditionalUserProperty, getShowPopup>) getanswermap6, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}

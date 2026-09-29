package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import kotlin.getEndTimestamp;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setLabelVisibilityMode {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final void read(_handleOddName _handleoddname, final getHeader getheader, final MagicModuleSubmissionRequestBody<? super String, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final getAnswerMap<? super String, getShowPopup> getanswermap, final MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody2, final getAnswerMap<? super Integer, getShowPopup> getanswermap2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super Boolean, getShowPopup> getanswermap3, final getAnswerMap<? super setDouble, getShowPopup> getanswermap4, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getAnswerMap<? super Integer, getShowPopup> getanswermap5, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getAnswerMap<? super AppMeasurementEventInterceptor, getShowPopup> getanswermap6, final getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup> getanswermap7, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final MagicModuleSubmissionRequestBody<? super setSingleLine, ? super AppMeasurementConditionalUserProperty, getShowPopup> magicModuleSubmissionRequestBody3, final getAnswerMap<? super String, getShowPopup> getanswermap8, final getAnswerMap<? super AppMeasurementConditionalUserProperty, getShowPopup> getanswermap9, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname2;
        InputAccessor inputAccessor;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        _handleOddName _handleoddname3;
        ?? r7;
        setDrawerElevation setdrawerelevation;
        int i7;
        InputAccessor inputAccessor2;
        toMagicModuleMetaRepoModel.write(getheader, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody2, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(getanswermap4, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getanswermap5, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getanswermap6, "");
        toMagicModuleMetaRepoModel.write(getanswermap7, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody3, "");
        toMagicModuleMetaRepoModel.write(getanswermap8, "");
        toMagicModuleMetaRepoModel.write(getanswermap9, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-61385170);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i;
            i5 = i4 | 6;
        } else {
            i4 = i;
            if ((i4 & 6) == 0) {
                i5 = i4 | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
            } else {
                i5 = i4;
            }
        }
        if ((i4 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getheader) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if ((i4 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i4 & 1572864) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap4) ? 67108864 : 33554432;
        }
        if ((i4 & C.ENCODING_PCM_32BIT) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 536870912 : 268435456;
        }
        int i9 = i5;
        if ((i2 & 6) == 0) {
            i6 = i2 | (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap5) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap6) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap7) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap8) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap9) ? 8388608 : 4194304;
        }
        int i10 = i6;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i9 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i9 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
        } else {
            _handleOddName _handleoddname4 = i8 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-61385170, i9, i10, "com.marrow2.ui.test.testplay.ui.TestPlayLayout (TestPlayLayout.kt:61)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            InputAccessor inputAccessor3 = (InputAccessor) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor = inputAccessor3;
                objOnPause2 = available.RemoteActionCompatParcelizer$default(-1, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            } else {
                inputAccessor = inputAccessor3;
            }
            final InputAccessor inputAccessor4 = (InputAccessor) objOnPause2;
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname4);
            _handleOddName _handleoddname5 = _handleoddname4;
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(40.0f), 7, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            setItemActiveIndicatorColor.read(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), getheader.getAudioAttributesCompatParcelizer() == null ? getheader.getRead() : getheader.getAudioAttributesCompatParcelizer().getRead() + getheader.getRead(), getheader.getAudioAttributesCompatParcelizer() == null ? getheader.getOnCommand() : getheader.getAudioAttributesCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), getheader.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), getheader.getRatingCompat(), getheader.read().size(), getheader.getAudioAttributesCompatParcelizer(), getheader.MediaBrowserCompatCustomActionResultReceiver().size(), getheader.write().size(), _handleunrecognizedcharacterescapeWrite, 6, 0);
            int i11 = i9 << 12;
            MaterialCalendarGridView.read(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), getheader.getRead(), getheader.MediaBrowserCompatCustomActionResultReceiver(), getheader.getMediaMetadataCompat(), getheader.getMediaBrowserCompatCustomActionResultReceiver(), getcreatedondatems3, magicModuleSubmissionRequestBody, getanswermap, magicModuleSubmissionRequestBody2, getanswermap2, _handleunrecognizedcharacterescapeWrite, ((i10 << 12) & 458752) | 6 | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (getheader.getWrite()) {
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(-494646574);
                long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(switchToNext.INSTANCE.AudioAttributesCompatParcelizer(), 0.65f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                _handleOddName _handleoddnameIconCompatParcelizer = _parseFloatThatStartsWithPeriod.IconCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), 3.0f);
                boolean z = (i9 & 3670016) == 1048576;
                Object objOnPause3 = _handleunrecognizedcharacterescape3.onPause();
                if (z || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getCreatedOnDateMs() { // from class: o.setItemPosition
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return setLabelVisibilityMode.IconCompatParcelizer(getcreatedondatems);
                        }
                    };
                    _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause3);
                }
                _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(_handleoddnameIconCompatParcelizer, false, null, null, null, (getCreatedOnDateMs) objOnPause3, 15, null);
                setChipSpacingResource setchipspacingresource = setChipSpacingResource.AudioAttributesCompatParcelizer;
                Nulls.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default, null, jAudioAttributesCompatParcelizer$default, 0L, null, BitmapDescriptorFactory.HUE_RED, setChipSpacingResource.write(), _handleunrecognizedcharacterescape3, 1573248, 58);
            } else {
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(-499332658);
            }
            _handleunrecognizedcharacterescape3.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameIconCompatParcelizer2 = _parseFloatThatStartsWithPeriod.IconCompatParcelizer(setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.read()), 6.0f);
            boolean iconCompatParcelizer = getheader.getIconCompatParcelizer();
            setDouble audioAttributesImplApi21Parcelizer = getheader.getAudioAttributesImplApi21Parcelizer();
            boolean write = getheader.getWrite();
            readBlockToCache mediaBrowserCompatCustomActionResultReceiver = getheader.getMediaBrowserCompatCustomActionResultReceiver();
            boolean z2 = getheader.getRead() == getheader.getOnCommand() - 1 && getheader.onCustomAction();
            boolean zOnCustomAction = getheader.onCustomAction();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape3.IconCompatParcelizer(getheader);
            boolean z3 = (i9 & 3670016) == 1048576;
            boolean z4 = (i10 & 3670016) == 1048576;
            Object objOnPause4 = _handleunrecognizedcharacterescape3.onPause();
            if ((z4 || (zIconCompatParcelizer | z3)) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                _handleoddname3 = _handleoddname5;
                r7 = 1;
                setdrawerelevation = setdrawerelevation2;
                i7 = i10;
                final InputAccessor inputAccessor5 = inputAccessor;
                objOnPause4 = new getAnswerMap() { // from class: o.setTextAppearanceActiveBoldEnabled
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setLabelVisibilityMode.read(getheader, getcreatedondatems, getanswermap8, inputAccessor4, inputAccessor5, (String) obj);
                    }
                };
                _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause4);
            } else {
                i7 = i10;
                r7 = 1;
                _handleoddname3 = _handleoddname5;
                setdrawerelevation = setdrawerelevation2;
            }
            int i12 = i7 << 15;
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = _handleunrecognizedcharacterescape3;
            setDrawerElevation setdrawerelevation3 = setdrawerelevation;
            setCompatHoveredFocusedTranslationZ.write(_handleoddnameIconCompatParcelizer2, write, iconCompatParcelizer, audioAttributesImplApi21Parcelizer, getcreatedondatems, getanswermap3, getanswermap4, getanswermap6, getanswermap7, getcreatedondatems4, mediaBrowserCompatCustomActionResultReceiver, z2, !zOnCustomAction, (getAnswerMap<? super String, getShowPopup>) objOnPause4, getanswermap9, _handleunrecognizedcharacterescape6, ((i9 >> 6) & 4186112) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), (i7 >> 9) & 57344, 0);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((InputAccessor<Boolean>) inputAccessor);
            IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescape6.onPause();
            if (iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor2 = inputAccessor;
                iconCompatParcelizerOnPause = new IconCompatParcelizer(inputAccessor2, null);
                _handleunrecognizedcharacterescape6.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
            } else {
                inputAccessor2 = inputAccessor;
            }
            StreamReadException.IconCompatParcelizer(Boolean.valueOf(zAudioAttributesCompatParcelizer), (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescape6, 0);
            if (!AudioAttributesCompatParcelizer((InputAccessor<Boolean>) inputAccessor2) || RemoteActionCompatParcelizer((InputAccessor<Integer>) inputAccessor4) == -1) {
                _handleunrecognizedcharacterescape6.IconCompatParcelizer(-499332658);
            } else {
                _handleunrecognizedcharacterescape6.IconCompatParcelizer(-492243082);
                setDividerInsetEnd.RemoteActionCompatParcelizer(getParentFragment.AudioAttributesCompatParcelizer$default(setdrawerelevation3.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.AudioAttributesCompatParcelizer()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(72.0f), 7, null), singleArgCreatorDefaultsToProperties.read(RemoteActionCompatParcelizer((InputAccessor<Integer>) inputAccessor4), _handleunrecognizedcharacterescape6, 0), (Integer) null, _handleunrecognizedcharacterescape6, 0, 4);
            }
            _handleunrecognizedcharacterescape6.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameIconCompatParcelizer3 = _parseFloatThatStartsWithPeriod.IconCompatParcelizer(_handleOddName.INSTANCE, 8.0f);
            boolean z5 = getheader.getMediaBrowserCompatSearchResultReceiver() instanceof getEndTimestamp.write;
            Object objOnPause5 = _handleunrecognizedcharacterescape6.onPause();
            if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getAnswerMap() { // from class: o.setShifting
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(setLabelVisibilityMode.read(((Integer) obj).intValue()));
                    }
                };
                _handleunrecognizedcharacterescape6.RemoteActionCompatParcelizer(objOnPause5);
            }
            setDropDownVerticalOffset setdropdownverticaloffsetWrite = AppCompatRatingBar.write((SwitchCompat) null, (getAnswerMap) objOnPause5, (int) r7, (Object) null);
            Object objOnPause6 = _handleunrecognizedcharacterescape6.onPause();
            if (objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getAnswerMap() { // from class: o.NavigationBarMenuView
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(setLabelVisibilityMode.AudioAttributesCompatParcelizer(((Integer) obj).intValue()));
                    }
                };
                _handleunrecognizedcharacterescape6.RemoteActionCompatParcelizer(objOnPause6);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape6;
            AppCompatPopupWindow.RemoteActionCompatParcelizer(z5, _handleoddnameIconCompatParcelizer3, setdropdownverticaloffsetWrite, AppCompatRatingBar.AudioAttributesCompatParcelizer((SwitchCompat) null, (getAnswerMap) objOnPause6, (int) r7, (Object) null), null, multiplyFft.AudioAttributesCompatParcelizer(1594106508, r7, new getModuleData() { // from class: o.setTextAppearanceInactive
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setLabelVisibilityMode.AudioAttributesCompatParcelizer(getheader, getcreatedondatems2, getanswermap5, getanswermap7, magicModuleSubmissionRequestBody3, getanswermap8, (setSupportImageTintMode) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape2, 200112, 16);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setTextAppearanceActive
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setLabelVisibilityMode.read(_handleoddname2, getheader, magicModuleSubmissionRequestBody, getanswermap, magicModuleSubmissionRequestBody2, getanswermap2, getcreatedondatems, getanswermap3, getanswermap4, getcreatedondatems2, getanswermap5, getcreatedondatems3, getanswermap6, getanswermap7, getcreatedondatems4, magicModuleSubmissionRequestBody3, getanswermap8, getanswermap9, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final int RemoteActionCompatParcelizer(InputAccessor<Integer> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getHeader getheader, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, InputAccessor inputAccessor, InputAccessor inputAccessor2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "left_menu")) {
            write(inputAccessor, R.string.testCannotSubmitMessage);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "last_question") && getheader.onCustomAction()) {
            write(inputAccessor, R.string.testCannotSubmitLastQuestion);
        }
        if (getheader.getWrite()) {
            getcreatedondatems.invoke();
        }
        RemoteActionCompatParcelizer(inputAccessor2, true);
        getanswermap.invoke(str);
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<Boolean> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (!setLabelVisibilityMode.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
                    return getShowPopup.INSTANCE;
                }
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(4000L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setLabelVisibilityMode.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(InputAccessor<Boolean> inputAccessor, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getHeader getheader, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, getAnswerMap getanswermap2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap3, setSupportImageTintMode setsupportimagetintmode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setsupportimagetintmode, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1594106508, i, -1, "com.marrow2.ui.test.testplay.ui.TestPlayLayout.<anonymous>.<anonymous> (TestPlayLayout.kt:163)");
        }
        setDividerInsetEnd.IconCompatParcelizer((_handleOddName) null, getheader.getRatingCompat(), getheader.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), getheader.getMediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer(), getheader.getRead(), (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup>) getanswermap2, getheader.getAudioAttributesCompatParcelizer(), getheader.write(), (MagicModuleSubmissionRequestBody<? super setSingleLine, ? super AppMeasurementConditionalUserProperty, getShowPopup>) magicModuleSubmissionRequestBody, (getAnswerMap<? super String, getShowPopup>) getanswermap3, _handleunrecognizedcharacterescape, 0, 0, 1);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    private static final void write(InputAccessor<Integer> inputAccessor, int i) {
        inputAccessor.write(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, getHeader getheader, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getAnswerMap getanswermap2, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap3, getAnswerMap getanswermap4, getCreatedOnDateMs getcreatedondatems2, getAnswerMap getanswermap5, getCreatedOnDateMs getcreatedondatems3, getAnswerMap getanswermap6, getAnswerMap getanswermap7, getCreatedOnDateMs getcreatedondatems4, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, getAnswerMap getanswermap8, getAnswerMap getanswermap9, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, getheader, (MagicModuleSubmissionRequestBody<? super String, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (getAnswerMap<? super String, getShowPopup>) getanswermap, (MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup>) magicModuleSubmissionRequestBody2, (getAnswerMap<? super Integer, getShowPopup>) getanswermap2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Boolean, getShowPopup>) getanswermap3, (getAnswerMap<? super setDouble, getShowPopup>) getanswermap4, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getAnswerMap<? super Integer, getShowPopup>) getanswermap5, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getAnswerMap<? super AppMeasurementEventInterceptor, getShowPopup>) getanswermap6, (getAnswerMap<? super AppMeasurementDynamiteService, getShowPopup>) getanswermap7, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (MagicModuleSubmissionRequestBody<? super setSingleLine, ? super AppMeasurementConditionalUserProperty, getShowPopup>) magicModuleSubmissionRequestBody3, (getAnswerMap<? super String, getShowPopup>) getanswermap8, (getAnswerMap<? super AppMeasurementConditionalUserProperty, getShowPopup>) getanswermap9, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}

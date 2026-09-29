package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import java.util.List;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setCornerRadiusResource {
    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final BottomNavigationMenuView bottomNavigationMenuView, final setOnNavigationItemSelectedListener setonnavigationitemselectedlistener, final BottomNavigationView bottomNavigationView, final getAnswerMap<? super Boolean, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getAnswerMap<? super setOnMaskChangedListener, getShowPopup> getanswermap2, final getAnswerMap<? super getMediaMimeType, getShowPopup> getanswermap3, final MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final getAnswerMap<? super String, getShowPopup> getanswermap4, final getAnswerMap<? super getMediaMimeType, getShowPopup> getanswermap5, final getCreatedOnDateMs<getShowPopup> getcreatedondatems5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname2;
        String mediaBrowserCompatItemReceiver;
        String mediaBrowserCompatItemReceiver2;
        toMagicModuleMetaRepoModel.write(bottomNavigationMenuView, "");
        toMagicModuleMetaRepoModel.write(setonnavigationitemselectedlistener, "");
        toMagicModuleMetaRepoModel.write(bottomNavigationView, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        toMagicModuleMetaRepoModel.write(getanswermap3, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getanswermap4, "");
        toMagicModuleMetaRepoModel.write(getanswermap5, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems5, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1543730951);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(bottomNavigationMenuView) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(setonnavigationitemselectedlistener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(bottomNavigationView) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap3) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap5) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems5) ? 16384 : 8192;
        }
        int i8 = i5;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true, i7 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
        } else {
            _handleOddName _handleoddname3 = i6 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1543730951, i7, i8, "com.marrow2.ui.test.testReview.ui.MainReview (MainReview.kt:65)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(bottomNavigationView);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setonnavigationitemselectedlistener);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                InputAccessor inputAccessorRemoteActionCompatParcelizer$default = available.RemoteActionCompatParcelizer$default(Boolean.valueOf((bottomNavigationView.getIconCompatParcelizer() == getMediaMimeType.AudioAttributesImplBaseParcelizer && ((mediaBrowserCompatItemReceiver = bottomNavigationView.getMediaBrowserCompatItemReceiver()) == null || mediaBrowserCompatItemReceiver.length() == 0) && setonnavigationitemselectedlistener.getWrite() == getMediaMimeType.AudioAttributesImplBaseParcelizer && ((mediaBrowserCompatItemReceiver2 = setonnavigationitemselectedlistener.getMediaBrowserCompatItemReceiver()) == null || mediaBrowserCompatItemReceiver2.length() == 0)) ? false : true), null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(inputAccessorRemoteActionCompatParcelizer$default);
                objOnPause = inputAccessorRemoteActionCompatParcelizer$default;
            }
            final InputAccessor inputAccessor = (InputAccessor) objOnPause;
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            int i9 = MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite);
            final onSetRating iconCompatParcelizer = onsetshufflemodeRemoteActionCompatParcelizer != null ? onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer() : null;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final InputAccessor inputAccessor2 = (InputAccessor) objOnPause2;
            _handleOddName _handleoddname4 = onInflate.read(_handleoddname3);
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddnameIconCompatParcelizer = onInflate.IconCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddname4, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), null, 2, null));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
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
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(setDrawerElevation.INSTANCE.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver()), BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
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
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long audioAttributesImplBaseParcelizer = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer();
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            setItemHorizontalTranslationEnabled setitemhorizontaltranslationenabled = setItemHorizontalTranslationEnabled.IconCompatParcelizer;
            pushChargedEvent.write(setItemHorizontalTranslationEnabled.RemoteActionCompatParcelizer(), null, multiplyFft.AudioAttributesCompatParcelizer(-1933066641, true, new MagicModuleSubmissionRequestBody() { // from class: o.setIconResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCornerRadiusResource.RemoteActionCompatParcelizer(iconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), multiplyFft.AudioAttributesCompatParcelizer(1883301798, true, new getModuleData() { // from class: o.setIconPadding
                private /* synthetic */ boolean IconCompatParcelizer = true;

                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setCornerRadiusResource.IconCompatParcelizer(this.IconCompatParcelizer, bottomNavigationMenuView, getcreatedondatems2, getcreatedondatems, getanswermap, inputAccessor, inputAccessor2, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), audioAttributesImplBaseParcelizer, 0L, fIconCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 1576326, 34);
            final parseDouble parsedouble = _qbuf.read(Boolean.valueOf(bottomNavigationMenuView.getMediaBrowserCompatCustomActionResultReceiver()), _handleunrecognizedcharacterescapeWrite, 0);
            _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            List<String> listRemoteActionCompatParcelizer = bottomNavigationMenuView.RemoteActionCompatParcelizer();
            boolean mediaBrowserCompatCustomActionResultReceiver = bottomNavigationMenuView.getMediaBrowserCompatCustomActionResultReceiver();
            String remoteActionCompatParcelizer = bottomNavigationMenuView.getRemoteActionCompatParcelizer();
            zzhs audioAttributesCompatParcelizer = bottomNavigationMenuView.getAudioAttributesCompatParcelizer();
            boolean audioAttributesImplBaseParcelizer2 = bottomNavigationMenuView.getAudioAttributesImplBaseParcelizer();
            boolean iconCompatParcelizer2 = bottomNavigationMenuView.getIconCompatParcelizer();
            setOnMaskChangedListener write = bottomNavigationMenuView.getWrite();
            boolean z = (i7 & 458752) == 131072;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.setIconSize
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCornerRadiusResource.IconCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            getCreatedOnDateMs getcreatedondatems6 = (getCreatedOnDateMs) objOnPause3;
            boolean z2 = (i7 & 57344) == 16384;
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedouble);
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | zAudioAttributesCompatParcelizer3) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.setIconGravity
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCornerRadiusResource.write(getanswermap, parsedouble);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            getCreatedOnDateMs getcreatedondatems7 = (getCreatedOnDateMs) objOnPause4;
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getAnswerMap() { // from class: o.setIconTintResource
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setCornerRadiusResource.AudioAttributesCompatParcelizer(inputAccessor2, ((Boolean) obj).booleanValue());
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            setShapeAppearanceModel.AudioAttributesCompatParcelizer(_handleoddnameIconCompatParcelizer$default2, listRemoteActionCompatParcelizer, remoteActionCompatParcelizer, audioAttributesCompatParcelizer, mediaBrowserCompatCustomActionResultReceiver, true, write, audioAttributesImplBaseParcelizer2, iconCompatParcelizer2, getcreatedondatems6, getanswermap2, getcreatedondatems7, (getAnswerMap) objOnPause5, _handleunrecognizedcharacterescapeWrite, 196614, ((i7 >> 21) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (!bottomNavigationMenuView.getAudioAttributesImplApi21Parcelizer()) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(981745091);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(990238874);
                if (bottomNavigationMenuView.getAudioAttributesCompatParcelizer() == zzhs.write) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(990298983);
                    setCheckedIconResource.AudioAttributesCompatParcelizer(null, bottomNavigationView, getanswermap5, getanswermap4, getcreatedondatems5, getcreatedondatems2, _handleunrecognizedcharacterescapeWrite, ((i7 >> 6) & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | (i8 & 57344) | (458752 & (i7 >> 3)), 1);
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                    _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(990683507);
                    int i10 = i7 >> 3;
                    int i11 = i7 >> 18;
                    int i12 = (i10 & 112) | (i11 & 896) | (i11 & 7168) | ((i8 << 12) & 57344) | (458752 & i10) | ((i8 << 15) & 3670016);
                    _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                    setMaskRectF.write(null, setonnavigationitemselectedlistener, getanswermap3, magicModuleSubmissionRequestBody, getcreatedondatems3, getcreatedondatems2, getcreatedondatems4, _handleunrecognizedcharacterescape2, i12, 1);
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                }
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setIconTintMode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCornerRadiusResource.RemoteActionCompatParcelizer(_handleoddname2, bottomNavigationMenuView, setonnavigationitemselectedlistener, bottomNavigationView, getanswermap, getcreatedondatems, getcreatedondatems2, getanswermap2, getanswermap3, magicModuleSubmissionRequestBody, getcreatedondatems3, getcreatedondatems4, getanswermap4, getanswermap5, getcreatedondatems5, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final boolean RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final boolean read(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(onSetRating onsetrating) {
        if (onsetrating != null) {
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1933066641, i, -1, "com.marrow2.ui.test.testReview.ui.MainReview.<anonymous>.<anonymous>.<anonymous> (MainReview.kt:99)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(onsetrating);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setStrokeColorResource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCornerRadiusResource.RemoteActionCompatParcelizer(onsetrating);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            setItemHorizontalTranslationEnabled setitemhorizontaltranslationenabled = setItemHorizontalTranslationEnabled.IconCompatParcelizer;
            JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause, null, false, null, setItemHorizontalTranslationEnabled.read(), _handleunrecognizedcharacterescape, CpioConstants.C_ISBLK, 14);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup IconCompatParcelizer(boolean r33, final kotlin.BottomNavigationMenuView r34, final kotlin.getCreatedOnDateMs r35, kotlin.getCreatedOnDateMs r36, final kotlin.getAnswerMap r37, kotlin.InputAccessor r38, final kotlin.InputAccessor r39, kotlin.getViewLifecycleOwnerLiveData r40, kotlin._handleUnrecognizedCharacterEscape r41, int r42) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCornerRadiusResource.IconCompatParcelizer(boolean, o.BottomNavigationMenuView, o.getCreatedOnDateMs, o.getCreatedOnDateMs, o.getAnswerMap, o.InputAccessor, o.InputAccessor, o.getViewLifecycleOwnerLiveData, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(BottomNavigationMenuView bottomNavigationMenuView, getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1213364727, i, -1, "com.marrow2.ui.test.testReview.ui.MainReview.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainReview.kt:113)");
            }
            boolean mediaBrowserCompatCustomActionResultReceiver = bottomNavigationMenuView.getMediaBrowserCompatCustomActionResultReceiver();
            getScope getscope = getScope.RemoteActionCompatParcelizer;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            long audioAttributesCompatParcelizer = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            long onRemoveQueueItemAt = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRemoveQueueItemAt();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            forScope.write(mediaBrowserCompatCustomActionResultReceiver, getanswermap, null, false, null, getscope.AudioAttributesCompatParcelizer(onRemoveQueueItemAt, audioAttributesCompatParcelizer, 1.0f, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnStop(), r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 1.0f, 0L, 0L, 0L, 0L, _handleunrecognizedcharacterescape, 196992, getScope.read, 960), _handleunrecognizedcharacterescape, 0, 28);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems, InputAccessor inputAccessor) {
        if (!read((InputAccessor<Boolean>) inputAccessor)) {
            getcreatedondatems.invoke();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(BottomNavigationMenuView bottomNavigationMenuView, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        long onFastForward;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1693635747, i, -1, "com.marrow2.ui.test.testReview.ui.MainReview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainReview.kt:143)");
            }
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.grid_view_rv, _handleunrecognizedcharacterescape, 6);
            if (bottomNavigationMenuView.getAudioAttributesImplBaseParcelizer()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(208660811);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                onFastForward = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRewind();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(208662061);
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
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAnswerMap getanswermap, parseDouble parsedouble) {
        getanswermap.invoke(Boolean.valueOf(!read((parseDouble<Boolean>) parsedouble)));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, boolean z) {
        write((InputAccessor<Boolean>) inputAccessor, z);
        return getShowPopup.INSTANCE;
    }

    private static final void write(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    private static final boolean read(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, BottomNavigationMenuView bottomNavigationMenuView, setOnNavigationItemSelectedListener setonnavigationitemselectedlistener, BottomNavigationView bottomNavigationView, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getAnswerMap getanswermap2, getAnswerMap getanswermap3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, getAnswerMap getanswermap4, getAnswerMap getanswermap5, getCreatedOnDateMs getcreatedondatems5, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, bottomNavigationMenuView, setonnavigationitemselectedlistener, bottomNavigationView, getanswermap, getcreatedondatems, getcreatedondatems2, getanswermap2, getanswermap3, magicModuleSubmissionRequestBody, getcreatedondatems3, getcreatedondatems4, getanswermap4, getanswermap5, getcreatedondatems5, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}

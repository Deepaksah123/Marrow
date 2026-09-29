package kotlin;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class getScionFrontendApiImplementation {
    public static final void write(final boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final List<component4> list, final long j, final int i, final getAnswerMap<? super component4, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-391420509);
        if ((i2 & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(j) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i3) != 74898, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-391420509, i3, -1, "com.marrow2.ui.video.revision_video.IndexFilterDropdown (IndexFilterDropdown.kt:48)");
            }
            bufferMapProperty buffermapproperty = (bufferMapProperty) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.IconCompatParcelizer());
            int i4 = ((Configuration) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.read())).orientation;
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1802025127);
            float fAudioAttributesCompatParcelizer = buffermapproperty.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(((Configuration) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.read())).screenWidthDp));
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            float fAudioAttributesCompatParcelizer2 = buffermapproperty.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(200.0f));
            float fAudioAttributesCompatParcelizer3 = buffermapproperty.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(40.0f));
            int i5 = i3 & 7168;
            boolean z2 = i5 == 2048;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(fAudioAttributesCompatParcelizer);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(fAudioAttributesCompatParcelizer2);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(fAudioAttributesCompatParcelizer3);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = Integer.valueOf(Math.min(hasReferringProperties.IconCompatParcelizer(j), (int) ((fAudioAttributesCompatParcelizer - fAudioAttributesCompatParcelizer2) - fAudioAttributesCompatParcelizer3)));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            int iIntValue = ((Number) objOnPause).intValue();
            boolean z3 = i5 == 2048;
            boolean z4 = (57344 & i3) == 16384;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z3 | z4) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = Integer.valueOf(hasReferringProperties.AudioAttributesCompatParcelizer(j) + i);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            int iIntValue2 = ((Number) objOnPause2).intValue();
            int i6 = i3 & 112;
            boolean z5 = i6 == 32;
            IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z5 || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                iconCompatParcelizerOnPause = new IconCompatParcelizer(getcreatedondatems, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(Integer.valueOf(i4), (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(28865321);
                _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                boolean z6 = i6 == 32;
                Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                if (z6 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getCreatedOnDateMs() { // from class: o.ComponentRegistrar
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return getScionFrontendApiImplementation.write(getcreatedondatems);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                }
                AbsSavedState1.RemoteActionCompatParcelizer(splitRtspMessageBody.write(_handleoddnameIconCompatParcelizer$default, (getCreatedOnDateMs) objOnPause3), _handleunrecognizedcharacterescapeWrite, 0);
                long j2 = iIntValue;
                long j3 = -1;
                popOrNull.AudioAttributesCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), hasReferringProperties.read((((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & ((long) iIntValue2)) | (j2 << 32)), null, null, multiplyFft.AudioAttributesCompatParcelizer(-861486085, true, new MagicModuleSubmissionRequestBody() { // from class: o.ExecutorsRegistrar
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return getScionFrontendApiImplementation.write(list, getanswermap, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, 24582, 12);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(26084063);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.DatabaseRegistrar
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getScionFrontendApiImplementation.write(z, getcreatedondatems, list, j, i, getanswermap, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final List list, final getAnswerMap getanswermap, DrawerLayoutLayoutParams drawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(drawerLayoutLayoutParams, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(293004361, i, -1, "com.marrow2.ui.video.revision_video.IndexFilterDropdown.<anonymous>.<anonymous> (IndexFilterDropdown.kt:85)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(200.0f)), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(270.0f), 1, (Object) null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(list);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.CrashlyticsRegistrar
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return getScionFrontendApiImplementation.write(list, getanswermap, (setReenterTransition) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            performContextItemSelected.write(_handleoddnameIconCompatParcelizer$default, null, null, false, null, null, null, false, null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 6, 510);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final List list, final getAnswerMap getanswermap, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        setReenterTransition.RemoteActionCompatParcelizer$default(setreentertransition, list.size(), new getAnswerMap() { // from class: o.FirebaseDatabaseKtxRegistrar
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getScionFrontendApiImplementation.IconCompatParcelizer(list, ((Integer) obj).intValue());
            }
        }, null, multiplyFft.IconCompatParcelizer(1162050795, true, new getMagicModuleStat() { // from class: o.FirebaseCommonKtxRegistrar
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                return getScionFrontendApiImplementation.write(list, getanswermap, (performDestroy) obj, ((Integer) obj2).intValue(), (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
            }
        }), 4, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(List list, int i) {
        return ((component4) list.get(i)).getRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(List list, final getAnswerMap getanswermap, performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        int i3;
        long jAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i3 & 145) != 144, i3 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1162050795, i3, -1, "com.marrow2.ui.video.revision_video.IndexFilterDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndexFilterDropdown.kt:93)");
            }
            final component4 component4Var = (component4) list.get(i);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = getAllowEnterTransitionOverlap.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, dump.AudioAttributesCompatParcelizer);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(component4Var);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.getFirebaseInstanceId
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getScionFrontendApiImplementation.read(getanswermap, component4Var);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameWrite = splitRtspMessageBody.write(_handleoddnameRemoteActionCompatParcelizer, (getCreatedOnDateMs) objOnPause);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _handleunrecognizedcharacterescape, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite);
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            _handleOddName _handleoddnameWrite$default = isAdded.write$default(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), BitmapDescriptorFactory.HUE_RED, 1, null);
            if (component4Var.getIconCompatParcelizer()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(816994361);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                jAudioAttributesImplBaseParcelizer = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(816998002);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                jAudioAttributesImplBaseParcelizer = switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer();
            }
            AbsSavedState1.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer(_handleoddnameWrite$default, jAudioAttributesImplBaseParcelizer, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f))), _handleunrecognizedcharacterescape, 0);
            _handleOddName _handleoddnameWrite$default2 = getParentFragment.write$default(getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null), assignParameter.IconCompatParcelizer(12.0f), BitmapDescriptorFactory.HUE_RED, 2, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescape, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite$default2);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            _copyCurrentStringValue.IconCompatParcelizer(component4Var.getRemoteActionCompatParcelizer(), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).getMediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 0, 0, 65530);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape, 6);
            String strWrite = singleArgCreatorDefaultsToProperties.write(R.plurals.modules_count, component4Var.getAudioAttributesCompatParcelizer(), new Object[]{Integer.valueOf(component4Var.getAudioAttributesCompatParcelizer())}, _handleunrecognizedcharacterescape, 6);
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplApi26Parcelizer = TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strWrite, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape, 0, 0, 65530);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescape, 6);
            updatePositions.read(null, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 0, 15);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, component4 component4Var) {
        getanswermap.invoke(component4Var);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final List list, final getAnswerMap getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-861486085, i, -1, "com.marrow2.ui.video.revision_video.IndexFilterDropdown.<anonymous> (IndexFilterDropdown.kt:80)");
            }
            writeRawValue.read(null, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)), writeObject.IconCompatParcelizer.AudioAttributesCompatParcelizer(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), 0L, 0L, 0L, _handleunrecognizedcharacterescape, writeObject.RemoteActionCompatParcelizer << 12, 14), writeObject.IconCompatParcelizer.IconCompatParcelizer(assignParameter.IconCompatParcelizer(6.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, (writeObject.RemoteActionCompatParcelizer << 18) | 6, 62), null, multiplyFft.AudioAttributesCompatParcelizer(293004361, true, new getModuleData() { // from class: o.FirebaseCrashlyticsKtxRegistrar
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return getScionFrontendApiImplementation.write(list, getanswermap, (DrawerLayoutLayoutParams) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 196608, 17);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, getCreatedOnDateMs getcreatedondatems, List list, long j, int i, getAnswerMap getanswermap, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(z, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (List<component4>) list, j, i, (getAnswerMap<? super component4, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1));
        return getShowPopup.INSTANCE;
    }
}

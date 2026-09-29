package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class zzrm {

    public static final class RemoteActionCompatParcelizer implements getAnswerMap {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final void RemoteActionCompatParcelizer(_handleOddName _handleoddname, final Map<Character, ? extends List<SystemHandlerWrapper1>> map, final boolean z, final Map<Character, Integer> map2, final zzpy zzpyVar, final boolean z2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super SystemHandlerWrapper1, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName _handleoddname3;
        setSharedElementReturnTransition setsharedelementreturntransition;
        read readVar;
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        toMagicModuleMetaRepoModel.write(zzpyVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(470307823);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(map) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(map2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(zzpyVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 8388608 : 4194304;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((4793491 & i3) != 4793490, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname4 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(470307823, i3, -1, "com.marrow2.ui.schema.listing.ui.listing.SchemaListing (SchemaListLayout.kt:41)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final TopUserCompanion topUserCompanion = (TopUserCompanion) objOnPause;
            setSharedElementReturnTransition setsharedelementreturntransitionWrite = shouldShowRequestPermissionRationale.write(0, 0, _handleunrecognizedcharacterescapeWrite, 0, 3);
            if (z2) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(757524499);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setsharedelementreturntransitionWrite);
                boolean z3 = (i3 & 3670016) == 1048576;
                Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z3 || zAudioAttributesCompatParcelizer) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    readVar = new read(setsharedelementreturntransitionWrite, getcreatedondatems, null);
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVar);
                } else {
                    readVar = objOnPause2;
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) readVar, _handleunrecognizedcharacterescapeWrite, 6);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(755637715);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            if (map.isEmpty()) {
                setsharedelementreturntransition = setsharedelementreturntransitionWrite;
                _handleoddname3 = _handleoddname4;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-834551507);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-832223717);
                boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(map);
                boolean z4 = (i3 & 896) == 256;
                boolean z5 = (29360128 & i3) == 8388608;
                Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zIconCompatParcelizer | z4 | z5) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getAnswerMap() { // from class: o.zzrl
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return zzrm.write(map, z, getanswermap, (setReenterTransition) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                }
                setsharedelementreturntransition = setsharedelementreturntransitionWrite;
                _handleoddname3 = _handleoddname4;
                performContextItemSelected.write(null, setsharedelementreturntransitionWrite, null, false, null, null, null, false, null, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescapeWrite, 0, 509);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (zzpyVar != zzpy.IconCompatParcelizer) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-834551507);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-830825958);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(setdrawerelevation.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat()), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(48.0f), assignParameter.IconCompatParcelizer(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(null, _handleunrecognizedcharacterescapeWrite, 1) == VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.IconCompatParcelizer ? BitmapDescriptorFactory.HUE_RED : 16.0f), BitmapDescriptorFactory.HUE_RED, 9, null);
                List listOnPlay = IntermediateLoginResponseBody.onPlay(map.keySet());
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(map2);
                boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(topUserCompanion);
                final setSharedElementReturnTransition setsharedelementreturntransition2 = setsharedelementreturntransition;
                boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(setsharedelementreturntransition2);
                Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((zIconCompatParcelizer2 | zIconCompatParcelizer3 | zAudioAttributesCompatParcelizer2) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getAnswerMap() { // from class: o.zzro
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return zzrm.write(map2, topUserCompanion, setsharedelementreturntransition2, ((Character) obj).charValue());
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
                }
                StyledPlayerControlViewLayoutManagerExternalSyntheticLambda8.AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default, (List<Character>) listOnPlay, (getAnswerMap<? super Character, getShowPopup>) objOnPause4, _handleunrecognizedcharacterescapeWrite, 0, 0);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname5 = _handleoddname3;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ActivityRecognitionApi
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return zzrm.RemoteActionCompatParcelizer(_handleoddname5, map, z, map2, zzpyVar, z2, getcreatedondatems, getanswermap, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ setSharedElementReturnTransition read;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setSharedElementReturnTransition.IconCompatParcelizer$default(this.read, 0, 0, this, 2, (Object) null) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.write.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(setSharedElementReturnTransition setsharedelementreturntransition, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = setsharedelementreturntransition;
            this.write = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(char c, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(performdestroy, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & TsExtractor.TS_STREAM_TYPE_AC3) != 128, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(529182631, i, -1, "com.marrow2.ui.schema.listing.ui.listing.SchemaListing.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchemaListLayout.kt:65)");
            }
            String upperCase = String.valueOf(c).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, getParentFragment.AudioAttributesCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.RemoteActionCompatParcelizer(null, assignParameter.IconCompatParcelizer(36.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 48, 13), assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), 4, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), 0L, null, getDataStream.INSTANCE.AudioAttributesCompatParcelizer(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, _handleunrecognizedcharacterescape, 196608, 0, 131032);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(SystemHandlerWrapper1 systemHandlerWrapper1) {
        toMagicModuleMetaRepoModel.write(systemHandlerWrapper1, "");
        return systemHandlerWrapper1.write();
    }

    static final class AudioAttributesCompatParcelizer implements getCreatedOnDateMs<getShowPopup> {
        private /* synthetic */ getAnswerMap<SystemHandlerWrapper1, getShowPopup> AudioAttributesCompatParcelizer;
        private /* synthetic */ SystemHandlerWrapper1 read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.invoke(this.read);
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getAnswerMap<? super SystemHandlerWrapper1, getShowPopup> getanswermap, SystemHandlerWrapper1 systemHandlerWrapper1) {
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.read = systemHandlerWrapper1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Map map, TopUserCompanion topUserCompanion, setSharedElementReturnTransition setsharedelementreturntransition, char c) {
        Integer num = (Integer) map.get(Character.valueOf(c));
        if (num != null) {
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new write(setsharedelementreturntransition, num, null), 3);
        }
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Integer read;
        private /* synthetic */ setSharedElementReturnTransition write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setSharedElementReturnTransition.IconCompatParcelizer$default(this.write, this.read.intValue(), 0, this, 2, (Object) null) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setSharedElementReturnTransition setsharedelementreturntransition, Integer num, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = setsharedelementreturntransition;
            this.read = num;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer implements getAnswerMap<Integer, Object> {
        private /* synthetic */ getAnswerMap IconCompatParcelizer;
        private /* synthetic */ List RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return write(num.intValue());
        }

        private Object write(int i) {
            return this.IconCompatParcelizer.invoke(this.RemoteActionCompatParcelizer.get(i));
        }

        public AudioAttributesImplApi26Parcelizer(getAnswerMap getanswermap, List list) {
            this.IconCompatParcelizer = getanswermap;
            this.RemoteActionCompatParcelizer = list;
        }
    }

    public static final class IconCompatParcelizer implements getAnswerMap<Integer, Object> {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ getAnswerMap read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return read(num.intValue());
        }

        private Object read(int i) {
            return this.read.invoke(this.IconCompatParcelizer.get(i));
        }

        public IconCompatParcelizer(getAnswerMap getanswermap, List list) {
            this.read = getanswermap;
            this.IconCompatParcelizer = list;
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer implements getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ getAnswerMap RemoteActionCompatParcelizer;
        private /* synthetic */ List read;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(performDestroy performdestroy, Integer num, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num2) {
            IconCompatParcelizer(performdestroy, num.intValue(), _handleunrecognizedcharacterescape, num2.intValue());
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(performDestroy performdestroy, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
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
            SystemHandlerWrapper1 systemHandlerWrapper1 = (SystemHandlerWrapper1) this.read.get(i);
            _handleunrecognizedcharacterescape.IconCompatParcelizer(728084837);
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(systemHandlerWrapper1);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (getCreatedOnDateMs) new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, systemHandlerWrapper1);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            zzrk.write(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer$default(companion, false, null, null, null, (getCreatedOnDateMs) objOnPause, 15, null), null, assignParameter.IconCompatParcelizer(16.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), systemHandlerWrapper1, _handleunrecognizedcharacterescape, 0, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        public AudioAttributesImplApi21Parcelizer(List list, getAnswerMap getanswermap) {
            this.read = list;
            this.RemoteActionCompatParcelizer = getanswermap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Map map, boolean z, getAnswerMap getanswermap, setReenterTransition setreentertransition) {
        toMagicModuleMetaRepoModel.write(setreentertransition, "");
        for (Map.Entry entry : map.entrySet()) {
            final char cCharValue = ((Character) entry.getKey()).charValue();
            List list = (List) entry.getValue();
            if (z) {
                setReenterTransition.read$default(setreentertransition, null, "Alpha", multiplyFft.IconCompatParcelizer(529182631, true, new getMagicModuleStat() { // from class: o.zzrn
                    @Override // kotlin.getMagicModuleStat
                    public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                        return zzrm.IconCompatParcelizer(cCharValue, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj3, ((Integer) obj4).intValue());
                    }
                }), 1, null);
            }
            setreentertransition.RemoteActionCompatParcelizer(list.size(), new IconCompatParcelizer(new getAnswerMap() { // from class: o.zzrp
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return zzrm.write((SystemHandlerWrapper1) obj);
                }
            }, list), new AudioAttributesImplApi26Parcelizer(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, list), multiplyFft.IconCompatParcelizer(802480018, true, new AudioAttributesImplApi21Parcelizer(list, getanswermap)));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, Map map, boolean z, Map map2, zzpy zzpyVar, boolean z2, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(_handleoddname, (Map<Character, ? extends List<SystemHandlerWrapper1>>) map, z, (Map<Character, Integer>) map2, zzpyVar, z2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super SystemHandlerWrapper1, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}

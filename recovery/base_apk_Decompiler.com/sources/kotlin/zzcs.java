package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.qbank.score.QbankScoreViewModel;
import kotlin.Metadata;
import kotlin.zzdx;
import kotlin.zzea;
import kotlin.zzed;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcs {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(int i) {
        return i;
    }

    public static final float read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1343989651);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1343989651, 0, -1, "com.marrow2.ui.qbank.score.compose.rememberTabletHorizontalPadding (QbankScoreScreen.kt:35)");
        }
        Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
        Configuration configuration = (Configuration) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.read());
        if (DeviceProperties.isTablet(context)) {
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer((float) (((double) configuration.screenWidthDp) * (configuration.orientation == 2 ? 0.18d : 0.07d)));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return fIconCompatParcelizer;
        }
        float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return fIconCompatParcelizer2;
    }

    public static final void read(final QbankScoreViewModel qbankScoreViewModel, final boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super zzdx, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        Object obj;
        toMagicModuleMetaRepoModel.write(qbankScoreViewModel, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1936197142);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(qbankScoreViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 1171) != 1170, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1936197142, i2, -1, "com.marrow2.ui.qbank.score.compose.QbankScoreScreen (QbankScoreScreen.kt:50)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            parseDouble parsedoubleAudioAttributesCompatParcelizer = isSetterVisible.AudioAttributesCompatParcelizer(qbankScoreViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            final parseDouble parsedoubleAudioAttributesCompatParcelizer2 = isSetterVisible.AudioAttributesCompatParcelizer(qbankScoreViewModel.read(), _handleunrecognizedcharacterescapeWrite, 0);
            final parseDouble parsedoubleAudioAttributesCompatParcelizer3 = isSetterVisible.AudioAttributesCompatParcelizer(qbankScoreViewModel.AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            final parseDouble parsedoubleAudioAttributesCompatParcelizer4 = isSetterVisible.AudioAttributesCompatParcelizer(qbankScoreViewModel.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 0);
            parseDouble parsedoubleAudioAttributesCompatParcelizer5 = isSetterVisible.AudioAttributesCompatParcelizer(qbankScoreViewModel.IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(qbankScoreViewModel);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(qbankScoreViewModel, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 6);
            zzdx zzdxVarAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(parsedoubleAudioAttributesCompatParcelizer5);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer5);
            boolean z2 = (i2 & 7168) == 2048;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | z2) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(getanswermap, parsedoubleAudioAttributesCompatParcelizer5, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(zzdxVarAudioAttributesImplApi21Parcelizer, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            zzed zzedVar = read((parseDouble<? extends zzed>) parsedoubleAudioAttributesCompatParcelizer);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            boolean z3 = (i2 & 896) == 256;
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer2) || z3) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                obj = null;
                readVarOnPause = new read(context, getcreatedondatems, parsedoubleAudioAttributesCompatParcelizer, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
            } else {
                obj = null;
            }
            StreamReadException.IconCompatParcelizer(zzedVar, (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, obj), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).read(), null, 2, null));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer);
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            zzed zzedVar2 = read((parseDouble<? extends zzed>) parsedoubleAudioAttributesCompatParcelizer);
            boolean z4 = (i2 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z4 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.zzct
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return zzcs.IconCompatParcelizer(z, (setImageLevel) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            getAnswerMap getanswermap2 = (getAnswerMap) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.zzcu
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return zzcs.read((zzed) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            setImageBitmap.write(zzedVar2, null, getanswermap2, null, null, (getAnswerMap) objOnPause2, multiplyFft.AudioAttributesCompatParcelizer(-131152401, true, new getMagicModuleStat() { // from class: o.zzcx
                @Override // kotlin.getMagicModuleStat
                public final Object write(Object obj2, Object obj3, Object obj4, Object obj5) {
                    return zzcs.AudioAttributesCompatParcelizer(getcreatedondatems, qbankScoreViewModel, parsedoubleAudioAttributesCompatParcelizer2, parsedoubleAudioAttributesCompatParcelizer3, parsedoubleAudioAttributesCompatParcelizer4, (setImageResource) obj2, (zzed) obj3, (_handleUnrecognizedCharacterEscape) obj4, ((Integer) obj5).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescape2, 1769472, 26);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.zzcw
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return zzcs.read(qbankScoreViewModel, z, getcreatedondatems, getanswermap, i, (_handleUnrecognizedCharacterEscape) obj2);
                }
            });
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ QbankScoreViewModel read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.read.write(zzea.MediaBrowserCompatItemReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(QbankScoreViewModel qbankScoreViewModel, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = qbankScoreViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ parseDouble<zzdx> IconCompatParcelizer;
        private /* synthetic */ getAnswerMap<zzdx, getShowPopup> RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (!(zzcs.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer) instanceof zzdx.AudioAttributesCompatParcelizer)) {
                this.RemoteActionCompatParcelizer.invoke(zzcs.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getAnswerMap<? super zzdx, getShowPopup> getanswermap, parseDouble<? extends zzdx> parsedouble, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getanswermap;
            this.IconCompatParcelizer = parsedouble;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ parseDouble<zzed> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            zzed zzedVar = zzcs.read(this.AudioAttributesCompatParcelizer);
            if (zzedVar instanceof zzed.write) {
                CmcdConfigurationRequestConfig.read(this.RemoteActionCompatParcelizer, ((zzed.write) zzedVar).RemoteActionCompatParcelizer(), 0);
                this.read.invoke();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems, parseDouble<? extends zzed> parsedouble, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = context;
            this.read = getcreatedondatems;
            this.AudioAttributesCompatParcelizer = parsedouble;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatSeekBar IconCompatParcelizer(boolean z, setImageLevel setimagelevel) {
        toMagicModuleMetaRepoModel.write(setimagelevel, "");
        if (z) {
            return setimagelevel.RemoteActionCompatParcelizer(setImageBitmap.IconCompatParcelizer(AppCompatRatingBar.write(setVerticalGravity.RemoteActionCompatParcelizer$default(600, 0, setOnSearchClickListener.read(), 2, (Object) null), new getAnswerMap() { // from class: o.zzcp
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Integer.valueOf(zzcs.read(((Integer) obj).intValue()));
                }
            }), AppCompatRatingBar.AudioAttributesCompatParcelizer(setVerticalGravity.RemoteActionCompatParcelizer$default(600, 0, setOnSearchClickListener.read(), 2, (Object) null), (getAnswerMap<? super Integer, Integer>) new getAnswerMap() { // from class: o.zzcr
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Integer.valueOf(zzcs.RemoteActionCompatParcelizer(((Integer) obj).intValue()));
                }
            })), setImageBitmap.RemoteActionCompatParcelizer(false, null, 2, null));
        }
        return setImageBitmap.IconCompatParcelizer(setDropDownVerticalOffset.INSTANCE.AudioAttributesCompatParcelizer(), setDropDownWidth.INSTANCE.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems, QbankScoreViewModel qbankScoreViewModel, parseDouble parsedouble, parseDouble parsedouble2, parseDouble parsedouble3, setImageResource setimageresource, zzed zzedVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(setimageresource, "");
        toMagicModuleMetaRepoModel.write(zzedVar, "");
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-131152401, i, -1, "com.marrow2.ui.qbank.score.compose.QbankScoreScreen.<anonymous>.<anonymous> (QbankScoreScreen.kt:98)");
        }
        if (zzedVar instanceof zzed.RemoteActionCompatParcelizer) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1483402811);
            zzdw.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else if (zzedVar instanceof zzed.read) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1483399587);
            zzcd.RemoteActionCompatParcelizer(((zzed.read) zzedVar).AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else if (zzedVar instanceof zzed.AudioAttributesCompatParcelizer) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1483395344);
            zzdz zzdzVarIconCompatParcelizer = ((zzed.AudioAttributesCompatParcelizer) zzedVar).IconCompatParcelizer();
            zzdy zzdyVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((parseDouble<zzdy>) parsedouble);
            String iconCompatParcelizer = zzdyVarAudioAttributesCompatParcelizer != null ? zzdyVarAudioAttributesCompatParcelizer.getIconCompatParcelizer() : null;
            boolean zIconCompatParcelizer = IconCompatParcelizer((parseDouble<Boolean>) parsedouble2);
            boolean zMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(parsedouble3);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(qbankScoreViewModel);
            write writeVarOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                writeVarOnPause = new write(qbankScoreViewModel);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(writeVarOnPause);
            }
            zzdn.write(zzdzVarIconCompatParcelizer, iconCompatParcelizer, zIconCompatParcelizer, zMediaBrowserCompatItemReceiver, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super zzea, getShowPopup>) ((getErrorMessageId) writeVarOnPause), _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1483384555);
            AbsSavedState1.RemoteActionCompatParcelizer(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class write extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<zzea, getShowPopup> {
        public final void IconCompatParcelizer(zzea zzeaVar) {
            toMagicModuleMetaRepoModel.write(zzeaVar, "");
            ((QbankScoreViewModel) this.AudioAttributesImplApi26Parcelizer).write(zzeaVar);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(zzea zzeaVar) {
            IconCompatParcelizer(zzeaVar);
            return getShowPopup.INSTANCE;
        }

        write(Object obj) {
            super(1, obj, QbankScoreViewModel.class, "write", "write(Lo/zzea;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzed read(parseDouble<? extends zzed> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    private static final zzdy AudioAttributesCompatParcelizer(parseDouble<zzdy> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    private static final boolean IconCompatParcelizer(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final boolean MediaBrowserCompatItemReceiver(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzdx AudioAttributesImplApi21Parcelizer(parseDouble<? extends zzdx> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(zzed zzedVar) {
        toMagicModuleMetaRepoModel.write(zzedVar, "");
        return zzedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(QbankScoreViewModel qbankScoreViewModel, boolean z, getCreatedOnDateMs getcreatedondatems, getAnswerMap getanswermap, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(qbankScoreViewModel, z, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super zzdx, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

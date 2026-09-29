package kotlin;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.R;
import com.marrow2.ui.video.revision_video.VideoRevisionListViewModel;
import java.util.List;
import kotlin.AttestationRequestBodyKt;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class defaultjsSrc {
    public static final void IconCompatParcelizer(final VideoRevisionListViewModel videoRevisionListViewModel, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getAnswerMap<? super String, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, final MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        int i3;
        getShowPopup getshowpopup;
        toMagicModuleMetaRepoModel.write(videoRevisionListViewModel, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(51297380);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(videoRevisionListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i2;
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i4) != 599186, i4 & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(51297380, i4, -1, "com.marrow2.ui.video.revision_video.VideoRevisionListScreen (VideoRevisionListScreen.kt:25)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            parseDouble parsedouble = _qbuf.read(videoRevisionListViewModel.read(), (CurrentQuery) null, _handleunrecognizedcharacterescapeWrite, 0, 1);
            parseDouble parsedouble2 = _qbuf.read(videoRevisionListViewModel.AudioAttributesCompatParcelizer(), (CurrentQuery) null, _handleunrecognizedcharacterescapeWrite, 0, 1);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            InputAccessor inputAccessor = (InputAccessor) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            InputAccessor inputAccessor2 = (InputAccessor) objOnPause2;
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(videoRevisionListViewModel);
            boolean z = (i4 & 112) == 32;
            boolean z2 = (57344 & i4) == 16384;
            boolean z3 = (i4 & 7168) == 2048;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(context);
            boolean z4 = (i4 & 896) == 256;
            boolean z5 = (3670016 & i4) == 1048576;
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((zIconCompatParcelizer | z | z2 | z3 | zIconCompatParcelizer2 | z4) || z5) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                i3 = i4;
                getshowpopup = getshowpopup2;
                readVarOnPause = new read(videoRevisionListViewModel, getcreatedondatems, getcreatedondatems3, getanswermap, context, getcreatedondatems2, inputAccessor, magicModuleSubmissionRequestBody, inputAccessor2, null);
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(readVarOnPause);
            } else {
                i3 = i4;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                getshowpopup = getshowpopup2;
            }
            StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescape2, 6);
            component3 component3VarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(parsedouble2);
            boolean write = IconCompatParcelizer(parsedouble).getWrite();
            boolean audioAttributesImplApi21Parcelizer = IconCompatParcelizer(parsedouble).getAudioAttributesImplApi21Parcelizer();
            boolean mediaBrowserCompatItemReceiver = IconCompatParcelizer(parsedouble).getMediaBrowserCompatItemReceiver();
            String mediaMetadataCompat = IconCompatParcelizer(parsedouble).getMediaMetadataCompat();
            List<getFirstInstallDbVersion> listMediaMetadataCompat = IconCompatParcelizer(parsedouble).MediaMetadataCompat();
            List<getFirstInstallAppVersion> list = IconCompatParcelizer(parsedouble).read();
            List<getLastUpdatedTimeMs> listAudioAttributesCompatParcelizer = IconCompatParcelizer(parsedouble).AudioAttributesCompatParcelizer();
            getLastUpdatedTimeMs audioAttributesImplBaseParcelizer = IconCompatParcelizer(parsedouble).getAudioAttributesImplBaseParcelizer();
            List<component4> listRemoteActionCompatParcelizer = IconCompatParcelizer(parsedouble).RemoteActionCompatParcelizer();
            boolean audioAttributesImplApi26Parcelizer = IconCompatParcelizer(parsedouble).getAudioAttributesImplApi26Parcelizer();
            boolean remoteActionCompatParcelizer = IconCompatParcelizer(parsedouble).getRemoteActionCompatParcelizer();
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape2.IconCompatParcelizer(videoRevisionListViewModel);
            IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescape2.onPause();
            if (zIconCompatParcelizer3 || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                iconCompatParcelizerOnPause = new IconCompatParcelizer(videoRevisionListViewModel);
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
            }
            FirebaseMessagingService.RemoteActionCompatParcelizer(component3VarRemoteActionCompatParcelizer, write, audioAttributesImplApi21Parcelizer, IconCompatParcelizer(parsedouble).getMediaDescriptionCompat(), listMediaMetadataCompat, list, listAudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer, mediaBrowserCompatItemReceiver, audioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer, mediaMetadataCompat, (getAnswerMap<? super component5, getShowPopup>) ((getErrorMessageId) iconCompatParcelizerOnPause), (String) inputAccessor.getRemoteActionCompatParcelizer(), listRemoteActionCompatParcelizer, IconCompatParcelizer(parsedouble).getRead(), ((Boolean) inputAccessor2.getRemoteActionCompatParcelizer()).booleanValue(), getcreatedondatems4, _handleunrecognizedcharacterescape2, 0, (i3 << 6) & 29360128, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.defaulthideDialog
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return defaultjsSrc.IconCompatParcelizer(videoRevisionListViewModel, getcreatedondatems, getcreatedondatems2, getanswermap, getcreatedondatems3, getcreatedondatems4, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ MagicModuleSubmissionRequestBody<String, String, getShowPopup> AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ InputAccessor<String> AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ VideoRevisionListViewModel AudioAttributesImplBaseParcelizer;
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ InputAccessor<Boolean> MediaBrowserCompatItemReceiver;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ getAnswerMap<String, getShowPopup> read;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        /* JADX INFO: renamed from: o.defaultjsSrc$read$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<AttestationRequestBodyKt, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Context AudioAttributesCompatParcelizer;
            private /* synthetic */ InputAccessor<String> AudioAttributesImplApi21Parcelizer;
            private int AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;
            private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
            private /* synthetic */ InputAccessor<Boolean> MediaBrowserCompatCustomActionResultReceiver;
            private /* synthetic */ Object MediaBrowserCompatItemReceiver;
            private /* synthetic */ MagicModuleSubmissionRequestBody<String, String, getShowPopup> RemoteActionCompatParcelizer;
            private /* synthetic */ getAnswerMap<String, getShowPopup> read;
            private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                AttestationRequestBodyKt attestationRequestBodyKt = (AttestationRequestBodyKt) this.MediaBrowserCompatItemReceiver;
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                if (attestationRequestBodyKt instanceof AttestationRequestBodyKt.RemoteActionCompatParcelizer) {
                    this.IconCompatParcelizer.invoke();
                } else if (attestationRequestBodyKt instanceof AttestationRequestBodyKt.AudioAttributesImplApi21Parcelizer) {
                    this.write.invoke();
                } else if (attestationRequestBodyKt instanceof AttestationRequestBodyKt.write) {
                    this.read.invoke(((AttestationRequestBodyKt.write) attestationRequestBodyKt).AudioAttributesCompatParcelizer());
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attestationRequestBodyKt, AttestationRequestBodyKt.MediaBrowserCompatItemReceiver.INSTANCE)) {
                    Context context = this.AudioAttributesCompatParcelizer;
                    Toast.makeText(context, context.getString(R.string.text_lesson_coming_soon), 0).show();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attestationRequestBodyKt, AttestationRequestBodyKt.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                    Context context2 = this.AudioAttributesCompatParcelizer;
                    Toast.makeText(context2, context2.getString(R.string.text_lesson_coming_soon_short), 0).show();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attestationRequestBodyKt, AttestationRequestBodyKt.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                    this.AudioAttributesImplBaseParcelizer.invoke();
                } else if (attestationRequestBodyKt instanceof AttestationRequestBodyKt.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi21Parcelizer.write(((AttestationRequestBodyKt.AudioAttributesImplApi26Parcelizer) attestationRequestBodyKt).RemoteActionCompatParcelizer());
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attestationRequestBodyKt, AttestationRequestBodyKt.AudioAttributesCompatParcelizer.INSTANCE)) {
                    this.AudioAttributesImplApi21Parcelizer.write(null);
                } else if (attestationRequestBodyKt instanceof AttestationRequestBodyKt.IconCompatParcelizer) {
                    AttestationRequestBodyKt.IconCompatParcelizer iconCompatParcelizer = (AttestationRequestBodyKt.IconCompatParcelizer) attestationRequestBodyKt;
                    this.RemoteActionCompatParcelizer.invoke(iconCompatParcelizer.RemoteActionCompatParcelizer(), iconCompatParcelizer.write());
                } else {
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attestationRequestBodyKt, AttestationRequestBodyKt.read.INSTANCE)) {
                        throw new RenewEligibleCreator();
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getAnswerMap<? super String, getShowPopup> getanswermap, Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems3, InputAccessor<String> inputAccessor, MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, InputAccessor<Boolean> inputAccessor2, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = getcreatedondatems;
                this.write = getcreatedondatems2;
                this.read = getanswermap;
                this.AudioAttributesCompatParcelizer = context;
                this.AudioAttributesImplBaseParcelizer = getcreatedondatems3;
                this.AudioAttributesImplApi21Parcelizer = inputAccessor;
                this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
                this.MediaBrowserCompatCustomActionResultReceiver = inputAccessor2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.IconCompatParcelizer, this.write, this.read, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, sampleVideos);
                anonymousClass1.MediaBrowserCompatItemReceiver = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(AttestationRequestBodyKt attestationRequestBodyKt, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(attestationRequestBodyKt, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesImplApi21Parcelizer = 1;
                if (VerifyNewNumberRequest.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(), new AnonymousClass1(this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, null), this) == objIconCompatParcelizer) {
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
        /* JADX WARN: Multi-variable type inference failed */
        read(VideoRevisionListViewModel videoRevisionListViewModel, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getAnswerMap<? super String, getShowPopup> getanswermap, Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems3, InputAccessor<String> inputAccessor, MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody, InputAccessor<Boolean> inputAccessor2, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesImplBaseParcelizer = videoRevisionListViewModel;
            this.write = getcreatedondatems;
            this.RemoteActionCompatParcelizer = getcreatedondatems2;
            this.read = getanswermap;
            this.IconCompatParcelizer = context;
            this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems3;
            this.AudioAttributesImplApi26Parcelizer = inputAccessor;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.MediaBrowserCompatItemReceiver = inputAccessor2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesImplBaseParcelizer, this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<component5, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(component5 component5Var) {
            write(component5Var);
            return getShowPopup.INSTANCE;
        }

        public final void write(component5 component5Var) {
            toMagicModuleMetaRepoModel.write(component5Var, "");
            ((VideoRevisionListViewModel) this.AudioAttributesImplApi26Parcelizer).read(component5Var);
        }

        IconCompatParcelizer(Object obj) {
            super(1, obj, VideoRevisionListViewModel.class, "notifyEvent", "notifyEvent(Lcom/marrow2/ui/video/revision_video/model/RevisionScreenUiEvent;)V", 0);
        }
    }

    private static final getFirstInstallTimeMs IconCompatParcelizer(parseDouble<getFirstInstallTimeMs> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    private static final component3 RemoteActionCompatParcelizer(parseDouble<component3> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(VideoRevisionListViewModel videoRevisionListViewModel, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(videoRevisionListViewModel, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getAnswerMap<? super String, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}

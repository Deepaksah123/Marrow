package com.marrow2.ui.pearl.viewmodel;

import com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ConnectionTracker;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.InstallStatusListener;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.fillWindow;
import kotlin.getAnswerMap;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.readLittleEndianUnsignedShort;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.setWindow;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000f\u0010#R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR,\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\u0011\u0010#R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u0014\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\""}, d2 = {"Lcom/marrow2/ui/pearl/viewmodel/PearlDetailViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readLittleEndianUnsignedShort;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/readLittleEndianUnsignedShort;Lo/POJOPropertyBuilder5;Lo/isSeekPending;)V", "", "AudioAttributesImplApi21Parcelizer", "()V", "AudioAttributesImplApi26Parcelizer", "", "read", "(I)V", "IconCompatParcelizer", "", "Lo/fillWindow;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/fillWindow;)V", "MediaBrowserCompatMediaItem", "Lo/readLittleEndianUnsignedShort;", "write", "AudioAttributesImplBaseParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/ConnectionTracker;", "Lo/getResolutionSize;", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "Lo/isDark;", "MediaMetadataCompat", "Lo/isDark;", "()Lo/isDark;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "", "Lo/setWindow;", "MediaBrowserCompatItemReceiver", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaDescriptionCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PearlDetailViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<setWindow>>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<String> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isDark<String> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final readLittleEndianUnsignedShort write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final isDark<String> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<setWindow>>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<ConnectionTracker> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Integer> AudioAttributesImplBaseParcelizer;

    @setSdkPayload
    public PearlDetailViewModel(readLittleEndianUnsignedShort readlittleendianunsignedshort, POJOPropertyBuilder5 pOJOPropertyBuilder5, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(readlittleendianunsignedshort, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.write = readlittleendianunsignedshort;
        this.read = isseekpending;
        ConnectionTracker.IconCompatParcelizer iconCompatParcelizer = ConnectionTracker.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(ConnectionTracker.IconCompatParcelizer.read(pOJOPropertyBuilder5));
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer("");
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<setWindow>>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(-1);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer4);
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    public final isDark<String> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<setWindow>>> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Integer> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        
            if (((kotlin.NewNumberOtpResendRequest) r8).write(new com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.write.AnonymousClass2(), r7) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L79
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L62
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel r8 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.this
                o.readLittleEndianUnsignedShort r8 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.read(r8)
                com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel r1 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.this
                o.getResolutionSize r1 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.IconCompatParcelizer(r1)
                java.lang.Object r1 = r1.IconCompatParcelizer()
                o.ConnectionTracker r1 = (kotlin.ConnectionTracker) r1
                java.lang.String r1 = r1.getMediaBrowserCompatItemReceiver()
                com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel r4 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.this
                o.getResolutionSize r4 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.IconCompatParcelizer(r4)
                java.lang.Object r4 = r4.IconCompatParcelizer()
                o.ConnectionTracker r4 = (kotlin.ConnectionTracker) r4
                boolean r4 = r4.getAudioAttributesCompatParcelizer()
                com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel r5 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.IconCompatParcelizer(r5)
                java.lang.Object r5 = r5.IconCompatParcelizer()
                o.ConnectionTracker r5 = (kotlin.ConnectionTracker) r5
                int r5 = r5.getWrite()
                r6 = r7
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r7.AudioAttributesCompatParcelizer = r3
                java.lang.Object r8 = r8.write(r1, r4, r5, r6)
                if (r8 == r0) goto L7c
            L62:
                o.NewNumberOtpResendRequest r8 = (kotlin.NewNumberOtpResendRequest) r8
                com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel$write$2 r1 = new com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel$write$2
                com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel r3 = com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.this
                r1.<init>()
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                r3 = r7
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r7.AudioAttributesCompatParcelizer = r2
                java.lang.Object r7 = r8.write(r1, r3)
                if (r7 != r0) goto L79
                goto L7c
            L79:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L7c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.readInputStreamFully
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailViewModel.read(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(PearlDetailViewModel pearlDetailViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlDetailViewModel.AudioAttributesImplApi21Parcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver());
    }

    public final void read(int p0) {
        if (p0 == 0 && this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().intValue() == -1) {
            return;
        }
        IconCompatParcelizer(p0);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            setWindow setwindow;
            fillWindow fillwindow;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setWindow setwindow2 = (setWindow) ((List) ((DataSourceBitmapLoaderExternalSyntheticLambda0) PearlDetailViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()).read()).get(this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = setwindow2;
                this.AudioAttributesCompatParcelizer = 1;
                if (PearlDetailViewModel.this.write.AudioAttributesImplBaseParcelizer(setwindow2.read(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                setwindow = setwindow2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                setwindow = (setWindow) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((Number) PearlDetailViewModel.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer()).intValue() == -1) {
                Serializable audioAttributesImplApi26Parcelizer = ((ConnectionTracker) PearlDetailViewModel.this.IconCompatParcelizer.IconCompatParcelizer()).getAudioAttributesImplApi26Parcelizer();
                fillwindow = audioAttributesImplApi26Parcelizer instanceof fillWindow ? (fillWindow) audioAttributesImplApi26Parcelizer : null;
            } else {
                fillwindow = fillWindow.RemoteActionCompatParcelizer;
            }
            PearlDetailViewModel pearlDetailViewModel = PearlDetailViewModel.this;
            String str = setwindow.read();
            if (fillwindow == null) {
                fillwindow = fillWindow.IconCompatParcelizer;
            }
            pearlDetailViewModel.AudioAttributesCompatParcelizer(str, fillwindow);
            if (setwindow.RemoteActionCompatParcelizer().length() > 0) {
                getLatestBitrateEstimate.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(setwindow.read(), "html", setwindow.RemoteActionCompatParcelizer());
            }
            PearlDetailViewModel.this.AudioAttributesImplBaseParcelizer.write(QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(int i, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailViewModel.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(int p0) {
        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().read().size() < p0 || p0 == -1 || p0 == this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().intValue()) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.MapUtils
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(PearlDetailViewModel pearlDetailViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlDetailViewModel.AudioAttributesImplApi21Parcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String p0, fillWindow p1) {
        isSeekPending isseekpending = this.read;
        InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
        isseekpending.write(InstallStatusListener.IconCompatParcelizer(p0, p1.getAudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }
}

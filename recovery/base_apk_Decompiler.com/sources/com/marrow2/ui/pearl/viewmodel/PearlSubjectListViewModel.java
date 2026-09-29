package com.marrow2.ui.pearl.viewmodel;

import com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.InstallStatusListener;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.readLittleEndianUnsignedShort;
import kotlin.readUnsignedInt;
import kotlin.registerAcquireEvent;
import kotlin.registerReleaseEvent;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u001b8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u0013\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020!0\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001a\u0010$"}, d2 = {"Lcom/marrow2/ui/pearl/viewmodel/PearlSubjectListViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readLittleEndianUnsignedShort;", "p0", "Lo/isSeekPending;", "p1", "<init>", "(Lo/readLittleEndianUnsignedShort;Lo/isSeekPending;)V", "Lo/registerAcquireEvent;", "", "RemoteActionCompatParcelizer", "(Lo/registerAcquireEvent;)V", "MediaBrowserCompatItemReceiver", "()V", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/readLittleEndianUnsignedShort;", "read", "AudioAttributesCompatParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "", "Lo/readUnsignedInt;", "Lo/getResolutionSize;", "IconCompatParcelizer", "Lo/isDark;", "Lo/isDark;", "()Lo/isDark;", "", "write", "AudioAttributesImplBaseParcelizer", "Lo/registerReleaseEvent;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PearlSubjectListViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<readUnsignedInt>>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final isDark<Boolean> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<registerReleaseEvent> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final readLittleEndianUnsignedShort read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<readUnsignedInt>>> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getResolutionSize<registerReleaseEvent> MediaBrowserCompatItemReceiver;

    @setSdkPayload
    public PearlSubjectListViewModel(readLittleEndianUnsignedShort readlittleendianunsignedshort, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(readlittleendianunsignedshort, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.read = readlittleendianunsignedshort;
        this.RemoteActionCompatParcelizer = isseekpending;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<readUnsignedInt>>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<registerReleaseEvent> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(registerReleaseEvent.read.INSTANCE);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi26Parcelizer();
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<readUnsignedInt>>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final isDark<Boolean> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<registerReleaseEvent> IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(registerAcquireEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, registerAcquireEvent.IconCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (p0 instanceof registerAcquireEvent.write) {
            isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
            InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
            registerAcquireEvent.write writeVar = (registerAcquireEvent.write) p0;
            isseekpending.write(InstallStatusListener.read(writeVar.RemoteActionCompatParcelizer().IconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.MediaBrowserCompatItemReceiver.write(new registerReleaseEvent.RemoteActionCompatParcelizer(writeVar.RemoteActionCompatParcelizer()));
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, registerAcquireEvent.AudioAttributesCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        this.MediaBrowserCompatItemReceiver.write(registerReleaseEvent.read.INSTANCE);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (((kotlin.NewNumberOtpResendRequest) r6).write(new com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer.AnonymousClass2(r5.read), r5) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel r6 = com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.this
                o.readLittleEndianUnsignedShort r6 = com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.write = r3
                java.lang.Object r6 = r6.IconCompatParcelizer(r1)
                if (r6 == r0) goto L4f
            L32:
                o.NewNumberOtpResendRequest r6 = (kotlin.NewNumberOtpResendRequest) r6
                com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2 r1 = new com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2
                com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel r3 = com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.this
                r1.<init>(r3)
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r5.RemoteActionCompatParcelizer = r4
                r5.write = r2
                java.lang.Object r5 = r6.write(r1, r3)
                if (r5 != r0) goto L4c
                goto L4f
            L4c:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L4f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements getValidationToken {
            private /* synthetic */ PearlSubjectListViewModel IconCompatParcelizer;

            /* JADX INFO: renamed from: com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
            static final class C0009AudioAttributesCompatParcelizer extends getTotalMcq {
                /* synthetic */ Object IconCompatParcelizer;
                private /* synthetic */ AnonymousClass2<T> RemoteActionCompatParcelizer;
                Object read;
                int write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0009AudioAttributesCompatParcelizer(AnonymousClass2<? super T> anonymousClass2, SampleVideos<? super C0009AudioAttributesCompatParcelizer> sampleVideos) {
                    super(sampleVideos);
                    this.RemoteActionCompatParcelizer = anonymousClass2;
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.IconCompatParcelizer = obj;
                    this.write |= Integer.MIN_VALUE;
                    return this.RemoteActionCompatParcelizer.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.getValidationToken
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(java.util.List<kotlin.readUnsignedInt> r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer.AnonymousClass2.C0009AudioAttributesCompatParcelizer
                    if (r0 == 0) goto L14
                    r0 = r6
                    com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2$AudioAttributesCompatParcelizer r0 = (com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer.AnonymousClass2.C0009AudioAttributesCompatParcelizer) r0
                    int r1 = r0.write
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r6 = r0.write
                    int r6 = r6 + r2
                    r0.write = r6
                    goto L19
                L14:
                    com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2$AudioAttributesCompatParcelizer r0 = new com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel$AudioAttributesCompatParcelizer$2$AudioAttributesCompatParcelizer
                    r0.<init>(r4, r6)
                L19:
                    java.lang.Object r6 = r0.IconCompatParcelizer
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.write
                    r3 = 1
                    if (r2 == 0) goto L36
                    if (r2 != r3) goto L2e
                    java.lang.Object r5 = r0.read
                    java.util.List r5 = (java.util.List) r5
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L4a
                L2e:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L36:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel r6 = r4.IconCompatParcelizer
                    o.readLittleEndianUnsignedShort r6 = com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer(r6)
                    r0.read = r5
                    r0.write = r3
                    java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r0)
                    if (r6 != r1) goto L4a
                    return r1
                L4a:
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    o.readUnsignedInt r0 = new o.readUnsignedInt
                    java.lang.String r1 = "100"
                    java.lang.String r2 = "All"
                    r0.<init>(r1, r2, r6)
                    java.util.Collection r5 = (java.util.Collection) r5
                    java.util.List r5 = kotlin.IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver(r5)
                    r6 = 0
                    r5.add(r6, r0)
                    com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel r4 = r4.IconCompatParcelizer
                    o.getResolutionSize r4 = com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.read(r4)
                    kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(r4, r5)
                    o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel.AudioAttributesCompatParcelizer.AnonymousClass2.IconCompatParcelizer(java.util.List, o.SampleVideos):java.lang.Object");
            }

            AnonymousClass2(PearlSubjectListViewModel pearlSubjectListViewModel) {
                this.IconCompatParcelizer = pearlSubjectListViewModel;
            }
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlSubjectListViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.isAtLeastIceCreamSandwichMR1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlSubjectListViewModel.write(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(PearlSubjectListViewModel pearlSubjectListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(pearlSubjectListViewModel.IconCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = PearlSubjectListViewModel.this.write;
                this.IconCompatParcelizer = getresolutionsize2;
                this.write = 1;
                Object objAudioAttributesImplApi26Parcelizer = PearlSubjectListViewModel.this.read.AudioAttributesImplApi26Parcelizer(this);
                if (objAudioAttributesImplApi26Parcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objAudioAttributesImplApi26Parcelizer;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(obj);
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlSubjectListViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.NumberUtils
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlSubjectListViewModel.RemoteActionCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(PearlSubjectListViewModel pearlSubjectListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlSubjectListViewModel.write.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (PearlSubjectListViewModel.this.read.MediaBrowserCompatCustomActionResultReceiver(this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlSubjectListViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.isAtLeastJellyBeanMR1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlSubjectListViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}

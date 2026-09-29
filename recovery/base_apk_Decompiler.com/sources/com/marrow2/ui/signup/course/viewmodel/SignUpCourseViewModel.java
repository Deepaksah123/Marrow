package com.marrow2.ui.signup.course.viewmodel;

import com.marrow.TrainingApplication;
import com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LatLng;
import kotlin.LatLngBounds;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.including;
import kotlin.isSeekPending;
import kotlin.peekChar;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020#0&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0010\u0010)R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020*0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020*0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b\u001b\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010$R \u0010-\u001a\b\u0012\u0004\u0012\u00020+0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b\u0015\u0010)R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010."}, d2 = {"Lcom/marrow2/ui/signup/course/viewmodel/SignUpCourseViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/getDisplaySizeV17;", "p1", "Lcom/marrow/TrainingApplication;", "p2", "Lo/LogLogLevel;", "p3", "Lo/isSeekPending;", "p4", "<init>", "(Lo/peekChar;Lo/getDisplaySizeV17;Lcom/marrow/TrainingApplication;Lo/LogLogLevel;Lo/isSeekPending;)V", "Lo/including;", "", "read", "(Lo/including;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "", "AudioAttributesCompatParcelizer", "(IILo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "Lo/peekChar;", "MediaDescriptionCompat", "Lo/getDisplaySizeV17;", "IconCompatParcelizer", "Lcom/marrow/TrainingApplication;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/LogLogLevel;", "Lo/isSeekPending;", "write", "Lo/getResolutionSize;", "Lo/LatLngBounds;", "Lo/getResolutionSize;", "MediaBrowserCompatItemReceiver", "Lo/setUpdatedStatus;", "MediaBrowserCompatSearchResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/LatLng;", "", "AudioAttributesImplApi26Parcelizer", "RatingCompat", "I", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignUpCourseViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<LatLngBounds> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final LogLogLevel read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final peekChar AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<LatLng> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<LatLngBounds> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<LatLng> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final TrainingApplication RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi26Parcelizer;

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return SignUpCourseViewModel.this.AudioAttributesCompatParcelizer(0, 0, this);
        }
    }

    @setSdkPayload
    public SignUpCourseViewModel(peekChar peekchar, getDisplaySizeV17 getdisplaysizev17, TrainingApplication trainingApplication, LogLogLevel logLogLevel, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(trainingApplication, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = peekchar;
        this.IconCompatParcelizer = getdisplaysizev17;
        this.RemoteActionCompatParcelizer = trainingApplication;
        this.read = logLogLevel;
        this.write = isseekpending;
        getResolutionSize<LatLngBounds> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(LatLngBounds.IconCompatParcelizer.INSTANCE);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<LatLng> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new LatLng(null, 0, 3, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        this.MediaMetadataCompat = -1;
        read(including.AudioAttributesCompatParcelizer.INSTANCE);
    }

    public final setUpdatedStatus<LatLngBounds> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<LatLng> IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesCompatParcelizer() {
        return this.RatingCompat;
    }

    public final void read(including p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, including.AudioAttributesCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, including.write.INSTANCE)) {
            this.MediaBrowserCompatItemReceiver.write(LatLngBounds.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, including.IconCompatParcelizer.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatItemReceiver.write(LatLngBounds.IconCompatParcelizer.INSTANCE);
        } else {
            if (!(p0 instanceof including.read)) {
                throw new RenewEligibleCreator();
            }
            this.MediaMetadataCompat = Integer.parseInt(((including.read) p0).RemoteActionCompatParcelizer().getCourseId());
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L5f
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L3f
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r5 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.MediaBrowserCompatItemReceiver(r5)
                java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
                r5.write(r1)
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r5 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                o.getDisplaySizeV17 r5 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.IconCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.IconCompatParcelizer = r3
                java.lang.Object r5 = r5.onPlay(r1)
                if (r5 == r0) goto L86
            L3f:
                o.getLocaleLanguageTagV21 r5 = (kotlin.getLocaleLanguageTagV21) r5
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r1 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                int r5 = r5.RemoteActionCompatParcelizer()
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.RemoteActionCompatParcelizer(r1, r5)
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r5 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                o.peekChar r5 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.read(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r3 = 0
                r4.read = r3
                r4.IconCompatParcelizer = r2
                java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r1)
                if (r5 != r0) goto L5f
                goto L86
            L5f:
                java.util.List r5 = (java.util.List) r5
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r0 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                o.getResolutionSize r0 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.RemoteActionCompatParcelizer(r0)
                o.LatLng r1 = new o.LatLng
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r2 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                int r2 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.write(r2)
                r1.<init>(r5, r2)
                r0.write(r1)
                com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel r4 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.this
                o.getResolutionSize r4 = com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.MediaBrowserCompatItemReceiver(r4)
                r5 = 0
                java.lang.Boolean r5 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
                r4.write(r5)
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L86:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SignUpCourseViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.Marker
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SignUpCourseViewModel.write(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(SignUpCourseViewModel signUpCourseViewModel, int i, String str) {
        LatLngBounds.write writeVar;
        toMagicModuleMetaRepoModel.write(str, "");
        getResolutionSize<LatLngBounds> getresolutionsize = signUpCourseViewModel.MediaBrowserCompatItemReceiver;
        if (i == 502) {
            writeVar = LatLngBounds.RemoteActionCompatParcelizer.INSTANCE;
        } else {
            writeVar = new LatLngBounds.write(str);
        }
        getresolutionsize.write(writeVar);
        signUpCourseViewModel.AudioAttributesImplApi26Parcelizer.write(Boolean.FALSE);
        signUpCourseViewModel.AudioAttributesImplApi21Parcelizer.write(new LatLng(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), signUpCourseViewModel.MediaMetadataCompat));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        if (r9.read(r11, r10, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1 A[PHI: r10 r11
      0x00b1: PHI (r10v4 int) = (r10v3 int), (r10v7 int) binds: [B:26:0x00af, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r11v4 int) = (r11v3 int), (r11v7 int) binds: [B:26:0x00af, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(int r10, int r11, kotlin.SampleVideos<? super kotlin.getShowPopup> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.AudioAttributesCompatParcelizer(int, int, o.SampleVideos):java.lang.Object");
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SignUpCourseViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.MapStyleOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SignUpCourseViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(SignUpCourseViewModel signUpCourseViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 502) {
            signUpCourseViewModel.MediaBrowserCompatItemReceiver.write(LatLngBounds.RemoteActionCompatParcelizer.INSTANCE);
        } else {
            signUpCourseViewModel.MediaBrowserCompatItemReceiver.write(new LatLngBounds.write(str));
        }
        signUpCourseViewModel.AudioAttributesImplApi26Parcelizer.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }
}

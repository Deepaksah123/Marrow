package com.marrow2.ui.video.lesson_list;

import com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DtsReader;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RepeatModeUtil;
import kotlin.ReviewInfo;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.lambdanewSingleThreadScheduledExecutor4;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016"}, d2 = {"Lcom/marrow2/ui/video/lesson_list/VideoLessonListActivityViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/lambdanewSingleThreadScheduledExecutor4;", "p1", "<init>", "(Lo/POJOPropertyBuilder5;Lo/lambdanewSingleThreadScheduledExecutor4;)V", "", "", "write", "(Ljava/lang/String;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/lambdanewSingleThreadScheduledExecutor4;", "IconCompatParcelizer", "Lo/fromCursor;", "Lo/z;", "Lo/fromCursor;", "AudioAttributesCompatParcelizer", "Lo/NewNumberOtpResendRequest;", "read", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoLessonListActivityViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final lambdanewSingleThreadScheduledExecutor4 IconCompatParcelizer;
    private final NewNumberOtpResendRequest<z> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final fromCursor<z> AudioAttributesCompatParcelizer;

    @setSdkPayload
    public VideoLessonListActivityViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        this.IconCompatParcelizer = lambdanewsinglethreadscheduledexecutor4;
        fromCursor<z> fromcursor = getLastName.read(0, null, 7);
        this.AudioAttributesCompatParcelizer = fromcursor;
        this.read = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass2(pOJOPropertyBuilder5, null), new MagicModuleSubmissionRequestBody() { // from class: o.aj
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListActivityViewModel.write(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    public final NewNumberOtpResendRequest<z> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ POJOPropertyBuilder5 write;

        /* JADX INFO: renamed from: com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ VideoLessonListActivityViewModel RemoteActionCompatParcelizer;
            private /* synthetic */ POJOPropertyBuilder5 read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    VideoLessonListActivityViewModel videoLessonListActivityViewModel = this.RemoteActionCompatParcelizer;
                    ReviewInfo.Companion companion = ReviewInfo.INSTANCE;
                    String remoteActionCompatParcelizer = ReviewInfo.Companion.RemoteActionCompatParcelizer(this.read).getRemoteActionCompatParcelizer();
                    this.IconCompatParcelizer = 1;
                    if (videoLessonListActivityViewModel.write(remoteActionCompatParcelizer) == objIconCompatParcelizer) {
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
            AnonymousClass4(VideoLessonListActivityViewModel videoLessonListActivityViewModel, POJOPropertyBuilder5 pOJOPropertyBuilder5, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = videoLessonListActivityViewModel;
                this.read = pOJOPropertyBuilder5;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass4(VideoLessonListActivityViewModel.this, this.write, null), this) == objIconCompatParcelizer) {
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
        AnonymousClass2(POJOPropertyBuilder5 pOJOPropertyBuilder5, SampleVideos<? super AnonymousClass2> sampleVideos) {
            super(1, sampleVideos);
            this.write = pOJOPropertyBuilder5;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListActivityViewModel.this.new AnonymousClass2(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass2) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (VideoLessonListActivityViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(z.RemoteActionCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return VideoLessonListActivityViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(VideoLessonListActivityViewModel videoLessonListActivityViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        DtsReader.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(new Throwable(str));
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(videoLessonListActivityViewModel), null, null, videoLessonListActivityViewModel.new read(null), 3);
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String write;

        public static final /* synthetic */ class read {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[RepeatModeUtil.values().length];
                try {
                    iArr[RepeatModeUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                write = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        
            if (r7.read.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new o.z.AudioAttributesCompatParcelizer(r8.read()), r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.read.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(o.z.write.INSTANCE, r7) == r0) goto L30;
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
                int r1 = r7.IconCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L83
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L38
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel r8 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.this
                o.lambdanewSingleThreadScheduledExecutor4 r8 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.AudioAttributesCompatParcelizer(r8)
                java.lang.String r1 = r7.write
                r5 = r7
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r7.IconCompatParcelizer = r4
                java.lang.Object r8 = r8.MediaBrowserCompatMediaItem(r1, r5)
                if (r8 == r0) goto L86
            L38:
                o.newSingleThreadExecutor r8 = (kotlin.newSingleThreadExecutor) r8
                r1 = 0
                if (r8 == 0) goto L42
                o.RepeatModeUtil r5 = r8.write()
                goto L43
            L42:
                r5 = r1
            L43:
                if (r5 != 0) goto L46
                goto L6d
            L46:
                int[] r6 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.write.read.write
                int r5 = r5.ordinal()
                r5 = r6[r5]
                if (r5 != r4) goto L6d
                com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel r2 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.this
                o.fromCursor r2 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.write(r2)
                java.lang.String r8 = r8.read()
                o.z$AudioAttributesCompatParcelizer r4 = new o.z$AudioAttributesCompatParcelizer
                r4.<init>(r8)
                r8 = r7
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r7.RemoteActionCompatParcelizer = r1
                r7.IconCompatParcelizer = r3
                java.lang.Object r7 = r2.RemoteActionCompatParcelizer(r4, r8)
                if (r7 != r0) goto L83
                goto L86
            L6d:
                com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel r8 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.this
                o.fromCursor r8 = com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.write(r8)
                o.z$write r3 = o.z.write.INSTANCE
                r4 = r7
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r7.RemoteActionCompatParcelizer = r1
                r7.IconCompatParcelizer = r2
                java.lang.Object r7 = r8.RemoteActionCompatParcelizer(r3, r4)
                if (r7 != r0) goto L83
                goto L86
            L83:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L86:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListActivityViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListActivityViewModel.this.new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object write(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.ag
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListActivityViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}

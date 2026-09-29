package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class VideoAnalyticFinalSession<T> implements isDark<T> {
    private final isDark<T> AudioAttributesCompatParcelizer;
    private final MagicModuleSubmissionRequestBody<getValidationToken<? super T>, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object read;
        private /* synthetic */ VideoAnalyticFinalSession<T> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(VideoAnalyticFinalSession<T> videoAnalyticFinalSession, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.write = videoAnalyticFinalSession;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.write(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAnalyticFinalSession(isDark<? extends T> isdark, MagicModuleSubmissionRequestBody<? super getValidationToken<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        this.AudioAttributesCompatParcelizer = isdark;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isDark, kotlin.NewNumberOtpResendRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.getValidationToken<? super T> r5, kotlin.SampleVideos<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.VideoAnalyticFinalSession.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.VideoAnalyticFinalSession$AudioAttributesCompatParcelizer r0 = (o.VideoAnalyticFinalSession.AudioAttributesCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r6 + r2
            r0.AudioAttributesCompatParcelizer = r6
            goto L19
        L14:
            o.VideoAnalyticFinalSession$AudioAttributesCompatParcelizer r0 = new o.VideoAnalyticFinalSession$AudioAttributesCompatParcelizer
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L49
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.isDark<T> r6 = r4.AudioAttributesCompatParcelizer
            o.TimelinePYTMap r2 = new o.TimelinePYTMap
            o.MagicModuleSubmissionRequestBody<o.getValidationToken<? super T>, o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r4 = r4.RemoteActionCompatParcelizer
            r2.<init>(r5, r4)
            o.getValidationToken r2 = (kotlin.getValidationToken) r2
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r4 = r6.write(r2, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            o.PlanDetailsCreator r4 = new o.PlanDetailsCreator
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoAnalyticFinalSession.write(o.getValidationToken, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.isDark
    public final List<T> bm_() {
        return this.AudioAttributesCompatParcelizer.bm_();
    }
}

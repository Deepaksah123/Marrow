package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/isRepeatModeEnabled;", "Lo/blockUntilFinished;", "Lo/BandwidthEstimator;", "p0", "Lo/getPlayerStateString;", "p1", "<init>", "(Lo/BandwidthEstimator;Lo/getPlayerStateString;)V", "", "Lo/getElapsedRealtimeOffsetMs;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "", "Lo/blockUntilStarted;", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/isCancelled;", "write", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/BandwidthEstimator;", "read", "Lo/getPlayerStateString;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isRepeatModeEnabled implements blockUntilFinished {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final BandwidthEstimator write;
    private final getPlayerStateString read;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return isRepeatModeEnabled.this.write(null, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return isRepeatModeEnabled.this.RemoteActionCompatParcelizer(null, null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return isRepeatModeEnabled.this.RemoteActionCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public isRepeatModeEnabled(BandwidthEstimator bandwidthEstimator, getPlayerStateString getplayerstatestring) {
        toMagicModuleMetaRepoModel.write(bandwidthEstimator, "");
        toMagicModuleMetaRepoModel.write(getplayerstatestring, "");
        this.write = bandwidthEstimator;
        this.read = getplayerstatestring;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.blockUntilFinished
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r5, java.lang.String r6, kotlin.SampleVideos<? super kotlin.getElapsedRealtimeOffsetMs> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.isRepeatModeEnabled.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.isRepeatModeEnabled$IconCompatParcelizer r0 = (o.isRepeatModeEnabled.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.isRepeatModeEnabled$IconCompatParcelizer r0 = new o.isRepeatModeEnabled$IconCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.BandwidthEstimator r4 = r4.write
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r7 = r4.IconCompatParcelizer(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            o.ExperimentalBandwidthMeter r7 = (kotlin.ExperimentalBandwidthMeter) r7
            o.getElapsedRealtimeOffsetMs r4 = kotlin.RunnableFutureTask.AudioAttributesCompatParcelizer(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isRepeatModeEnabled.RemoteActionCompatParcelizer(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r10 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[LOOP:0: B:45:0x00d6->B:47:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.blockUntilFinished
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super java.util.List<kotlin.blockUntilStarted>> r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isRepeatModeEnabled.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.blockUntilFinished
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r5, kotlin.SampleVideos<? super kotlin.isCancelled> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.isRepeatModeEnabled.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.isRepeatModeEnabled$AudioAttributesCompatParcelizer r0 = (o.isRepeatModeEnabled.AudioAttributesCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.isRepeatModeEnabled$AudioAttributesCompatParcelizer r0 = new o.isRepeatModeEnabled$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.BandwidthEstimator r4 = r4.write
            r6 = 0
            r0.IconCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r6 = r4.read(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            o.getBandwidthEstimate r6 = (kotlin.getBandwidthEstimate) r6
            o.isCancelled r4 = kotlin.RunnableFutureTask.IconCompatParcelizer(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isRepeatModeEnabled.write(java.lang.String, o.SampleVideos):java.lang.Object");
    }
}

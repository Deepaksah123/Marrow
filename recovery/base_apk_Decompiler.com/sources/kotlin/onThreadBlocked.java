package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class onThreadBlocked implements BundleableUtilExternalSyntheticLambda0 {
    private final CodecSpecificDataUtil write;

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return onThreadBlocked.this.write(null, null, 0, this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return onThreadBlocked.this.read(null, null, 0, this);
        }
    }

    @setSdkPayload
    public onThreadBlocked(CodecSpecificDataUtil codecSpecificDataUtil) {
        toMagicModuleMetaRepoModel.write(codecSpecificDataUtil, "");
        this.write = codecSpecificDataUtil;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.BundleableUtilExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r5, java.lang.String r6, int r7, kotlin.SampleVideos<? super java.util.List<com.marrow2.data.search.remote.model.SearchTextResponseBody>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.onThreadBlocked.read
            if (r0 == 0) goto L14
            r0 = r8
            o.onThreadBlocked$read r0 = (o.onThreadBlocked.read) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.RemoteActionCompatParcelizer
            int r8 = r8 + r2
            r0.RemoteActionCompatParcelizer = r8
            goto L19
        L14:
            o.onThreadBlocked$read r0 = new o.onThreadBlocked$read
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r4 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.lang.Object r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L4d
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.CodecSpecificDataUtil r4 = r4.write
            r8 = 0
            r0.write = r8
            r0.IconCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r8 = r4.write(r5, r6, r7, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            com.marrow2.core.network.model.NetworkApiResponse r8 = (com.marrow2.core.network.model.NetworkApiResponse) r8
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onThreadBlocked.write(java.lang.String, java.lang.String, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.BundleableUtilExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r5, java.lang.String r6, int r7, kotlin.SampleVideos<? super com.marrow2.data.search.remote.model.SearchMcqResponseBody> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.onThreadBlocked.write
            if (r0 == 0) goto L14
            r0 = r8
            o.onThreadBlocked$write r0 = (o.onThreadBlocked.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            o.onThreadBlocked$write r0 = new o.onThreadBlocked$write
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r4 = r0.RemoteActionCompatParcelizer
            java.lang.Object r4 = r0.write
            java.lang.Object r4 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L4d
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.CodecSpecificDataUtil r4 = r4.write
            r8 = 0
            r0.IconCompatParcelizer = r8
            r0.write = r8
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r8 = r4.read(r5, r6, r7, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            com.marrow2.core.network.model.NetworkApiResponse r8 = (com.marrow2.core.network.model.NetworkApiResponse) r8
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onThreadBlocked.read(java.lang.String, java.lang.String, int, o.SampleVideos):java.lang.Object");
    }
}

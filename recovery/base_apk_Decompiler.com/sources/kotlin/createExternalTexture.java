package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class createExternalTexture implements createBuffer {
    private final GlProgram read;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return createExternalTexture.this.read(null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return createExternalTexture.this.AudioAttributesCompatParcelizer(null, null, this);
        }
    }

    @setSdkPayload
    public createExternalTexture(GlProgram glProgram) {
        toMagicModuleMetaRepoModel.write(glProgram, "");
        this.read = glProgram;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r5, kotlin.SampleVideos<? super com.marrow2.data.test.remote.model.TestScoreRSModel> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.createExternalTexture.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.createExternalTexture$IconCompatParcelizer r0 = (o.createExternalTexture.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            o.createExternalTexture$IconCompatParcelizer r0 = new o.createExternalTexture$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.GlProgram r4 = r4.read
            r6 = 0
            r0.read = r6
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r4.IconCompatParcelizer(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.marrow2.core.network.model.NetworkApiResponse r6 = (com.marrow2.core.network.model.NetworkApiResponse) r6
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createExternalTexture.read(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r5, java.lang.String r6, kotlin.SampleVideos<? super com.marrow2.data.test.remote.model.TestScoreRSModel> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.createExternalTexture.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.createExternalTexture$RemoteActionCompatParcelizer r0 = (o.createExternalTexture.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            o.createExternalTexture$RemoteActionCompatParcelizer r0 = new o.createExternalTexture$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.GlProgram r4 = r4.read
            r7 = 0
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r7 = r4.read(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.marrow2.core.network.model.NetworkApiResponse r7 = (com.marrow2.core.network.model.NetworkApiResponse) r7
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createExternalTexture.AudioAttributesCompatParcelizer(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }
}

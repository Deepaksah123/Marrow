package kotlin;

import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class addShader implements getAttributeLocation {
    private final Lazy<FrameInfo1> read;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return addShader.this.AudioAttributesCompatParcelizer(0, 0, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return addShader.this.AudioAttributesCompatParcelizer(0, 0, null, this);
        }
    }

    @setSdkPayload
    public addShader(Lazy<FrameInfo1> lazy) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.read = lazy;
    }

    private final FrameInfo1 IconCompatParcelizer() {
        FrameInfo1 frameInfo1 = this.read.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameInfo1, "");
        return frameInfo1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getAttributeLocation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(int r5, int r6, kotlin.SampleVideos<? super kotlin.loadAsset> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.addShader.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.addShader$AudioAttributesCompatParcelizer r0 = (o.addShader.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            o.addShader$AudioAttributesCompatParcelizer r0 = new o.addShader$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r4 = r0.write
            int r4 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.FrameInfo1 r4 = r4.IconCompatParcelizer()
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r6
            r0.read = r3
            java.lang.Object r7 = r4.RemoteActionCompatParcelizer(r5, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.marrow2.data.test.remote.model.GTAnalyticsV2RSModel r7 = (com.marrow2.data.test.remote.model.GTAnalyticsV2RSModel) r7
            o.loadAsset r4 = kotlin.setFloatUniform.write(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addShader.AudioAttributesCompatParcelizer(int, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getAttributeLocation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(int r5, int r6, java.lang.String r7, kotlin.SampleVideos<? super kotlin.setSamplerTexIdUniform> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.addShader.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.addShader$RemoteActionCompatParcelizer r0 = (o.addShader.RemoteActionCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.addShader$RemoteActionCompatParcelizer r0 = new o.addShader$RemoteActionCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r4 = r0.RemoteActionCompatParcelizer
            int r4 = r0.IconCompatParcelizer
            java.lang.Object r4 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L4f
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.FrameInfo1 r4 = r4.IconCompatParcelizer()
            r8 = 0
            r0.read = r8
            r0.IconCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r8 = r4.write(r5, r6, r7, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            com.marrow2.data.test.remote.model.GTSubjectAnalyticsV2RSModel r8 = (com.marrow2.data.test.remote.model.GTSubjectAnalyticsV2RSModel) r8
            o.setSamplerTexIdUniform r4 = kotlin.GlProgramAttribute.write(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addShader.AudioAttributesCompatParcelizer(int, int, java.lang.String, o.SampleVideos):java.lang.Object");
    }
}

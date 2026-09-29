package kotlin;

import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class createFocusedPlaceholderEglSurface implements GlObjectsProvider1 {
    private final getMediaItemTransitionReasonString AudioAttributesCompatParcelizer;
    private final Lazy<GlObjectsProvider> write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return createFocusedPlaceholderEglSurface.this.RemoteActionCompatParcelizer(null, this);
        }
    }

    @setSdkPayload
    public createFocusedPlaceholderEglSurface(getMediaItemTransitionReasonString getmediaitemtransitionreasonstring, Lazy<GlObjectsProvider> lazy) {
        toMagicModuleMetaRepoModel.write(getmediaitemtransitionreasonstring, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.AudioAttributesCompatParcelizer = getmediaitemtransitionreasonstring;
        this.write = lazy;
    }

    private final GlObjectsProvider IconCompatParcelizer() {
        GlObjectsProvider glObjectsProvider = this.write.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(glObjectsProvider, "");
        return glObjectsProvider;
    }

    private Object IconCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    private Object read(GlProgramUniform glProgramUniform, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultDisplayLocale.write(glProgramUniform));
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.GlObjectsProvider1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r8, kotlin.SampleVideos<? super kotlin.GlProgramUniform> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.createFocusedPlaceholderEglSurface.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.createFocusedPlaceholderEglSurface$AudioAttributesCompatParcelizer r0 = (o.createFocusedPlaceholderEglSurface.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o.createFocusedPlaceholderEglSurface$AudioAttributesCompatParcelizer r0 = new o.createFocusedPlaceholderEglSurface$AudioAttributesCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5e
            if (r2 == r5) goto L56
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            int r7 = r0.write
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            com.marrow2.data.test.remote.model.TestAnalyticsRSModel r7 = (com.marrow2.data.test.remote.model.TestAnalyticsRSModel) r7
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r8 = r0.read
            java.lang.String r8 = (java.lang.String) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L9a
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            int r8 = r0.write
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            com.marrow2.data.test.remote.model.TestAnalyticsRSModel r2 = (com.marrow2.data.test.remote.model.TestAnalyticsRSModel) r2
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.lang.Object r5 = r0.read
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            r9 = r4
            goto L84
        L56:
            java.lang.Object r8 = r0.read
            java.lang.String r8 = (java.lang.String) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L6f
        L5e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.GlObjectsProvider r9 = r7.IconCompatParcelizer()
            r0.read = r8
            r0.RemoteActionCompatParcelizer = r5
            java.lang.Object r9 = r9.AudioAttributesCompatParcelizer(r8, r0)
            if (r9 == r1) goto La1
        L6f:
            r2 = r9
            com.marrow2.data.test.remote.model.TestAnalyticsRSModel r2 = (com.marrow2.data.test.remote.model.TestAnalyticsRSModel) r2
            r0.read = r6
            r0.IconCompatParcelizer = r9
            r0.AudioAttributesCompatParcelizer = r2
            r5 = 0
            r0.write = r5
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r8 = r7.IconCompatParcelizer(r8, r0)
            if (r8 == r1) goto La1
            r8 = r5
        L84:
            o.GlProgramUniform r2 = kotlin.getFboId.write(r2)
            r0.read = r6
            r0.IconCompatParcelizer = r9
            r0.AudioAttributesCompatParcelizer = r6
            r0.write = r8
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = r7.read(r2, r0)
            if (r7 != r1) goto L99
            goto La1
        L99:
            r7 = r9
        L9a:
            com.marrow2.data.test.remote.model.TestAnalyticsRSModel r7 = (com.marrow2.data.test.remote.model.TestAnalyticsRSModel) r7
            o.GlProgramUniform r7 = kotlin.getFboId.write(r7)
            return r7
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFocusedPlaceholderEglSurface.RemoteActionCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }
}

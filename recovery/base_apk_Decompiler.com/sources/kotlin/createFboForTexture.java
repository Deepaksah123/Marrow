package kotlin;

import dagger.Lazy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createFboForTexture implements create4x4IdentityMatrix {
    private final bindTexture IconCompatParcelizer;
    private final Lazy<createBuffer> RemoteActionCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return createFboForTexture.this.read(null, null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return createFboForTexture.this.write(null, this);
        }
    }

    @setSdkPayload
    public createFboForTexture(bindTexture bindtexture, Lazy<createBuffer> lazy) {
        toMagicModuleMetaRepoModel.write(bindtexture, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.IconCompatParcelizer = bindtexture;
        this.RemoteActionCompatParcelizer = lazy;
    }

    private final createBuffer IconCompatParcelizer() {
        createBuffer createbuffer = this.RemoteActionCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createbuffer, "");
        return createbuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[PHI: r9
      0x00a2: PHI (r9v3 java.lang.String) = (r9v1 java.lang.String), (r9v2 java.lang.String), (r9v12 java.lang.String) binds: [B:23:0x0074, B:27:0x00a0, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.create4x4IdentityMatrix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r9, kotlin.SampleVideos<? super kotlin.checkGlError> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o.createFboForTexture.read
            if (r0 == 0) goto L14
            r0 = r10
            o.createFboForTexture$read r0 = (o.createFboForTexture.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.write
            int r10 = r10 + r2
            r0.write = r10
            goto L19
        L14:
            o.createFboForTexture$read r0 = new o.createFboForTexture$read
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5f
            if (r2 == r6) goto L57
            if (r2 == r5) goto L4f
            if (r2 == r3) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.String r8 = (java.lang.String) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto Lb3
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            int r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r9 = r0.read
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.String r9 = (java.lang.String) r9
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto La2
        L4f:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.String r9 = (java.lang.String) r9
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L84
        L57:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.String r9 = (java.lang.String) r9
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L6e
        L5f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.bindTexture r10 = r8.IconCompatParcelizer
            r0.IconCompatParcelizer = r9
            r0.write = r6
            java.lang.Object r10 = r10.read(r9)
            if (r10 == r1) goto Lbb
        L6e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto La2
            o.createBuffer r10 = r8.IconCompatParcelizer()
            r0.IconCompatParcelizer = r9
            r0.write = r5
            java.lang.Object r10 = r10.read(r9, r0)
            if (r10 == r1) goto Lbb
        L84:
            r2 = r10
            com.marrow2.data.test.remote.model.TestScoreRSModel r2 = (com.marrow2.data.test.remote.model.TestScoreRSModel) r2
            java.lang.String r5 = "-1"
            o.checkGlError r2 = kotlin.clearOutputFrame.read(r2, r9, r5)
            java.util.List r2 = r2.RemoteActionCompatParcelizer()
            r0.IconCompatParcelizer = r9
            r0.RemoteActionCompatParcelizer = r10
            r0.read = r7
            r10 = 0
            r0.AudioAttributesCompatParcelizer = r10
            r0.write = r3
            java.lang.Object r10 = r8.IconCompatParcelizer(r2, r0)
            if (r10 == r1) goto Lbb
        La2:
            o.bindTexture r8 = r8.IconCompatParcelizer
            r0.IconCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r7
            r0.write = r4
            java.lang.Object r10 = r8.AudioAttributesCompatParcelizer(r9)
            if (r10 != r1) goto Lb3
            goto Lbb
        Lb3:
            o.checkGlError r8 = new o.checkGlError
            java.util.List r10 = (java.util.List) r10
            r8.<init>(r7, r10, r6, r7)
            return r8
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFboForTexture.write(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.create4x4IdentityMatrix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r8, java.lang.String r9, kotlin.SampleVideos<? super kotlin.checkGlError> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof o.createFboForTexture.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            o.createFboForTexture$AudioAttributesCompatParcelizer r0 = (o.createFboForTexture.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.IconCompatParcelizer
            int r10 = r10 + r2
            r0.IconCompatParcelizer = r10
            goto L19
        L14:
            o.createFboForTexture$AudioAttributesCompatParcelizer r0 = new o.createFboForTexture$AudioAttributesCompatParcelizer
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5a
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.read
            java.lang.String r8 = (java.lang.String) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L9b
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.read
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L81
        L4d:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.read
            java.lang.String r8 = (java.lang.String) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L6b
        L5a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.bindTexture r10 = r7.IconCompatParcelizer
            r0.read = r8
            r0.RemoteActionCompatParcelizer = r9
            r0.IconCompatParcelizer = r5
            java.lang.Object r10 = r10.write(r8, r9)
            if (r10 == r1) goto Lbc
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L89
            o.bindTexture r7 = r7.IconCompatParcelizer
            r0.read = r6
            r0.RemoteActionCompatParcelizer = r6
            r0.IconCompatParcelizer = r4
            java.lang.Object r10 = r7.IconCompatParcelizer(r8, r9)
            if (r10 == r1) goto Lbc
        L81:
            o.checkGlError r7 = new o.checkGlError
            java.util.List r10 = (java.util.List) r10
            r7.<init>(r6, r10, r5, r6)
            return r7
        L89:
            o.createBuffer r7 = r7.IconCompatParcelizer()
            r0.read = r8
            r0.RemoteActionCompatParcelizer = r9
            r0.IconCompatParcelizer = r3
            java.lang.Object r10 = r7.AudioAttributesCompatParcelizer(r8, r9, r0)
            if (r10 != r1) goto L9a
            goto Lbc
        L9a:
            r7 = r9
        L9b:
            com.marrow2.data.test.remote.model.TestScoreRSModel r10 = (com.marrow2.data.test.remote.model.TestScoreRSModel) r10
            com.marrow2.data.test.remote.model.StateResultRSModel r9 = r10.getStateResultRSModel()
            if (r9 == 0) goto La7
            o.checkEglException r6 = kotlin.clearOutputFrame.AudioAttributesCompatParcelizer(r9)
        La7:
            java.util.List r9 = r10.getTopRankers()
            if (r9 == 0) goto Lb2
            java.util.List r7 = kotlin.clearOutputFrame.write(r9, r8, r7)
            goto Lb6
        Lb2:
            java.util.List r7 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer()
        Lb6:
            o.checkGlError r8 = new o.checkGlError
            r8.<init>(r6, r7)
            return r8
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFboForTexture.read(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.create4x4IdentityMatrix
    public final Object IconCompatParcelizer(List<createEglDisplay> list, SampleVideos<? super getShowPopup> sampleVideos) {
        this.IconCompatParcelizer.IconCompatParcelizer(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}

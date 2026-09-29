package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007H\u0096@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/marrow2/domain/state/StateUseCaseImpl;", "Lcom/marrow2/domain/state/StateUseCase;", "stateRepository", "Lcom/marrow2/data/state/repo/StateRepository;", "<init>", "(Lcom/marrow2/data/state/repo/StateRepository;)V", "getStateList", "", "Lcom/marrow/data/models/user/State;", "Lcom/marrow2/domain/state/model/StateUCModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStateNames", "", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class castNonNull implements isAbsolute {
    public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(null);
    private final getVideoResolutionFromMpeg4VideoConfig RemoteActionCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return castNonNull.this.IconCompatParcelizer(this);
        }
    }

    static final class read extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return castNonNull.this.RemoteActionCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public castNonNull(getVideoResolutionFromMpeg4VideoConfig getvideoresolutionfrommpeg4videoconfig) {
        toMagicModuleMetaRepoModel.write(getvideoresolutionfrommpeg4videoconfig, "");
        this.RemoteActionCompatParcelizer = getvideoresolutionfrommpeg4videoconfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isAbsolute
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super java.util.List<? extends com.marrow.data.models.user.State>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.castNonNull.read
            if (r0 == 0) goto L14
            r0 = r5
            o.castNonNull$read r0 = (o.castNonNull.read) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.IconCompatParcelizer
            int r5 = r5 + r2
            r0.IconCompatParcelizer = r5
            goto L19
        L14:
            o.castNonNull$read r0 = new o.castNonNull$read
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.getVideoResolutionFromMpeg4VideoConfig r4 = r4.RemoteActionCompatParcelizer
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r4.AudioAttributesCompatParcelizer()
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.marrow.data.models.user.State r1 = (com.marrow.data.models.user.State) r1
            java.lang.String r1 = r1.getId()
            java.lang.String r2 = "101"
            boolean r1 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r1, r2)
            if (r1 != 0) goto L4d
            r4.add(r0)
            goto L4d
        L6a:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.castNonNull.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.isAbsolute
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.util.List<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.castNonNull.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.castNonNull$AudioAttributesCompatParcelizer r0 = (o.castNonNull.AudioAttributesCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            o.castNonNull$AudioAttributesCompatParcelizer r0 = new o.castNonNull$AudioAttributesCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.getVideoResolutionFromMpeg4VideoConfig r4 = r4.RemoteActionCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r4.AudioAttributesCompatParcelizer()
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.marrow.data.models.user.State r1 = (com.marrow.data.models.user.State) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r3 = "101"
            boolean r2 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r3)
            if (r2 != 0) goto L4d
            java.lang.String r1 = r1.getName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L4d
            int r1 = r1.length()
            if (r1 == 0) goto L4d
            r4.add(r0)
            goto L4d
        L78:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r4, r0)
            r5.<init>(r0)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L8d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r4.next()
            com.marrow.data.models.user.State r0 = (com.marrow.data.models.user.State) r0
            java.lang.String r0 = r0.getName()
            r5.add(r0)
            goto L8d
        La1:
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.castNonNull.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/castNonNull$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}

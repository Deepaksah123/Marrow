package kotlin;

import dagger.Lazy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StatsDataSource implements SlidingPercentileSample {
    private final Lazy<getPercentile> read;
    private final ensureSortedByIndex write;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return StatsDataSource.this.write(null, null, this);
        }
    }

    @setSdkPayload
    public StatsDataSource(ensureSortedByIndex ensuresortedbyindex, Lazy<getPercentile> lazy) {
        toMagicModuleMetaRepoModel.write(ensuresortedbyindex, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.write = ensuresortedbyindex;
        this.read = lazy;
    }

    private final getPercentile RemoteActionCompatParcelizer() {
        getPercentile getpercentile = this.read.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getpercentile, "");
        return getpercentile;
    }

    @Override // kotlin.SlidingPercentileSample
    public final Object IconCompatParcelizer(SampleVideos<? super List<addSample>> sampleVideos) {
        return this.write.write(1);
    }

    @Override // kotlin.SlidingPercentileSample
    public final Object write(addSample addsample, SampleVideos<? super getShowPopup> sampleVideos) {
        this.write.read(addsample);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.SlidingPercentileSample
    public final Object read(int i, SampleVideos<? super getShowPopup> sampleVideos) {
        this.write.read(i, 1);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SlidingPercentileSample
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r11, kotlin.addSample r12, kotlin.SampleVideos<? super com.marrow2.data.kyc.remote.model.KycUploadResponseBody> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof o.StatsDataSource.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r13
            o.StatsDataSource$RemoteActionCompatParcelizer r0 = (o.StatsDataSource.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.read
            int r13 = r13 + r2
            r0.read = r13
            goto L19
        L14:
            o.StatsDataSource$RemoteActionCompatParcelizer r0 = new o.StatsDataSource$RemoteActionCompatParcelizer
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            java.lang.Object r10 = r0.IconCompatParcelizer
            o.addSample r10 = (kotlin.addSample) r10
            java.lang.Object r10 = r0.write
            java.lang.String r10 = (java.lang.String) r10
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            return r13
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            java.lang.Object r11 = r0.IconCompatParcelizer
            r12 = r11
            o.addSample r12 = (kotlin.addSample) r12
            java.lang.Object r11 = r0.write
            java.lang.String r11 = (java.lang.String) r11
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            goto L63
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            o.ensureSortedByIndex r13 = r10.write
            java.lang.String r2 = r12.RemoteActionCompatParcelizer()
            r0.write = r11
            r0.IconCompatParcelizer = r12
            r0.read = r4
            java.lang.Object r13 = r13.IconCompatParcelizer(r2)
            if (r13 == r1) goto L9c
        L63:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L69
            java.lang.String r13 = ""
        L69:
            r5 = r13
            long r6 = r12.read()
            int r13 = r12.write()
            java.lang.String r8 = r12.AudioAttributesCompatParcelizer()
            int r9 = r12.IconCompatParcelizer()
            com.marrow2.data.kyc.remote.model.KycUploadRequestBody r12 = new com.marrow2.data.kyc.remote.model.KycUploadRequestBody
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            o.getPercentile r10 = r10.RemoteActionCompatParcelizer()
            r13 = 0
            r0.write = r13
            r0.IconCompatParcelizer = r13
            r0.RemoteActionCompatParcelizer = r13
            r0.AudioAttributesCompatParcelizer = r13
            r0.read = r3
            java.lang.Object r10 = r10.RemoteActionCompatParcelizer(r12, r11, r0)
            if (r10 != r1) goto L9b
            goto L9c
        L9b:
            return r10
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StatsDataSource.write(java.lang.String, o.addSample, o.SampleVideos):java.lang.Object");
    }
}

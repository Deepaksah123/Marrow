package kotlin;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow.data.api.models.response.custommodule.CustomModuleResponseBody;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModel;
import dagger.Lazy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getRtmpDataSource implements setResetOnNetworkTypeChange {
    private final Lazy<setInitialBitrateEstimate> AudioAttributesCompatParcelizer;
    private final setNetworkTypeOverride write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        long IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        boolean MediaBrowserCompatItemReceiver;
        boolean MediaBrowserCompatMediaItem;
        /* synthetic */ Object MediaBrowserCompatSearchResultReceiver;
        int MediaMetadataCompat;
        boolean RatingCompat;
        long RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            return getRtmpDataSource.this.read(0, null, false, 0L, null, 0L, 0L, false, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.read |= Integer.MIN_VALUE;
            return getRtmpDataSource.this.RemoteActionCompatParcelizer(null, null, 0, this);
        }
    }

    @setSdkPayload
    public getRtmpDataSource(setNetworkTypeOverride setnetworktypeoverride, Lazy<setInitialBitrateEstimate> lazy) {
        toMagicModuleMetaRepoModel.write(setnetworktypeoverride, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.write = setnetworktypeoverride;
        this.AudioAttributesCompatParcelizer = lazy;
    }

    private final setInitialBitrateEstimate AudioAttributesCompatParcelizer() {
        setInitialBitrateEstimate setinitialbitrateestimate = this.AudioAttributesCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setinitialbitrateestimate, "");
        return setinitialbitrateestimate;
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object read(SampleVideos<? super List<CustomModuleLSModel>> sampleVideos) {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super CustomModuleLSModel> sampleVideos) {
        return this.write.IconCompatParcelizer();
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super CustomModuleQuotaResponseBody> sampleVideos) {
        return AudioAttributesCompatParcelizer().write(sampleVideos);
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        this.write.write();
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object RemoteActionCompatParcelizer(CustomModuleLSModel customModuleLSModel, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(customModuleLSModel, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super CustomModuleResponseBody> sampleVideos) {
        return AudioAttributesCompatParcelizer().read(str, sampleVideos);
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object RemoteActionCompatParcelizer(FilterParams filterParams, SampleVideos<? super CustomModuleLSModel> sampleVideos) {
        return AudioAttributesCompatParcelizer().read(filterParams, sampleVideos);
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object write(SampleVideos<? super Boolean> sampleVideos) {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object AudioAttributesCompatParcelizer(CmcdHeadersFactoryStreamType cmcdHeadersFactoryStreamType, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(cmcdHeadersFactoryStreamType, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object read(String str, int i, SampleVideos<? super Integer> sampleVideos) {
        return this.write.IconCompatParcelizer(str, i);
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super CustomModuleResponseBody> sampleVideos) {
        return AudioAttributesCompatParcelizer().write(str, sampleVideos);
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object IconCompatParcelizer(String str, SampleVideos<? super String> sampleVideos) {
        return this.write.read(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.setResetOnNetworkTypeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r7, kotlin.setCache r8, int r9, kotlin.SampleVideos<? super java.lang.String> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof o.getRtmpDataSource.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            o.getRtmpDataSource$IconCompatParcelizer r0 = (o.getRtmpDataSource.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.read
            int r10 = r10 + r2
            r0.read = r10
            goto L19
        L14:
            o.getRtmpDataSource$IconCompatParcelizer r0 = new o.getRtmpDataSource$IconCompatParcelizer
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.MediaBrowserCompatItemReceiver
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            int r6 = r0.write
            java.lang.Object r6 = r0.IconCompatParcelizer
            com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody r6 = (com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody) r6
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L90
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            int r9 = r0.write
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L67
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.setInitialBitrateEstimate r10 = r6.AudioAttributesCompatParcelizer()
            com.marrow2.data.lesson.remote.model.MarkCMQBCompleteRequestBody r8 = kotlin.getRedirectedUriOrDefault.read(r8)
            r0.RemoteActionCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r5
            r0.write = r9
            r0.read = r4
            java.lang.Object r10 = r10.write(r7, r8, r0)
            if (r10 == r1) goto L9a
        L67:
            r8 = r10
            com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody r8 = (com.marrow2.data.lesson.remote.model.MarkCompleteResponseBody) r8
            boolean r10 = r8.isSolved()
            if (r10 == 0) goto L91
            o.setNetworkTypeOverride r6 = r6.write
            java.lang.Integer r10 = r8.getStatus()
            if (r10 == 0) goto L7d
            int r10 = r10.intValue()
            goto L7e
        L7d:
            r10 = 0
        L7e:
            long r1 = r8.getCompletionTimeMs()
            r0.RemoteActionCompatParcelizer = r5
            r0.AudioAttributesCompatParcelizer = r5
            r0.IconCompatParcelizer = r8
            r0.write = r9
            r0.read = r3
            r6.IconCompatParcelizer(r7, r10, r1)
            r6 = r8
        L90:
            r8 = r6
        L91:
            java.lang.String r6 = r8.getOwnerCategory()
            if (r6 != 0) goto L99
            java.lang.String r6 = ""
        L99:
            return r6
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRtmpDataSource.RemoteActionCompatParcelizer(java.lang.String, o.setCache, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013a A[Catch: ResponseErrorException -> 0x0294, TRY_LEAVE, TryCatch #1 {ResponseErrorException -> 0x0294, blocks: (B:13:0x0050, B:16:0x007b, B:19:0x00ab, B:22:0x00d5, B:25:0x00f5, B:31:0x0136, B:33:0x013a, B:28:0x0108), top: B:92:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023d A[Catch: ResponseErrorException -> 0x0231, TryCatch #0 {ResponseErrorException -> 0x0231, blocks: (B:64:0x0270, B:67:0x0278, B:69:0x0280, B:72:0x0288, B:52:0x0205, B:49:0x01d0, B:39:0x0197, B:42:0x019d, B:45:0x01a5, B:58:0x0233, B:60:0x023d, B:62:0x0243, B:36:0x0148), top: B:91:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0270 A[Catch: ResponseErrorException -> 0x0231, TryCatch #0 {ResponseErrorException -> 0x0231, blocks: (B:64:0x0270, B:67:0x0278, B:69:0x0280, B:72:0x0288, B:52:0x0205, B:49:0x01d0, B:39:0x0197, B:42:0x019d, B:45:0x01a5, B:58:0x0233, B:60:0x023d, B:62:0x0243, B:36:0x0148), top: B:91:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280 A[Catch: ResponseErrorException -> 0x0231, TryCatch #0 {ResponseErrorException -> 0x0231, blocks: (B:64:0x0270, B:67:0x0278, B:69:0x0280, B:72:0x0288, B:52:0x0205, B:49:0x01d0, B:39:0x0197, B:42:0x019d, B:45:0x01a5, B:58:0x0233, B:60:0x023d, B:62:0x0243, B:36:0x0148), top: B:91:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.setResetOnNetworkTypeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(int r24, java.lang.String r25, boolean r26, long r27, java.util.List<kotlin.dropTable> r29, long r30, long r32, boolean r34, kotlin.SampleVideos<? super kotlin.setFloats> r35) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRtmpDataSource.read(int, java.lang.String, boolean, long, java.util.List, long, long, boolean, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.setResetOnNetworkTypeChange
    public final Object AudioAttributesCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.write.IconCompatParcelizer(str, j, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }
}

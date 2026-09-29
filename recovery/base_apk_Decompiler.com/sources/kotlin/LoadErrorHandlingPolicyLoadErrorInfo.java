package kotlin;

import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleFeedbackRequestBody;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadErrorHandlingPolicyLoadErrorInfo implements LoadErrorHandlingPolicyFallbackSelection {
    private final LoadErrorHandlingPolicyFallbackOptions IconCompatParcelizer;

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return LoadErrorHandlingPolicyLoadErrorInfo.this.write(0, null, null, null, null, null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return LoadErrorHandlingPolicyLoadErrorInfo.this.RemoteActionCompatParcelizer(null, 0, null, null, null, this);
        }
    }

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
            return LoadErrorHandlingPolicyLoadErrorInfo.this.read(null, null, null, null, 0, 0, null, this);
        }
    }

    @setSdkPayload
    public LoadErrorHandlingPolicyLoadErrorInfo(LoadErrorHandlingPolicyFallbackOptions loadErrorHandlingPolicyFallbackOptions) {
        toMagicModuleMetaRepoModel.write(loadErrorHandlingPolicyFallbackOptions, "");
        this.IconCompatParcelizer = loadErrorHandlingPolicyFallbackOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.LoadErrorHandlingPolicyFallbackSelection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.LoadErrorHandlingPolicyFallbackType r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, kotlin.SampleVideos<? super com.marrow2.data.feedback.remote.model.FeedbackResponseBody> r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof o.LoadErrorHandlingPolicyLoadErrorInfo.read
            if (r2 == 0) goto L17
            r2 = r1
            o.LoadErrorHandlingPolicyLoadErrorInfo$read r2 = (o.LoadErrorHandlingPolicyLoadErrorInfo.read) r2
            int r3 = r2.AudioAttributesImplApi21Parcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L17
            int r1 = r2.AudioAttributesImplApi21Parcelizer
            int r1 = r1 + r4
            r2.AudioAttributesImplApi21Parcelizer = r1
            goto L1c
        L17:
            o.LoadErrorHandlingPolicyLoadErrorInfo$read r2 = new o.LoadErrorHandlingPolicyLoadErrorInfo$read
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.AudioAttributesImplApi21Parcelizer
            r5 = 1
            if (r4 == 0) goto L41
            if (r4 != r5) goto L39
            int r0 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r2.AudioAttributesImplApi26Parcelizer
            java.lang.Object r0 = r2.read
            java.lang.Object r0 = r2.IconCompatParcelizer
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            java.lang.Object r0 = r2.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L6f
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            java.lang.String r8 = r14.getRemoteActionCompatParcelizer()
            com.marrow2.data.feedback.remote.model.FeedbackRequestBody r1 = new com.marrow2.data.feedback.remote.model.FeedbackRequestBody
            r12 = 1
            r6 = r1
            r7 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12)
            o.LoadErrorHandlingPolicyFallbackOptions r0 = r0.IconCompatParcelizer
            r4 = 0
            r2.write = r4
            r2.RemoteActionCompatParcelizer = r4
            r2.IconCompatParcelizer = r4
            r2.read = r4
            r2.AudioAttributesImplApi26Parcelizer = r4
            r4 = r15
            r2.AudioAttributesCompatParcelizer = r4
            r2.AudioAttributesImplApi21Parcelizer = r5
            java.lang.Object r1 = r0.RemoteActionCompatParcelizer(r1, r2)
            if (r1 != r3) goto L6f
            return r3
        L6f:
            com.marrow2.core.network.model.NetworkApiResponse r1 = (com.marrow2.core.network.model.NetworkApiResponse) r1
            java.lang.Object r0 = kotlin.createDataSink.RemoteActionCompatParcelizer(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LoadErrorHandlingPolicyLoadErrorInfo.RemoteActionCompatParcelizer(o.LoadErrorHandlingPolicyFallbackType, int, java.lang.String, java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // kotlin.LoadErrorHandlingPolicyFallbackSelection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List<java.lang.Integer> r22, kotlin.LoadErrorHandlingPolicyFallbackType r23, kotlin.SampleVideos<? super com.marrow2.data.feedback.remote.model.FeedbackResponseBody> r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof o.LoadErrorHandlingPolicyLoadErrorInfo.IconCompatParcelizer
            if (r2 == 0) goto L18
            r2 = r1
            o.LoadErrorHandlingPolicyLoadErrorInfo$IconCompatParcelizer r2 = (o.LoadErrorHandlingPolicyLoadErrorInfo.IconCompatParcelizer) r2
            int r3 = r2.MediaBrowserCompatCustomActionResultReceiver
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + r4
            r2.MediaBrowserCompatCustomActionResultReceiver = r1
            goto L1d
        L18:
            o.LoadErrorHandlingPolicyLoadErrorInfo$IconCompatParcelizer r2 = new o.LoadErrorHandlingPolicyLoadErrorInfo$IconCompatParcelizer
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.AudioAttributesImplApi26Parcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.MediaBrowserCompatCustomActionResultReceiver
            r5 = 1
            if (r4 == 0) goto L44
            if (r4 != r5) goto L3c
            int r0 = r2.IconCompatParcelizer
            java.lang.Object r0 = r2.AudioAttributesImplApi21Parcelizer
            java.lang.Object r0 = r2.AudioAttributesImplBaseParcelizer
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r2.read
            java.lang.Object r0 = r2.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L7f
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            java.lang.String r9 = r23.getRemoteActionCompatParcelizer()
            java.lang.String r10 = r23.getRemoteActionCompatParcelizer()
            com.marrow2.data.feedback.remote.model.ComplainRequestBody r1 = new com.marrow2.data.feedback.remote.model.ComplainRequestBody
            r14 = 2
            r15 = 2
            r6 = r1
            r7 = r19
            r8 = r19
            r11 = r18
            r12 = r21
            r13 = r22
            r16 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            o.LoadErrorHandlingPolicyFallbackOptions r0 = r0.IconCompatParcelizer
            r4 = 0
            r2.write = r4
            r2.read = r4
            r2.AudioAttributesCompatParcelizer = r4
            r2.RemoteActionCompatParcelizer = r4
            r2.AudioAttributesImplBaseParcelizer = r4
            r2.AudioAttributesImplApi21Parcelizer = r4
            r4 = r18
            r2.IconCompatParcelizer = r4
            r2.MediaBrowserCompatCustomActionResultReceiver = r5
            java.lang.Object r1 = r0.RemoteActionCompatParcelizer(r1, r2)
            if (r1 != r3) goto L7f
            return r3
        L7f:
            com.marrow2.core.network.model.NetworkApiResponse r1 = (com.marrow2.core.network.model.NetworkApiResponse) r1
            java.lang.Object r0 = kotlin.createDataSink.RemoteActionCompatParcelizer(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LoadErrorHandlingPolicyLoadErrorInfo.write(int, java.lang.String, java.lang.String, java.lang.String, java.util.List, o.LoadErrorHandlingPolicyFallbackType, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.LoadErrorHandlingPolicyFallbackSelection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, int r20, java.util.List<java.lang.String> r21, kotlin.SampleVideos<? super com.marrow.data.api.models.response.common.RatingResponseBody> r22) {
        /*
            r14 = this;
            r0 = r14
            r1 = r22
            boolean r2 = r1 instanceof o.LoadErrorHandlingPolicyLoadErrorInfo.write
            if (r2 == 0) goto L17
            r2 = r1
            o.LoadErrorHandlingPolicyLoadErrorInfo$write r2 = (o.LoadErrorHandlingPolicyLoadErrorInfo.write) r2
            int r3 = r2.AudioAttributesImplBaseParcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L17
            int r1 = r2.AudioAttributesImplBaseParcelizer
            int r1 = r1 + r4
            r2.AudioAttributesImplBaseParcelizer = r1
            goto L1c
        L17:
            o.LoadErrorHandlingPolicyLoadErrorInfo$write r2 = new o.LoadErrorHandlingPolicyLoadErrorInfo$write
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.AudioAttributesImplApi21Parcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.AudioAttributesImplBaseParcelizer
            r5 = 1
            if (r4 == 0) goto L43
            if (r4 != r5) goto L3b
            int r0 = r2.read
            int r0 = r2.write
            java.lang.Object r0 = r2.MediaBrowserCompatItemReceiver
            java.lang.Object r0 = r2.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r0 = r2.IconCompatParcelizer
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L77
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.LoadErrorHandlingPolicyFallbackOptions r0 = r0.IconCompatParcelizer
            o.isFallbackAvailable r1 = new o.isFallbackAvailable
            r6 = r1
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            r2.RemoteActionCompatParcelizer = r4
            r2.AudioAttributesCompatParcelizer = r4
            r2.IconCompatParcelizer = r4
            r2.MediaBrowserCompatCustomActionResultReceiver = r4
            r2.MediaBrowserCompatItemReceiver = r4
            r4 = r19
            r2.write = r4
            r4 = r20
            r2.read = r4
            r2.AudioAttributesImplBaseParcelizer = r5
            java.lang.Object r1 = r0.write(r1, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            com.marrow2.core.network.model.NetworkApiResponse r1 = (com.marrow2.core.network.model.NetworkApiResponse) r1
            java.lang.Object r0 = kotlin.createDataSink.RemoteActionCompatParcelizer(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LoadErrorHandlingPolicyLoadErrorInfo.read(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.List, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.LoadErrorHandlingPolicyFallbackSelection
    public final Object IconCompatParcelizer(String str, int i, String str2, List<String> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(str, new MagicModuleFeedbackRequestBody(i, str2, list), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }
}

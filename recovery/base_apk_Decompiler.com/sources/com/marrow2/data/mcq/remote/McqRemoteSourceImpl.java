package com.marrow2.data.mcq.remote;

import com.marrow2.data.bookmark.remote.model.ResetBookmarkRequestBody;
import kotlin.Metadata;
import kotlin.NonNullApi;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.onDisplayInfoChanged;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/marrow2/data/mcq/remote/McqRemoteSourceImpl;", "Lcom/marrow2/data/mcq/remote/McqRemoteSource;", "Lcom/marrow2/data/mcq/remote/McqService;", "p0", "<init>", "(Lcom/marrow2/data/mcq/remote/McqService;)V", "", "Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;", "resetBookmarks", "(ILo/SampleVideos;)Ljava/lang/Object;", "", "Lo/onDisplayInfoChanged;", "p1", "p2", "", "updateBookmark", "(Ljava/lang/String;Lo/onDisplayInfoChanged;ILo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow2/data/mcq/remote/McqFaqResponseBody;", "getFaqsForMcq", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "getRelatedMcq", "(ILjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "mcqService", "Lcom/marrow2/data/mcq/remote/McqService;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McqRemoteSourceImpl implements McqRemoteSource {
    public static final int $stable = 8;
    private final McqService mcqService;

    static final class IconCompatParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return McqRemoteSourceImpl.this.resetBookmarks(0, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return McqRemoteSourceImpl.this.getRelatedMcq(0, null, this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return McqRemoteSourceImpl.this.getFaqsForMcq(null, this);
        }
    }

    @setSdkPayload
    public McqRemoteSourceImpl(McqService mcqService) {
        toMagicModuleMetaRepoModel.write(mcqService, "");
        this.mcqService = mcqService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.marrow2.data.mcq.remote.McqRemoteSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object resetBookmarks(int r11, kotlin.SampleVideos<? super com.marrow2.data.bookmark.remote.model.ResetBookmarkResponseBody> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.marrow2.data.mcq.remote.McqRemoteSourceImpl.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r12
            com.marrow2.data.mcq.remote.McqRemoteSourceImpl$IconCompatParcelizer r0 = (com.marrow2.data.mcq.remote.McqRemoteSourceImpl.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.read
            int r12 = r12 + r2
            r0.read = r12
            goto L19
        L14:
            com.marrow2.data.mcq.remote.McqRemoteSourceImpl$IconCompatParcelizer r0 = new com.marrow2.data.mcq.remote.McqRemoteSourceImpl$IconCompatParcelizer
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r10 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            goto L4f
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r12)
            com.marrow2.data.mcq.remote.McqService r10 = r10.mcqService
            com.marrow2.data.bookmark.remote.model.ResetBookmarkRequestBody r12 = new com.marrow2.data.bookmark.remote.model.ResetBookmarkRequestBody
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r12
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.IconCompatParcelizer = r11
            r0.read = r3
            java.lang.Object r12 = r10.resetMcqBookmarks(r12, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            com.marrow2.core.network.model.NetworkApiResponse r12 = (com.marrow2.core.network.model.NetworkApiResponse) r12
            java.lang.Object r10 = kotlin.createDataSink.RemoteActionCompatParcelizer(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.data.mcq.remote.McqRemoteSourceImpl.resetBookmarks(int, o.SampleVideos):java.lang.Object");
    }

    @Override // com.marrow2.data.mcq.remote.McqRemoteSource
    public final Object updateBookmark(String str, onDisplayInfoChanged ondisplayinfochanged, int i, SampleVideos<? super getShowPopup> sampleVideos) {
        ResetBookmarkRequestBody resetBookmarkRequestBody = new ResetBookmarkRequestBody(i, str, QBankStatsResponse.RemoteActionCompatParcelizer(NonNullApi.IconCompatParcelizer(ondisplayinfochanged)));
        if (ondisplayinfochanged == onDisplayInfoChanged.read) {
            Object objUnBookmarkMcq = this.mcqService.unBookmarkMcq(resetBookmarkRequestBody, sampleVideos);
            return objUnBookmarkMcq == getYear.IconCompatParcelizer() ? objUnBookmarkMcq : getShowPopup.INSTANCE;
        }
        Object objBookmarkMcq = this.mcqService.bookmarkMcq(resetBookmarkRequestBody, sampleVideos);
        return objBookmarkMcq == getYear.IconCompatParcelizer() ? objBookmarkMcq : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.marrow2.data.mcq.remote.McqRemoteSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getFaqsForMcq(java.lang.String r5, kotlin.SampleVideos<? super java.util.List<com.marrow2.data.mcq.remote.McqFaqResponseBody>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.marrow2.data.mcq.remote.McqRemoteSourceImpl.write
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.data.mcq.remote.McqRemoteSourceImpl$write r0 = (com.marrow2.data.mcq.remote.McqRemoteSourceImpl.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            com.marrow2.data.mcq.remote.McqRemoteSourceImpl$write r0 = new com.marrow2.data.mcq.remote.McqRemoteSourceImpl$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L47
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            com.marrow2.data.mcq.remote.McqService r4 = r4.mcqService
            r6 = 0
            r0.read = r6
            r0.write = r3
            java.lang.String r6 = "mcq"
            java.lang.Object r6 = r4.getMcqFaq(r5, r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.marrow2.core.network.model.NetworkApiResponse r6 = (com.marrow2.core.network.model.NetworkApiResponse) r6
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.data.mcq.remote.McqRemoteSourceImpl.getFaqsForMcq(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.marrow2.data.mcq.remote.McqRemoteSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRelatedMcq(int r5, java.lang.String r6, kotlin.SampleVideos<? super java.util.List<? extends com.marrow.data.api.models.response.mcq.McqResponseBody>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.marrow2.data.mcq.remote.McqRemoteSourceImpl.read
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.data.mcq.remote.McqRemoteSourceImpl$read r0 = (com.marrow2.data.mcq.remote.McqRemoteSourceImpl.read) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.IconCompatParcelizer
            int r7 = r7 + r2
            r0.IconCompatParcelizer = r7
            goto L19
        L14:
            com.marrow2.data.mcq.remote.McqRemoteSourceImpl$read r0 = new com.marrow2.data.mcq.remote.McqRemoteSourceImpl$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r4 = r0.AudioAttributesCompatParcelizer
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
            com.marrow2.data.mcq.remote.McqService r4 = r4.mcqService
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r5
            r0.IconCompatParcelizer = r3
            java.lang.Object r7 = r4.getPearlRelatedMcq(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.marrow2.core.network.model.NetworkApiResponse r7 = (com.marrow2.core.network.model.NetworkApiResponse) r7
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r7)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.util.List r4 = kotlin.getOrderDetails.onCommand(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.data.mcq.remote.McqRemoteSourceImpl.getRelatedMcq(int, java.lang.String, o.SampleVideos):java.lang.Object");
    }
}

package kotlin;

import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.mcq.TestGroup;
import com.marrow.data.models.mcq.McqIndex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J$\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0019J4\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000fH\u0002J\u0016\u0010#\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J$\u0010$\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010%\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0019Jt\u0010&\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0)H\u0082@¢\u0006\u0002\u0010-J,\u0010.\u001a\u00020\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00172\u0006\u0010%\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\rH\u0082@¢\u0006\u0002\u00102R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/marrow2/domain/test/TestApiUseCaseImpl;", "Lcom/marrow2/domain/test/TestApiUseCase;", "testRepository", "Lcom/marrow2/data/test/repo/TestRepository;", "mcqRepository", "Lcom/marrow2/data/mcq/repo/McqRepository;", "pearlRepository", "Lcom/marrow2/data/pearl/repo/PearlRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/marrow2/data/test/repo/TestRepository;Lcom/marrow2/data/mcq/repo/McqRepository;Lcom/marrow2/data/pearl/repo/PearlRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "hasDetailInfo", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadMcq", "", "markServerContentUpdated", "testId", "insertQuestions", "response", "", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapQuestionToMcqParent", "Lcom/marrow2/data/mcq/local/model/McqParentInfoRepoModel;", "Lcom/marrow2/data/mcq/local/model/McqParentInfoLSModel;", "index", "", "question", "Lcom/marrow2/data/mcq/local/model/McqIndexRepoModel;", "isChild", "mcqIdParent", "insertPearls", "insertHyt", "parentId", "insertAnswers", StepResponseBody.KEY_QUESTIONS, "answerMap", "", "guessedMcqMap", "answersChanged", "starredMcqMap", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTestGroup", "groups", "Lcom/marrow/data/api/models/response/mcq/TestGroup;", "isTestCompleted", "(Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createHandlerForCurrentLooper implements checkCleartextTrafficPermitted {
    public static final read RemoteActionCompatParcelizer = new read(null);
    private final getPlatform AudioAttributesCompatParcelizer;
    private final intersects IconCompatParcelizer;
    private final copyWithMutationsApplied read;
    private final bindAttributesAndUniforms write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return createHandlerForCurrentLooper.this.IconCompatParcelizer(null, null, this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        boolean AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return createHandlerForCurrentLooper.this.AudioAttributesCompatParcelizer((List<TestGroup>) null, (String) null, false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return createHandlerForCurrentLooper.this.write(null, this);
        }
    }

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        /* synthetic */ Object MediaBrowserCompatSearchResultReceiver;
        int MediaDescriptionCompat;
        Object RatingCompat;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            return createHandlerForCurrentLooper.this.IconCompatParcelizer(null, null, null, null, null, null, this);
        }
    }

    @setSdkPayload
    public createHandlerForCurrentLooper(bindAttributesAndUniforms bindattributesanduniforms, intersects intersectsVar, copyWithMutationsApplied copywithmutationsapplied, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(bindattributesanduniforms, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(copywithmutationsapplied, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.write = bindattributesanduniforms;
        this.IconCompatParcelizer = intersectsVar;
        this.read = copywithmutationsapplied;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/createHandlerForCurrentLooper$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r7, kotlin.SampleVideos<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.createHandlerForCurrentLooper.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.createHandlerForCurrentLooper$RemoteActionCompatParcelizer r0 = (o.createHandlerForCurrentLooper.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.createHandlerForCurrentLooper$RemoteActionCompatParcelizer r0 = new o.createHandlerForCurrentLooper$RemoteActionCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L34
            boolean r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L70
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L53
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.bindAttributesAndUniforms r8 = r6.write
            r0.AudioAttributesCompatParcelizer = r7
            r0.write = r5
            java.lang.Object r8 = r8.AudioAttributesImplBaseParcelizer(r7, r0)
            if (r8 == r1) goto L7e
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L60
            java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r6
        L60:
            o.intersects r6 = r6.IconCompatParcelizer
            r2 = 0
            r0.AudioAttributesCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r8
            r0.write = r3
            java.lang.Object r8 = r6.onMediaButtonEvent(r7, r0)
            if (r8 != r1) goto L70
            goto L7e
        L70:
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            if (r6 <= 0) goto L79
            r4 = r5
        L79:
            java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createHandlerForCurrentLooper.write(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private boolean AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:48:0x01a3, code lost:
        
            if (r2.AudioAttributesCompatParcelizer((java.util.List<com.marrow.data.api.models.response.mcq.TestGroup>) r15, r6, r1, r14) != r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01c3, code lost:
        
            if (r15.write(false, r2, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r14) == r0) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[PHI: r1 r15
          0x00a7: PHI (r1v5 com.marrow.data.api.models.response.test.TestResponseBody) = 
          (r1v4 com.marrow.data.api.models.response.test.TestResponseBody)
          (r1v8 com.marrow.data.api.models.response.test.TestResponseBody)
         binds: [B:23:0x00a5, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x00a7: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v0 java.lang.Object) binds: [B:23:0x00a5, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0103 A[PHI: r1 r5
          0x0103: PHI (r1v11 boolean) = (r1v9 boolean), (r1v12 boolean) binds: [B:28:0x0101, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]
          0x0103: PHI (r5v12 com.marrow.data.api.models.response.test.TestResponseBody) = 
          (r5v9 com.marrow.data.api.models.response.test.TestResponseBody)
          (r5v14 com.marrow.data.api.models.response.test.TestResponseBody)
         binds: [B:28:0x0101, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0145 A[PHI: r1 r5
          0x0145: PHI (r1v13 boolean) = (r1v11 boolean), (r1v14 boolean) binds: [B:30:0x0143, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x0145: PHI (r5v15 com.marrow.data.api.models.response.test.TestResponseBody) = 
          (r5v12 com.marrow.data.api.models.response.test.TestResponseBody)
          (r5v17 com.marrow.data.api.models.response.test.TestResponseBody)
         binds: [B:30:0x0143, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x018c  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 480
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.createHandlerForCurrentLooper.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createHandlerForCurrentLooper.this.new IconCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.checkCleartextTrafficPermitted
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new IconCompatParcelizer(str, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.checkCleartextTrafficPermitted
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = this.write.write(true, str, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r0.read(r1, r3) == r4) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.util.List<? extends com.marrow.data.api.models.response.mcq.McqResponseBody> r17, java.lang.String r18, kotlin.SampleVideos<? super kotlin.getShowPopup> r19) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createHandlerForCurrentLooper.IconCompatParcelizer(java.util.List, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    private static C0162cache IconCompatParcelizer(String str, int i, isHoleSpan isholespan, boolean z, String str2) {
        return new C0162cache(isholespan.getOnPause(), str, (z ? readBlockToCache.read : readBlockToCache.AudioAttributesImplApi26Parcelizer).getRead(), i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<? extends McqResponseBody> list) {
        if (list.isEmpty()) {
            return;
        }
        List<? extends McqResponseBody> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((McqResponseBody) it.next()).getPearls());
        }
        this.read.IconCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(List<? extends McqResponseBody> list, String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Collection collectionRemoteActionCompatParcelizer;
        ArrayList arrayListRemoteActionCompatParcelizer;
        if (list.isEmpty()) {
            return getShowPopup.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (McqResponseBody mcqResponseBody : list) {
            String[] highYieldIds = mcqResponseBody.getHighYieldIds();
            if (highYieldIds == null) {
                collectionRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            } else {
                Collection arrayList2 = new ArrayList(highYieldIds.length);
                for (String str2 : highYieldIds) {
                    arrayList2.add(new addSpan(mcqResponseBody.getMcqId(), str2, str, str));
                }
                collectionRemoteActionCompatParcelizer = (List) arrayList2;
            }
            arrayList.addAll(collectionRemoteActionCompatParcelizer);
            McqIndex[] childQuestions = mcqResponseBody.getChildQuestions();
            if (childQuestions != null) {
                for (McqIndex mcqIndex : childQuestions) {
                    String[] highYieldIds2 = mcqIndex.getHighYieldIds();
                    if (highYieldIds2 == null) {
                        arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    } else {
                        ArrayList arrayList3 = new ArrayList(highYieldIds2.length);
                        for (String str3 : highYieldIds2) {
                            arrayList3.add(new addSpan(mcqIndex.getMcqId(), str3, str, str));
                        }
                        arrayListRemoteActionCompatParcelizer = arrayList3;
                    }
                    arrayList.addAll(arrayListRemoteActionCompatParcelizer);
                }
            }
        }
        this.IconCompatParcelizer.IconCompatParcelizer(arrayList);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r25, java.util.List<? extends com.marrow.data.api.models.response.mcq.McqResponseBody> r26, java.util.Map<java.lang.String, java.lang.Integer> r27, java.util.Map<java.lang.String, java.lang.Integer> r28, java.util.Map<java.lang.String, java.lang.Integer> r29, java.util.Map<java.lang.String, java.lang.Integer> r30, kotlin.SampleVideos<? super kotlin.getShowPopup> r31) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createHandlerForCurrentLooper.IconCompatParcelizer(java.lang.String, java.util.List, java.util.Map, java.util.Map, java.util.Map, java.util.Map, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e1, code lost:
    
        if (r0.IconCompatParcelizer(r5, r3) != r4) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.util.List<com.marrow.data.api.models.response.mcq.TestGroup> r26, java.lang.String r27, boolean r28, kotlin.SampleVideos<? super kotlin.getShowPopup> r29) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createHandlerForCurrentLooper.AudioAttributesCompatParcelizer(java.util.List, java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }
}

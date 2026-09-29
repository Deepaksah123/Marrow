package kotlin;

import com.marrow2.data.schema.remote.model.SchemaDetailRSModel;
import dagger.Lazy;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u0019\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0010H\u0096@¢\u0006\u0002\u0010\u000eJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u000e\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010\u000eJ,\u0010'\u001a\f\u0012\b\u0012\u00060(j\u0002`)0\u00102\b\u0010*\u001a\u0004\u0018\u00010\u00142\b\u0010+\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001a\u0010/\u001a\u000600j\u0002`12\u0006\u0010.\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J \u00102\u001a\u00020&2\u0010\u00103\u001a\f\u0012\b\u0012\u000600j\u0002`10\u0010H\u0096@¢\u0006\u0002\u00104J\"\u00105\u001a\u000606j\u0002`72\u0006\u0010.\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0096@¢\u0006\u0002\u0010:J\u0016\u0010;\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010<\u001a\u00020=2\u0006\u0010.\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J \u0010>\u001a\f\u0012\b\u0012\u00060?j\u0002`@0\u00102\u0006\u0010.\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006B"}, d2 = {"Lcom/marrow2/data/schema/repo/SchemaRepositoryImpl;", "Lcom/marrow2/data/schema/repo/SchemaRepository;", "schemaLocalSource", "Lcom/marrow2/data/schema/local/SchemaLocalSource;", "schemaRemoteSourceLazy", "Ldagger/Lazy;", "Lcom/marrow2/data/schema/remote/SchemaRemoteSource;", "<init>", "(Lcom/marrow2/data/schema/local/SchemaLocalSource;Ldagger/Lazy;)V", "schemaRemoteSource", "getSchemaRemoteSource", "()Lcom/marrow2/data/schema/remote/SchemaRemoteSource;", "getSchemaCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRelatedSchemasInModule", "", "Lcom/marrow2/data/schema/repo/model/SchemaLSModel;", "Lcom/marrow2/data/schema/repo/model/SchemaRepoModel;", "stepId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchemaListForMcq", "mcqId", "countHighYields", "parentId", "getSchemaFilters", "Lcom/marrow2/data/schema/repo/model/SchemaFilterCount;", "getSchemaIds", "highYieldId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSchemaExamsWithCount", "Lcom/marrow2/data/schema/repo/model/SchemaFilterItemRepoModel;", "getAllSchemaSubjectsWithCount", "selectedExamId", "getSchemaCountOfSelectedExam", "selectedExam", "downloadAndInsertAllSchema", "", "getAllSchemaListWithStatus", "Lcom/marrow2/data/schema/local/model/SchemaItemLSModel;", "Lcom/marrow2/data/schema/repo/model/SchemaItemRepoModel;", "examName", "subjectId", "getSchemaCompletionStatus", "Lcom/marrow2/data/schema/repo/model/SchemaCompletionStatusRepoModel;", "schemaId", "getSchemaUserStatus", "Lcom/marrow2/data/schema/local/model/SchemaUserStatusLSModel;", "Lcom/marrow2/data/schema/repo/model/SchemaUserStatusRepoModel;", "insertSchemaUserStatus", "data", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchemaDetailRemote", "Lcom/marrow2/data/schema/remote/model/SchemaDetailRSModel;", "Lcom/marrow2/data/schema/repo/model/SchemaDetailRemoteRepoModel;", "lastLessonSubmittedOn", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setServerContentUpdated", "isServerContentDownloaded", "", "getSchemaLessonDetails", "Lcom/marrow2/data/schema/local/model/SchemaLessonLSModel;", "Lcom/marrow2/data/schema/repo/model/SchemaLessonRepoModel;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getBinderByReflection implements putBinder {
    public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private final Lazy<startWrite> AudioAttributesCompatParcelizer;
    private final SlidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0 read;

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return getBinderByReflection.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        boolean read;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return getBinderByReflection.this.write(this);
        }
    }

    static final class read extends getTotalMcq {
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return getBinderByReflection.this.MediaBrowserCompatItemReceiver(null, this);
        }
    }

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return getBinderByReflection.this.read((String) null, this);
        }
    }

    @setSdkPayload
    public getBinderByReflection(SlidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0 slidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0, Lazy<startWrite> lazy) {
        toMagicModuleMetaRepoModel.write(slidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.read = slidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0;
        this.AudioAttributesCompatParcelizer = lazy;
    }

    private final startWrite AudioAttributesCompatParcelizer() {
        startWrite startwrite = this.AudioAttributesCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(startwrite, "");
        return startwrite;
    }

    @Override // kotlin.putBinder
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Integer> sampleVideos) {
        return this.read.AudioAttributesCompatParcelizer(sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[LOOP:0: B:27:0x00ae->B:29:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.putBinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r8, kotlin.SampleVideos<? super java.util.List<kotlin.ensureClassLoader>> r9) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getBinderByReflection.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.putBinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatItemReceiver(java.lang.String r7, kotlin.SampleVideos<? super java.util.List<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.getBinderByReflection.read
            if (r0 == 0) goto L14
            r0 = r8
            o.getBinderByReflection$read r0 = (o.getBinderByReflection.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.getBinderByReflection$read r0 = new o.getBinderByReflection$read
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            return r8
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r7 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L4f
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.SlidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0 r8 = r6.read
            r0.IconCompatParcelizer = r5
            r0.write = r4
            java.lang.Object r8 = r8.MediaBrowserCompatItemReceiver(r7, r0)
            if (r8 == r1) goto L61
        L4f:
            java.util.List r8 = (java.util.List) r8
            o.SlidingWeightedAverageBandwidthStatisticExternalSyntheticLambda0 r6 = r6.read
            r0.IconCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r3
            java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r8, r0)
            if (r6 != r1) goto L60
            goto L61
        L60:
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getBinderByReflection.MediaBrowserCompatItemReceiver(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.putBinder
    public final Object write(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.read.read(str, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super List<putBinderByReflection>> sampleVideos) {
        return this.read.AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super List<String>> sampleVideos) {
        return this.read.IconCompatParcelizer(str, str2, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super List<fromBundleSparseArray>> sampleVideos) {
        return this.read.RemoteActionCompatParcelizer(sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super List<fromBundleSparseArray>> sampleVideos) {
        return this.read.write(str, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object IconCompatParcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.read.IconCompatParcelizer(str, sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r7.IconCompatParcelizer(r8, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[PHI: r11
      0x0061: PHI (r11v9 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:20:0x005f, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[PHI: r11
      0x0079: PHI (r11v2 java.lang.Object) = (r11v12 java.lang.Object), (r11v1 java.lang.Object) binds: [B:22:0x0077, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:32:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c6 -> B:32:0x00c9). Please report as a decompilation issue!!! */
    @Override // kotlin.putBinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getBinderByReflection.write(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.putBinder
    public final Object RemoteActionCompatParcelizer(String str, String str2, SampleVideos<? super List<endWrite>> sampleVideos) {
        return this.read.write(str, str2, sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.putBinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r13, kotlin.SampleVideos<? super kotlin.BundleableUtil> r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getBinderByReflection.read(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.putBinder
    public final Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super loadBitmapFromMetadata> sampleVideos) {
        return this.read.AudioAttributesImplApi26Parcelizer(str, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object read(List<loadBitmapFromMetadata> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.read.IconCompatParcelizer(list, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.putBinder
    public final Object read(String str, long j, SampleVideos<? super SchemaDetailRSModel> sampleVideos) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(str, j, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object MediaMetadataCompat(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objMediaBrowserCompatCustomActionResultReceiver = this.read.MediaBrowserCompatCustomActionResultReceiver(str, sampleVideos);
        return objMediaBrowserCompatCustomActionResultReceiver == getYear.IconCompatParcelizer() ? objMediaBrowserCompatCustomActionResultReceiver : getShowPopup.INSTANCE;
    }

    @Override // kotlin.putBinder
    public final Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super Boolean> sampleVideos) {
        return this.read.AudioAttributesImplApi21Parcelizer(str, sampleVideos);
    }

    @Override // kotlin.putBinder
    public final Object AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super List<openRead>> sampleVideos) {
        return this.read.AudioAttributesImplBaseParcelizer(str, sampleVideos);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getBinderByReflection$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}

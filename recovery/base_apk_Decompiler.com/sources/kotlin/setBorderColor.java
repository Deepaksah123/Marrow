package kotlin;

import android.database.SQLException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.a;
import kotlin.asUShort;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&J9\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\fH\u0000¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020+002\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b2\u00103J#\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\nH\u0002¢\u0006\u0002\u00105J\u0015\u00106\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b7J\u0015\u00108\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b9J\u0010\u0010:\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b;\u0010<J\u001e\u0010=\u001a\u00020\u00102\u0006\u0010%\u001a\u00020>2\u0006\u0010?\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010@J\u001e\u0010A\u001a\u00020\u00102\u0006\u0010%\u001a\u00020>2\u0006\u0010?\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010@J@\u0010B\u001a\u00020\f2\u000e\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fH\u0080@¢\u0006\u0004\bF\u0010GJ-\u0010H\u001a\u00020\u00102\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fH\u0000¢\u0006\u0002\bIJ\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0082@¢\u0006\u0002\u0010<J\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010%\u001a\u00020>H\u0082@¢\u0006\u0002\u0010LJ\r\u0010M\u001a\u00020\u0010H\u0000¢\u0006\u0002\bNR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006P"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker;", "", "database", "Landroidx/room/RoomDatabase;", "shadowTablesMap", "", "", "viewTables", "", "tableNames", "", "useTempTable", "", "onInvalidatedTablesIds", "Lkotlin/Function1;", "", "", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "tableIdLookup", "tablesNames", "[Ljava/lang/String;", "observedTableStates", "Landroidx/room/ObservedTableStates;", "observedTableVersions", "Landroidx/room/ObservedTableVersions;", "pendingRefresh", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onAllowRefresh", "Lkotlin/Function0;", "getOnAllowRefresh$room_runtime_release", "()Lkotlin/jvm/functions/Function0;", "setOnAllowRefresh$room_runtime_release", "(Lkotlin/jvm/functions/Function0;)V", "configureConnection", "connection", "Landroidx/sqlite/SQLiteConnection;", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "resolvedTableNames", "tableIds", "", "emitInitialState", "createFlow$room_runtime_release", "([Ljava/lang/String;[IZ)Lkotlinx/coroutines/flow/Flow;", "validateTableNames", "Lkotlin/Pair;", "names", "validateTableNames$room_runtime_release", "([Ljava/lang/String;)Lkotlin/Pair;", "resolveViews", "([Ljava/lang/String;)[Ljava/lang/String;", "onObserverAdded", "onObserverAdded$room_runtime_release", "onObserverRemoved", "onObserverRemoved$room_runtime_release", "syncTriggers", "syncTriggers$room_runtime_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTrackingTable", "Landroidx/room/PooledConnection;", "tableId", "(Landroidx/room/PooledConnection;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTrackingTable", "refreshInvalidation", "tables", "onRefreshScheduled", "onRefreshCompleted", "refreshInvalidation$room_runtime_release", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshInvalidationAsync", "refreshInvalidationAsync$room_runtime_release", "notifyInvalidation", "checkInvalidatedTables", "(Landroidx/room/PooledConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetSync", "resetSync$room_runtime_release", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setBorderColor {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);
    private static final String[] read = {"INSERT", "UPDATE", "DELETE"};
    private getCreatedOnDateMs<Boolean> AudioAttributesImplApi21Parcelizer;
    private final Map<String, Integer> AudioAttributesImplApi26Parcelizer;
    private final getAnswerMap<Set<Integer>, getShowPopup> AudioAttributesImplBaseParcelizer;
    private final asUShort IconCompatParcelizer;
    private final Map<String, String> MediaBrowserCompatCustomActionResultReceiver;
    private final AtomicBoolean MediaBrowserCompatItemReceiver;
    private final String[] MediaBrowserCompatSearchResultReceiver;
    private final Map<String, Set<String>> MediaDescriptionCompat;
    private final boolean RatingCompat;
    private final ValueClassSerializerStaticJsonValue RemoteActionCompatParcelizer;
    private final ValueClassBoxConverter write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return setBorderColor.this.RemoteActionCompatParcelizer((ValueClassBoxConverterdelegatingSerializer2) null, this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return setBorderColor.this.RemoteActionCompatParcelizer(null, 0, this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return setBorderColor.this.AudioAttributesCompatParcelizer((ValueClassBoxConverterdelegatingSerializer2) null, 0, this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return setBorderColor.this.IconCompatParcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return setBorderColor.this.AudioAttributesCompatParcelizer(this);
        }
    }

    public static /* synthetic */ boolean read() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setBorderColor(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, Map<String, String> map, Map<String, ? extends Set<String>> map2, String[] strArr, boolean z, getAnswerMap<? super Set<Integer>, getShowPopup> getanswermap) {
        String lowerCase;
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.RemoteActionCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.MediaBrowserCompatCustomActionResultReceiver = map;
        this.MediaDescriptionCompat = map2;
        this.RatingCompat = z;
        this.AudioAttributesImplBaseParcelizer = getanswermap;
        this.MediaBrowserCompatItemReceiver = new AtomicBoolean(false);
        this.AudioAttributesImplApi21Parcelizer = new getCreatedOnDateMs() { // from class: o.BarLineChartBase
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(setBorderColor.read());
            }
        };
        this.AudioAttributesImplApi26Parcelizer = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase2 = strArr[i].toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            this.AudioAttributesImplApi26Parcelizer.put(lowerCase2, Integer.valueOf(i));
            String str = this.MediaBrowserCompatCustomActionResultReceiver.get(strArr[i]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.MediaBrowserCompatSearchResultReceiver = strArr2;
        for (Map.Entry<String, String> entry : this.MediaBrowserCompatCustomActionResultReceiver.entrySet()) {
            String lowerCase3 = entry.getValue().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase3, "");
            if (this.AudioAttributesImplApi26Parcelizer.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase4, "");
                Map<String, Integer> map3 = this.AudioAttributesImplApi26Parcelizer;
                map3.put(lowerCase4, (Integer) VideoTimelineResponseBody.AudioAttributesCompatParcelizer(map3, lowerCase3));
            }
        }
        this.IconCompatParcelizer = new asUShort(this.MediaBrowserCompatSearchResultReceiver.length);
        this.write = new ValueClassBoxConverter(this.MediaBrowserCompatSearchResultReceiver.length);
    }

    public final void write(getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesImplApi21Parcelizer = getcreatedondatems;
    }

    public final void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer("PRAGMA query_only");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            setdrawentrylabels.write();
            boolean zMediaBrowserCompatItemReceiver = setdrawentrylabels.MediaBrowserCompatItemReceiver(0);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            if (zMediaBrowserCompatItemReceiver) {
                return;
            }
            setDrawCenterText.read(setdrawholeenabled, "PRAGMA temp_store = MEMORY");
            setDrawCenterText.read(setdrawholeenabled, "PRAGMA recursive_triggers = 1");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS room_table_modification_log");
            if (!this.RatingCompat) {
                setDrawCenterText.read(setdrawholeenabled, TestGroupLSModel.read("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
            } else {
                setDrawCenterText.read(setdrawholeenabled, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            }
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super Set<? extends String>>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ String[] write;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer((kotlin.CurrentQuery) r12, new o.setBorderColor.write.AnonymousClass5(r11.read, null), r11) != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        
            if (r11.read.write.IconCompatParcelizer(new o.setBorderColor.write.AnonymousClass3(r5, r11.IconCompatParcelizer, r7, r11.write, r11.AudioAttributesCompatParcelizer), r11) != r0) goto L25;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r11.AudioAttributesImplBaseParcelizer
                r2 = 3
                r3 = 0
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 == r2) goto L1a
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)     // Catch: java.lang.Throwable -> La3
                goto L9d
            L1f:
                java.lang.Object r1 = r11.RemoteActionCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                goto L73
            L27:
                java.lang.Object r1 = r11.RemoteActionCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                goto L5b
            L2f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                java.lang.Object r12 = r11.RemoteActionCompatParcelizer
                o.getValidationToken r12 = (kotlin.getValidationToken) r12
                o.setBorderColor r1 = kotlin.setBorderColor.this
                o.asUShort r1 = kotlin.setBorderColor.read(r1)
                int[] r6 = r11.AudioAttributesCompatParcelizer
                boolean r1 = r1.AudioAttributesCompatParcelizer(r6)
                if (r1 == 0) goto L75
                o.setBorderColor r1 = kotlin.setBorderColor.this
                o.ValueClassSerializerStaticJsonValue r1 = kotlin.setBorderColor.write(r1)
                r6 = r11
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r11.RemoteActionCompatParcelizer = r12
                r11.AudioAttributesImplBaseParcelizer = r5
                r5 = 0
                java.lang.Object r1 = kotlin.setExtraBottomOffset.write(r1, r5, r6)
                if (r1 == r0) goto L9c
                r10 = r1
                r1 = r12
                r12 = r10
            L5b:
                o.CurrentQuery r12 = (kotlin.CurrentQuery) r12
                o.setBorderColor$write$5 r5 = new o.setBorderColor$write$5
                o.setBorderColor r6 = kotlin.setBorderColor.this
                r5.<init>(r6, r3)
                o.MagicModuleSubmissionRequestBody r5 = (kotlin.MagicModuleSubmissionRequestBody) r5
                r6 = r11
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r11.RemoteActionCompatParcelizer = r1
                r11.AudioAttributesImplBaseParcelizer = r4
                java.lang.Object r12 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r12, r5, r6)
                if (r12 == r0) goto L9c
            L73:
                r7 = r1
                goto L76
            L75:
                r7 = r12
            L76:
                o.MagicModuleUseCaseImplWhenMappings$write r5 = new o.MagicModuleUseCaseImplWhenMappings$write     // Catch: java.lang.Throwable -> La3
                r5.<init>()     // Catch: java.lang.Throwable -> La3
                o.setBorderColor r12 = kotlin.setBorderColor.this     // Catch: java.lang.Throwable -> La3
                o.ValueClassBoxConverter r12 = kotlin.setBorderColor.AudioAttributesCompatParcelizer(r12)     // Catch: java.lang.Throwable -> La3
                o.setBorderColor$write$3 r1 = new o.setBorderColor$write$3     // Catch: java.lang.Throwable -> La3
                boolean r6 = r11.IconCompatParcelizer     // Catch: java.lang.Throwable -> La3
                java.lang.String[] r8 = r11.write     // Catch: java.lang.Throwable -> La3
                int[] r9 = r11.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> La3
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La3
                o.getValidationToken r1 = (kotlin.getValidationToken) r1     // Catch: java.lang.Throwable -> La3
                r4 = r11
                o.SampleVideos r4 = (kotlin.SampleVideos) r4     // Catch: java.lang.Throwable -> La3
                r11.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> La3
                r11.AudioAttributesImplBaseParcelizer = r2     // Catch: java.lang.Throwable -> La3
                java.lang.Object r12 = r12.IconCompatParcelizer(r1, r4)     // Catch: java.lang.Throwable -> La3
                if (r12 != r0) goto L9d
            L9c:
                return r0
            L9d:
                o.PlanDetailsCreator r12 = new o.PlanDetailsCreator     // Catch: java.lang.Throwable -> La3
                r12.<init>()     // Catch: java.lang.Throwable -> La3
                throw r12     // Catch: java.lang.Throwable -> La3
            La3:
                r12 = move-exception
                o.setBorderColor r0 = kotlin.setBorderColor.this
                o.asUShort r0 = kotlin.setBorderColor.read(r0)
                int[] r11 = r11.AudioAttributesCompatParcelizer
                r0.write(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setBorderColor.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.setBorderColor$write$5, reason: invalid class name */
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ setBorderColor IconCompatParcelizer;
            private int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read = 1;
                    if (this.IconCompatParcelizer.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(setBorderColor setbordercolor, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = setbordercolor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass5(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.setBorderColor$write$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements getValidationToken {
            final /* synthetic */ int[] AudioAttributesCompatParcelizer;
            final /* synthetic */ boolean IconCompatParcelizer;
            final /* synthetic */ getValidationToken<Set<String>> RemoteActionCompatParcelizer;
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<int[]> read;
            final /* synthetic */ String[] write;

            /* JADX INFO: renamed from: o.setBorderColor$write$3$AudioAttributesCompatParcelizer */
            static final class AudioAttributesCompatParcelizer extends getTotalMcq {
                Object AudioAttributesCompatParcelizer;
                Object IconCompatParcelizer;
                final /* synthetic */ AnonymousClass3<T> RemoteActionCompatParcelizer;
                int read;
                /* synthetic */ Object write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AudioAttributesCompatParcelizer(AnonymousClass3<? super T> anonymousClass3, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                    super(sampleVideos);
                    this.RemoteActionCompatParcelizer = anonymousClass3;
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.write = obj;
                    this.read |= Integer.MIN_VALUE;
                    return this.RemoteActionCompatParcelizer.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
            
                if (r14.IconCompatParcelizer(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
            
                if (r14.IconCompatParcelizer(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
            
                return r1;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.getValidationToken
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(int[] r13, kotlin.SampleVideos<? super kotlin.getShowPopup> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof o.setBorderColor.write.AnonymousClass3.AudioAttributesCompatParcelizer
                    if (r0 == 0) goto L14
                    r0 = r14
                    o.setBorderColor$write$3$AudioAttributesCompatParcelizer r0 = (o.setBorderColor.write.AnonymousClass3.AudioAttributesCompatParcelizer) r0
                    int r1 = r0.read
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r14 = r0.read
                    int r14 = r14 + r2
                    r0.read = r14
                    goto L19
                L14:
                    o.setBorderColor$write$3$AudioAttributesCompatParcelizer r0 = new o.setBorderColor$write$3$AudioAttributesCompatParcelizer
                    r0.<init>(r12, r14)
                L19:
                    java.lang.Object r14 = r0.write
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.read
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    goto L32
                L2a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L32:
                    java.lang.Object r12 = r0.IconCompatParcelizer
                    r13 = r12
                    int[] r13 = (int[]) r13
                    java.lang.Object r12 = r0.AudioAttributesCompatParcelizer
                    o.setBorderColor$write$3 r12 = (o.setBorderColor.write.AnonymousClass3) r12
                    kotlin.SdkPayloadData.IconCompatParcelizer(r14)
                    goto Lb8
                L40:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r14)
                    o.MagicModuleUseCaseImplWhenMappings$write<int[]> r14 = r12.read
                    T r14 = r14.write
                    if (r14 != 0) goto L62
                    boolean r14 = r12.IconCompatParcelizer
                    if (r14 == 0) goto Lb8
                    o.getValidationToken<java.util.Set<java.lang.String>> r14 = r12.RemoteActionCompatParcelizer
                    java.lang.String[] r2 = r12.write
                    java.util.Set r2 = kotlin.getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(r2)
                    r0.AudioAttributesCompatParcelizer = r12
                    r0.IconCompatParcelizer = r13
                    r0.read = r4
                    java.lang.Object r14 = r14.IconCompatParcelizer(r2, r0)
                    if (r14 != r1) goto Lb8
                    goto Lb7
                L62:
                    java.lang.String[] r14 = r12.write
                    o.MagicModuleUseCaseImplWhenMappings$write<int[]> r2 = r12.read
                    int[] r4 = r12.AudioAttributesCompatParcelizer
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Collection r5 = (java.util.Collection) r5
                    int r6 = r14.length
                    r7 = 0
                    r8 = r7
                L72:
                    if (r7 >= r6) goto L98
                    r9 = r14[r7]
                    T r10 = r2.write
                    if (r10 == 0) goto L8c
                    int[] r10 = (int[]) r10
                    r11 = r4[r8]
                    r10 = r10[r11]
                    r11 = r13[r11]
                    if (r10 == r11) goto L87
                    r5.add(r9)
                L87:
                    int r7 = r7 + 1
                    int r8 = r8 + 1
                    goto L72
                L8c:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "Required value was null."
                    java.lang.String r13 = r13.toString()
                    r12.<init>(r13)
                    throw r12
                L98:
                    java.util.List r5 = (java.util.List) r5
                    r14 = r5
                    java.util.Collection r14 = (java.util.Collection) r14
                    boolean r14 = r14.isEmpty()
                    if (r14 != 0) goto Lb8
                    o.getValidationToken<java.util.Set<java.lang.String>> r14 = r12.RemoteActionCompatParcelizer
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.Set r2 = kotlin.IntermediateLoginResponseBody.onPlayFromUri(r5)
                    r0.AudioAttributesCompatParcelizer = r12
                    r0.IconCompatParcelizer = r13
                    r0.read = r3
                    java.lang.Object r14 = r14.IconCompatParcelizer(r2, r0)
                    if (r14 != r1) goto Lb8
                Lb7:
                    return r1
                Lb8:
                    o.MagicModuleUseCaseImplWhenMappings$write<int[]> r12 = r12.read
                    r12.write = r13
                    o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setBorderColor.write.AnonymousClass3.IconCompatParcelizer(int[], o.SampleVideos):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(MagicModuleUseCaseImplWhenMappings.write<int[]> writeVar, boolean z, getValidationToken<? super Set<String>> getvalidationtoken, String[] strArr, int[] iArr) {
                this.read = writeVar;
                this.IconCompatParcelizer = z;
                this.RemoteActionCompatParcelizer = getvalidationtoken;
                this.write = strArr;
                this.AudioAttributesCompatParcelizer = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(int[] iArr, boolean z, String[] strArr, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = iArr;
            this.IconCompatParcelizer = z;
            this.write = strArr;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = setBorderColor.this.new write(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
            writeVar.RemoteActionCompatParcelizer = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super Set<String>> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final NewNumberOtpResendRequest<Set<String>> AudioAttributesCompatParcelizer(String[] strArr, int[] iArr, boolean z) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(iArr, "");
        return VerifyNewNumberRequest.read((MagicModuleSubmissionRequestBody) new write(iArr, true, strArr, null));
    }

    public final Pair<String[], int[]> AudioAttributesCompatParcelizer(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        String[] strArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strArr);
        int length = strArrRemoteActionCompatParcelizer.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str = strArrRemoteActionCompatParcelizer[i];
            Map<String, Integer> map = this.AudioAttributesImplApi26Parcelizer;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str)));
            }
            iArr[i] = num.intValue();
        }
        return setAction.write(strArrRemoteActionCompatParcelizer, iArr);
    }

    private final String[] RemoteActionCompatParcelizer(String[] strArr) {
        Set setWrite = getKycMessage.write();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.MediaDescriptionCompat;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setWrite.addAll(set);
            } else {
                setWrite.add(str);
            }
        }
        return (String[]) getKycMessage.RemoteActionCompatParcelizer(setWrite).toArray(new String[0]);
    }

    public final boolean IconCompatParcelizer(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iArr);
    }

    public final boolean write(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return this.IconCompatParcelizer.write(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.setBorderColor.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r8
            o.setBorderColor$MediaBrowserCompatItemReceiver r0 = (o.setBorderColor.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.setBorderColor$MediaBrowserCompatItemReceiver r0 = new o.setBorderColor$MediaBrowserCompatItemReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.write
            o.setDoubleTapToZoomEnabled r7 = (kotlin.setDoubleTapToZoomEnabled) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L2e
            goto L5e
        L2e:
            r8 = move-exception
            goto L66
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.ValueClassSerializerStaticJsonValue r8 = r7.RemoteActionCompatParcelizer
            o.setDoubleTapToZoomEnabled r8 = r8.getAudioAttributesImplApi21Parcelizer()
            boolean r2 = r8.IconCompatParcelizer()
            if (r2 == 0) goto L6a
            o.ValueClassSerializerStaticJsonValue r2 = r7.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L62
            o.setBorderColor$AudioAttributesImplApi21Parcelizer r4 = new o.setBorderColor$AudioAttributesImplApi21Parcelizer     // Catch: java.lang.Throwable -> L62
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L62
            o.MagicModuleSubmissionRequestBody r4 = (kotlin.MagicModuleSubmissionRequestBody) r4     // Catch: java.lang.Throwable -> L62
            r0.write = r8     // Catch: java.lang.Throwable -> L62
            r0.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L62
            r7 = 0
            java.lang.Object r7 = r2.AudioAttributesCompatParcelizer(r7, r4, r0)     // Catch: java.lang.Throwable -> L62
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r7 = r8
        L5e:
            r7.RemoteActionCompatParcelizer()
            goto L6a
        L62:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L66:
            r7.RemoteActionCompatParcelizer()
            throw r8
        L6a:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBorderColor.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<a, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                aVar = (a) this.read;
                this.read = aVar;
                this.write = 1;
                obj = aVar.AudioAttributesCompatParcelizer(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return getShowPopup.INSTANCE;
                }
                aVar = (a) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                asUShort.IconCompatParcelizer[] iconCompatParcelizerArr = setBorderColor.this.IconCompatParcelizer.read();
                if (iconCompatParcelizerArr != null) {
                    this.read = null;
                    this.write = 2;
                    if (aVar.write(a.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, new AnonymousClass1(iconCompatParcelizerArr, setBorderColor.this, aVar, null), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.setBorderColor$AudioAttributesImplApi21Parcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<setDrawValueAboveBar<getShowPopup>, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ asUShort.IconCompatParcelizer[] AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            final /* synthetic */ a IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatItemReceiver;
            final /* synthetic */ setBorderColor RemoteActionCompatParcelizer;
            private int read;
            private int write;

            /* JADX INFO: renamed from: o.setBorderColor$AudioAttributesImplApi21Parcelizer$1$RemoteActionCompatParcelizer */
            public final /* synthetic */ class RemoteActionCompatParcelizer {
                public static final /* synthetic */ int[] IconCompatParcelizer;

                static {
                    int[] iArr = new int[asUShort.IconCompatParcelizer.values().length];
                    try {
                        iArr[asUShort.IconCompatParcelizer.IconCompatParcelizer.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[asUShort.IconCompatParcelizer.write.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[asUShort.IconCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    IconCompatParcelizer = iArr;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
            
                if (r7.AudioAttributesCompatParcelizer(r12, r6, r11) == r0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
            
                if (r7.RemoteActionCompatParcelizer(r12, r6, r11) == r0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
            
                return r0;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008a -> B:26:0x008b). Please report as a decompilation issue!!! */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r11.AudioAttributesImplBaseParcelizer
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L17:
                    int r1 = r11.MediaBrowserCompatItemReceiver
                    int r4 = r11.write
                    int r5 = r11.read
                    java.lang.Object r6 = r11.AudioAttributesImplApi21Parcelizer
                    o.a r6 = (kotlin.a) r6
                    java.lang.Object r7 = r11.AudioAttributesImplApi26Parcelizer
                    o.setBorderColor r7 = (kotlin.setBorderColor) r7
                    java.lang.Object r8 = r11.MediaBrowserCompatCustomActionResultReceiver
                    o.asUShort$IconCompatParcelizer[] r8 = (o.asUShort.IconCompatParcelizer[]) r8
                    kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                    r12 = r6
                    r6 = r5
                    goto L8b
                L2f:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                    o.asUShort$IconCompatParcelizer[] r12 = r11.AudioAttributesCompatParcelizer
                    o.setBorderColor r1 = r11.RemoteActionCompatParcelizer
                    o.a r4 = r11.IconCompatParcelizer
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3f:
                    if (r4 >= r1) goto L8d
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = o.setBorderColor.AudioAttributesImplApi21Parcelizer.AnonymousClass1.RemoteActionCompatParcelizer.IconCompatParcelizer
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L8a
                    if (r5 == r2) goto L72
                    r10 = 3
                    if (r5 != r10) goto L6c
                    r5 = r12
                    o.ValueClassBoxConverterdelegatingSerializer2 r5 = (kotlin.ValueClassBoxConverterdelegatingSerializer2) r5
                    r11.MediaBrowserCompatCustomActionResultReceiver = r8
                    r11.AudioAttributesImplApi26Parcelizer = r7
                    r11.AudioAttributesImplApi21Parcelizer = r12
                    r11.read = r9
                    r11.write = r4
                    r11.MediaBrowserCompatItemReceiver = r1
                    r11.AudioAttributesImplBaseParcelizer = r2
                    java.lang.Object r5 = kotlin.setBorderColor.AudioAttributesCompatParcelizer(r7, r5, r6, r11)
                    if (r5 != r0) goto L8a
                    goto L89
                L6c:
                    o.RenewEligibleCreator r11 = new o.RenewEligibleCreator
                    r11.<init>()
                    throw r11
                L72:
                    r5 = r12
                    o.ValueClassBoxConverterdelegatingSerializer2 r5 = (kotlin.ValueClassBoxConverterdelegatingSerializer2) r5
                    r11.MediaBrowserCompatCustomActionResultReceiver = r8
                    r11.AudioAttributesImplApi26Parcelizer = r7
                    r11.AudioAttributesImplApi21Parcelizer = r12
                    r11.read = r9
                    r11.write = r4
                    r11.MediaBrowserCompatItemReceiver = r1
                    r11.AudioAttributesImplBaseParcelizer = r3
                    java.lang.Object r5 = kotlin.setBorderColor.write(r7, r5, r6, r11)
                    if (r5 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r6 = r9
                L8b:
                    int r4 = r4 + r3
                    goto L3f
                L8d:
                    o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setBorderColor.AudioAttributesImplApi21Parcelizer.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(asUShort.IconCompatParcelizer[] iconCompatParcelizerArr, setBorderColor setbordercolor, a aVar, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = iconCompatParcelizerArr;
                this.RemoteActionCompatParcelizer = setbordercolor;
                this.IconCompatParcelizer = aVar;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(setDrawValueAboveBar<getShowPopup> setdrawvalueabovebar, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(setdrawvalueabovebar, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = setBorderColor.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
            audioAttributesImplApi21Parcelizer.read = obj;
            return audioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(a aVar, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(aVar, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (kotlin.setBorderWidth.write(r1, r3, r4) != r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (kotlin.setBorderWidth.write(r10, r3, r4) == r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f3 -> B:27:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.ValueClassBoxConverterdelegatingSerializer2 r18, int r19, kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBorderColor.RemoteActionCompatParcelizer(o.ValueClassBoxConverterdelegatingSerializer2, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.ValueClassBoxConverterdelegatingSerializer2 r9, int r10, kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o.setBorderColor.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r11
            o.setBorderColor$MediaBrowserCompatCustomActionResultReceiver r0 = (o.setBorderColor.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.AudioAttributesImplApi21Parcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.AudioAttributesImplApi21Parcelizer
            int r11 = r11 + r2
            r0.AudioAttributesImplApi21Parcelizer = r11
            goto L19
        L14:
            o.setBorderColor$MediaBrowserCompatCustomActionResultReceiver r0 = new o.setBorderColor$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesImplApi21Parcelizer
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            int r8 = r0.IconCompatParcelizer
            int r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.Object r2 = r0.write
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.read
            o.ValueClassBoxConverterdelegatingSerializer2 r4 = (kotlin.ValueClassBoxConverterdelegatingSerializer2) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            r11 = r10
            r10 = r4
            goto L83
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            java.lang.String[] r8 = r8.MediaBrowserCompatSearchResultReceiver
            r8 = r8[r10]
            java.lang.String[] r10 = kotlin.setBorderColor.read
            int r11 = r10.length
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L55:
            if (r9 >= r8) goto L85
            r4 = r11[r9]
            java.lang.String r4 = o.setBorderColor.IconCompatParcelizer.RemoteActionCompatParcelizer(r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.read = r10
            r0.write = r2
            r0.AudioAttributesCompatParcelizer = r11
            r0.RemoteActionCompatParcelizer = r9
            r0.IconCompatParcelizer = r8
            r0.AudioAttributesImplApi21Parcelizer = r3
            java.lang.Object r4 = kotlin.setBorderWidth.write(r10, r4, r0)
            if (r4 != r1) goto L83
            return r1
        L83:
            int r9 = r9 + r3
            goto L55
        L85:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBorderColor.AudioAttributesCompatParcelizer(o.ValueClassBoxConverterdelegatingSerializer2, int, o.SampleVideos):java.lang.Object");
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        if (this.MediaBrowserCompatItemReceiver.compareAndSet(false, true)) {
            getcreatedondatems.invoke();
            C0201setMcqCount.IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), new isScoreStatsAvailable("Room Invalidation Tracker Refresh"), null, new AudioAttributesImplBaseParcelizer(getcreatedondatems2, null), 2);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = setBorderColor.this.AudioAttributesCompatParcelizer(this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                this.write.invoke();
                return getShowPopup.INSTANCE;
            } catch (Throwable th) {
                this.write.invoke();
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setBorderColor.this.new AudioAttributesImplBaseParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super java.util.Set<java.lang.Integer>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o.setBorderColor.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.setBorderColor$RemoteActionCompatParcelizer r0 = (o.setBorderColor.RemoteActionCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o.setBorderColor$RemoteActionCompatParcelizer r0 = new o.setBorderColor$RemoteActionCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            o.setDoubleTapToZoomEnabled r8 = (kotlin.setDoubleTapToZoomEnabled) r8
            java.lang.Object r0 = r0.write
            o.setBorderColor r0 = (kotlin.setBorderColor) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L32
            goto L8e
        L32:
            r9 = move-exception
            goto Lab
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.ValueClassSerializerStaticJsonValue r9 = r8.RemoteActionCompatParcelizer
            o.setDoubleTapToZoomEnabled r9 = r9.getAudioAttributesImplApi21Parcelizer()
            boolean r2 = r9.IconCompatParcelizer()
            if (r2 == 0) goto Laf
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> La7
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto L5d
            java.util.Set r8 = kotlin.getKycMessage.read()     // Catch: java.lang.Throwable -> La7
            r9.RemoteActionCompatParcelizer()
            return r8
        L5d:
            o.getCreatedOnDateMs<java.lang.Boolean> r2 = r8.AudioAttributesImplApi21Parcelizer     // Catch: java.lang.Throwable -> La7
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> La7
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La7
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto L73
            java.util.Set r8 = kotlin.getKycMessage.read()     // Catch: java.lang.Throwable -> La7
            r9.RemoteActionCompatParcelizer()
            return r8
        L73:
            o.ValueClassSerializerStaticJsonValue r2 = r8.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> La7
            o.setBorderColor$read r5 = new o.setBorderColor$read     // Catch: java.lang.Throwable -> La7
            r6 = 0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La7
            o.MagicModuleSubmissionRequestBody r5 = (kotlin.MagicModuleSubmissionRequestBody) r5     // Catch: java.lang.Throwable -> La7
            r0.write = r8     // Catch: java.lang.Throwable -> La7
            r0.AudioAttributesCompatParcelizer = r9     // Catch: java.lang.Throwable -> La7
            r0.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer(r4, r5, r0)     // Catch: java.lang.Throwable -> La7
            if (r0 != r1) goto L8a
            return r1
        L8a:
            r7 = r0
            r0 = r8
            r8 = r9
            r9 = r7
        L8e:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L32
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto La3
            o.ValueClassBoxConverter r1 = r0.write     // Catch: java.lang.Throwable -> L32
            r1.AudioAttributesCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L32
            o.getAnswerMap<java.util.Set<java.lang.Integer>, o.getShowPopup> r0 = r0.AudioAttributesImplBaseParcelizer     // Catch: java.lang.Throwable -> L32
            r0.invoke(r9)     // Catch: java.lang.Throwable -> L32
        La3:
            r8.RemoteActionCompatParcelizer()
            return r9
        La7:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lab:
            r8.RemoteActionCompatParcelizer()
            throw r9
        Laf:
            java.util.Set r8 = kotlin.getKycMessage.read()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBorderColor.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<a, SampleVideos<? super Set<? extends Integer>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    aVar = (a) this.read;
                    this.read = aVar;
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = aVar.AudioAttributesCompatParcelizer(this);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                        return (Set) obj;
                    }
                    aVar = (a) this.read;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return getKycMessage.read();
                }
                this.read = null;
                this.AudioAttributesCompatParcelizer = 2;
                obj = aVar.write(a.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, new AnonymousClass3(setBorderColor.this, null), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                return (Set) obj;
            } catch (SQLException unused) {
                return getKycMessage.read();
            }
        }

        /* JADX INFO: renamed from: o.setBorderColor$read$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<setDrawValueAboveBar<Set<? extends Integer>>, SampleVideos<? super Set<? extends Integer>>, Object> {
            private int AudioAttributesCompatParcelizer;
            final /* synthetic */ setBorderColor RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                setDrawValueAboveBar setdrawvalueabovebar = (setDrawValueAboveBar) this.read;
                this.AudioAttributesCompatParcelizer = 1;
                Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setdrawvalueabovebar, this);
                return objRemoteActionCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objRemoteActionCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(setBorderColor setbordercolor, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = setbordercolor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass3.read = obj;
                return anonymousClass3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(setDrawValueAboveBar<Set<Integer>> setdrawvalueabovebar, SampleVideos<? super Set<Integer>> sampleVideos) {
                return ((AnonymousClass3) create(setdrawvalueabovebar, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = setBorderColor.this.new read(sampleVideos);
            readVar.read = obj;
            return readVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(a aVar, SampleVideos<? super Set<Integer>> sampleVideos) {
            return ((read) create(aVar, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.ValueClassBoxConverterdelegatingSerializer2 r5, kotlin.SampleVideos<? super java.util.Set<java.lang.Integer>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.setBorderColor.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.setBorderColor$AudioAttributesCompatParcelizer r0 = (o.setBorderColor.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r4 = r0.IconCompatParcelizer
            int r4 = r4 + r2
            r0.IconCompatParcelizer = r4
            goto L19
        L14:
            o.setBorderColor$AudioAttributesCompatParcelizer r0 = new o.setBorderColor$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r6 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r0.IconCompatParcelizer
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.util.Set r5 = (java.util.Set) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            return r5
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            o.ValueClassBoxConverterdelegatingSerializer2 r5 = (kotlin.ValueClassBoxConverterdelegatingSerializer2) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            goto L55
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            o.setAutoScaleMinMaxEnabled r4 = new o.setAutoScaleMinMaxEnabled
            r4.<init>()
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.AudioAttributesCompatParcelizer(r1, r4, r0)
            if (r4 == r6) goto L6e
        L55:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6d
            r0.RemoteActionCompatParcelizer = r4
            r0.IconCompatParcelizer = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = kotlin.setBorderWidth.write(r5, r1, r0)
            if (r5 != r6) goto L6d
            goto L6e
        L6d:
            return r4
        L6e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setBorderColor.RemoteActionCompatParcelizer(o.ValueClassBoxConverterdelegatingSerializer2, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels) {
        toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
        Set setWrite = getKycMessage.write();
        while (setdrawentrylabels.write()) {
            setWrite.add(Integer.valueOf((int) setdrawentrylabels.IconCompatParcelizer(0)));
        }
        return getKycMessage.RemoteActionCompatParcelizer(setWrite);
    }

    public final void write() {
        this.IconCompatParcelizer.write();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setBorderColor$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "read", "[Ljava/lang/String;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String write(String p0, String p1) {
            StringBuilder sb = new StringBuilder("room_table_modification_trigger_");
            sb.append(p0);
            sb.append('_');
            sb.append(p1);
            return sb.toString();
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}

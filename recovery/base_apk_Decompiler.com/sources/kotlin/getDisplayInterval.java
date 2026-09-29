package kotlin;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001d\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J`\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u00020\u00132\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180\u001c2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001fJ*\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180\u001c2\u0006\u0010\u0003\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b \u0010!J\u0018\u0010\u0016\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0016\u0010!J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001d\u0010#J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&"}, d2 = {"Lo/getDisplayInterval;", "Lo/UriData;", "Lo/LogLogLevel;", "p0", "<init>", "(Lo/LogLogLevel;)V", "", "", "Lo/getBigEndianInt;", "p1", "", "p2", "Ljava/time/YearMonth;", "p3", "", "p4", "p5", "Lo/durationUsToSampleCount;", "p6", "", "p7", "Lo/getBody;", "RemoteActionCompatParcelizer", "(ILjava/util/List;JLjava/time/YearMonth;ZZLo/durationUsToSampleCount;Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "", "", "read", "(Lo/durationUsToSampleCount;Ljava/util/List;)V", "Ljava/util/TreeMap;", "write", "(Ljava/util/TreeMap;)Ljava/lang/String;", "(Ljava/util/TreeMap;Ljava/time/YearMonth;)Ljava/util/TreeMap;", "IconCompatParcelizer", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lo/getInt;", "(JILo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "(JJ)Ljava/util/List;", "Lo/LogLogLevel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getDisplayInterval implements UriData {
    private final LogLogLevel IconCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return getDisplayInterval.AudioAttributesCompatParcelizer(getDisplayInterval.this, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int read;
        long write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return getDisplayInterval.read(getDisplayInterval.this, this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        boolean MediaBrowserCompatSearchResultReceiver;
        Object MediaDescriptionCompat;
        Object MediaMetadataCompat;
        boolean RatingCompat;
        long RemoteActionCompatParcelizer;
        /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler;
        int onCommand;
        Object read;
        int write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.handleMediaPlayPauseIfPendingOnHandler = obj;
            this.onCommand |= Integer.MIN_VALUE;
            return getDisplayInterval.this.RemoteActionCompatParcelizer(0, null, 0L, null, false, false, null, null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        int AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
            return getDisplayInterval.RemoteActionCompatParcelizer(getDisplayInterval.this, this);
        }
    }

    @setSdkPayload
    public getDisplayInterval(LogLogLevel logLogLevel) {
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        this.IconCompatParcelizer = logLogLevel;
    }

    public static final /* synthetic */ Object AudioAttributesCompatParcelizer(getDisplayInterval getdisplayinterval, SampleVideos sampleVideos) {
        return getdisplayinterval.IconCompatParcelizer(0, sampleVideos);
    }

    public static final /* synthetic */ Object RemoteActionCompatParcelizer(getDisplayInterval getdisplayinterval, SampleVideos sampleVideos) {
        return getdisplayinterval.write(0L, 0, sampleVideos);
    }

    public static final /* synthetic */ Object read(getDisplayInterval getdisplayinterval, SampleVideos sampleVideos) {
        return getdisplayinterval.RemoteActionCompatParcelizer(0, (SampleVideos<? super getInt>) sampleVideos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.TreeMap] */
    @Override // kotlin.UriData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(int r24, java.util.List<kotlin.getBigEndianInt> r25, long r26, java.time.YearMonth r28, boolean r29, boolean r30, kotlin.durationUsToSampleCount r31, java.lang.String r32, kotlin.SampleVideos<? super java.util.List<? extends kotlin.getBody>> r33) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDisplayInterval.RemoteActionCompatParcelizer(int, java.util.List, long, java.time.YearMonth, boolean, boolean, o.durationUsToSampleCount, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    private static String write(TreeMap<YearMonth, List<getBigEndianInt>> p0) {
        Set<YearMonth> setKeySet = p0.keySet();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
        Object objRatingCompat = IntermediateLoginResponseBody.RatingCompat(setKeySet);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRatingCompat, "");
        int monthValue = ((YearMonth) objRatingCompat).getMonthValue();
        fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
        String str = fromAdPlaybackState.RemoteActionCompatParcelizer()[monthValue - 1];
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    private static TreeMap<YearMonth, List<getBigEndianInt>> read(TreeMap<YearMonth, List<getBigEndianInt>> p0, YearMonth p1) {
        if (p1 == null) {
            return p0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<YearMonth, List<getBigEndianInt>> entry : p0.entrySet()) {
            if (!entry.getKey().isAfter(p1)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new TreeMap<>(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object IconCompatParcelizer(int r6, kotlin.SampleVideos<? super java.util.TreeMap<java.time.YearMonth, java.util.List<kotlin.getBigEndianInt>>> r7) throws java.text.ParseException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.getDisplayInterval.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.getDisplayInterval$AudioAttributesCompatParcelizer r0 = (o.getDisplayInterval.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.IconCompatParcelizer
            int r7 = r7 + r2
            r0.IconCompatParcelizer = r7
            goto L19
        L14:
            o.getDisplayInterval$AudioAttributesCompatParcelizer r0 = new o.getDisplayInterval$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r5 = r0.write
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L50
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r6
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r6, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r4 = r7
            r7 = r5
            r5 = r4
        L50:
            o.getInt r7 = (kotlin.getInt) r7
            long r0 = r7.write()
            long r6 = r7.read()
            java.util.List r6 = AudioAttributesCompatParcelizer(r0, r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L64:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7e
            java.lang.Object r7 = r6.next()
            java.time.YearMonth r7 = (java.time.YearMonth) r7
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            r0.put(r7, r1)
            goto L64
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDisplayInterval.IconCompatParcelizer(int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object RemoteActionCompatParcelizer(int r14, kotlin.SampleVideos<? super kotlin.getInt> r15) throws java.text.ParseException {
        /*
            r13 = this;
            boolean r0 = r15 instanceof o.getDisplayInterval.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r15
            o.getDisplayInterval$IconCompatParcelizer r0 = (o.getDisplayInterval.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.AudioAttributesCompatParcelizer
            int r15 = r15 + r2
            r0.AudioAttributesCompatParcelizer = r15
            goto L19
        L14:
            o.getDisplayInterval$IconCompatParcelizer r0 = new o.getDisplayInterval$IconCompatParcelizer
            r0.<init>(r15)
        L19:
            java.lang.Object r15 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r13 = r0.write
            int r0 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            goto L50
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            o.fromAdPlaybackState r15 = kotlin.fromAdPlaybackState.read
            long r4 = kotlin.fromAdPlaybackState.IconCompatParcelizer(r14)
            o.LogLogLevel r13 = r13.IconCompatParcelizer
            r0.read = r14
            r0.write = r4
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r15 = r13.write(r0)
            if (r15 != r1) goto L4e
            return r1
        L4e:
            r0 = r14
            r13 = r4
        L50:
            com.marrow.data.models.common.CourseConfigV2 r15 = (com.marrow.data.models.common.CourseConfigV2) r15
            java.util.List r15 = r15.getAcademicYears()
            o.fromAdPlaybackState r1 = kotlin.fromAdPlaybackState.read
            long r5 = kotlin.fromAdPlaybackState.read(r0)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r15.next()
            com.marrow.data.models.common.CourseConfigV2$AcademicYear r0 = (com.marrow.data.models.common.CourseConfigV2.AcademicYear) r0
            long r1 = r0.getStartDate()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L62
            long r1 = r0.getEndDate()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L62
            o.getInt r13 = new o.getInt
            long r8 = r0.getStartDate()
            long r10 = r0.getEndDate()
            java.lang.String r12 = r0.getLabel()
            r7 = r13
            r7.<init>(r8, r10, r12)
            return r13
        L91:
            o.getInt r15 = new o.getInt
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r13 + r0
            java.lang.String r7 = ""
            r2 = r15
            r2.<init>(r3, r5, r7)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDisplayInterval.RemoteActionCompatParcelizer(int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(long r6, int r8, kotlin.SampleVideos<? super java.util.List<? extends kotlin.getBody>> r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDisplayInterval.write(long, int, o.SampleVideos):java.lang.Object");
    }

    private static List<YearMonth> AudioAttributesCompatParcelizer(long p0, long p1) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(p0 / 86400000);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(localDateOfEpochDay, "");
        LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(p1 / 86400000);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(localDateOfEpochDay2, "");
        YearMonth yearMonthFrom = YearMonth.from(localDateOfEpochDay);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(yearMonthFrom, "");
        while (!yearMonthFrom.isAfter(YearMonth.from(localDateOfEpochDay2))) {
            arrayList.add(yearMonthFrom);
            yearMonthFrom = yearMonthFrom.plusMonths(1L);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(yearMonthFrom, "");
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015"}, d2 = {"Lo/getDisplayInterval$write;", "", "", "Lo/getBody;", "p0", "p1", "p2", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/util/List;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "write", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final List<getBody> IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final List<getBody> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final List<getBody> read;

        private write(List<getBody> list, List<getBody> list2, List<getBody> list3) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            toMagicModuleMetaRepoModel.write(list3, "");
            this.RemoteActionCompatParcelizer = list;
            this.read = list2;
            this.IconCompatParcelizer = list3;
        }

        public /* synthetic */ write(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? new ArrayList() : arrayList3);
        }

        public final List<getBody> RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final List<getBody> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final List<getBody> IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: o.getDisplayInterval$write$read, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/getDisplayInterval$write$read;", "", "<init>", "()V", "Ljava/util/TreeMap;", "Ljava/time/YearMonth;", "", "Lo/getBigEndianInt;", "p0", "", "p1", "Lo/getDisplayInterval$write;", "RemoteActionCompatParcelizer", "(Ljava/util/TreeMap;Ljava/lang/String;)Lo/getDisplayInterval$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static write RemoteActionCompatParcelizer(TreeMap<YearMonth, List<getBigEndianInt>> p0, String p1) {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                write writeVar = new write(null, null, null, 7, null);
                LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(System.currentTimeMillis() / 86400000);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(localDateOfEpochDay, "");
                YearMonth yearMonthFrom = YearMonth.from(localDateOfEpochDay);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(yearMonthFrom, "");
                Set<YearMonth> setKeySet = p0.keySet();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
                boolean z = false;
                for (YearMonth yearMonth : setKeySet) {
                    if (yearMonth.compareTo(yearMonthFrom) < 0) {
                        List<getBody> listIconCompatParcelizer = writeVar.IconCompatParcelizer();
                        TimeInterval timeInterval = TimeInterval.write;
                        listIconCompatParcelizer.add(TimeInterval.IconCompatParcelizer(yearMonth.getMonthValue() - 1, yearMonth.getYear(), false, LoyaltyPointsBalanceBuilder.AudioAttributesCompatParcelizer, true, p1));
                        List<getBigEndianInt> list = p0.get(yearMonth);
                        if (list != null && !list.isEmpty()) {
                            List<getBigEndianInt> list2 = p0.get(yearMonth);
                            if (list2 != null) {
                                for (getBigEndianInt getbigendianint : list2) {
                                    List<getBody> listIconCompatParcelizer2 = writeVar.IconCompatParcelizer();
                                    TimeInterval timeInterval2 = TimeInterval.write;
                                    listIconCompatParcelizer2.add(TimeInterval.AudioAttributesCompatParcelizer(getbigendianint, yearMonth.getMonthValue() - 1, false, LoyaltyPointsBalanceBuilder.AudioAttributesCompatParcelizer, true));
                                }
                            }
                        } else {
                            writeVar.IconCompatParcelizer().add(TimeInterval.AudioAttributesCompatParcelizer(true, yearMonth.getMonthValue() - 1, yearMonth.getYear()));
                        }
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(yearMonth, yearMonthFrom)) {
                        List<getBody> listRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
                        TimeInterval timeInterval3 = TimeInterval.write;
                        listRemoteActionCompatParcelizer.add(TimeInterval.IconCompatParcelizer(yearMonth.getMonthValue() - 1, yearMonth.getYear(), true, LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer, true, p1));
                        List<getBigEndianInt> list3 = p0.get(yearMonth);
                        if (list3 != null && !list3.isEmpty()) {
                            List<getBigEndianInt> list4 = p0.get(yearMonth);
                            if (list4 != null) {
                                for (getBigEndianInt getbigendianint2 : list4) {
                                    List<getBody> listRemoteActionCompatParcelizer2 = writeVar.RemoteActionCompatParcelizer();
                                    TimeInterval timeInterval4 = TimeInterval.write;
                                    listRemoteActionCompatParcelizer2.add(TimeInterval.AudioAttributesCompatParcelizer(getbigendianint2, yearMonth.getMonthValue() - 1, true, LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer, true));
                                }
                            }
                        } else {
                            writeVar.RemoteActionCompatParcelizer().add(TimeInterval.AudioAttributesCompatParcelizer(true, yearMonth.getMonthValue() - 1, yearMonth.getYear()));
                        }
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(yearMonth, yearMonthFrom.plusMonths(1L))) {
                        List<getBody> listAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer();
                        TimeInterval timeInterval5 = TimeInterval.write;
                        listAudioAttributesCompatParcelizer.add(TimeInterval.IconCompatParcelizer(yearMonth.getMonthValue() - 1, yearMonth.getYear(), true, LoyaltyPointsBalanceBuilder.read, true, p1));
                        List<getBigEndianInt> list5 = p0.get(yearMonth);
                        if (list5 != null && !list5.isEmpty()) {
                            List<getBigEndianInt> list6 = p0.get(yearMonth);
                            if (list6 != null) {
                                for (getBigEndianInt getbigendianint3 : list6) {
                                    List<getBody> listAudioAttributesCompatParcelizer2 = writeVar.AudioAttributesCompatParcelizer();
                                    TimeInterval timeInterval6 = TimeInterval.write;
                                    listAudioAttributesCompatParcelizer2.add(TimeInterval.AudioAttributesCompatParcelizer(getbigendianint3, yearMonth.getMonthValue() - 1, true, LoyaltyPointsBalanceBuilder.read, true));
                                }
                            }
                        } else {
                            writeVar.AudioAttributesCompatParcelizer().add(TimeInterval.AudioAttributesCompatParcelizer(true, yearMonth.getMonthValue() - 1, yearMonth.getYear()));
                        }
                    } else {
                        if (!z) {
                            List<getBody> listAudioAttributesCompatParcelizer3 = writeVar.AudioAttributesCompatParcelizer();
                            String string = yearMonth.toString();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            listAudioAttributesCompatParcelizer3.add(TimeInterval.RemoteActionCompatParcelizer(string));
                            z = true;
                        }
                        List<getBody> listAudioAttributesCompatParcelizer4 = writeVar.AudioAttributesCompatParcelizer();
                        TimeInterval timeInterval7 = TimeInterval.write;
                        listAudioAttributesCompatParcelizer4.add(TimeInterval.IconCompatParcelizer(yearMonth.getMonthValue() - 1, yearMonth.getYear(), false, LoyaltyPointsBalanceBuilder.read, false, p1));
                        List<getBigEndianInt> list7 = p0.get(yearMonth);
                        if (list7 != null && !list7.isEmpty()) {
                            List<getBigEndianInt> list8 = p0.get(yearMonth);
                            if (list8 != null) {
                                for (getBigEndianInt getbigendianint4 : list8) {
                                    List<getBody> listAudioAttributesCompatParcelizer5 = writeVar.AudioAttributesCompatParcelizer();
                                    TimeInterval timeInterval8 = TimeInterval.write;
                                    listAudioAttributesCompatParcelizer5.add(TimeInterval.AudioAttributesCompatParcelizer(getbigendianint4, yearMonth.getMonthValue() - 1, false, LoyaltyPointsBalanceBuilder.read, false));
                                }
                            }
                        } else {
                            writeVar.AudioAttributesCompatParcelizer().add(TimeInterval.AudioAttributesCompatParcelizer(false, yearMonth.getMonthValue() - 1, yearMonth.getYear()));
                        }
                    }
                }
                return writeVar;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public write() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, writeVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, writeVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            List<getBody> list = this.RemoteActionCompatParcelizer;
            List<getBody> list2 = this.read;
            List<getBody> list3 = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("write(RemoteActionCompatParcelizer=");
            sb.append(list);
            sb.append(", read=");
            sb.append(list2);
            sb.append(", IconCompatParcelizer=");
            sb.append(list3);
            sb.append(")");
            return sb.toString();
        }
    }

    private static void read(durationUsToSampleCount p0, List<getBody> p1) {
        Iterator<getBody> it = p1.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            getBody next = it.next();
            if ((next instanceof getBody.MediaBrowserCompatItemReceiver) && ((getBody.MediaBrowserCompatItemReceiver) next).IconCompatParcelizer().getOnAddQueueItem() == 1) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            p1.add(i, new getBody.IconCompatParcelizer(p0.RemoteActionCompatParcelizer(), p0.RemoteActionCompatParcelizer().length() > 0));
        }
    }
}

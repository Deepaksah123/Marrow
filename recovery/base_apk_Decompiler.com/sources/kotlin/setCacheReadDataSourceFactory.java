package kotlin;

import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.mcq.McqTimerAnalyticsModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setCacheReadDataSourceFactory implements createDataSourceForDownloading {
    private final setEventListener AudioAttributesCompatParcelizer;
    private final setCacheWriteDataSinkFactory IconCompatParcelizer;
    private final onCacheInitialized MediaBrowserCompatCustomActionResultReceiver;
    private final setUpstreamDataSourceFactory RemoteActionCompatParcelizer;
    private final setUpstreamPriority read;
    private final CacheEvictor write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object IconCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return setCacheReadDataSourceFactory.this.RemoteActionCompatParcelizer((String) null, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return setCacheReadDataSourceFactory.this.write((String) null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return setCacheReadDataSourceFactory.this.read((isOpenEnded) null, this);
        }
    }

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return setCacheReadDataSourceFactory.this.IconCompatParcelizer(null, null, this);
        }
    }

    @setSdkPayload
    public setCacheReadDataSourceFactory(setUpstreamPriority setupstreampriority, CacheEvictor cacheEvictor, setEventListener seteventlistener, setCacheWriteDataSinkFactory setcachewritedatasinkfactory, setUpstreamDataSourceFactory setupstreamdatasourcefactory, onCacheInitialized oncacheinitialized) {
        toMagicModuleMetaRepoModel.write(setupstreampriority, "");
        toMagicModuleMetaRepoModel.write(cacheEvictor, "");
        toMagicModuleMetaRepoModel.write(seteventlistener, "");
        toMagicModuleMetaRepoModel.write(setcachewritedatasinkfactory, "");
        toMagicModuleMetaRepoModel.write(setupstreamdatasourcefactory, "");
        toMagicModuleMetaRepoModel.write(oncacheinitialized, "");
        this.read = setupstreampriority;
        this.write = cacheEvictor;
        this.AudioAttributesCompatParcelizer = seteventlistener;
        this.IconCompatParcelizer = setcachewritedatasinkfactory;
        this.RemoteActionCompatParcelizer = setupstreamdatasourcefactory;
        this.MediaBrowserCompatCustomActionResultReceiver = oncacheinitialized;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r8.IconCompatParcelizer(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createDataSourceForDownloading
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r9, kotlin.onDisplayInfoChanged r10, kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o.setCacheReadDataSourceFactory.write
            if (r0 == 0) goto L14
            r0 = r11
            o.setCacheReadDataSourceFactory$write r0 = (o.setCacheReadDataSourceFactory.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.write
            int r11 = r11 + r2
            r0.write = r11
            goto L19
        L14:
            o.setCacheReadDataSourceFactory$write r0 = new o.setCacheReadDataSourceFactory$write
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            o.onDisplayInfoChanged r8 = (kotlin.onDisplayInfoChanged) r8
            java.lang.Object r8 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L7b
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            r10 = r9
            o.onDisplayInfoChanged r10 = (kotlin.onDisplayInfoChanged) r10
            java.lang.Object r9 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L58
        L49:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            r0.read = r5
            r0.AudioAttributesCompatParcelizer = r10
            r0.write = r4
            java.lang.Object r11 = r8.AudioAttributesImplApi21Parcelizer(r9, r0)
            if (r11 == r1) goto L7e
        L58:
            o.isHoleSpan r11 = (kotlin.isHoleSpan) r11
            long r6 = java.lang.System.currentTimeMillis()
            int r9 = kotlin.NonNullApi.IconCompatParcelizer(r10)
            o.isHoleSpan r9 = kotlin.isHoleSpan.AudioAttributesCompatParcelizer(r11, r6, r9)
            o.CacheEvictor r8 = r8.write
            java.util.List r9 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r9)
            r0.read = r5
            r0.AudioAttributesCompatParcelizer = r5
            r0.IconCompatParcelizer = r5
            r0.write = r3
            java.lang.Object r8 = r8.IconCompatParcelizer(r9, r0)
            if (r8 != r1) goto L7b
            goto L7e
        L7b:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCacheReadDataSourceFactory.IconCompatParcelizer(java.lang.String, o.onDisplayInfoChanged, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onAddQueueItem(String str) {
        return this.read.AudioAttributesImplApi21Parcelizer(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(List<isHoleSpan> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.write.IconCompatParcelizer(list, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createDataSourceForDownloading
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.isOpenEnded r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.setCacheReadDataSourceFactory.read
            if (r0 == 0) goto L14
            r0 = r7
            o.setCacheReadDataSourceFactory$read r0 = (o.setCacheReadDataSourceFactory.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.setCacheReadDataSourceFactory$read r0 = new o.setCacheReadDataSourceFactory$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.isOpenEnded r5 = (kotlin.isOpenEnded) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L6b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r6 = r0.IconCompatParcelizer
            o.isOpenEnded r6 = (kotlin.isOpenEnded) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L54
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.CacheEvictor r7 = r5.write
            java.util.List r2 = r6.read()
            r0.IconCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r7 = r7.IconCompatParcelizer(r2, r0)
            if (r7 == r1) goto L6e
        L54:
            o.setEventListener r7 = r5.AudioAttributesCompatParcelizer
            java.util.List r1 = r6.write()
            r7.RemoteActionCompatParcelizer(r1)
            o.setUpstreamPriority r5 = r5.read
            java.util.List r6 = r6.RemoteActionCompatParcelizer()
            r7 = 0
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r3
            r5.write(r6)
        L6b:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCacheReadDataSourceFactory.read(o.isOpenEnded, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object write(List<dropTable> list) {
        this.IconCompatParcelizer.write(list);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.read.write(str, sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesImplBaseParcelizer(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.write.read(str));
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        return this.RemoteActionCompatParcelizer.write(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onMediaButtonEvent(String str) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createDataSourceForDownloading
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.setCacheReadDataSourceFactory.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.setCacheReadDataSourceFactory$AudioAttributesCompatParcelizer r0 = (o.setCacheReadDataSourceFactory.AudioAttributesCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.setCacheReadDataSourceFactory$AudioAttributesCompatParcelizer r0 = new o.setCacheReadDataSourceFactory$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            kotlin.getYear.IconCompatParcelizer()
            int r1 = r0.write
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.lang.String r4 = (java.lang.String) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L60
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4c
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.setUpstreamPriority r6 = r4.read
            r0.IconCompatParcelizer = r5
            r0.write = r3
            r6.write(r5)
        L4c:
            o.setCacheWriteDataSinkFactory r6 = r4.IconCompatParcelizer
            r6.AudioAttributesCompatParcelizer(r5)
            o.setEventListener r6 = r4.AudioAttributesCompatParcelizer
            r6.RemoteActionCompatParcelizer(r5)
            o.setUpstreamDataSourceFactory r4 = r4.RemoteActionCompatParcelizer
            r6 = 0
            r0.IconCompatParcelizer = r6
            r0.write = r2
            r4.read(r5)
        L60:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCacheReadDataSourceFactory.RemoteActionCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(List<? extends LessonMcqUpdateInfo> list) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object RemoteActionCompatParcelizer(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer(str));
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onPause(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompatMediaItem(str));
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object RatingCompat(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(str));
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaBrowserCompatMediaItem(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str));
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super List<String>> sampleVideos) {
        return this.read.RemoteActionCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object read(List<addSpan> list) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(list);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object RemoteActionCompatParcelizer(List<C0162cache> list) {
        this.read.write(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object read(String str, String str2) {
        return this.IconCompatParcelizer.IconCompatParcelizer(str2, str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onPlayFromSearch(String str) {
        this.IconCompatParcelizer.MediaDescriptionCompat(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super isHoleSpan> sampleVideos) {
        return this.write.AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(dropTable droptable) {
        this.IconCompatParcelizer.read(droptable);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onCommand(String str) {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Integer> sampleVideos) {
        return this.write.read(sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaBrowserCompatItemReceiver(String str) {
        return this.read.read(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object read(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.IconCompatParcelizer.write(str, sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer() {
        this.write.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object write(String str, String str2) {
        return this.read.IconCompatParcelizer(str, str2);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesImplApi26Parcelizer(String str) {
        return this.read.AudioAttributesImplBaseParcelizer(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object read(String str, long j) {
        return this.read.IconCompatParcelizer(str, j);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaDescriptionCompat(String str) {
        return this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaBrowserCompatSearchResultReceiver(String str) {
        return this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesImplApi21Parcelizer(String str) {
        return this.IconCompatParcelizer.write(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onPlay(String str) {
        return this.IconCompatParcelizer.MediaMetadataCompat(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(String str, String str2) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, str2);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(CachedContentRange cachedContentRange) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(cachedContentRange);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaMetadataCompat(String str) {
        return this.AudioAttributesCompatParcelizer.read(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object write(String str, int i, int i2) {
        return this.write.read(str, i, i2);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onPlayFromMediaId(String str) {
        return this.read.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(String str) {
        this.read.RemoteActionCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object write(int i) {
        return this.write.RemoteActionCompatParcelizer(i);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object read(String str, int i) {
        return this.write.AudioAttributesCompatParcelizer(str, i);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(int i) {
        return this.write.write(i);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(String str, int i) {
        return this.write.RemoteActionCompatParcelizer(str, i);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(ArrayList<String> arrayList, SampleVideos<? super Map<String, ? extends List<Integer>>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.write(arrayList, sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer() {
        this.IconCompatParcelizer.IconCompatParcelizer();
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super List<isIndexFile>> sampleVideos) {
        return this.write.IconCompatParcelizer(str, str2, sampleVideos);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onFastForward(String str) {
        return this.write.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object handleMediaPlayPauseIfPendingOnHandler(String str) {
        return this.read.AudioAttributesImplApi21Parcelizer(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object read(String str) {
        this.IconCompatParcelizer.IconCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(String str) {
        this.read.IconCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object IconCompatParcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.IconCompatParcelizer.write(str, sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createDataSourceForDownloading
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.setCacheReadDataSourceFactory.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.setCacheReadDataSourceFactory$IconCompatParcelizer r0 = (o.setCacheReadDataSourceFactory.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            o.setCacheReadDataSourceFactory$IconCompatParcelizer r0 = new o.setCacheReadDataSourceFactory$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            kotlin.getYear.IconCompatParcelizer()
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            java.lang.String r4 = (java.lang.String) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L56
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4c
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.setCacheWriteDataSinkFactory r6 = r4.IconCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r3
            r6.read(r5)
        L4c:
            o.setUpstreamPriority r4 = r4.read
            r6 = 0
            r0.AudioAttributesCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r2
            r4.AudioAttributesCompatParcelizer(r5)
        L56:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCacheReadDataSourceFactory.write(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object AudioAttributesCompatParcelizer(String str, getMediaMimeType getmediamimetype) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str, getmediamimetype);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str) {
        return this.read.MediaBrowserCompatItemReceiver(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object onCustomAction(String str) {
        return this.MediaBrowserCompatCustomActionResultReceiver.read(str);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object RemoteActionCompatParcelizer(String str, String str2) {
        return this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(str, str2);
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object RemoteActionCompatParcelizer(McqTimerAnalyticsModel mcqTimerAnalyticsModel) {
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(mcqTimerAnalyticsModel);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.createDataSourceForDownloading
    public final Object write(String str) {
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}

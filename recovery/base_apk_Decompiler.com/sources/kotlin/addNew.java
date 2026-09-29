package kotlin;

import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.subject.Subject;
import com.marrow2.data.mcq.remote.McqFaqResponseBody;
import com.marrow2.data.mcq.remote.McqRemoteSource;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class addNew implements intersects {
    private final createDataSourceForDownloading AudioAttributesCompatParcelizer;
    private final Lazy<McqRemoteSource> write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return addNew.this.write((String) null, (onDisplayInfoChanged) null, 0, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return addNew.this.RemoteActionCompatParcelizer((String) null, (String) null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return addNew.this.AudioAttributesCompatParcelizer(0, this);
        }
    }

    static final class write extends getTotalMcq {
        int IconCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return addNew.this.onPlayFromMediaId(null, this);
        }
    }

    @setSdkPayload
    public addNew(createDataSourceForDownloading createdatasourcefordownloading, Lazy<McqRemoteSource> lazy) {
        toMagicModuleMetaRepoModel.write(createdatasourcefordownloading, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.AudioAttributesCompatParcelizer = createdatasourcefordownloading;
        this.write = lazy;
    }

    private final McqRemoteSource IconCompatParcelizer() {
        McqRemoteSource mcqRemoteSource = this.write.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mcqRemoteSource, "");
        return mcqRemoteSource;
    }

    @Override // kotlin.intersects
    public final Object write(List<isHoleSpan> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(list, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object read(List<C0162cache> list, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(List<addSpan> list) {
        this.AudioAttributesCompatParcelizer.read(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object RemoteActionCompatParcelizer(isOpenEnded isopenended, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = this.AudioAttributesCompatParcelizer.read(isopenended, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object read(List<dropTable> list) {
        this.AudioAttributesCompatParcelizer.write(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object onMediaButtonEvent(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object onCustomAction(String str, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object onPlayFromUri(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.onPlayFromSearch(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesCompatParcelizer(String str, String str2) {
        return this.AudioAttributesCompatParcelizer.read(str, str2);
    }

    @Override // kotlin.intersects
    public final Object onAddQueueItem(String str, SampleVideos<? super isHoleSpan> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(dropTable droptable, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(droptable);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str, SampleVideos<? super List<dropTable>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onCommand(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.intersects
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(int r5, kotlin.SampleVideos<? super kotlin.isWritingToCache> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.addNew.read
            if (r0 == 0) goto L14
            r0 = r6
            o.addNew$read r0 = (o.addNew.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r6 + r2
            r0.AudioAttributesCompatParcelizer = r6
            goto L19
        L14:
            o.addNew$read r0 = new o.addNew$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L46
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            com.marrow2.data.mcq.remote.McqRemoteSource r4 = r4.IconCompatParcelizer()
            r0.write = r5
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r4.resetBookmarks(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            com.marrow2.data.bookmark.remote.model.ResetBookmarkResponseBody r6 = (com.marrow2.data.bookmark.remote.model.ResetBookmarkResponseBody) r6
            o.isWritingToCache r4 = com.marrow2.data.bookmark.remote.model.ResetBookmarkResponseBodyKt.toResetBookmarkRepoModel(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addNew.AudioAttributesCompatParcelizer(int, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.intersects
    public final Object RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object onPause(String str, SampleVideos<? super requiresCacheSpanTouches> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(str);
    }

    @Override // kotlin.intersects
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object handleMediaPlayPauseIfPendingOnHandler(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.read(str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(str);
    }

    @Override // kotlin.intersects
    public final Object onPlay(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(str);
    }

    @Override // kotlin.intersects
    public final Object onPrepareFromSearch(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onMediaButtonEvent(str);
    }

    @Override // kotlin.intersects
    public final Object MediaBrowserCompatItemReceiver(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, sampleVideos);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesCompatParcelizer(List<? extends LessonMcqUpdateInfo> list, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(list);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.intersects
    public final Object write(String str) {
        return this.AudioAttributesCompatParcelizer.onPause(str);
    }

    @Override // kotlin.intersects
    public final Object read(String str) {
        return this.AudioAttributesCompatParcelizer.RatingCompat(str);
    }

    @Override // kotlin.intersects
    public final Object RemoteActionCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem(str);
    }

    @Override // kotlin.intersects
    public final Object write(String str, String str2, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (RemoteActionCompatParcelizer(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.intersects
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r6, kotlin.onDisplayInfoChanged r7, int r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o.addNew.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.addNew$AudioAttributesCompatParcelizer r0 = (o.addNew.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.read
            int r9 = r9 + r2
            r0.read = r9
            goto L19
        L14:
            o.addNew$AudioAttributesCompatParcelizer r0 = new o.addNew$AudioAttributesCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r5 = r0.write
            o.onDisplayInfoChanged r5 = (kotlin.onDisplayInfoChanged) r5
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L73
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            int r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.write
            r7 = r6
            o.onDisplayInfoChanged r7 = (kotlin.onDisplayInfoChanged) r7
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L63
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            com.marrow2.data.mcq.remote.McqRemoteSource r9 = r5.IconCompatParcelizer()
            r0.IconCompatParcelizer = r6
            r0.write = r7
            r0.RemoteActionCompatParcelizer = r8
            r0.read = r4
            java.lang.Object r9 = r9.updateBookmark(r6, r7, r8, r0)
            if (r9 == r1) goto L76
        L63:
            r9 = 0
            r0.IconCompatParcelizer = r9
            r0.write = r9
            r0.RemoteActionCompatParcelizer = r8
            r0.read = r3
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r6, r7, r0)
            if (r5 != r1) goto L73
            goto L76
        L73:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addNew.write(java.lang.String, o.onDisplayInfoChanged, int, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.intersects
    public final Object RemoteActionCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super getShowPopup> sampleVideos) {
        ServerSideAdInsertionMediaSourceExternalSyntheticLambda0.write(str);
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str, ondisplayinfochanged, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object onCommand(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onAddQueueItem(str);
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(str);
    }

    @Override // kotlin.intersects
    public final Object onFastForward(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.read(str, System.currentTimeMillis());
    }

    @Override // kotlin.intersects
    public final Object MediaBrowserCompatSearchResultReceiver(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaDescriptionCompat(str);
    }

    @Override // kotlin.intersects
    public final Object MediaDescriptionCompat(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver(str);
    }

    @Override // kotlin.intersects
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(str);
    }

    @Override // kotlin.intersects
    public final Object MediaBrowserCompatMediaItem(String str, SampleVideos<? super List<McqFaqResponseBody>> sampleVideos) {
        return IconCompatParcelizer().getFaqsForMcq(str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object onPlayFromSearch(String str, SampleVideos<? super List<getSpan>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onPlay(str);
    }

    @Override // kotlin.intersects
    public final Object read(String str, String str2, SampleVideos<? super CachedContentRange> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str2, str);
    }

    @Override // kotlin.intersects
    public final Object write(CachedContentRange cachedContentRange, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(cachedContentRange);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object MediaMetadataCompat(String str, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaMetadataCompat(str);
    }

    @Override // kotlin.intersects
    public final Object write(CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super List<CacheWriterProgressListener>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write(Subject.ROOT_PARENT_ID, 0, copyOnWriteMultiset.read());
    }

    @Override // kotlin.intersects
    public final Object write(String str, int i, CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super List<CacheWriterProgressListener>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write(str, i, copyOnWriteMultiset.read());
    }

    @Override // kotlin.intersects
    public final Object onPrepare(String str, SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onPlayFromMediaId(str);
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object read(int i, SampleVideos<? super List<CachedContentIndex>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write(i);
    }

    @Override // kotlin.intersects
    public final Object write(String str, int i, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.read(str, i);
    }

    @Override // kotlin.intersects
    public final Object write(int i, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
    }

    @Override // kotlin.intersects
    public final Object read(String str, int i, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str, i);
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(ArrayList<String> arrayList, SampleVideos<? super Map<String, ? extends List<Integer>>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(arrayList, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super List<isIndexFile>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, str2, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object onPrepareFromMediaId(String str, SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onFastForward(str);
    }

    @Override // kotlin.intersects
    public final Object RatingCompat(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler(str);
    }

    @Override // kotlin.intersects
    public final Object read(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.read(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object write(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.write(str, sampleVideos);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(String str, getMediaMimeType getmediamimetype, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, getmediamimetype);
    }

    @Override // kotlin.intersects
    public final Object AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    @Override // kotlin.intersects
    public final Object IconCompatParcelizer(int i, String str, SampleVideos<? super List<? extends McqResponseBody>> sampleVideos) {
        return IconCompatParcelizer().getRelatedMcq(i, str, sampleVideos);
    }

    @Override // kotlin.intersects
    public final Object write(writeContentMetadata writecontentmetadata, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getCipher.write(writecontentmetadata));
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.intersects
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onPlayFromMediaId(java.lang.String r5, kotlin.SampleVideos<? super java.util.List<kotlin.writeContentMetadata>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.addNew.write
            if (r0 == 0) goto L14
            r0 = r6
            o.addNew$write r0 = (o.addNew.write) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            o.addNew$write r0 = new o.addNew$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.createDataSourceForDownloading r4 = r4.AudioAttributesCompatParcelizer
            r6 = 0
            r0.read = r6
            r0.IconCompatParcelizer = r3
            java.lang.Object r6 = r4.onCustomAction(r5)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r6, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r6.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r5.next()
            com.marrow.data.models.mcq.McqTimerAnalyticsModel r6 = (com.marrow.data.models.mcq.McqTimerAnalyticsModel) r6
            o.writeContentMetadata r6 = kotlin.getCipher.read(r6)
            r4.add(r6)
            goto L58
        L6c:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addNew.onPlayFromMediaId(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.intersects
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r6, java.lang.String r7, kotlin.SampleVideos<? super kotlin.writeContentMetadata> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.addNew.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.addNew$IconCompatParcelizer r0 = (o.addNew.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.addNew$IconCompatParcelizer r0 = new o.addNew$IconCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.read
            java.lang.Object r5 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L49
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.createDataSourceForDownloading r5 = r5.AudioAttributesCompatParcelizer
            r0.IconCompatParcelizer = r4
            r0.read = r4
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r8 = r5.RemoteActionCompatParcelizer(r6, r7)
            if (r8 != r1) goto L49
            return r1
        L49:
            com.marrow.data.models.mcq.McqTimerAnalyticsModel r8 = (com.marrow.data.models.mcq.McqTimerAnalyticsModel) r8
            if (r8 == 0) goto L52
            o.writeContentMetadata r5 = kotlin.getCipher.read(r8)
            return r5
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addNew.RemoteActionCompatParcelizer(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.intersects
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        this.AudioAttributesCompatParcelizer.write(str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}

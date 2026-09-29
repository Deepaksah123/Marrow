package kotlin;

import com.marrow.designsystem.theme.AppTheme;
import kotlin.Metadata;
import kotlin.getRealClientPackageName;
import kotlin.isHoleSpan;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001b\u0010\u0010J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001c\u0010\u0010J\u001f\u0010\u0016\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0016\u0010!J/\u0010\u000f\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\"H\u0002¢\u0006\u0004\b\u000f\u0010$J\u000f\u0010\u000f\u001a\u00020%H\u0002¢\u0006\u0004\b\u000f\u0010&R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,"}, d2 = {"Lo/UnknownNull;", "Lo/beginSection;", "Lo/unlockFolder;", "p0", "Lo/closeCurrentOutputStream;", "p1", "Lo/intersects;", "p2", "Lo/copyWithMutationsApplied;", "p3", "Lo/getPlatform;", "p4", "<init>", "(Lo/unlockFolder;Lo/closeCurrentOutputStream;Lo/intersects;Lo/copyWithMutationsApplied;Lo/getPlatform;)V", "Lcom/marrow/designsystem/theme/AppTheme;", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "write", "", "(ZLo/SampleVideos;)Ljava/lang/Object;", "Lo/UriUtil;", "IconCompatParcelizer", "Lo/getUriIndices;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "read", "(Lcom/marrow/designsystem/theme/AppTheme;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getDrmUuid;", "", "Lo/zzhr;", "(Ljava/lang/String;Ljava/lang/String;)Lo/zzhr;", "Lo/isMetadataEqual;", "Lo/StatsEvent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/isMetadataEqual;)Lo/StatsEvent;", "Lo/setTextAppearanceResource;", "()Lo/setTextAppearanceResource;", "AudioAttributesImplApi26Parcelizer", "Lo/unlockFolder;", "Lo/closeCurrentOutputStream;", "Lo/intersects;", "Lo/copyWithMutationsApplied;", "Lo/getPlatform;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnknownNull implements beginSection {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final closeCurrentOutputStream IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final unlockFolder RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final copyWithMutationsApplied write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final intersects AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getPlatform read;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return UnknownNull.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return UnknownNull.this.read(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return UnknownNull.this.RemoteActionCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public UnknownNull(unlockFolder unlockfolder, closeCurrentOutputStream closecurrentoutputstream, intersects intersectsVar, copyWithMutationsApplied copywithmutationsapplied, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(closecurrentoutputstream, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(copywithmutationsapplied, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = unlockfolder;
        this.IconCompatParcelizer = closecurrentoutputstream;
        this.AudioAttributesCompatParcelizer = intersectsVar;
        this.write = copywithmutationsapplied;
        this.read = getplatform;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.beginSection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super com.marrow.designsystem.theme.AppTheme> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.UnknownNull.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.UnknownNull$IconCompatParcelizer r0 = (o.UnknownNull.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            o.UnknownNull$IconCompatParcelizer r0 = new o.UnknownNull$IconCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L4a
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.unlockFolder r4 = r4.RemoteActionCompatParcelizer
            com.marrow.designsystem.theme.AppThemeManager r5 = com.marrow.designsystem.theme.AppThemeManager.INSTANCE
            com.marrow.designsystem.theme.AppTheme r5 = com.marrow.designsystem.theme.AppThemeManager.AudioAttributesImplApi21Parcelizer()
            java.lang.String r5 = r5.getRead()
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r4.IconCompatParcelizer(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = (java.lang.String) r5
            com.marrow.designsystem.theme.AppTheme r4 = com.marrow.designsystem.theme.AppThemeKt.RemoteActionCompatParcelizer(r5)
            if (r4 != 0) goto L58
            com.marrow.designsystem.theme.AppThemeManager r4 = com.marrow.designsystem.theme.AppThemeManager.INSTANCE
            com.marrow.designsystem.theme.AppTheme r4 = com.marrow.designsystem.theme.AppThemeManager.AudioAttributesImplApi21Parcelizer()
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UnknownNull.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.beginSection
    public final Object write(SampleVideos<? super Boolean> sampleVideos) {
        return this.RemoteActionCompatParcelizer.setSessionImpl(sampleVideos);
    }

    @Override // kotlin.beginSection
    public final Object write(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(z, sampleVideos);
        return objMediaBrowserCompatMediaItem == getYear.IconCompatParcelizer() ? objMediaBrowserCompatMediaItem : getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super UriUtil>, Object> {
        private int IconCompatParcelizer;
        private Object read;

        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[PHI: r1
          0x009f: PHI (r1v6 o.isWritingToCache) = (r1v5 o.isWritingToCache), (r1v14 o.isWritingToCache) binds: [B:25:0x009d, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.IconCompatParcelizer
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L44
                if (r1 == r6) goto L3c
                if (r1 == r5) goto L38
                if (r1 == r4) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r9 = r9.read
                o.isWritingToCache r9 = (kotlin.isWritingToCache) r9
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto Lb5
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L28:
                java.lang.Object r1 = r9.read
                o.isWritingToCache r1 = (kotlin.isWritingToCache) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L9f
            L30:
                java.lang.Object r1 = r9.read
                o.isWritingToCache r1 = (kotlin.isWritingToCache) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L90
            L38:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L74
            L3c:
                java.lang.Object r1 = r9.read
                o.intersects r1 = (kotlin.intersects) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L60
            L44:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.intersects r1 = kotlin.UnknownNull.RemoteActionCompatParcelizer(r10)
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.unlockFolder r10 = kotlin.UnknownNull.read(r10)
                r7 = r9
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r9.read = r1
                r9.IconCompatParcelizer = r6
                java.lang.Object r10 = r10.AudioAttributesImplBaseParcelizer(r7)
                if (r10 == r0) goto Lbb
            L60:
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r7 = r9
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r8 = 0
                r9.read = r8
                r9.IconCompatParcelizer = r5
                java.lang.Object r10 = r1.AudioAttributesCompatParcelizer(r10, r7)
                if (r10 == r0) goto Lbb
            L74:
                r1 = r10
                o.isWritingToCache r1 = (kotlin.isWritingToCache) r1
                boolean r10 = r1.getRead()
                if (r10 == 0) goto Lb6
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.unlockFolder r10 = kotlin.UnknownNull.read(r10)
                r5 = r9
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r9.read = r1
                r9.IconCompatParcelizer = r4
                java.lang.Object r10 = r10.AudioAttributesCompatParcelizer(r6, r5)
                if (r10 == r0) goto Lbb
            L90:
                o.UnknownNull r10 = kotlin.UnknownNull.this
                r4 = r9
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r9.read = r1
                r9.IconCompatParcelizer = r3
                java.lang.Object r10 = kotlin.UnknownNull.RemoteActionCompatParcelizer(r10, r4)
                if (r10 == r0) goto Lbb
            L9f:
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.unlockFolder r10 = kotlin.UnknownNull.read(r10)
                r3 = r9
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r9.read = r1
                r9.IconCompatParcelizer = r2
                r9 = 0
                java.lang.Object r9 = r10.AudioAttributesCompatParcelizer(r9, r3)
                if (r9 != r0) goto Lb4
                goto Lbb
            Lb4:
                r9 = r1
            Lb5:
                r1 = r9
            Lb6:
                o.UriUtil r9 = kotlin.endSection.AudioAttributesCompatParcelizer(r1)
                return r9
            Lbb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UnknownNull.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return UnknownNull.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super UriUtil> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.beginSection
    public final Object IconCompatParcelizer(SampleVideos<? super UriUtil> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new MediaBrowserCompatItemReceiver(null), sampleVideos);
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getUriIndices>, Object> {
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[PHI: r1
          0x008a: PHI (r1v5 o.handleBeforeThrow) = (r1v4 o.handleBeforeThrow), (r1v10 o.handleBeforeThrow) binds: [B:21:0x0088, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[PHI: r1
          0x0099: PHI (r1v6 o.handleBeforeThrow) = (r1v5 o.handleBeforeThrow), (r1v12 o.handleBeforeThrow) binds: [B:23:0x0097, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.RemoteActionCompatParcelizer
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L44
                if (r1 == r6) goto L3c
                if (r1 == r5) goto L38
                if (r1 == r4) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r9 = r9.IconCompatParcelizer
                o.handleBeforeThrow r9 = (kotlin.handleBeforeThrow) r9
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto Laf
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L28:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.handleBeforeThrow r1 = (kotlin.handleBeforeThrow) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L99
            L30:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.handleBeforeThrow r1 = (kotlin.handleBeforeThrow) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L8a
            L38:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L74
            L3c:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.closeCurrentOutputStream r1 = (kotlin.closeCurrentOutputStream) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L60
            L44:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.closeCurrentOutputStream r1 = kotlin.UnknownNull.AudioAttributesCompatParcelizer(r10)
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.unlockFolder r10 = kotlin.UnknownNull.read(r10)
                r7 = r9
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r9.IconCompatParcelizer = r1
                r9.RemoteActionCompatParcelizer = r6
                java.lang.Object r10 = r10.AudioAttributesImplBaseParcelizer(r7)
                if (r10 == r0) goto Lb4
            L60:
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r7 = r9
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r8 = 0
                r9.IconCompatParcelizer = r8
                r9.RemoteActionCompatParcelizer = r5
                java.lang.Object r10 = r1.write(r10, r7)
                if (r10 == r0) goto Lb4
            L74:
                r1 = r10
                o.handleBeforeThrow r1 = (kotlin.handleBeforeThrow) r1
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.unlockFolder r10 = kotlin.UnknownNull.read(r10)
                r5 = r9
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r9.IconCompatParcelizer = r1
                r9.RemoteActionCompatParcelizer = r4
                java.lang.Object r10 = r10.IconCompatParcelizer(r6, r5)
                if (r10 == r0) goto Lb4
            L8a:
                o.UnknownNull r10 = kotlin.UnknownNull.this
                r4 = r9
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r9.IconCompatParcelizer = r1
                r9.RemoteActionCompatParcelizer = r3
                java.lang.Object r10 = kotlin.UnknownNull.write(r10, r4)
                if (r10 == r0) goto Lb4
            L99:
                o.UnknownNull r10 = kotlin.UnknownNull.this
                o.unlockFolder r10 = kotlin.UnknownNull.read(r10)
                r3 = r9
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r9.IconCompatParcelizer = r1
                r9.RemoteActionCompatParcelizer = r2
                r9 = 0
                java.lang.Object r9 = r10.IconCompatParcelizer(r9, r3)
                if (r9 != r0) goto Lae
                goto Lb4
            Lae:
                r9 = r1
            Laf:
                o.getUriIndices r9 = kotlin.endSection.write(r9)
                return r9
            Lb4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UnknownNull.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return UnknownNull.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getUriIndices> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.beginSection
    public final Object MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super getUriIndices> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new MediaBrowserCompatCustomActionResultReceiver(null), sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r4.IconCompatParcelizer(false, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[PHI: r5
      0x007a: PHI (r5v13 java.lang.Object) = (r5v12 java.lang.Object), (r5v1 java.lang.Object) binds: [B:27:0x0078, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.beginSection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.UnknownNull.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.UnknownNull$AudioAttributesCompatParcelizer r0 = (o.UnknownNull.AudioAttributesCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            o.UnknownNull$AudioAttributesCompatParcelizer r0 = new o.UnknownNull$AudioAttributesCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 0
            switch(r2) {
                case 0: goto L45;
                case 1: goto L41;
                case 2: goto L3d;
                case 3: goto L39;
                case 4: goto L35;
                case 5: goto L31;
                case 6: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L97
        L31:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L8b
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L7a
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L6f
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L64
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L53
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.unlockFolder r5 = r4.RemoteActionCompatParcelizer
            r2 = 1
            r0.AudioAttributesCompatParcelizer = r2
            java.lang.Object r5 = r5._init_lambda3(r0)
            if (r5 == r1) goto L9d
        L53:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L6f
            r5 = 2
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r5 = r4.AudioAttributesImplApi21Parcelizer(r0)
            if (r5 == r1) goto L9d
        L64:
            o.unlockFolder r5 = r4.RemoteActionCompatParcelizer
            r2 = 3
            r0.AudioAttributesCompatParcelizer = r2
            java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r3, r0)
            if (r5 == r1) goto L9d
        L6f:
            o.unlockFolder r5 = r4.RemoteActionCompatParcelizer
            r2 = 4
            r0.AudioAttributesCompatParcelizer = r2
            java.lang.Object r5 = r5.ensureViewModelStore(r0)
            if (r5 == r1) goto L9d
        L7a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L9a
            r5 = 5
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r5 = r4.AudioAttributesImplBaseParcelizer(r0)
            if (r5 == r1) goto L9d
        L8b:
            o.unlockFolder r4 = r4.RemoteActionCompatParcelizer
            r5 = 6
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r4 = r4.IconCompatParcelizer(r3, r0)
            if (r4 != r1) goto L97
            goto L9d
        L97:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L9a:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UnknownNull.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r4.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(r4) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                o.UnknownNull r5 = kotlin.UnknownNull.this
                o.closeCurrentOutputStream r5 = kotlin.UnknownNull.AudioAttributesCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.AudioAttributesCompatParcelizer = r3
                java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r1)
                if (r5 == r0) goto L47
            L32:
                o.UnknownNull r5 = kotlin.UnknownNull.this
                o.intersects r5 = kotlin.UnknownNull.RemoteActionCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.AudioAttributesCompatParcelizer = r2
                java.lang.Object r4 = r5.AudioAttributesCompatParcelizer(r1)
                if (r4 != r0) goto L44
                goto L47
            L44:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L47:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UnknownNull.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return UnknownNull.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesImplBaseParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new write(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                intersects intersectsVar = UnknownNull.this.AudioAttributesCompatParcelizer;
                this.read = 1;
                intersectsVar.RemoteActionCompatParcelizer();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return UnknownNull.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesImplApi21Parcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new RemoteActionCompatParcelizer(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.beginSection
    public final Object read(AppTheme appTheme, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(appTheme.getRead(), sampleVideos);
        return objMediaBrowserCompatCustomActionResultReceiver == getYear.IconCompatParcelizer() ? objMediaBrowserCompatCustomActionResultReceiver : getShowPopup.INSTANCE;
    }

    @Override // kotlin.beginSection
    public final Object IconCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(z, sampleVideos);
        return objMediaBrowserCompatItemReceiver == getYear.IconCompatParcelizer() ? objMediaBrowserCompatItemReceiver : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.beginSection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getDrmUuid> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o.UnknownNull.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.UnknownNull$AudioAttributesImplApi26Parcelizer r0 = (o.UnknownNull.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            o.UnknownNull$AudioAttributesImplApi26Parcelizer r0 = new o.UnknownNull$AudioAttributesImplApi26Parcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L63
            if (r2 == r6) goto L5f
            if (r2 == r5) goto L57
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.write
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.read
            java.lang.String r0 = (java.lang.String) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto Lac
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            java.lang.Object r2 = r0.write
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.read
            java.lang.String r4 = (java.lang.String) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            r7 = r4
            r4 = r2
            r2 = r7
            goto L92
        L57:
            java.lang.Object r2 = r0.read
            java.lang.String r2 = (java.lang.String) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L7f
        L5f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L70
        L63:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.unlockFolder r9 = r8.RemoteActionCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r6
            java.lang.Object r9 = r9.onPrepareFromSearch(r0)
            if (r9 == r1) goto Lc3
        L70:
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            o.unlockFolder r9 = r8.RemoteActionCompatParcelizer
            r0.read = r2
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r9 = r9.onPrepare(r0)
            if (r9 == r1) goto Lc3
        L7f:
            java.lang.String r9 = (java.lang.String) r9
            o.unlockFolder r5 = r8.RemoteActionCompatParcelizer
            r0.read = r2
            r0.write = r9
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r4 = r5.AudioAttributesImplApi21Parcelizer(r0)
            if (r4 == r1) goto Lc3
            r7 = r4
            r4 = r9
            r9 = r7
        L92:
            java.lang.String r9 = (java.lang.String) r9
            o.copyWithMutationsApplied r8 = r8.write
            r0.read = r2
            r0.write = r4
            r0.RemoteActionCompatParcelizer = r9
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.String r3 = "-1"
            java.lang.Object r8 = r8.write(r3, r0)
            if (r8 != r1) goto La7
            goto Lc3
        La7:
            r0 = r2
            r1 = r4
            r7 = r9
            r9 = r8
            r8 = r7
        Lac:
            o.isMetadataEqual r9 = (kotlin.isMetadataEqual) r9
            o.setTextAppearanceResource r2 = RemoteActionCompatParcelizer()
            kotlin.toMagicModuleMetaRepoModel.write(r9)
            o.StatsEvent r9 = RemoteActionCompatParcelizer(r1, r8, r0, r9)
            o.zzhr r8 = IconCompatParcelizer(r1, r8)
            o.getDrmUuid r0 = new o.getDrmUuid
            r0.<init>(r2, r8, r9)
            return r0
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UnknownNull.read(o.SampleVideos):java.lang.Object");
    }

    private static zzhr IconCompatParcelizer(String p0, String p1) {
        return new zzhr("12345345", p1, p0, "MQ1234", "Which of the following nerves is not involved in olfaction\n", false, true, "", IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"Trigeminal", "Vagus", "Glossopharyngeal", "Hypoglossal"}), zzhp.RemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{23, 19, 26, 32}), 4, getCachedBytesLength.RemoteActionCompatParcelizer, 2, getRealClientPackageName.read.INSTANCE, 32, true, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("#Clinical"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new isHoleSpan.IconCompatParcelizer("5a2a581c4f2544096a9e2b69", "Page no: 149, 152", "Goodman & Gillman's The Pharmacological Basis Of Therapeutics - 13th Edition", "https://cdn1.dailyrounds.org/uploads/735239100d5d407985f2f0fbb5475f2bx377x499.JPEG")), "", IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), onDisplayInfoChanged.AudioAttributesCompatParcelizer, false, "");
    }

    private static StatsEvent RemoteActionCompatParcelizer(String p0, String p1, String p2, isMetadataEqual p3) {
        return new StatsEvent(readUnsignedByte.read(p3), p1, p2, p0, null, null, 48, null);
    }

    private static setTextAppearanceResource RemoteActionCompatParcelizer() {
        return new setTextAppearanceResource("Which of the following nerves is not involved in olfaction\n", false, "", IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"Trigeminal", "Vagus", "Glossopharyngeal", "Hypoglossal"}), getCachedBytesLength.write, 3, getRealClientPackageName.read.INSTANCE);
    }
}

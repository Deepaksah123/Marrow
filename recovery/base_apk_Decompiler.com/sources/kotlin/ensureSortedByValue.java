package kotlin;

import android.util.LruCache;
import dagger.Lazy;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001d B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0014J\u0018\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0012J>\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00132\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0082@¢\u0006\u0004\b\u0016\u0010\u001bR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lo/ensureSortedByValue;", "Lo/ResolvingDataSource;", "Lo/PriorityDataSource;", "p0", "Ldagger/Lazy;", "Lo/RawResourceDataSource;", "p1", "Lo/getPlatform;", "p2", "<init>", "(Lo/PriorityDataSource;Ldagger/Lazy;Lo/getPlatform;)V", "", "", "p3", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/ensureSortedByValue$write;", "(Ljava/lang/String;Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/LessonCompletedDialog;", "IconCompatParcelizer", "Lkotlin/Function1;", "Lo/SampleVideos;", "", "", "(Ljava/lang/String;Lo/ensureSortedByValue$write;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/PriorityDataSource;", "write", "Ldagger/Lazy;", "Lo/getPlatform;", "read", "()Lo/RawResourceDataSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
@getPlanOldPrice
public final class ensureSortedByValue implements ResolvingDataSource {
    private final PriorityDataSource IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getPlatform AudioAttributesCompatParcelizer;
    private final Lazy<RawResourceDataSource> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LruCache<String, byte[]> AudioAttributesCompatParcelizer = new LruCache<>(20);

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.write |= Integer.MIN_VALUE;
            return ensureSortedByValue.this.AudioAttributesCompatParcelizer(null, null, this);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return ensureSortedByValue.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return ensureSortedByValue.this.RemoteActionCompatParcelizer((String) null, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return ensureSortedByValue.RemoteActionCompatParcelizer(ensureSortedByValue.this, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.read |= Integer.MIN_VALUE;
            return ensureSortedByValue.this.IconCompatParcelizer((String) null, (write) null, (getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object>) null, this);
        }
    }

    @setSdkPayload
    public ensureSortedByValue(PriorityDataSource priorityDataSource, Lazy<RawResourceDataSource> lazy, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(priorityDataSource, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = priorityDataSource;
        this.write = lazy;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    public static final /* synthetic */ Object RemoteActionCompatParcelizer(ensureSortedByValue ensuresortedbyvalue, SampleVideos sampleVideos) {
        return ensuresortedbyvalue.IconCompatParcelizer(null, sampleVideos);
    }

    private final RawResourceDataSource read() {
        RawResourceDataSource rawResourceDataSource = this.write.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rawResourceDataSource, "");
        return rawResourceDataSource;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super byte[]>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ ensureSortedByValue MediaBrowserCompatItemReceiver;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        
            if (r11 != r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
        
            if (r11 == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
        
            if (r11 != r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
        
            if (r11 == r1) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ensureSortedByValue.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ ensureSortedByValue AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ String read;
            private /* synthetic */ TopUserCompanion write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                try {
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        ensureSortedByValue ensuresortedbyvalue = this.AudioAttributesImplBaseParcelizer;
                        String str = this.read;
                        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                        PriorityDataSource priorityDataSource = ensuresortedbyvalue.IconCompatParcelizer;
                        this.IconCompatParcelizer = null;
                        this.RemoteActionCompatParcelizer = 0;
                        this.AudioAttributesCompatParcelizer = 1;
                        if (priorityDataSource.write(str, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    C0177getRfBanners.read(getShowPopup.INSTANCE);
                } catch (Throwable th) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                    C0177getRfBanners.read(SdkPayloadData.write(th));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IconCompatParcelizer(TopUserCompanion topUserCompanion, ensureSortedByValue ensuresortedbyvalue, String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(1, sampleVideos);
                this.write = topUserCompanion;
                this.AudioAttributesImplBaseParcelizer = ensuresortedbyvalue;
                this.read = str;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(this.write, this.AudioAttributesImplBaseParcelizer, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(boolean z, String str, ensureSortedByValue ensuresortedbyvalue, String str2, String str3, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = z;
            this.write = str;
            this.MediaBrowserCompatItemReceiver = ensuresortedbyvalue;
            this.RemoteActionCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = str3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, this.write, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            mediaBrowserCompatItemReceiver.read = obj;
            return mediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super byte[]> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.ResolvingDataSource
    public final Object AudioAttributesCompatParcelizer(String str, String str2, String str3, boolean z, SampleVideos<? super byte[]> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new MediaBrowserCompatItemReceiver(z, str, this, str2, str3, null), sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.ensureSortedByValue.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.ensureSortedByValue$AudioAttributesImplBaseParcelizer r0 = (o.ensureSortedByValue.AudioAttributesImplBaseParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            o.ensureSortedByValue$AudioAttributesImplBaseParcelizer r0 = new o.ensureSortedByValue$AudioAttributesImplBaseParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)     // Catch: java.io.IOException -> L4c
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.PriorityDataSource r4 = r4.IconCompatParcelizer     // Catch: java.io.IOException -> L4c
            r6 = 0
            r0.read = r6     // Catch: java.io.IOException -> L4c
            r0.IconCompatParcelizer = r3     // Catch: java.io.IOException -> L4c
            java.lang.Object r6 = r4.IconCompatParcelizer(r5, r0)     // Catch: java.io.IOException -> L4c
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.io.IOException -> L4c
            boolean r4 = r6.booleanValue()     // Catch: java.io.IOException -> L4c
            goto L4d
        L4c:
            r4 = 0
        L4d:
            java.lang.Boolean r4 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ensureSortedByValue.RemoteActionCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(5:12|32|13|25|26)(2:15|16))(1:17))(3:18|(0)|27)|20|30|21|(1:(3:24|25|26))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r6.write(r7, r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r7, java.lang.String r8, kotlin.SampleVideos<? super o.ensureSortedByValue.write> r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.ensureSortedByValue.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.ensureSortedByValue$AudioAttributesCompatParcelizer r0 = (o.ensureSortedByValue.AudioAttributesCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.write
            int r9 = r9 + r2
            r0.write = r9
            goto L19
        L14:
            o.ensureSortedByValue$AudioAttributesCompatParcelizer r0 = new o.ensureSortedByValue$AudioAttributesCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.read
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.io.IOException -> L80
            goto L80
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5b
        L4c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            r0.AudioAttributesCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r4
            java.lang.Object r9 = r6.IconCompatParcelizer(r8, r0)
            if (r9 == r1) goto L86
        L5b:
            o.LessonCompletedDialog r9 = (kotlin.LessonCompletedDialog) r9
            java.lang.String r8 = r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            o.PriorityDataSource r6 = r6.IconCompatParcelizer     // Catch: java.io.IOException -> L7f
            o.resetCurrentSelectedPosition r9 = new o.resetCurrentSelectedPosition     // Catch: java.io.IOException -> L7f
            r9.<init>()     // Catch: java.io.IOException -> L7f
            o.resetCurrentSelectedPosition r9 = r9.read(r8)     // Catch: java.io.IOException -> L7f
            o.setLockedFromSeek r9 = (kotlin.setLockedFromSeek) r9     // Catch: java.io.IOException -> L7f
            r0.AudioAttributesCompatParcelizer = r5     // Catch: java.io.IOException -> L7f
            r0.RemoteActionCompatParcelizer = r5     // Catch: java.io.IOException -> L7f
            r0.read = r5     // Catch: java.io.IOException -> L7f
            r0.IconCompatParcelizer = r8     // Catch: java.io.IOException -> L7f
            r0.write = r3     // Catch: java.io.IOException -> L7f
            java.lang.Object r6 = r6.write(r7, r9, r0)     // Catch: java.io.IOException -> L7f
            if (r6 != r1) goto L7f
            goto L86
        L7f:
            r6 = r8
        L80:
            o.ensureSortedByValue$write$RemoteActionCompatParcelizer r7 = new o.ensureSortedByValue$write$RemoteActionCompatParcelizer
            r7.<init>(r6)
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ensureSortedByValue.AudioAttributesCompatParcelizer(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super o.ensureSortedByValue.write> r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.ensureSortedByValue.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.ensureSortedByValue$AudioAttributesImplApi21Parcelizer r0 = (o.ensureSortedByValue.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.ensureSortedByValue$AudioAttributesImplApi21Parcelizer r0 = new o.ensureSortedByValue$AudioAttributesImplApi21Parcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.PriorityDataSource r4 = r4.IconCompatParcelizer
            r6 = 0
            r0.AudioAttributesCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r6 = r4.AudioAttributesCompatParcelizer(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = (java.lang.String) r6
            o.ensureSortedByValue$write$read r4 = new o.ensureSortedByValue$write$read
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ensureSortedByValue.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object IconCompatParcelizer(java.lang.String r7, kotlin.SampleVideos<? super kotlin.LessonCompletedDialog> r8) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.ensureSortedByValue.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.ensureSortedByValue$IconCompatParcelizer r0 = (o.ensureSortedByValue.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            o.ensureSortedByValue$IconCompatParcelizer r0 = new o.ensureSortedByValue$IconCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.RawResourceDataSource r6 = r6.read()
            r8 = 0
            r0.write = r8
            r0.read = r3
            java.lang.Object r8 = r6.RemoteActionCompatParcelizer(r7, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            o.getTopicStat r8 = (kotlin.getTopicStat) r8
            boolean r6 = r8.read()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r8.AudioAttributesCompatParcelizer()
            o.ActivityAdapterModule r6 = (kotlin.ActivityAdapterModule) r6
            if (r6 == 0) goto L5e
            o.LessonCompletedDialog r6 = r6.AudioAttributesCompatParcelizer()
            if (r6 == 0) goto L5e
            return r6
        L5e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "No Image Found"
            r6.<init>(r7)
            throw r6
        L66:
            int r1 = r8.RemoteActionCompatParcelizer()
            com.marrow.data.models.ResponseError r6 = new com.marrow.data.models.ResponseError
            java.lang.String r2 = "Failed to download image"
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.marrow.data.utils.product.exceptions.ResponseErrorException r7 = new com.marrow.data.utils.product.exceptions.ResponseErrorException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ensureSortedByValue.IconCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r4, o.ensureSortedByValue.write r5, kotlin.getAnswerMap<? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r6, kotlin.SampleVideos<? super byte[]> r7) throws java.io.IOException {
        /*
            r3 = this;
            boolean r0 = r7 instanceof o.ensureSortedByValue.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.ensureSortedByValue$RemoteActionCompatParcelizer r0 = (o.ensureSortedByValue.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r3 = r0.read
            int r3 = r3 + r2
            r0.read = r3
            goto L19
        L14:
            o.ensureSortedByValue$RemoteActionCompatParcelizer r0 = new o.ensureSortedByValue$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r3 = r0.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r7 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r0.read
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L2e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2e:
            java.lang.Object r4 = r0.write
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            java.lang.Object r4 = r0.IconCompatParcelizer
            r5 = r4
            o.ensureSortedByValue$write r5 = (o.ensureSortedByValue.write) r5
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r3)
            goto L5e
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r3)
            java.lang.String r3 = r5.getIconCompatParcelizer()     // Catch: java.lang.Exception -> L4c
            byte[] r3 = kotlin.filterRedundantIncompleteSchemeDatas.write(r4, r3)     // Catch: java.lang.Exception -> L4c
            kotlin.toMagicModuleMetaRepoModel.write(r3)     // Catch: java.lang.Exception -> L4c
            return r3
        L4c:
            r3 = 0
            r0.AudioAttributesCompatParcelizer = r3
            r0.IconCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r3
            r0.write = r3
            r0.read = r2
            java.lang.Object r3 = r6.invoke(r0)
            if (r3 != r7) goto L5e
            return r7
        L5e:
            java.lang.String r3 = r5.getRead()
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Corrupted Image from "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ensureSortedByValue.IconCompatParcelizer(java.lang.String, o.ensureSortedByValue$write, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0002\r\u0007B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\u000e\u000f"}, d2 = {"Lo/ensureSortedByValue$write;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Lo/ensureSortedByValue$write$read;", "Lo/ensureSortedByValue$write$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static abstract class write {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        public static final class read extends write {
            private final String AudioAttributesCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(String str) {
                super(str, "Local", null);
                toMagicModuleMetaRepoModel.write(str, "");
                this.AudioAttributesCompatParcelizer = str;
            }

            @Override // o.ensureSortedByValue.write
            /* JADX INFO: renamed from: write */
            public final String getIconCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) ((read) obj).AudioAttributesCompatParcelizer);
            }

            public final int hashCode() {
                return this.AudioAttributesCompatParcelizer.hashCode();
            }

            public final String toString() {
                String str = this.AudioAttributesCompatParcelizer;
                StringBuilder sb = new StringBuilder("Local(encryptedImage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }
        }

        private write(String str, String str2) {
            this.IconCompatParcelizer = str;
            this.read = str2;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public /* synthetic */ write(String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, str2);
        }

        public static final class RemoteActionCompatParcelizer extends write {
            private final String write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(String str) {
                super(str, "Remote", null);
                toMagicModuleMetaRepoModel.write(str, "");
                this.write = str;
            }

            @Override // o.ensureSortedByValue.write
            /* JADX INFO: renamed from: write */
            public final String getIconCompatParcelizer() {
                return this.write;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ((RemoteActionCompatParcelizer) obj).write);
            }

            public final int hashCode() {
                return this.write.hashCode();
            }

            public final String toString() {
                String str = this.write;
                StringBuilder sb = new StringBuilder("Remote(encryptedImage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: o.ensureSortedByValue$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/ensureSortedByValue$read;", "", "<init>", "()V", "", "IconCompatParcelizer", "Landroid/util/LruCache;", "", "", "AudioAttributesCompatParcelizer", "Landroid/util/LruCache;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void IconCompatParcelizer() {
            ensureSortedByValue.AudioAttributesCompatParcelizer.evictAll();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer() {
        Companion.IconCompatParcelizer();
    }
}

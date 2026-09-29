package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemClock implements SurfaceInfo {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final unlockFolder IconCompatParcelizer;
    private final intersects RemoteActionCompatParcelizer;
    private final putBinder read;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return SystemClock.this.IconCompatParcelizer(null, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return SystemClock.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int read;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return SystemClock.this.MediaBrowserCompatItemReceiver(null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return SystemClock.this.IconCompatParcelizer(null, null, this);
        }
    }

    static final class read extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return SystemClock.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return SystemClock.this.IconCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public SystemClock(putBinder putbinder, intersects intersectsVar, unlockFolder unlockfolder, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(putbinder, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = putbinder;
        this.RemoteActionCompatParcelizer = intersectsVar;
        this.IconCompatParcelizer = unlockfolder;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SurfaceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.doubleCapacityIfFull> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.SystemClock.write
            if (r0 == 0) goto L14
            r0 = r7
            o.SystemClock$write r0 = (o.SystemClock.write) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.SystemClock$write r0 = new o.SystemClock$write
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L5e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L48
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.putBinder r7 = r6.read
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r0)
            if (r7 == r1) goto L6a
        L48:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            o.unlockFolder r6 = r6.IconCompatParcelizer
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r6.getSavedStateRegistryControllerannotations(r0)
            if (r6 != r1) goto L5b
            goto L6a
        L5b:
            r5 = r7
            r7 = r6
            r6 = r5
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            o.doubleCapacityIfFull r0 = new o.doubleCapacityIfFull
            r0.<init>(r6, r7)
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SystemClock.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.SurfaceInfo
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super List<ensureClassLoader>> sampleVideos) {
        return this.read.AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends String>>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object objMediaBrowserCompatItemReceiver = SystemClock.this.read.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, this);
            return objMediaBrowserCompatItemReceiver == objIconCompatParcelizer ? objIconCompatParcelizer : objMediaBrowserCompatItemReceiver;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return SystemClock.this.new AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<String>> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.SurfaceInfo
    public final Object read(String str, SampleVideos<? super List<String>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesImplApi26Parcelizer(str, null), sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[LOOP:0: B:23:0x008e->B:25:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SurfaceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super java.util.List<kotlin.recycleMessage>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.SystemClock.read
            if (r0 == 0) goto L14
            r0 = r8
            o.SystemClock$read r0 = (o.SystemClock.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.SystemClock$read r0 = new o.SystemClock$read
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.read
            java.util.List r0 = (java.util.List) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L7b
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L50
        L43:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.putBinder r8 = r7.read
            r0.write = r4
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r0)
            if (r8 == r1) goto Lb7
        L50:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            o.recycleMessage r4 = new o.recycleMessage
            r5 = 0
            java.lang.String r6 = "All"
            r4.<init>(r5, r6, r8)
            r2.add(r4)
            o.putBinder r7 = r7.read
            r0.read = r2
            r0.IconCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r8
            r0.write = r3
            java.lang.Object r8 = r7.RemoteActionCompatParcelizer(r0)
            if (r8 != r1) goto L79
            goto Lb7
        L79:
            r7 = r2
            r0 = r7
        L7b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r8, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r8 = r8.iterator()
        L8e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r8.next()
            o.fromBundleSparseArray r2 = (kotlin.fromBundleSparseArray) r2
            o.recycleMessage r3 = new o.recycleMessage
            java.lang.String r4 = r2.RemoteActionCompatParcelizer()
            java.lang.String r5 = r2.AudioAttributesCompatParcelizer()
            int r2 = r2.write()
            r3.<init>(r4, r5, r2)
            r1.add(r3)
            goto L8e
        Laf:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            r7.addAll(r1)
            return r0
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SystemClock.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[LOOP:0: B:33:0x00c4->B:35:0x00ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SurfaceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r8, kotlin.SampleVideos<? super java.util.List<kotlin.recycleMessage>> r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SystemClock.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.SurfaceInfo
    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = this.read.write(sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SurfaceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r5, java.lang.String r6, kotlin.SampleVideos<? super java.util.List<kotlin.SystemHandlerWrapper1>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.SystemClock.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.SystemClock$RemoteActionCompatParcelizer r0 = (o.SystemClock.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            o.SystemClock$RemoteActionCompatParcelizer r0 = new o.SystemClock$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
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
            o.putBinder r4 = r4.read
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r7
            r0.write = r3
            java.lang.Object r7 = r4.RemoteActionCompatParcelizer(r5, r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r7, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r7.iterator()
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r5.next()
            o.endWrite r6 = (kotlin.endWrite) r6
            o.SystemHandlerWrapper1 r6 = kotlin.SystemHandlerWrapperSystemMessage.RemoteActionCompatParcelizer(r6)
            r4.add(r6)
            goto L5c
        L70:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SystemClock.IconCompatParcelizer(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SurfaceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super kotlin.SystemHandlerWrapper> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.SystemClock.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.SystemClock$AudioAttributesCompatParcelizer r0 = (o.SystemClock.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            o.SystemClock$AudioAttributesCompatParcelizer r0 = new o.SystemClock$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
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
            o.putBinder r4 = r4.read
            r6 = 0
            r0.read = r6
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r4.read(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            o.BundleableUtil r6 = (kotlin.BundleableUtil) r6
            o.SystemHandlerWrapper r4 = kotlin.StandaloneMediaClock.write(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SystemClock.IconCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.SurfaceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatItemReceiver(java.lang.String r5, kotlin.SampleVideos<? super kotlin.setMessage> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.SystemClock.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r6
            o.SystemClock$MediaBrowserCompatCustomActionResultReceiver r0 = (o.SystemClock.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            o.SystemClock$MediaBrowserCompatCustomActionResultReceiver r0 = new o.SystemClock$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.putBinder r4 = r4.read
            r6 = 0
            r0.IconCompatParcelizer = r6
            r0.read = r3
            java.lang.Object r6 = r4.AudioAttributesImplApi21Parcelizer(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            o.loadBitmapFromMetadata r6 = (kotlin.loadBitmapFromMetadata) r6
            o.setMessage r4 = kotlin.clearBufferOnTimeDiscontinuity.IconCompatParcelizer(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SystemClock.MediaBrowserCompatItemReceiver(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends obtainSystemMessage>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatMediaItem;
        private Object MediaBrowserCompatSearchResultReceiver;
        private Object MediaDescriptionCompat;
        private int RatingCompat;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        
            if (r2 == r1) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0159  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b1 -> B:20:0x00b6). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SystemClock.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return SystemClock.this.new AudioAttributesImplBaseParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<obtainSystemMessage>> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.SurfaceInfo
    public final Object write(String str, SampleVideos<? super List<obtainSystemMessage>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesImplBaseParcelizer(str, null), sampleVideos);
    }

    @Override // kotlin.SurfaceInfo
    public final Object write(String str, getMediaMimeType getmediamimetype, SampleVideos<? super List<String>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, getmediamimetype, sampleVideos);
    }

    @Override // kotlin.SurfaceInfo
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(str, sampleVideos);
    }
}

package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class BitmapLoader implements startWrite {
    private final getBinder write;

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        long RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return BitmapLoader.this.IconCompatParcelizer(null, 0L, this);
        }
    }

    static final class read extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return BitmapLoader.this.RemoteActionCompatParcelizer(null, this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        long IconCompatParcelizer;
        int read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return BitmapLoader.this.write(0L, null, this);
        }
    }

    @setSdkPayload
    public BitmapLoader(getBinder getbinder) {
        toMagicModuleMetaRepoModel.write(getbinder, "");
        this.write = getbinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.startWrite
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(long r5, java.lang.String r7, kotlin.SampleVideos<? super com.marrow.data.api.models.response.Data<java.util.List<com.marrow2.data.schema.remote.model.SchemaUserStatusRSModel>>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.BitmapLoader.write
            if (r0 == 0) goto L14
            r0 = r8
            o.BitmapLoader$write r0 = (o.BitmapLoader.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            o.BitmapLoader$write r0 = new o.BitmapLoader$write
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r4 = r0.IconCompatParcelizer
            java.lang.Object r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getBinder r4 = r4.write
            r8 = 0
            r0.write = r8
            r0.IconCompatParcelizer = r5
            r0.read = r3
            java.lang.Object r8 = r4.IconCompatParcelizer(r5, r7, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            com.marrow2.core.network.model.NetworkApiResponse r8 = (com.marrow2.core.network.model.NetworkApiResponse) r8
            com.marrow.data.api.models.response.Data r4 = kotlin.createDataSink.write(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BitmapLoader.write(long, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.startWrite
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super com.marrow2.data.schema.remote.model.SchemaCompletionStatusRSModel> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.BitmapLoader.read
            if (r0 == 0) goto L14
            r0 = r6
            o.BitmapLoader$read r0 = (o.BitmapLoader.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.BitmapLoader$read r0 = new o.BitmapLoader$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
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
            o.getBinder r4 = r4.write
            r6 = 0
            r0.IconCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r6 = r4.AudioAttributesCompatParcelizer(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.marrow2.core.network.model.NetworkApiResponse r6 = (com.marrow2.core.network.model.NetworkApiResponse) r6
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BitmapLoader.RemoteActionCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.startWrite
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r5, long r6, kotlin.SampleVideos<? super com.marrow2.data.schema.remote.model.SchemaDetailRSModel> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.BitmapLoader.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.BitmapLoader$IconCompatParcelizer r0 = (o.BitmapLoader.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.BitmapLoader$IconCompatParcelizer r0 = new o.BitmapLoader$IconCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r4 = r0.RemoteActionCompatParcelizer
            java.lang.Object r4 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getBinder r4 = r4.write
            r8 = 0
            r0.write = r8
            r0.RemoteActionCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r8 = r4.AudioAttributesCompatParcelizer(r5, r6, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            com.marrow2.core.network.model.NetworkApiResponse r8 = (com.marrow2.core.network.model.NetworkApiResponse) r8
            java.lang.Object r4 = kotlin.createDataSink.RemoteActionCompatParcelizer(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BitmapLoader.IconCompatParcelizer(java.lang.String, long, o.SampleVideos):java.lang.Object");
    }
}

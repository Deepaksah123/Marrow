package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class removeSpanInternal implements notifySpanRemoved {
    private final SimpleCache1 IconCompatParcelizer;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        long write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return removeSpanInternal.this.AudioAttributesCompatParcelizer((String) null, 0L, this);
        }
    }

    static final class read extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return removeSpanInternal.this.IconCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public removeSpanInternal(SimpleCache1 simpleCache1) {
        toMagicModuleMetaRepoModel.write(simpleCache1, "");
        this.IconCompatParcelizer = simpleCache1;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object write(String str, String str2, SampleVideos<? super String> sampleVideos) {
        return this.IconCompatParcelizer.read(str, str2, sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object IconCompatParcelizer(String str, int i, SampleVideos<? super Integer> sampleVideos) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, i, sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r6.AudioAttributesCompatParcelizer("course_config_data_version", 0, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.notifySpanRemoved
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.removeSpanInternal.read
            if (r0 == 0) goto L14
            r0 = r7
            o.removeSpanInternal$read r0 = (o.removeSpanInternal.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            o.removeSpanInternal$read r0 = new o.removeSpanInternal$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L5e
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L50
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.SimpleCache1 r7 = r6.IconCompatParcelizer
            r0.write = r5
            java.lang.String r2 = "course_config_data"
            r5 = 0
            java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r2, r5, r0)
            if (r7 == r1) goto L6f
        L50:
            o.SimpleCache1 r7 = r6.IconCompatParcelizer
            r0.write = r4
            java.lang.String r2 = "last_course_config_sync"
            r4 = 0
            java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r2, r4, r0)
            if (r7 == r1) goto L6f
        L5e:
            o.SimpleCache1 r6 = r6.IconCompatParcelizer
            r0.write = r3
            java.lang.String r7 = "course_config_data_version"
            r2 = 0
            java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r7, r2, r0)
            if (r6 != r1) goto L6c
            goto L6f
        L6c:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.removeSpanInternal.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.notifySpanRemoved
    public final Object read(String str, String str2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, str2, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object IconCompatParcelizer(String str, SampleVideos<? super Long> sampleVideos) {
        return this.IconCompatParcelizer.write(str, 0L, sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object write(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, j, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object write(String str, boolean z, SampleVideos<? super Boolean> sampleVideos) {
        return this.IconCompatParcelizer.write(str, z, sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object read(String str, boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, z, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object IconCompatParcelizer(String str, String str2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(str, str2, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object RemoteActionCompatParcelizer(String str, int i, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, i, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super String> sampleVideos) {
        return write("image_token", "", sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Long> sampleVideos) {
        return IconCompatParcelizer("image_token_expiry_timestamp", sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (write("image_token_expiry_timestamp", r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.notifySpanRemoved
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r7, long r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof o.removeSpanInternal.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            o.removeSpanInternal$IconCompatParcelizer r0 = (o.removeSpanInternal.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.read
            int r10 = r10 + r2
            r0.read = r10
            goto L19
        L14:
            o.removeSpanInternal$IconCompatParcelizer r0 = new o.removeSpanInternal$IconCompatParcelizer
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            long r6 = r0.write
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L62
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            long r8 = r0.write
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L53
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r8
            r0.read = r4
            java.lang.String r10 = "image_token"
            java.lang.Object r7 = r6.read(r10, r7, r0)
            if (r7 == r1) goto L65
        L53:
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r8
            r0.read = r3
            java.lang.String r7 = "image_token_expiry_timestamp"
            java.lang.Object r6 = r6.write(r7, r8, r0)
            if (r6 != r1) goto L62
            goto L65
        L62:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.removeSpanInternal.AudioAttributesCompatParcelizer(java.lang.String, long, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.notifySpanRemoved
    public final Object read(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = read("practical_corner_introduction_interacted", z, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object AudioAttributesImplApi21Parcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return write("practical_corner_introduction_interacted", false, sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object write(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = read("wor_mcq_discussion_ack", z, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object AudioAttributesImplBaseParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return write("wor_mcq_discussion_ack", false, sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object read(SampleVideos<? super String> sampleVideos) {
        return write("dismissed_lesson_id_for_video_suggestions", "", sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object write(String str, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = read("dismissed_lesson_id_for_video_suggestions", str, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object AudioAttributesCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = read("cadaveric_video_popup_acknowledged", z, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object write(SampleVideos<? super Boolean> sampleVideos) {
        return write("cadaveric_video_popup_acknowledged", false, sampleVideos);
    }

    @Override // kotlin.notifySpanRemoved
    public final Object AudioAttributesCompatParcelizer(String str, boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = read("edition_update_popup_ack_".concat(String.valueOf(str)), z, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.notifySpanRemoved
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super Boolean> sampleVideos) {
        return write("edition_update_popup_ack_".concat(String.valueOf(str)), false, sampleVideos);
    }
}

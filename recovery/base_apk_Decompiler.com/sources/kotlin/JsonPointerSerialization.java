package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0012R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019"}, d2 = {"Lo/JsonPointerSerialization;", "Lo/compile;", "", "p0", "p1", "Lo/setFirstHorizontalStyle;", "p2", "<init>", "(ZZLo/setFirstHorizontalStyle;)V", "Lo/Flow;", "", "write", "(Lo/Flow;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "Z", "IconCompatParcelizer", "()Z", "Lo/setFirstHorizontalStyle;", "Lo/setCollapseIcon;", "Lo/setCollapseIcon;", "read", "()Lo/setCollapseIcon;", "Lo/setStateRank;", "Lo/setStateRank;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class JsonPointerSerialization implements compile {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private setStateRank<? super getShowPopup> read;
    private final setFirstHorizontalStyle IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setCollapseIcon<Boolean> AudioAttributesCompatParcelizer;
    private final boolean write;

    public JsonPointerSerialization(boolean z, boolean z2, setFirstHorizontalStyle setfirsthorizontalstyle) {
        this.write = z2;
        this.IconCompatParcelizer = setfirsthorizontalstyle;
        this.AudioAttributesCompatParcelizer = new setCollapseIcon<>(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    @Override // kotlin.compile
    public final setCollapseIcon<Boolean> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.compile
    public final boolean write() {
        return read().read().booleanValue() || read().AudioAttributesCompatParcelizer().booleanValue();
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                JsonPointerSerialization jsonPointerSerialization = JsonPointerSerialization.this;
                this.AudioAttributesCompatParcelizer = jsonPointerSerialization;
                this.RemoteActionCompatParcelizer = 1;
                read readVar = this;
                setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(readVar), 1);
                setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
                jsonPointerSerialization.read().read(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                jsonPointerSerialization.read = setstatesolvedcount;
                Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
                if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                    getAnsweredMcqCount.write(readVar);
                }
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return JsonPointerSerialization.this.new read(sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.compile
    public final Object write(Flow flow, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(flow, new write(new read(null), flow, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        final /* synthetic */ Flow RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            if (kotlin.NestfputmCountryCode.write(1500, new o.JsonPointerSerialization.write.AnonymousClass2(r4.IconCompatParcelizer, null), r4) == r0) goto L19;
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
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L57
                goto L49
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                o.JsonPointerSerialization r5 = kotlin.JsonPointerSerialization.this     // Catch: java.lang.Throwable -> L57
                boolean r5 = r5.getWrite()     // Catch: java.lang.Throwable -> L57
                if (r5 == 0) goto L31
                o.getAnswerMap<o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r5 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L57
                r4.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L57
                java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L57
                if (r5 != r0) goto L49
                goto L48
            L31:
                o.JsonPointerSerialization$write$2 r5 = new o.JsonPointerSerialization$write$2     // Catch: java.lang.Throwable -> L57
                o.getAnswerMap<o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r1 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L57
                r3 = 0
                r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L57
                o.MagicModuleSubmissionRequestBody r5 = (kotlin.MagicModuleSubmissionRequestBody) r5     // Catch: java.lang.Throwable -> L57
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1     // Catch: java.lang.Throwable -> L57
                r4.AudioAttributesCompatParcelizer = r2     // Catch: java.lang.Throwable -> L57
                r2 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r5 = kotlin.NestfputmCountryCode.write(r2, r5, r1)     // Catch: java.lang.Throwable -> L57
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                o.Flow r5 = r4.RemoteActionCompatParcelizer
                o.Flow r0 = kotlin.Flow.IconCompatParcelizer
                if (r5 == r0) goto L54
                o.JsonPointerSerialization r4 = kotlin.JsonPointerSerialization.this
                r4.RemoteActionCompatParcelizer()
            L54:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L57:
                r5 = move-exception
                o.Flow r0 = r4.RemoteActionCompatParcelizer
                o.Flow r1 = kotlin.Flow.IconCompatParcelizer
                if (r0 == r1) goto L63
                o.JsonPointerSerialization r4 = kotlin.JsonPointerSerialization.this
                r4.RemoteActionCompatParcelizer()
            L63:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.JsonPointerSerialization.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.JsonPointerSerialization$write$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getAnswerMap<SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
            int RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getAnswerMap<SampleVideos<? super getShowPopup>, Object> getanswermap = this.AudioAttributesCompatParcelizer;
                    this.RemoteActionCompatParcelizer = 1;
                    if (getanswermap.invoke(this) == objIconCompatParcelizer) {
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
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = getanswermap;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap, Flow flow, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = getanswermap;
            this.RemoteActionCompatParcelizer = flow;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return JsonPointerSerialization.this.new write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.compile
    public final void RemoteActionCompatParcelizer() {
        setStateRank<? super getShowPopup> setstaterank;
        read().read(Boolean.FALSE);
        if (!getWrite() || (setstaterank = this.read) == null) {
            return;
        }
        setstaterank.write((Throwable) null);
    }

    @Override // kotlin.compile
    public final void AudioAttributesCompatParcelizer() {
        setStateRank<? super getShowPopup> setstaterank = this.read;
        if (setstaterank != null) {
            setstaterank.write((Throwable) null);
        }
    }
}

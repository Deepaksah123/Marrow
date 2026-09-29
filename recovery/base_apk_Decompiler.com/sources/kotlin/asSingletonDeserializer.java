package kotlin;

import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class asSingletonDeserializer<T> implements KotlinObjectSingletonDeserializerKt<T> {
    private final UserConfigSerializer<T> AudioAttributesCompatParcelizer;
    private final /* synthetic */ TopUserCompanion write;

    static final class read extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        final /* synthetic */ asSingletonDeserializer<T> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(asSingletonDeserializer<T> assingletondeserializer, SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
            this.write = assingletondeserializer;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.read(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public asSingletonDeserializer(TopUserCompanion topUserCompanion, UserConfigSerializer<? super T> userConfigSerializer) {
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(userConfigSerializer, "");
        this.AudioAttributesCompatParcelizer = userConfigSerializer;
        this.write = topUserCompanion;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.KotlinObjectSingletonDeserializerKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.asSingletonDeserializer.read
            if (r0 == 0) goto L14
            r0 = r6
            o.asSingletonDeserializer$read r0 = (o.asSingletonDeserializer.read) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            o.asSingletonDeserializer$read r0 = new o.asSingletonDeserializer$read
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.read
            o.setPassingYear r4 = (kotlin.setPassingYear) r4
            java.lang.Object r4 = r0.IconCompatParcelizer
            r5 = r4
            o.getCreatedOnDateMs r5 = (kotlin.getCreatedOnDateMs) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)     // Catch: java.lang.Throwable -> L8f
            goto L7d
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.CurrentQuery r4 = r4.getIconCompatParcelizer()     // Catch: java.lang.Throwable -> L8f
            o.setPassingYear$write r6 = kotlin.setPassingYear.b_     // Catch: java.lang.Throwable -> L8f
            o.CurrentQuery$IconCompatParcelizer r6 = (o.CurrentQuery.IconCompatParcelizer) r6     // Catch: java.lang.Throwable -> L8f
            o.CurrentQuery$write r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L83
            o.setPassingYear r4 = (kotlin.setPassingYear) r4     // Catch: java.lang.Throwable -> L8f
            r0.IconCompatParcelizer = r5     // Catch: java.lang.Throwable -> L8f
            r0.read = r4     // Catch: java.lang.Throwable -> L8f
            r0.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> L8f
            o.setStateSolvedCount r6 = new o.setStateSolvedCount     // Catch: java.lang.Throwable -> L8f
            o.SampleVideos r2 = kotlin.getYear.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L8f
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L8f
            r6.MediaBrowserCompatCustomActionResultReceiver()     // Catch: java.lang.Throwable -> L8f
            r2 = r6
            o.setStateRank r2 = (kotlin.setStateRank) r2     // Catch: java.lang.Throwable -> L8f
            o.asSingletonDeserializer$2 r3 = new o.asSingletonDeserializer$2     // Catch: java.lang.Throwable -> L8f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            o.getAnswerMap r3 = (kotlin.getAnswerMap) r3     // Catch: java.lang.Throwable -> L8f
            r4.RemoteActionCompatParcelizer(r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r4 = r6.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r6 = kotlin.getYear.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L8f
            if (r4 != r6) goto L7a
            kotlin.getAnsweredMcqCount.write(r0)     // Catch: java.lang.Throwable -> L8f
        L7a:
            if (r4 != r1) goto L7d
            return r1
        L7d:
            r5.invoke()
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L83:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = "Internal error, context should have a job."
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8f
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L8f
            throw r4     // Catch: java.lang.Throwable -> L8f
        L8f:
            r4 = move-exception
            r5.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.asSingletonDeserializer.read(o.getCreatedOnDateMs, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.asSingletonDeserializer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ setStateRank<getShowPopup> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            AudioAttributesCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(Throwable th) {
            setStateRank<getShowPopup> setstaterank = this.$read;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterank.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(setStateRank<? super getShowPopup> setstaterank) {
            super(1);
            this.$read = setstaterank;
        }
    }

    @Override // kotlin.UserConfigSerializer
    public final boolean write(Throwable th) {
        return this.AudioAttributesCompatParcelizer.write(th);
    }

    @Override // kotlin.TopUserCompanion
    /* JADX INFO: renamed from: bj_ */
    public final CurrentQuery getIconCompatParcelizer() {
        return this.write.getIconCompatParcelizer();
    }

    @Override // kotlin.UserConfigSerializer
    public final void write(getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer.write(getanswermap);
    }

    @Override // kotlin.UserConfigSerializer
    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.UserConfigSerializer
    public final Object RemoteActionCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(t, sampleVideos);
    }

    @Override // kotlin.UserConfigSerializer
    public final Object read(T t) {
        return this.AudioAttributesCompatParcelizer.read(t);
    }
}

package kotlin;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.EnumDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Mp4ExtractorExternalSyntheticLambda0<T> write(final CurrentQuery currentQuery, final getCollegeName getcollegename, final MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(getcollegename, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer = EnumDeserializer.AudioAttributesCompatParcelizer(new EnumDeserializer.write() { // from class: o.ha
            @Override // o.EnumDeserializer.write
            public final Object AudioAttributesCompatParcelizer(EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return i.IconCompatParcelizer(currentQuery, getcollegename, magicModuleSubmissionRequestBody, remoteActionCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer, "");
        return mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(CurrentQuery currentQuery, getCollegeName getcollegename, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        final setPassingYear setpassingyear = (setPassingYear) currentQuery.get(setPassingYear.b_);
        remoteActionCompatParcelizer.write(new Runnable() { // from class: o.k
            @Override // java.lang.Runnable
            public final void run() {
                i.IconCompatParcelizer(setpassingyear);
            }
        }, g.write);
        return C0201setMcqCount.IconCompatParcelizer(College.AudioAttributesCompatParcelizer(currentQuery), null, getcollegename, new IconCompatParcelizer(magicModuleSubmissionRequestBody, remoteActionCompatParcelizer, null), 1);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ EnumDeserializer.RemoteActionCompatParcelizer<T> AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super T>, Object> RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ Object write;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o.i$IconCompatParcelizer for r3v5 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.getMonthName
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r3.read
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.SdkPayloadData.IconCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L36
                goto L29
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r4)
                java.lang.Object r4 = r3.write
                o.TopUserCompanion r4 = (kotlin.TopUserCompanion) r4
                o.MagicModuleSubmissionRequestBody<o.TopUserCompanion, o.SampleVideos<? super T>, java.lang.Object> r1 = r3.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L36
                r3.read = r2     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L36
                java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L36
                if (r4 != r0) goto L29
                return r0
            L29:
                o.EnumDeserializer$RemoteActionCompatParcelizer<T> r0 = r3.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L36
                r0.AudioAttributesCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L36
                goto L3b
            L2f:
                r4 = move-exception
                o.EnumDeserializer$RemoteActionCompatParcelizer<T> r3 = r3.AudioAttributesCompatParcelizer
                r3.IconCompatParcelizer(r4)
                goto L3b
            L36:
                o.EnumDeserializer$RemoteActionCompatParcelizer<T> r3 = r3.AudioAttributesCompatParcelizer
                r3.IconCompatParcelizer()
            L3b:
                o.getShowPopup r3 = kotlin.getShowPopup.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.i.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, EnumDeserializer.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            iconCompatParcelizer.write = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setPassingYear setpassingyear) {
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
    }

    public static final <V> Mp4ExtractorExternalSyntheticLambda0<V> IconCompatParcelizer(final Executor executor, final String str, final getCreatedOnDateMs<? extends V> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(executor, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        Mp4ExtractorExternalSyntheticLambda0<V> mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer = EnumDeserializer.AudioAttributesCompatParcelizer(new EnumDeserializer.write() { // from class: o.h
            @Override // o.EnumDeserializer.write
            public final Object AudioAttributesCompatParcelizer(EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return i.AudioAttributesCompatParcelizer(executor, str, getcreatedondatems, remoteActionCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer, "");
        return mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(Executor executor, String str, final getCreatedOnDateMs getcreatedondatems, final EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        remoteActionCompatParcelizer.write(new Runnable() { // from class: o.gd
            @Override // java.lang.Runnable
            public final void run() {
                i.read(atomicBoolean);
            }
        }, g.write);
        executor.execute(new Runnable() { // from class: o.l
            @Override // java.lang.Runnable
            public final void run() {
                i.AudioAttributesCompatParcelizer(atomicBoolean, remoteActionCompatParcelizer, getcreatedondatems);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(AtomicBoolean atomicBoolean, EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getCreatedOnDateMs getcreatedondatems) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getcreatedondatems.invoke());
        } catch (Throwable th) {
            remoteActionCompatParcelizer.IconCompatParcelizer(th);
        }
    }
}

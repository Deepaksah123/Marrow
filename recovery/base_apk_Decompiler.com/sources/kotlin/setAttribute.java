package kotlin;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b"}, d2 = {"Lo/setAttribute;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "IconCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setAttribute {
    public static final setAttribute INSTANCE = new setAttribute();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final AtomicBoolean AudioAttributesCompatParcelizer = new AtomicBoolean(false);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    public static final int read = 8;

    private setAttribute() {
    }

    public final void AudioAttributesCompatParcelizer() {
        if (AudioAttributesCompatParcelizer.compareAndSet(false, true)) {
            fromCursor fromcursor = getLastName.read(1, null, 6);
            C0201setMcqCount.IconCompatParcelizer(College.AudioAttributesCompatParcelizer(getDefaultPrettyPrinter.INSTANCE.IconCompatParcelizer()), null, null, new write(fromcursor, null), 3);
            parseDigitsRecursive.INSTANCE.read(new AnonymousClass2(fromcursor));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        final /* synthetic */ fromCursor<getShowPopup> write;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x0013, B:15:0x0039, B:17:0x0041, B:12:0x002c, B:18:0x0055, B:11:0x0027), top: B:28:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x0013, B:15:0x0039, B:17:0x0041, B:12:0x002c, B:18:0x0055, B:11:0x0027), top: B:28:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0036 -> B:15:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.RemoteActionCompatParcelizer
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.read
                o.getFirstName r1 = (kotlin.getFirstName) r1
                java.lang.Object r3 = r5.AudioAttributesCompatParcelizer
                o.setLastName r3 = (kotlin.setLastName) r3
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)     // Catch: java.lang.Throwable -> L5e
                goto L39
            L17:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                o.fromCursor<o.getShowPopup> r6 = r5.write
                r3 = r6
                o.setLastName r3 = (kotlin.setLastName) r3
                o.getFirstName r6 = r3.AudioAttributesImplApi21Parcelizer()     // Catch: java.lang.Throwable -> L5e
                r1 = r6
            L2c:
                r5.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L5e
                r5.read = r1     // Catch: java.lang.Throwable -> L5e
                r5.RemoteActionCompatParcelizer = r2     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r6 = r1.AudioAttributesCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L5e
                if (r6 != r0) goto L39
                return r0
            L39:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L5e
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L5e
                if (r6 == 0) goto L55
                java.lang.Object r6 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L5e
                o.getShowPopup r6 = (kotlin.getShowPopup) r6     // Catch: java.lang.Throwable -> L5e
                java.util.concurrent.atomic.AtomicBoolean r6 = kotlin.setAttribute.read()     // Catch: java.lang.Throwable -> L5e
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L5e
                o.parseDigitsRecursive$AudioAttributesCompatParcelizer r6 = kotlin.parseDigitsRecursive.INSTANCE     // Catch: java.lang.Throwable -> L5e
                r6.read()     // Catch: java.lang.Throwable -> L5e
                goto L2c
            L55:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L5e
                r5 = 0
                kotlin.setCreatedOn.write(r3, r5)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L5e:
                r5 = move-exception
                throw r5     // Catch: java.lang.Throwable -> L60
            L60:
                r6 = move-exception
                kotlin.setCreatedOn.write(r3, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setAttribute.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(fromCursor<getShowPopup> fromcursor, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = fromcursor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.setAttribute$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Object, getShowPopup> {
        final /* synthetic */ fromCursor<getShowPopup> $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            IconCompatParcelizer(obj);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(Object obj) {
            if (setAttribute.IconCompatParcelizer.compareAndSet(false, true)) {
                this.$read.read(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(fromCursor<getShowPopup> fromcursor) {
            super(1);
            this.$read = fromcursor;
        }
    }
}

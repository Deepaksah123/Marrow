package kotlin;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class McqResponseBody<T> extends accessgetEmptyStatecp<T> {
    private InteractiveVideoElementRSModel IconCompatParcelizer;
    private getAttemptedOption<T> write;

    public McqResponseBody(getAttemptedOption<T> getattemptedoption, InteractiveVideoElementRSModel interactiveVideoElementRSModel) {
        this.write = getattemptedoption;
        this.IconCompatParcelizer = interactiveVideoElementRSModel;
    }

    /* JADX INFO: renamed from: o.McqResponseBody$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[InteractiveVideoElementRSModel.values().length];
            write = iArr;
            try {
                iArr[InteractiveVideoElementRSModel.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[InteractiveVideoElementRSModel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[InteractiveVideoElementRSModel.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[InteractiveVideoElementRSModel.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        AudioAttributesCompatParcelizer audioAttributesImplBaseParcelizer;
        int i = AnonymousClass5.write[this.IconCompatParcelizer.ordinal()];
        if (i == 1) {
            audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(schemaUserStatusRSModel);
        } else if (i == 2) {
            audioAttributesImplBaseParcelizer = new write(schemaUserStatusRSModel);
        } else if (i == 3) {
            audioAttributesImplBaseParcelizer = new RemoteActionCompatParcelizer(schemaUserStatusRSModel);
        } else if (i == 4) {
            audioAttributesImplBaseParcelizer = new read(schemaUserStatusRSModel);
        } else {
            audioAttributesImplBaseParcelizer = new IconCompatParcelizer(schemaUserStatusRSModel, AudioAttributesCompatParcelizer());
        }
        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer);
        try {
            this.write.write(audioAttributesImplBaseParcelizer);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(th);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static abstract class AudioAttributesCompatParcelizer<T> extends AtomicLong implements getCorrectOption<T>, SchemaLessonStatus {
        private getTimelineTitle read = new getTimelineTitle();
        final SchemaUserStatusRSModel<? super T> write;

        void MediaBrowserCompatItemReceiver() {
        }

        void read() {
        }

        AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            this.write = schemaUserStatusRSModel;
        }

        @Override // kotlin.getIndexOfCorrectOption
        public void IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
        }

        protected final void RemoteActionCompatParcelizer() {
            if (write()) {
                return;
            }
            try {
                this.write.aJ_();
            } finally {
                this.read.aL_();
            }
        }

        @Override // kotlin.getIndexOfCorrectOption
        public final void RemoteActionCompatParcelizer(Throwable th) {
            if (AudioAttributesCompatParcelizer(th)) {
                return;
            }
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }

        public boolean AudioAttributesCompatParcelizer(Throwable th) {
            return IconCompatParcelizer(th);
        }

        protected final boolean IconCompatParcelizer(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (write()) {
                return false;
            }
            try {
                this.write.AudioAttributesCompatParcelizer(th);
                this.read.aL_();
                return true;
            } catch (Throwable th2) {
                this.read.aL_();
                throw th2;
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            this.read.aL_();
            MediaBrowserCompatItemReceiver();
        }

        @Override // kotlin.getCorrectOption
        public final boolean write() {
            return this.read.write();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                getAccessLevel.RemoteActionCompatParcelizer(this, j);
                read();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplBaseParcelizer<T> extends AudioAttributesCompatParcelizer<T> {
        AudioAttributesImplBaseParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            super(schemaUserStatusRSModel);
        }

        @Override // kotlin.getIndexOfCorrectOption
        public final void IconCompatParcelizer(T t) {
            long j;
            if (write()) {
                return;
            }
            if (t != null) {
                this.write.a_(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            RemoteActionCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static abstract class AudioAttributesImplApi26Parcelizer<T> extends AudioAttributesCompatParcelizer<T> {
        abstract void MediaBrowserCompatCustomActionResultReceiver();

        AudioAttributesImplApi26Parcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            super(schemaUserStatusRSModel);
        }

        @Override // kotlin.getIndexOfCorrectOption
        public final void IconCompatParcelizer(T t) {
            if (write()) {
                return;
            }
            if (t == null) {
                RemoteActionCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.write.a_(t);
                getAccessLevel.write(this, 1L);
            } else {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T> extends AudioAttributesImplApi26Parcelizer<T> {
        @Override // o.McqResponseBody.AudioAttributesImplApi26Parcelizer
        final void MediaBrowserCompatCustomActionResultReceiver() {
        }

        RemoteActionCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            super(schemaUserStatusRSModel);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write<T> extends AudioAttributesImplApi26Parcelizer<T> {
        write(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            super(schemaUserStatusRSModel);
        }

        @Override // o.McqResponseBody.AudioAttributesImplApi26Parcelizer
        final void MediaBrowserCompatCustomActionResultReceiver() {
            RemoteActionCompatParcelizer(new getLastUpdated("create: could not emit value due to lack of requests"));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T> extends AudioAttributesCompatParcelizer<T> {
        private volatile boolean AudioAttributesCompatParcelizer;
        private Throwable IconCompatParcelizer;
        private PaymentStatusResponseKt<T> RemoteActionCompatParcelizer;
        private AtomicInteger read;

        IconCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, int i) {
            super(schemaUserStatusRSModel);
            this.RemoteActionCompatParcelizer = new PaymentStatusResponseKt<>(i);
            this.read = new AtomicInteger();
        }

        @Override // kotlin.getIndexOfCorrectOption
        public final void IconCompatParcelizer(T t) {
            if (this.AudioAttributesCompatParcelizer || write()) {
                return;
            }
            if (t == null) {
                RemoteActionCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(t);
                AudioAttributesImplBaseParcelizer();
            }
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer(Throwable th) {
            if (this.AudioAttributesCompatParcelizer || write()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.IconCompatParcelizer = th;
            this.AudioAttributesCompatParcelizer = true;
            AudioAttributesImplBaseParcelizer();
            return true;
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer, kotlin.getIndexOfCorrectOption
        public final void IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = true;
            AudioAttributesImplBaseParcelizer();
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer
        final void read() {
            AudioAttributesImplBaseParcelizer();
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer
        final void MediaBrowserCompatItemReceiver() {
            if (this.read.getAndIncrement() == 0) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }

        private void AudioAttributesImplBaseParcelizer() {
            if (this.read.getAndIncrement() == 0) {
                SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel = this.write;
                PaymentStatusResponseKt<T> paymentStatusResponseKt = this.RemoteActionCompatParcelizer;
                int iAddAndGet = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (write()) {
                            paymentStatusResponseKt.RemoteActionCompatParcelizer();
                            return;
                        }
                        boolean z = this.AudioAttributesCompatParcelizer;
                        T t = paymentStatusResponseKt.read();
                        boolean z2 = t == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            schemaUserStatusRSModel.a_(t);
                            j2++;
                        } else {
                            Throwable th = this.IconCompatParcelizer;
                            if (th != null) {
                                IconCompatParcelizer(th);
                                return;
                            } else {
                                RemoteActionCompatParcelizer();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (write()) {
                            paymentStatusResponseKt.RemoteActionCompatParcelizer();
                            return;
                        }
                        boolean z3 = this.AudioAttributesCompatParcelizer;
                        boolean zIconCompatParcelizer = paymentStatusResponseKt.IconCompatParcelizer();
                        if (z3 && zIconCompatParcelizer) {
                            Throwable th2 = this.IconCompatParcelizer;
                            if (th2 != null) {
                                IconCompatParcelizer(th2);
                                return;
                            } else {
                                RemoteActionCompatParcelizer();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        getAccessLevel.write(this, j2);
                    }
                    iAddAndGet = this.read.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class read<T> extends AudioAttributesCompatParcelizer<T> {
        private AtomicInteger AudioAttributesCompatParcelizer;
        private AtomicReference<T> IconCompatParcelizer;
        private volatile boolean RemoteActionCompatParcelizer;
        private Throwable read;

        read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            super(schemaUserStatusRSModel);
            this.IconCompatParcelizer = new AtomicReference<>();
            this.AudioAttributesCompatParcelizer = new AtomicInteger();
        }

        @Override // kotlin.getIndexOfCorrectOption
        public final void IconCompatParcelizer(T t) {
            if (this.RemoteActionCompatParcelizer || write()) {
                return;
            }
            if (t == null) {
                RemoteActionCompatParcelizer(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.IconCompatParcelizer.set(t);
                AudioAttributesImplApi21Parcelizer();
            }
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer(Throwable th) {
            if (this.RemoteActionCompatParcelizer || write()) {
                return false;
            }
            if (th == null) {
                RemoteActionCompatParcelizer(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.read = th;
            this.RemoteActionCompatParcelizer = true;
            AudioAttributesImplApi21Parcelizer();
            return true;
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer, kotlin.getIndexOfCorrectOption
        public final void IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = true;
            AudioAttributesImplApi21Parcelizer();
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer
        final void read() {
            AudioAttributesImplApi21Parcelizer();
        }

        @Override // o.McqResponseBody.AudioAttributesCompatParcelizer
        final void MediaBrowserCompatItemReceiver() {
            if (this.AudioAttributesCompatParcelizer.getAndIncrement() == 0) {
                this.IconCompatParcelizer.lazySet(null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        
            if (r9 != r5) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        
            if (write() == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        
            r5 = r17.RemoteActionCompatParcelizer;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        
            if (r2.get() != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        
            if (r5 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (r12 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        
            r1 = r17.read;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        
            IconCompatParcelizer(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
        
            RemoteActionCompatParcelizer();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
        
            kotlin.getAccessLevel.write(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
        
            r4 = r17.AudioAttributesCompatParcelizer.addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void AudioAttributesImplApi21Parcelizer() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.AudioAttributesCompatParcelizer
                int r1 = r1.getAndIncrement()
                if (r1 != 0) goto L82
                o.SchemaUserStatusRSModel<? super T> r1 = r0.write
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.IconCompatParcelizer
                r3 = 1
                r4 = r3
            L10:
                long r5 = r17.get()
                r7 = 0
                r9 = r7
            L17:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L4d
                boolean r14 = r17.write()
                if (r14 == 0) goto L27
                r2.lazySet(r13)
                return
            L27:
                boolean r14 = r0.RemoteActionCompatParcelizer
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L32
                r16 = r3
                goto L34
            L32:
                r16 = r12
            L34:
                if (r14 == 0) goto L44
                if (r16 == 0) goto L44
                java.lang.Throwable r1 = r0.read
                if (r1 == 0) goto L40
                r0.IconCompatParcelizer(r1)
                return
            L40:
                r17.RemoteActionCompatParcelizer()
                return
            L44:
                if (r16 != 0) goto L4d
                r1.a_(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L17
            L4d:
                if (r11 != 0) goto L72
                boolean r5 = r17.write()
                if (r5 == 0) goto L59
                r2.lazySet(r13)
                return
            L59:
                boolean r5 = r0.RemoteActionCompatParcelizer
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L62
                r12 = r3
            L62:
                if (r5 == 0) goto L72
                if (r12 == 0) goto L72
                java.lang.Throwable r1 = r0.read
                if (r1 == 0) goto L6e
                r0.IconCompatParcelizer(r1)
                return
            L6e:
                r17.RemoteActionCompatParcelizer()
                return
            L72:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L79
                kotlin.getAccessLevel.write(r0, r9)
            L79:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.AudioAttributesCompatParcelizer
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L10
            L82:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.McqResponseBody.read.AudioAttributesImplApi21Parcelizer():void");
        }
    }
}

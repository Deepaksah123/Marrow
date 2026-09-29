package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.PageValueCompanion;

/* JADX INFO: loaded from: classes4.dex */
public class getSchemaCompletion implements getMini {
    private static final String AudioAttributesCompatParcelizer = TestGroupLSModel.MediaBrowserCompatItemReceiver(getSchemaCompletion.class.getCanonicalName(), ".", "");
    public static final getMini read = new getSchemaCompletion("NO_LOCKS", write.AudioAttributesCompatParcelizer, getSolvedOn.RemoteActionCompatParcelizer) { // from class: o.getSchemaCompletion.2
        {
            byte b = 0;
        }

        @Override // kotlin.getSchemaCompletion
        protected final <K, V> MediaDescriptionCompat<V> write(String str, K k) {
            return MediaDescriptionCompat.read();
        }
    };
    protected final PageValueCompanion IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final write write;

    enum RatingCompat {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public interface write {
        public static final write AudioAttributesCompatParcelizer = new write() { // from class: o.getSchemaCompletion.write.2
            @Override // o.getSchemaCompletion.write
            public final RuntimeException AudioAttributesCompatParcelizer(Throwable th) {
                throw setActiveEdition.IconCompatParcelizer(th);
            }
        };

        RuntimeException AudioAttributesCompatParcelizer(Throwable th);
    }

    /* synthetic */ getSchemaCompletion(String str, write writeVar, PageValueCompanion pageValueCompanion, byte b) {
        this(str, writeVar, pageValueCompanion);
    }

    private getSchemaCompletion(String str, write writeVar, PageValueCompanion pageValueCompanion) {
        if (str == null) {
            write(4);
        }
        if (writeVar == null) {
            write(5);
        }
        if (pageValueCompanion == null) {
            write(6);
        }
        this.IconCompatParcelizer = pageValueCompanion;
        this.write = writeVar;
        this.RemoteActionCompatParcelizer = str;
    }

    public getSchemaCompletion(String str) {
        this(str, (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private getSchemaCompletion(String str, byte b) {
        write writeVar = write.AudioAttributesCompatParcelizer;
        PageValueCompanion.RemoteActionCompatParcelizer remoteActionCompatParcelizer = PageValueCompanion.AudioAttributesCompatParcelizer;
        this(str, writeVar, PageValueCompanion.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null, null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    @Override // kotlin.getMini
    public final <K, V> getListOfLessonCompletions<K, V> AudioAttributesCompatParcelizer(getAnswerMap<? super K, ? extends V> getanswermap) {
        return write(getanswermap, write());
    }

    private <K, V> getListOfLessonCompletions<K, V> write(getAnswerMap<? super K, ? extends V> getanswermap, ConcurrentMap<K, Object> concurrentMap) {
        if (getanswermap == null) {
            write(14);
        }
        if (concurrentMap == null) {
            write(15);
        }
        return new MediaBrowserCompatItemReceiver(this, concurrentMap, getanswermap);
    }

    @Override // kotlin.getMini
    public final <K, V> SchemaQbankItem<K, V> IconCompatParcelizer(getAnswerMap<? super K, ? extends V> getanswermap) {
        return AudioAttributesCompatParcelizer(getanswermap, write());
    }

    private <K, V> SchemaQbankItem<K, V> AudioAttributesCompatParcelizer(getAnswerMap<? super K, ? extends V> getanswermap, ConcurrentMap<K, Object> concurrentMap) {
        if (getanswermap == null) {
            write(21);
        }
        if (concurrentMap == null) {
            write(22);
        }
        return new AudioAttributesImplApi26Parcelizer(this, concurrentMap, getanswermap);
    }

    @Override // kotlin.getMini
    public final <T> PageValue<T> read(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        if (getcreatedondatems == null) {
            write(23);
        }
        return new MediaBrowserCompatCustomActionResultReceiver(this, getcreatedondatems);
    }

    @Override // kotlin.getMini
    public final <T> PageValue<T> write(getCreatedOnDateMs<? extends T> getcreatedondatems, final T t) {
        if (t == null) {
            write(27);
        }
        return new MediaBrowserCompatCustomActionResultReceiver<T>(this, getcreatedondatems) { // from class: o.getSchemaCompletion.1
            @Override // o.getSchemaCompletion.IconCompatParcelizer
            protected final MediaDescriptionCompat<T> RemoteActionCompatParcelizer(boolean z) {
                return MediaDescriptionCompat.IconCompatParcelizer(t);
            }
        };
    }

    @Override // kotlin.getMini
    public final <T> PageValue<T> RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems, final getAnswerMap<? super Boolean, ? extends T> getanswermap, final getAnswerMap<? super T, getShowPopup> getanswermap2) {
        return new AudioAttributesImplApi21Parcelizer<T>(this, getcreatedondatems) { // from class: o.getSchemaCompletion.5
            @Override // o.getSchemaCompletion.IconCompatParcelizer
            protected final MediaDescriptionCompat<T> RemoteActionCompatParcelizer(boolean z) {
                getAnswerMap getanswermap3 = getanswermap;
                if (getanswermap3 == null) {
                    MediaDescriptionCompat<T> mediaDescriptionCompatRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(z);
                    if (mediaDescriptionCompatRemoteActionCompatParcelizer == null) {
                        AudioAttributesCompatParcelizer(0);
                    }
                    return mediaDescriptionCompatRemoteActionCompatParcelizer;
                }
                return MediaDescriptionCompat.IconCompatParcelizer(getanswermap3.invoke(Boolean.valueOf(z)));
            }

            @Override // o.getSchemaCompletion.AudioAttributesImplBaseParcelizer
            protected final void write(T t) {
                if (t == null) {
                    AudioAttributesCompatParcelizer(2);
                }
                getanswermap2.invoke(t);
            }

            private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
                String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                Object[] objArr = new Object[i != 2 ? 2 : 3];
                if (i != 2) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                } else {
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
                }
                if (i != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                if (i == 2) {
                    objArr[2] = "doPostCompute";
                }
                String str2 = String.format(str, objArr);
                if (i == 2) {
                    throw new IllegalArgumentException(str2);
                }
            }
        };
    }

    @Override // kotlin.getMini
    public final <T> SchemaLessonStatusResponse<T> AudioAttributesCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        return new IconCompatParcelizer(this, getcreatedondatems);
    }

    @Override // kotlin.getMini
    public final <T> T IconCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        this.IconCompatParcelizer.IconCompatParcelizer();
        try {
            return getcreatedondatems.invoke();
        } finally {
        }
    }

    private static <K> ConcurrentMap<K, Object> write() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    protected <K, V> MediaDescriptionCompat<V> write(String str, K k) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(k == null ? "" : "on input: ".concat(String.valueOf(k)));
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) IconCompatParcelizer(new AssertionError(sb.toString())));
    }

    static class MediaDescriptionCompat<T> {
        private final T AudioAttributesCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;

        public static <T> MediaDescriptionCompat<T> IconCompatParcelizer(T t) {
            return new MediaDescriptionCompat<>(t, false);
        }

        public static <T> MediaDescriptionCompat<T> read() {
            return new MediaDescriptionCompat<>(null, true);
        }

        private MediaDescriptionCompat(T t, boolean z) {
            this.AudioAttributesCompatParcelizer = t;
            this.RemoteActionCompatParcelizer = z;
        }

        public final T write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String toString() {
            return AudioAttributesCompatParcelizer() ? "FALL_THROUGH" : String.valueOf(this.AudioAttributesCompatParcelizer);
        }
    }

    static class IconCompatParcelizer<T> implements SchemaLessonStatusResponse<T> {
        private volatile Object AudioAttributesCompatParcelizer;
        private final getSchemaCompletion RemoteActionCompatParcelizer;
        private final getCreatedOnDateMs<? extends T> read;

        protected void AudioAttributesCompatParcelizer(T t) {
        }

        public IconCompatParcelizer(getSchemaCompletion getschemacompletion, getCreatedOnDateMs<? extends T> getcreatedondatems) {
            if (getschemacompletion == null) {
                IconCompatParcelizer(0);
            }
            if (getcreatedondatems == null) {
                IconCompatParcelizer(1);
            }
            this.AudioAttributesCompatParcelizer = RatingCompat.NOT_COMPUTED;
            this.RemoteActionCompatParcelizer = getschemacompletion;
            this.read = getcreatedondatems;
        }

        public final boolean read() {
            return (this.AudioAttributesCompatParcelizer == RatingCompat.NOT_COMPUTED || this.AudioAttributesCompatParcelizer == RatingCompat.COMPUTING) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0012, B:9:0x0018, B:10:0x001d, B:12:0x0021, B:14:0x0030, B:15:0x0035, B:17:0x0039, B:19:0x0044, B:20:0x0049, B:25:0x0061, B:27:0x0067, B:29:0x006d, B:30:0x0073, B:31:0x007d, B:32:0x007e, B:33:0x0084, B:21:0x004d), top: B:39:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0012, B:9:0x0018, B:10:0x001d, B:12:0x0021, B:14:0x0030, B:15:0x0035, B:17:0x0039, B:19:0x0044, B:20:0x0049, B:25:0x0061, B:27:0x0067, B:29:0x006d, B:30:0x0073, B:31:0x007d, B:32:0x007e, B:33:0x0084, B:21:0x004d), top: B:39:0x0012, inners: #0 }] */
        @Override // kotlin.getCreatedOnDateMs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T invoke() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.AudioAttributesCompatParcelizer
                boolean r1 = r0 instanceof o.getSchemaCompletion.RatingCompat
                if (r1 != 0) goto Lb
                java.lang.Object r3 = kotlin.setActive.RemoteActionCompatParcelizer(r0)
                return r3
            Lb:
                o.getSchemaCompletion r0 = r3.RemoteActionCompatParcelizer
                o.PageValueCompanion r0 = r0.IconCompatParcelizer
                r0.IconCompatParcelizer()
                java.lang.Object r0 = r3.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L85
                boolean r1 = r0 instanceof o.getSchemaCompletion.RatingCompat     // Catch: java.lang.Throwable -> L85
                if (r1 != 0) goto L1d
                java.lang.Object r0 = kotlin.setActive.RemoteActionCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L85
                goto L58
            L1d:
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> L85
                if (r0 != r1) goto L35
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L85
                r3.AudioAttributesCompatParcelizer = r1     // Catch: java.lang.Throwable -> L85
                r1 = 1
                o.getSchemaCompletion$MediaDescriptionCompat r1 = r3.RemoteActionCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L85
                boolean r2 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L85
                if (r2 != 0) goto L35
                java.lang.Object r0 = r1.write()     // Catch: java.lang.Throwable -> L85
                goto L58
            L35:
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L85
                if (r0 != r1) goto L49
                r0 = 0
                o.getSchemaCompletion$MediaDescriptionCompat r0 = r3.RemoteActionCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L85
                boolean r1 = r0.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L85
                if (r1 != 0) goto L49
                java.lang.Object r0 = r0.write()     // Catch: java.lang.Throwable -> L85
                goto L58
            L49:
                o.getSchemaCompletion$RatingCompat r0 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> L85
                r3.AudioAttributesCompatParcelizer = r0     // Catch: java.lang.Throwable -> L85
                o.getCreatedOnDateMs<? extends T> r0 = r3.read     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r3.AudioAttributesCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L60
                r3.AudioAttributesCompatParcelizer = r0     // Catch: java.lang.Throwable -> L60
            L58:
                o.getSchemaCompletion r3 = r3.RemoteActionCompatParcelizer
                o.PageValueCompanion r3 = r3.IconCompatParcelizer
                r3.AudioAttributesCompatParcelizer()
                return r0
            L60:
                r0 = move-exception
                boolean r1 = kotlin.setActiveEdition.write(r0)     // Catch: java.lang.Throwable -> L85
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r3.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L85
                o.getSchemaCompletion$RatingCompat r2 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> L85
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.setActive.AudioAttributesCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L85
                r3.AudioAttributesCompatParcelizer = r1     // Catch: java.lang.Throwable -> L85
            L73:
                o.getSchemaCompletion r1 = r3.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L85
                o.getSchemaCompletion$write r1 = kotlin.getSchemaCompletion.write(r1)     // Catch: java.lang.Throwable -> L85
                java.lang.RuntimeException r0 = r1.AudioAttributesCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L85
                throw r0     // Catch: java.lang.Throwable -> L85
            L7e:
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.NOT_COMPUTED     // Catch: java.lang.Throwable -> L85
                r3.AudioAttributesCompatParcelizer = r1     // Catch: java.lang.Throwable -> L85
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L85
                throw r0     // Catch: java.lang.Throwable -> L85
            L85:
                r0 = move-exception
                o.getSchemaCompletion r3 = r3.RemoteActionCompatParcelizer
                o.PageValueCompanion r3 = r3.IconCompatParcelizer
                r3.AudioAttributesCompatParcelizer()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSchemaCompletion.IconCompatParcelizer.invoke():java.lang.Object");
        }

        protected MediaDescriptionCompat<T> RemoteActionCompatParcelizer(boolean z) {
            MediaDescriptionCompat<T> mediaDescriptionCompatWrite = this.RemoteActionCompatParcelizer.write("in a lazy value", (Object) null);
            if (mediaDescriptionCompatWrite == null) {
                IconCompatParcelizer(2);
            }
            return mediaDescriptionCompatWrite;
        }

        private static /* synthetic */ void IconCompatParcelizer(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }

    static abstract class AudioAttributesImplBaseParcelizer<T> extends IconCompatParcelizer<T> {
        private volatile getImageV2Url<T> RemoteActionCompatParcelizer;

        protected abstract void write(T t);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(getSchemaCompletion getschemacompletion, getCreatedOnDateMs<? extends T> getcreatedondatems) {
            super(getschemacompletion, getcreatedondatems);
            if (getschemacompletion == null) {
                AudioAttributesCompatParcelizer(0);
            }
            if (getcreatedondatems == null) {
                AudioAttributesCompatParcelizer(1);
            }
            this.RemoteActionCompatParcelizer = null;
        }

        @Override // o.getSchemaCompletion.IconCompatParcelizer, kotlin.getCreatedOnDateMs
        public T invoke() {
            getImageV2Url<T> getimagev2url = this.RemoteActionCompatParcelizer;
            if (getimagev2url != null && getimagev2url.IconCompatParcelizer()) {
                return getimagev2url.AudioAttributesCompatParcelizer();
            }
            return (T) super.invoke();
        }

        @Override // o.getSchemaCompletion.IconCompatParcelizer
        protected final void AudioAttributesCompatParcelizer(T t) {
            this.RemoteActionCompatParcelizer = new getImageV2Url<>(t);
            try {
                write(t);
            } finally {
                this.RemoteActionCompatParcelizer = null;
            }
        }

        private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    static abstract class AudioAttributesImplApi21Parcelizer<T> extends AudioAttributesImplBaseParcelizer<T> implements PageValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(getSchemaCompletion getschemacompletion, getCreatedOnDateMs<? extends T> getcreatedondatems) {
            super(getschemacompletion, getcreatedondatems);
            if (getschemacompletion == null) {
                AudioAttributesCompatParcelizer(0);
            }
            if (getcreatedondatems == null) {
                AudioAttributesCompatParcelizer(1);
            }
        }

        @Override // o.getSchemaCompletion.AudioAttributesImplBaseParcelizer, o.getSchemaCompletion.IconCompatParcelizer, kotlin.getCreatedOnDateMs
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                AudioAttributesCompatParcelizer(2);
            }
            return t;
        }

        private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver<T> extends IconCompatParcelizer<T> implements PageValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(getSchemaCompletion getschemacompletion, getCreatedOnDateMs<? extends T> getcreatedondatems) {
            super(getschemacompletion, getcreatedondatems);
            if (getschemacompletion == null) {
                RemoteActionCompatParcelizer(0);
            }
            if (getcreatedondatems == null) {
                RemoteActionCompatParcelizer(1);
            }
        }

        @Override // o.getSchemaCompletion.IconCompatParcelizer, kotlin.getCreatedOnDateMs
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                RemoteActionCompatParcelizer(2);
            }
            return t;
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }
    }

    static class AudioAttributesImplApi26Parcelizer<K, V> implements SchemaQbankItem<K, V> {
        private final ConcurrentMap<K, Object> AudioAttributesCompatParcelizer;
        private final getAnswerMap<? super K, ? extends V> IconCompatParcelizer;
        private final getSchemaCompletion RemoteActionCompatParcelizer;

        public AudioAttributesImplApi26Parcelizer(getSchemaCompletion getschemacompletion, ConcurrentMap<K, Object> concurrentMap, getAnswerMap<? super K, ? extends V> getanswermap) {
            if (getschemacompletion == null) {
                RemoteActionCompatParcelizer(0);
            }
            if (concurrentMap == null) {
                RemoteActionCompatParcelizer(1);
            }
            if (getanswermap == null) {
                RemoteActionCompatParcelizer(2);
            }
            this.RemoteActionCompatParcelizer = getschemacompletion;
            this.AudioAttributesCompatParcelizer = concurrentMap;
            this.IconCompatParcelizer = getanswermap;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: all -> 0x00b7, PHI: r0
          0x0033: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v13 java.lang.Object) binds: [B:10:0x0020, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00b7, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002e, B:14:0x0033, B:16:0x0037, B:18:0x0041, B:20:0x0048, B:31:0x007e, B:34:0x0086, B:36:0x0094, B:37:0x0098, B:38:0x0099, B:39:0x00a3, B:40:0x00a4, B:41:0x00ae, B:42:0x00af, B:43:0x00b6, B:24:0x0055, B:28:0x0078, B:29:0x007c), top: B:47:0x0018, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        @Override // kotlin.getAnswerMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V invoke(K r5) {
            /*
                r4 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r4.AudioAttributesCompatParcelizer
                java.lang.Object r0 = r0.get(r5)
                if (r0 == 0) goto L11
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r4 = kotlin.setActive.read(r0)
                return r4
            L11:
                o.getSchemaCompletion r0 = r4.RemoteActionCompatParcelizer
                o.PageValueCompanion r0 = r0.IconCompatParcelizer
                r0.IconCompatParcelizer()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r4.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Lb7
                java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Lb7
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> Lb7
                if (r0 != r1) goto L33
                o.getSchemaCompletion$RatingCompat r0 = o.getSchemaCompletion.RatingCompat.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lb7
                o.getSchemaCompletion$MediaDescriptionCompat r1 = r4.read(r5)     // Catch: java.lang.Throwable -> Lb7
                boolean r2 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> Lb7
                if (r2 != 0) goto L33
                java.lang.Object r5 = r1.write()     // Catch: java.lang.Throwable -> Lb7
                goto L4c
            L33:
                o.getSchemaCompletion$RatingCompat r1 = o.getSchemaCompletion.RatingCompat.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lb7
                if (r0 != r1) goto L46
                o.getSchemaCompletion$MediaDescriptionCompat r1 = r4.read(r5)     // Catch: java.lang.Throwable -> Lb7
                boolean r2 = r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> Lb7
                if (r2 != 0) goto L46
                java.lang.Object r5 = r1.write()     // Catch: java.lang.Throwable -> Lb7
                goto L4c
            L46:
                if (r0 == 0) goto L54
                java.lang.Object r5 = kotlin.setActive.read(r0)     // Catch: java.lang.Throwable -> Lb7
            L4c:
                o.getSchemaCompletion r4 = r4.RemoteActionCompatParcelizer
                o.PageValueCompanion r4 = r4.IconCompatParcelizer
                r4.AudioAttributesCompatParcelizer()
                return r5
            L54:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r1 = r4.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L7d
                o.getSchemaCompletion$RatingCompat r2 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> L7d
                r1.put(r5, r2)     // Catch: java.lang.Throwable -> L7d
                o.getAnswerMap<? super K, ? extends V> r1 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r1 = r1.invoke(r5)     // Catch: java.lang.Throwable -> L7d
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r4.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r3 = kotlin.setActive.write(r1)     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r2 = r2.put(r5, r3)     // Catch: java.lang.Throwable -> L7d
                o.getSchemaCompletion$RatingCompat r3 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> L7d
                if (r2 != r3) goto L78
                o.getSchemaCompletion r4 = r4.RemoteActionCompatParcelizer
                o.PageValueCompanion r4 = r4.IconCompatParcelizer
                r4.AudioAttributesCompatParcelizer()
                return r1
            L78:
                java.lang.AssertionError r0 = r4.RemoteActionCompatParcelizer(r5, r2)     // Catch: java.lang.Throwable -> L7d
                throw r0     // Catch: java.lang.Throwable -> L7d
            L7d:
                r1 = move-exception
                boolean r2 = kotlin.setActiveEdition.write(r1)     // Catch: java.lang.Throwable -> Lb7
                if (r2 != 0) goto Laf
                if (r1 == r0) goto La4
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r4.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Lb7
                java.lang.Object r2 = kotlin.setActive.AudioAttributesCompatParcelizer(r1)     // Catch: java.lang.Throwable -> Lb7
                java.lang.Object r0 = r0.put(r5, r2)     // Catch: java.lang.Throwable -> Lb7
                o.getSchemaCompletion$RatingCompat r2 = o.getSchemaCompletion.RatingCompat.COMPUTING     // Catch: java.lang.Throwable -> Lb7
                if (r0 == r2) goto L99
                java.lang.AssertionError r5 = r4.RemoteActionCompatParcelizer(r5, r0)     // Catch: java.lang.Throwable -> Lb7
                throw r5     // Catch: java.lang.Throwable -> Lb7
            L99:
                o.getSchemaCompletion r5 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Lb7
                o.getSchemaCompletion$write r5 = kotlin.getSchemaCompletion.write(r5)     // Catch: java.lang.Throwable -> Lb7
                java.lang.RuntimeException r5 = r5.AudioAttributesCompatParcelizer(r1)     // Catch: java.lang.Throwable -> Lb7
                throw r5     // Catch: java.lang.Throwable -> Lb7
            La4:
                o.getSchemaCompletion r5 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Lb7
                o.getSchemaCompletion$write r5 = kotlin.getSchemaCompletion.write(r5)     // Catch: java.lang.Throwable -> Lb7
                java.lang.RuntimeException r5 = r5.AudioAttributesCompatParcelizer(r1)     // Catch: java.lang.Throwable -> Lb7
                throw r5     // Catch: java.lang.Throwable -> Lb7
            Laf:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r4.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Lb7
                r0.remove(r5)     // Catch: java.lang.Throwable -> Lb7
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> Lb7
                throw r1     // Catch: java.lang.Throwable -> Lb7
            Lb7:
                r5 = move-exception
                o.getSchemaCompletion r4 = r4.RemoteActionCompatParcelizer
                o.PageValueCompanion r4 = r4.IconCompatParcelizer
                r4.AudioAttributesCompatParcelizer()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSchemaCompletion.AudioAttributesImplApi26Parcelizer.invoke(java.lang.Object):java.lang.Object");
        }

        private MediaDescriptionCompat<V> read(K k) {
            MediaDescriptionCompat<V> mediaDescriptionCompatWrite = this.RemoteActionCompatParcelizer.write("", k);
            if (mediaDescriptionCompatWrite == null) {
                RemoteActionCompatParcelizer(3);
            }
            return mediaDescriptionCompatWrite;
        }

        private AssertionError RemoteActionCompatParcelizer(K k, Object obj) {
            StringBuilder sb = new StringBuilder("Race condition detected on input ");
            sb.append(k);
            sb.append(". Old value is ");
            sb.append(obj);
            sb.append(" under ");
            sb.append(this.RemoteActionCompatParcelizer);
            AssertionError assertionError = (AssertionError) getSchemaCompletion.IconCompatParcelizer(new AssertionError(sb.toString()));
            if (assertionError == null) {
                RemoteActionCompatParcelizer(4);
            }
            return assertionError;
        }

        @Override // kotlin.SchemaQbankItem
        public final boolean write(K k) {
            Object obj = this.AudioAttributesCompatParcelizer.get(k);
            return (obj == null || obj == RatingCompat.COMPUTING) ? false : true;
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }

    static class MediaBrowserCompatItemReceiver<K, V> extends AudioAttributesImplApi26Parcelizer<K, V> implements getListOfLessonCompletions<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(getSchemaCompletion getschemacompletion, ConcurrentMap<K, Object> concurrentMap, getAnswerMap<? super K, ? extends V> getanswermap) {
            super(getschemacompletion, concurrentMap, getanswermap);
            if (concurrentMap == null) {
                write(1);
            }
            if (getanswermap == null) {
                write(2);
            }
        }

        @Override // o.getSchemaCompletion.AudioAttributesImplApi26Parcelizer, kotlin.getAnswerMap
        public final V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                write(3);
            }
            return v;
        }

        private static /* synthetic */ void write(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T IconCompatParcelizer(T t) {
        if (t == null) {
            write(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!stackTrace[i].getClassName().startsWith(AudioAttributesCompatParcelizer)) {
                break;
            }
            i++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        if (t == null) {
            write(37);
        }
        return t;
    }

    @Override // kotlin.getMini
    public final <K, V> setMcqs<K, V> AudioAttributesCompatParcelizer() {
        return new RemoteActionCompatParcelizer(this, write(), (byte) 0);
    }

    static class RemoteActionCompatParcelizer<K, V> extends AudioAttributesImplApi26Parcelizer<read<K, V>, V> implements setMcqs<K, V> {
        /* synthetic */ RemoteActionCompatParcelizer(getSchemaCompletion getschemacompletion, ConcurrentMap concurrentMap, byte b) {
            this(getschemacompletion, concurrentMap);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private RemoteActionCompatParcelizer(getSchemaCompletion getschemacompletion, ConcurrentMap<read<K, V>, Object> concurrentMap) {
            super(getschemacompletion, concurrentMap, new getAnswerMap<read<K, V>, V>() { // from class: o.getSchemaCompletion.RemoteActionCompatParcelizer.4
                @Override // kotlin.getAnswerMap
                public final /* synthetic */ Object invoke(Object obj) {
                    return RemoteActionCompatParcelizer((read) obj);
                }

                private static V RemoteActionCompatParcelizer(read<K, V> readVar) {
                    return (V) ((read) readVar).IconCompatParcelizer.invoke();
                }
            });
            if (getschemacompletion == null) {
                IconCompatParcelizer(0);
            }
            if (concurrentMap == null) {
                IconCompatParcelizer(1);
            }
        }

        public V AudioAttributesCompatParcelizer(K k, getCreatedOnDateMs<? extends V> getcreatedondatems) {
            if (getcreatedondatems == null) {
                IconCompatParcelizer(2);
            }
            return invoke(new read(k, getcreatedondatems));
        }

        private static /* synthetic */ void IconCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    @Override // kotlin.getMini
    public final <K, V> getMcqAnswerIndexes<K, V> RemoteActionCompatParcelizer() {
        return new AudioAttributesCompatParcelizer(this, write(), (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void write(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSchemaCompletion.write(int):void");
    }

    static class AudioAttributesCompatParcelizer<K, V> extends RemoteActionCompatParcelizer<K, V> implements getMcqAnswerIndexes<K, V> {
        /* synthetic */ AudioAttributesCompatParcelizer(getSchemaCompletion getschemacompletion, ConcurrentMap concurrentMap, byte b) {
            this(getschemacompletion, concurrentMap);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private AudioAttributesCompatParcelizer(getSchemaCompletion getschemacompletion, ConcurrentMap<read<K, V>, Object> concurrentMap) {
            byte b = 0;
            if (getschemacompletion == null) {
                AudioAttributesCompatParcelizer(0);
            }
            if (concurrentMap == null) {
                AudioAttributesCompatParcelizer(1);
            }
            super(getschemacompletion, concurrentMap, b);
        }

        @Override // o.getSchemaCompletion.RemoteActionCompatParcelizer, kotlin.getMcqAnswerIndexes
        public final V AudioAttributesCompatParcelizer(K k, getCreatedOnDateMs<? extends V> getcreatedondatems) {
            if (getcreatedondatems == null) {
                AudioAttributesCompatParcelizer(2);
            }
            V v = (V) super.AudioAttributesCompatParcelizer(k, getcreatedondatems);
            if (v == null) {
                AudioAttributesCompatParcelizer(3);
            }
            return v;
        }

        private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }
    }

    static class read<K, V> {
        private final K AudioAttributesCompatParcelizer;
        private final getCreatedOnDateMs<? extends V> IconCompatParcelizer;

        public read(K k, getCreatedOnDateMs<? extends V> getcreatedondatems) {
            this.AudioAttributesCompatParcelizer = k;
            this.IconCompatParcelizer = getcreatedondatems;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.AudioAttributesCompatParcelizer.equals(((read) obj).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }
    }
}

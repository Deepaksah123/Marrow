package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DateDeserializersDateDeserializer<V> implements Mp4ExtractorExternalSyntheticLambda0<V> {
    static final read AudioAttributesCompatParcelizer;
    private static final Object read;
    volatile write listeners;
    volatile Object value;
    volatile AudioAttributesImplBaseParcelizer waiters;
    static final boolean RemoteActionCompatParcelizer = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger IconCompatParcelizer = Logger.getLogger(DateDeserializersDateDeserializer.class.getName());

    static <T> T IconCompatParcelizer(T t) {
        return t;
    }

    protected void write() {
    }

    static {
        read mediaBrowserCompatItemReceiver;
        try {
            mediaBrowserCompatItemReceiver = new RemoteActionCompatParcelizer(AtomicReferenceFieldUpdater.newUpdater(AudioAttributesImplBaseParcelizer.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(AudioAttributesImplBaseParcelizer.class, AudioAttributesImplBaseParcelizer.class, "next"), AtomicReferenceFieldUpdater.newUpdater(DateDeserializersDateDeserializer.class, AudioAttributesImplBaseParcelizer.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(DateDeserializersDateDeserializer.class, write.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(DateDeserializersDateDeserializer.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver();
        }
        AudioAttributesCompatParcelizer = mediaBrowserCompatItemReceiver;
        if (th != null) {
            IconCompatParcelizer.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        read = new Object();
    }

    static final class AudioAttributesImplBaseParcelizer {
        static final AudioAttributesImplBaseParcelizer write = new AudioAttributesImplBaseParcelizer((byte) 0);
        volatile AudioAttributesImplBaseParcelizer next;
        volatile Thread thread;

        private AudioAttributesImplBaseParcelizer(byte b) {
        }

        AudioAttributesImplBaseParcelizer() {
            DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer.IconCompatParcelizer(this, Thread.currentThread());
        }

        final void read(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this, audioAttributesImplBaseParcelizer);
        }

        final void write() {
            Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void IconCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        audioAttributesImplBaseParcelizer.thread = null;
        while (true) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2 = this.waiters;
            if (audioAttributesImplBaseParcelizer2 != AudioAttributesImplBaseParcelizer.write) {
                AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer3 = null;
                while (audioAttributesImplBaseParcelizer2 != null) {
                    AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer4 = audioAttributesImplBaseParcelizer2.next;
                    if (audioAttributesImplBaseParcelizer2.thread != null) {
                        audioAttributesImplBaseParcelizer3 = audioAttributesImplBaseParcelizer2;
                    } else if (audioAttributesImplBaseParcelizer3 != null) {
                        audioAttributesImplBaseParcelizer3.next = audioAttributesImplBaseParcelizer4;
                        if (audioAttributesImplBaseParcelizer3.thread == null) {
                            break;
                        }
                    } else if (AudioAttributesCompatParcelizer.read((DateDeserializersDateDeserializer<?>) this, audioAttributesImplBaseParcelizer2, audioAttributesImplBaseParcelizer4)) {
                    }
                    audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizer4;
                }
                return;
            }
            return;
        }
    }

    static final class write {
        static final write IconCompatParcelizer = new write(null, null);
        write AudioAttributesCompatParcelizer;
        final Runnable read;
        final Executor write;

        write(Runnable runnable, Executor executor) {
            this.read = runnable;
            this.write = executor;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        final Throwable read;

        static {
            new AudioAttributesCompatParcelizer(new Throwable("Failure occurred while trying to finish a future.") { // from class: o.DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer.5
                @Override // java.lang.Throwable
                public final Throwable fillInStackTrace() {
                    synchronized (this) {
                    }
                    return this;
                }
            });
        }

        AudioAttributesCompatParcelizer(Throwable th) {
            this.read = (Throwable) DateDeserializersDateDeserializer.IconCompatParcelizer(th);
        }
    }

    static final class IconCompatParcelizer {
        static final IconCompatParcelizer RemoteActionCompatParcelizer;
        static final IconCompatParcelizer write;
        final boolean IconCompatParcelizer;
        final Throwable read;

        static {
            if (DateDeserializersDateDeserializer.RemoteActionCompatParcelizer) {
                write = null;
                RemoteActionCompatParcelizer = null;
            } else {
                write = new IconCompatParcelizer(false, null);
                RemoteActionCompatParcelizer = new IconCompatParcelizer(true, null);
            }
        }

        IconCompatParcelizer(boolean z, Throwable th) {
            this.IconCompatParcelizer = z;
            this.read = th;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer<V> implements Runnable {
        final Mp4ExtractorExternalSyntheticLambda0<? extends V> AudioAttributesCompatParcelizer;
        final DateDeserializersDateDeserializer<V> read;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.read.value == this) {
                if (DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, this, DateDeserializersDateDeserializer.write((Mp4ExtractorExternalSyntheticLambda0<?>) this.AudioAttributesCompatParcelizer))) {
                    DateDeserializersDateDeserializer.IconCompatParcelizer((DateDeserializersDateDeserializer<?>) this.read);
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof AudioAttributesImplApi21Parcelizer))) {
            return (V) read(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = this.waiters;
            if (audioAttributesImplBaseParcelizer != AudioAttributesImplBaseParcelizer.write) {
                AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2 = new AudioAttributesImplBaseParcelizer();
                do {
                    audioAttributesImplBaseParcelizer2.read(audioAttributesImplBaseParcelizer);
                    if (AudioAttributesCompatParcelizer.read((DateDeserializersDateDeserializer<?>) this, audioAttributesImplBaseParcelizer, audioAttributesImplBaseParcelizer2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                IconCompatParcelizer(audioAttributesImplBaseParcelizer2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof AudioAttributesImplApi21Parcelizer))) {
                                return (V) read(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        IconCompatParcelizer(audioAttributesImplBaseParcelizer2);
                    } else {
                        audioAttributesImplBaseParcelizer = this.waiters;
                    }
                } while (audioAttributesImplBaseParcelizer != AudioAttributesImplBaseParcelizer.write);
            }
            return (V) read(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof AudioAttributesImplApi21Parcelizer))) {
                return (V) read(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        String string2 = sb.toString();
        if (nanos + 1000 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(" (plus ");
            String string3 = sb2.toString();
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string3);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(string4);
                    sb4.append(",");
                    string4 = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" ");
                string3 = sb5.toString();
            }
            if (z) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string3);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                string3 = sb6.toString();
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string3);
            sb7.append("delay)");
            string2 = sb7.toString();
        }
        if (isDone()) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string2);
            sb8.append(" but future completed as timeout expired");
            throw new TimeoutException(sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(string2);
        sb9.append(" for ");
        sb9.append(string);
        throw new TimeoutException(sb9.toString());
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof AudioAttributesImplApi21Parcelizer))) {
            return (V) read(obj2);
        }
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = this.waiters;
        if (audioAttributesImplBaseParcelizer != AudioAttributesImplBaseParcelizer.write) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2 = new AudioAttributesImplBaseParcelizer();
            do {
                audioAttributesImplBaseParcelizer2.read(audioAttributesImplBaseParcelizer);
                if (AudioAttributesCompatParcelizer.read((DateDeserializersDateDeserializer<?>) this, audioAttributesImplBaseParcelizer, audioAttributesImplBaseParcelizer2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            IconCompatParcelizer(audioAttributesImplBaseParcelizer2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof AudioAttributesImplApi21Parcelizer))));
                    return (V) read(obj);
                }
                audioAttributesImplBaseParcelizer = this.waiters;
            } while (audioAttributesImplBaseParcelizer != AudioAttributesImplBaseParcelizer.write);
        }
        return (V) read(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V read(Object obj) throws ExecutionException {
        if (obj instanceof IconCompatParcelizer) {
            throw AudioAttributesCompatParcelizer("Task was cancelled.", ((IconCompatParcelizer) obj).read);
        }
        if (obj instanceof AudioAttributesCompatParcelizer) {
            throw new ExecutionException(((AudioAttributesCompatParcelizer) obj).read);
        }
        if (obj == read) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof AudioAttributesImplApi21Parcelizer)) & (this.value != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof IconCompatParcelizer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof o.DateDeserializersDateDeserializer.AudioAttributesImplApi21Parcelizer
            r3 = r3 | r4
            if (r3 == 0) goto L59
            boolean r3 = kotlin.DateDeserializersDateDeserializer.RemoteActionCompatParcelizer
            if (r3 == 0) goto L1f
            o.DateDeserializersDateDeserializer$IconCompatParcelizer r3 = new o.DateDeserializersDateDeserializer$IconCompatParcelizer
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            o.DateDeserializersDateDeserializer$IconCompatParcelizer r3 = o.DateDeserializersDateDeserializer.IconCompatParcelizer.RemoteActionCompatParcelizer
            goto L26
        L24:
            o.DateDeserializersDateDeserializer$IconCompatParcelizer r3 = o.DateDeserializersDateDeserializer.IconCompatParcelizer.write
        L26:
            r4 = r2
        L27:
            o.DateDeserializersDateDeserializer$read r5 = kotlin.DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer
            boolean r5 = r5.RemoteActionCompatParcelizer(r6, r0, r3)
            if (r5 == 0) goto L52
            IconCompatParcelizer(r6)
            boolean r6 = r0 instanceof o.DateDeserializersDateDeserializer.AudioAttributesImplApi21Parcelizer
            if (r6 == 0) goto L51
            o.DateDeserializersDateDeserializer$AudioAttributesImplApi21Parcelizer r0 = (o.DateDeserializersDateDeserializer.AudioAttributesImplApi21Parcelizer) r0
            o.Mp4ExtractorExternalSyntheticLambda0<? extends V> r6 = r0.AudioAttributesCompatParcelizer
            boolean r0 = r6 instanceof kotlin.DateDeserializersDateDeserializer
            if (r0 == 0) goto L4e
            o.DateDeserializersDateDeserializer r6 = (kotlin.DateDeserializersDateDeserializer) r6
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L46
            r4 = r1
            goto L47
        L46:
            r4 = r2
        L47:
            boolean r5 = r0 instanceof o.DateDeserializersDateDeserializer.AudioAttributesImplApi21Parcelizer
            r4 = r4 | r5
            if (r4 == 0) goto L51
            r4 = r1
            goto L27
        L4e:
            r6.cancel(r7)
        L51:
            return r1
        L52:
            java.lang.Object r0 = r6.value
            boolean r5 = r0 instanceof o.DateDeserializersDateDeserializer.AudioAttributesImplApi21Parcelizer
            if (r5 != 0) goto L27
            return r4
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DateDeserializersDateDeserializer.cancel(boolean):boolean");
    }

    protected final boolean read() {
        Object obj = this.value;
        return (obj instanceof IconCompatParcelizer) && ((IconCompatParcelizer) obj).IconCompatParcelizer;
    }

    @Override // kotlin.Mp4ExtractorExternalSyntheticLambda0
    public final void IconCompatParcelizer(Runnable runnable, Executor executor) {
        write writeVar = this.listeners;
        if (writeVar != write.IconCompatParcelizer) {
            write writeVar2 = new write(runnable, executor);
            do {
                writeVar2.AudioAttributesCompatParcelizer = writeVar;
                if (AudioAttributesCompatParcelizer.read((DateDeserializersDateDeserializer<?>) this, writeVar, writeVar2)) {
                    return;
                } else {
                    writeVar = this.listeners;
                }
            } while (writeVar != write.IconCompatParcelizer);
        }
        read(runnable, executor);
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
    public boolean AudioAttributesCompatParcelizer(V v) {
        if (v == null) {
            v = (V) read;
        }
        if (!AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, null, v)) {
            return false;
        }
        IconCompatParcelizer((DateDeserializersDateDeserializer<?>) this);
        return true;
    }

    public boolean RemoteActionCompatParcelizer(Throwable th) {
        if (!AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, null, new AudioAttributesCompatParcelizer((Throwable) IconCompatParcelizer(th)))) {
            return false;
        }
        IconCompatParcelizer((DateDeserializersDateDeserializer<?>) this);
        return true;
    }

    static Object write(Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0) {
        if (mp4ExtractorExternalSyntheticLambda0 instanceof DateDeserializersDateDeserializer) {
            Object obj = ((DateDeserializersDateDeserializer) mp4ExtractorExternalSyntheticLambda0).value;
            if (!(obj instanceof IconCompatParcelizer)) {
                return obj;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return iconCompatParcelizer.IconCompatParcelizer ? iconCompatParcelizer.read != null ? new IconCompatParcelizer(false, iconCompatParcelizer.read) : IconCompatParcelizer.write : obj;
        }
        boolean zIsCancelled = mp4ExtractorExternalSyntheticLambda0.isCancelled();
        if ((!RemoteActionCompatParcelizer) & zIsCancelled) {
            return IconCompatParcelizer.write;
        }
        try {
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Future<Object>) mp4ExtractorExternalSyntheticLambda0);
            return objAudioAttributesCompatParcelizer == null ? read : objAudioAttributesCompatParcelizer;
        } catch (CancellationException e) {
            if (!zIsCancelled) {
                return new AudioAttributesCompatParcelizer(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(mp4ExtractorExternalSyntheticLambda0)), e));
            }
            return new IconCompatParcelizer(false, e);
        } catch (ExecutionException e2) {
            return new AudioAttributesCompatParcelizer(e2.getCause());
        } catch (Throwable th) {
            return new AudioAttributesCompatParcelizer(th);
        }
    }

    static <V> V AudioAttributesCompatParcelizer(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
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
    static void IconCompatParcelizer(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer) {
        write writeVar = null;
        while (true) {
            dateDeserializersDateDeserializer.RemoteActionCompatParcelizer();
            dateDeserializersDateDeserializer.write();
            write writeVarWrite = dateDeserializersDateDeserializer.write(writeVar);
            while (writeVarWrite != null) {
                writeVar = writeVarWrite.AudioAttributesCompatParcelizer;
                Runnable runnable = writeVarWrite.read;
                if (runnable instanceof AudioAttributesImplApi21Parcelizer) {
                    AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer) runnable;
                    dateDeserializersDateDeserializer = audioAttributesImplApi21Parcelizer.read;
                    if (dateDeserializersDateDeserializer.value == audioAttributesImplApi21Parcelizer) {
                        if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(dateDeserializersDateDeserializer, audioAttributesImplApi21Parcelizer, write((Mp4ExtractorExternalSyntheticLambda0<?>) audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    read(runnable, writeVarWrite.write);
                }
                writeVarWrite = writeVar;
            }
            return;
        }
    }

    private void RemoteActionCompatParcelizer() {
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer;
        do {
            audioAttributesImplBaseParcelizer = this.waiters;
        } while (!AudioAttributesCompatParcelizer.read((DateDeserializersDateDeserializer<?>) this, audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer.write));
        while (audioAttributesImplBaseParcelizer != null) {
            audioAttributesImplBaseParcelizer.write();
            audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.next;
        }
    }

    private write write(write writeVar) {
        write writeVar2;
        do {
            writeVar2 = this.listeners;
        } while (!AudioAttributesCompatParcelizer.read((DateDeserializersDateDeserializer<?>) this, writeVar2, write.IconCompatParcelizer));
        while (writeVar2 != null) {
            write writeVar3 = writeVar2.AudioAttributesCompatParcelizer;
            writeVar2.AudioAttributesCompatParcelizer = writeVar;
            writeVar = writeVar2;
            writeVar2 = writeVar3;
        }
        return writeVar;
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            RemoteActionCompatParcelizer(sb);
        } else {
            try {
                string = AudioAttributesCompatParcelizer();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                string = sb2.toString();
            }
            if (string != null && !string.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(string);
                sb.append("]");
            } else if (isDone()) {
                RemoteActionCompatParcelizer(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String AudioAttributesCompatParcelizer() {
        Object obj = this.value;
        if (obj instanceof AudioAttributesImplApi21Parcelizer) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            sb.append(write((Object) ((AudioAttributesImplApi21Parcelizer) obj).AudioAttributesCompatParcelizer));
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("remaining delay=[");
        sb2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sb2.append(" ms]");
        return sb2.toString();
    }

    private void RemoteActionCompatParcelizer(StringBuilder sb) {
        try {
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Future<Object>) this);
            sb.append("SUCCESS, result=[");
            sb.append(write(objAudioAttributesCompatParcelizer));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private String write(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private static void read(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = IconCompatParcelizer;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    static abstract class read {
        abstract void AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2);

        abstract void IconCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, Thread thread);

        abstract boolean RemoteActionCompatParcelizer(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, Object obj, Object obj2);

        abstract boolean read(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2);

        abstract boolean read(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, write writeVar, write writeVar2);

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }
    }

    static final class RemoteActionCompatParcelizer extends read {
        final AtomicReferenceFieldUpdater<DateDeserializersDateDeserializer, AudioAttributesImplBaseParcelizer> AudioAttributesCompatParcelizer;
        final AtomicReferenceFieldUpdater<DateDeserializersDateDeserializer, Object> IconCompatParcelizer;
        final AtomicReferenceFieldUpdater<AudioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer> RemoteActionCompatParcelizer;
        final AtomicReferenceFieldUpdater<AudioAttributesImplBaseParcelizer, Thread> read;
        final AtomicReferenceFieldUpdater<DateDeserializersDateDeserializer, write> write;

        RemoteActionCompatParcelizer(AtomicReferenceFieldUpdater<AudioAttributesImplBaseParcelizer, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<AudioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<DateDeserializersDateDeserializer, AudioAttributesImplBaseParcelizer> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<DateDeserializersDateDeserializer, write> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<DateDeserializersDateDeserializer, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.read = atomicReferenceFieldUpdater;
            this.RemoteActionCompatParcelizer = atomicReferenceFieldUpdater2;
            this.AudioAttributesCompatParcelizer = atomicReferenceFieldUpdater3;
            this.write = atomicReferenceFieldUpdater4;
            this.IconCompatParcelizer = atomicReferenceFieldUpdater5;
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final void IconCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, Thread thread) {
            this.read.lazySet(audioAttributesImplBaseParcelizer, thread);
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final void AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2) {
            this.RemoteActionCompatParcelizer.lazySet(audioAttributesImplBaseParcelizer, audioAttributesImplBaseParcelizer2);
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final boolean read(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2) {
            return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, dateDeserializersDateDeserializer, audioAttributesImplBaseParcelizer, audioAttributesImplBaseParcelizer2);
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final boolean read(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, write writeVar, write writeVar2) {
            return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(this.write, dateDeserializersDateDeserializer, writeVar, writeVar2);
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final boolean RemoteActionCompatParcelizer(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, Object obj, Object obj2) {
            return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(this.IconCompatParcelizer, dateDeserializersDateDeserializer, obj, obj2);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends read {
        MediaBrowserCompatItemReceiver() {
            super((byte) 0);
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final void IconCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, Thread thread) {
            audioAttributesImplBaseParcelizer.thread = thread;
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final void AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2) {
            audioAttributesImplBaseParcelizer.next = audioAttributesImplBaseParcelizer2;
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final boolean read(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2) {
            synchronized (dateDeserializersDateDeserializer) {
                if (dateDeserializersDateDeserializer.waiters != audioAttributesImplBaseParcelizer) {
                    return false;
                }
                dateDeserializersDateDeserializer.waiters = audioAttributesImplBaseParcelizer2;
                return true;
            }
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final boolean read(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, write writeVar, write writeVar2) {
            synchronized (dateDeserializersDateDeserializer) {
                if (dateDeserializersDateDeserializer.listeners != writeVar) {
                    return false;
                }
                dateDeserializersDateDeserializer.listeners = writeVar2;
                return true;
            }
        }

        @Override // o.DateDeserializersDateDeserializer.read
        final boolean RemoteActionCompatParcelizer(DateDeserializersDateDeserializer<?> dateDeserializersDateDeserializer, Object obj, Object obj2) {
            synchronized (dateDeserializersDateDeserializer) {
                if (dateDeserializersDateDeserializer.value != obj) {
                    return false;
                }
                dateDeserializersDateDeserializer.value = obj2;
                return true;
            }
        }
    }

    private static CancellationException AudioAttributesCompatParcelizer(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}

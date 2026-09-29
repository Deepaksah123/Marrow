package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setFormatGaplessInfo<V> extends nameToDataType implements Mp4ExtractorExternalSyntheticLambda0<V> {
    static final boolean AudioAttributesCompatParcelizer;
    private static final Object IconCompatParcelizer;
    private static final IconCompatParcelizer RemoteActionCompatParcelizer;
    private static Mp4ExtractorFlags read;
    volatile read listeners;
    volatile Object value;
    volatile RatingCompat waiters;

    interface AudioAttributesImplApi21Parcelizer<V> extends Mp4ExtractorExternalSyntheticLambda0<V> {
    }

    protected void write() {
    }

    static {
        boolean z;
        IconCompatParcelizer mediaBrowserCompatItemReceiver;
        byte b = 0;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        AudioAttributesCompatParcelizer = z;
        read = new Mp4ExtractorFlags(setFormatGaplessInfo.class);
        Throwable e = null;
        try {
            mediaBrowserCompatItemReceiver = new MediaBrowserCompatCustomActionResultReceiver(b);
            e = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                mediaBrowserCompatItemReceiver = new write(AtomicReferenceFieldUpdater.newUpdater(RatingCompat.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(RatingCompat.class, RatingCompat.class, "next"), AtomicReferenceFieldUpdater.newUpdater(setFormatGaplessInfo.class, RatingCompat.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(setFormatGaplessInfo.class, read.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(setFormatGaplessInfo.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } catch (Error | Exception e3) {
                e = e3;
                mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(b);
            }
        }
        RemoteActionCompatParcelizer = mediaBrowserCompatItemReceiver;
        if (e != null) {
            Mp4ExtractorFlags mp4ExtractorFlags = read;
            mp4ExtractorFlags.write().log(Level.SEVERE, "UnsafeAtomicHelper is broken!", e);
            mp4ExtractorFlags.write().log(Level.SEVERE, "SafeAtomicHelper is broken!", e);
        }
        IconCompatParcelizer = new Object();
    }

    public static abstract class AudioAttributesImplApi26Parcelizer<V> extends setFormatGaplessInfo<V> implements AudioAttributesImplApi21Parcelizer<V> {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // kotlin.setFormatGaplessInfo, kotlin.Mp4ExtractorExternalSyntheticLambda0
        public final void IconCompatParcelizer(Runnable runnable, Executor executor) {
            super.IconCompatParcelizer(runnable, executor);
        }

        @Override // kotlin.setFormatGaplessInfo, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    static final class RatingCompat {
        static final RatingCompat IconCompatParcelizer = new RatingCompat((byte) 0);
        volatile RatingCompat next;
        volatile Thread thread;

        private RatingCompat(byte b) {
        }

        RatingCompat() {
            setFormatGaplessInfo.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this, Thread.currentThread());
        }

        final void read(RatingCompat ratingCompat) {
            setFormatGaplessInfo.RemoteActionCompatParcelizer.IconCompatParcelizer(this, ratingCompat);
        }

        final void RemoteActionCompatParcelizer() {
            Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void read(RatingCompat ratingCompat) {
        ratingCompat.thread = null;
        while (true) {
            RatingCompat ratingCompat2 = this.waiters;
            if (ratingCompat2 != RatingCompat.IconCompatParcelizer) {
                RatingCompat ratingCompat3 = null;
                while (ratingCompat2 != null) {
                    RatingCompat ratingCompat4 = ratingCompat2.next;
                    if (ratingCompat2.thread != null) {
                        ratingCompat3 = ratingCompat2;
                    } else if (ratingCompat3 != null) {
                        ratingCompat3.next = ratingCompat4;
                        if (ratingCompat3.thread == null) {
                            break;
                        }
                    } else if (RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, ratingCompat2, ratingCompat4)) {
                    }
                    ratingCompat2 = ratingCompat4;
                }
                return;
            }
            return;
        }
    }

    static final class read {
        static final read write = new read();
        read AudioAttributesCompatParcelizer;
        final Runnable IconCompatParcelizer;
        final Executor read;

        read(Runnable runnable, Executor executor) {
            this.IconCompatParcelizer = runnable;
            this.read = executor;
        }

        read() {
            this.IconCompatParcelizer = null;
            this.read = null;
        }
    }

    static final class RemoteActionCompatParcelizer {
        static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(new Throwable("Failure occurred while trying to finish a future.") { // from class: o.setFormatGaplessInfo.RemoteActionCompatParcelizer.3
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final Throwable IconCompatParcelizer;

        RemoteActionCompatParcelizer(Throwable th) {
            this.IconCompatParcelizer = (Throwable) parseStsd.IconCompatParcelizer(th);
        }
    }

    static final class AudioAttributesCompatParcelizer {
        static final AudioAttributesCompatParcelizer read;
        static final AudioAttributesCompatParcelizer write;
        final Throwable AudioAttributesCompatParcelizer;
        final boolean IconCompatParcelizer;

        static {
            if (setFormatGaplessInfo.AudioAttributesCompatParcelizer) {
                read = null;
                write = null;
            } else {
                read = new AudioAttributesCompatParcelizer(false, null);
                write = new AudioAttributesCompatParcelizer(true, null);
            }
        }

        AudioAttributesCompatParcelizer(boolean z, Throwable th) {
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = th;
        }
    }

    static final class AudioAttributesImplBaseParcelizer<V> implements Runnable {
        final Mp4ExtractorExternalSyntheticLambda0<? extends V> IconCompatParcelizer;
        final setFormatGaplessInfo<V> read;

        AudioAttributesImplBaseParcelizer(setFormatGaplessInfo<V> setformatgaplessinfo, Mp4ExtractorExternalSyntheticLambda0<? extends V> mp4ExtractorExternalSyntheticLambda0) {
            this.read = setformatgaplessinfo;
            this.IconCompatParcelizer = mp4ExtractorExternalSyntheticLambda0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.read.value == this) {
                if (setFormatGaplessInfo.RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this.read, (Object) this, setFormatGaplessInfo.AudioAttributesCompatParcelizer((Mp4ExtractorExternalSyntheticLambda0<?>) this.IconCompatParcelizer))) {
                    setFormatGaplessInfo.read((setFormatGaplessInfo<?>) this.read);
                }
            }
        }
    }

    protected setFormatGaplessInfo() {
    }

    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof AudioAttributesImplBaseParcelizer))) {
            return (V) AudioAttributesCompatParcelizer(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            RatingCompat ratingCompat = this.waiters;
            if (ratingCompat != RatingCompat.IconCompatParcelizer) {
                RatingCompat ratingCompat2 = new RatingCompat();
                do {
                    ratingCompat2.read(ratingCompat);
                    if (RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, ratingCompat, ratingCompat2)) {
                        do {
                            PsshAtomUtil.write(this, nanos);
                            if (Thread.interrupted()) {
                                read(ratingCompat2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof AudioAttributesImplBaseParcelizer))) {
                                return (V) AudioAttributesCompatParcelizer(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        read(ratingCompat2);
                    } else {
                        ratingCompat = this.waiters;
                    }
                } while (ratingCompat != RatingCompat.IconCompatParcelizer);
            }
            return (V) AudioAttributesCompatParcelizer(Objects.requireNonNull(this.value));
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof AudioAttributesImplBaseParcelizer))) {
                return (V) AudioAttributesCompatParcelizer(obj3);
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

    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof AudioAttributesImplBaseParcelizer))) {
            return (V) AudioAttributesCompatParcelizer(obj2);
        }
        RatingCompat ratingCompat = this.waiters;
        if (ratingCompat != RatingCompat.IconCompatParcelizer) {
            RatingCompat ratingCompat2 = new RatingCompat();
            do {
                ratingCompat2.read(ratingCompat);
                if (RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, ratingCompat, ratingCompat2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            read(ratingCompat2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof AudioAttributesImplBaseParcelizer))));
                    return (V) AudioAttributesCompatParcelizer(obj);
                }
                ratingCompat = this.waiters;
            } while (ratingCompat != RatingCompat.IconCompatParcelizer);
        }
        return (V) AudioAttributesCompatParcelizer(Objects.requireNonNull(this.value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V AudioAttributesCompatParcelizer(Object obj) throws ExecutionException {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            throw RemoteActionCompatParcelizer("Task was cancelled.", ((AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer);
        }
        if (obj instanceof RemoteActionCompatParcelizer) {
            throw new ExecutionException(((RemoteActionCompatParcelizer) obj).IconCompatParcelizer);
        }
        if (obj == IconCompatParcelizer) {
            return null;
        }
        return obj;
    }

    public boolean isDone() {
        return (!(r2 instanceof AudioAttributesImplBaseParcelizer)) & (this.value != null);
    }

    public boolean isCancelled() {
        return this.value instanceof AudioAttributesCompatParcelizer;
    }

    public boolean cancel(boolean z) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        Object objRequireNonNull;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof AudioAttributesImplBaseParcelizer)) {
            return false;
        }
        if (AudioAttributesCompatParcelizer) {
            objRequireNonNull = new AudioAttributesCompatParcelizer(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.write;
            } else {
                audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.read;
            }
            objRequireNonNull = Objects.requireNonNull(audioAttributesCompatParcelizer);
        }
        boolean z2 = false;
        while (true) {
            if (RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, obj, objRequireNonNull)) {
                read((setFormatGaplessInfo<?>) this);
                if (!(obj instanceof AudioAttributesImplBaseParcelizer)) {
                    break;
                }
                Mp4ExtractorExternalSyntheticLambda0<? extends V> mp4ExtractorExternalSyntheticLambda0 = ((AudioAttributesImplBaseParcelizer) obj).IconCompatParcelizer;
                if (mp4ExtractorExternalSyntheticLambda0 instanceof AudioAttributesImplApi21Parcelizer) {
                    this = (setFormatGaplessInfo) mp4ExtractorExternalSyntheticLambda0;
                    obj = this.value;
                    if (!(obj == null) && !(obj instanceof AudioAttributesImplBaseParcelizer)) {
                        break;
                    }
                    z2 = true;
                } else {
                    mp4ExtractorExternalSyntheticLambda0.cancel(z);
                    break;
                }
            } else {
                obj = this.value;
                if (!(obj instanceof AudioAttributesImplBaseParcelizer)) {
                    return z2;
                }
            }
        }
        return true;
    }

    protected final boolean IconCompatParcelizer() {
        Object obj = this.value;
        return (obj instanceof AudioAttributesCompatParcelizer) && ((AudioAttributesCompatParcelizer) obj).IconCompatParcelizer;
    }

    public void IconCompatParcelizer(Runnable runnable, Executor executor) {
        read readVar;
        parseStsd.IconCompatParcelizer(runnable, "Runnable was null.");
        parseStsd.IconCompatParcelizer(executor, "Executor was null.");
        if (!isDone() && (readVar = this.listeners) != read.write) {
            read readVar2 = new read(runnable, executor);
            do {
                readVar2.AudioAttributesCompatParcelizer = readVar;
                if (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this, readVar, readVar2)) {
                    return;
                } else {
                    readVar = this.listeners;
                }
            } while (readVar != read.write);
        }
        write(runnable, executor);
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
    protected boolean read(V v) {
        if (v == null) {
            v = (V) IconCompatParcelizer;
        }
        if (!RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        read((setFormatGaplessInfo<?>) this);
        return true;
    }

    protected boolean IconCompatParcelizer(Throwable th) {
        if (!RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, (Object) null, (Object) new RemoteActionCompatParcelizer((Throwable) parseStsd.IconCompatParcelizer(th)))) {
            return false;
        }
        read((setFormatGaplessInfo<?>) this);
        return true;
    }

    protected boolean IconCompatParcelizer(Mp4ExtractorExternalSyntheticLambda0<? extends V> mp4ExtractorExternalSyntheticLambda0) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        Object obj = this.value;
        if (obj == null) {
            if (mp4ExtractorExternalSyntheticLambda0.isDone()) {
                if (!RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, (Object) null, AudioAttributesCompatParcelizer((Mp4ExtractorExternalSyntheticLambda0<?>) mp4ExtractorExternalSyntheticLambda0))) {
                    return false;
                }
                read((setFormatGaplessInfo<?>) this);
                return true;
            }
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(this, mp4ExtractorExternalSyntheticLambda0);
            if (RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, (Object) null, (Object) audioAttributesImplBaseParcelizer)) {
                try {
                    mp4ExtractorExternalSyntheticLambda0.IconCompatParcelizer(audioAttributesImplBaseParcelizer, lambdaprocessMoovAtom1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(th);
                    } catch (Error | Exception unused) {
                        remoteActionCompatParcelizer = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
                    }
                    RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) this, (Object) audioAttributesImplBaseParcelizer, (Object) remoteActionCompatParcelizer);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof AudioAttributesCompatParcelizer) {
            mp4ExtractorExternalSyntheticLambda0.cancel(((AudioAttributesCompatParcelizer) obj).IconCompatParcelizer);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object AudioAttributesCompatParcelizer(Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0) {
        Throwable thAudioAttributesCompatParcelizer;
        if (mp4ExtractorExternalSyntheticLambda0 instanceof AudioAttributesImplApi21Parcelizer) {
            Object audioAttributesCompatParcelizer = ((setFormatGaplessInfo) mp4ExtractorExternalSyntheticLambda0).value;
            if (audioAttributesCompatParcelizer instanceof AudioAttributesCompatParcelizer) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer;
                if (audioAttributesCompatParcelizer2.IconCompatParcelizer) {
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer != null ? new AudioAttributesCompatParcelizer(false, audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer) : AudioAttributesCompatParcelizer.read;
                }
            }
            return Objects.requireNonNull(audioAttributesCompatParcelizer);
        }
        if ((mp4ExtractorExternalSyntheticLambda0 instanceof nameToDataType) && (thAudioAttributesCompatParcelizer = checkForSefData.AudioAttributesCompatParcelizer((nameToDataType) mp4ExtractorExternalSyntheticLambda0)) != null) {
            return new RemoteActionCompatParcelizer(thAudioAttributesCompatParcelizer);
        }
        boolean zIsCancelled = mp4ExtractorExternalSyntheticLambda0.isCancelled();
        if ((!AudioAttributesCompatParcelizer) & zIsCancelled) {
            return Objects.requireNonNull(AudioAttributesCompatParcelizer.read);
        }
        try {
            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mp4ExtractorExternalSyntheticLambda0);
            if (!zIsCancelled) {
                return objRemoteActionCompatParcelizer == null ? IconCompatParcelizer : objRemoteActionCompatParcelizer;
            }
            StringBuilder sb = new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(mp4ExtractorExternalSyntheticLambda0);
            return new AudioAttributesCompatParcelizer(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e) {
            return new RemoteActionCompatParcelizer(e);
        } catch (CancellationException e2) {
            if (!zIsCancelled) {
                return new RemoteActionCompatParcelizer(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(mp4ExtractorExternalSyntheticLambda0)), e2));
            }
            return new AudioAttributesCompatParcelizer(false, e2);
        } catch (ExecutionException e3) {
            if (zIsCancelled) {
                return new AudioAttributesCompatParcelizer(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(mp4ExtractorExternalSyntheticLambda0)), e3));
            }
            return new RemoteActionCompatParcelizer(e3.getCause());
        }
    }

    private static <V> V RemoteActionCompatParcelizer(Future<V> future) throws ExecutionException {
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

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void read(setFormatGaplessInfo<?> setformatgaplessinfo) {
        read readVar = null;
        while (true) {
            setformatgaplessinfo.MediaBrowserCompatCustomActionResultReceiver();
            setformatgaplessinfo.write();
            read readVarAudioAttributesCompatParcelizer = setformatgaplessinfo.AudioAttributesCompatParcelizer(readVar);
            while (readVarAudioAttributesCompatParcelizer != null) {
                readVar = readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                Runnable runnable = (Runnable) Objects.requireNonNull(readVarAudioAttributesCompatParcelizer.IconCompatParcelizer);
                if (runnable instanceof AudioAttributesImplBaseParcelizer) {
                    AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) runnable;
                    setformatgaplessinfo = audioAttributesImplBaseParcelizer.read;
                    if (setformatgaplessinfo.value == audioAttributesImplBaseParcelizer) {
                        if (RemoteActionCompatParcelizer.write((setFormatGaplessInfo<?>) setformatgaplessinfo, (Object) audioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer((Mp4ExtractorExternalSyntheticLambda0<?>) audioAttributesImplBaseParcelizer.IconCompatParcelizer))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    write(runnable, (Executor) Objects.requireNonNull(readVarAudioAttributesCompatParcelizer.read));
                }
                readVarAudioAttributesCompatParcelizer = readVar;
            }
            return;
        }
    }

    @Override // kotlin.nameToDataType
    public final Throwable RemoteActionCompatParcelizer() {
        if (!(this instanceof AudioAttributesImplApi21Parcelizer)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof RemoteActionCompatParcelizer) {
            return ((RemoteActionCompatParcelizer) obj).IconCompatParcelizer;
        }
        return null;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        for (RatingCompat ratingCompat = RemoteActionCompatParcelizer.read((setFormatGaplessInfo<?>) this, RatingCompat.IconCompatParcelizer); ratingCompat != null; ratingCompat = ratingCompat.next) {
            ratingCompat.RemoteActionCompatParcelizer();
        }
    }

    private read AudioAttributesCompatParcelizer(read readVar) {
        read readVar2 = RemoteActionCompatParcelizer.read((setFormatGaplessInfo<?>) this, read.write);
        read readVar3 = readVar;
        while (readVar2 != null) {
            read readVar4 = readVar2.AudioAttributesCompatParcelizer;
            readVar2.AudioAttributesCompatParcelizer = readVar3;
            readVar3 = readVar2;
            readVar2 = readVar4;
        }
        return readVar3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            write(sb);
        } else {
            RemoteActionCompatParcelizer(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String AudioAttributesCompatParcelizer() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("remaining delay=[");
        sb.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sb.append(" ms]");
        return sb.toString();
    }

    private void RemoteActionCompatParcelizer(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof AudioAttributesImplBaseParcelizer) {
            sb.append(", setFuture=[");
            AudioAttributesCompatParcelizer(sb, ((AudioAttributesImplBaseParcelizer) obj).IconCompatParcelizer);
            sb.append("]");
        } else {
            try {
                string = parseVideoSampleEntry.read(AudioAttributesCompatParcelizer());
            } catch (Exception | StackOverflowError e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            write(sb);
        }
    }

    private void write(StringBuilder sb) {
        try {
            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((Future<Object>) this);
            sb.append("SUCCESS, result=[");
            RemoteActionCompatParcelizer(sb, objRemoteActionCompatParcelizer);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void RemoteActionCompatParcelizer(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void AudioAttributesCompatParcelizer(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void write(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerWrite = read.write();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            loggerWrite.log(level, sb.toString(), (Throwable) e);
        }
    }

    static abstract class IconCompatParcelizer {
        abstract void AudioAttributesCompatParcelizer(RatingCompat ratingCompat, Thread thread);

        abstract void IconCompatParcelizer(RatingCompat ratingCompat, RatingCompat ratingCompat2);

        abstract boolean RemoteActionCompatParcelizer(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar, read readVar2);

        abstract RatingCompat read(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat);

        abstract read read(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar);

        abstract boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, Object obj, Object obj2);

        abstract boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat, RatingCompat ratingCompat2);

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends IconCompatParcelizer {
        private static long AudioAttributesCompatParcelizer;
        private static long IconCompatParcelizer;
        private static long MediaBrowserCompatCustomActionResultReceiver;
        private static long RemoteActionCompatParcelizer;
        private static long read;
        private static Unsafe write;

        private MediaBrowserCompatCustomActionResultReceiver() {
            super((byte) 0);
        }

        /* synthetic */ MediaBrowserCompatCustomActionResultReceiver(byte b) {
            this();
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.setFormatGaplessInfo.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* synthetic */ Unsafe run() throws Exception {
                        return AudioAttributesCompatParcelizer();
                    }

                    private static Unsafe AudioAttributesCompatParcelizer() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                AudioAttributesCompatParcelizer = unsafe.objectFieldOffset(setFormatGaplessInfo.class.getDeclaredField("waiters"));
                IconCompatParcelizer = unsafe.objectFieldOffset(setFormatGaplessInfo.class.getDeclaredField("listeners"));
                RemoteActionCompatParcelizer = unsafe.objectFieldOffset(setFormatGaplessInfo.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                MediaBrowserCompatCustomActionResultReceiver = unsafe.objectFieldOffset(RatingCompat.class.getDeclaredField("thread"));
                read = unsafe.objectFieldOffset(RatingCompat.class.getDeclaredField("next"));
                write = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final void AudioAttributesCompatParcelizer(RatingCompat ratingCompat, Thread thread) {
            write.putObject(ratingCompat, MediaBrowserCompatCustomActionResultReceiver, thread);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final void IconCompatParcelizer(RatingCompat ratingCompat, RatingCompat ratingCompat2) {
            write.putObject(ratingCompat, read, ratingCompat2);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat, RatingCompat ratingCompat2) {
            return SefReader.IconCompatParcelizer(write, setformatgaplessinfo, AudioAttributesCompatParcelizer, ratingCompat, ratingCompat2);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean RemoteActionCompatParcelizer(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar, read readVar2) {
            return SefReader.IconCompatParcelizer(write, setformatgaplessinfo, IconCompatParcelizer, readVar, readVar2);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final read read(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar) {
            read readVar2;
            do {
                readVar2 = setformatgaplessinfo.listeners;
                if (readVar == readVar2) {
                    break;
                }
            } while (!RemoteActionCompatParcelizer(setformatgaplessinfo, readVar2, readVar));
            return readVar2;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final RatingCompat read(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat) {
            RatingCompat ratingCompat2;
            do {
                ratingCompat2 = setformatgaplessinfo.waiters;
                if (ratingCompat == ratingCompat2) {
                    break;
                }
            } while (!write(setformatgaplessinfo, ratingCompat2, ratingCompat));
            return ratingCompat2;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, Object obj, Object obj2) {
            return SefReader.IconCompatParcelizer(write, setformatgaplessinfo, RemoteActionCompatParcelizer, obj, obj2);
        }
    }

    static final class write extends IconCompatParcelizer {
        private AtomicReferenceFieldUpdater<RatingCompat, RatingCompat> AudioAttributesCompatParcelizer;
        private AtomicReferenceFieldUpdater<setFormatGaplessInfo, read> IconCompatParcelizer;
        private AtomicReferenceFieldUpdater<setFormatGaplessInfo, RatingCompat> RemoteActionCompatParcelizer;
        private AtomicReferenceFieldUpdater<RatingCompat, Thread> read;
        private AtomicReferenceFieldUpdater<setFormatGaplessInfo, Object> write;

        write(AtomicReferenceFieldUpdater<RatingCompat, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<RatingCompat, RatingCompat> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<setFormatGaplessInfo, RatingCompat> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<setFormatGaplessInfo, read> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<setFormatGaplessInfo, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.read = atomicReferenceFieldUpdater;
            this.AudioAttributesCompatParcelizer = atomicReferenceFieldUpdater2;
            this.RemoteActionCompatParcelizer = atomicReferenceFieldUpdater3;
            this.IconCompatParcelizer = atomicReferenceFieldUpdater4;
            this.write = atomicReferenceFieldUpdater5;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final void AudioAttributesCompatParcelizer(RatingCompat ratingCompat, Thread thread) {
            this.read.lazySet(ratingCompat, thread);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final void IconCompatParcelizer(RatingCompat ratingCompat, RatingCompat ratingCompat2) {
            this.AudioAttributesCompatParcelizer.lazySet(ratingCompat, ratingCompat2);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat, RatingCompat ratingCompat2) {
            return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, setformatgaplessinfo, ratingCompat, ratingCompat2);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean RemoteActionCompatParcelizer(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar, read readVar2) {
            return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(this.IconCompatParcelizer, setformatgaplessinfo, readVar, readVar2);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final read read(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar) {
            return this.IconCompatParcelizer.getAndSet(setformatgaplessinfo, readVar);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final RatingCompat read(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat) {
            return this.RemoteActionCompatParcelizer.getAndSet(setformatgaplessinfo, ratingCompat);
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, Object obj, Object obj2) {
            return DateDeserializersDateBasedDeserializer.IconCompatParcelizer(this.write, setformatgaplessinfo, obj, obj2);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends IconCompatParcelizer {
        private MediaBrowserCompatItemReceiver() {
            super((byte) 0);
        }

        /* synthetic */ MediaBrowserCompatItemReceiver(byte b) {
            this();
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final void AudioAttributesCompatParcelizer(RatingCompat ratingCompat, Thread thread) {
            ratingCompat.thread = thread;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final void IconCompatParcelizer(RatingCompat ratingCompat, RatingCompat ratingCompat2) {
            ratingCompat.next = ratingCompat2;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat, RatingCompat ratingCompat2) {
            synchronized (setformatgaplessinfo) {
                if (setformatgaplessinfo.waiters != ratingCompat) {
                    return false;
                }
                setformatgaplessinfo.waiters = ratingCompat2;
                return true;
            }
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean RemoteActionCompatParcelizer(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar, read readVar2) {
            synchronized (setformatgaplessinfo) {
                if (setformatgaplessinfo.listeners != readVar) {
                    return false;
                }
                setformatgaplessinfo.listeners = readVar2;
                return true;
            }
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final read read(setFormatGaplessInfo<?> setformatgaplessinfo, read readVar) {
            read readVar2;
            synchronized (setformatgaplessinfo) {
                readVar2 = setformatgaplessinfo.listeners;
                if (readVar2 != readVar) {
                    setformatgaplessinfo.listeners = readVar;
                }
            }
            return readVar2;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final RatingCompat read(setFormatGaplessInfo<?> setformatgaplessinfo, RatingCompat ratingCompat) {
            RatingCompat ratingCompat2;
            synchronized (setformatgaplessinfo) {
                ratingCompat2 = setformatgaplessinfo.waiters;
                if (ratingCompat2 != ratingCompat) {
                    setformatgaplessinfo.waiters = ratingCompat;
                }
            }
            return ratingCompat2;
        }

        @Override // o.setFormatGaplessInfo.IconCompatParcelizer
        final boolean write(setFormatGaplessInfo<?> setformatgaplessinfo, Object obj, Object obj2) {
            synchronized (setformatgaplessinfo) {
                if (setformatgaplessinfo.value != obj) {
                    return false;
                }
                setformatgaplessinfo.value = obj2;
                return true;
            }
        }
    }

    private static CancellationException RemoteActionCompatParcelizer(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}

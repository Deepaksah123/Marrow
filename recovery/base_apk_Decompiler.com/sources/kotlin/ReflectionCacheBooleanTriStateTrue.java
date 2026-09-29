package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionCacheBooleanTriStateTrue<T> {
    private static final Executor read = new IconCompatParcelizer();
    Executor AudioAttributesCompatParcelizer;
    final ReflectionCacheCompanion<T> IconCompatParcelizer;
    private final UByteKeyDeserializer MediaBrowserCompatItemReceiver;
    private List<T> RemoteActionCompatParcelizer;
    int write;
    private final List<RemoteActionCompatParcelizer<T>> MediaBrowserCompatCustomActionResultReceiver = new CopyOnWriteArrayList();
    private List<T> AudioAttributesImplApi26Parcelizer = Collections.emptyList();

    public interface RemoteActionCompatParcelizer<T> {
    }

    static class IconCompatParcelizer implements Executor {
        final Handler read = new Handler(Looper.getMainLooper());

        IconCompatParcelizer() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.read.post(runnable);
        }
    }

    public ReflectionCacheBooleanTriStateTrue(UByteKeyDeserializer uByteKeyDeserializer, ReflectionCacheCompanion<T> reflectionCacheCompanion) {
        this.MediaBrowserCompatItemReceiver = uByteKeyDeserializer;
        this.IconCompatParcelizer = reflectionCacheCompanion;
        if (reflectionCacheCompanion.IconCompatParcelizer() != null) {
            this.AudioAttributesCompatParcelizer = reflectionCacheCompanion.IconCompatParcelizer();
        } else {
            this.AudioAttributesCompatParcelizer = read;
        }
    }

    public final List<T> write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read(List<T> list) {
        IconCompatParcelizer(list);
    }

    private void IconCompatParcelizer(List<T> list) {
        int i = this.write + 1;
        this.write = i;
        List<T> list2 = this.RemoteActionCompatParcelizer;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            this.RemoteActionCompatParcelizer = null;
            this.AudioAttributesImplApi26Parcelizer = Collections.emptyList();
            this.MediaBrowserCompatItemReceiver.write(0, size);
            RemoteActionCompatParcelizer(null);
            return;
        }
        if (list2 == null) {
            this.RemoteActionCompatParcelizer = list;
            this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(list);
            this.MediaBrowserCompatItemReceiver.read(0, list.size());
            RemoteActionCompatParcelizer(null);
            return;
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer().execute(new Runnable(list2, list, i, null) { // from class: o.ReflectionCacheBooleanTriStateTrue.3
            final /* synthetic */ List IconCompatParcelizer;
            final /* synthetic */ List RemoteActionCompatParcelizer;
            final /* synthetic */ int read;
            final /* synthetic */ Runnable write = null;

            @Override // java.lang.Runnable
            public final void run() {
                final SequenceSerializer.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = SequenceSerializer.AudioAttributesCompatParcelizer(new SequenceSerializer.IconCompatParcelizer() { // from class: o.ReflectionCacheBooleanTriStateTrue.3.3
                    @Override // o.SequenceSerializer.IconCompatParcelizer
                    public final int write() {
                        return AnonymousClass3.this.IconCompatParcelizer.size();
                    }

                    @Override // o.SequenceSerializer.IconCompatParcelizer
                    public final int IconCompatParcelizer() {
                        return AnonymousClass3.this.RemoteActionCompatParcelizer.size();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.SequenceSerializer.IconCompatParcelizer
                    public final boolean read(int i2, int i3) {
                        Object obj = AnonymousClass3.this.IconCompatParcelizer.get(i2);
                        Object obj2 = AnonymousClass3.this.RemoteActionCompatParcelizer.get(i3);
                        if (obj == null || obj2 == null) {
                            return obj == null && obj2 == null;
                        }
                        return ReflectionCacheBooleanTriStateTrue.this.IconCompatParcelizer.write().RemoteActionCompatParcelizer(obj, obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.SequenceSerializer.IconCompatParcelizer
                    public final boolean RemoteActionCompatParcelizer(int i2, int i3) {
                        Object obj = AnonymousClass3.this.IconCompatParcelizer.get(i2);
                        Object obj2 = AnonymousClass3.this.RemoteActionCompatParcelizer.get(i3);
                        if (obj != null && obj2 != null) {
                            return ReflectionCacheBooleanTriStateTrue.this.IconCompatParcelizer.write().read(obj, obj2);
                        }
                        if (obj == null && obj2 == null) {
                            return true;
                        }
                        throw new AssertionError();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // o.SequenceSerializer.IconCompatParcelizer
                    public final Object AudioAttributesCompatParcelizer(int i2, int i3) {
                        Object obj = AnonymousClass3.this.IconCompatParcelizer.get(i2);
                        Object obj2 = AnonymousClass3.this.RemoteActionCompatParcelizer.get(i3);
                        if (obj != null && obj2 != null) {
                            return ReflectionCacheBooleanTriStateTrue.this.IconCompatParcelizer.write().write(obj, obj2);
                        }
                        throw new AssertionError();
                    }
                });
                ReflectionCacheBooleanTriStateTrue.this.AudioAttributesCompatParcelizer.execute(new Runnable() { // from class: o.ReflectionCacheBooleanTriStateTrue.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ReflectionCacheBooleanTriStateTrue.this.write == AnonymousClass3.this.read) {
                            ReflectionCacheBooleanTriStateTrue.this.RemoteActionCompatParcelizer(AnonymousClass3.this.RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, AnonymousClass3.this.write);
                        }
                    }
                });
            }
        });
    }

    final void RemoteActionCompatParcelizer(List<T> list, SequenceSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Runnable runnable) {
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesImplApi26Parcelizer = Collections.unmodifiableList(list);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        RemoteActionCompatParcelizer(runnable);
    }

    private void RemoteActionCompatParcelizer(Runnable runnable) {
        for (RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer : this.MediaBrowserCompatCustomActionResultReceiver) {
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void IconCompatParcelizer(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver.add(remoteActionCompatParcelizer);
    }
}

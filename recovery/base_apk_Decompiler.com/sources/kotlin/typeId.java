package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.enumTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class typeId<T> {
    private final buildTypeDeserializer AudioAttributesCompatParcelizer;
    private final Object AudioAttributesImplApi26Parcelizer;
    private final ArrayDeque<Runnable> AudioAttributesImplBaseParcelizer;
    private final _usesExternalId IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final CopyOnWriteArraySet<write<T>> RemoteActionCompatParcelizer;
    private final read<T> read;
    private final ArrayDeque<Runnable> write;

    public interface RemoteActionCompatParcelizer<T> {
        void RemoteActionCompatParcelizer(T t);
    }

    public interface read<T> {
        void write(T t, enumTypes enumtypes);
    }

    public typeId(Looper looper, buildTypeDeserializer buildtypedeserializer, read<T> readVar) {
        this(new CopyOnWriteArraySet(), looper, buildtypedeserializer, readVar, true);
    }

    private typeId(CopyOnWriteArraySet<write<T>> copyOnWriteArraySet, Looper looper, buildTypeDeserializer buildtypedeserializer, read<T> readVar, boolean z) {
        this.AudioAttributesCompatParcelizer = buildtypedeserializer;
        this.RemoteActionCompatParcelizer = copyOnWriteArraySet;
        this.read = readVar;
        this.AudioAttributesImplApi26Parcelizer = new Object();
        this.write = new ArrayDeque<>();
        this.AudioAttributesImplBaseParcelizer = new ArrayDeque<>();
        this.IconCompatParcelizer = buildtypedeserializer.read(looper, new Handler.Callback() { // from class: o.AsArrayTypeSerializer
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.AudioAttributesCompatParcelizer.write();
            }
        });
        this.MediaBrowserCompatItemReceiver = z;
    }

    public final typeId<T> AudioAttributesCompatParcelizer(Looper looper, read<T> readVar) {
        return RemoteActionCompatParcelizer(looper, this.AudioAttributesCompatParcelizer, readVar);
    }

    private typeId<T> RemoteActionCompatParcelizer(Looper looper, buildTypeDeserializer buildtypedeserializer, read<T> readVar) {
        return new typeId<>(this.RemoteActionCompatParcelizer, looper, buildtypedeserializer, readVar, this.MediaBrowserCompatItemReceiver);
    }

    public final void AudioAttributesCompatParcelizer(T t) {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                return;
            }
            this.RemoteActionCompatParcelizer.add(new write<>(t));
        }
    }

    public final void write(T t) {
        IconCompatParcelizer();
        for (write<T> writeVar : this.RemoteActionCompatParcelizer) {
            if (writeVar.write.equals(t)) {
                writeVar.RemoteActionCompatParcelizer(this.read);
                this.RemoteActionCompatParcelizer.remove(writeVar);
            }
        }
    }

    public final void read(final int i, final RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        IconCompatParcelizer();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.RemoteActionCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer.add(new Runnable() { // from class: o.buildFingerprints
            @Override // java.lang.Runnable
            public final void run() {
                typeId.write(copyOnWriteArraySet, i, remoteActionCompatParcelizer);
            }
        });
    }

    static /* synthetic */ void write(CopyOnWriteArraySet copyOnWriteArraySet, int i, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((write) it.next()).RemoteActionCompatParcelizer(i, remoteActionCompatParcelizer);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        IconCompatParcelizer();
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            return;
        }
        if (!this.IconCompatParcelizer.write()) {
            _usesExternalId _usesexternalid = this.IconCompatParcelizer;
            _usesexternalid.RemoteActionCompatParcelizer(_usesexternalid.write(1));
        }
        boolean zIsEmpty = this.write.isEmpty();
        this.write.addAll(this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesImplBaseParcelizer.clear();
        if (zIsEmpty) {
            while (!this.write.isEmpty()) {
                this.write.peekFirst().run();
                this.write.removeFirst();
            }
        }
    }

    public final void write(int i, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        read(i, remoteActionCompatParcelizer);
        AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        IconCompatParcelizer();
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }
        Iterator<write<T>> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(this.read);
        }
        this.RemoteActionCompatParcelizer.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean write() {
        Iterator<write<T>> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().read(this.read);
            if (this.IconCompatParcelizer.write()) {
                return true;
            }
        }
        return true;
    }

    private void IconCompatParcelizer() {
        if (this.MediaBrowserCompatItemReceiver) {
            buildTypeSerializer.write(Thread.currentThread() == this.IconCompatParcelizer.IconCompatParcelizer().getThread());
        }
    }

    static final class write<T> {
        private boolean AudioAttributesCompatParcelizer;
        private enumTypes.write IconCompatParcelizer = new enumTypes.write();
        private boolean read;
        public final T write;

        public write(T t) {
            this.write = t;
        }

        public final void RemoteActionCompatParcelizer(read<T> readVar) {
            this.read = true;
            if (this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = false;
                readVar.write(this.write, this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
            }
        }

        public final void RemoteActionCompatParcelizer(int i, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
            if (this.read) {
                return;
            }
            if (i != -1) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
            }
            this.AudioAttributesCompatParcelizer = true;
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write);
        }

        public final void read(read<T> readVar) {
            if (this.read || !this.AudioAttributesCompatParcelizer) {
                return;
            }
            enumTypes enumtypesAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = new enumTypes.write();
            this.AudioAttributesCompatParcelizer = false;
            readVar.write(this.write, enumtypesAudioAttributesCompatParcelizer);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.write.equals(((write) obj).write);
        }

        public final int hashCode() {
            return this.write.hashCode();
        }
    }
}

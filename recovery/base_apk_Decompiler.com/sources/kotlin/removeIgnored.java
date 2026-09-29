package kotlin;

import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public abstract class removeIgnored<T> {
    static final Object AudioAttributesCompatParcelizer = new Object();
    private final Runnable AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private volatile Object MediaBrowserCompatCustomActionResultReceiver;
    private ActionBarContainer<POJOPropertyBuilder1<? super T>, removeIgnored<T>.write> MediaBrowserCompatItemReceiver;
    private int RatingCompat;
    volatile Object RemoteActionCompatParcelizer;
    final Object read;
    private int write;

    protected void RemoteActionCompatParcelizer() {
    }

    protected void read() {
    }

    public removeIgnored(T t) {
        this.read = new Object();
        this.MediaBrowserCompatItemReceiver = new ActionBarContainer<>();
        this.write = 0;
        this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = new Runnable() { // from class: o.removeIgnored.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                synchronized (removeIgnored.this.read) {
                    obj = removeIgnored.this.RemoteActionCompatParcelizer;
                    removeIgnored.this.RemoteActionCompatParcelizer = removeIgnored.AudioAttributesCompatParcelizer;
                }
                removeIgnored.this.IconCompatParcelizer(obj);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.RatingCompat = 0;
    }

    public removeIgnored() {
        this.read = new Object();
        this.MediaBrowserCompatItemReceiver = new ActionBarContainer<>();
        this.write = 0;
        Object obj = AudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = obj;
        this.AudioAttributesImplApi21Parcelizer = new Runnable() { // from class: o.removeIgnored.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (removeIgnored.this.read) {
                    obj2 = removeIgnored.this.RemoteActionCompatParcelizer;
                    removeIgnored.this.RemoteActionCompatParcelizer = removeIgnored.AudioAttributesCompatParcelizer;
                }
                removeIgnored.this.IconCompatParcelizer(obj2);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = obj;
        this.RatingCompat = -1;
    }

    private void write(removeIgnored<T>.write writeVar) {
        if (writeVar.RemoteActionCompatParcelizer) {
            if (!writeVar.write()) {
                writeVar.IconCompatParcelizer(false);
                return;
            }
            int i = writeVar.AudioAttributesCompatParcelizer;
            int i2 = this.RatingCompat;
            if (i >= i2) {
                return;
            }
            writeVar.AudioAttributesCompatParcelizer = i2;
            writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    final void read(removeIgnored<T>.write writeVar) {
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = true;
            return;
        }
        this.AudioAttributesImplBaseParcelizer = true;
        do {
            this.AudioAttributesImplApi26Parcelizer = false;
            if (writeVar != null) {
                write(writeVar);
                writeVar = null;
            } else {
                ActionBarContainer<POJOPropertyBuilder1<? super T>, removeIgnored<T>.write>.write writeVarWrite = this.MediaBrowserCompatItemReceiver.write();
                while (writeVarWrite.hasNext()) {
                    write((write) writeVarWrite.next().getValue());
                    if (this.AudioAttributesImplApi26Parcelizer) {
                        break;
                    }
                }
            }
        } while (this.AudioAttributesImplApi26Parcelizer);
        this.AudioAttributesImplBaseParcelizer = false;
    }

    public final void AudioAttributesCompatParcelizer(hasGetter hasgetter, POJOPropertyBuilder1<? super T> pOJOPropertyBuilder1) {
        read("observe");
        if (hasgetter.getLifecycle().read() != anyIgnorals.write.AudioAttributesCompatParcelizer) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(hasgetter, pOJOPropertyBuilder1);
            removeIgnored<T>.write writeVar = this.MediaBrowserCompatItemReceiver.read(pOJOPropertyBuilder1, iconCompatParcelizer);
            if (writeVar != null && !writeVar.AudioAttributesCompatParcelizer(hasgetter)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (writeVar != null) {
                return;
            }
            hasgetter.getLifecycle().IconCompatParcelizer(iconCompatParcelizer);
        }
    }

    public final void AudioAttributesCompatParcelizer(POJOPropertyBuilder1<? super T> pOJOPropertyBuilder1) {
        read("observeForever");
        read readVar = new read(pOJOPropertyBuilder1);
        removeIgnored<T>.write writeVar = this.MediaBrowserCompatItemReceiver.read(pOJOPropertyBuilder1, readVar);
        if (writeVar instanceof IconCompatParcelizer) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (writeVar != null) {
            return;
        }
        readVar.IconCompatParcelizer(true);
    }

    public void write(POJOPropertyBuilder1<? super T> pOJOPropertyBuilder1) {
        read("removeObserver");
        removeIgnored<T>.write writeVarAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(pOJOPropertyBuilder1);
        if (writeVarAudioAttributesCompatParcelizer == null) {
            return;
        }
        writeVarAudioAttributesCompatParcelizer.IconCompatParcelizer();
        writeVarAudioAttributesCompatParcelizer.IconCompatParcelizer(false);
    }

    protected void AudioAttributesCompatParcelizer(T t) {
        boolean z;
        synchronized (this.read) {
            z = this.RemoteActionCompatParcelizer == AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = t;
        }
        if (z) {
            setPopupCallback.RemoteActionCompatParcelizer().read(this.AudioAttributesImplApi21Parcelizer);
        }
    }

    protected void IconCompatParcelizer(T t) {
        read("setValue");
        this.RatingCompat++;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        read((write) null);
    }

    public final T AudioAttributesCompatParcelizer() {
        T t = (T) this.MediaBrowserCompatCustomActionResultReceiver;
        if (t != AudioAttributesCompatParcelizer) {
            return t;
        }
        return null;
    }

    public final boolean IconCompatParcelizer() {
        return this.write > 0;
    }

    final void read(int i) {
        int i2 = this.write;
        this.write = i + i2;
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        while (true) {
            try {
                int i3 = this.write;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    RemoteActionCompatParcelizer();
                } else if (z2) {
                    read();
                }
                i2 = i3;
            } finally {
                this.IconCompatParcelizer = false;
            }
        }
    }

    class IconCompatParcelizer extends removeIgnored<T>.write implements findAccess {
        final hasGetter write;

        IconCompatParcelizer(hasGetter hasgetter, POJOPropertyBuilder1<? super T> pOJOPropertyBuilder1) {
            super(pOJOPropertyBuilder1);
            this.write = hasgetter;
        }

        @Override // o.removeIgnored.write
        final boolean write() {
            return this.write.getLifecycle().read().RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer);
        }

        @Override // kotlin.findAccess
        public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
            anyIgnorals.write writeVar = this.write.getLifecycle().read();
            if (writeVar == anyIgnorals.write.AudioAttributesCompatParcelizer) {
                removeIgnored.this.write(this.AudioAttributesImplBaseParcelizer);
                return;
            }
            anyIgnorals.write writeVar2 = null;
            while (writeVar2 != writeVar) {
                IconCompatParcelizer(write());
                writeVar2 = writeVar;
                writeVar = this.write.getLifecycle().read();
            }
        }

        @Override // o.removeIgnored.write
        final boolean AudioAttributesCompatParcelizer(hasGetter hasgetter) {
            return this.write == hasgetter;
        }

        @Override // o.removeIgnored.write
        final void IconCompatParcelizer() {
            this.write.getLifecycle().AudioAttributesCompatParcelizer(this);
        }
    }

    abstract class write {
        int AudioAttributesCompatParcelizer = -1;
        final POJOPropertyBuilder1<? super T> AudioAttributesImplBaseParcelizer;
        boolean RemoteActionCompatParcelizer;

        boolean AudioAttributesCompatParcelizer(hasGetter hasgetter) {
            return false;
        }

        void IconCompatParcelizer() {
        }

        abstract boolean write();

        write(POJOPropertyBuilder1<? super T> pOJOPropertyBuilder1) {
            this.AudioAttributesImplBaseParcelizer = pOJOPropertyBuilder1;
        }

        final void IconCompatParcelizer(boolean z) {
            if (z != this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = z;
                removeIgnored.this.read(z ? 1 : -1);
                if (this.RemoteActionCompatParcelizer) {
                    removeIgnored.this.read(this);
                }
            }
        }
    }

    class read extends removeIgnored<T>.write {
        @Override // o.removeIgnored.write
        final boolean write() {
            return true;
        }

        read(POJOPropertyBuilder1<? super T> pOJOPropertyBuilder1) {
            super(pOJOPropertyBuilder1);
        }
    }

    private static void read(String str) {
        if (setPopupCallback.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new IllegalStateException(sb.toString());
    }
}

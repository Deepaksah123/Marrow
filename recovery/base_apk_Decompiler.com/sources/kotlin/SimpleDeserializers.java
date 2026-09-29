package kotlin;

import com.google.android.exoplayer2.C;
import java.util.ArrayDeque;
import kotlin.SimpleAbstractTypeResolver;
import kotlin.SimpleModule;
import kotlin._find;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleDeserializers<I extends _find, O extends SimpleAbstractTypeResolver, E extends SimpleModule> implements _generateTypeId<I, O, E> {
    private final I[] AudioAttributesCompatParcelizer;
    private E AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private int IconCompatParcelizer;
    private I MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private int RatingCompat;
    private int RemoteActionCompatParcelizer;
    private final Thread read;
    private final O[] write;
    private final Object MediaBrowserCompatCustomActionResultReceiver = new Object();
    private long AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    private final ArrayDeque<I> MediaMetadataCompat = new ArrayDeque<>();
    private final ArrayDeque<O> MediaDescriptionCompat = new ArrayDeque<>();

    protected abstract E AudioAttributesCompatParcelizer(I i, O o2, boolean z);

    protected abstract O AudioAttributesImplApi26Parcelizer();

    protected abstract E IconCompatParcelizer(Throwable th);

    protected abstract I RemoteActionCompatParcelizer();

    public SimpleDeserializers(I[] iArr, O[] oArr) {
        this.AudioAttributesCompatParcelizer = iArr;
        this.IconCompatParcelizer = iArr.length;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            ((I[]) this.AudioAttributesCompatParcelizer)[i] = RemoteActionCompatParcelizer();
        }
        this.write = oArr;
        this.RemoteActionCompatParcelizer = oArr.length;
        for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer; i2++) {
            ((O[]) this.write)[i2] = AudioAttributesImplApi26Parcelizer();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: o.SimpleDeserializers.5
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                SimpleDeserializers.this.MediaBrowserCompatMediaItem();
            }
        };
        this.read = thread;
        thread.start();
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        buildTypeSerializer.write(this.IconCompatParcelizer == this.AudioAttributesCompatParcelizer.length);
        for (I i : this.AudioAttributesCompatParcelizer) {
            i.read(1024);
        }
    }

    private boolean IconCompatParcelizer(long j) {
        boolean z;
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            long j2 = this.AudioAttributesImplBaseParcelizer;
            z = j2 == C.TIME_UNSET || j >= j2;
        }
        return z;
    }

    @Override // kotlin._generateTypeId
    public final void read(long j) {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            buildTypeSerializer.write(this.IconCompatParcelizer == this.AudioAttributesCompatParcelizer.length || this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesImplBaseParcelizer = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin._generateTypeId
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
    public I read() throws SimpleModule {
        I i;
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            MediaMetadataCompat();
            buildTypeSerializer.write(this.MediaBrowserCompatItemReceiver == null);
            int i2 = this.IconCompatParcelizer;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.AudioAttributesCompatParcelizer;
                int i3 = i2 - 1;
                this.IconCompatParcelizer = i3;
                i = iArr[i3];
            }
            this.MediaBrowserCompatItemReceiver = i;
        }
        return i;
    }

    @Override // kotlin._generateTypeId
    public final void RemoteActionCompatParcelizer(I i) throws SimpleModule {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            MediaMetadataCompat();
            buildTypeSerializer.IconCompatParcelizer(i == this.MediaBrowserCompatItemReceiver);
            this.MediaMetadataCompat.addLast(i);
            RatingCompat();
            this.MediaBrowserCompatItemReceiver = null;
        }
    }

    @Override // kotlin._generateTypeId
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final O IconCompatParcelizer() throws SimpleModule {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            MediaMetadataCompat();
            if (this.MediaDescriptionCompat.isEmpty()) {
                return null;
            }
            return this.MediaDescriptionCompat.removeFirst();
        }
    }

    public final void IconCompatParcelizer(O o2) {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            RemoteActionCompatParcelizer((SimpleAbstractTypeResolver) o2);
            RatingCompat();
        }
    }

    @Override // kotlin._generateTypeId
    public final void AudioAttributesCompatParcelizer() {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesImplApi26Parcelizer = true;
            this.RatingCompat = 0;
            I i = this.MediaBrowserCompatItemReceiver;
            if (i != null) {
                write(i);
                this.MediaBrowserCompatItemReceiver = null;
            }
            while (!this.MediaMetadataCompat.isEmpty()) {
                write(this.MediaMetadataCompat.removeFirst());
            }
            while (!this.MediaDescriptionCompat.isEmpty()) {
                this.MediaDescriptionCompat.removeFirst().MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    @Override // kotlin._generateTypeId
    public final void write() {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatMediaItem = true;
            this.MediaBrowserCompatCustomActionResultReceiver.notify();
        }
        try {
            this.read.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends o.SimpleModule */
    private void MediaMetadataCompat() throws E, SimpleModule {
        E e = this.AudioAttributesImplApi21Parcelizer;
        if (e != null) {
            throw e;
        }
    }

    private void RatingCompat() {
        if (AudioAttributesImplApi21Parcelizer()) {
            this.MediaBrowserCompatCustomActionResultReceiver.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatMediaItem() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (MediaBrowserCompatCustomActionResultReceiver());
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() throws InterruptedException {
        E e;
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            while (!this.MediaBrowserCompatMediaItem && !AudioAttributesImplApi21Parcelizer()) {
                this.MediaBrowserCompatCustomActionResultReceiver.wait();
            }
            if (this.MediaBrowserCompatMediaItem) {
                return false;
            }
            I iRemoveFirst = this.MediaMetadataCompat.removeFirst();
            O[] oArr = this.write;
            int i = this.RemoteActionCompatParcelizer - 1;
            this.RemoteActionCompatParcelizer = i;
            O o2 = oArr[i];
            boolean z = this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = false;
            if (iRemoveFirst.AudioAttributesCompatParcelizer()) {
                o2.IconCompatParcelizer(4);
            } else {
                o2.write = iRemoveFirst.RemoteActionCompatParcelizer;
                if (iRemoveFirst.IconCompatParcelizer()) {
                    o2.IconCompatParcelizer(C.BUFFER_FLAG_FIRST_SAMPLE);
                }
                if (!IconCompatParcelizer(iRemoveFirst.RemoteActionCompatParcelizer)) {
                    o2.AudioAttributesCompatParcelizer = true;
                }
                try {
                    e = (E) AudioAttributesCompatParcelizer(iRemoveFirst, o2, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) IconCompatParcelizer(e2);
                } catch (RuntimeException e3) {
                    e = (E) IconCompatParcelizer(e3);
                }
                if (e != null) {
                    synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                        this.AudioAttributesImplApi21Parcelizer = e;
                    }
                    return false;
                }
            }
            synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                if (this.AudioAttributesImplApi26Parcelizer) {
                    o2.MediaBrowserCompatCustomActionResultReceiver();
                } else if (o2.AudioAttributesCompatParcelizer) {
                    this.RatingCompat++;
                    o2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    o2.read = this.RatingCompat;
                    this.RatingCompat = 0;
                    this.MediaDescriptionCompat.addLast(o2);
                }
                write(iRemoveFirst);
            }
            return true;
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return !this.MediaMetadataCompat.isEmpty() && this.RemoteActionCompatParcelizer > 0;
    }

    private void write(I i) {
        i.write();
        I[] iArr = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i2 + 1;
        iArr[i2] = i;
    }

    private void RemoteActionCompatParcelizer(O o2) {
        o2.write();
        O[] oArr = this.write;
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        oArr[i] = o2;
    }
}

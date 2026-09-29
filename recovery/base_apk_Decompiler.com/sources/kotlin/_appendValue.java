package kotlin;

import com.google.android.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kotlin.SimpleAbstractTypeResolver;
import kotlin._appendValue;

/* JADX INFO: loaded from: classes2.dex */
abstract class _appendValue implements parseAsISO8601 {
    private final ArrayDeque<read> AudioAttributesCompatParcelizer = new ArrayDeque<>();
    private final PriorityQueue<read> AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private read RemoteActionCompatParcelizer;
    private long read;
    private final ArrayDeque<setLenient> write;

    protected abstract boolean AudioAttributesImplApi26Parcelizer();

    protected abstract isLenient MediaBrowserCompatItemReceiver();

    @Override // kotlin._generateTypeId
    public void write() {
    }

    protected abstract void write(withLocale withlocale);

    /* JADX WARN: Multi-variable type inference failed */
    public _appendValue() {
        Object[] objArr = 0;
        for (int i = 0; i < 10; i++) {
            this.AudioAttributesCompatParcelizer.add(new read(objArr == true ? 1 : 0));
        }
        this.write = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.write.add(new RemoteActionCompatParcelizer(new SimpleAbstractTypeResolver.IconCompatParcelizer() { // from class: o.writeLazyInteger
                @Override // o.SimpleAbstractTypeResolver.IconCompatParcelizer
                public final void AudioAttributesCompatParcelizer(SimpleAbstractTypeResolver simpleAbstractTypeResolver) {
                    this.IconCompatParcelizer.IconCompatParcelizer((_appendValue.RemoteActionCompatParcelizer) simpleAbstractTypeResolver);
                }
            }));
        }
        this.AudioAttributesImplApi26Parcelizer = new PriorityQueue<>();
        this.read = C.TIME_UNSET;
    }

    @Override // kotlin._generateTypeId
    public final void read(long j) {
        this.read = j;
    }

    @Override // kotlin.parseAsISO8601
    public void write(long j) {
        this.IconCompatParcelizer = j;
    }

    @Override // kotlin._generateTypeId
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public withLocale read() throws parseAsRFC1123 {
        buildTypeSerializer.write(this.RemoteActionCompatParcelizer == null);
        if (this.AudioAttributesCompatParcelizer.isEmpty()) {
            return null;
        }
        read readVarPollFirst = this.AudioAttributesCompatParcelizer.pollFirst();
        this.RemoteActionCompatParcelizer = readVarPollFirst;
        return readVarPollFirst;
    }

    @Override // kotlin._generateTypeId
    public void RemoteActionCompatParcelizer(withLocale withlocale) throws parseAsRFC1123 {
        buildTypeSerializer.IconCompatParcelizer(withlocale == this.RemoteActionCompatParcelizer);
        read readVar = (read) withlocale;
        if (this.read != C.TIME_UNSET && readVar.RemoteActionCompatParcelizer < this.read) {
            write(readVar);
        } else {
            long j = this.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesImplBaseParcelizer = 1 + j;
            readVar.AudioAttributesImplApi26Parcelizer = j;
            this.AudioAttributesImplApi26Parcelizer.add(readVar);
        }
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // kotlin._generateTypeId
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public setLenient IconCompatParcelizer() throws parseAsRFC1123 {
        if (this.write.isEmpty()) {
            return null;
        }
        while (!this.AudioAttributesImplApi26Parcelizer.isEmpty() && ((read) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.peek())).RemoteActionCompatParcelizer <= this.IconCompatParcelizer) {
            read readVar = (read) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.poll());
            if (readVar.AudioAttributesCompatParcelizer()) {
                setLenient setlenient = (setLenient) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write.pollFirst());
                setlenient.IconCompatParcelizer(4);
                write(readVar);
                return setlenient;
            }
            write((withLocale) readVar);
            if (AudioAttributesImplApi26Parcelizer()) {
                isLenient islenientMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                setLenient setlenient2 = (setLenient) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write.pollFirst());
                setlenient2.read(readVar.RemoteActionCompatParcelizer, islenientMediaBrowserCompatItemReceiver, Long.MAX_VALUE);
                write(readVar);
                return setlenient2;
            }
            write(readVar);
        }
        return null;
    }

    private void write(read readVar) {
        readVar.write();
        this.AudioAttributesCompatParcelizer.add(readVar);
    }

    protected final void IconCompatParcelizer(setLenient setlenient) {
        setlenient.write();
        this.write.add(setlenient);
    }

    @Override // kotlin._generateTypeId
    public void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = 0L;
        this.IconCompatParcelizer = 0L;
        while (!this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
            write((read) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.poll()));
        }
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            write(readVar);
            this.RemoteActionCompatParcelizer = null;
        }
    }

    protected final setLenient AudioAttributesImplApi21Parcelizer() {
        return this.write.pollFirst();
    }

    protected final long RatingCompat() {
        return this.IconCompatParcelizer;
    }

    static final class read extends withLocale implements Comparable<read> {
        private long AudioAttributesImplApi26Parcelizer;

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int compareTo(read readVar) {
            if (AudioAttributesCompatParcelizer() != readVar.AudioAttributesCompatParcelizer()) {
                return AudioAttributesCompatParcelizer() ? 1 : -1;
            }
            long j = this.RemoteActionCompatParcelizer - readVar.RemoteActionCompatParcelizer;
            if (j == 0) {
                j = this.AudioAttributesImplApi26Parcelizer - readVar.AudioAttributesImplApi26Parcelizer;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    static final class RemoteActionCompatParcelizer extends setLenient {
        private SimpleAbstractTypeResolver.IconCompatParcelizer<RemoteActionCompatParcelizer> IconCompatParcelizer;

        public RemoteActionCompatParcelizer(SimpleAbstractTypeResolver.IconCompatParcelizer<RemoteActionCompatParcelizer> iconCompatParcelizer) {
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        @Override // kotlin.SimpleAbstractTypeResolver
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }
    }
}

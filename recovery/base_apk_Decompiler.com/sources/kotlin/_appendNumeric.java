package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0019B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d"}, d2 = {"Lo/_appendNumeric;", "T", "Lo/constructParser;", "Lo/toDecimalString;", "p0", "Lo/quoteAsUTF8;", "p1", "<init>", "(Ljava/lang/Object;Lo/quoteAsUTF8;)V", "Lo/reportWeirdUCS4;", "", "RemoteActionCompatParcelizer", "(Lo/reportWeirdUCS4;)V", "p2", "IconCompatParcelizer", "(Lo/reportWeirdUCS4;Lo/reportWeirdUCS4;Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/quoteAsUTF8;", "n_", "()Lo/quoteAsUTF8;", "read", "()Ljava/lang/Object;", "write", "(Ljava/lang/Object;)V", "Lo/_appendNumeric$write;", "Lo/_appendNumeric$write;", "()Lo/reportWeirdUCS4;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class _appendNumeric<T> extends constructParser implements toDecimalString<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final quoteAsUTF8<T> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private write<T> IconCompatParcelizer;

    public _appendNumeric(T t, quoteAsUTF8<T> quoteasutf8) {
        this.RemoteActionCompatParcelizer = quoteasutf8;
        parseDigitsRecursive parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver = toChars3.MediaBrowserCompatSearchResultReceiver();
        write<T> writeVar = new write<>(parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver.getIconCompatParcelizer(), t);
        if (!(parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver instanceof JavaDoubleBitsFromCharArray)) {
            writeVar.RemoteActionCompatParcelizer(new write(toDecimal.RemoteActionCompatParcelizer(1), t));
        }
        this.IconCompatParcelizer = writeVar;
    }

    @Override // kotlin.toDecimalString
    public quoteAsUTF8<T> n_() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.InputAccessor, kotlin.parseDouble
    /* JADX INFO: renamed from: read */
    public T getRemoteActionCompatParcelizer() {
        return (T) ((write) toChars3.read(this.IconCompatParcelizer, this)).read();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InputAccessor
    public void write(T t) {
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        write writeVar = (write) toChars3.IconCompatParcelizer(this.IconCompatParcelizer);
        if (n_().IconCompatParcelizer(writeVar.read(), t)) {
            return;
        }
        write<T> writeVar2 = this.IconCompatParcelizer;
        _appendNumeric<T> _appendnumeric = this;
        write writeVar3 = writeVar;
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
            ((write) toChars3.IconCompatParcelizer(writeVar2, _appendnumeric, parsedigitsrecursiveAudioAttributesCompatParcelizer, writeVar3)).IconCompatParcelizer(t);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, _appendnumeric);
    }

    @Override // kotlin.tryMatch
    /* JADX INFO: renamed from: write */
    public reportWeirdUCS4 getRemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.tryMatch
    public void RemoteActionCompatParcelizer(reportWeirdUCS4 p0) {
        toMagicModuleMetaRepoModel.read(p0, "");
        this.IconCompatParcelizer = (write) p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.tryMatch
    public reportWeirdUCS4 IconCompatParcelizer(reportWeirdUCS4 p0, reportWeirdUCS4 p1, reportWeirdUCS4 p2) {
        Object obj;
        toMagicModuleMetaRepoModel.read(p0, "");
        write writeVar = (write) p0;
        toMagicModuleMetaRepoModel.read(p1, "");
        write writeVar2 = (write) p1;
        toMagicModuleMetaRepoModel.read(p2, "");
        write writeVar3 = (write) p2;
        if (n_().IconCompatParcelizer(writeVar2.read(), writeVar3.read())) {
            return p1;
        }
        Object obj2 = n_().read(writeVar.read(), writeVar2.read(), writeVar3.read());
        if (obj2 != null) {
            write writeVarRemoteActionCompatParcelizer = writeVar3.RemoteActionCompatParcelizer(writeVar3.getIconCompatParcelizer());
            writeVarRemoteActionCompatParcelizer.IconCompatParcelizer(obj2);
            obj = writeVarRemoteActionCompatParcelizer;
        } else {
            obj = null;
        }
        return (reportWeirdUCS4) obj;
    }

    public String toString() {
        write writeVar = (write) toChars3.IconCompatParcelizer(this.IconCompatParcelizer);
        StringBuilder sb = new StringBuilder("MutableState(value=");
        sb.append(writeVar.read());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\f\u001a\u00028\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u000e\u0010\u0013"}, d2 = {"Lo/_appendNumeric$write;", "T", "Lo/reportWeirdUCS4;", "", "Lo/SnapshotId;", "p0", "p1", "<init>", "(JLjava/lang/Object;)V", "", "AudioAttributesCompatParcelizer", "(Lo/reportWeirdUCS4;)V", "write", "()Lo/_appendNumeric$write;", "IconCompatParcelizer", "(J)Lo/_appendNumeric$write;", "Ljava/lang/Object;", "read", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write<T> extends reportWeirdUCS4 {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private T write;

        public write(long j, T t) {
            super(j);
            this.write = t;
        }

        @Override // kotlin.reportWeirdUCS4
        public final void AudioAttributesCompatParcelizer(reportWeirdUCS4 p0) {
            toMagicModuleMetaRepoModel.read(p0, "");
            this.write = ((write) p0).write;
        }

        @Override // kotlin.reportWeirdUCS4
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final write<T> RemoteActionCompatParcelizer() {
            return new write<>(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer(), this.write);
        }

        @Override // kotlin.reportWeirdUCS4
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final write<T> RemoteActionCompatParcelizer(long p0) {
            return new write<>(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer(), this.write);
        }

        public final void IconCompatParcelizer(T t) {
            this.write = t;
        }

        public final T read() {
            return this.write;
        }
    }
}

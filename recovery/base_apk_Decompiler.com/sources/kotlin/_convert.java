package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0018\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/_convert;", "Lo/constructParser;", "Lo/nextTokenToRead;", "Lo/toDecimalString;", "", "p0", "<init>", "(F)V", "Lo/reportWeirdUCS4;", "", "RemoteActionCompatParcelizer", "(Lo/reportWeirdUCS4;)V", "p1", "p2", "IconCompatParcelizer", "(Lo/reportWeirdUCS4;Lo/reportWeirdUCS4;Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;", "", "toString", "()Ljava/lang/String;", "Lo/_convert$read;", "AudioAttributesCompatParcelizer", "Lo/_convert$read;", "write", "()Lo/reportWeirdUCS4;", "()F", "Lo/quoteAsUTF8;", "n_", "()Lo/quoteAsUTF8;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class _convert extends constructParser implements nextTokenToRead, toDecimalString<Float> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private read write;

    public _convert(float f) {
        parseDigitsRecursive parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver = toChars3.MediaBrowserCompatSearchResultReceiver();
        read readVar = new read(parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver.getIconCompatParcelizer(), f);
        if (!(parsedigitsrecursiveMediaBrowserCompatSearchResultReceiver instanceof JavaDoubleBitsFromCharArray)) {
            readVar.RemoteActionCompatParcelizer(new read(toDecimal.RemoteActionCompatParcelizer(1), f));
        }
        this.write = readVar;
    }

    @Override // kotlin.tryMatch
    public reportWeirdUCS4 write() {
        return this.write;
    }

    @Override // kotlin.nextTokenToRead, kotlin._filterContext
    public float AudioAttributesCompatParcelizer() {
        return ((read) toChars3.read(this.write, this)).getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.nextTokenToRead
    public void write(float f) {
        parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer;
        read readVar = (read) toChars3.IconCompatParcelizer(this.write);
        if (readVar.getAudioAttributesCompatParcelizer() == f) {
            return;
        }
        read readVar2 = this.write;
        _convert _convertVar = this;
        read readVar3 = readVar;
        synchronized (toChars3.MediaBrowserCompatMediaItem()) {
            parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
            ((read) toChars3.IconCompatParcelizer(readVar2, _convertVar, parsedigitsrecursiveAudioAttributesCompatParcelizer, readVar3)).AudioAttributesCompatParcelizer(f);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        toChars3.AudioAttributesCompatParcelizer(parsedigitsrecursiveAudioAttributesCompatParcelizer, _convertVar);
    }

    @Override // kotlin.toDecimalString
    public quoteAsUTF8<Float> n_() {
        return _qbuf.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.tryMatch
    public void RemoteActionCompatParcelizer(reportWeirdUCS4 p0) {
        toMagicModuleMetaRepoModel.read(p0, "");
        this.write = (read) p0;
    }

    @Override // kotlin.tryMatch
    public reportWeirdUCS4 IconCompatParcelizer(reportWeirdUCS4 p0, reportWeirdUCS4 p1, reportWeirdUCS4 p2) {
        toMagicModuleMetaRepoModel.read(p1, "");
        toMagicModuleMetaRepoModel.read(p2, "");
        if (((read) p1).getAudioAttributesCompatParcelizer() == ((read) p2).getAudioAttributesCompatParcelizer()) {
            return p1;
        }
        return null;
    }

    public String toString() {
        read readVar = (read) toChars3.IconCompatParcelizer(this.write);
        StringBuilder sb = new StringBuilder("MutableFloatState(value=");
        sb.append(readVar.getAudioAttributesCompatParcelizer());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000eR\"\u0010\n\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\n\u0010\u0012"}, d2 = {"Lo/_convert$read;", "Lo/reportWeirdUCS4;", "", "Lo/SnapshotId;", "p0", "", "p1", "<init>", "(JF)V", "", "AudioAttributesCompatParcelizer", "(Lo/reportWeirdUCS4;)V", "RemoteActionCompatParcelizer", "()Lo/reportWeirdUCS4;", "(J)Lo/reportWeirdUCS4;", "F", "read", "()F", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read extends reportWeirdUCS4 {
        private float AudioAttributesCompatParcelizer;

        public read(long j, float f) {
            super(j);
            this.AudioAttributesCompatParcelizer = f;
        }

        public final void AudioAttributesCompatParcelizer(float f) {
            this.AudioAttributesCompatParcelizer = f;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final float getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.reportWeirdUCS4
        public final void AudioAttributesCompatParcelizer(reportWeirdUCS4 p0) {
            toMagicModuleMetaRepoModel.read(p0, "");
            this.AudioAttributesCompatParcelizer = ((read) p0).AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.reportWeirdUCS4
        public final reportWeirdUCS4 RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer());
        }

        @Override // kotlin.reportWeirdUCS4
        public final reportWeirdUCS4 RemoteActionCompatParcelizer(long p0) {
            return new read(p0, this.AudioAttributesCompatParcelizer);
        }
    }
}

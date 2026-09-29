package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000fR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\r\u0010\u0013R\"\u0010\r\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0015\u0010\u0018R\"\u0010\u0015\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/checkUTF16;", "T", "Lo/reportWeirdUCS4;", "", "Lo/SnapshotId;", "p0", "Lo/AbstractFloatValueParser;", "p1", "<init>", "(JLo/AbstractFloatValueParser;)V", "", "AudioAttributesCompatParcelizer", "(Lo/reportWeirdUCS4;)V", "RemoteActionCompatParcelizer", "()Lo/reportWeirdUCS4;", "(J)Lo/reportWeirdUCS4;", "Lo/AbstractFloatValueParser;", "read", "()Lo/AbstractFloatValueParser;", "(Lo/AbstractFloatValueParser;)V", "", "write", "I", "()I", "(I)V", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class checkUTF16<T> extends reportWeirdUCS4 {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private AbstractFloatValueParser<? extends T> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public checkUTF16(long j, AbstractFloatValueParser<? extends T> abstractFloatValueParser) {
        super(j);
        this.read = abstractFloatValueParser;
    }

    public final void RemoteActionCompatParcelizer(AbstractFloatValueParser<? extends T> abstractFloatValueParser) {
        this.read = abstractFloatValueParser;
    }

    public final AbstractFloatValueParser<T> read() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void write(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final void IconCompatParcelizer(int i) {
        this.write = i;
    }

    @Override // kotlin.reportWeirdUCS4
    public final void AudioAttributesCompatParcelizer(reportWeirdUCS4 p0) {
        synchronized (flog10threeQuartersPow2.read) {
            toMagicModuleMetaRepoModel.read(p0, "");
            this.read = ((checkUTF16) p0).read;
            this.RemoteActionCompatParcelizer = ((checkUTF16) p0).RemoteActionCompatParcelizer;
            this.write = ((checkUTF16) p0).write;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @Override // kotlin.reportWeirdUCS4
    public final reportWeirdUCS4 RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer());
    }

    @Override // kotlin.reportWeirdUCS4
    public final reportWeirdUCS4 RemoteActionCompatParcelizer(long p0) {
        return new checkUTF16(p0, this.read);
    }
}

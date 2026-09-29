package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\rR&\u0010\u0013\u001a\u00060\u0002j\u0002`\u00038\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006R$\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u000b\u0010\n"}, d2 = {"Lo/reportWeirdUCS4;", "", "", "Lo/SnapshotId;", "p0", "<init>", "(J)V", "()V", "", "AudioAttributesCompatParcelizer", "(Lo/reportWeirdUCS4;)V", "RemoteActionCompatParcelizer", "()Lo/reportWeirdUCS4;", "(J)Lo/reportWeirdUCS4;", "read", "J", "AudioAttributesImplBaseParcelizer", "()J", "write", "IconCompatParcelizer", "Lo/reportWeirdUCS4;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class reportWeirdUCS4 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private reportWeirdUCS4 write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    public abstract void AudioAttributesCompatParcelizer(reportWeirdUCS4 p0);

    public abstract reportWeirdUCS4 RemoteActionCompatParcelizer();

    public reportWeirdUCS4(long j) {
        this.IconCompatParcelizer = j;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write(long j) {
        this.IconCompatParcelizer = j;
    }

    public reportWeirdUCS4() {
        this(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer());
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final reportWeirdUCS4 getWrite() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(reportWeirdUCS4 reportweirducs4) {
        this.write = reportweirducs4;
    }

    public reportWeirdUCS4 RemoteActionCompatParcelizer(long p0) {
        reportWeirdUCS4 reportweirducs4RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        reportweirducs4RemoteActionCompatParcelizer.IconCompatParcelizer = p0;
        return reportweirducs4RemoteActionCompatParcelizer;
    }
}

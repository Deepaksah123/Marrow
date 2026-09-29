package kotlin;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a"}, d2 = {"Lo/negativeInfinity;", "T", "", "Lo/AbstractJavaFloatingPointBitsFromByteArray;", "Lo/parseFloatingPointLiteral;", "p0", "", "p1", "<init>", "(Lo/parseFloatingPointLiteral;I)V", "previous", "()Ljava/lang/Object;", "next", "", "AudioAttributesImplApi26Parcelizer", "()V", "MediaBrowserCompatItemReceiver", "add", "(Ljava/lang/Object;)V", "remove", "set", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "Lo/parseFloatingPointLiteral;", "RemoteActionCompatParcelizer", "I", "write", "Lo/charAt;", "Lo/charAt;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class negativeInfinity<T> extends AbstractJavaFloatingPointBitsFromByteArray<T> implements ListIterator<T>, getOffline {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final parseFloatingPointLiteral<T> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private charAt<? extends T> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read;

    public negativeInfinity(parseFloatingPointLiteral<T> parsefloatingpointliteral, int i) {
        super(i, parsefloatingpointliteral.size());
        this.RemoteActionCompatParcelizer = parsefloatingpointliteral;
        this.write = parsefloatingpointliteral.read();
        this.read = -1;
        MediaBrowserCompatItemReceiver();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        IconCompatParcelizer();
        read();
        this.read = write() - 1;
        charAt<? extends T> charat = this.AudioAttributesCompatParcelizer;
        if (charat == null) {
            Object[] objArrMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
            read(write() - 1);
            return (T) objArrMediaBrowserCompatItemReceiver[write()];
        }
        if (write() > charat.getIconCompatParcelizer()) {
            Object[] objArrMediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
            read(write() - 1);
            return (T) objArrMediaBrowserCompatItemReceiver2[write() - charat.getIconCompatParcelizer()];
        }
        read(write() - 1);
        return charat.previous();
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator, java.util.Iterator
    public final T next() {
        IconCompatParcelizer();
        AudioAttributesCompatParcelizer();
        this.read = write();
        charAt<? extends T> charat = this.AudioAttributesCompatParcelizer;
        if (charat == null) {
            Object[] objArrMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
            int iWrite = write();
            read(iWrite + 1);
            return (T) objArrMediaBrowserCompatItemReceiver[iWrite];
        }
        if (charat.hasNext()) {
            read(write() + 1);
            return charat.next();
        }
        Object[] objArrMediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
        int iWrite2 = write();
        read(iWrite2 + 1);
        return (T) objArrMediaBrowserCompatItemReceiver2[iWrite2 - charat.getIconCompatParcelizer()];
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.size());
        this.write = this.RemoteActionCompatParcelizer.read();
        this.read = -1;
        MediaBrowserCompatItemReceiver();
    }

    private final void MediaBrowserCompatItemReceiver() {
        Object[] objArrRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
        if (objArrRemoteActionCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = null;
            return;
        }
        int iIconCompatParcelizer = lookupHex.IconCompatParcelizer(this.RemoteActionCompatParcelizer.size());
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(write(), iIconCompatParcelizer);
        int iAudioAttributesCompatParcelizer = (this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer() / 5) + 1;
        charAt<? extends T> charat = this.AudioAttributesCompatParcelizer;
        if (charat == null) {
            this.AudioAttributesCompatParcelizer = new charAt<>(objArrRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, iIconCompatParcelizer, iAudioAttributesCompatParcelizer);
        } else {
            toMagicModuleMetaRepoModel.write(charat);
            charat.read(objArrRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, iIconCompatParcelizer, iAudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator
    public final void add(T p0) {
        IconCompatParcelizer();
        this.RemoteActionCompatParcelizer.add(write(), p0);
        read(write() + 1);
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        IconCompatParcelizer();
        AudioAttributesImplApi21Parcelizer();
        this.RemoteActionCompatParcelizer.remove(this.read);
        if (this.read < write()) {
            read(this.read);
        }
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.AbstractJavaFloatingPointBitsFromByteArray, java.util.ListIterator
    public final void set(T p0) {
        IconCompatParcelizer();
        AudioAttributesImplApi21Parcelizer();
        this.RemoteActionCompatParcelizer.set(this.read, p0);
        this.write = this.RemoteActionCompatParcelizer.read();
        MediaBrowserCompatItemReceiver();
    }

    private final void IconCompatParcelizer() {
        if (this.write != this.RemoteActionCompatParcelizer.read()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (this.read == -1) {
            throw new IllegalStateException();
        }
    }
}

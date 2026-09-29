package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u000e"}, d2 = {"Lo/_findCustomMapDeserializer;", "", "Lo/ReadableObjectIdReferring;", "p0", "p1", "Lo/_handleSingleArgumentCreator;", "p2", "<init>", "(JJILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", "RemoteActionCompatParcelizer", "()J", "write", "IconCompatParcelizer", "read", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findCustomMapDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    private _findCustomMapDeserializer(long j, long j2, int i) {
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
        this.IconCompatParcelizer = i;
        if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(j) == 0) {
            withStackTrace.read("width cannot be TextUnit.Unspecified");
        }
        if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(j2) == 0) {
            withStackTrace.read("height cannot be TextUnit.Unspecified");
        }
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _findCustomMapDeserializer)) {
            return false;
        }
        _findCustomMapDeserializer _findcustommapdeserializer = (_findCustomMapDeserializer) p0;
        return ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.write, _findcustommapdeserializer.write) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, _findcustommapdeserializer.RemoteActionCompatParcelizer) && _handleSingleArgumentCreator.write(this.IconCompatParcelizer, _findcustommapdeserializer.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.write) * 31) + ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + _handleSingleArgumentCreator.write(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.write));
        sb.append(", height=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", placeholderVerticalAlign=");
        sb.append((Object) _handleSingleArgumentCreator.read(this.IconCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ _findCustomMapDeserializer(long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, i);
    }
}

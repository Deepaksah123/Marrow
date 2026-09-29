package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/CollectionDeserializerCollectionReferring;", "", "", "p0", "p1", "Lo/_deserializeAltString;", "p2", "p3", "p4", "", "p5", "<init>", "(ZZLo/_deserializeAltString;ZZLjava/lang/String;)V", "(ZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "Z", "RemoteActionCompatParcelizer", "()Z", "read", "IconCompatParcelizer", "Lo/_deserializeAltString;", "()Lo/_deserializeAltString;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectionDeserializerCollectionReferring {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _deserializeAltString AudioAttributesCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public CollectionDeserializerCollectionReferring(boolean z, boolean z2, _deserializeAltString _deserializealtstring, boolean z3, boolean z4, String str) {
        this.write = z;
        this.read = z2;
        this.AudioAttributesCompatParcelizer = _deserializealtstring;
        this.IconCompatParcelizer = z3;
        this.RemoteActionCompatParcelizer = z4;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public /* synthetic */ CollectionDeserializerCollectionReferring(boolean z, boolean z2, _deserializeAltString _deserializealtstring, boolean z3, boolean z4, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? _deserializeAltString.read : _deserializealtstring, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _deserializeAltString getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public /* synthetic */ CollectionDeserializerCollectionReferring(boolean z, boolean z2, boolean z3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public CollectionDeserializerCollectionReferring(boolean z, boolean z2, boolean z3) {
        this(z, z2, _deserializeAltString.read, z3, true, null, 32, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CollectionDeserializerCollectionReferring)) {
            return false;
        }
        CollectionDeserializerCollectionReferring collectionDeserializerCollectionReferring = (CollectionDeserializerCollectionReferring) p0;
        return this.write == collectionDeserializerCollectionReferring.write && this.read == collectionDeserializerCollectionReferring.read && this.AudioAttributesCompatParcelizer == collectionDeserializerCollectionReferring.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == collectionDeserializerCollectionReferring.IconCompatParcelizer && this.RemoteActionCompatParcelizer == collectionDeserializerCollectionReferring.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.write);
        int iHashCode2 = Boolean.hashCode(this.read);
        return (((((((iHashCode * 31) + iHashCode2) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public CollectionDeserializerCollectionReferring() {
        this(false, false, null, false, false, null, 63, null);
    }
}

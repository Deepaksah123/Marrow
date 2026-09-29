package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u001cJ\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u0016\u0010\u001eJ\u0015\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b$\u0010 J\u001d\u0010\u0018\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010&J!\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010'J\u001a\u0010(\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010$\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b\u0014\u00100R\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b\u001b\u00102R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b\u000b\u00104R\u001a\u0010\u0018\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b\u0016\u00106R\u001a\u0010\u0016\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b$\u00106R\u0011\u0010\u0014\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u00107R\u0011\u0010\u000b\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0013\u00107R\u0011\u0010\u001b\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0018\u00107R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b\u0015\u0010:R\u0011\u0010\u0015\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010+"}, d2 = {"Lo/deserializeFromNumber;", "", "Lo/deserializeFromBoolean;", "p0", "Lo/_checkImplicitlyNamedConstructors;", "p1", "Lo/getKey;", "p2", "<init>", "(Lo/deserializeFromBoolean;Lo/_checkImplicitlyNamedConstructors;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "AudioAttributesImplApi26Parcelizer", "(I)I", "", "write", "(IZ)I", "", "AudioAttributesImplBaseParcelizer", "(I)F", "read", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "(F)I", "RemoteActionCompatParcelizer", "(IZ)F", "Lo/_properties;", "AudioAttributesImplApi21Parcelizer", "(I)Lo/_properties;", "Lo/getReferencedType;", "(J)I", "Lo/WritableTypeIdInclusion;", "(I)Lo/WritableTypeIdInclusion;", "Lo/findProperty;", "MediaBrowserCompatMediaItem", "(I)J", "IconCompatParcelizer", "Lo/removeSoftRefsClearedByGc;", "(II)Lo/removeSoftRefsClearedByGc;", "(Lo/deserializeFromBoolean;J)Lo/deserializeFromNumber;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/deserializeFromBoolean;", "()Lo/deserializeFromBoolean;", "Lo/_checkImplicitlyNamedConstructors;", "()Lo/_checkImplicitlyNamedConstructors;", "J", "()J", "F", "()F", "()Z", "", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializeFromNumber {
    public static final int write = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final deserializeFromBoolean IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<WritableTypeIdInclusion> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _checkImplicitlyNamedConstructors write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    private deserializeFromNumber(deserializeFromBoolean deserializefromboolean, _checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, long j) {
        this.IconCompatParcelizer = deserializefromboolean;
        this.write = _checkimplicitlynamedconstructors;
        this.read = j;
        this.RemoteActionCompatParcelizer = _checkimplicitlynamedconstructors.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = _checkimplicitlynamedconstructors.write();
        this.AudioAttributesImplBaseParcelizer = _checkimplicitlynamedconstructors.AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final deserializeFromBoolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final _checkImplicitlyNamedConstructors getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean write() {
        return this.write.getRemoteActionCompatParcelizer() || ((float) ((int) this.read)) < this.write.getAudioAttributesImplApi21Parcelizer();
    }

    public final boolean read() {
        return ((float) ((int) (this.read >> 32))) < this.write.getIconCompatParcelizer();
    }

    public final boolean RemoteActionCompatParcelizer() {
        return read() || write();
    }

    public final List<WritableTypeIdInclusion> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.write.getAudioAttributesImplBaseParcelizer();
    }

    public final int AudioAttributesImplApi26Parcelizer(int p0) {
        return this.write.MediaBrowserCompatItemReceiver(p0);
    }

    public static /* synthetic */ int write$default(deserializeFromNumber deserializefromnumber, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return deserializefromnumber.write(i, z);
    }

    public final int write(int p0, boolean p1) {
        return this.write.IconCompatParcelizer(p0, p1);
    }

    public final float AudioAttributesImplBaseParcelizer(int p0) {
        return this.write.MediaBrowserCompatCustomActionResultReceiver(p0);
    }

    public final float read(int p0) {
        return this.write.RemoteActionCompatParcelizer(p0);
    }

    public final float MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return this.write.AudioAttributesImplApi21Parcelizer(p0);
    }

    public final float MediaBrowserCompatItemReceiver(int p0) {
        return this.write.AudioAttributesImplBaseParcelizer(p0);
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return this.write.write(p0);
    }

    public final int read(float p0) {
        return this.write.RemoteActionCompatParcelizer(p0);
    }

    public final float RemoteActionCompatParcelizer(int p0, boolean p1) {
        return this.write.RemoteActionCompatParcelizer(p0, p1);
    }

    public final _properties AudioAttributesImplApi21Parcelizer(int p0) {
        return this.write.MediaBrowserCompatMediaItem(p0);
    }

    public final _properties RemoteActionCompatParcelizer(int p0) {
        return this.write.AudioAttributesCompatParcelizer(p0);
    }

    public final int AudioAttributesCompatParcelizer(long p0) {
        return this.write.write(p0);
    }

    public final WritableTypeIdInclusion write(int p0) {
        return this.write.read(p0);
    }

    public final long MediaBrowserCompatMediaItem(int p0) {
        return this.write.MediaMetadataCompat(p0);
    }

    public final WritableTypeIdInclusion IconCompatParcelizer(int p0) {
        return this.write.IconCompatParcelizer(p0);
    }

    public final removeSoftRefsClearedByGc RemoteActionCompatParcelizer(int p0, int p1) {
        return this.write.read(p0, p1);
    }

    public static /* synthetic */ deserializeFromNumber read$default(deserializeFromNumber deserializefromnumber, deserializeFromBoolean deserializefromboolean, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            deserializefromboolean = deserializefromnumber.IconCompatParcelizer;
        }
        if ((i & 2) != 0) {
            j = deserializefromnumber.read;
        }
        return deserializefromnumber.read(deserializefromboolean, j);
    }

    public final deserializeFromNumber read(deserializeFromBoolean p0, long p1) {
        return new deserializeFromNumber(p0, this.write, p1, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof deserializeFromNumber)) {
            return false;
        }
        deserializeFromNumber deserializefromnumber = (deserializeFromNumber) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, deserializefromnumber.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, deserializefromnumber.write) && getKey.AudioAttributesCompatParcelizer(this.read, deserializefromnumber.read) && this.RemoteActionCompatParcelizer == deserializefromnumber.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == deserializefromnumber.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, deserializefromnumber.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iIconCompatParcelizer = getKey.IconCompatParcelizer(this.read);
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iIconCompatParcelizer) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", multiParagraph=");
        sb.append(this.write);
        sb.append(", size=");
        sb.append((Object) getKey.AudioAttributesImplBaseParcelizer(this.read));
        sb.append(", firstBaseline=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", lastBaseline=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", placeholderRects=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ deserializeFromNumber(deserializeFromBoolean deserializefromboolean, _checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(deserializefromboolean, _checkimplicitlynamedconstructors, j);
    }
}

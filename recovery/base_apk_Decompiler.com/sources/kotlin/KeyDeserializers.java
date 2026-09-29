package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000  2\u00020\u0001:\u0001 BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0015R\u001a\u0010\"\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001a\u0010#\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b\"\u0010)"}, d2 = {"Lo/KeyDeserializers;", "", "", "p0", "Lo/_set;", "p1", "p2", "Lo/getPropertyName;", "p3", "Lo/ResolvableDeserializer;", "p4", "Lo/getManagedReferenceName;", "p5", "Lo/canCreateFromBoolean;", "p6", "<init>", "(ZIZIILo/getManagedReferenceName;Lo/canCreateFromBoolean;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "AudioAttributesImplBaseParcelizer", "()Z", "IconCompatParcelizer", "write", "I", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/getManagedReferenceName;", "()Lo/getManagedReferenceName;", "Lo/canCreateFromBoolean;", "()Lo/canCreateFromBoolean;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyDeserializers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getManagedReferenceName MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final canCreateFromBoolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyDeserializers IconCompatParcelizer = new KeyDeserializers(false, 0, false, 0, 0, null, null, 127, null);

    private KeyDeserializers(boolean z, int i, boolean z2, int i2, int i3, getManagedReferenceName getmanagedreferencename, canCreateFromBoolean cancreatefromboolean) {
        this.IconCompatParcelizer = z;
        this.read = i;
        this.RemoteActionCompatParcelizer = z2;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = getmanagedreferencename;
        this.AudioAttributesImplApi21Parcelizer = cancreatefromboolean;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ KeyDeserializers(boolean z, int i, boolean z2, int i2, int i3, getManagedReferenceName getmanagedreferencename, canCreateFromBoolean cancreatefromboolean, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? _set.INSTANCE.read() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? getPropertyName.INSTANCE.MediaBrowserCompatCustomActionResultReceiver() : i2, (i4 & 16) != 0 ? ResolvableDeserializer.INSTANCE.IconCompatParcelizer() : i3, (i4 & 32) != 0 ? null : getmanagedreferencename, (i4 & 64) != 0 ? canCreateFromBoolean.INSTANCE.write() : cancreatefromboolean, null);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getManagedReferenceName getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final canCreateFromBoolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: o.KeyDeserializers$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/KeyDeserializers$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/KeyDeserializers;", "IconCompatParcelizer", "Lo/KeyDeserializers;", "read", "()Lo/KeyDeserializers;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KeyDeserializers read() {
            return KeyDeserializers.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof KeyDeserializers)) {
            return false;
        }
        KeyDeserializers keyDeserializers = (KeyDeserializers) p0;
        return this.IconCompatParcelizer == keyDeserializers.IconCompatParcelizer && _set.read(this.read, keyDeserializers.read) && this.RemoteActionCompatParcelizer == keyDeserializers.RemoteActionCompatParcelizer && getPropertyName.AudioAttributesCompatParcelizer(this.write, keyDeserializers.write) && ResolvableDeserializer.write(this.AudioAttributesCompatParcelizer, keyDeserializers.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, keyDeserializers.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, keyDeserializers.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
        int iIconCompatParcelizer = _set.IconCompatParcelizer(this.read);
        int iHashCode2 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer = getPropertyName.AudioAttributesCompatParcelizer(this.write);
        int iRemoteActionCompatParcelizer = ResolvableDeserializer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        getManagedReferenceName getmanagedreferencename = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((iHashCode * 31) + iIconCompatParcelizer) * 31) + iHashCode2) * 31) + iAudioAttributesCompatParcelizer) * 31) + iRemoteActionCompatParcelizer) * 31) + (getmanagedreferencename != null ? getmanagedreferencename.hashCode() : 0)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", capitalization=");
        sb.append((Object) _set.RemoteActionCompatParcelizer(this.read));
        sb.append(", autoCorrect=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", keyboardType=");
        sb.append((Object) getPropertyName.RemoteActionCompatParcelizer(this.write));
        sb.append(", imeAction=");
        sb.append((Object) ResolvableDeserializer.write(this.AudioAttributesCompatParcelizer));
        sb.append(", platformImeOptions=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", hintLocales=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ KeyDeserializers(boolean z, int i, boolean z2, int i2, int i3, getManagedReferenceName getmanagedreferencename, canCreateFromBoolean cancreatefromboolean, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, i, z2, i2, i3, getmanagedreferencename, cancreatefromboolean);
    }
}

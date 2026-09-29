package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010%\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b!\u0010$"}, d2 = {"Lo/findValueInstantiator;", "Lo/findViews;", "", "p0", "p1", "Lo/findAutoDetectVisibility;", "p2", "Lo/findCreatorBinding;", "p3", "Lo/setCurrentLength;", "p4", "<init>", "(FFIILo/setCurrentLength;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "F", "AudioAttributesImplBaseParcelizer", "()F", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "I", "write", "AudioAttributesImplApi26Parcelizer", "Lo/setCurrentLength;", "()Lo/setCurrentLength;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findValueInstantiator extends findViews {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setCurrentLength read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int read = 8;
    private static final int IconCompatParcelizer = findAutoDetectVisibility.INSTANCE.read();
    private static final int RemoteActionCompatParcelizer = findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer();

    private findValueInstantiator(float f, float f2, int i, int i2, setCurrentLength setcurrentlength) {
        super(null);
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.write = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.read = setcurrentlength;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ findValueInstantiator(float f, float f2, int i, int i2, setCurrentLength setcurrentlength, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? IconCompatParcelizer : i, (i3 & 8) != 0 ? RemoteActionCompatParcelizer : i2, (i3 & 16) != 0 ? null : setcurrentlength, null);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setCurrentLength getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: o.findValueInstantiator$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lo/findValueInstantiator$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/findAutoDetectVisibility;", "IconCompatParcelizer", "I", "write", "()I", "AudioAttributesCompatParcelizer", "Lo/findCreatorBinding;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int write() {
            return findValueInstantiator.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof findValueInstantiator)) {
            return false;
        }
        findValueInstantiator findvalueinstantiator = (findValueInstantiator) p0;
        return this.IconCompatParcelizer == findvalueinstantiator.IconCompatParcelizer && this.RemoteActionCompatParcelizer == findvalueinstantiator.RemoteActionCompatParcelizer && findAutoDetectVisibility.AudioAttributesCompatParcelizer(this.write, findvalueinstantiator.write) && findCreatorBinding.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, findvalueinstantiator.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, findvalueinstantiator.read);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = Float.hashCode(this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer = findAutoDetectVisibility.AudioAttributesCompatParcelizer(this.write);
        int iWrite = findCreatorBinding.write(this.AudioAttributesCompatParcelizer);
        setCurrentLength setcurrentlength = this.read;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iAudioAttributesCompatParcelizer) * 31) + iWrite) * 31) + (setcurrentlength != null ? setcurrentlength.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", miter=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", cap=");
        sb.append((Object) findAutoDetectVisibility.IconCompatParcelizer(this.write));
        sb.append(", join=");
        sb.append((Object) findCreatorBinding.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", pathEffect=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ findValueInstantiator(float f, float f2, int i, int i2, setCurrentLength setcurrentlength, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, i, i2, setcurrentlength);
    }
}

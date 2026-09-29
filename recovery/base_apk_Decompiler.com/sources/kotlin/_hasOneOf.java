package kotlin;

import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/_hasOneOf;", "Lo/Instantiatable;", "Lo/contentsAsString;", "Lo/switchToNext;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/calloc;", "Lo/releaseBuffers;", "p1", "", "p2", "", "RemoteActionCompatParcelizer", "(JLo/releaseBuffers;F)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "J", "write", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _hasOneOf extends Instantiatable implements contentsAsString {
    private final long read;

    private _hasOneOf(long j) {
        super(null);
        this.read = j;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    @Override // kotlin.Instantiatable
    public final void RemoteActionCompatParcelizer(long p0, releaseBuffers p1, float p2) {
        long jAudioAttributesCompatParcelizer$default;
        p1.RemoteActionCompatParcelizer(1.0f);
        if (p2 != 1.0f) {
            long j = this.read;
            jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(j, switchToNext.RemoteActionCompatParcelizer(j) * p2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            jAudioAttributesCompatParcelizer$default = this.read;
        }
        p1.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer$default);
        if (p1.MediaBrowserCompatItemReceiver() != null) {
            p1.read((Shader) null);
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof _hasOneOf) && switchToNext.RemoteActionCompatParcelizer(this.read, ((_hasOneOf) p0).read);
    }

    public final int hashCode() {
        return switchToNext.MediaBrowserCompatItemReceiver(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SolidColor(value=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.read));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ _hasOneOf(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j);
    }
}

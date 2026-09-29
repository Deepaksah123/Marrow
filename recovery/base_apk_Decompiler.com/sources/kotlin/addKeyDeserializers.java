package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/addKeyDeserializers;", "", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(FFFFZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/bufferMapProperty;", "Lo/withNulls;", "write", "(Lo/bufferMapProperty;)J", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "F", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "read", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class addKeyDeserializers {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    private addKeyDeserializers(float f, float f2, float f3, float f4, boolean z) {
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.read = f4;
        this.IconCompatParcelizer = z;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Left must be non-negative");
        }
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Top must be non-negative");
        }
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Right must be non-negative");
        }
        if (f4 >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        reportWrongTokenException.AudioAttributesCompatParcelizer("Bottom must be non-negative");
    }

    public final long write(bufferMapProperty p0) {
        return withNulls.IconCompatParcelizer(withNulls.INSTANCE.IconCompatParcelizer(p0.IconCompatParcelizer(this.RemoteActionCompatParcelizer), p0.IconCompatParcelizer(this.write), p0.IconCompatParcelizer(this.AudioAttributesCompatParcelizer), p0.IconCompatParcelizer(this.read), this.IconCompatParcelizer));
    }

    public /* synthetic */ addKeyDeserializers(float f, float f2, float f3, float f4, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, z);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof addKeyDeserializers)) {
            return false;
        }
        addKeyDeserializers addkeydeserializers = (addKeyDeserializers) p0;
        return assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, addkeydeserializers.RemoteActionCompatParcelizer) && assignParameter.IconCompatParcelizer(this.write, addkeydeserializers.write) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, addkeydeserializers.AudioAttributesCompatParcelizer) && assignParameter.IconCompatParcelizer(this.read, addkeydeserializers.read) && this.IconCompatParcelizer == addkeydeserializers.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read)) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("addKeyDeserializers(RemoteActionCompatParcelizer=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", write=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.write));
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", read=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.read));
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}

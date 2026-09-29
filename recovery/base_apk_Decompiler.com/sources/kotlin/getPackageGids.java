package kotlin;

import android.graphics.Rect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014"}, d2 = {"Lo/getPackageGids;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "read", "()Landroid/graphics/Rect;", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getPackageGids {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    private getPackageGids(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.read = i3;
        this.IconCompatParcelizer = i4;
        if (i > i3) {
            StringBuilder sb = new StringBuilder("Left must be less than or equal to right, left: ");
            sb.append(i);
            sb.append(", right: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i2 <= i4) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("top must be less than or equal to bottom, top: ");
        sb2.append(i2);
        sb2.append(", bottom: ");
        sb2.append(i4);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getPackageGids(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        toMagicModuleMetaRepoModel.write(rect, "");
    }

    public final Rect read() {
        return new Rect(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer);
    }

    public final int IconCompatParcelizer() {
        return this.read - this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer - this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(',');
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(',');
        sb.append(this.read);
        sb.append(',');
        sb.append(this.IconCompatParcelizer);
        sb.append("] }");
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        getPackageGids getpackagegids = (getPackageGids) p0;
        return this.RemoteActionCompatParcelizer == getpackagegids.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == getpackagegids.AudioAttributesCompatParcelizer && this.read == getpackagegids.read && this.IconCompatParcelizer == getpackagegids.IconCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        return (((((i * 31) + this.AudioAttributesCompatParcelizer) * 31) + this.read) * 31) + this.IconCompatParcelizer;
    }

    static {
        new getPackageGids(0, 0, 0, 0);
    }
}

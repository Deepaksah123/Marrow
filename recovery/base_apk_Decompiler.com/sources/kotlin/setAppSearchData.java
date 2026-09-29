package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000eH\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\u00020\u00028\u0007@@X\u0086\f¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u001c\u001a\u00020\u00028\u0007@@X\u0087\f¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00028\u0007@@X\u0087\f¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\n\u001a\u00020\u00028\u0007@@X\u0087\f¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0011X\u0091D¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u0011\u0010\u001b"}, d2 = {"Lo/setAppSearchData;", "Lo/ScrollingTabContainerView;", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "", "AudioAttributesCompatParcelizer", "()V", "AudioAttributesImplApi26Parcelizer", "()Lo/setAppSearchData;", "", "read", "(I)F", "IconCompatParcelizer", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RemoteActionCompatParcelizer", "F", "write", "()F", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setAppSearchData extends ScrollingTabContainerView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float read;

    public setAppSearchData(float f, float f2, float f3, float f4) {
        super(null);
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
        this.read = f3;
        this.AudioAttributesCompatParcelizer = f4;
        this.IconCompatParcelizer = 4;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void AudioAttributesCompatParcelizer() {
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public final setAppSearchData read() {
        return new setAppSearchData(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // kotlin.ScrollingTabContainerView
    public final float read(int p0) {
        if (p0 == 0) {
            return this.write;
        }
        if (p0 == 1) {
            return this.RemoteActionCompatParcelizer;
        }
        if (p0 != 2) {
            return p0 != 3 ? BitmapDescriptorFactory.HUE_RED : this.AudioAttributesCompatParcelizer;
        }
        return this.read;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void IconCompatParcelizer(int p0, float p1) {
        if (p0 == 0) {
            this.write = p1;
            return;
        }
        if (p0 == 1) {
            this.RemoteActionCompatParcelizer = p1;
        } else if (p0 == 2) {
            this.read = p1;
        } else {
            if (p0 != 3) {
                return;
            }
            this.AudioAttributesCompatParcelizer = p1;
        }
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationVector4D: v1 = ");
        sb.append(this.write);
        sb.append(", v2 = ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", v3 = ");
        sb.append(this.read);
        sb.append(", v4 = ");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof setAppSearchData)) {
            return false;
        }
        setAppSearchData setappsearchdata = (setAppSearchData) p0;
        return setappsearchdata.write == this.write && setappsearchdata.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && setappsearchdata.read == this.read && setappsearchdata.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Float.hashCode(this.write) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Float.hashCode(this.read)) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer);
    }
}

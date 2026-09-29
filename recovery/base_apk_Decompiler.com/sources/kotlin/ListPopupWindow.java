package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@@X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@@X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@@X\u0086\f¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\r8\u0011X\u0090D¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u0010\u0010\u001a"}, d2 = {"Lo/ListPopupWindow;", "Lo/ScrollingTabContainerView;", "", "p0", "p1", "p2", "<init>", "(FFF)V", "", "AudioAttributesCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "()Lo/ListPopupWindow;", "", "read", "(I)F", "IconCompatParcelizer", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "write", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ListPopupWindow extends ScrollingTabContainerView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public float read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public float write;
    public float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public ListPopupWindow(float f, float f2, float f3) {
        super(null);
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
        this.read = f3;
        this.IconCompatParcelizer = 3;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.read = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ListPopupWindow read() {
        return new ListPopupWindow(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // kotlin.ScrollingTabContainerView
    public final float read(int p0) {
        if (p0 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        if (p0 != 1) {
            return p0 != 2 ? BitmapDescriptorFactory.HUE_RED : this.read;
        }
        return this.write;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void IconCompatParcelizer(int p0, float p1) {
        if (p0 == 0) {
            this.RemoteActionCompatParcelizer = p1;
        } else if (p0 == 1) {
            this.write = p1;
        } else {
            if (p0 != 2) {
                return;
            }
            this.read = p1;
        }
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationVector3D: v1 = ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", v2 = ");
        sb.append(this.write);
        sb.append(", v3 = ");
        sb.append(this.read);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof ListPopupWindow)) {
            return false;
        }
        ListPopupWindow listPopupWindow = (ListPopupWindow) p0;
        return listPopupWindow.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && listPopupWindow.write == this.write && listPopupWindow.read == this.read;
    }

    public final int hashCode() {
        return (((Float.hashCode(this.RemoteActionCompatParcelizer) * 31) + Float.hashCode(this.write)) * 31) + Float.hashCode(this.read);
    }
}

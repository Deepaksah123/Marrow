package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000f\u001a\u00020\u00028\u0007@@X\u0086\f¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u000b8\u0011X\u0091D¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u000f\u0010\u0019"}, d2 = {"Lo/setHoverListener;", "Lo/ScrollingTabContainerView;", "", "p0", "<init>", "(F)V", "", "AudioAttributesCompatParcelizer", "()V", "write", "()Lo/setHoverListener;", "", "read", "(I)F", "p1", "IconCompatParcelizer", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "RemoteActionCompatParcelizer", "()F", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setHoverListener extends ScrollingTabContainerView {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    public setHoverListener(float f) {
        super(null);
        this.IconCompatParcelizer = f;
        this.write = 1;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void AudioAttributesCompatParcelizer() {
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final setHoverListener read() {
        return new setHoverListener(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // kotlin.ScrollingTabContainerView
    public final float read(int p0) {
        return p0 == 0 ? this.IconCompatParcelizer : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void IconCompatParcelizer(int p0, float p1) {
        if (p0 == 0) {
            this.IconCompatParcelizer = p1;
        }
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationVector1D: value = ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof setHoverListener) && ((setHoverListener) p0).IconCompatParcelizer == this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Float.hashCode(this.IconCompatParcelizer);
    }
}

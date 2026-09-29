package kotlin;

import android.content.Context;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lo/setModifier;", "Landroid/widget/EdgeEffect;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "p1", "", "onPull", "(FF)V", "(F)V", "onRelease", "()V", "", "onAbsorb", "(I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "F", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setModifier extends EdgeEffect {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;
    private float write;

    public setModifier(Context context) {
        super(context);
        this.RemoteActionCompatParcelizer = _findMissing.write(context).AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(1.0f));
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float p0, float p1) {
        this.write = BitmapDescriptorFactory.HUE_RED;
        super.onPull(p0, p1);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float p0) {
        this.write = BitmapDescriptorFactory.HUE_RED;
        super.onPull(p0);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.write = BitmapDescriptorFactory.HUE_RED;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int p0) {
        this.write = BitmapDescriptorFactory.HUE_RED;
        super.onAbsorb(p0);
    }

    public final void RemoteActionCompatParcelizer(float p0) {
        float f = this.write + p0;
        this.write = f;
        if (Math.abs(f) > this.RemoteActionCompatParcelizer) {
            onRelease();
        }
    }
}

package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u00020\u00028\u0007@@X\u0086\f¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00028\u0007@@X\u0087\f¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001b\u001a\u00020\f8\u0011X\u0091D¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u000f\u0010\u0019"}, d2 = {"Lo/MenuPopupWindowMenuDropDownListView;", "Lo/ScrollingTabContainerView;", "", "p0", "p1", "<init>", "(FF)V", "", "AudioAttributesCompatParcelizer", "()V", "AudioAttributesImplBaseParcelizer", "()Lo/MenuPopupWindowMenuDropDownListView;", "", "read", "(I)F", "IconCompatParcelizer", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "RemoteActionCompatParcelizer", "()F", "write", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuPopupWindowMenuDropDownListView extends ScrollingTabContainerView {
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private float write;

    public MenuPopupWindowMenuDropDownListView(float f, float f2) {
        super(null);
        this.AudioAttributesCompatParcelizer = f;
        this.write = f2;
        this.RemoteActionCompatParcelizer = 2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.write = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final MenuPopupWindowMenuDropDownListView read() {
        return new MenuPopupWindowMenuDropDownListView(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // kotlin.ScrollingTabContainerView
    public final float read(int p0) {
        if (p0 != 0) {
            return p0 != 1 ? BitmapDescriptorFactory.HUE_RED : this.write;
        }
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ScrollingTabContainerView
    public final void IconCompatParcelizer(int p0, float p1) {
        if (p0 == 0) {
            this.AudioAttributesCompatParcelizer = p1;
        } else {
            if (p0 != 1) {
                return;
            }
            this.write = p1;
        }
    }

    @Override // kotlin.ScrollingTabContainerView
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationVector2D: v1 = ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", v2 = ");
        sb.append(this.write);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof MenuPopupWindowMenuDropDownListView)) {
            return false;
        }
        MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView = (MenuPopupWindowMenuDropDownListView) p0;
        return menuPopupWindowMenuDropDownListView.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer && menuPopupWindowMenuDropDownListView.write == this.write;
    }

    public final int hashCode() {
        return (Float.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Float.hashCode(this.write);
    }
}

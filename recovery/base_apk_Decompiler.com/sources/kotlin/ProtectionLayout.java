package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a"}, d2 = {"Lo/ProtectionLayout;", "Lo/writerFor;", "Lo/setOnScrollChangeListener;", "", "p0", "", "p1", "Lkotlin/Function1;", "Lo/as;", "", "p2", "<init>", "(FZLo/getAnswerMap;)V", "write", "()Lo/setOnScrollChangeListener;", "IconCompatParcelizer", "(Lo/setOnScrollChangeListener;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "F", "Z", "Lo/getAnswerMap;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ProtectionLayout extends writerFor<setOnScrollChangeListener> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtectionLayout(float f, boolean z, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = getanswermap;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        StringBuilder sb = new StringBuilder("aspectRatio ");
        sb.append(f);
        sb.append(" must be > 0");
        performCreate.IconCompatParcelizer(sb.toString());
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final setOnScrollChangeListener IconCompatParcelizer() {
        return new setOnScrollChangeListener(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(setOnScrollChangeListener p0) {
        p0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        p0.read(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        ProtectionLayout protectionLayout = p0 instanceof ProtectionLayout ? (ProtectionLayout) p0 : null;
        return protectionLayout != null && this.IconCompatParcelizer == protectionLayout.IconCompatParcelizer && this.RemoteActionCompatParcelizer == ((ProtectionLayout) p0).RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (Float.hashCode(this.IconCompatParcelizer) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }
}

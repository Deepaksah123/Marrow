package kotlin;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Metadata;
import kotlin.setPaddingLeft;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setLastVerticalStyle;", "Lo/setPaddingRight;", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "Lo/handleIdValue;", "p2", "Lo/assignParameter;", "p3", "p4", "p5", "Lo/bufferMapProperty;", "p6", "", "p7", "Lo/setLastVerticalStyle$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;ZJFFZLo/bufferMapProperty;F)Lo/setLastVerticalStyle$IconCompatParcelizer;", "write", "Z", "IconCompatParcelizer", "()Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setLastVerticalStyle implements setPaddingRight {
    public static final setLastVerticalStyle INSTANCE = new setLastVerticalStyle();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final boolean RemoteActionCompatParcelizer = true;

    private setLastVerticalStyle() {
    }

    @Override // kotlin.setPaddingRight
    public final boolean IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setPaddingRight
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final IconCompatParcelizer IconCompatParcelizer(View p0, boolean p1, long p2, float p3, float p4, boolean p5, bufferMapProperty p6, float p7) {
        if (p1) {
            return new IconCompatParcelizer(new Magnifier(p0));
        }
        long jD_ = p6.d_(p2);
        float fAudioAttributesCompatParcelizer = p6.AudioAttributesCompatParcelizer(p3);
        float fAudioAttributesCompatParcelizer2 = p6.AudioAttributesCompatParcelizer(p4);
        Magnifier.Builder builder = new Magnifier.Builder(p0);
        if (jD_ != 9205357640488583168L) {
            builder.setSize(getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (jD_ >> 32))), getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) jD_)));
        }
        if (!Float.isNaN(fAudioAttributesCompatParcelizer)) {
            builder.setCornerRadius(fAudioAttributesCompatParcelizer);
        }
        if (!Float.isNaN(fAudioAttributesCompatParcelizer2)) {
            builder.setElevation(fAudioAttributesCompatParcelizer2);
        }
        if (!Float.isNaN(p7)) {
            builder.setInitialZoom(p7);
        }
        builder.setClippingEnabled(p5);
        return new IconCompatParcelizer(builder.build());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/setLastVerticalStyle$IconCompatParcelizer;", "Lo/setPaddingLeft$RemoteActionCompatParcelizer;", "Landroid/widget/Magnifier;", "p0", "<init>", "(Landroid/widget/Magnifier;)V", "Lo/getReferencedType;", "p1", "", "p2", "", "read", "(JJF)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends setPaddingLeft.RemoteActionCompatParcelizer {
        public IconCompatParcelizer(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // o.setPaddingLeft.RemoteActionCompatParcelizer, kotlin.setLastHorizontalBias
        public final void read(long p0, long p1, float p2) {
            if (!Float.isNaN(p2)) {
                getWrite().setZoom(p2);
            }
            if ((9223372034707292159L & p1) != 9205357640488583168L) {
                getWrite().show(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) p1));
            } else {
                getWrite().show(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0));
            }
        }
    }
}

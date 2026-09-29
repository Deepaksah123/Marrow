package kotlin;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setPaddingLeft;", "Lo/setPaddingRight;", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "Lo/handleIdValue;", "p2", "Lo/assignParameter;", "p3", "p4", "p5", "Lo/bufferMapProperty;", "p6", "", "p7", "Lo/setPaddingLeft$RemoteActionCompatParcelizer;", "write", "(Landroid/view/View;ZJFFZLo/bufferMapProperty;F)Lo/setPaddingLeft$RemoteActionCompatParcelizer;", "read", "Z", "IconCompatParcelizer", "()Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPaddingLeft implements setPaddingRight {
    public static final setPaddingLeft INSTANCE = new setPaddingLeft();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final boolean write = false;

    private setPaddingLeft() {
    }

    @Override // kotlin.setPaddingRight
    public final boolean IconCompatParcelizer() {
        return write;
    }

    @Override // kotlin.setPaddingRight
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final RemoteActionCompatParcelizer IconCompatParcelizer(View p0, boolean p1, long p2, float p3, float p4, boolean p5, bufferMapProperty p6, float p7) {
        return new RemoteActionCompatParcelizer(new Magnifier(p0));
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0015"}, d2 = {"Lo/setPaddingLeft$RemoteActionCompatParcelizer;", "Lo/setLastHorizontalBias;", "Landroid/widget/Magnifier;", "p0", "<init>", "(Landroid/widget/Magnifier;)V", "", "RemoteActionCompatParcelizer", "()V", "Lo/getReferencedType;", "p1", "", "p2", "read", "(JJF)V", "AudioAttributesCompatParcelizer", "write", "Landroid/widget/Magnifier;", "IconCompatParcelizer", "()Landroid/widget/Magnifier;", "Lo/getKey;", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class RemoteActionCompatParcelizer implements setLastHorizontalBias {
        private final Magnifier write;

        public RemoteActionCompatParcelizer(Magnifier magnifier) {
            this.write = magnifier;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final Magnifier getWrite() {
            return this.write;
        }

        @Override // kotlin.setLastHorizontalBias
        public long read() {
            long j = -1;
            return getKey.read((((long) this.write.getWidth()) << 32) | (((long) this.write.getHeight()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        }

        @Override // kotlin.setLastHorizontalBias
        public void RemoteActionCompatParcelizer() {
            this.write.update();
        }

        @Override // kotlin.setLastHorizontalBias
        public void read(long p0, long p1, float p2) {
            this.write.show(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0));
        }

        @Override // kotlin.setLastHorizontalBias
        public void AudioAttributesCompatParcelizer() {
            this.write.dismiss();
        }
    }
}

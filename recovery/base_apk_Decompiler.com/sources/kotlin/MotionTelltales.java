package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/MotionTelltales;", "", "", "p0", "p1", "p2", "AudioAttributesCompatParcelizer", "(FFF)F", "Lo/setOrientation;", "IconCompatParcelizer", "()Lo/setOrientation;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MotionTelltales {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    @getRenewGrpId
    default setOrientation<Float> IconCompatParcelizer() {
        return INSTANCE.RemoteActionCompatParcelizer();
    }

    default float AudioAttributesCompatParcelizer(float p0, float p1, float p2) {
        return INSTANCE.read(p0, p1, p2);
    }

    /* JADX INFO: renamed from: o.MotionTelltales$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/MotionTelltales$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "p2", "read", "(FFF)F", "Lo/setOrientation;", "Lo/setOrientation;", "RemoteActionCompatParcelizer", "()Lo/setOrientation;", "Lo/MotionTelltales;", "Lo/MotionTelltales;", "write", "()Lo/MotionTelltales;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();
        private static final setOrientation<Float> read = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private static final MotionTelltales AudioAttributesCompatParcelizer = new C0037IconCompatParcelizer();

        private Companion() {
        }

        public final setOrientation<Float> RemoteActionCompatParcelizer() {
            return read;
        }

        /* JADX INFO: renamed from: o.MotionTelltales$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/MotionTelltales$IconCompatParcelizer$IconCompatParcelizer;", "Lo/MotionTelltales;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0037IconCompatParcelizer implements MotionTelltales {
            C0037IconCompatParcelizer() {
            }
        }

        public final MotionTelltales write() {
            return AudioAttributesCompatParcelizer;
        }

        public final float read(float p0, float p1, float p2) {
            float f = p1 + p0;
            if (p0 >= BitmapDescriptorFactory.HUE_RED && f <= p2) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (p0 < BitmapDescriptorFactory.HUE_RED && f > p2) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f2 = f - p2;
            return Math.abs(p0) < Math.abs(f2) ? p0 : f2;
        }
    }
}

package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\n"}, d2 = {"Lo/assignParameter;", "p0", "Lo/setUnplayedColor;", "IconCompatParcelizer", "(F)Lo/setUnplayedColor;", "", "RemoteActionCompatParcelizer", "(I)Lo/setUnplayedColor;", "AudioAttributesCompatParcelizer", "Lo/setUnplayedColor;", "()Lo/setUnplayedColor;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LegacyPlayerControlView {
    private static final setUnplayedColor AudioAttributesCompatParcelizer = new write();

    public static final setUnplayedColor IconCompatParcelizer(float f) {
        return new setScrubberColor(f, null);
    }

    public static final setUnplayedColor RemoteActionCompatParcelizer(int i) {
        return new setPosition(i);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/LegacyPlayerControlView$write;", "Lo/setUnplayedColor;", "Lo/JsonAppendProp;", "Lo/calloc;", "p0", "Lo/bufferMapProperty;", "p1", "", "write", "(JLo/bufferMapProperty;)F", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements setUnplayedColor, JsonAppendProp {
        @Override // kotlin.setUnplayedColor
        public final float write(long p0, bufferMapProperty p1) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        write() {
        }

        public final String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final setUnplayedColor RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}

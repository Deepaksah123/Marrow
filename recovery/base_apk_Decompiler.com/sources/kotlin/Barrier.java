package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/CharacterEscapes;", "Lo/MotionTelltales;", "AudioAttributesCompatParcelizer", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;", "write", "read", "Lo/MotionTelltales;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Barrier {
    private static final CharacterEscapes<MotionTelltales> AudioAttributesCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.setAllowsGoneWidget
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return Barrier.write((reportInvalidBase64Char) obj);
        }
    });
    private static final MotionTelltales read = new RemoteActionCompatParcelizer();

    public static final CharacterEscapes<MotionTelltales> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionTelltales write(reportInvalidBase64Char reportinvalidbase64char) {
        if (!((Context) reportinvalidbase64char.RemoteActionCompatParcelizer(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return MotionTelltales.INSTANCE.write();
        }
        return read;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lo/Barrier$RemoteActionCompatParcelizer;", "Lo/MotionTelltales;", "", "p0", "p1", "p2", "AudioAttributesCompatParcelizer", "(FFF)F", "write", "F", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements MotionTelltales {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final float write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final float IconCompatParcelizer = 0.3f;

        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.MotionTelltales
        public final float AudioAttributesCompatParcelizer(float p0, float p1, float p2) {
            float fAbs = Math.abs((p1 + p0) - p0);
            boolean z = fAbs <= p2;
            float f = (this.IconCompatParcelizer * p2) - (this.write * fAbs);
            if (z && p2 - f < fAbs) {
                f = p2 - fAbs;
            }
            return p0 - f;
        }
    }
}

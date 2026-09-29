package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setPaddingRight;", "", "Landroid/view/View;", "p0", "", "p1", "Lo/handleIdValue;", "p2", "Lo/assignParameter;", "p3", "p4", "p5", "Lo/bufferMapProperty;", "p6", "", "p7", "Lo/setLastHorizontalBias;", "IconCompatParcelizer", "(Landroid/view/View;ZJFFZLo/bufferMapProperty;F)Lo/setLastHorizontalBias;", "()Z", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setPaddingRight {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    setLastHorizontalBias IconCompatParcelizer(View p0, boolean p1, long p2, float p3, float p4, boolean p5, bufferMapProperty p6, float p7);

    boolean IconCompatParcelizer();

    /* JADX INFO: renamed from: o.setPaddingRight$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setPaddingRight$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/setPaddingRight;", "write", "()Lo/setPaddingRight;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }

        public final setPaddingRight write() {
            if (!setDefaultRadius.IconCompatParcelizer$default(0, 1, null)) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            return setLastVerticalStyle.INSTANCE;
        }
    }
}

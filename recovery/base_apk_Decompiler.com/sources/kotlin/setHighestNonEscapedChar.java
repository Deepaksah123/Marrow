package kotlin;

import androidx.compose.material.ripple.RippleHostView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000fR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012"}, d2 = {"Lo/setHighestNonEscapedChar;", "", "<init>", "()V", "Lo/setFeatureMask;", "p0", "Landroidx/compose/material/ripple/RippleHostView;", "p1", "", "IconCompatParcelizer", "(Lo/setFeatureMask;Landroidx/compose/material/ripple/RippleHostView;)V", "RemoteActionCompatParcelizer", "(Lo/setFeatureMask;)Landroidx/compose/material/ripple/RippleHostView;", "read", "(Landroidx/compose/material/ripple/RippleHostView;)Lo/setFeatureMask;", "(Lo/setFeatureMask;)V", "", "AudioAttributesCompatParcelizer", "Ljava/util/Map;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setHighestNonEscapedChar {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<setFeatureMask, RippleHostView> RemoteActionCompatParcelizer = new LinkedHashMap();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<RippleHostView, setFeatureMask> write = new LinkedHashMap();

    public final void IconCompatParcelizer(setFeatureMask p0, RippleHostView p1) {
        this.RemoteActionCompatParcelizer.put(p0, p1);
        this.write.put(p1, p0);
    }

    public final RippleHostView RemoteActionCompatParcelizer(setFeatureMask p0) {
        return this.RemoteActionCompatParcelizer.get(p0);
    }

    public final setFeatureMask read(RippleHostView p0) {
        return this.write.get(p0);
    }

    public final void IconCompatParcelizer(setFeatureMask p0) {
        RippleHostView rippleHostView = this.RemoteActionCompatParcelizer.get(p0);
        if (rippleHostView != null) {
            this.write.remove(rippleHostView);
        }
        this.RemoteActionCompatParcelizer.remove(p0);
    }
}

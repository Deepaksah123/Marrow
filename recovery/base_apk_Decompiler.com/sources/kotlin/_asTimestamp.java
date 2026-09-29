package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _asTimestamp implements NumberSerializersFloatSerializer<_asTimestamp> {
    public final String handleMediaPlayPauseIfPendingOnHandler;
    public final List<String> onFastForward;
    public final boolean onPlayFromMediaId;

    protected _asTimestamp(String str, List<String> list, boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler = str;
        this.onFastForward = Collections.unmodifiableList(list);
        this.onPlayFromMediaId = z;
    }
}

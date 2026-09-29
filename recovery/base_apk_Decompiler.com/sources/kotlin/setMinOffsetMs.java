package kotlin;

import java.util.Collections;
import java.util.Map;
import kotlin.MediaItemLiveConfigurationBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface setMinOffsetMs {
    public static final setMinOffsetMs RemoteActionCompatParcelizer;

    Map<String, String> RemoteActionCompatParcelizer();

    static {
        new setMinOffsetMs() { // from class: o.setMinOffsetMs.3
            @Override // kotlin.setMinOffsetMs
            public final Map<String, String> RemoteActionCompatParcelizer() {
                return Collections.emptyMap();
            }
        };
        RemoteActionCompatParcelizer = new MediaItemLiveConfigurationBuilder.read().write();
    }
}

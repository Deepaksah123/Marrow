package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/addDrmEventListener;", "", "AudioAttributesCompatParcelizer", "(Lo/addDrmEventListener;)I", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class enableInternal {
    public static final int AudioAttributesCompatParcelizer(addDrmEventListener adddrmeventlistener) {
        long jMediaMetadataCompat;
        if (adddrmeventlistener.write() == superDispatchKeyEvent.write) {
            long j = -1;
            jMediaMetadataCompat = adddrmeventlistener.MediaMetadataCompat() & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        } else {
            jMediaMetadataCompat = adddrmeventlistener.MediaMetadataCompat() >> 32;
        }
        return (int) jMediaMetadataCompat;
    }
}

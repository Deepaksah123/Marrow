package kotlin;

import com.google.android.exoplayer2.C;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pad3 {
    public final long AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final initExtraTracks<getDefaultImpl> read;

    public pad3(List<getDefaultImpl> list, long j, long j2) {
        this.read = initExtraTracks.write(list);
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
        long j3 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.RemoteActionCompatParcelizer = j3;
    }
}

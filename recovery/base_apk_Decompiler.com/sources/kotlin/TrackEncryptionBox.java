package kotlin;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TrackEncryptionBox {
    private final onInputBufferAvailable<TrackSampleTable> AudioAttributesCompatParcelizer;
    private final Map<String, schemeToCryptoMode> IconCompatParcelizer = new HashMap();
    private final Context read;

    public TrackEncryptionBox(Context context, onInputBufferAvailable<TrackSampleTable> oninputbufferavailable) {
        this.read = context;
        this.AudioAttributesCompatParcelizer = oninputbufferavailable;
    }

    public final schemeToCryptoMode AudioAttributesCompatParcelizer(String str) {
        schemeToCryptoMode schemetocryptomode;
        synchronized (this) {
            if (!this.IconCompatParcelizer.containsKey(str)) {
                this.IconCompatParcelizer.put(str, read(str));
            }
            schemetocryptomode = this.IconCompatParcelizer.get(str);
        }
        return schemetocryptomode;
    }

    private schemeToCryptoMode read(String str) {
        return new schemeToCryptoMode(this.AudioAttributesCompatParcelizer, str);
    }
}

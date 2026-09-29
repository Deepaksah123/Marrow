package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class post extends DefaultDrmSessionResponseHandler {
    private int AudioAttributesCompatParcelizer;
    private DecimalFormat RemoteActionCompatParcelizer;

    public post(int i) {
        this.AudioAttributesCompatParcelizer = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append(SessionDescription.SUPPORTED_SDP_VERSION);
        }
        StringBuilder sb = new StringBuilder("###,###,###,##0");
        sb.append(stringBuffer.toString());
        this.RemoteActionCompatParcelizer = new DecimalFormat(sb.toString());
    }

    @Override // kotlin.DefaultDrmSessionResponseHandler
    public final String read(float f) {
        return this.RemoteActionCompatParcelizer.format(f);
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }
}

package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class onReferenceCountDecremented extends DefaultDrmSessionResponseHandler {
    private int RemoteActionCompatParcelizer;
    private DecimalFormat read;

    public onReferenceCountDecremented(int i) {
        RemoteActionCompatParcelizer(i);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append(SessionDescription.SUPPORTED_SDP_VERSION);
        }
        StringBuilder sb = new StringBuilder("###,###,###,##0");
        sb.append(stringBuffer.toString());
        this.read = new DecimalFormat(sb.toString());
    }

    @Override // kotlin.DefaultDrmSessionResponseHandler
    public final String read(float f) {
        return this.read.format(f);
    }
}

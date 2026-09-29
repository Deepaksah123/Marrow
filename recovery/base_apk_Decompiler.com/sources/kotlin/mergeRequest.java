package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class mergeRequest {
    private static volatile mergeRequest AudioAttributesCompatParcelizer;
    static final mergeRequest write = new mergeRequest((byte) 0);
    private final Map<Object, Object<?, ?>> read;

    public static mergeRequest AudioAttributesCompatParcelizer() {
        mergeRequest mergerequestWrite;
        mergeRequest mergerequest = AudioAttributesCompatParcelizer;
        if (mergerequest != null) {
            return mergerequest;
        }
        synchronized (mergeRequest.class) {
            mergerequestWrite = AudioAttributesCompatParcelizer;
            if (mergerequestWrite == null) {
                mergerequestWrite = DownloadHelperMediaPreparerExternalSyntheticLambda0.write();
                AudioAttributesCompatParcelizer = mergerequestWrite;
            }
        }
        return mergerequestWrite;
    }

    mergeRequest() {
        this.read = new HashMap();
    }

    private mergeRequest(byte b) {
        this.read = Collections.emptyMap();
    }
}

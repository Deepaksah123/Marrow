package kotlin;

import java.sql.Date;
import java.sql.Timestamp;
import kotlin.onMediaPrepared;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadHelperExternalSyntheticLambda0 {
    public static final isAfterLast IconCompatParcelizer;
    public static final isAfterLast RemoteActionCompatParcelizer;
    public static final boolean read;
    public static final isAfterLast write;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        read = z;
        if (z) {
            new onMediaPrepared.AudioAttributesCompatParcelizer<Date>(Date.class) { // from class: o.DownloadHelperExternalSyntheticLambda0.3
            };
            new onMediaPrepared.AudioAttributesCompatParcelizer<Timestamp>(Timestamp.class) { // from class: o.DownloadHelperExternalSyntheticLambda0.1
            };
            IconCompatParcelizer = lambdaonMediaPreparationFailed5comgoogleandroidexoplayer2offlineDownloadHelper.AudioAttributesCompatParcelizer;
            write = lambdaonMediaPrepared4comgoogleandroidexoplayer2offlineDownloadHelper.AudioAttributesCompatParcelizer;
            RemoteActionCompatParcelizer = DownloadHelperExternalSyntheticLambda1.AudioAttributesCompatParcelizer;
            return;
        }
        IconCompatParcelizer = null;
        write = null;
        RemoteActionCompatParcelizer = null;
    }
}

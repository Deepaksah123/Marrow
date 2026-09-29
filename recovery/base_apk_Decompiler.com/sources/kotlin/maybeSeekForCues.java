package kotlin;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeSeekForCues extends ApiException {
    public maybeSeekForCues() {
        super(new Status(-1, String.format(Locale.getDefault(), "Review Error(%d): %s", -1, initializeOutput.write(-1))));
    }
}

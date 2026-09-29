package in.juspay.hypersmshandler;

import android.app.Activity;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J-\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lin/juspay/hypersmshandler/JuspayDuiHook;", "", "Landroid/app/Activity;", "p0", "", "attach", "(Landroid/app/Activity;)V", "detach", "", "p1", "Lorg/json/JSONObject;", "p2", "execute", "(Landroid/app/Activity;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface JuspayDuiHook {
    void attach(Activity p0);

    void detach(Activity p0);

    String execute(Activity p0, String p1, JSONObject p2);
}

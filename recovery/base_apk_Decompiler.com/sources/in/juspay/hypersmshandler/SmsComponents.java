package in.juspay.hypersmshandler;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lin/juspay/hypersmshandler/SmsComponents;", "", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", LogCategory.CONTEXT, "Lin/juspay/hypersmshandler/SmsEventInterface;", "getSmsEventInterface", "()Lin/juspay/hypersmshandler/SmsEventInterface;", "smsEventInterface", "Lin/juspay/hypersmshandler/Tracker;", "getTracker", "()Lin/juspay/hypersmshandler/Tracker;", "tracker"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SmsComponents {
    Context getContext();

    SmsEventInterface getSmsEventInterface();

    Tracker getTracker();
}

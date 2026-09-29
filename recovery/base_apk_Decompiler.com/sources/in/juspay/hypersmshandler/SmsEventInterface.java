package in.juspay.hypersmshandler;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0006J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lin/juspay/hypersmshandler/SmsEventInterface;", "", "", "p0", "", "onActivityResultEvent", "(Ljava/lang/String;)V", "", "onSentReceiverEvent", "(I)V", "Landroid/content/Intent;", "p1", "Landroid/os/Bundle;", "p2", "onSmsConsentEvent", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "onSmsReceiverEvent", "Lin/juspay/hypersmshandler/SmsEventInterface$RetrieverEvents;", "onSmsRetrieverEvent", "(Lin/juspay/hypersmshandler/SmsEventInterface$RetrieverEvents;Ljava/lang/String;)V", "RetrieverEvents"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SmsEventInterface {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lin/juspay/hypersmshandler/SmsEventInterface$RetrieverEvents;", "", "<init>", "(Ljava/lang/String;I)V", "ON_ATTACH", "ON_RECEIVE", "ON_EXECUTE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum RetrieverEvents {
        ON_ATTACH,
        ON_RECEIVE,
        ON_EXECUTE
    }

    void onActivityResultEvent(String p0);

    void onSentReceiverEvent(int p0);

    void onSmsConsentEvent(Intent p0, int p1, Bundle p2);

    void onSmsReceiverEvent(String p0);

    void onSmsRetrieverEvent(RetrieverEvents p0, String p1);
}

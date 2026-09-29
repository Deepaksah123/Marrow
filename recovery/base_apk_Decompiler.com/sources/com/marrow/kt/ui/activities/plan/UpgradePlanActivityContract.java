package com.marrow.kt.ui.activities.plan;

import android.text.SpannableString;
import com.marrow.data.models.plan.Subscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.getBasicChar;
import kotlin.getExtendedEsFrChar;
import kotlin.readShort;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface UpgradePlanActivityContract {

    public interface AudioAttributesCompatParcelizer extends getBasicChar {
        void AudioAttributesCompatParcelizer(SpannableString spannableString);

        void AudioAttributesCompatParcelizer(readShort.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

        void AudioAttributesCompatParcelizer(JSONObject jSONObject);

        void AudioAttributesImplApi21Parcelizer(String str);

        void AudioAttributesImplApi26Parcelizer(String str);

        void AudioAttributesImplBaseParcelizer(String str);

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(String str, String str2, String str3);

        void MediaBrowserCompatCustomActionResultReceiver(String str);

        void MediaBrowserCompatItemReceiver(String str);

        void MediaBrowserCompatMediaItem(String str);

        void RatingCompat(String str);

        void RemoteActionCompatParcelizer(String str, int i);

        void onCustomAction();

        void onFastForward();

        void onMediaButtonEvent();

        void onPlay();

        void onPlayFromMediaId();

        void onPlayFromUri();

        void onPrepareFromMediaId();

        void read(String str, String str2, String str3);

        void write(SpannableString spannableString);

        void write(String str);

        void write(List<String> list);

        void write(Subscription[] subscriptionArr, String str);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u00060\nj\u0002`\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0014\u0010\u001b\u001a\u00020\u00032\n\u0010\t\u001a\u00060\nj\u0002`\u000bH&¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$Presenter;", "Lcom/marrow/mvp/IPresenter;", "onCreate", "", "onBuyNowBtnClicked", "clearUpgradePlanPreference", "getPlanExpiryDate", "", "recordCrash", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "validatePaymentWithServer", "orderId", "onJusPaySdkPaymentSuccess", "checkJusPayPaymentStatus", "isJusPayPaymentInProgress", "", "onJusPayPaymentFinished", "logPurchaseFailure", "onPaymentSuccess", "onJusPayCodInitiated", "onJusPayBackPressedOrCancelled", "onJusPayAuthorizationFailed", "code", "errorMsg", "onJusPayNoInternet", "onJusPayException", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Presenter extends getExtendedEsFrChar {
        void AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(Exception exc);

        void AudioAttributesCompatParcelizer(String str);

        void IconCompatParcelizer();

        void IconCompatParcelizer(String str, String str2);

        void MediaBrowserCompatItemReceiver();

        void MediaDescriptionCompat();

        void MediaMetadataCompat();

        void RatingCompat();

        boolean RemoteActionCompatParcelizer();

        void onPaymentSuccess(String orderId);

        void read();

        void read(Exception exc);

        void write();
    }
}

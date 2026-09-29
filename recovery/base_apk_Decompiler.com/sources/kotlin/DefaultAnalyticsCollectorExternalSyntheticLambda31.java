package kotlin;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import in.juspay.hyper.constants.LogCategory;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\f\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\f\u0010\u0013J'\u0010\f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda31;", "", "<init>", "()V", "", "p0", "p1", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda31$write;", "write", "(Ljava/lang/String;Ljava/lang/String;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda31$write;", "", "p2", "read", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda31$write;", "", "()Z", "", "IconCompatParcelizer", "", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lo/lambdaonVideoFrameProcessingOffset20;", "Lo/lambdaonVideoFrameProcessingOffset20;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda31 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda31 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda31();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final lambdaonVideoFrameProcessingOffset20 RemoteActionCompatParcelizer = new lambdaonVideoFrameProcessingOffset20(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());

    private DefaultAnalyticsCollectorExternalSyntheticLambda31() {
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer() {
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        String strWrite = lambdaonMediaMetadataChanged48.write();
        boolean zAudioAttributesImplApi26Parcelizer = lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer();
        DefaultAnalyticsCollectorExternalSyntheticLambda8.IconCompatParcelizer(contextAudioAttributesCompatParcelizer, LogCategory.CONTEXT);
        if (zAudioAttributesImplApi26Parcelizer && (contextAudioAttributesCompatParcelizer instanceof Application)) {
            lambdaonVideoDisabled18.write((Application) contextAudioAttributesCompatParcelizer, strWrite);
        }
    }

    @getMagicModuleMeta
    public static final void read(String p0, long p1) {
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        String strWrite = lambdaonMediaMetadataChanged48.write();
        DefaultAnalyticsCollectorExternalSyntheticLambda8.IconCompatParcelizer(contextAudioAttributesCompatParcelizer, LogCategory.CONTEXT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(strWrite, false);
        if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null || !defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() || p1 <= 0) {
            return;
        }
        lambdaonVideoFrameProcessingOffset20 lambdaonvideoframeprocessingoffset20 = new lambdaonVideoFrameProcessingOffset20(contextAudioAttributesCompatParcelizer);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", p0);
        lambdaonvideoframeprocessingoffset20.read("fb_aa_time_spent_on_view", p1, bundle);
    }

    @getMagicModuleMeta
    public static final void read(String p0, String p1, boolean p2) {
        write writeVarWrite;
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (!write() || (writeVarWrite = write(p0, p1)) == null) {
            return;
        }
        if (p2 && DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer("app_events_if_auto_log_subs", lambdaonMediaMetadataChanged48.write(), false)) {
            if (DefaultAnalyticsCollectorExternalSyntheticLambda21.write(p1)) {
                str = "StartTrial";
            } else {
                str = "Subscribe";
            }
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, writeVarWrite.RemoteActionCompatParcelizer(), writeVarWrite.write(), writeVarWrite.AudioAttributesCompatParcelizer());
            return;
        }
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(writeVarWrite.RemoteActionCompatParcelizer(), writeVarWrite.write(), writeVarWrite.AudioAttributesCompatParcelizer());
    }

    @getMagicModuleMeta
    public static final boolean write() {
        DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write());
        return defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer != null && lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer() && defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
    }

    private static write write(String p0, String p1) {
        return read(p0, p1, new HashMap());
    }

    private static write read(String p0, String p1, Map<String, String> p2) {
        try {
            JSONObject jSONObject = new JSONObject(p0);
            JSONObject jSONObject2 = new JSONObject(p1);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String strOptString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", strOptString);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString, (Object) "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
                if (strOptString2.length() != 0) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", strOptString2);
                }
            }
            for (Map.Entry<String, String> entry : p2.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(currency, "");
            return new write(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            return null;
        }
    }

    static final class write {
        private BigDecimal AudioAttributesCompatParcelizer;
        private Bundle RemoteActionCompatParcelizer;
        private Currency read;

        public write(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(bigDecimal, "");
            toMagicModuleMetaRepoModel.write(currency, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            this.AudioAttributesCompatParcelizer = bigDecimal;
            this.read = currency;
            this.RemoteActionCompatParcelizer = bundle;
        }

        public final Bundle AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final BigDecimal RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final Currency write() {
            return this.read;
        }
    }
}

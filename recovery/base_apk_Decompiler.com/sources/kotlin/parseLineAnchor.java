package kotlin;

import android.os.CountDownTimer;
import com.marrow.R;
import com.marrow.data.api.models.response.plan.RenewEligible;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class parseLineAnchor extends POJOPropertyBuilderWithMember {
    private CountDownTimer AudioAttributesCompatParcelizer;
    private final InputAccessor IconCompatParcelizer;
    private final InputAccessor RemoteActionCompatParcelizer;
    private final getStreamPositionUsForContent read;

    public parseLineAnchor(getStreamPositionUsForContent getstreampositionusforcontent) {
        int i;
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.read = getstreampositionusforcontent;
        WebvttCueParserElement webvttCueParserElement = null;
        this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(new parseTextAlignment(false, null, 3, null), null, 2, null);
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
        final RenewEligible renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getstreampositionusforcontent.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        read(getstreampositionusforcontent.onRemoveQueueItem() == 1);
        boolean zAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{2, 3}), renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null ? Integer.valueOf(renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getRenewFlowType()) : null);
        if (renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null) {
            boolean zContains = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{2, 3}).contains(Integer.valueOf(renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getRenewFlowType()));
            if (zAudioAttributesCompatParcelizer) {
                i = R.string.text_renew_header_2;
            } else {
                i = renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getRenewFlowType() == 4 ? R.string.text_renew_header_4 : R.string.text_renew_header_1;
            }
            webvttCueParserElement = new WebvttCueParserElement(zContains, null, i, renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getCoupon(), renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getPlanDetails().getPlanName(), renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getPlanDetails().getPlanOldPrice(), renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getPlanDetails().getPlanNewPrice(), renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getPlanDetails().getPlanDuration(), renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getSubscriptionExpiresOn(), 2, null);
        }
        AudioAttributesCompatParcelizer(new parseTextAlignment(false, webvttCueParserElement));
        if (renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null) {
            CountDownTimer countDownTimer = new CountDownTimer(renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getSubscriptionExpiresOn() - System.currentTimeMillis()) { // from class: o.parseLineAnchor.1
                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    InputAccessor<Long[]> inputAccessorAudioAttributesImplBaseParcelizer;
                    long days = TimeUnit.MILLISECONDS.toDays(j);
                    long millis = j - TimeUnit.DAYS.toMillis(days);
                    long hours = TimeUnit.MILLISECONDS.toHours(millis);
                    long millis2 = millis - TimeUnit.HOURS.toMillis(hours);
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(millis2);
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(minutes));
                    WebvttCueParserElement write = this.AudioAttributesCompatParcelizer().getWrite();
                    if (write == null || (inputAccessorAudioAttributesImplBaseParcelizer = write.AudioAttributesImplBaseParcelizer()) == null) {
                        return;
                    }
                    inputAccessorAudioAttributesImplBaseParcelizer.write(new Long[]{Long.valueOf(days), Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)});
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    InputAccessor<Long[]> inputAccessorAudioAttributesImplBaseParcelizer;
                    getStreamPositionUsForContent getstreampositionusforcontent2 = this.read;
                    RenewEligible renewEligible = renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                    getstreampositionusforcontent2.read(renewEligible.copy((31 & 1) != 0 ? renewEligible.coupon : null, (31 & 2) != 0 ? renewEligible.subscriptionExpiresOn : 0L, (31 & 4) != 0 ? renewEligible.planDetails : null, (31 & 8) != 0 ? renewEligible.rfBanners : null, (31 & 16) != 0 ? renewEligible.renewExpiresOn : 0L, (31 & 32) != 0 ? renewEligible.renewFlowType : 4));
                    WebvttCueParserElement write = this.AudioAttributesCompatParcelizer().getWrite();
                    if (write != null && (inputAccessorAudioAttributesImplBaseParcelizer = write.AudioAttributesImplBaseParcelizer()) != null) {
                        inputAccessorAudioAttributesImplBaseParcelizer.write(new Long[]{-1L, -1L, -1L, -1L});
                    }
                    cancel();
                }
            };
            this.AudioAttributesCompatParcelizer = countDownTimer;
            countDownTimer.start();
        }
    }

    private final void AudioAttributesCompatParcelizer(parseTextAlignment parsetextalignment) {
        this.IconCompatParcelizer.write(parsetextalignment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final parseTextAlignment AudioAttributesCompatParcelizer() {
        return (parseTextAlignment) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    private final void read(boolean z) {
        this.RemoteActionCompatParcelizer.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean read() {
        return ((Boolean) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        super.write();
        CountDownTimer countDownTimer = this.AudioAttributesCompatParcelizer;
        if (countDownTimer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        AdaptationSet.read(this.read, "app_session_full_page");
    }
}

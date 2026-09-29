package in.juspay.hypersmshandler;

import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SmsConsentHandler$startListener$1 extends MagicModuleUseCase implements getAnswerMap<Void, getShowPopup> {
    public final /* synthetic */ Tracker a;

    @Override // kotlin.getAnswerMap
    public final getShowPopup invoke(Void r7) {
        this.a.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, "sms_consent", "sms_consent_listener", "SmsConsent listener started successfully");
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsConsentHandler$startListener$1(Tracker tracker) {
        super(1);
        this.a = tracker;
    }
}

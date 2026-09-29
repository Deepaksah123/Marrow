package in.juspay.hyperqr;

import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class QrBridge$scanQRFromGallery$1$2 extends MagicModuleUseCase implements getAnswerMap<String, getShowPopup> {
    final /* synthetic */ String $callback;
    final /* synthetic */ QrBridge this$0;

    @Override // kotlin.getAnswerMap
    public final /* bridge */ /* synthetic */ getShowPopup invoke(String str) {
        invoke2(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.this$0.getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(this.$callback, this.this$0.makeFailureData(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QrBridge$scanQRFromGallery$1$2(QrBridge qrBridge, String str) {
        super(1);
        this.this$0 = qrBridge;
        this.$callback = str;
    }
}

package in.juspay.hyperqr;

import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CameraStreamScanner$startCamera$1$imageAnalyzer$1$analyzer$1 extends MagicModuleUseCase implements getAnswerMap<String, getShowPopup> {
    final /* synthetic */ CameraStreamScanner this$0;

    @Override // kotlin.getAnswerMap
    public final /* bridge */ /* synthetic */ getShowPopup invoke(String str) {
        invoke2(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.this$0.callback.invoke(str);
        this.this$0.releaseCameraResources();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStreamScanner$startCamera$1$imageAnalyzer$1$analyzer$1(CameraStreamScanner cameraStreamScanner) {
        super(1);
        this.this$0 = cameraStreamScanner;
    }
}

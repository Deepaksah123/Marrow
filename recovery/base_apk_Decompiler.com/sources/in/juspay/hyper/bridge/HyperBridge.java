package in.juspay.hyper.bridge;

import android.content.Intent;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.core.BridgeComponents;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lin/juspay/hyper/bridge/HyperBridge;", "Lin/juspay/hyper/bridge/HBridge;", "Lin/juspay/hyper/core/BridgeComponents;", "p0", "<init>", "(Lin/juspay/hyper/core/BridgeComponents;)V", "", "p1", "Landroid/content/Intent;", "p2", "", "onActivityResult", "(IILandroid/content/Intent;)Z", "", "", "", "onRequestPermissionResult", "(I[Ljava/lang/String;[I)Z", "", CourseConfigKeyConstantsKt.KEY_RESET, "()V", Labels.HyperSdk.TERMINATE, "bridgeComponents", "Lin/juspay/hyper/core/BridgeComponents;", "getBridgeComponents", "()Lin/juspay/hyper/core/BridgeComponents;", "getInterfaceName", "()Ljava/lang/String;", "interfaceName"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class HyperBridge implements HBridge {
    private final BridgeComponents bridgeComponents;

    public boolean onActivityResult(int p0, int p1, Intent p2) {
        return false;
    }

    public void reset() {
    }

    public void terminate() {
    }

    public HyperBridge(BridgeComponents bridgeComponents) {
        toMagicModuleMetaRepoModel.write(bridgeComponents, "");
        this.bridgeComponents = bridgeComponents;
    }

    public final BridgeComponents getBridgeComponents() {
        return this.bridgeComponents;
    }

    @Override // in.juspay.hyper.bridge.HBridge
    public String getInterfaceName() {
        String simpleName = getClass().getSimpleName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleName, "");
        return simpleName;
    }

    public boolean onRequestPermissionResult(int p0, String[] p1, int[] p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return false;
    }
}

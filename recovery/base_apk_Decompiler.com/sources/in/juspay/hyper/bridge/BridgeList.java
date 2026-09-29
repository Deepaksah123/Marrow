package in.juspay.hyper.bridge;

import android.webkit.JavascriptInterface;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b"}, d2 = {"Lin/juspay/hyper/bridge/BridgeList;", "Lin/juspay/hyper/bridge/HBridge;", "<init>", "()V", "Lin/juspay/hyper/bridge/HyperBridge;", "p0", "", "addHyperBridge", "(Lin/juspay/hyper/bridge/HyperBridge;)V", "", "getBridgeKeys", "()Ljava/lang/String;", "bridgeKeys", "", "bridgeList", "Ljava/util/Map;", "getBridgeList", "()Ljava/util/Map;", "getInterfaceName", "interfaceName"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BridgeList implements HBridge {
    private final Map<String, HyperBridge> bridgeList = new LinkedHashMap();

    public final Map<String, HyperBridge> getBridgeList() {
        return this.bridgeList;
    }

    @Override // in.juspay.hyper.bridge.HBridge
    public final String getInterfaceName() {
        String simpleName = getClass().getSimpleName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleName, "");
        return simpleName;
    }

    public final void addHyperBridge(HyperBridge p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.bridgeList.put(p0.getInterfaceName(), p0);
    }

    @JavascriptInterface
    public final String getBridgeKeys() {
        String string = new JSONArray((Collection) this.bridgeList.keySet()).toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}

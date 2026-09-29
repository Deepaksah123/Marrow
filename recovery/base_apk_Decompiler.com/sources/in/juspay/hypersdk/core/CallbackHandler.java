package in.juspay.hypersdk.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class CallbackHandler implements InvocationHandler {
    private final InflateJSON infl;
    private final JSONObject obj;

    public CallbackHandler(InflateJSON inflateJSON, JSONObject jSONObject) {
        this.obj = jSONObject;
        this.infl = inflateJSON;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if (!this.obj.has(name)) {
                return method.invoke(this, objArr);
            }
            this.infl.putInState("proxy", obj);
            this.infl.putInState("method", method);
            this.infl.putInState("args", objArr);
            return this.infl.runProps(this.obj, name, obj);
        } catch (Throwable th) {
            DuiLogger logger = this.infl.getDUI().getLogger();
            StringBuilder sb = new StringBuilder("error in callback handler");
            sb.append(th.getMessage());
            logger.e("ERROR", sb.toString());
            return new Object();
        }
    }
}

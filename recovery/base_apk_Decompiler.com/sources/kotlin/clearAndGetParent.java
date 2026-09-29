package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/JsonReadContext;", "Lo/setCurrentName;", "write", "(Lo/JsonReadContext;)Lo/setCurrentName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class clearAndGetParent {
    public static final setCurrentName write(JsonReadContext jsonReadContext) {
        if (jsonReadContext instanceof setCurrentName) {
            return (setCurrentName) jsonReadContext;
        }
        return null;
    }
}

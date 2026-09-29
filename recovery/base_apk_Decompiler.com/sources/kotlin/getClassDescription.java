package kotlin;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public interface getClassDescription {
    @Deprecated
    default getClassDescription AudioAttributesCompatParcelizer(boolean z) {
        return this;
    }

    findConstructor[] RemoteActionCompatParcelizer();

    default getClassDescription write(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        return this;
    }

    static {
        new getClassDescription() { // from class: o.findEnumType
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return getClassDescription.IconCompatParcelizer();
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[0];
    }

    default findConstructor[] write(Uri uri, Map<String, List<String>> map) {
        return RemoteActionCompatParcelizer();
    }
}

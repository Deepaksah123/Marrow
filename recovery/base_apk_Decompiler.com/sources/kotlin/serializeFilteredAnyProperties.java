package kotlin;

import java.util.List;
import kotlin.serializeFilteredFields;

/* JADX INFO: loaded from: classes2.dex */
public interface serializeFilteredAnyProperties {
    public static final serializeFilteredAnyProperties AudioAttributesCompatParcelizer = new serializeFilteredAnyProperties() { // from class: o.serializeOptionalFields
        @Override // kotlin.serializeFilteredAnyProperties
        public final List write(String str, boolean z, boolean z2) {
            return serializeFilteredFields.RemoteActionCompatParcelizer(str, z, z2);
        }
    };

    List<_writeNullKeyedEntry> write(String str, boolean z, boolean z2) throws serializeFilteredFields.write;
}

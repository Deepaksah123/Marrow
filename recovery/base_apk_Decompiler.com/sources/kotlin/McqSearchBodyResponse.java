package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class McqSearchBodyResponse extends getDisplay_id {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(List<?> list, int i) {
        if (i >= 0 && i <= IntermediateLoginResponseBody.write((List) list)) {
            return IntermediateLoginResponseBody.write((List) list) - i;
        }
        StringBuilder sb = new StringBuilder("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new newEncryptedObject(0, IntermediateLoginResponseBody.write((List) list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplBaseParcelizer(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new newEncryptedObject(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(List<?> list, int i) {
        return IntermediateLoginResponseBody.write((List) list) - i;
    }

    public static final <T> List<T> MediaBrowserCompatItemReceiver(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new getDeviceCount(list);
    }

    public static final <T> List<T> MediaBrowserCompatCustomActionResultReceiver(List<T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new getDkycToken(list);
    }
}

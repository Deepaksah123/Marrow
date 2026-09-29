package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/_verifyPrettyValueWrite;", "", "", "Lo/JsonGeneratorImpl;", "p0", "<init>", "(Ljava/util/List;)V", "read", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "", "AudioAttributesCompatParcelizer", "()Z", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _verifyPrettyValueWrite {
    private final List<JsonGeneratorImpl> read;

    public _verifyPrettyValueWrite(List<JsonGeneratorImpl> list) {
        this.read = list;
    }

    public final List<JsonGeneratorImpl> IconCompatParcelizer() {
        return this.read;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        List<JsonGeneratorImpl> list = this.read;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIconCompatParcelizer() != null) {
                return true;
            }
        }
        return false;
    }
}

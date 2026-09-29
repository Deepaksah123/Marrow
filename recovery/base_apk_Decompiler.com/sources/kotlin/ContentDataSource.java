package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/ContentDataSource;", "", "<init>", "()V", "", "Lo/getBytePosition;", "p0", "", "write", "(Ljava/util/List;)I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContentDataSource {
    public static final ContentDataSource INSTANCE = new ContentDataSource();

    private ContentDataSource() {
    }

    @getMagicModuleMeta
    public static final int write(List<getBytePosition> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = 0;
        if (p0.isEmpty()) {
            return 0;
        }
        for (getBytePosition getbyteposition : p0) {
            String read = getbyteposition.getRead();
            if (getbyteposition.getIconCompatParcelizer().getIconCompatParcelizer().length() > 0 && parseText.read(read) == r0.getAudioAttributesCompatParcelizer() - 1) {
                i++;
            }
        }
        return i;
    }
}

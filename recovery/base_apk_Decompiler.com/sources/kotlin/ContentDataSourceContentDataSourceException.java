package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/ContentDataSourceContentDataSourceException;", "", "<init>", "()V", "", "p0", "p1", "", "read", "(II)Ljava/lang/String;", "", "", "IconCompatParcelizer", "(Ljava/lang/Number;Ljava/lang/Number;)F"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContentDataSourceContentDataSourceException {
    public static final ContentDataSourceContentDataSourceException INSTANCE = new ContentDataSourceContentDataSourceException();

    private ContentDataSourceContentDataSourceException() {
    }

    public static String read(int p0, int p1) {
        if (p1 == 0) {
            return null;
        }
        double d = ((double) (p0 * 100)) / ((double) p1);
        if (d % 1.0d == 0.0d) {
            return String.valueOf((int) d);
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public static float IconCompatParcelizer(Number p0, Number p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) 0) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1, (Object) 0)) ? BitmapDescriptorFactory.HUE_RED : (p0.floatValue() / p1.floatValue()) * 100.0f;
    }
}

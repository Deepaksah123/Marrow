package kotlin;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "p0", "Lo/bufferMapProperty;", "write", "(Landroid/content/Context;)Lo/bufferMapProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _findMissing {
    public static final bufferMapProperty write(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        getBeanType getbeantypeIconCompatParcelizer = UnwrappedPropertyHandler.INSTANCE.IconCompatParcelizer(f);
        if (getbeantypeIconCompatParcelizer == null) {
            getbeantypeIconCompatParcelizer = new getBeanType(f);
        }
        return new buffered(f2, f, getbeantypeIconCompatParcelizer);
    }
}

package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e"}, d2 = {"Lo/drawTimeBar;", "", "<init>", "()V", "", "p0", "Landroid/content/Context;", "p1", "Landroid/graphics/Typeface;", "read", "(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Typeface;", "write", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class drawTimeBar {
    public static final drawTimeBar INSTANCE = new drawTimeBar();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final HashMap<String, Typeface> IconCompatParcelizer = new HashMap<>();

    private drawTimeBar() {
    }

    public static Typeface read(String p0, Context p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap<String, Typeface> map = IconCompatParcelizer;
        Typeface typefaceWrite = map.get(p0);
        if (typefaceWrite == null) {
            typefaceWrite = write(p1, p0);
        }
        map.put(p0, typefaceWrite);
        return typefaceWrite;
    }

    private static Typeface write(Context context, String str) {
        try {
            return Typeface.createFromAsset(context.getAssets(), str);
        } catch (Exception unused) {
            return null;
        }
    }
}

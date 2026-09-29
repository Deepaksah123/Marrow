package kotlin;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class getSeekTimeUs extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> RemoteActionCompatParcelizer = new getSeekTimeUs();
    private final WeakHashMap<Drawable, Integer> AudioAttributesCompatParcelizer;

    @Override // android.util.Property
    public final /* synthetic */ Integer get(Drawable drawable) {
        return read(drawable);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, Integer num) {
        write(drawable, num);
    }

    private getSeekTimeUs() {
        super(Integer.class, "drawableAlphaCompat");
        this.AudioAttributesCompatParcelizer = new WeakHashMap<>();
    }

    private static Integer read(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    private static void write(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}

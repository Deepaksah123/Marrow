package kotlin;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.getReader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/modifyTypeByAnnotation;", "", "<init>", "()V", "Landroid/graphics/Typeface;", "p0", "Lo/getReader$read;", "p1", "Landroid/content/Context;", "p2", "read", "(Landroid/graphics/Typeface;Lo/getReader$read;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "AudioAttributesCompatParcelizer", "Ljava/lang/ThreadLocal;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class modifyTypeByAnnotation {
    public static final modifyTypeByAnnotation INSTANCE = new modifyTypeByAnnotation();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static ThreadLocal<Paint> write = new ThreadLocal<>();

    private modifyTypeByAnnotation() {
    }

    public final Typeface read(Typeface p0, getReader.read p1, Context p2) {
        if (p0 == null) {
            return null;
        }
        if (p1.AudioAttributesCompatParcelizer().isEmpty()) {
            return p0;
        }
        Paint paint = write.get();
        if (paint == null) {
            paint = new Paint();
            write.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(p0);
        paint.setFontVariationSettings(createDummyInstance.RemoteActionCompatParcelizer(p1, p2));
        return paint.getTypeface();
    }
}

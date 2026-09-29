package kotlin;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createFromInt;", "", "<init>", "()V", "Landroid/graphics/Typeface;", "p0", "Landroid/text/style/TypefaceSpan;", "write", "(Landroid/graphics/Typeface;)Landroid/text/style/TypefaceSpan;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class createFromInt {
    public static final createFromInt INSTANCE = new createFromInt();

    private createFromInt() {
    }

    public final TypefaceSpan write(Typeface p0) {
        return new TypefaceSpan(p0);
    }
}

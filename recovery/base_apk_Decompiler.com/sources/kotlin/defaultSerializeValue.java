package kotlin;

import android.content.ClipboardManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/defaultSerializeValue;", "", "<init>", "()V", "Landroid/content/ClipboardManager;", "p0", "", "write", "(Landroid/content/ClipboardManager;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class defaultSerializeValue {
    public static final defaultSerializeValue INSTANCE = new defaultSerializeValue();

    private defaultSerializeValue() {
    }

    @getMagicModuleMeta
    public static final void write(ClipboardManager p0) {
        p0.clearPrimaryClip();
    }
}

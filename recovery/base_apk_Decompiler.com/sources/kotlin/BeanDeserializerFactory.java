package kotlin;

import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/BeanDeserializerFactory;", "", "<init>", "()V", "Landroid/text/StaticLayout$Builder;", "p0", "", "write", "(Landroid/text/StaticLayout$Builder;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BeanDeserializerFactory {
    public static final BeanDeserializerFactory INSTANCE = new BeanDeserializerFactory();

    private BeanDeserializerFactory() {
    }

    @getMagicModuleMeta
    public static final void write(StaticLayout.Builder p0) {
        p0.setUseBoundsForWidth(false);
    }
}

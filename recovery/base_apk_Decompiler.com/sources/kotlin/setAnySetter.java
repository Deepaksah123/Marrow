package kotlin;

import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setAnySetter;", "", "<init>", "()V", "Landroid/text/StaticLayout$Builder;", "p0", "", "p1", "", "IconCompatParcelizer", "(Landroid/text/StaticLayout$Builder;Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setAnySetter {
    public static final setAnySetter INSTANCE = new setAnySetter();

    private setAnySetter() {
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(StaticLayout.Builder p0, boolean p1) {
        p0.setUseLineSpacingFromFallbacks(p1);
    }
}

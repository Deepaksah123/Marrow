package kotlin;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/setIgnoreUnknownProperties;", "", "<init>", "()V", "Landroid/text/StaticLayout;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/text/StaticLayout;)Z", "Landroid/text/StaticLayout$Builder;", "", "p1", "p2", "", "write", "(Landroid/text/StaticLayout$Builder;II)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setIgnoreUnknownProperties {
    public static final setIgnoreUnknownProperties INSTANCE = new setIgnoreUnknownProperties();

    private setIgnoreUnknownProperties() {
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(StaticLayout p0) {
        return p0.isFallbackLineSpacingEnabled();
    }

    @getMagicModuleMeta
    public static final void write(StaticLayout.Builder p0, int p1, int p2) {
        p0.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(p1).setLineBreakWordStyle(p2).build());
    }
}

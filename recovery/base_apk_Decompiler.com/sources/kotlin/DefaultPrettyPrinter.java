package kotlin;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/DefaultPrettyPrinter;", "Lo/parseVersionPart;", "Landroid/graphics/RenderEffect;", "p0", "<init>", "(Landroid/graphics/RenderEffect;)V", "cd_", "()Landroid/graphics/RenderEffect;", "read", "Landroid/graphics/RenderEffect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultPrettyPrinter extends parseVersionPart {
    private final RenderEffect read;

    public DefaultPrettyPrinter(RenderEffect renderEffect) {
        super(null);
        this.read = renderEffect;
    }

    @Override // kotlin.parseVersionPart
    /* JADX INFO: renamed from: cd_, reason: from getter */
    protected final RenderEffect getRead() {
        return this.read;
    }
}

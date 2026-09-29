package kotlin;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f"}, d2 = {"Lo/parseVersionPart;", "", "<init>", "()V", "Landroid/graphics/RenderEffect;", "cc_", "()Landroid/graphics/RenderEffect;", "cd_", "AudioAttributesCompatParcelizer", "Landroid/graphics/RenderEffect;", "read", "Lo/DefaultPrettyPrinter;", "Lo/JacksonFeatureSet;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class parseVersionPart {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private RenderEffect read;

    protected abstract RenderEffect cd_();

    private parseVersionPart() {
    }

    public final RenderEffect cc_() {
        RenderEffect renderEffect = this.read;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectCd_ = cd_();
        this.read = renderEffectCd_;
        return renderEffectCd_;
    }

    public /* synthetic */ parseVersionPart(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}

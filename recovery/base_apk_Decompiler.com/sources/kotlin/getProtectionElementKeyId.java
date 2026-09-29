package kotlin;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.SsManifestParserSmoothStreamingMediaParser;
import kotlin.swap;

/* JADX INFO: loaded from: classes3.dex */
public final class getProtectionElementKeyId extends skipInput<swap.AudioAttributesCompatParcelizer, repositionVerticalCue<swap.AudioAttributesCompatParcelizer>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getProtectionElementKeyId(swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(audioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
    }

    @Override // kotlin.skipInput
    public final repositionVerticalCue<swap.AudioAttributesCompatParcelizer> read(ViewGroup viewGroup, int i) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        SsManifestParserSmoothStreamingMediaParser.Companion companion = SsManifestParserSmoothStreamingMediaParser.INSTANCE;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterFrom, "");
        P p = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p, "");
        return SsManifestParserSmoothStreamingMediaParser.Companion.IconCompatParcelizer(layoutInflaterFrom, viewGroup, (swap.AudioAttributesCompatParcelizer) p);
    }
}

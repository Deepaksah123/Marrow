package kotlin;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.WebvttSubtitleExternalSyntheticLambda0;
import kotlin.createCurrentContentIntent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/WebvttSubtitle;", "Lo/skipInput;", "Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;", "Lo/repositionVerticalCue;", "p0", "<init>", "(Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;)V", "Landroid/view/ViewGroup;", "", "p1", "read", "(Landroid/view/ViewGroup;I)Lo/repositionVerticalCue;", "", "IconCompatParcelizer", "(I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebvttSubtitle extends skipInput<WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer, repositionVerticalCue<WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebvttSubtitle(WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer) {
        super(iconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
    }

    @Override // kotlin.skipInput
    public final repositionVerticalCue<WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer> read(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        createCurrentContentIntent.Companion readVar = createCurrentContentIntent.INSTANCE;
        P p = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p, "");
        return createCurrentContentIntent.Companion.RemoteActionCompatParcelizer(p0, (WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer) p);
    }

    public final void IconCompatParcelizer(int p0) {
        IconCompatParcelizer().write(p0);
    }
}

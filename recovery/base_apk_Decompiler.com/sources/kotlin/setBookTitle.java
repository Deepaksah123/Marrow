package kotlin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class setBookTitle extends CustomTextView {
    private CustomTextView write;

    public final CustomTextView AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public setBookTitle(CustomTextView customTextView) {
        toMagicModuleMetaRepoModel.write(customTextView, "");
        this.write = customTextView;
    }

    public final setBookTitle IconCompatParcelizer(CustomTextView customTextView) {
        toMagicModuleMetaRepoModel.write(customTextView, "");
        this.write = customTextView;
        return this;
    }

    @Override // kotlin.CustomTextView
    public final CustomTextView read(long j, TimeUnit timeUnit) {
        toMagicModuleMetaRepoModel.write(timeUnit, "");
        return this.write.read(j, timeUnit);
    }

    @Override // kotlin.CustomTextView
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
    public final long getIconCompatParcelizer() {
        return this.write.getIconCompatParcelizer();
    }

    @Override // kotlin.CustomTextView
    /* JADX INFO: renamed from: bp_ */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.write.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.CustomTextView
    public final long bo_() {
        return this.write.bo_();
    }

    @Override // kotlin.CustomTextView
    public final CustomTextView IconCompatParcelizer(long j) {
        return this.write.IconCompatParcelizer(j);
    }

    @Override // kotlin.CustomTextView
    public final CustomTextView bn_() {
        return this.write.bn_();
    }

    @Override // kotlin.CustomTextView
    public final CustomTextView br_() {
        return this.write.br_();
    }

    @Override // kotlin.CustomTextView
    public final void bq_() throws IOException {
        this.write.bq_();
    }
}

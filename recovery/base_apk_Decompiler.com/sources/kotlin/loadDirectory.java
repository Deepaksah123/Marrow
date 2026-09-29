package kotlin;

import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class loadDirectory implements loadUid {
    private final SlidingWeightedAverageBandwidthStatistic IconCompatParcelizer;
    private final lambdagetMaxCountEvictionFunction0 RemoteActionCompatParcelizer;

    @setSdkPayload
    public loadDirectory(lambdagetMaxCountEvictionFunction0 lambdagetmaxcountevictionfunction0, SlidingWeightedAverageBandwidthStatistic slidingWeightedAverageBandwidthStatistic) {
        toMagicModuleMetaRepoModel.write(lambdagetmaxcountevictionfunction0, "");
        toMagicModuleMetaRepoModel.write(slidingWeightedAverageBandwidthStatistic, "");
        this.RemoteActionCompatParcelizer = lambdagetmaxcountevictionfunction0;
        this.IconCompatParcelizer = slidingWeightedAverageBandwidthStatistic;
    }

    @Override // kotlin.loadUid
    public final Object read() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(R.string.f_send_email_title_free);
    }

    @Override // kotlin.loadUid
    public final Object write() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(R.string.f_send_email_title_pro);
    }

    @Override // kotlin.loadUid
    public final Object read(String str) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(R.string.f_get_callback, new Object[]{str});
    }

    @Override // kotlin.loadUid
    public final Object AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(R.string.f_get_callback_email_signature, new Object[]{this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), str, str2, this.IconCompatParcelizer.read(), this.IconCompatParcelizer.RemoteActionCompatParcelizer(), this.IconCompatParcelizer.IconCompatParcelizer(), str3});
    }
}

package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class getMaxCountEvictionFunction implements SlidingWeightedAverageBandwidthStatistic {
    @setSdkPayload
    public getMaxCountEvictionFunction() {
    }

    @Override // kotlin.SlidingWeightedAverageBandwidthStatistic
    public final String read() {
        return "12.0.0";
    }

    @Override // kotlin.SlidingWeightedAverageBandwidthStatistic
    public final String RemoteActionCompatParcelizer() {
        return "496";
    }

    @Override // kotlin.SlidingWeightedAverageBandwidthStatistic
    public final String IconCompatParcelizer() {
        String str = Build.VERSION.RELEASE;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    @Override // kotlin.SlidingWeightedAverageBandwidthStatistic
    public final String AudioAttributesCompatParcelizer() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(str2);
        return sb.toString();
    }
}

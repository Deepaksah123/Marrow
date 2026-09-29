package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class getPackageInfo {
    private final RecyclerView AudioAttributesCompatParcelizer;
    private final ViewPager2 read;
    private final getLaunchIntentForPackage write;

    public getPackageInfo(ViewPager2 viewPager2, getLaunchIntentForPackage getlaunchintentforpackage, RecyclerView recyclerView) {
        this.read = viewPager2;
        this.write = getlaunchintentforpackage;
        this.AudioAttributesCompatParcelizer = recyclerView;
    }

    public final boolean write() {
        return this.write.write();
    }
}

package kotlin;

import com.marrow2.ui.review_components.ui.pagers.ReviewPagerViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getStartCap implements getCreatedOnDateMs {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    private /* synthetic */ getCreatedOnDateMs RemoteActionCompatParcelizer;
    private /* synthetic */ ReviewPagerViewModel write;

    public /* synthetic */ getStartCap(getCreatedOnDateMs getcreatedondatems, ReviewPagerViewModel reviewPagerViewModel) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
        this.write = reviewPagerViewModel;
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 9049313;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        AudioAttributesCompatParcelizer = i3;
        return i3;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return getZIndex.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
    }
}

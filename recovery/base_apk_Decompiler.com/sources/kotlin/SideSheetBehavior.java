package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SideSheetBehavior implements getCreatedOnDateMs {
    public static int IconCompatParcelizer;
    public static int write;
    private /* synthetic */ setMenuItemsAnimated read;

    public /* synthetic */ SideSheetBehavior(setMenuItemsAnimated setmenuitemsanimated) {
        this.read = setmenuitemsanimated;
    }

    public static int read() {
        int i = IconCompatParcelizer;
        int i2 = i % 7605426;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        write = iFreeMemory;
        return iFreeMemory;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return Boolean.valueOf(setMenuItemsAnimated.MediaBrowserCompatSearchResultReceiver(this.read));
    }
}

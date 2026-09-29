package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u000f\u001a\u001d\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u0010*\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u0010*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u0011*\u00020\u0010*\u00028\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0015"}, d2 = {"", "p0", "Lo/setHoverListener;", "read", "(F)Lo/setHoverListener;", "p1", "Lo/MenuPopupWindowMenuDropDownListView;", "IconCompatParcelizer", "(FF)Lo/MenuPopupWindowMenuDropDownListView;", "p2", "Lo/ListPopupWindow;", "write", "(FFF)Lo/ListPopupWindow;", "p3", "Lo/setAppSearchData;", "(FFFF)Lo/setAppSearchData;", "Lo/ScrollingTabContainerView;", "T", "(Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "AudioAttributesCompatParcelizer", "", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SearchView {
    public static final setHoverListener read(float f) {
        return new setHoverListener(f);
    }

    public static final MenuPopupWindowMenuDropDownListView IconCompatParcelizer(float f, float f2) {
        return new MenuPopupWindowMenuDropDownListView(f, f2);
    }

    public static final ListPopupWindow write(float f, float f2, float f3) {
        return new ListPopupWindow(f, f2, f3);
    }

    public static final setAppSearchData IconCompatParcelizer(float f, float f2, float f3, float f4) {
        return new setAppSearchData(f, f2, f3, f4);
    }

    public static final <T extends ScrollingTabContainerView> T IconCompatParcelizer(T t) {
        T t2 = (T) t.read();
        toMagicModuleMetaRepoModel.read(t2, "");
        return t2;
    }

    public static final <T extends ScrollingTabContainerView> T AudioAttributesCompatParcelizer(T t) {
        T t2 = (T) IconCompatParcelizer(t);
        int write = t2.getIconCompatParcelizer();
        for (int i = 0; i < write; i++) {
            t2.IconCompatParcelizer(i, t.read(i));
        }
        return t2;
    }

    public static final <T extends ScrollingTabContainerView> void AudioAttributesCompatParcelizer(T t, T t2) {
        int write = t.getIconCompatParcelizer();
        for (int i = 0; i < write; i++) {
            t.IconCompatParcelizer(i, t2.read(i));
        }
    }
}

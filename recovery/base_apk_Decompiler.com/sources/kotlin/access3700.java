package kotlin;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class access3700 extends _addGetterMethod {
    private final List<String> read;
    private final Fragment[] write;

    public access3700(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.read = new ArrayList();
        this.write = new Fragment[i];
    }

    @Override // kotlin.getComponentEnabledSetting
    public final int AudioAttributesCompatParcelizer() {
        return this.write.length;
    }

    @Override // kotlin._addGetterMethod
    public final Fragment AudioAttributesCompatParcelizer(int i) {
        return this.write[i];
    }

    @Override // kotlin.getComponentEnabledSetting
    public final CharSequence read(int i) {
        return this.read.get(i);
    }

    @Override // kotlin._addGetterMethod, kotlin.getComponentEnabledSetting
    public final Object read(ViewGroup viewGroup, int i) {
        Object obj = super.read(viewGroup, i);
        this.write[i] = (Fragment) obj;
        return obj;
    }

    final void IconCompatParcelizer(Fragment fragment, String str, int i) {
        this.write[i] = fragment;
        this.read.add(str);
    }
}

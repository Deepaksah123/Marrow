package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AviExtractor {
    public abstract int AudioAttributesCompatParcelizer();

    public abstract int AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout);

    public abstract boolean AudioAttributesCompatParcelizer(float f);

    public abstract boolean AudioAttributesCompatParcelizer(View view);

    public abstract int IconCompatParcelizer();

    public abstract <V extends View> int IconCompatParcelizer(V v);

    public abstract void IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int RemoteActionCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean RemoteActionCompatParcelizer(View view, float f);

    public abstract int read();

    public abstract int read(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean read(float f, float f2);

    public abstract float write(int i);

    public abstract int write();

    public abstract void write(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    AviExtractor() {
    }
}

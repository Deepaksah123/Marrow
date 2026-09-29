package kotlin;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes5.dex */
public final class copyWithVorbisComments extends onRequestPermissionsResult {
    private final int AudioAttributesCompatParcelizer;
    private final Class<?> read;

    public copyWithVorbisComments(Context context, Class<?> cls, int i) {
        super(context);
        this.read = cls;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.onRequestPermissionsResult, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read.getSimpleName());
        sb.append(" does not support submenus");
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // kotlin.onRequestPermissionsResult
    public final MenuItem write(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > this.AudioAttributesCompatParcelizer) {
            String simpleName = this.read.getSimpleName();
            StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
            sb.append(simpleName);
            sb.append(" is ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(". Limit can be checked with ");
            sb.append(simpleName);
            sb.append("#getMaxItemCount()");
            throw new IllegalArgumentException(sb.toString());
        }
        onFastForward();
        MenuItem menuItemWrite = super.write(i, i2, i3, charSequence);
        if (menuItemWrite instanceof onRetainNonConfigurationInstance) {
            ((onRetainNonConfigurationInstance) menuItemWrite).write(true);
        }
        onCustomAction();
        return menuItemWrite;
    }
}

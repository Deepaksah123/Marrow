package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class removeMenuProvider extends onPictureInPictureModeChanged implements Menu {
    private final handleNestedArrayForSingle write;

    public removeMenuProvider(Context context, handleNestedArrayForSingle handlenestedarrayforsingle) {
        super(context);
        if (handlenestedarrayforsingle == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.write = handlenestedarrayforsingle;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return IconCompatParcelizer(this.write.add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return IconCompatParcelizer(this.write.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return IconCompatParcelizer(this.write.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return IconCompatParcelizer(this.write.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return read(this.write.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return read(this.write.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return read(this.write.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return read(this.write.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.write.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = IconCompatParcelizer(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        AudioAttributesCompatParcelizer(i);
        this.write.removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        read(i);
        this.write.removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        IconCompatParcelizer();
        this.write.clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.write.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.write.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.write.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.write.hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return IconCompatParcelizer(this.write.findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return this.write.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return IconCompatParcelizer(this.write.getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        this.write.close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.write.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.write.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.write.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.write.setQwertyMode(z);
    }
}

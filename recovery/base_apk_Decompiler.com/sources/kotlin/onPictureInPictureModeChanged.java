package kotlin;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
abstract class onPictureInPictureModeChanged {
    private AppCompatCheckBox<_parse, SubMenu> AudioAttributesCompatParcelizer;
    final Context read;
    private AppCompatCheckBox<handleMissingEndArrayForSingle, MenuItem> write;

    onPictureInPictureModeChanged(Context context) {
        this.read = context;
    }

    final MenuItem IconCompatParcelizer(MenuItem menuItem) {
        if (!(menuItem instanceof handleMissingEndArrayForSingle)) {
            return menuItem;
        }
        handleMissingEndArrayForSingle handlemissingendarrayforsingle = (handleMissingEndArrayForSingle) menuItem;
        if (this.write == null) {
            this.write = new AppCompatCheckBox<>();
        }
        MenuItem menuItem2 = this.write.get(handlemissingendarrayforsingle);
        if (menuItem2 != null) {
            return menuItem2;
        }
        onUserLeaveHint onuserleavehint = new onUserLeaveHint(this.read, handlemissingendarrayforsingle);
        this.write.put(handlemissingendarrayforsingle, onuserleavehint);
        return onuserleavehint;
    }

    final SubMenu read(SubMenu subMenu) {
        if (!(subMenu instanceof _parse)) {
            return subMenu;
        }
        _parse _parseVar = (_parse) subMenu;
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new AppCompatCheckBox<>();
        }
        SubMenu subMenu2 = this.AudioAttributesCompatParcelizer.get(_parseVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        removeOnMultiWindowModeChangedListener removeonmultiwindowmodechangedlistener = new removeOnMultiWindowModeChangedListener(this.read, _parseVar);
        this.AudioAttributesCompatParcelizer.put(_parseVar, removeonmultiwindowmodechangedlistener);
        return removeonmultiwindowmodechangedlistener;
    }

    final void IconCompatParcelizer() {
        AppCompatCheckBox<handleMissingEndArrayForSingle, MenuItem> appCompatCheckBox = this.write;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.clear();
        }
        AppCompatCheckBox<_parse, SubMenu> appCompatCheckBox2 = this.AudioAttributesCompatParcelizer;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.clear();
        }
    }

    final void read(int i) {
        if (this.write != null) {
            int i2 = 0;
            while (i2 < this.write.getRemoteActionCompatParcelizer()) {
                if (this.write.write(i2).getGroupId() == i) {
                    this.write.AudioAttributesCompatParcelizer(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    final void AudioAttributesCompatParcelizer(int i) {
        if (this.write != null) {
            for (int i2 = 0; i2 < this.write.getRemoteActionCompatParcelizer(); i2++) {
                if (this.write.write(i2).getItemId() == i) {
                    this.write.AudioAttributesCompatParcelizer(i2);
                    return;
                }
            }
        }
    }
}

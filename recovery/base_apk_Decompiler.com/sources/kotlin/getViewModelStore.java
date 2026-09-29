package kotlin;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import kotlin.onActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class getViewModelStore extends ActionMode {
    final onActivityResult AudioAttributesCompatParcelizer;
    final Context RemoteActionCompatParcelizer;

    public getViewModelStore(Context context, onActivityResult onactivityresult) {
        this.RemoteActionCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = onactivityresult;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.write(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new removeMenuProvider(this.RemoteActionCompatParcelizer, (handleNestedArrayForSingle) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.AudioAttributesCompatParcelizer.read(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.AudioAttributesCompatParcelizer.RatingCompat();
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.AudioAttributesCompatParcelizer.write(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    public static class read implements onActivityResult.write {
        final ActionMode.Callback read;
        final Context write;
        final ArrayList<getViewModelStore> RemoteActionCompatParcelizer = new ArrayList<>();
        final AppCompatCheckBox<Menu, Menu> IconCompatParcelizer = new AppCompatCheckBox<>();

        public read(Context context, ActionMode.Callback callback) {
            this.write = context;
            this.read = callback;
        }

        @Override // o.onActivityResult.write
        public final boolean AudioAttributesCompatParcelizer(onActivityResult onactivityresult, Menu menu) {
            return this.read.onCreateActionMode(write(onactivityresult), read(menu));
        }

        @Override // o.onActivityResult.write
        public final boolean RemoteActionCompatParcelizer(onActivityResult onactivityresult, Menu menu) {
            return this.read.onPrepareActionMode(write(onactivityresult), read(menu));
        }

        @Override // o.onActivityResult.write
        public final boolean IconCompatParcelizer(onActivityResult onactivityresult, MenuItem menuItem) {
            return this.read.onActionItemClicked(write(onactivityresult), new onUserLeaveHint(this.write, (handleMissingEndArrayForSingle) menuItem));
        }

        @Override // o.onActivityResult.write
        public final void RemoteActionCompatParcelizer(onActivityResult onactivityresult) {
            this.read.onDestroyActionMode(write(onactivityresult));
        }

        private Menu read(Menu menu) {
            Menu menu2 = this.IconCompatParcelizer.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            removeMenuProvider removemenuprovider = new removeMenuProvider(this.write, (handleNestedArrayForSingle) menu);
            this.IconCompatParcelizer.put(menu, removemenuprovider);
            return removemenuprovider;
        }

        public final ActionMode write(onActivityResult onactivityresult) {
            int size = this.RemoteActionCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                getViewModelStore getviewmodelstore = this.RemoteActionCompatParcelizer.get(i);
                if (getviewmodelstore != null && getviewmodelstore.AudioAttributesCompatParcelizer == onactivityresult) {
                    return getviewmodelstore;
                }
            }
            getViewModelStore getviewmodelstore2 = new getViewModelStore(this.write, onactivityresult);
            this.RemoteActionCompatParcelizer.add(getviewmodelstore2);
            return getviewmodelstore2;
        }
    }
}

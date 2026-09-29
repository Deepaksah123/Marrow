package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import kotlin.ThrowableDeserializer;

/* JADX INFO: loaded from: classes.dex */
public final class onUserLeaveHint extends onPictureInPictureModeChanged implements MenuItem {
    private final handleMissingEndArrayForSingle AudioAttributesCompatParcelizer;
    private Method RemoteActionCompatParcelizer;

    public onUserLeaveHint(Context context, handleMissingEndArrayForSingle handlemissingendarrayforsingle) {
        super(context);
        if (handlemissingendarrayforsingle == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.AudioAttributesCompatParcelizer = handlemissingendarrayforsingle;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.AudioAttributesCompatParcelizer.getItemId();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.AudioAttributesCompatParcelizer.getGroupId();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.AudioAttributesCompatParcelizer.getOrder();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.AudioAttributesCompatParcelizer.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.AudioAttributesCompatParcelizer.getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.AudioAttributesCompatParcelizer.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.AudioAttributesCompatParcelizer.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.AudioAttributesCompatParcelizer.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.AudioAttributesCompatParcelizer.getIcon();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.AudioAttributesCompatParcelizer.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.AudioAttributesCompatParcelizer.getIntent();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.AudioAttributesCompatParcelizer.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.AudioAttributesCompatParcelizer.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.AudioAttributesCompatParcelizer.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.AudioAttributesCompatParcelizer.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.AudioAttributesCompatParcelizer.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.AudioAttributesCompatParcelizer.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.AudioAttributesCompatParcelizer.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.AudioAttributesCompatParcelizer.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.AudioAttributesCompatParcelizer.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.AudioAttributesCompatParcelizer.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.AudioAttributesCompatParcelizer.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.AudioAttributesCompatParcelizer.isCheckable();
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.AudioAttributesCompatParcelizer.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.AudioAttributesCompatParcelizer.isChecked();
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.AudioAttributesCompatParcelizer.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.AudioAttributesCompatParcelizer.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.AudioAttributesCompatParcelizer.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.AudioAttributesCompatParcelizer.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.AudioAttributesCompatParcelizer.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return read(this.AudioAttributesCompatParcelizer.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.AudioAttributesCompatParcelizer.setOnMenuItemClickListener(onMenuItemClickListener != null ? new AudioAttributesCompatParcelizer(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.AudioAttributesCompatParcelizer.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.AudioAttributesCompatParcelizer.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.AudioAttributesCompatParcelizer.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new IconCompatParcelizer(view);
        }
        this.AudioAttributesCompatParcelizer.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        this.AudioAttributesCompatParcelizer.setActionView(i);
        View actionView = this.AudioAttributesCompatParcelizer.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.AudioAttributesCompatParcelizer.setActionView(new IconCompatParcelizer(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.AudioAttributesCompatParcelizer.getActionView();
        return actionView instanceof IconCompatParcelizer ? ((IconCompatParcelizer) actionView).read() : actionView;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.read, actionProvider);
        handleMissingEndArrayForSingle handlemissingendarrayforsingle = this.AudioAttributesCompatParcelizer;
        if (actionProvider == null) {
            remoteActionCompatParcelizer = null;
        }
        handlemissingendarrayforsingle.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ThrowableDeserializer throwableDeserializerRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        if (throwableDeserializerRemoteActionCompatParcelizer instanceof read) {
            return ((read) throwableDeserializerRemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.AudioAttributesCompatParcelizer.expandActionView();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.AudioAttributesCompatParcelizer.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.AudioAttributesCompatParcelizer.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.AudioAttributesCompatParcelizer.setOnActionExpandListener(onActionExpandListener != null ? new write(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.AudioAttributesCompatParcelizer.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.AudioAttributesCompatParcelizer.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.AudioAttributesCompatParcelizer.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.AudioAttributesCompatParcelizer.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.AudioAttributesCompatParcelizer.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.AudioAttributesCompatParcelizer.getIconTintMode();
    }

    public final void read() {
        try {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.RemoteActionCompatParcelizer.invoke(this.AudioAttributesCompatParcelizer, Boolean.TRUE);
        } catch (Exception unused) {
        }
    }

    class AudioAttributesCompatParcelizer implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener IconCompatParcelizer;

        AudioAttributesCompatParcelizer(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.IconCompatParcelizer = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.IconCompatParcelizer.onMenuItemClick(onUserLeaveHint.this.IconCompatParcelizer(menuItem));
        }
    }

    class write implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener RemoteActionCompatParcelizer;

        write(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.RemoteActionCompatParcelizer = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.RemoteActionCompatParcelizer.onMenuItemActionExpand(onUserLeaveHint.this.IconCompatParcelizer(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.RemoteActionCompatParcelizer.onMenuItemActionCollapse(onUserLeaveHint.this.IconCompatParcelizer(menuItem));
        }
    }

    class read extends ThrowableDeserializer {
        final ActionProvider RemoteActionCompatParcelizer;

        read(Context context, ActionProvider actionProvider) {
            super(context);
            this.RemoteActionCompatParcelizer = actionProvider;
        }

        @Override // kotlin.ThrowableDeserializer
        public View AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.onCreateActionView();
        }

        @Override // kotlin.ThrowableDeserializer
        public boolean write() {
            return this.RemoteActionCompatParcelizer.onPerformDefaultAction();
        }

        @Override // kotlin.ThrowableDeserializer
        public boolean read() {
            return this.RemoteActionCompatParcelizer.hasSubMenu();
        }

        @Override // kotlin.ThrowableDeserializer
        public void write(SubMenu subMenu) {
            this.RemoteActionCompatParcelizer.onPrepareSubMenu(onUserLeaveHint.this.read(subMenu));
        }
    }

    class RemoteActionCompatParcelizer extends read implements ActionProvider.VisibilityListener {
        private ThrowableDeserializer.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        RemoteActionCompatParcelizer(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // kotlin.ThrowableDeserializer
        public View AudioAttributesCompatParcelizer(MenuItem menuItem) {
            return ((read) this).RemoteActionCompatParcelizer.onCreateActionView(menuItem);
        }

        @Override // kotlin.ThrowableDeserializer
        public boolean RemoteActionCompatParcelizer() {
            return ((read) this).RemoteActionCompatParcelizer.overridesItemVisibility();
        }

        @Override // kotlin.ThrowableDeserializer
        public boolean IconCompatParcelizer() {
            return ((read) this).RemoteActionCompatParcelizer.isVisible();
        }

        @Override // kotlin.ThrowableDeserializer
        public void RemoteActionCompatParcelizer(ThrowableDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
            ActionProvider actionProvider = ((read) this).RemoteActionCompatParcelizer;
            if (audioAttributesCompatParcelizer == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            ThrowableDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.write();
            }
        }
    }

    static class IconCompatParcelizer extends FrameLayout implements invalidateMenu {
        final CollapsibleActionView RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(View view) {
            super(view.getContext());
            this.RemoteActionCompatParcelizer = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // kotlin.invalidateMenu
        public final void IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer.onActionViewExpanded();
        }

        @Override // kotlin.invalidateMenu
        public final void write() {
            this.RemoteActionCompatParcelizer.onActionViewCollapsed();
        }

        final View read() {
            return (View) this.RemoteActionCompatParcelizer;
        }
    }
}

package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.InvalidTypeIdException;
import kotlin._addSuperTypes;
import kotlin._init_lambda5;
import kotlin._parseDoublePrimitive;
import kotlin.calculateNextSearchBytePosition;
import kotlin.deserializeUsingCustom;
import kotlin.findFormatOverrides;
import kotlin.hasSuperClassStartingWith;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.registerForActivityResult;
import kotlin.setItemInvoker;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements registerForActivityResult.AudioAttributesCompatParcelizer {
    private static final int[] write = {R.attr.state_checked};
    boolean AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private onRetainNonConfigurationInstance AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private Drawable IconCompatParcelizer;
    private ColorStateList MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final CheckedTextView MediaBrowserCompatMediaItem;
    private boolean MediaMetadataCompat;
    private final deserializeUsingCustom RemoteActionCompatParcelizer;
    private FrameLayout read;

    public void setShortcut(boolean z, char c) {
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final boolean write() {
        return false;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatItemReceiver = true;
        deserializeUsingCustom deserializeusingcustom = new deserializeUsingCustom() { // from class: com.google.android.material.internal.NavigationMenuItemView.5
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(NavigationMenuItemView.this.AudioAttributesCompatParcelizer);
            }
        };
        this.RemoteActionCompatParcelizer = deserializeusingcustom;
        setOrientation(0);
        LayoutInflater.from(context).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.design_menu_item_text);
        this.MediaBrowserCompatMediaItem = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(checkedTextView, deserializeusingcustom);
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        this.AudioAttributesImplApi26Parcelizer = onretainnonconfigurationinstance;
        if (onretainnonconfigurationinstance.getItemId() > 0) {
            setId(onretainnonconfigurationinstance.getItemId());
        }
        setVisibility(onretainnonconfigurationinstance.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            InvalidTypeIdException.read(this, RemoteActionCompatParcelizer());
        }
        setCheckable(onretainnonconfigurationinstance.isCheckable());
        setChecked(onretainnonconfigurationinstance.isChecked());
        setEnabled(onretainnonconfigurationinstance.isEnabled());
        setTitle(onretainnonconfigurationinstance.getTitle());
        setIcon(onretainnonconfigurationinstance.getIcon());
        IconCompatParcelizer(onretainnonconfigurationinstance.getActionView());
        setContentDescription(onretainnonconfigurationinstance.getContentDescription());
        setItemInvoker.AudioAttributesCompatParcelizer(this, onretainnonconfigurationinstance.getTooltipText());
        AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance, boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
        AudioAttributesCompatParcelizer(onretainnonconfigurationinstance);
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.getTitle() == null && this.AudioAttributesImplApi26Parcelizer.getIcon() == null && this.AudioAttributesImplApi26Parcelizer.getActionView() != null;
    }

    private void AudioAttributesCompatParcelizer() {
        if (AudioAttributesImplBaseParcelizer()) {
            this.MediaBrowserCompatMediaItem.setVisibility(8);
            FrameLayout frameLayout = this.read;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                this.read.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.MediaBrowserCompatMediaItem.setVisibility(0);
        FrameLayout frameLayout2 = this.read;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((ViewGroup.LayoutParams) layoutParams2).width = -2;
            this.read.setLayoutParams(layoutParams2);
        }
    }

    public final void read() {
        FrameLayout frameLayout = this.read;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.MediaBrowserCompatMediaItem.setCompoundDrawables(null, null, null, null);
    }

    private void IconCompatParcelizer(View view) {
        if (view != null) {
            if (this.read == null) {
                this.read = (FrameLayout) ((ViewStub) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.design_menu_item_action_area_stub)).inflate();
            }
            this.read.removeAllViews();
            this.read.addView(view);
        }
    }

    private StateListDrawable RemoteActionCompatParcelizer() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(_init_lambda5.read.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(write, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final onRetainNonConfigurationInstance IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void setTitle(CharSequence charSequence) {
        this.MediaBrowserCompatMediaItem.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.AudioAttributesCompatParcelizer != z) {
            this.AudioAttributesCompatParcelizer = z;
            this.RemoteActionCompatParcelizer.sendAccessibilityEvent(this.MediaBrowserCompatMediaItem, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.MediaBrowserCompatMediaItem.setChecked(z);
        CheckedTextView checkedTextView = this.MediaBrowserCompatMediaItem;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.MediaBrowserCompatItemReceiver) ? 1 : 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.AudioAttributesImplBaseParcelizer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            int i = this.AudioAttributesImplApi21Parcelizer;
            drawable.setBounds(0, 0, i, i);
        } else if (this.MediaMetadataCompat) {
            if (this.IconCompatParcelizer == null) {
                Drawable drawable2 = _parseDoublePrimitive.read(getResources(), calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.navigation_empty_icon, getContext().getTheme());
                this.IconCompatParcelizer = drawable2;
                if (drawable2 != null) {
                    int i2 = this.AudioAttributesImplApi21Parcelizer;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.IconCompatParcelizer;
        }
        _addSuperTypes.read(this.MediaBrowserCompatMediaItem, drawable, null, null, null);
    }

    public void setIconSize(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.AudioAttributesImplApi26Parcelizer;
        if (onretainnonconfigurationinstance != null && onretainnonconfigurationinstance.isCheckable() && this.AudioAttributesImplApi26Parcelizer.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, write);
        }
        return iArrOnCreateDrawableState;
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        this.MediaBrowserCompatCustomActionResultReceiver = colorStateList;
        this.AudioAttributesImplBaseParcelizer = colorStateList != null;
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.AudioAttributesImplApi26Parcelizer;
        if (onretainnonconfigurationinstance != null) {
            setIcon(onretainnonconfigurationinstance.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        _addSuperTypes.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.MediaBrowserCompatMediaItem.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.MediaMetadataCompat = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconPadding(int i) {
        this.MediaBrowserCompatMediaItem.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.MediaBrowserCompatMediaItem.setMaxLines(i);
    }
}

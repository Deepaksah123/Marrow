package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.createExtractors;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.readFrames;
import kotlin.readFullyQuietly;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    private final int AudioAttributesCompatParcelizer;
    private final Rect AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final ListPopupWindow IconCompatParcelizer;
    private ColorStateList MediaBrowserCompatItemReceiver;
    private final float RemoteActionCompatParcelizer;
    private ColorStateList read;
    private final AccessibilityManager write;

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, 0), attributeSet, i);
        this.AudioAttributesImplApi26Parcelizer = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_android_inputType) && typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.AudioAttributesCompatParcelizer = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_simpleItemLayout, calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_auto_complete_simple_item);
        this.RemoteActionCompatParcelizer = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_android_popupElevation, calculateNextSearchBytePosition.write.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.read = ColorStateList.valueOf(typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.AudioAttributesImplBaseParcelizer = typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.MediaBrowserCompatItemReceiver = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.write = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.IconCompatParcelizer = listPopupWindow;
        listPopupWindow.IconCompatParcelizer(true);
        listPopupWindow.RemoteActionCompatParcelizer(this);
        listPopupWindow.MediaBrowserCompatItemReceiver(2);
        listPopupWindow.RemoteActionCompatParcelizer(getAdapter());
        listPopupWindow.write(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                MaterialAutoCompleteTextView.this.AudioAttributesCompatParcelizer(i2 < 0 ? materialAutoCompleteTextView.IconCompatParcelizer.MediaDescriptionCompat() : materialAutoCompleteTextView.getAdapter().getItem(i2));
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = MaterialAutoCompleteTextView.this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
                        i2 = MaterialAutoCompleteTextView.this.IconCompatParcelizer.RatingCompat();
                        j = MaterialAutoCompleteTextView.this.IconCompatParcelizer.MediaMetadataCompat();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.IconCompatParcelizer.a_(), view, i2, j);
                }
                MaterialAutoCompleteTextView.this.IconCompatParcelizer.write();
            }
        });
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayWrite.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (write()) {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (write()) {
            this.IconCompatParcelizer.write();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (write()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    private boolean write() {
        AccessibilityManager accessibilityManager = this.write;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(getAdapter());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.IconCompatParcelizer.IconCompatParcelizer(getOnItemSelectedListener());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new IconCompatParcelizer(getContext(), this.AudioAttributesCompatParcelizer, strArr));
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.read = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof frameSizeBytesByTypeNb) {
            ((frameSizeBytesByTypeNb) dropDownBackground).AudioAttributesImplApi21Parcelizer(this.read);
        }
    }

    public final ColorStateList AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public void setSimpleItemSelectedColor(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
        if (getAdapter() instanceof IconCompatParcelizer) {
            ((IconCompatParcelizer) getAdapter()).write();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver = colorStateList;
        if (getAdapter() instanceof IconCompatParcelizer) {
            ((IconCompatParcelizer) getAdapter()).write();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.IconCompatParcelizer;
        if (listPopupWindow != null) {
            listPopupWindow.write(drawable);
        }
    }

    public final float RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutIconCompatParcelizer = IconCompatParcelizer();
        if (textInputLayoutIconCompatParcelizer != null && textInputLayoutIconCompatParcelizer.RatingCompat() && super.getHint() == null && readFullyQuietly.AudioAttributesCompatParcelizer()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.IconCompatParcelizer.write();
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutIconCompatParcelizer = IconCompatParcelizer();
        if (textInputLayoutIconCompatParcelizer != null && textInputLayoutIconCompatParcelizer.RatingCompat()) {
            return textInputLayoutIconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), read()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    private int read() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutIconCompatParcelizer = IconCompatParcelizer();
        int iMax = 0;
        if (adapter == null || textInputLayoutIconCompatParcelizer == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.IconCompatParcelizer.RatingCompat()) + 15);
        View view = null;
        int i = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutIconCompatParcelizer);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (drawableRemoteActionCompatParcelizer != null) {
            drawableRemoteActionCompatParcelizer.getPadding(this.AudioAttributesImplApi26Parcelizer);
            iMax += this.AudioAttributesImplApi26Parcelizer.left + this.AudioAttributesImplApi26Parcelizer.right;
        }
        return iMax + textInputLayoutIconCompatParcelizer.read().getMeasuredWidth();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        TextInputLayout textInputLayoutIconCompatParcelizer = IconCompatParcelizer();
        if (textInputLayoutIconCompatParcelizer != null) {
            textInputLayoutIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    private TextInputLayout IconCompatParcelizer() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void AudioAttributesCompatParcelizer(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    /* JADX INFO: loaded from: classes5.dex */
    class IconCompatParcelizer<T> extends ArrayAdapter<String> {
        private ColorStateList AudioAttributesCompatParcelizer;
        private ColorStateList RemoteActionCompatParcelizer;

        IconCompatParcelizer(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            write();
        }

        final void write() {
            this.AudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                InvalidTypeIdException.read(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? IconCompatParcelizer() : null);
            }
            return view2;
        }

        private Drawable IconCompatParcelizer() {
            if (!RemoteActionCompatParcelizer()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.AudioAttributesImplBaseParcelizer);
            if (this.AudioAttributesCompatParcelizer == null) {
                return colorDrawable;
            }
            findFormatOverrides.AudioAttributesCompatParcelizer(colorDrawable, this.RemoteActionCompatParcelizer);
            return new RippleDrawable(this.AudioAttributesCompatParcelizer, colorDrawable, null);
        }

        private ColorStateList AudioAttributesCompatParcelizer() {
            if (!RemoteActionCompatParcelizer() || !read()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{createExtractors.read(MaterialAutoCompleteTextView.this.AudioAttributesImplBaseParcelizer, MaterialAutoCompleteTextView.this.MediaBrowserCompatItemReceiver.getColorForState(iArr2, 0)), createExtractors.read(MaterialAutoCompleteTextView.this.AudioAttributesImplBaseParcelizer, MaterialAutoCompleteTextView.this.MediaBrowserCompatItemReceiver.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.AudioAttributesImplBaseParcelizer});
        }

        private ColorStateList AudioAttributesImplBaseParcelizer() {
            if (!read()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.MediaBrowserCompatItemReceiver.getColorForState(iArr, 0), 0});
        }

        private boolean RemoteActionCompatParcelizer() {
            return MaterialAutoCompleteTextView.this.AudioAttributesImplBaseParcelizer != 0;
        }

        private boolean read() {
            return MaterialAutoCompleteTextView.this.MediaBrowserCompatItemReceiver != null;
        }
    }
}

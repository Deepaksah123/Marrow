package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import kotlin.ActivityResult;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.addCancellable;
import kotlin.configureFromStringCreator;
import kotlin.createFullyDrawnExecutor;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.setBackgroundResource;
import kotlin.setChecked;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    private static final int[] RemoteActionCompatParcelizer = {R.attr.spinnerMode};
    int AudioAttributesCompatParcelizer;
    private MediaBrowserCompatCustomActionResultReceiver AudioAttributesImplApi21Parcelizer;
    private final Context AudioAttributesImplApi26Parcelizer;
    private SpinnerAdapter AudioAttributesImplBaseParcelizer;
    final Rect IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final addCancellable read;
    private ActivityResult write;

    interface MediaBrowserCompatCustomActionResultReceiver {
        int AudioAttributesCompatParcelizer();

        int IconCompatParcelizer();

        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(int i, int i2);

        boolean MediaBrowserCompatCustomActionResultReceiver();

        Drawable RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(ListAdapter listAdapter);

        void RemoteActionCompatParcelizer(CharSequence charSequence);

        CharSequence read();

        void write();

        void write(int i);

        void write(Drawable drawable);
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[PHI: r9 r10
      0x005f: PHI (r9v2 int) = (r9v0 int), (r9v4 int) binds: [B:24:0x005d, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r10v6 android.content.res.TypedArray) = (r10v5 android.content.res.TypedArray), (r10v8 android.content.res.TypedArray) binds: [B:24:0x005d, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            mediaBrowserCompatCustomActionResultReceiver.write(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(getDefaultViewModelCreationExtras.write(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            return mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            return mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(i);
            this.AudioAttributesImplApi21Parcelizer.write(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            return mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            this.AudioAttributesCompatParcelizer = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            return this.AudioAttributesCompatParcelizer;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesImplBaseParcelizer = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            Context context = this.AudioAttributesImplApi26Parcelizer;
            if (context == null) {
                context = getContext();
            }
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new write(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver == null || !mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.write();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ActivityResult activityResult = this.write;
        if (activityResult == null || !activityResult.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.AudioAttributesImplApi21Parcelizer == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), IconCompatParcelizer(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            if (mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
                return true;
            }
            IconCompatParcelizer();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        return mediaBrowserCompatCustomActionResultReceiver != null ? mediaBrowserCompatCustomActionResultReceiver.read() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.write(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.RemoteActionCompatParcelizer(mode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        addCancellable addcancellable = this.read;
        if (addcancellable != null) {
            addcancellable.read();
        }
    }

    int IconCompatParcelizer(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int iMax = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax2 = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax2 + 15);
        View view = null;
        int i = 0;
        for (int iMax3 = Math.max(0, iMax2 - (15 - (iMin - iMax2))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax;
        }
        drawable.getPadding(this.IconCompatParcelizer);
        return iMax + this.IconCompatParcelizer.left + this.IconCompatParcelizer.right;
    }

    final MediaBrowserCompatCustomActionResultReceiver write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    void IconCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(AudioAttributesCompatParcelizer.write(this), AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
        savedState.IconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver != null && mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
        return savedState;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.IconCompatParcelizer || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!AppCompatSpinner.this.write().MediaBrowserCompatCustomActionResultReceiver()) {
                    AppCompatSpinner.this.IconCompatParcelizer();
                }
                ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(viewTreeObserver2, this);
                }
            }
        });
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean IconCompatParcelizer;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.IconCompatParcelizer = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : (byte) 0);
        }
    }

    static class write implements ListAdapter, SpinnerAdapter {
        private ListAdapter RemoteActionCompatParcelizer;
        private SpinnerAdapter read;

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public write(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.read = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.RemoteActionCompatParcelizer = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    IconCompatParcelizer.RemoteActionCompatParcelizer((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof setBackgroundResource) {
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.read;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.read;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.read;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.read;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.read;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.read;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.read;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.RemoteActionCompatParcelizer;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.RemoteActionCompatParcelizer;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    class read implements MediaBrowserCompatCustomActionResultReceiver, DialogInterface.OnClickListener {
        private ListAdapter IconCompatParcelizer;
        createFullyDrawnExecutor RemoteActionCompatParcelizer;
        private CharSequence read;

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public int AudioAttributesCompatParcelizer() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public int IconCompatParcelizer() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void IconCompatParcelizer(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public Drawable RemoteActionCompatParcelizer() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void RemoteActionCompatParcelizer(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void write(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void write(Drawable drawable) {
        }

        read() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void write() {
            createFullyDrawnExecutor createfullydrawnexecutor = this.RemoteActionCompatParcelizer;
            if (createfullydrawnexecutor != null) {
                createfullydrawnexecutor.dismiss();
                this.RemoteActionCompatParcelizer = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public boolean MediaBrowserCompatCustomActionResultReceiver() {
            createFullyDrawnExecutor createfullydrawnexecutor = this.RemoteActionCompatParcelizer;
            if (createfullydrawnexecutor != null) {
                return createfullydrawnexecutor.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void RemoteActionCompatParcelizer(ListAdapter listAdapter) {
            this.IconCompatParcelizer = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.read = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public CharSequence read() {
            return this.read;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void IconCompatParcelizer(int i, int i2) {
            if (this.IconCompatParcelizer == null) {
                return;
            }
            createFullyDrawnExecutor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new createFullyDrawnExecutor.AudioAttributesCompatParcelizer(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.read;
            if (charSequence != null) {
                audioAttributesCompatParcelizer.setTitle(charSequence);
            }
            createFullyDrawnExecutor createfullydrawnexecutorCreate = audioAttributesCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.RemoteActionCompatParcelizer = createfullydrawnexecutorCreate;
            ListView listViewIconCompatParcelizer = createfullydrawnexecutorCreate.IconCompatParcelizer();
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(listViewIconCompatParcelizer, i);
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(listViewIconCompatParcelizer, i2);
            this.RemoteActionCompatParcelizer.show();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.IconCompatParcelizer.getItemId(i));
            }
            write();
        }
    }

    class MediaBrowserCompatItemReceiver extends ListPopupWindow implements MediaBrowserCompatCustomActionResultReceiver {
        private CharSequence AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private final Rect MediaBrowserCompatItemReceiver;
        ListAdapter write;

        public MediaBrowserCompatItemReceiver(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.MediaBrowserCompatItemReceiver = new Rect();
            RemoteActionCompatParcelizer(AppCompatSpinner.this);
            IconCompatParcelizer(true);
            AudioAttributesImplBaseParcelizer(0);
            write(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver.4
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    AppCompatSpinner.this.setSelection(i2);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i2, MediaBrowserCompatItemReceiver.this.write.getItemId(i2));
                    }
                    MediaBrowserCompatItemReceiver.this.write();
                }
            });
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void RemoteActionCompatParcelizer(ListAdapter listAdapter) {
            super.RemoteActionCompatParcelizer(listAdapter);
            this.write = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public CharSequence read() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesImplApi26Parcelizer = charSequence;
        }

        void MediaBrowserCompatItemReceiver() {
            int i;
            int iAudioAttributesImplApi21Parcelizer;
            Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (drawableRemoteActionCompatParcelizer != null) {
                drawableRemoteActionCompatParcelizer.getPadding(AppCompatSpinner.this.IconCompatParcelizer);
                i = setChecked.AudioAttributesCompatParcelizer(AppCompatSpinner.this) ? AppCompatSpinner.this.IconCompatParcelizer.right : -AppCompatSpinner.this.IconCompatParcelizer.left;
            } else {
                Rect rect = AppCompatSpinner.this.IconCompatParcelizer;
                AppCompatSpinner.this.IconCompatParcelizer.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.AudioAttributesCompatParcelizer == -2) {
                int iIconCompatParcelizer = AppCompatSpinner.this.IconCompatParcelizer((SpinnerAdapter) this.write, RemoteActionCompatParcelizer());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.IconCompatParcelizer.left) - AppCompatSpinner.this.IconCompatParcelizer.right;
                if (iIconCompatParcelizer > i2) {
                    iIconCompatParcelizer = i2;
                }
                read(Math.max(iIconCompatParcelizer, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.AudioAttributesCompatParcelizer == -1) {
                read((width - paddingLeft) - paddingRight);
            } else {
                read(AppCompatSpinner.this.AudioAttributesCompatParcelizer);
            }
            if (setChecked.AudioAttributesCompatParcelizer(AppCompatSpinner.this)) {
                iAudioAttributesImplApi21Parcelizer = i + (((width - paddingRight) - MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) - AudioAttributesImplApi21Parcelizer());
            } else {
                iAudioAttributesImplApi21Parcelizer = i + paddingLeft + AudioAttributesImplApi21Parcelizer();
            }
            write(iAudioAttributesImplApi21Parcelizer);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void IconCompatParcelizer(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            MediaBrowserCompatItemReceiver();
            MediaBrowserCompatItemReceiver(2);
            super.AudioAttributesImplBaseParcelizer();
            ListView listViewA_ = a_();
            listViewA_.setChoiceMode(1);
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(listViewA_, i);
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(listViewA_, i2);
            AudioAttributesImplApi26Parcelizer(AppCompatSpinner.this.getSelectedItemPosition());
            if (zMediaBrowserCompatCustomActionResultReceiver || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver.this;
                    if (!mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(AppCompatSpinner.this)) {
                        MediaBrowserCompatItemReceiver.this.write();
                    } else {
                        MediaBrowserCompatItemReceiver.this.MediaBrowserCompatItemReceiver();
                        MediaBrowserCompatItemReceiver.super.AudioAttributesImplBaseParcelizer();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            IconCompatParcelizer(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        boolean AudioAttributesCompatParcelizer(View view) {
            return InvalidTypeIdException.onPlayFromSearch(view) && view.getGlobalVisibleRect(this.MediaBrowserCompatItemReceiver);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver
        public void RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
        }

        public int AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }
    }

    static final class IconCompatParcelizer {
        static void RemoteActionCompatParcelizer(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (configureFromStringCreator.RemoteActionCompatParcelizer(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    static final class AudioAttributesCompatParcelizer {
        static int RemoteActionCompatParcelizer(View view) {
            return view.getTextAlignment();
        }

        static void RemoteActionCompatParcelizer(View view, int i) {
            view.setTextAlignment(i);
        }

        static int write(View view) {
            return view.getTextDirection();
        }

        static void AudioAttributesCompatParcelizer(View view, int i) {
            view.setTextDirection(i);
        }
    }

    static final class RemoteActionCompatParcelizer {
        static void AudioAttributesCompatParcelizer(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}

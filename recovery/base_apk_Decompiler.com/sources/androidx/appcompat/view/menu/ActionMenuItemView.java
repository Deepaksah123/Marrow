package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.ActivityResult;
import kotlin._init_lambda5;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.registerForActivityResult;
import kotlin.removeOnContextAvailableListener;
import kotlin.setItemInvoker;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements registerForActivityResult.AudioAttributesCompatParcelizer, View.OnClickListener, ActionMenuView.write {
    private boolean AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private Drawable MediaBrowserCompatCustomActionResultReceiver;
    private ActivityResult MediaBrowserCompatItemReceiver;
    private CharSequence MediaBrowserCompatSearchResultReceiver;
    read RemoteActionCompatParcelizer;
    onRetainNonConfigurationInstance read;
    onRequestPermissionsResult.AudioAttributesCompatParcelizer write;

    public static abstract class read {
        public abstract removeOnContextAvailableListener IconCompatParcelizer();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final boolean write() {
        return true;
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMenuItemView, i, 0);
        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.AudioAttributesImplApi26Parcelizer = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.AudioAttributesImplBaseParcelizer = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.AudioAttributesImplBaseParcelizer = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final onRetainNonConfigurationInstance IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        this.read = onretainnonconfigurationinstance;
        setIcon(onretainnonconfigurationinstance.getIcon());
        setTitle(onretainnonconfigurationinstance.IconCompatParcelizer((registerForActivityResult.AudioAttributesCompatParcelizer) this));
        setId(onretainnonconfigurationinstance.getItemId());
        setVisibility(onretainnonconfigurationinstance.isVisible() ? 0 : 8);
        setEnabled(onretainnonconfigurationinstance.isEnabled());
        if (onretainnonconfigurationinstance.hasSubMenu() && this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new IconCompatParcelizer();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ActivityResult activityResult;
        if (this.read.hasSubMenu() && (activityResult = this.MediaBrowserCompatItemReceiver) != null && activityResult.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        onRequestPermissionsResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read);
        }
    }

    public void setItemInvoker(onRequestPermissionsResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write = audioAttributesCompatParcelizer;
    }

    public void setPopupCallback(read readVar) {
        this.RemoteActionCompatParcelizer = readVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.read;
            if (onretainnonconfigurationinstance != null) {
                onretainnonconfigurationinstance.IconCompatParcelizer();
            }
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        boolean z = (!TextUtils.isEmpty(this.MediaBrowserCompatSearchResultReceiver)) & (this.MediaBrowserCompatCustomActionResultReceiver == null || (this.read.MediaDescriptionCompat() && (this.AudioAttributesCompatParcelizer || this.IconCompatParcelizer)));
        setText(z ? this.MediaBrowserCompatSearchResultReceiver : null);
        CharSequence contentDescription = this.read.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z ? null : this.read.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.read.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            setItemInvoker.AudioAttributesCompatParcelizer(this, z ? null : this.read.getTitle());
        } else {
            setItemInvoker.AudioAttributesCompatParcelizer(this, tooltipText);
        }
    }

    public void setIcon(Drawable drawable) {
        this.MediaBrowserCompatCustomActionResultReceiver = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean read() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.MediaBrowserCompatSearchResultReceiver = charSequence;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.write
    public final boolean AudioAttributesCompatParcelizer() {
        return read() && this.read.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.write
    public final boolean RemoteActionCompatParcelizer() {
        return read();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int iMin;
        int i3;
        boolean z = read();
        if (z && (i3 = this.AudioAttributesImplBaseParcelizer) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, this.AudioAttributesImplApi21Parcelizer);
        } else {
            iMin = this.AudioAttributesImplApi21Parcelizer;
        }
        if (mode != 1073741824 && this.AudioAttributesImplApi21Parcelizer > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (z || this.MediaBrowserCompatCustomActionResultReceiver == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.MediaBrowserCompatCustomActionResultReceiver.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    class IconCompatParcelizer extends ActivityResult {
        public IconCompatParcelizer() {
            super(ActionMenuItemView.this);
        }

        @Override // kotlin.ActivityResult
        public final removeOnContextAvailableListener AudioAttributesCompatParcelizer() {
            if (ActionMenuItemView.this.RemoteActionCompatParcelizer != null) {
                return ActionMenuItemView.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            }
            return null;
        }

        @Override // kotlin.ActivityResult
        public final boolean read() {
            removeOnContextAvailableListener removeoncontextavailablelistenerAudioAttributesCompatParcelizer;
            return ActionMenuItemView.this.write != null && ActionMenuItemView.this.write.RemoteActionCompatParcelizer(ActionMenuItemView.this.read) && (removeoncontextavailablelistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer()) != null && removeoncontextavailablelistenerAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.findTransient;
import kotlin.onActivityResult;
import kotlin.onRequestPermissionsResult;
import kotlin.removeOnPictureInPictureModeChangedListener;
import kotlin.setChecked;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends removeOnPictureInPictureModeChangedListener {
    private View AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private View MediaBrowserCompatCustomActionResultReceiver;
    private View MediaBrowserCompatItemReceiver;
    private LinearLayout MediaBrowserCompatMediaItem;
    private TextView MediaBrowserCompatSearchResultReceiver;
    private CharSequence MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private CharSequence RatingCompat;
    private TextView onAddQueueItem;
    private boolean onCommand;
    private int onCustomAction;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // kotlin.removeOnPictureInPictureModeChangedListener, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // kotlin.removeOnPictureInPictureModeChangedListener, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // kotlin.removeOnPictureInPictureModeChangedListener, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // kotlin.removeOnPictureInPictureModeChangedListener
    public final /* bridge */ /* synthetic */ findTransient write(int i, long j) {
        return super.write(i, j);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTitle settitle = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMode, i, 0);
        InvalidTypeIdException.read(this, settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMode_background));
        this.onCustomAction = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMode_titleTextStyle, 0);
        this.MediaMetadataCompat = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMode_subtitleTextStyle, 0);
        this.RemoteActionCompatParcelizer = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMode_height, 0);
        this.AudioAttributesImplApi26Parcelizer = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionMode_closeItemLayout, _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_action_mode_close_item_material);
        settitle.write();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.write != null) {
            this.write.write();
            this.write.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Override // kotlin.removeOnPictureInPictureModeChangedListener
    public void setContentHeight(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.AudioAttributesImplApi21Parcelizer;
        if (view2 != null) {
            removeView(view2);
        }
        this.AudioAttributesImplApi21Parcelizer = view;
        if (view != null && (linearLayout = this.MediaBrowserCompatMediaItem) != null) {
            removeView(linearLayout);
            this.MediaBrowserCompatMediaItem = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.RatingCompat = charSequence;
        AudioAttributesImplApi26Parcelizer();
        InvalidTypeIdException.read(this, charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.MediaDescriptionCompat = charSequence;
        AudioAttributesImplApi26Parcelizer();
    }

    public final CharSequence RemoteActionCompatParcelizer() {
        return this.RatingCompat;
    }

    public final CharSequence IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatMediaItem == null) {
            LayoutInflater.from(getContext()).inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.MediaBrowserCompatMediaItem = linearLayout;
            this.onAddQueueItem = (TextView) linearLayout.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar_title);
            this.MediaBrowserCompatSearchResultReceiver = (TextView) this.MediaBrowserCompatMediaItem.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar_subtitle);
            if (this.onCustomAction != 0) {
                this.onAddQueueItem.setTextAppearance(getContext(), this.onCustomAction);
            }
            if (this.MediaMetadataCompat != 0) {
                this.MediaBrowserCompatSearchResultReceiver.setTextAppearance(getContext(), this.MediaMetadataCompat);
            }
        }
        this.onAddQueueItem.setText(this.RatingCompat);
        this.MediaBrowserCompatSearchResultReceiver.setText(this.MediaDescriptionCompat);
        boolean zIsEmpty = TextUtils.isEmpty(this.RatingCompat);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.MediaDescriptionCompat);
        this.MediaBrowserCompatSearchResultReceiver.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.MediaBrowserCompatMediaItem.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.MediaBrowserCompatMediaItem.getParent() == null) {
            addView(this.MediaBrowserCompatMediaItem);
        }
    }

    public final void IconCompatParcelizer(final onActivityResult onactivityresult) {
        View view = this.MediaBrowserCompatCustomActionResultReceiver;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.AudioAttributesImplApi26Parcelizer, (ViewGroup) this, false);
            this.MediaBrowserCompatCustomActionResultReceiver = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.MediaBrowserCompatCustomActionResultReceiver);
        }
        View viewFindViewById = this.MediaBrowserCompatCustomActionResultReceiver.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_mode_close_button);
        this.MediaBrowserCompatItemReceiver = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ActionBarContextView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                onactivityresult.IconCompatParcelizer();
            }
        });
        onRequestPermissionsResult onrequestpermissionsresult = (onRequestPermissionsResult) onactivityresult.RemoteActionCompatParcelizer();
        if (this.write != null) {
            this.write.RemoteActionCompatParcelizer();
        }
        this.write = new ActionMenuPresenter(getContext());
        this.write.MediaBrowserCompatMediaItem();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        onrequestpermissionsresult.write(this.write, this.read);
        this.IconCompatParcelizer = (ActionMenuView) this.write.RemoteActionCompatParcelizer(this);
        InvalidTypeIdException.read(this.IconCompatParcelizer, (Drawable) null);
        addView(this.IconCompatParcelizer, layoutParams);
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            MediaBrowserCompatItemReceiver();
        }
    }

    public final void MediaBrowserCompatItemReceiver() {
        removeAllViews();
        this.AudioAttributesImplApi21Parcelizer = null;
        this.IconCompatParcelizer = null;
        this.write = null;
        View view = this.MediaBrowserCompatItemReceiver;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // kotlin.removeOnPictureInPictureModeChangedListener
    public final boolean read() {
        if (this.write != null) {
            return this.write.MediaBrowserCompatSearchResultReceiver();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.RemoteActionCompatParcelizer > 0 ? this.RemoteActionCompatParcelizer : View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.MediaBrowserCompatCustomActionResultReceiver;
        if (view != null) {
            int iWrite = write(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.MediaBrowserCompatCustomActionResultReceiver.getLayoutParams();
            paddingLeft = iWrite - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        if (this.IconCompatParcelizer != null && this.IconCompatParcelizer.getParent() == this) {
            paddingLeft = write(this.IconCompatParcelizer, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.MediaBrowserCompatMediaItem;
        if (linearLayout != null && this.AudioAttributesImplApi21Parcelizer == null) {
            if (this.onCommand) {
                this.MediaBrowserCompatMediaItem.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.MediaBrowserCompatMediaItem.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.MediaBrowserCompatMediaItem.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = write(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.AudioAttributesImplApi21Parcelizer;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i4 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = Math.min(layoutParams.height, iMin);
            }
            this.AudioAttributesImplApi21Parcelizer.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(iMin, i4));
        }
        if (this.RemoteActionCompatParcelizer <= 0) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                int measuredHeight = getChildAt(i6).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i5) {
                    i5 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i5);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zAudioAttributesCompatParcelizer = setChecked.AudioAttributesCompatParcelizer(this);
        int paddingRight = zAudioAttributesCompatParcelizer ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.MediaBrowserCompatCustomActionResultReceiver;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.MediaBrowserCompatCustomActionResultReceiver.getLayoutParams();
            int i5 = zAudioAttributesCompatParcelizer ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zAudioAttributesCompatParcelizer ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iIconCompatParcelizer = IconCompatParcelizer(paddingRight, i5, zAudioAttributesCompatParcelizer);
            paddingRight = IconCompatParcelizer(iIconCompatParcelizer + read(this.MediaBrowserCompatCustomActionResultReceiver, iIconCompatParcelizer, paddingTop, paddingTop2, zAudioAttributesCompatParcelizer), i6, zAudioAttributesCompatParcelizer);
        }
        LinearLayout linearLayout = this.MediaBrowserCompatMediaItem;
        if (linearLayout != null && this.AudioAttributesImplApi21Parcelizer == null && linearLayout.getVisibility() != 8) {
            paddingRight += read(this.MediaBrowserCompatMediaItem, paddingRight, paddingTop, paddingTop2, zAudioAttributesCompatParcelizer);
        }
        View view2 = this.AudioAttributesImplApi21Parcelizer;
        if (view2 != null) {
            read(view2, paddingRight, paddingTop, paddingTop2, zAudioAttributesCompatParcelizer);
        }
        int paddingLeft = zAudioAttributesCompatParcelizer ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.IconCompatParcelizer != null) {
            read(this.IconCompatParcelizer, paddingLeft, paddingTop, paddingTop2, !zAudioAttributesCompatParcelizer);
        }
    }

    public void setTitleOptional(boolean z) {
        if (z != this.onCommand) {
            requestLayout();
        }
        this.onCommand = z;
    }

    public final boolean write() {
        return this.onCommand;
    }
}

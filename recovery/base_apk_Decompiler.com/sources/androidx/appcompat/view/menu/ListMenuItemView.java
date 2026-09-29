package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.registerForActivityResult;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements registerForActivityResult.AudioAttributesCompatParcelizer, AbsListView.SelectionBoundsAdjuster {
    private LinearLayout AudioAttributesCompatParcelizer;
    private onRetainNonConfigurationInstance AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private ImageView MediaBrowserCompatCustomActionResultReceiver;
    private LayoutInflater MediaBrowserCompatItemReceiver;
    private Drawable MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private TextView MediaDescriptionCompat;
    private ImageView MediaMetadataCompat;
    private RadioButton RatingCompat;
    private ImageView RemoteActionCompatParcelizer;
    private Context handleMediaPlayPauseIfPendingOnHandler;
    private Drawable read;
    private CheckBox write;

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final boolean write() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setTitle settitle = setTitle.read(getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.MenuView, i, 0);
        this.read = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuView_android_itemBackground);
        this.MediaBrowserCompatSearchResultReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuView_android_itemTextAppearance, -1);
        this.AudioAttributesImplBaseParcelizer = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuView_preserveIconSpacing, false);
        this.handleMediaPlayPauseIfPendingOnHandler = context;
        this.MediaBrowserCompatMediaItem = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, _init_lambda5.read.dropDownListViewStyle, 0);
        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.hasValue(0);
        settitle.write();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        InvalidTypeIdException.read(this, this.read);
        TextView textView = (TextView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.title);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView;
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i != -1) {
            textView.setTextAppearance(this.handleMediaPlayPauseIfPendingOnHandler, i);
        }
        this.MediaDescriptionCompat = (TextView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.shortcut);
        ImageView imageView = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.submenuarrow);
        this.MediaMetadataCompat = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.MediaBrowserCompatMediaItem);
        }
        this.RemoteActionCompatParcelizer = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.group_divider);
        this.AudioAttributesCompatParcelizer = (LinearLayout) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.content);
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        this.AudioAttributesImplApi21Parcelizer = onretainnonconfigurationinstance;
        setVisibility(onretainnonconfigurationinstance.isVisible() ? 0 : 8);
        setTitle(onretainnonconfigurationinstance.IconCompatParcelizer((registerForActivityResult.AudioAttributesCompatParcelizer) this));
        setCheckable(onretainnonconfigurationinstance.isCheckable());
        setShortcut(onretainnonconfigurationinstance.RatingCompat(), onretainnonconfigurationinstance.read());
        setIcon(onretainnonconfigurationinstance.getIcon());
        setEnabled(onretainnonconfigurationinstance.isEnabled());
        RemoteActionCompatParcelizer(onretainnonconfigurationinstance.hasSubMenu());
        setContentDescription(onretainnonconfigurationinstance.getContentDescription());
    }

    private void IconCompatParcelizer(View view) {
        write(view, -1);
    }

    private void write(View view, int i) {
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void setForceShowIcon(boolean z) {
        this.IconCompatParcelizer = z;
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(charSequence);
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getVisibility() != 0) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(0);
                return;
            }
            return;
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getVisibility() != 8) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(8);
        }
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final onRetainNonConfigurationInstance IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.RatingCompat == null && this.write == null) {
            return;
        }
        if (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            if (this.RatingCompat == null) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
            compoundButton = this.RatingCompat;
            view = this.write;
        } else {
            if (this.write == null) {
                read();
            }
            compoundButton = this.write;
            view = this.RatingCompat;
        }
        if (z) {
            compoundButton.setChecked(this.AudioAttributesImplApi21Parcelizer.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.write;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.RatingCompat;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            if (this.RatingCompat == null) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
            compoundButton = this.RatingCompat;
        } else {
            if (this.write == null) {
                read();
            }
            compoundButton = this.write;
        }
        compoundButton.setChecked(z);
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        ImageView imageView = this.MediaMetadataCompat;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setShortcut(boolean z, char c) {
        int i = (z && this.AudioAttributesImplApi21Parcelizer.RatingCompat()) ? 0 : 8;
        if (i == 0) {
            this.MediaDescriptionCompat.setText(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer());
        }
        if (this.MediaDescriptionCompat.getVisibility() != i) {
            this.MediaDescriptionCompat.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver() || this.IconCompatParcelizer;
        if (z || this.AudioAttributesImplBaseParcelizer) {
            ImageView imageView = this.MediaBrowserCompatCustomActionResultReceiver;
            if (imageView == null && drawable == null && !this.AudioAttributesImplBaseParcelizer) {
                return;
            }
            if (imageView == null) {
                AudioAttributesCompatParcelizer();
            }
            if (drawable != null || this.AudioAttributesImplBaseParcelizer) {
                ImageView imageView2 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.MediaBrowserCompatCustomActionResultReceiver.getVisibility() != 0) {
                    this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(0);
                    return;
                }
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != null && this.AudioAttributesImplBaseParcelizer) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.MediaBrowserCompatCustomActionResultReceiver.getLayoutParams();
            if (layoutParams.height > 0 && ((ViewGroup.LayoutParams) layoutParams2).width <= 0) {
                ((ViewGroup.LayoutParams) layoutParams2).width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void AudioAttributesCompatParcelizer() {
        ImageView imageView = (ImageView) RemoteActionCompatParcelizer().inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.MediaBrowserCompatCustomActionResultReceiver = imageView;
        write(imageView, 0);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        RadioButton radioButton = (RadioButton) RemoteActionCompatParcelizer().inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.RatingCompat = radioButton;
        IconCompatParcelizer(radioButton);
    }

    private void read() {
        CheckBox checkBox = (CheckBox) RemoteActionCompatParcelizer().inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.write = checkBox;
        IconCompatParcelizer(checkBox);
    }

    private LayoutInflater RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = LayoutInflater.from(getContext());
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.RemoteActionCompatParcelizer;
        if (imageView != null) {
            imageView.setVisibility((this.AudioAttributesImplApi26Parcelizer || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.RemoteActionCompatParcelizer;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.RemoteActionCompatParcelizer.getLayoutParams();
        rect.top += this.RemoteActionCompatParcelizer.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }
}

package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import kotlin._init_lambda5;
import kotlin.onRequestPermissionsResult;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes.dex */
public final class setIcon implements ActionBarLayoutParams {
    private ActionMenuPresenter AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private View AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    Window.Callback IconCompatParcelizer;
    private CharSequence MediaBrowserCompatCustomActionResultReceiver;
    private Drawable MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private CharSequence MediaBrowserCompatSearchResultReceiver;
    private Drawable MediaDescriptionCompat;
    private Drawable MediaMetadataCompat;
    private Drawable RatingCompat;
    Toolbar RemoteActionCompatParcelizer;
    private View onAddQueueItem;
    private boolean onCustomAction;
    boolean read;
    CharSequence write;

    public setIcon(Toolbar toolbar, boolean z) {
        this(toolbar, z, _init_lambda5.AudioAttributesImplApi21Parcelizer.abc_action_bar_up_description);
    }

    private setIcon(Toolbar toolbar, boolean z, int i) {
        Drawable drawable;
        this.MediaBrowserCompatMediaItem = 0;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.RemoteActionCompatParcelizer = toolbar;
        this.write = toolbar.MediaBrowserCompatSearchResultReceiver();
        this.MediaBrowserCompatSearchResultReceiver = toolbar.MediaDescriptionCompat();
        this.onCustomAction = this.write != null;
        this.MediaMetadataCompat = toolbar.AudioAttributesImplApi21Parcelizer();
        setTitle settitle = setTitle.read(toolbar.getContext(), null, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar, _init_lambda5.read.actionBarStyle, 0);
        this.MediaBrowserCompatItemReceiver = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceAudioAttributesImplBaseParcelizer = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer)) {
                IconCompatParcelizer(charSequenceAudioAttributesImplBaseParcelizer);
            }
            CharSequence charSequenceAudioAttributesImplBaseParcelizer2 = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer2)) {
                AudioAttributesCompatParcelizer(charSequenceAudioAttributesImplBaseParcelizer2);
            }
            Drawable drawableIconCompatParcelizer = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_logo);
            if (drawableIconCompatParcelizer != null) {
                AudioAttributesCompatParcelizer(drawableIconCompatParcelizer);
            }
            Drawable drawableIconCompatParcelizer2 = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_icon);
            if (drawableIconCompatParcelizer2 != null) {
                read(drawableIconCompatParcelizer2);
            }
            if (this.MediaMetadataCompat == null && (drawable = this.MediaBrowserCompatItemReceiver) != null) {
                RemoteActionCompatParcelizer(drawable);
            }
            write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_displayOptions, 0));
            int iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_customNavigationLayout, 0);
            if (iMediaBrowserCompatItemReceiver != 0) {
                IconCompatParcelizer(LayoutInflater.from(this.RemoteActionCompatParcelizer.getContext()).inflate(iMediaBrowserCompatItemReceiver, (ViewGroup) this.RemoteActionCompatParcelizer, false));
                write(this.AudioAttributesImplBaseParcelizer | 16);
            }
            int iIconCompatParcelizer = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_height, 0);
            if (iIconCompatParcelizer > 0) {
                ViewGroup.LayoutParams layoutParams = this.RemoteActionCompatParcelizer.getLayoutParams();
                layoutParams.height = iIconCompatParcelizer;
                this.RemoteActionCompatParcelizer.setLayoutParams(layoutParams);
            }
            int iWrite = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_contentInsetStart, -1);
            int iWrite2 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_contentInsetEnd, -1);
            if (iWrite >= 0 || iWrite2 >= 0) {
                this.RemoteActionCompatParcelizer.setContentInsetsRelative(Math.max(iWrite, 0), Math.max(iWrite2, 0));
            }
            int iMediaBrowserCompatItemReceiver2 = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_titleTextStyle, 0);
            if (iMediaBrowserCompatItemReceiver2 != 0) {
                Toolbar toolbar2 = this.RemoteActionCompatParcelizer;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iMediaBrowserCompatItemReceiver2);
            }
            int iMediaBrowserCompatItemReceiver3 = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_subtitleTextStyle, 0);
            if (iMediaBrowserCompatItemReceiver3 != 0) {
                Toolbar toolbar3 = this.RemoteActionCompatParcelizer;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iMediaBrowserCompatItemReceiver3);
            }
            int iMediaBrowserCompatItemReceiver4 = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_popupTheme, 0);
            if (iMediaBrowserCompatItemReceiver4 != 0) {
                this.RemoteActionCompatParcelizer.setPopupTheme(iMediaBrowserCompatItemReceiver4);
            }
        } else {
            this.AudioAttributesImplBaseParcelizer = MediaDescriptionCompat();
        }
        settitle.write();
        AudioAttributesImplBaseParcelizer(i);
        this.MediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        this.RemoteActionCompatParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.setIcon.4
            final onCreate IconCompatParcelizer;

            {
                this.IconCompatParcelizer = new onCreate(setIcon.this.RemoteActionCompatParcelizer.getContext(), setIcon.this.write);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (setIcon.this.IconCompatParcelizer == null || !setIcon.this.read) {
                    return;
                }
                setIcon.this.IconCompatParcelizer.onMenuItemSelected(0, this.IconCompatParcelizer);
            }
        });
    }

    private void AudioAttributesImplBaseParcelizer(int i) {
        if (i != this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = i;
            if (TextUtils.isEmpty(this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver())) {
                MediaBrowserCompatItemReceiver(this.AudioAttributesImplApi21Parcelizer);
            }
        }
    }

    private int MediaDescriptionCompat() {
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer() == null) {
            return 11;
        }
        this.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        return 15;
    }

    @Override // kotlin.ActionBarLayoutParams
    public final ViewGroup AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.ActionBarLayoutParams
    public final Context AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getContext();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final boolean MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer.onAddQueueItem();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void read() {
        this.RemoteActionCompatParcelizer.S_();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void read(Window.Callback callback) {
        this.IconCompatParcelizer = callback;
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void write(CharSequence charSequence) {
        if (this.onCustomAction) {
            return;
        }
        read(charSequence);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void IconCompatParcelizer(CharSequence charSequence) {
        this.onCustomAction = true;
        read(charSequence);
    }

    private void read(CharSequence charSequence) {
        this.write = charSequence;
        if ((this.AudioAttributesImplBaseParcelizer & 8) != 0) {
            this.RemoteActionCompatParcelizer.setTitle(charSequence);
            if (this.onCustomAction) {
                InvalidTypeIdException.read(this.RemoteActionCompatParcelizer.getRootView(), charSequence);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        this.MediaBrowserCompatSearchResultReceiver = charSequence;
        if ((this.AudioAttributesImplBaseParcelizer & 8) != 0) {
            this.RemoteActionCompatParcelizer.setSubtitle(charSequence);
        }
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void AudioAttributesCompatParcelizer(int i) {
        read(i != 0 ? getDefaultViewModelCreationExtras.write(AudioAttributesCompatParcelizer(), i) : null);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void read(Drawable drawable) {
        this.MediaDescriptionCompat = drawable;
        onAddQueueItem();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void IconCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer(i != 0 ? getDefaultViewModelCreationExtras.write(AudioAttributesCompatParcelizer(), i) : null);
    }

    private void AudioAttributesCompatParcelizer(Drawable drawable) {
        this.RatingCompat = drawable;
        onAddQueueItem();
    }

    private void onAddQueueItem() {
        Drawable drawable;
        int i = this.AudioAttributesImplBaseParcelizer;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.RatingCompat) == null) {
            drawable = this.MediaDescriptionCompat;
        }
        this.RemoteActionCompatParcelizer.setLogo(drawable);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.read();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final boolean MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer.onFastForward();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.RemoteActionCompatParcelizer.onPause();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final boolean RatingCompat() {
        return this.RemoteActionCompatParcelizer.onPlay();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer.onCommand();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void MediaBrowserCompatMediaItem() {
        this.read = true;
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void RemoteActionCompatParcelizer(Menu menu, peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.AudioAttributesCompatParcelizer == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.RemoteActionCompatParcelizer.getContext());
            this.AudioAttributesCompatParcelizer = actionMenuPresenter;
            actionMenuPresenter.read(_init_lambda5.AudioAttributesImplBaseParcelizer.action_menu_presenter);
        }
        this.AudioAttributesCompatParcelizer.read(audioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer.setMenu((onRequestPermissionsResult) menu, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void write() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void write(int i) {
        View view;
        int i2 = this.AudioAttributesImplBaseParcelizer ^ i;
        this.AudioAttributesImplBaseParcelizer = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    onCustomAction();
                }
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            if ((i2 & 3) != 0) {
                onAddQueueItem();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.RemoteActionCompatParcelizer.setTitle(this.write);
                    this.RemoteActionCompatParcelizer.setSubtitle(this.MediaBrowserCompatSearchResultReceiver);
                } else {
                    this.RemoteActionCompatParcelizer.setTitle((CharSequence) null);
                    this.RemoteActionCompatParcelizer.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.AudioAttributesImplApi26Parcelizer) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.RemoteActionCompatParcelizer.addView(view);
            } else {
                this.RemoteActionCompatParcelizer.removeView(view);
            }
        }
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void RemoteActionCompatParcelizer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.onAddQueueItem;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.RemoteActionCompatParcelizer;
            if (parent == toolbar) {
                toolbar.removeView(this.onAddQueueItem);
            }
        }
        this.onAddQueueItem = scrollingTabContainerView;
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void IconCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setCollapsible(z);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    private void IconCompatParcelizer(View view) {
        View view2 = this.AudioAttributesImplApi26Parcelizer;
        if (view2 != null && (this.AudioAttributesImplBaseParcelizer & 16) != 0) {
            this.RemoteActionCompatParcelizer.removeView(view2);
        }
        this.AudioAttributesImplApi26Parcelizer = view;
        if (view == null || (this.AudioAttributesImplBaseParcelizer & 16) == 0) {
            return;
        }
        this.RemoteActionCompatParcelizer.addView(view);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final findTransient IconCompatParcelizer(final int i, long j) {
        return InvalidTypeIdException.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read(i == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED).write(j).AudioAttributesCompatParcelizer(new Java7SupportImpl() { // from class: o.setIcon.1
            private boolean RemoteActionCompatParcelizer = false;

            @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
            public final void read(View view) {
                setIcon.this.RemoteActionCompatParcelizer.setVisibility(0);
            }

            @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
            public final void RemoteActionCompatParcelizer(View view) {
                if (this.RemoteActionCompatParcelizer) {
                    return;
                }
                setIcon.this.RemoteActionCompatParcelizer.setVisibility(i);
            }

            @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
            public final void IconCompatParcelizer(View view) {
                this.RemoteActionCompatParcelizer = true;
            }
        });
    }

    private void RemoteActionCompatParcelizer(Drawable drawable) {
        this.MediaMetadataCompat = drawable;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void RemoteActionCompatParcelizer(int i) {
        RemoteActionCompatParcelizer(getDefaultViewModelCreationExtras.write(AudioAttributesCompatParcelizer(), R.drawable.ic_action_arrow_back));
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if ((this.AudioAttributesImplBaseParcelizer & 4) != 0) {
            Toolbar toolbar = this.RemoteActionCompatParcelizer;
            Drawable drawable = this.MediaMetadataCompat;
            if (drawable == null) {
                drawable = this.MediaBrowserCompatItemReceiver;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.RemoteActionCompatParcelizer.setNavigationIcon((Drawable) null);
    }

    private void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.MediaBrowserCompatCustomActionResultReceiver = charSequence;
        onCustomAction();
    }

    private void MediaBrowserCompatItemReceiver(int i) {
        RemoteActionCompatParcelizer(i == 0 ? null : AudioAttributesCompatParcelizer().getString(i));
    }

    private void onCustomAction() {
        if ((this.AudioAttributesImplBaseParcelizer & 4) != 0) {
            if (TextUtils.isEmpty(this.MediaBrowserCompatCustomActionResultReceiver)) {
                this.RemoteActionCompatParcelizer.setNavigationContentDescription(this.AudioAttributesImplApi21Parcelizer);
            } else {
                this.RemoteActionCompatParcelizer.setNavigationContentDescription(this.MediaBrowserCompatCustomActionResultReceiver);
            }
        }
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void read(int i) {
        this.RemoteActionCompatParcelizer.setVisibility(i);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final void AudioAttributesCompatParcelizer(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, onRequestPermissionsResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.setMenuCallbacks(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
    }

    @Override // kotlin.ActionBarLayoutParams
    public final Menu AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }
}

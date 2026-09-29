package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.PlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.ActionBarLayoutParams;
import kotlin.InvalidTypeIdException;
import kotlin.UntypedObjectDeserializerNR;
import kotlin.UntypedObjectDeserializerNRScope;
import kotlin._clearIfStdImpl;
import kotlin._init_lambda5;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.invalidateMenu;
import kotlin.mapArray;
import kotlin.mapObject;
import kotlin.onMenuItemSelected;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.peekAvailableContext;
import kotlin.removeOnTrimMemoryListener;
import kotlin.setChecked;
import kotlin.setIcon;
import kotlin.setItemInvoker;
import kotlin.setNegativeButton;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements UntypedObjectDeserializerNR {
    View AudioAttributesCompatParcelizer;
    private peekAvailableContext.AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private OnBackInvokedCallback AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    ActionMenuView MediaBrowserCompatCustomActionResultReceiver;
    IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private OnBackInvokedDispatcher MediaBrowserCompatMediaItem;
    private Drawable MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private CharSequence MediaMetadataCompat;
    private setIcon MediaSessionCompatToken;
    private boolean RatingCompat;
    onRequestPermissionsResult.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private write onAddQueueItem;
    private setNegativeButton onCommand;
    private boolean onCustomAction;
    private int onFastForward;
    private final ArrayList<View> onMediaButtonEvent;
    private int onPause;
    private final ActionMenuView.RemoteActionCompatParcelizer onPlay;
    private ImageView onPlayFromMediaId;
    private ImageButton onPlayFromSearch;
    private ArrayList<MenuItem> onPlayFromUri;
    private Context onPrepare;
    private int onPrepareFromMediaId;
    private ActionMenuPresenter onPrepareFromSearch;
    private int onPrepareFromUri;
    private final Runnable onRemoveQueueItem;
    private ColorStateList onRemoveQueueItemAt;
    private TextView onRewind;
    private CharSequence onSeekTo;
    private final ArrayList<View> onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private int onSetRating;
    private final int[] onSetRepeatMode;
    private int onSetShuffleMode;
    private int onSkipToNext;
    private TextView onSkipToPrevious;
    private int onSkipToQueueItem;
    private ColorStateList onStop;
    final mapObject read;
    private CharSequence setSessionImpl;
    ImageButton write;

    public interface IconCompatParcelizer {
        boolean read(MenuItem menuItem);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return AudioAttributesImplApi26Parcelizer();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return read(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPause = 8388627;
        this.onSetCaptioningEnabled = new ArrayList<>();
        this.onMediaButtonEvent = new ArrayList<>();
        this.onSetRepeatMode = new int[2];
        this.read = new mapObject(new Runnable() { // from class: o.setPadding
            @Override // java.lang.Runnable
            public final void run() {
                this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        });
        this.onPlayFromUri = new ArrayList<>();
        this.onPlay = new ActionMenuView.RemoteActionCompatParcelizer() { // from class: androidx.appcompat.widget.Toolbar.5
            @Override // androidx.appcompat.widget.ActionMenuView.RemoteActionCompatParcelizer
            public final boolean write(MenuItem menuItem) {
                if (Toolbar.this.read.AudioAttributesCompatParcelizer(menuItem)) {
                    return true;
                }
                if (Toolbar.this.MediaBrowserCompatItemReceiver != null) {
                    return Toolbar.this.MediaBrowserCompatItemReceiver.read(menuItem);
                }
                return false;
            }
        };
        this.onRemoveQueueItem = new Runnable() { // from class: androidx.appcompat.widget.Toolbar.3
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.onPlay();
            }
        };
        setTitle settitle = setTitle.read(getContext(), attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, _init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        this.onSkipToNext = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleTextAppearance, 0);
        this.onPrepareFromUri = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_subtitleTextAppearance, 0);
        this.onPause = settitle.RemoteActionCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_android_gravity, this.onPause);
        this.IconCompatParcelizer = settitle.RemoteActionCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_buttonGravity, 48);
        int iWrite = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMargin, 0);
        iWrite = settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMargins) ? settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMargins, iWrite) : iWrite;
        this.onSetPlaybackSpeed = iWrite;
        this.onSkipToQueueItem = iWrite;
        this.onSetShuffleMode = iWrite;
        this.onSetRating = iWrite;
        int iWrite2 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMarginStart, -1);
        if (iWrite2 >= 0) {
            this.onSetRating = iWrite2;
        }
        int iWrite3 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMarginEnd, -1);
        if (iWrite3 >= 0) {
            this.onSetShuffleMode = iWrite3;
        }
        int iWrite4 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMarginTop, -1);
        if (iWrite4 >= 0) {
            this.onSkipToQueueItem = iWrite4;
        }
        int iWrite5 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleMarginBottom, -1);
        if (iWrite5 >= 0) {
            this.onSetPlaybackSpeed = iWrite5;
        }
        this.onFastForward = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_maxButtonHeight, -1);
        int iWrite6 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iWrite7 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_contentInsetLeft, 0);
        int iAudioAttributesCompatParcelizer2 = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_contentInsetRight, 0);
        onPlayFromUri();
        this.onCommand.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2);
        if (iWrite6 != Integer.MIN_VALUE || iWrite7 != Integer.MIN_VALUE) {
            this.onCommand.RemoteActionCompatParcelizer(iWrite6, iWrite7);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.MediaDescriptionCompat = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.MediaBrowserCompatSearchResultReceiver = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_collapseIcon);
        this.MediaMetadataCompat = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_collapseContentDescription);
        CharSequence charSequenceAudioAttributesImplBaseParcelizer = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer)) {
            setTitle(charSequenceAudioAttributesImplBaseParcelizer);
        }
        CharSequence charSequenceAudioAttributesImplBaseParcelizer2 = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer2)) {
            setSubtitle(charSequenceAudioAttributesImplBaseParcelizer2);
        }
        this.onPrepare = getContext();
        setPopupTheme(settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_popupTheme, 0));
        Drawable drawableIconCompatParcelizer = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_navigationIcon);
        if (drawableIconCompatParcelizer != null) {
            setNavigationIcon(drawableIconCompatParcelizer);
        }
        CharSequence charSequenceAudioAttributesImplBaseParcelizer3 = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer3)) {
            setNavigationContentDescription(charSequenceAudioAttributesImplBaseParcelizer3);
        }
        Drawable drawableIconCompatParcelizer2 = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_logo);
        if (drawableIconCompatParcelizer2 != null) {
            setLogo(drawableIconCompatParcelizer2);
        }
        CharSequence charSequenceAudioAttributesImplBaseParcelizer4 = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer4)) {
            setLogoDescription(charSequenceAudioAttributesImplBaseParcelizer4);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleTextColor)) {
            setTitleTextColor(settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_titleTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_subtitleTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_menu)) {
            write(settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.Toolbar_menu, 0));
        }
        settitle.write();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.AudioAttributesImplBaseParcelizer != z) {
            this.AudioAttributesImplBaseParcelizer = z;
            onPlayFromMediaId();
        }
    }

    public void setPopupTheme(int i) {
        if (this.onPrepareFromMediaId != i) {
            this.onPrepareFromMediaId = i;
            if (i == 0) {
                this.onPrepare = getContext();
            } else {
                this.onPrepare = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.onSetRating = i;
        this.onSkipToQueueItem = i2;
        this.onSetShuffleMode = i3;
        this.onSetPlaybackSpeed = i4;
        requestLayout();
    }

    public final int MediaMetadataCompat() {
        return this.onSetRating;
    }

    public void setTitleMarginStart(int i) {
        this.onSetRating = i;
        requestLayout();
    }

    public final int onCustomAction() {
        return this.onSkipToQueueItem;
    }

    public void setTitleMarginTop(int i) {
        this.onSkipToQueueItem = i;
        requestLayout();
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.onSetShuffleMode;
    }

    public void setTitleMarginEnd(int i) {
        this.onSetShuffleMode = i;
        requestLayout();
    }

    public final int RatingCompat() {
        return this.onSetPlaybackSpeed;
    }

    public void setTitleMarginBottom(int i) {
        this.onSetPlaybackSpeed = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        onPlayFromUri();
        this.onCommand.read(i == 1);
    }

    public void setLogo(int i) {
        setLogo(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public final boolean read() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver) != null && actionMenuView.AudioAttributesImplBaseParcelizer();
    }

    public final boolean onFastForward() {
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        return actionMenuView != null && actionMenuView.MediaBrowserCompatItemReceiver();
    }

    public final boolean onPause() {
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        return actionMenuView != null && actionMenuView.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean onPlay() {
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        return actionMenuView != null && actionMenuView.AudioAttributesImplApi21Parcelizer();
    }

    public final boolean onCommand() {
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        return actionMenuView != null && actionMenuView.AudioAttributesCompatParcelizer();
    }

    public void setMenu(onRequestPermissionsResult onrequestpermissionsresult, ActionMenuPresenter actionMenuPresenter) {
        if (onrequestpermissionsresult == null && this.MediaBrowserCompatCustomActionResultReceiver == null) {
            return;
        }
        onPrepare();
        onRequestPermissionsResult onrequestpermissionsresultAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        if (onrequestpermissionsresultAudioAttributesImplApi26Parcelizer == onrequestpermissionsresult) {
            return;
        }
        if (onrequestpermissionsresultAudioAttributesImplApi26Parcelizer != null) {
            onrequestpermissionsresultAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.onPrepareFromSearch);
            onrequestpermissionsresultAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.onAddQueueItem);
        }
        if (this.onAddQueueItem == null) {
            this.onAddQueueItem = new write();
        }
        actionMenuPresenter.RemoteActionCompatParcelizer(true);
        if (onrequestpermissionsresult != null) {
            onrequestpermissionsresult.write(actionMenuPresenter, this.onPrepare);
            onrequestpermissionsresult.write(this.onAddQueueItem, this.onPrepare);
        } else {
            actionMenuPresenter.read(this.onPrepare, (onRequestPermissionsResult) null);
            this.onAddQueueItem.read(this.onPrepare, null);
            actionMenuPresenter.AudioAttributesCompatParcelizer(true);
            this.onAddQueueItem.AudioAttributesCompatParcelizer(true);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.setPopupTheme(this.onPrepareFromMediaId);
        this.MediaBrowserCompatCustomActionResultReceiver.setPresenter(actionMenuPresenter);
        this.onPrepareFromSearch = actionMenuPresenter;
        onPlayFromMediaId();
    }

    public final void RemoteActionCompatParcelizer() {
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        if (actionMenuView != null) {
            actionMenuView.RemoteActionCompatParcelizer();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            onPrepareFromMediaId();
            if (!read(this.onPlayFromMediaId)) {
                IconCompatParcelizer(this.onPlayFromMediaId, true);
            }
        } else {
            ImageView imageView = this.onPlayFromMediaId;
            if (imageView != null && read(imageView)) {
                removeView(this.onPlayFromMediaId);
                this.onMediaButtonEvent.remove(this.onPlayFromMediaId);
            }
        }
        ImageView imageView2 = this.onPlayFromMediaId;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final Drawable AudioAttributesImplBaseParcelizer() {
        ImageView imageView = this.onPlayFromMediaId;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            onPrepareFromMediaId();
        }
        ImageView imageView = this.onPlayFromMediaId;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    private void onPrepareFromMediaId() {
        if (this.onPlayFromMediaId == null) {
            this.onPlayFromMediaId = new AppCompatImageView(getContext());
        }
    }

    public final boolean onAddQueueItem() {
        write writeVar = this.onAddQueueItem;
        return (writeVar == null || writeVar.write == null) ? false : true;
    }

    public final void S_() {
        write writeVar = this.onAddQueueItem;
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = writeVar == null ? null : writeVar.write;
        if (onretainnonconfigurationinstance != null) {
            onretainnonconfigurationinstance.collapseActionView();
        }
    }

    public final CharSequence MediaBrowserCompatSearchResultReceiver() {
        return this.setSessionImpl;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.onSkipToPrevious == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.onSkipToPrevious = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.onSkipToPrevious.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.onSkipToNext;
                if (i != 0) {
                    this.onSkipToPrevious.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.onStop;
                if (colorStateList != null) {
                    this.onSkipToPrevious.setTextColor(colorStateList);
                }
            }
            if (!read(this.onSkipToPrevious)) {
                IconCompatParcelizer(this.onSkipToPrevious, true);
            }
        } else {
            TextView textView = this.onSkipToPrevious;
            if (textView != null && read(textView)) {
                removeView(this.onSkipToPrevious);
                this.onMediaButtonEvent.remove(this.onSkipToPrevious);
            }
        }
        TextView textView2 = this.onSkipToPrevious;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.setSessionImpl = charSequence;
    }

    public final CharSequence MediaDescriptionCompat() {
        return this.onSeekTo;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.onRewind == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.onRewind = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.onRewind.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.onPrepareFromUri;
                if (i != 0) {
                    this.onRewind.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.onRemoveQueueItemAt;
                if (colorStateList != null) {
                    this.onRewind.setTextColor(colorStateList);
                }
            }
            if (!read(this.onRewind)) {
                IconCompatParcelizer(this.onRewind, true);
            }
        } else {
            TextView textView = this.onRewind;
            if (textView != null && read(textView)) {
                removeView(this.onRewind);
                this.onMediaButtonEvent.remove(this.onRewind);
            }
        }
        TextView textView2 = this.onRewind;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.onSeekTo = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.onSkipToNext = i;
        TextView textView = this.onSkipToPrevious;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.onPrepareFromUri = i;
        TextView textView = this.onRewind;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.onStop = colorStateList;
        TextView textView = this.onSkipToPrevious;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.onRemoveQueueItemAt = colorStateList;
        TextView textView = this.onRewind;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final CharSequence MediaBrowserCompatItemReceiver() {
        ImageButton imageButton = this.onPlayFromSearch;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            onPlayFromSearch();
        }
        ImageButton imageButton = this.onPlayFromSearch;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            setItemInvoker.AudioAttributesCompatParcelizer(this.onPlayFromSearch, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            onPlayFromSearch();
            if (!read(this.onPlayFromSearch)) {
                IconCompatParcelizer(this.onPlayFromSearch, true);
            }
        } else {
            ImageButton imageButton = this.onPlayFromSearch;
            if (imageButton != null && read(imageButton)) {
                removeView(this.onPlayFromSearch);
                this.onMediaButtonEvent.remove(this.onPlayFromSearch);
            }
        }
        ImageButton imageButton2 = this.onPlayFromSearch;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final Drawable AudioAttributesImplApi21Parcelizer() {
        ImageButton imageButton = this.onPlayFromSearch;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        onPlayFromSearch();
        this.onPlayFromSearch.setOnClickListener(onClickListener);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            AudioAttributesCompatParcelizer();
        }
        ImageButton imageButton = this.write;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            AudioAttributesCompatParcelizer();
            this.write.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.write;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.MediaBrowserCompatSearchResultReceiver);
            }
        }
    }

    public final Menu MediaBrowserCompatCustomActionResultReceiver() {
        onPrepareFromSearch();
        return this.MediaBrowserCompatCustomActionResultReceiver.read();
    }

    public void setOverflowIcon(Drawable drawable) {
        onPrepareFromSearch();
        this.MediaBrowserCompatCustomActionResultReceiver.setOverflowIcon(drawable);
    }

    private void onPrepareFromSearch() {
        onPrepare();
        if (this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer() == null) {
            onRequestPermissionsResult onrequestpermissionsresult = (onRequestPermissionsResult) this.MediaBrowserCompatCustomActionResultReceiver.read();
            if (this.onAddQueueItem == null) {
                this.onAddQueueItem = new write();
            }
            this.MediaBrowserCompatCustomActionResultReceiver.setExpandedActionViewsExclusive(true);
            onrequestpermissionsresult.write(this.onAddQueueItem, this.onPrepare);
            onPlayFromMediaId();
        }
    }

    private void onPrepare() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.MediaBrowserCompatCustomActionResultReceiver = actionMenuView;
            actionMenuView.setPopupTheme(this.onPrepareFromMediaId);
            this.MediaBrowserCompatCustomActionResultReceiver.setOnMenuItemClickListener(this.onPlay);
            this.MediaBrowserCompatCustomActionResultReceiver.setMenuCallbacks(this.AudioAttributesImplApi21Parcelizer, new onRequestPermissionsResult.RemoteActionCompatParcelizer() { // from class: androidx.appcompat.widget.Toolbar.2
                @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
                public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
                    return Toolbar.this.RemoteActionCompatParcelizer != null && Toolbar.this.RemoteActionCompatParcelizer.write(onrequestpermissionsresult, menuItem);
                }

                @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
                public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
                    if (!Toolbar.this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver()) {
                        Toolbar.this.read.read(onrequestpermissionsresult);
                    }
                    if (Toolbar.this.RemoteActionCompatParcelizer != null) {
                        Toolbar.this.RemoteActionCompatParcelizer.read(onrequestpermissionsresult);
                    }
                }
            });
            LayoutParams layoutParamsAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            layoutParamsAudioAttributesImplApi26Parcelizer.write = (this.IconCompatParcelizer & 112) | 8388613;
            this.MediaBrowserCompatCustomActionResultReceiver.setLayoutParams(layoutParamsAudioAttributesImplApi26Parcelizer);
            IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, false);
        }
    }

    private MenuInflater onPrepareFromUri() {
        return new onMenuItemSelected(getContext());
    }

    public void write(int i) {
        onPrepareFromUri().inflate(i, MediaBrowserCompatCustomActionResultReceiver());
    }

    public void setOnMenuItemClickListener(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
    }

    public void setContentInsetsRelative(int i, int i2) {
        onPlayFromUri();
        this.onCommand.RemoteActionCompatParcelizer(i, i2);
    }

    private int onSetPlaybackSpeed() {
        setNegativeButton setnegativebutton = this.onCommand;
        if (setnegativebutton != null) {
            return setnegativebutton.read();
        }
        return 0;
    }

    private int onSetRepeatMode() {
        setNegativeButton setnegativebutton = this.onCommand;
        if (setnegativebutton != null) {
            return setnegativebutton.IconCompatParcelizer();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        onPlayFromUri();
        this.onCommand.AudioAttributesCompatParcelizer(i, i2);
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.handleMediaPlayPauseIfPendingOnHandler) {
            this.handleMediaPlayPauseIfPendingOnHandler = i;
            if (AudioAttributesImplApi21Parcelizer() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = i;
            if (AudioAttributesImplApi21Parcelizer() != null) {
                requestLayout();
            }
        }
    }

    private int onStop() {
        if (AudioAttributesImplApi21Parcelizer() != null) {
            return Math.max(onSetPlaybackSpeed(), Math.max(this.handleMediaPlayPauseIfPendingOnHandler, 0));
        }
        return onSetPlaybackSpeed();
    }

    private int onSetShuffleMode() {
        onRequestPermissionsResult onrequestpermissionsresultAudioAttributesImplApi26Parcelizer;
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        if (actionMenuView != null && (onrequestpermissionsresultAudioAttributesImplApi26Parcelizer = actionMenuView.AudioAttributesImplApi26Parcelizer()) != null && onrequestpermissionsresultAudioAttributesImplApi26Parcelizer.hasVisibleItems()) {
            return Math.max(onSetRepeatMode(), Math.max(this.MediaDescriptionCompat, 0));
        }
        return onSetRepeatMode();
    }

    private int onSetRating() {
        if (InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1) {
            return onSetShuffleMode();
        }
        return onStop();
    }

    private int onSetCaptioningEnabled() {
        if (InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1) {
            return onStop();
        }
        return onSetShuffleMode();
    }

    private void onPlayFromSearch() {
        if (this.onPlayFromSearch == null) {
            this.onPlayFromSearch = new AppCompatImageButton(getContext(), null, _init_lambda5.read.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            layoutParamsAudioAttributesImplApi26Parcelizer.write = (this.IconCompatParcelizer & 112) | 8388611;
            this.onPlayFromSearch.setLayoutParams(layoutParamsAudioAttributesImplApi26Parcelizer);
        }
    }

    final void AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, _init_lambda5.read.toolbarNavigationButtonStyle);
            this.write = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.MediaBrowserCompatSearchResultReceiver);
            this.write.setContentDescription(this.MediaMetadataCompat);
            LayoutParams layoutParamsAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            layoutParamsAudioAttributesImplApi26Parcelizer.write = (this.IconCompatParcelizer & 112) | 8388611;
            layoutParamsAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = 2;
            this.write.setLayoutParams(layoutParamsAudioAttributesImplApi26Parcelizer);
            this.write.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Toolbar.this.S_();
                }
            });
        }
    }

    private void IconCompatParcelizer(View view, boolean z) {
        LayoutParams layoutParamsAudioAttributesImplApi26Parcelizer;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        } else if (!checkLayoutParams(layoutParams)) {
            layoutParamsAudioAttributesImplApi26Parcelizer = read(layoutParams);
        } else {
            layoutParamsAudioAttributesImplApi26Parcelizer = (LayoutParams) layoutParams;
        }
        layoutParamsAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = 1;
        if (z && this.AudioAttributesCompatParcelizer != null) {
            view.setLayoutParams(layoutParamsAudioAttributesImplApi26Parcelizer);
            this.onMediaButtonEvent.add(view);
        } else {
            addView(view, layoutParamsAudioAttributesImplApi26Parcelizer);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        write writeVar = this.onAddQueueItem;
        if (writeVar != null && writeVar.write != null) {
            savedState.AudioAttributesCompatParcelizer = this.onAddQueueItem.write.getItemId();
        }
        savedState.RemoteActionCompatParcelizer = onFastForward();
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        onRequestPermissionsResult onrequestpermissionsresultAudioAttributesImplApi26Parcelizer = actionMenuView != null ? actionMenuView.AudioAttributesImplApi26Parcelizer() : null;
        if (savedState.AudioAttributesCompatParcelizer != 0 && this.onAddQueueItem != null && onrequestpermissionsresultAudioAttributesImplApi26Parcelizer != null && (menuItemFindItem = onrequestpermissionsresultAudioAttributesImplApi26Parcelizer.findItem(savedState.AudioAttributesCompatParcelizer)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.RemoteActionCompatParcelizer) {
            onRewind();
        }
    }

    private void onRewind() {
        removeCallbacks(this.onRemoveQueueItem);
        post(this.onRemoveQueueItem);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.onRemoveQueueItem);
        onPlayFromMediaId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onPlayFromMediaId();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        }
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.onCustomAction = false;
        }
        if (!this.onCustomAction) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.onCustomAction = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.onCustomAction = false;
        }
        return true;
    }

    private void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        int childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop + paddingBottom + i6 + marginLayoutParams.bottomMargin, ((ViewGroup.LayoutParams) marginLayoutParams).height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int read(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        return view.getMeasuredWidth() + iMax;
    }

    private boolean onRemoveQueueItemAt() {
        if (!this.RatingCompat) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (IconCompatParcelizer(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.onSetRepeatMode;
        boolean zAudioAttributesCompatParcelizer = setChecked.AudioAttributesCompatParcelizer(this);
        if (IconCompatParcelizer(this.onPlayFromSearch)) {
            IconCompatParcelizer(this.onPlayFromSearch, i, 0, i2, this.onFastForward);
            measuredWidth = this.onPlayFromSearch.getMeasuredWidth() + AudioAttributesCompatParcelizer(this.onPlayFromSearch);
            iMax = Math.max(0, this.onPlayFromSearch.getMeasuredHeight() + write(this.onPlayFromSearch));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.onPlayFromSearch.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (IconCompatParcelizer(this.write)) {
            IconCompatParcelizer(this.write, i, 0, i2, this.onFastForward);
            measuredWidth = this.write.getMeasuredWidth() + AudioAttributesCompatParcelizer(this.write);
            iMax = Math.max(iMax, this.write.getMeasuredHeight() + write(this.write));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.write.getMeasuredState());
        }
        int iOnStop = onStop();
        int iMax3 = Math.max(iOnStop, measuredWidth);
        iArr[zAudioAttributesCompatParcelizer ? 1 : 0] = Math.max(0, iOnStop - measuredWidth);
        if (IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)) {
            IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, i, iMax3, i2, this.onFastForward);
            measuredWidth2 = this.MediaBrowserCompatCustomActionResultReceiver.getMeasuredWidth() + AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            iMax = Math.max(iMax, this.MediaBrowserCompatCustomActionResultReceiver.getMeasuredHeight() + write(this.MediaBrowserCompatCustomActionResultReceiver));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.MediaBrowserCompatCustomActionResultReceiver.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iOnSetShuffleMode = onSetShuffleMode();
        int iMax4 = iMax3 + Math.max(iOnSetShuffleMode, measuredWidth2);
        iArr[!zAudioAttributesCompatParcelizer ? 1 : 0] = Math.max(0, iOnSetShuffleMode - measuredWidth2);
        if (IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
            iMax4 += read(this.AudioAttributesCompatParcelizer, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.AudioAttributesCompatParcelizer.getMeasuredHeight() + write(this.AudioAttributesCompatParcelizer));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.AudioAttributesCompatParcelizer.getMeasuredState());
        }
        if (IconCompatParcelizer(this.onPlayFromMediaId)) {
            iMax4 += read(this.onPlayFromMediaId, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.onPlayFromMediaId.getMeasuredHeight() + write(this.onPlayFromMediaId));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.onPlayFromMediaId.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((LayoutParams) childAt.getLayoutParams()).RemoteActionCompatParcelizer == 0 && IconCompatParcelizer(childAt)) {
                iMax4 += read(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + write(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.onSkipToQueueItem + this.onSetPlaybackSpeed;
        int i5 = this.onSetRating + this.onSetShuffleMode;
        if (IconCompatParcelizer(this.onSkipToPrevious)) {
            read(this.onSkipToPrevious, i, iMax4 + i5, i2, i4, iArr);
            int measuredWidth3 = this.onSkipToPrevious.getMeasuredWidth();
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onSkipToPrevious);
            measuredHeight = this.onSkipToPrevious.getMeasuredHeight() + write(this.onSkipToPrevious);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.onSkipToPrevious.getMeasuredState());
            iMax2 = measuredWidth3 + iAudioAttributesCompatParcelizer;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (IconCompatParcelizer(this.onRewind)) {
            iMax2 = Math.max(iMax2, read(this.onRewind, i, iMax4 + i5, i2, i4 + measuredHeight, iArr));
            measuredHeight += this.onRewind.getMeasuredHeight() + write(this.onRewind);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.onRewind.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), onRemoveQueueItemAt() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029b A[LOOP:0: B:102:0x0299->B:103:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd A[LOOP:1: B:105:0x02bb->B:106:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f5 A[LOOP:2: B:113:0x02f3->B:114:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private static int RemoteActionCompatParcelizer(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private int RemoteActionCompatParcelizer(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int i4 = read(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i4, iMax + measuredWidth, view.getMeasuredHeight() + i4);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int write(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int i4 = read(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i4, iMax, view.getMeasuredHeight() + i4);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int read(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(layoutParams.write);
        if (iAudioAttributesCompatParcelizer == 48) {
            return getPaddingTop() - i2;
        }
        if (iAudioAttributesCompatParcelizer == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
            iMax = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        } else {
            int i3 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i3 < ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
                iMax = Math.max(0, iMax - (((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin - i3));
            }
        }
        return paddingTop + iMax;
    }

    private int AudioAttributesCompatParcelizer(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.onPause & 112;
    }

    private void read(List<View> list, int i) {
        boolean z = InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
        int childCount = getChildCount();
        int iWrite = _clearIfStdImpl.write(i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.RemoteActionCompatParcelizer == 0 && IconCompatParcelizer(childAt) && IconCompatParcelizer(layoutParams.write) == iWrite) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.RemoteActionCompatParcelizer == 0 && IconCompatParcelizer(childAt2) && IconCompatParcelizer(layoutParams2.write) == iWrite) {
                list.add(childAt2);
            }
        }
    }

    private int IconCompatParcelizer(int i) {
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        int iWrite = _clearIfStdImpl.write(i, iMediaBrowserCompatMediaItem) & 7;
        return (iWrite == 1 || iWrite == 3 || iWrite == 5) ? iWrite : iMediaBrowserCompatMediaItem == 1 ? 5 : 3;
    }

    private boolean IconCompatParcelizer(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int AudioAttributesCompatParcelizer(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return mapArray.write(marginLayoutParams) + mapArray.RemoteActionCompatParcelizer(marginLayoutParams);
    }

    private static int write(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private static LayoutParams read(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    protected static LayoutParams AudioAttributesImplApi26Parcelizer() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final ActionBarLayoutParams handleMediaPlayPauseIfPendingOnHandler() {
        if (this.MediaSessionCompatToken == null) {
            this.MediaSessionCompatToken = new setIcon(this, true);
        }
        return this.MediaSessionCompatToken;
    }

    final void onMediaButtonEvent() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).RemoteActionCompatParcelizer != 2 && childAt != this.MediaBrowserCompatCustomActionResultReceiver) {
                removeViewAt(childCount);
                this.onMediaButtonEvent.add(childAt);
            }
        }
    }

    final void IconCompatParcelizer() {
        for (int size = this.onMediaButtonEvent.size() - 1; size >= 0; size--) {
            addView(this.onMediaButtonEvent.get(size));
        }
        this.onMediaButtonEvent.clear();
    }

    private boolean read(View view) {
        return view.getParent() == this || this.onMediaButtonEvent.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.RatingCompat = z;
        requestLayout();
    }

    public void setMenuCallbacks(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, onRequestPermissionsResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        ActionMenuView actionMenuView = this.MediaBrowserCompatCustomActionResultReceiver;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
        }
    }

    private void onPlayFromUri() {
        if (this.onCommand == null) {
            this.onCommand = new setNegativeButton();
        }
    }

    private ArrayList<MenuItem> onRemoveQueueItem() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menuMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        for (int i = 0; i < menuMediaBrowserCompatCustomActionResultReceiver.size(); i++) {
            arrayList.add(menuMediaBrowserCompatCustomActionResultReceiver.getItem(i));
        }
        return arrayList;
    }

    private void onSeekTo() {
        Menu menuMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        ArrayList<MenuItem> arrayListOnRemoveQueueItem = onRemoveQueueItem();
        this.read.write(menuMediaBrowserCompatCustomActionResultReceiver, onPrepareFromUri());
        ArrayList<MenuItem> arrayListOnRemoveQueueItem2 = onRemoveQueueItem();
        arrayListOnRemoveQueueItem2.removeAll(arrayListOnRemoveQueueItem);
        this.onPlayFromUri = arrayListOnRemoveQueueItem2;
    }

    @Override // kotlin.UntypedObjectDeserializerNR
    public void addMenuProvider(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope) {
        this.read.AudioAttributesCompatParcelizer(untypedObjectDeserializerNRScope);
    }

    @Override // kotlin.UntypedObjectDeserializerNR
    public void removeMenuProvider(UntypedObjectDeserializerNRScope untypedObjectDeserializerNRScope) {
        this.read.IconCompatParcelizer(untypedObjectDeserializerNRScope);
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        Iterator<MenuItem> it = this.onPlayFromUri.iterator();
        while (it.hasNext()) {
            MediaBrowserCompatCustomActionResultReceiver().removeItem(it.next().getItemId());
        }
        onSeekTo();
    }

    final void onPlayFromMediaId() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherBF_ = AudioAttributesCompatParcelizer.bF_(this);
            boolean z = onAddQueueItem() && onBackInvokedDispatcherBF_ != null && InvalidTypeIdException.onPlayFromSearch(this) && this.AudioAttributesImplBaseParcelizer;
            if (z && this.MediaBrowserCompatMediaItem == null) {
                if (this.AudioAttributesImplApi26Parcelizer == null) {
                    this.AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer.bG_(new Runnable() { // from class: o.ActionMenuItemView
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.write.S_();
                        }
                    });
                }
                AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onBackInvokedDispatcherBF_, this.AudioAttributesImplApi26Parcelizer);
                this.MediaBrowserCompatMediaItem = onBackInvokedDispatcherBF_;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.MediaBrowserCompatMediaItem) == null) {
                return;
            }
            AudioAttributesCompatParcelizer.IconCompatParcelizer(onBackInvokedDispatcher, this.AudioAttributesImplApi26Parcelizer);
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    public static class LayoutParams extends ActionBar.LayoutParams {
        int RemoteActionCompatParcelizer;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.RemoteActionCompatParcelizer = 0;
        }

        public LayoutParams() {
            super(-2, -2);
            this.RemoteActionCompatParcelizer = 0;
            this.write = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.RemoteActionCompatParcelizer = 0;
            this.RemoteActionCompatParcelizer = layoutParams.RemoteActionCompatParcelizer;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.RemoteActionCompatParcelizer = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.RemoteActionCompatParcelizer = 0;
            IconCompatParcelizer(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.RemoteActionCompatParcelizer = 0;
        }

        private void IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return RemoteActionCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return write(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] write(int i) {
                return new SavedState[i];
            }
        };
        int AudioAttributesCompatParcelizer;
        boolean RemoteActionCompatParcelizer;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.AudioAttributesCompatParcelizer = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        }
    }

    class write implements peekAvailableContext {
        private onRequestPermissionsResult read;
        onRetainNonConfigurationInstance write;

        @Override // kotlin.peekAvailableContext
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        @Override // kotlin.peekAvailableContext
        public final Parcelable AudioAttributesImplApi26Parcelizer() {
            return null;
        }

        @Override // kotlin.peekAvailableContext
        public final int IconCompatParcelizer() {
            return 0;
        }

        @Override // kotlin.peekAvailableContext
        public final void IconCompatParcelizer(Parcelable parcelable) {
        }

        @Override // kotlin.peekAvailableContext
        public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        }

        @Override // kotlin.peekAvailableContext
        public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        }

        @Override // kotlin.peekAvailableContext
        public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
            return false;
        }

        write() {
        }

        @Override // kotlin.peekAvailableContext
        public final void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance;
            onRequestPermissionsResult onrequestpermissionsresult2 = this.read;
            if (onrequestpermissionsresult2 != null && (onretainnonconfigurationinstance = this.write) != null) {
                onrequestpermissionsresult2.RemoteActionCompatParcelizer(onretainnonconfigurationinstance);
            }
            this.read = onrequestpermissionsresult;
        }

        @Override // kotlin.peekAvailableContext
        public final void AudioAttributesCompatParcelizer(boolean z) {
            if (this.write != null) {
                onRequestPermissionsResult onrequestpermissionsresult = this.read;
                if (onrequestpermissionsresult != null) {
                    int size = onrequestpermissionsresult.size();
                    for (int i = 0; i < size; i++) {
                        if (this.read.getItem(i) == this.write) {
                            return;
                        }
                    }
                }
                IconCompatParcelizer(this.write);
            }
        }

        @Override // kotlin.peekAvailableContext
        public final boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
            Toolbar.this.AudioAttributesCompatParcelizer();
            ViewParent parent = Toolbar.this.write.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.write);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.write);
            }
            Toolbar.this.AudioAttributesCompatParcelizer = onretainnonconfigurationinstance.getActionView();
            this.write = onretainnonconfigurationinstance;
            ViewParent parent2 = Toolbar.this.AudioAttributesCompatParcelizer.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.AudioAttributesCompatParcelizer);
                }
                LayoutParams layoutParamsAudioAttributesImplApi26Parcelizer = Toolbar.AudioAttributesImplApi26Parcelizer();
                layoutParamsAudioAttributesImplApi26Parcelizer.write = (Toolbar.this.IconCompatParcelizer & 112) | 8388611;
                layoutParamsAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = 2;
                Toolbar.this.AudioAttributesCompatParcelizer.setLayoutParams(layoutParamsAudioAttributesImplApi26Parcelizer);
                Toolbar toolbar4 = Toolbar.this;
                toolbar4.addView(toolbar4.AudioAttributesCompatParcelizer);
            }
            Toolbar.this.onMediaButtonEvent();
            Toolbar.this.requestLayout();
            onretainnonconfigurationinstance.IconCompatParcelizer(true);
            if (Toolbar.this.AudioAttributesCompatParcelizer instanceof invalidateMenu) {
                ((invalidateMenu) Toolbar.this.AudioAttributesCompatParcelizer).IconCompatParcelizer();
            }
            Toolbar.this.onPlayFromMediaId();
            return true;
        }

        @Override // kotlin.peekAvailableContext
        public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
            if (Toolbar.this.AudioAttributesCompatParcelizer instanceof invalidateMenu) {
                ((invalidateMenu) Toolbar.this.AudioAttributesCompatParcelizer).write();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.AudioAttributesCompatParcelizer);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.write);
            Toolbar.this.AudioAttributesCompatParcelizer = null;
            Toolbar.this.IconCompatParcelizer();
            this.write = null;
            Toolbar.this.requestLayout();
            onretainnonconfigurationinstance.IconCompatParcelizer(false);
            Toolbar.this.onPlayFromMediaId();
            return true;
        }
    }

    static class AudioAttributesCompatParcelizer {
        static void RemoteActionCompatParcelizer(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, (OnBackInvokedCallback) obj2);
        }

        static void IconCompatParcelizer(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        static OnBackInvokedDispatcher bF_(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback bG_(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: o.setExpandedFormat
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }
    }
}

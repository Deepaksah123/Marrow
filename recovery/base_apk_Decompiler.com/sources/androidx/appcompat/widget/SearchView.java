package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.actions.SearchIntents;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.InvalidTypeIdException;
import kotlin._addSuperInterfaces;
import kotlin._init_lambda5;
import kotlin.invalidateMenu;
import kotlin.setChecked;
import kotlin.setHasDecor;
import kotlin.setItemInvoker;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes4.dex */
public class SearchView extends LinearLayoutCompat implements invalidateMenu {
    final SearchAutoComplete AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    final ImageView AudioAttributesImplApi26Parcelizer;
    SearchableInfo AudioAttributesImplBaseParcelizer;
    View.OnFocusChangeListener IconCompatParcelizer;
    private Bundle MediaBrowserCompatCustomActionResultReceiver;
    _addSuperInterfaces MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final ImageView MediaDescriptionCompat;
    private final View MediaMetadataCompat;
    private CharSequence MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private final Runnable MediaSessionCompatToken;
    private final Intent ParcelableVolumeInfo;
    private final Intent PlaybackStateCompat;
    private final CharSequence RatingCompat;
    final ImageView RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private CharSequence onAddQueueItem;
    private boolean onCommand;
    private final View.OnClickListener onCustomAction;
    private write onFastForward;
    private IconCompatParcelizer onMediaButtonEvent;
    private final AdapterView.OnItemSelectedListener onPause;
    private final AdapterView.OnItemClickListener onPlay;
    private final TextView.OnEditorActionListener onPlayFromMediaId;
    private CharSequence onPlayFromSearch;
    private View.OnClickListener onPlayFromUri;
    private final WeakHashMap<String, Drawable.ConstantState> onPrepare;
    private AudioAttributesCompatParcelizer onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private final Drawable onPrepareFromUri;
    private Runnable onRemoveQueueItem;
    private final View onRemoveQueueItemAt;
    private Rect onRewind;
    private final View onSeekTo;
    private final int onSetCaptioningEnabled;
    private Rect onSetPlaybackSpeed;
    private boolean onSetRating;
    private final int onSetRepeatMode;
    private final View onSetShuffleMode;
    private TextWatcher onSkipToNext;
    private View.OnKeyListener onSkipToPrevious;
    private int[] onSkipToQueueItem;
    private int[] onStop;
    final ImageView read;
    private read setSessionImpl;
    final ImageView write;

    public interface AudioAttributesCompatParcelizer {
        boolean RemoteActionCompatParcelizer();

        boolean write();
    }

    public interface IconCompatParcelizer {
        boolean AudioAttributesCompatParcelizer();
    }

    public interface write {
        boolean AudioAttributesCompatParcelizer();
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onRewind = new Rect();
        this.onSetPlaybackSpeed = new Rect();
        this.onStop = new int[2];
        this.onSkipToQueueItem = new int[2];
        this.MediaSessionCompatToken = new Runnable() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.onAddQueueItem();
            }
        };
        this.onRemoveQueueItem = new Runnable() { // from class: androidx.appcompat.widget.SearchView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (SearchView.this.MediaBrowserCompatItemReceiver instanceof setHasDecor) {
                    SearchView.this.MediaBrowserCompatItemReceiver.read((Cursor) null);
                }
            }
        };
        this.onPrepare = new WeakHashMap<>();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == SearchView.this.RemoteActionCompatParcelizer) {
                    SearchView.this.AudioAttributesImplApi26Parcelizer();
                    return;
                }
                if (view == SearchView.this.write) {
                    SearchView.this.AudioAttributesImplBaseParcelizer();
                    return;
                }
                if (view == SearchView.this.read) {
                    SearchView.this.AudioAttributesImplApi21Parcelizer();
                } else if (view == SearchView.this.AudioAttributesImplApi26Parcelizer) {
                    SearchView.this.MediaBrowserCompatMediaItem();
                } else if (view == SearchView.this.AudioAttributesCompatParcelizer) {
                    SearchView.this.read();
                }
            }
        };
        this.onCustomAction = onClickListener;
        this.onSkipToPrevious = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (SearchView.this.AudioAttributesImplBaseParcelizer == null) {
                    return false;
                }
                if (SearchView.this.AudioAttributesCompatParcelizer.isPopupShowing() && SearchView.this.AudioAttributesCompatParcelizer.getListSelection() != -1) {
                    return SearchView.this.write(i2, keyEvent);
                }
                if (SearchView.this.AudioAttributesCompatParcelizer.read() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.write(searchView.AudioAttributesCompatParcelizer.getText().toString());
                return true;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.AudioAttributesImplApi21Parcelizer();
                return true;
            }
        };
        this.onPlayFromMediaId = onEditorActionListener;
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.read(i2);
            }
        };
        this.onPlay = onItemClickListener;
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.write(i2);
            }
        };
        this.onPause = onItemSelectedListener;
        this.onSkipToNext = new TextWatcher() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.write(charSequence);
            }
        };
        setTitle settitle = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, _init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        LayoutInflater.from(context).inflate(settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_layout, _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_src_text);
        this.AudioAttributesCompatParcelizer = searchAutoComplete;
        searchAutoComplete.read(this);
        this.onRemoveQueueItemAt = findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_edit_frame);
        View viewFindViewById = findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_plate);
        this.onSeekTo = viewFindViewById;
        View viewFindViewById2 = findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.submit_area);
        this.onSetShuffleMode = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_button);
        this.RemoteActionCompatParcelizer = imageView;
        ImageView imageView2 = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_go_btn);
        this.read = imageView2;
        ImageView imageView3 = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_close_btn);
        this.write = imageView3;
        ImageView imageView4 = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_voice_btn);
        this.AudioAttributesImplApi26Parcelizer = imageView4;
        ImageView imageView5 = (ImageView) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.search_mag_icon);
        this.MediaDescriptionCompat = imageView5;
        InvalidTypeIdException.read(viewFindViewById, settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_queryBackground));
        InvalidTypeIdException.read(viewFindViewById2, settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_submitBackground));
        imageView.setImageDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_searchIcon));
        imageView2.setImageDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_goIcon));
        imageView3.setImageDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_closeIcon));
        imageView4.setImageDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_voiceIcon));
        imageView5.setImageDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_searchIcon));
        this.onPrepareFromUri = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_searchHintIcon);
        setItemInvoker.AudioAttributesCompatParcelizer(imageView, getResources().getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_searchview_description_search));
        this.onSetRepeatMode = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_suggestionRowLayout, _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_search_dropdown_item_icons_2line);
        this.onSetCaptioningEnabled = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_commitIcon, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(this.onSkipToNext);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(onItemClickListener);
        searchAutoComplete.setOnItemSelectedListener(onItemSelectedListener);
        searchAutoComplete.setOnKeyListener(this.onSkipToPrevious);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.IconCompatParcelizer != null) {
                    SearchView.this.IconCompatParcelizer.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_iconifiedByDefault, true));
        int iAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_android_maxWidth, -1);
        if (iAudioAttributesCompatParcelizer != -1) {
            setMaxWidth(iAudioAttributesCompatParcelizer);
        }
        this.RatingCompat = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_defaultQueryHint);
        this.onPlayFromSearch = settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_queryHint);
        int i2 = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SearchView_android_focusable, true));
        settitle.write();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.ParcelableVolumeInfo = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.PlaybackStateCompat = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.MediaMetadataCompat = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    SearchView.this.AudioAttributesCompatParcelizer();
                }
            });
        }
        AudioAttributesCompatParcelizer(this.onCommand);
        onFastForward();
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.onSetRepeatMode;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.onSetCaptioningEnabled;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.AudioAttributesImplBaseParcelizer = searchableInfo;
        if (searchableInfo != null) {
            onPause();
            onFastForward();
        }
        boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.MediaSessionCompatResultReceiverWrapper = zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.AudioAttributesCompatParcelizer.setPrivateImeOptions("nm");
        }
        AudioAttributesCompatParcelizer(onPlayFromSearch());
    }

    public void setAppSearchData(Bundle bundle) {
        this.MediaBrowserCompatCustomActionResultReceiver = bundle;
    }

    public void setImeOptions(int i) {
        this.AudioAttributesCompatParcelizer.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.AudioAttributesCompatParcelizer.setInputType(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.AudioAttributesImplApi21Parcelizer || !isFocusable()) {
            return false;
        }
        if (!onPlayFromSearch()) {
            boolean zRequestFocus = this.AudioAttributesCompatParcelizer.requestFocus(i, rect);
            if (zRequestFocus) {
                AudioAttributesCompatParcelizer(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.AudioAttributesImplApi21Parcelizer = true;
        super.clearFocus();
        this.AudioAttributesCompatParcelizer.clearFocus();
        this.AudioAttributesCompatParcelizer.write(false);
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    public void setOnQueryTextListener(IconCompatParcelizer iconCompatParcelizer) {
        this.onMediaButtonEvent = iconCompatParcelizer;
    }

    public void setOnCloseListener(write writeVar) {
        this.onFastForward = writeVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.IconCompatParcelizer = onFocusChangeListener;
    }

    public void setOnSuggestionListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onPrepareFromMediaId = audioAttributesCompatParcelizer;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.onPlayFromUri = onClickListener;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.AudioAttributesCompatParcelizer.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.AudioAttributesCompatParcelizer;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.MediaSessionCompatQueueItem = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        AudioAttributesImplApi21Parcelizer();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.onPlayFromSearch = charSequence;
        onFastForward();
    }

    private CharSequence onPrepare() {
        CharSequence charSequence = this.onPlayFromSearch;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.AudioAttributesImplBaseParcelizer;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.AudioAttributesImplBaseParcelizer.getHintId());
        }
        return this.RatingCompat;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.onCommand == z) {
            return;
        }
        this.onCommand = z;
        AudioAttributesCompatParcelizer(z);
        onFastForward();
    }

    public void setIconified(boolean z) {
        if (z) {
            AudioAttributesImplBaseParcelizer();
        } else {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    private boolean onPlayFromSearch() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.onSetRating = z;
        AudioAttributesCompatParcelizer(onPlayFromSearch());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.onPrepareFromSearch = z;
        _addSuperInterfaces _addsuperinterfaces = this.MediaBrowserCompatItemReceiver;
        if (_addsuperinterfaces instanceof setHasDecor) {
            ((setHasDecor) _addsuperinterfaces).AudioAttributesCompatParcelizer(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(_addSuperInterfaces _addsuperinterfaces) {
        this.MediaBrowserCompatItemReceiver = _addsuperinterfaces;
        this.AudioAttributesCompatParcelizer.setAdapter(_addsuperinterfaces);
    }

    public void setMaxWidth(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (onPlayFromSearch()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.handleMediaPlayPauseIfPendingOnHandler;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(onCustomAction(), size);
        } else if (mode == 0) {
            size = this.handleMediaPlayPauseIfPendingOnHandler;
            if (size <= 0) {
                size = onCustomAction();
            }
        } else if (mode == 1073741824 && (i3 = this.handleMediaPlayPauseIfPendingOnHandler) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(onCommand(), size2);
        } else if (mode2 == 0) {
            size2 = onCommand();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.onRewind);
            this.onSetPlaybackSpeed.set(this.onRewind.left, 0, this.onRewind.right, i4 - i2);
            read readVar = this.setSessionImpl;
            if (readVar == null) {
                read readVar2 = new read(this.onSetPlaybackSpeed, this.onRewind, this.AudioAttributesCompatParcelizer);
                this.setSessionImpl = readVar2;
                setTouchDelegate(readVar2);
                return;
            }
            readVar.AudioAttributesCompatParcelizer(this.onSetPlaybackSpeed, this.onRewind);
        }
    }

    private void RemoteActionCompatParcelizer(View view, Rect rect) {
        view.getLocationInWindow(this.onStop);
        getLocationInWindow(this.onSkipToQueueItem);
        int[] iArr = this.onStop;
        int i = iArr[1];
        int[] iArr2 = this.onSkipToQueueItem;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private int onCustomAction() {
        return getContext().getResources().getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_search_view_preferred_width);
    }

    private int onCommand() {
        return getContext().getResources().getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_search_view_preferred_height);
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
        int i = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.AudioAttributesCompatParcelizer.getText());
        this.RemoteActionCompatParcelizer.setVisibility(i);
        IconCompatParcelizer(!zIsEmpty);
        this.onRemoveQueueItemAt.setVisibility(z ? 8 : 0);
        this.MediaDescriptionCompat.setVisibility((this.MediaDescriptionCompat.getDrawable() == null || this.onCommand) ? 8 : 0);
        onPlayFromMediaId();
        RemoteActionCompatParcelizer(zIsEmpty);
        onPrepareFromSearch();
    }

    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        Intent intent;
        SearchableInfo searchableInfo = this.AudioAttributesImplBaseParcelizer;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.AudioAttributesImplBaseParcelizer.getVoiceSearchLaunchWebSearch()) {
            intent = this.ParcelableVolumeInfo;
        } else {
            intent = this.AudioAttributesImplBaseParcelizer.getVoiceSearchLaunchRecognizer() ? this.PlaybackStateCompat : null;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) ? false : true;
    }

    private boolean onPlay() {
        return (this.onSetRating || this.MediaSessionCompatResultReceiverWrapper) && !onPlayFromSearch();
    }

    private void IconCompatParcelizer(boolean z) {
        this.read.setVisibility((this.onSetRating && onPlay() && hasFocus() && (z || !this.MediaSessionCompatResultReceiverWrapper)) ? 0 : 8);
    }

    private void onPrepareFromSearch() {
        this.onSetShuffleMode.setVisibility((onPlay() && (this.read.getVisibility() == 0 || this.AudioAttributesImplApi26Parcelizer.getVisibility() == 0)) ? 0 : 8);
    }

    private void onPlayFromMediaId() {
        boolean zIsEmpty = TextUtils.isEmpty(this.AudioAttributesCompatParcelizer.getText());
        this.write.setVisibility(!zIsEmpty || (this.onCommand && !this.MediaBrowserCompatMediaItem) ? 0 : 8);
        Drawable drawable = this.write.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void onMediaButtonEvent() {
        post(this.MediaSessionCompatToken);
    }

    final void onAddQueueItem() {
        int[] iArr = this.AudioAttributesCompatParcelizer.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.onSeekTo.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.onSetShuffleMode.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.MediaSessionCompatToken);
        post(this.onRemoveQueueItem);
        super.onDetachedFromWindow();
    }

    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        read(charSequence);
    }

    final boolean write(int i, KeyEvent keyEvent) {
        if (this.AudioAttributesImplBaseParcelizer != null && this.MediaBrowserCompatItemReceiver != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return read(this.AudioAttributesCompatParcelizer.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.AudioAttributesCompatParcelizer.setSelection(i == 21 ? 0 : this.AudioAttributesCompatParcelizer.length());
                this.AudioAttributesCompatParcelizer.setListSelection(0);
                this.AudioAttributesCompatParcelizer.clearListSelection();
                this.AudioAttributesCompatParcelizer.write();
                return true;
            }
            if (i == 19) {
                this.AudioAttributesCompatParcelizer.getListSelection();
                return false;
            }
        }
        return false;
    }

    private CharSequence IconCompatParcelizer(CharSequence charSequence) {
        if (!this.onCommand || this.onPrepareFromUri == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.AudioAttributesCompatParcelizer.getTextSize()) * 1.25d);
        this.onPrepareFromUri.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.onPrepareFromUri), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void onFastForward() {
        CharSequence charSequenceOnPrepare = onPrepare();
        SearchAutoComplete searchAutoComplete = this.AudioAttributesCompatParcelizer;
        if (charSequenceOnPrepare == null) {
            charSequenceOnPrepare = "";
        }
        searchAutoComplete.setHint(IconCompatParcelizer(charSequenceOnPrepare));
    }

    private void onPause() {
        this.AudioAttributesCompatParcelizer.setThreshold(this.AudioAttributesImplBaseParcelizer.getSuggestThreshold());
        this.AudioAttributesCompatParcelizer.setImeOptions(this.AudioAttributesImplBaseParcelizer.getImeOptions());
        int inputType = this.AudioAttributesImplBaseParcelizer.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.AudioAttributesImplBaseParcelizer.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.AudioAttributesCompatParcelizer.setInputType(inputType);
        _addSuperInterfaces _addsuperinterfaces = this.MediaBrowserCompatItemReceiver;
        if (_addsuperinterfaces != null) {
            _addsuperinterfaces.read((Cursor) null);
        }
        if (this.AudioAttributesImplBaseParcelizer.getSuggestAuthority() != null) {
            setHasDecor sethasdecor = new setHasDecor(getContext(), this, this.AudioAttributesImplBaseParcelizer, this.onPrepare);
            this.MediaBrowserCompatItemReceiver = sethasdecor;
            this.AudioAttributesCompatParcelizer.setAdapter(sethasdecor);
            ((setHasDecor) this.MediaBrowserCompatItemReceiver).AudioAttributesCompatParcelizer(this.onPrepareFromSearch ? 2 : 1);
        }
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        int i = 8;
        if (this.MediaSessionCompatResultReceiverWrapper && !onPlayFromSearch() && z) {
            this.read.setVisibility(8);
            i = 0;
        }
        this.AudioAttributesImplApi26Parcelizer.setVisibility(i);
    }

    final void write(CharSequence charSequence) {
        Editable text = this.AudioAttributesCompatParcelizer.getText();
        this.MediaSessionCompatQueueItem = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        IconCompatParcelizer(!zIsEmpty);
        RemoteActionCompatParcelizer(zIsEmpty);
        onPlayFromMediaId();
        onPrepareFromSearch();
        if (this.onMediaButtonEvent != null) {
            TextUtils.equals(charSequence, this.onAddQueueItem);
        }
        this.onAddQueueItem = charSequence.toString();
    }

    final void AudioAttributesImplApi21Parcelizer() {
        Editable text = this.AudioAttributesCompatParcelizer.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = this.onMediaButtonEvent;
        if (iconCompatParcelizer == null || !iconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            if (this.AudioAttributesImplBaseParcelizer != null) {
                write(text.toString());
            }
            this.AudioAttributesCompatParcelizer.write(false);
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        this.AudioAttributesCompatParcelizer.dismissDropDown();
    }

    final void AudioAttributesImplBaseParcelizer() {
        if (TextUtils.isEmpty(this.AudioAttributesCompatParcelizer.getText())) {
            if (this.onCommand) {
                write writeVar = this.onFastForward;
                if (writeVar == null || !writeVar.AudioAttributesCompatParcelizer()) {
                    clearFocus();
                    AudioAttributesCompatParcelizer(true);
                    return;
                }
                return;
            }
            return;
        }
        this.AudioAttributesCompatParcelizer.setText("");
        this.AudioAttributesCompatParcelizer.requestFocus();
        this.AudioAttributesCompatParcelizer.write(true);
    }

    final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer(false);
        this.AudioAttributesCompatParcelizer.requestFocus();
        this.AudioAttributesCompatParcelizer.write(true);
        View.OnClickListener onClickListener = this.onPlayFromUri;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    final void MediaBrowserCompatMediaItem() {
        SearchableInfo searchableInfo = this.AudioAttributesImplBaseParcelizer;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(write(this.ParcelableVolumeInfo, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(AudioAttributesCompatParcelizer(this.PlaybackStateCompat, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    final void MediaBrowserCompatItemReceiver() {
        AudioAttributesCompatParcelizer(onPlayFromSearch());
        onMediaButtonEvent();
        if (this.AudioAttributesCompatParcelizer.hasFocus()) {
            read();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        onMediaButtonEvent();
    }

    @Override // kotlin.invalidateMenu
    public final void write() {
        setQuery("", false);
        clearFocus();
        AudioAttributesCompatParcelizer(true);
        this.AudioAttributesCompatParcelizer.setImeOptions(this.MediaBrowserCompatSearchResultReceiver);
        this.MediaBrowserCompatMediaItem = false;
    }

    @Override // kotlin.invalidateMenu
    public final void IconCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        int imeOptions = this.AudioAttributesCompatParcelizer.getImeOptions();
        this.MediaBrowserCompatSearchResultReceiver = imeOptions;
        this.AudioAttributesCompatParcelizer.setImeOptions(imeOptions | 33554432);
        this.AudioAttributesCompatParcelizer.setText("");
        setIconified(false);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return read(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return write(i);
            }

            private static SavedState read(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] write(int i) {
                return new SavedState[i];
            }
        };
        boolean read;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.read = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.read));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.read);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.read = onPlayFromSearch();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        AudioAttributesCompatParcelizer(savedState.read);
        requestLayout();
    }

    final void AudioAttributesCompatParcelizer() {
        int i;
        if (this.MediaMetadataCompat.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.onSeekTo.getPaddingLeft();
            Rect rect = new Rect();
            boolean zAudioAttributesCompatParcelizer = setChecked.AudioAttributesCompatParcelizer(this);
            int dimensionPixelSize = this.onCommand ? resources.getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_dropdownitem_text_padding_left) : 0;
            this.AudioAttributesCompatParcelizer.getDropDownBackground().getPadding(rect);
            if (zAudioAttributesCompatParcelizer) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.AudioAttributesCompatParcelizer.setDropDownHorizontalOffset(i);
            this.AudioAttributesCompatParcelizer.setDropDownWidth((((this.MediaMetadataCompat.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    final boolean read(int i) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPrepareFromMediaId;
        if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.write()) {
            return false;
        }
        MediaBrowserCompatItemReceiver(i);
        this.AudioAttributesCompatParcelizer.write(false);
        handleMediaPlayPauseIfPendingOnHandler();
        return true;
    }

    final boolean write(int i) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPrepareFromMediaId;
        if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            return false;
        }
        MediaBrowserCompatCustomActionResultReceiver(i);
        return true;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(int i) {
        Editable text = this.AudioAttributesCompatParcelizer.getText();
        Cursor cursorAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        if (cursorAudioAttributesCompatParcelizer == null) {
            return;
        }
        if (cursorAudioAttributesCompatParcelizer.moveToPosition(i)) {
            CharSequence charSequenceRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(cursorAudioAttributesCompatParcelizer);
            if (charSequenceRemoteActionCompatParcelizer != null) {
                read(charSequenceRemoteActionCompatParcelizer);
                return;
            } else {
                read(text);
                return;
            }
        }
        read(text);
    }

    private boolean MediaBrowserCompatItemReceiver(int i) {
        Cursor cursorAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        if (cursorAudioAttributesCompatParcelizer == null || !cursorAudioAttributesCompatParcelizer.moveToPosition(i)) {
            return false;
        }
        write(read(cursorAudioAttributesCompatParcelizer, 0, null));
        return true;
    }

    private void write(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            Objects.toString(intent);
        }
    }

    private void read(CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer.setText(charSequence);
        this.AudioAttributesCompatParcelizer.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    final void write(String str) {
        getContext().startActivity(IconCompatParcelizer("android.intent.action.SEARCH", (Uri) null, (String) null, str, 0, (String) null));
    }

    private Intent IconCompatParcelizer(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.MediaSessionCompatQueueItem);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.MediaBrowserCompatCustomActionResultReceiver;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.AudioAttributesImplBaseParcelizer.getSearchActivity());
        return intent;
    }

    private static Intent write(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private Intent AudioAttributesCompatParcelizer(Intent intent, SearchableInfo searchableInfo) {
        String string;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() == 0) {
            string = "free_form";
        } else {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent read(Cursor cursor, int i, String str) {
        String strWrite;
        try {
            try {
                String strWrite2 = setHasDecor.write(cursor, "suggest_intent_action");
                if (strWrite2 == null) {
                    strWrite2 = this.AudioAttributesImplBaseParcelizer.getSuggestIntentAction();
                }
                if (strWrite2 == null) {
                    strWrite2 = "android.intent.action.SEARCH";
                }
                String str2 = strWrite2;
                String strWrite3 = setHasDecor.write(cursor, "suggest_intent_data");
                if (strWrite3 == null) {
                    strWrite3 = this.AudioAttributesImplBaseParcelizer.getSuggestIntentData();
                }
                if (strWrite3 != null && (strWrite = setHasDecor.write(cursor, "suggest_intent_data_id")) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strWrite3);
                    sb.append("/");
                    sb.append(Uri.encode(strWrite));
                    strWrite3 = sb.toString();
                }
                return IconCompatParcelizer(str2, strWrite3 == null ? null : Uri.parse(strWrite3), setHasDecor.write(cursor, "suggest_intent_extra_data"), setHasDecor.write(cursor, "suggest_intent_query"), 0, (String) null);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    final void read() {
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    static boolean write(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static class read extends TouchDelegate {
        private final int AudioAttributesCompatParcelizer;
        private final Rect AudioAttributesImplApi21Parcelizer;
        private final Rect IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private final Rect read;
        private final View write;

        public read(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.AudioAttributesCompatParcelizer = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.AudioAttributesImplApi21Parcelizer = new Rect();
            this.read = new Rect();
            this.IconCompatParcelizer = new Rect();
            AudioAttributesCompatParcelizer(rect, rect2);
            this.write = view;
        }

        public final void AudioAttributesCompatParcelizer(Rect rect, Rect rect2) {
            this.AudioAttributesImplApi21Parcelizer.set(rect);
            this.read.set(rect);
            Rect rect3 = this.read;
            int i = -this.AudioAttributesCompatParcelizer;
            rect3.inset(i, i);
            this.IconCompatParcelizer.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.RemoteActionCompatParcelizer;
                    if (z2 && !this.read.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.RemoteActionCompatParcelizer;
                        this.RemoteActionCompatParcelizer = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.AudioAttributesImplApi21Parcelizer.contains(x, y)) {
                this.RemoteActionCompatParcelizer = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.IconCompatParcelizer.contains(x, y)) {
                motionEvent.setLocation(this.write.getWidth() / 2, this.write.getHeight() / 2);
            } else {
                motionEvent.setLocation(x - this.IconCompatParcelizer.left, y - this.IconCompatParcelizer.top);
            }
            return this.write.dispatchTouchEvent(motionEvent);
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        final Runnable AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private boolean read;
        private SearchView write;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, _init_lambda5.read.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.AudioAttributesCompatParcelizer = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.2
                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete.this.AudioAttributesCompatParcelizer();
                }
            };
            this.IconCompatParcelizer = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, RemoteActionCompatParcelizer(), getResources().getDisplayMetrics()));
        }

        final void read(SearchView searchView) {
            this.write = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.IconCompatParcelizer = i;
        }

        final boolean read() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.write.hasFocus() && getVisibility() == 0) {
                this.read = true;
                if (SearchView.write(getContext())) {
                    write();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.write.MediaBrowserCompatItemReceiver();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.IconCompatParcelizer <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.write.clearFocus();
                        write(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int RemoteActionCompatParcelizer() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return PsExtractor.AUDIO_STREAM;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.read) {
                removeCallbacks(this.AudioAttributesCompatParcelizer);
                post(this.AudioAttributesCompatParcelizer);
            }
            return inputConnectionOnCreateInputConnection;
        }

        final void AudioAttributesCompatParcelizer() {
            if (this.read) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.read = false;
            }
        }

        final void write(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.read = false;
                removeCallbacks(this.AudioAttributesCompatParcelizer);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.read = false;
                    removeCallbacks(this.AudioAttributesCompatParcelizer);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.read = true;
            }
        }

        final void write() {
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }
    }

    static class RemoteActionCompatParcelizer {
        static void RemoteActionCompatParcelizer(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }

        static void AudioAttributesCompatParcelizer(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }
    }
}

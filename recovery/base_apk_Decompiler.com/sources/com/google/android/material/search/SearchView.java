package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.AudioAttributesImplApi26Parcelizer;
import kotlin.DefaultExtractorsFactoryExtensionLoaderConstructorSupplier;
import kotlin.ExtractorInput;
import kotlin.ExtractorReadResult;
import kotlin.FlacStreamMetadata;
import kotlin.InvalidTypeIdException;
import kotlin._addSuperTypes;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.createExtractors;
import kotlin.findFormatOverrides;
import kotlin.finishBranchObject;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getOnBackPressedDispatcher;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readMetadataBlock;
import kotlin.readModes;
import kotlin.readStreamInfoBlock;

/* JADX INFO: loaded from: classes5.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.read, readStreamInfoBlock {
    private static final int MediaBrowserCompatMediaItem = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Material3_SearchView;
    public final TouchObserverFrameLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final MaterialToolbar AudioAttributesImplApi26Parcelizer;
    public final ClippableRoundedCornerLayout AudioAttributesImplBaseParcelizer;
    public final EditText IconCompatParcelizer;
    public final FrameLayout MediaBrowserCompatCustomActionResultReceiver;
    public final View MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final FlacStreamMetadata MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    public final FrameLayout RatingCompat;
    public final View RemoteActionCompatParcelizer;
    private View handleMediaPlayPauseIfPendingOnHandler;
    private Map<View, Integer> onAddQueueItem;
    private final boolean onCommand;
    private final int onCustomAction;
    private final readModes onFastForward;
    private read onMediaButtonEvent;
    private final DefaultExtractorsFactoryExtensionLoaderConstructorSupplier onPause;
    private SearchBar onPlay;
    private final boolean onPlayFromMediaId;
    private int onPlayFromSearch;
    private View onPlayFromUri;
    private boolean onPrepare;
    private final Set<RemoteActionCompatParcelizer> onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    public final ImageButton read;
    public final Toolbar write;

    public interface RemoteActionCompatParcelizer {
    }

    public enum read {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialSearchViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        int i2 = MediaBrowserCompatMediaItem;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new FlacStreamMetadata(this);
        this.onPrepareFromMediaId = new LinkedHashSet();
        this.onPlayFromSearch = 16;
        this.onMediaButtonEvent = read.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.SearchView, i, i2, new int[0]);
        this.onCustomAction = typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_backgroundTint, 0);
        int resourceId = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_android_textAppearance, -1);
        String string = typedArrayWrite.getString(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_android_text);
        String string2 = typedArrayWrite.getString(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_android_hint);
        String string3 = typedArrayWrite.getString(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_searchPrefixText);
        boolean z = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_useDrawerArrowDrawable, false);
        this.MediaDescriptionCompat = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_animateNavigationIcon, true);
        this.MediaMetadataCompat = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_animateMenuItems, true);
        boolean z2 = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_hideNavigationIcon, false);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_autoShowKeyboard, true);
        this.onCommand = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchView_backHandlingEnabled, true);
        typedArrayWrite.recycle();
        LayoutInflater.from(context2).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_search_view, this);
        this.onPlayFromMediaId = true;
        this.MediaBrowserCompatItemReceiver = findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_scrim);
        this.AudioAttributesImplBaseParcelizer = (ClippableRoundedCornerLayout) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_root);
        this.handleMediaPlayPauseIfPendingOnHandler = findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_background);
        this.onPlayFromUri = findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_status_bar_spacer);
        this.MediaBrowserCompatCustomActionResultReceiver = (FrameLayout) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_header_container);
        this.RatingCompat = (FrameLayout) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_toolbar_container);
        this.AudioAttributesImplApi26Parcelizer = (MaterialToolbar) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_toolbar);
        this.write = (Toolbar) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_dummy_toolbar);
        this.AudioAttributesImplApi21Parcelizer = (TextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_search_prefix);
        this.IconCompatParcelizer = (EditText) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_edit_text);
        this.read = (ImageButton) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_clear_button);
        this.RemoteActionCompatParcelizer = findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_divider);
        this.AudioAttributesCompatParcelizer = (TouchObserverFrameLayout) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_view_content_container);
        this.onFastForward = new readModes(this);
        this.onPause = new DefaultExtractorsFactoryExtensionLoaderConstructorSupplier(context2);
        onPrepareFromSearch();
        onPlay();
        IconCompatParcelizer(resourceId);
        setSearchPrefixText(string3);
        AudioAttributesCompatParcelizer(resourceId2, string, string2);
        AudioAttributesCompatParcelizer(z, z2);
        onPlayFromMediaId();
        onMediaButtonEvent();
        onFastForward();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.onPlayFromMediaId) {
            this.AudioAttributesCompatParcelizer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        onSetRepeatMode();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        read(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.IconCompatParcelizer(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.read
    public final CoordinatorLayout.Behavior<SearchView> write() {
        return new Behavior();
    }

    @Override // kotlin.readStreamInfoBlock
    public final void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        if (onCommand() || this.onPlay == null) {
            return;
        }
        this.onFastForward.IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        if (onCommand() || this.onPlay == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.onFastForward.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void AudioAttributesImplApi21Parcelizer() {
        if (onCommand()) {
            return;
        }
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerAudioAttributesImplBaseParcelizer = this.onFastForward.AudioAttributesImplBaseParcelizer();
        if (Build.VERSION.SDK_INT >= 34 && this.onPlay != null && audioAttributesImplApi26ParcelizerAudioAttributesImplBaseParcelizer != null) {
            this.onFastForward.write();
        } else {
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    @Override // kotlin.readStreamInfoBlock
    public final void read() {
        if (onCommand() || this.onPlay == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.onFastForward.RemoteActionCompatParcelizer();
    }

    private boolean onCommand() {
        return this.onMediaButtonEvent.equals(read.HIDDEN) || this.onMediaButtonEvent.equals(read.HIDING);
    }

    private Window MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        Activity activityWrite = ExtractorReadResult.write(getContext());
        if (activityWrite == null) {
            return null;
        }
        return activityWrite.getWindow();
    }

    private void onPrepareFromSearch() {
        this.AudioAttributesImplBaseParcelizer.setOnTouchListener(new View.OnTouchListener() { // from class: o.VorbisUtil
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    private void onPlay() {
        read(handleMediaPlayPauseIfPendingOnHandler());
    }

    private void read(float f) {
        DefaultExtractorsFactoryExtensionLoaderConstructorSupplier defaultExtractorsFactoryExtensionLoaderConstructorSupplier = this.onPause;
        if (defaultExtractorsFactoryExtensionLoaderConstructorSupplier == null || this.handleMediaPlayPauseIfPendingOnHandler == null) {
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler.setBackgroundColor(defaultExtractorsFactoryExtensionLoaderConstructorSupplier.RemoteActionCompatParcelizer(this.onCustomAction, f));
    }

    private float handleMediaPlayPauseIfPendingOnHandler() {
        SearchBar searchBar = this.onPlay;
        if (searchBar != null) {
            return searchBar.onPlayFromUri();
        }
        return getResources().getDimension(calculateNextSearchBytePosition.write.m3_searchview_elevation);
    }

    private void IconCompatParcelizer(int i) {
        if (i != -1) {
            IconCompatParcelizer(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.MediaBrowserCompatCustomActionResultReceiver, false));
        }
    }

    private void AudioAttributesCompatParcelizer(int i, String str, String str2) {
        if (i != -1) {
            _addSuperTypes.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i);
        }
        this.IconCompatParcelizer.setText(str);
        this.IconCompatParcelizer.setHint(str2);
    }

    private void AudioAttributesCompatParcelizer(boolean z, boolean z2) {
        if (z2) {
            this.AudioAttributesImplApi26Parcelizer.setNavigationIcon((Drawable) null);
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.readFloors
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            }
        });
        if (z) {
            getOnBackPressedDispatcher getonbackpresseddispatcher = new getOnBackPressedDispatcher(getContext());
            getonbackpresseddispatcher.read(createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurface));
            this.AudioAttributesImplApi26Parcelizer.setNavigationIcon(getonbackpresseddispatcher);
        }
    }

    private void onPlayFromMediaId() {
        this.read.setOnClickListener(new View.OnClickListener() { // from class: o.VorbisBitArray
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.RemoteActionCompatParcelizer.MediaMetadataCompat();
            }
        });
        this.IconCompatParcelizer.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.read.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    public final /* synthetic */ void MediaMetadataCompat() {
        onSeekTo();
        RatingCompat();
    }

    private void onMediaButtonEvent() {
        this.AudioAttributesCompatParcelizer.setOnTouchListener(new View.OnTouchListener() { // from class: o.mapType1QuantValues
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
            }
        });
    }

    public final /* synthetic */ boolean MediaBrowserCompatMediaItem() {
        if (!AudioAttributesCompatParcelizer()) {
            return false;
        }
        IconCompatParcelizer();
        return false;
    }

    private void read(int i) {
        if (this.onPlayFromUri.getLayoutParams().height != i) {
            this.onPlayFromUri.getLayoutParams().height = i;
            this.onPlayFromUri.requestLayout();
        }
    }

    private int onCustomAction() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", LogSubCategory.LifeCycle.ANDROID);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void onPlayFromUri() {
        MaterialToolbar materialToolbar = this.AudioAttributesImplApi26Parcelizer;
        if (materialToolbar == null || read(materialToolbar)) {
            return;
        }
        int iOnRemoveQueueItemAt = onRemoveQueueItemAt();
        if (this.onPlay == null) {
            this.AudioAttributesImplApi26Parcelizer.setNavigationIcon(iOnRemoveQueueItemAt);
            return;
        }
        Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(getDefaultViewModelCreationExtras.write(getContext(), iOnRemoveQueueItemAt).mutate());
        if (this.AudioAttributesImplApi26Parcelizer.onPrepare() != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi26Parcelizer.onPrepare().intValue());
        }
        this.AudioAttributesImplApi26Parcelizer.setNavigationIcon(new ExtractorInput(this.onPlay.AudioAttributesImplApi21Parcelizer(), drawableAudioAttributesImplApi26Parcelizer));
        onPrepare();
    }

    private static boolean read(Toolbar toolbar) {
        return findFormatOverrides.AudioAttributesImplApi21Parcelizer(toolbar.AudioAttributesImplApi21Parcelizer()) instanceof getOnBackPressedDispatcher;
    }

    private void onFastForward() {
        onPrepareFromMediaId();
        onPause();
        onPlayFromSearch();
    }

    private void onPrepareFromMediaId() {
        checkAndPeekStreamMarker.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new checkAndPeekStreamMarker.RemoteActionCompatParcelizer() { // from class: o.readBits
            @Override // o.checkAndPeekStreamMarker.RemoteActionCompatParcelizer
            public final WindowInsetsCompat RemoteActionCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, checkAndPeekStreamMarker.write writeVar) {
                return this.read.RemoteActionCompatParcelizer(windowInsetsCompat, writeVar);
            }
        });
    }

    public final /* synthetic */ WindowInsetsCompat RemoteActionCompatParcelizer(WindowInsetsCompat windowInsetsCompat, checkAndPeekStreamMarker.write writeVar) {
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi26Parcelizer);
        int i = zAudioAttributesImplBaseParcelizer ? writeVar.RemoteActionCompatParcelizer : writeVar.read;
        int i2 = zAudioAttributesImplBaseParcelizer ? writeVar.read : writeVar.RemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer.setPadding(i + windowInsetsCompat.AudioAttributesImplApi21Parcelizer(), writeVar.write, i2 + windowInsetsCompat.MediaBrowserCompatItemReceiver(), writeVar.IconCompatParcelizer);
        return windowInsetsCompat;
    }

    private void onPlayFromSearch() {
        read(onCustomAction());
        InvalidTypeIdException.read(this.onPlayFromUri, new finishBranchObject() { // from class: o.skipBits
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.read.IconCompatParcelizer(windowInsetsCompat);
            }
        });
    }

    public final /* synthetic */ WindowInsetsCompat IconCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver();
        read(iMediaBrowserCompatCustomActionResultReceiver);
        if (!this.onPrepareFromSearch) {
            write(iMediaBrowserCompatCustomActionResultReceiver > 0);
        }
        return windowInsetsCompat;
    }

    private void onPause() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.RemoteActionCompatParcelizer.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        InvalidTypeIdException.read(this.RemoteActionCompatParcelizer, new finishBranchObject() { // from class: o.bitsLeft
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.RemoteActionCompatParcelizer(marginLayoutParams, i, i2, windowInsetsCompat);
            }
        });
    }

    public static /* synthetic */ WindowInsetsCompat RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, WindowInsetsCompat windowInsetsCompat) {
        marginLayoutParams.leftMargin = i + windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
        marginLayoutParams.rightMargin = i2 + windowInsetsCompat.MediaBrowserCompatItemReceiver();
        return windowInsetsCompat;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.onPlay != null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.onPlay = searchBar;
        this.onFastForward.AudioAttributesCompatParcelizer(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: o.parseVorbisComments
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.IconCompatParcelizer.MediaDescriptionCompat();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: o.iLog
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
                        }
                    });
                    this.IconCompatParcelizer.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        onPlayFromUri();
        onPlay();
        IconCompatParcelizer(onRemoveQueueItem());
    }

    private void IconCompatParcelizer(View view) {
        this.MediaBrowserCompatCustomActionResultReceiver.addView(view);
        this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(0);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public void setMenuItemsAnimated(boolean z) {
        this.MediaMetadataCompat = z;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
    }

    public void setUseWindowInsetsController(boolean z) {
        this.onPrepare = z;
    }

    public void setOnMenuItemClickListener(Toolbar.IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer.setOnMenuItemClickListener(iconCompatParcelizer);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.AudioAttributesImplApi21Parcelizer.setText(charSequence);
        this.AudioAttributesImplApi21Parcelizer.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private Editable onPrepareFromUri() {
        return this.IconCompatParcelizer.getText();
    }

    public void setText(CharSequence charSequence) {
        this.IconCompatParcelizer.setText(charSequence);
    }

    public void setText(int i) {
        this.IconCompatParcelizer.setText(i);
    }

    private void onSeekTo() {
        this.IconCompatParcelizer.setText("");
    }

    public void setHint(CharSequence charSequence) {
        this.IconCompatParcelizer.setHint(charSequence);
    }

    public void setHint(int i) {
        this.IconCompatParcelizer.setHint(i);
    }

    private void onSetRepeatMode() {
        Window windowMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (windowMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
            this.onPlayFromSearch = windowMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getAttributes().softInputMode;
        }
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.onPrepareFromSearch = true;
        write(z);
    }

    private void write(boolean z) {
        this.onPlayFromUri.setVisibility(z ? 0 : 8);
    }

    private read onRemoveQueueItem() {
        return this.onMediaButtonEvent;
    }

    public final void write(read readVar) {
        IconCompatParcelizer(readVar, true);
    }

    private void IconCompatParcelizer(read readVar, boolean z) {
        if (this.onMediaButtonEvent.equals(readVar)) {
            return;
        }
        if (z) {
            if (readVar == read.SHOWN) {
                setModalForAccessibility(true);
            } else if (readVar == read.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        this.onMediaButtonEvent = readVar;
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : new LinkedHashSet(this.onPrepareFromMediaId)) {
        }
        IconCompatParcelizer(readVar);
    }

    private void IconCompatParcelizer(read readVar) {
        if (this.onPlay == null || !this.onCommand) {
            return;
        }
        if (readVar.equals(read.SHOWN)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer();
        } else if (readVar.equals(read.HIDDEN)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: merged with bridge method [inline-methods] */
    public final void MediaDescriptionCompat() {
        if (this.onMediaButtonEvent.equals(read.SHOWN) || this.onMediaButtonEvent.equals(read.SHOWING)) {
            return;
        }
        this.onFastForward.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onRewind, reason: merged with bridge method [inline-methods] */
    public void MediaBrowserCompatSearchResultReceiver() {
        if (this.onMediaButtonEvent.equals(read.HIDDEN) || this.onMediaButtonEvent.equals(read.HIDING)) {
            return;
        }
        this.onFastForward.AudioAttributesCompatParcelizer();
    }

    public void setVisible(boolean z) {
        boolean z2 = this.AudioAttributesImplBaseParcelizer.getVisibility() == 0;
        this.AudioAttributesImplBaseParcelizer.setVisibility(z ? 0 : 8);
        onPrepare();
        IconCompatParcelizer(z ? read.SHOWN : read.HIDDEN, z2 != z);
    }

    private void onPrepare() {
        ImageButton imageButtonIconCompatParcelizer = readMetadataBlock.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (imageButtonIconCompatParcelizer != null) {
            int i = this.AudioAttributesImplBaseParcelizer.getVisibility() == 0 ? 1 : 0;
            Drawable drawableAudioAttributesImplApi21Parcelizer = findFormatOverrides.AudioAttributesImplApi21Parcelizer(imageButtonIconCompatParcelizer.getDrawable());
            if (drawableAudioAttributesImplApi21Parcelizer instanceof getOnBackPressedDispatcher) {
                ((getOnBackPressedDispatcher) drawableAudioAttributesImplApi21Parcelizer).AudioAttributesCompatParcelizer(i);
            }
            if (drawableAudioAttributesImplApi21Parcelizer instanceof ExtractorInput) {
                ((ExtractorInput) drawableAudioAttributesImplApi21Parcelizer).IconCompatParcelizer(i);
            }
        }
    }

    public final void RatingCompat() {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            onSetPlaybackSpeed();
        }
    }

    private void onSetPlaybackSpeed() {
        this.IconCompatParcelizer.postDelayed(new Runnable() { // from class: o.assertValidOffset
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        }, 100L);
    }

    public final /* synthetic */ void AudioAttributesImplBaseParcelizer() {
        if (this.IconCompatParcelizer.requestFocus()) {
            this.IconCompatParcelizer.sendAccessibilityEvent(8);
        }
        checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.onPrepare);
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.post(new Runnable() { // from class: o.readBit
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
    }

    public final /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver() {
        this.IconCompatParcelizer.clearFocus();
        SearchBar searchBar = this.onPlay;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        checkAndPeekStreamMarker.read(this.IconCompatParcelizer, this.onPrepare);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.onPlayFromSearch == 48;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.onAddQueueItem = new HashMap(viewGroup.getChildCount());
        }
        read(viewGroup, z);
        if (z) {
            return;
        }
        this.onAddQueueItem = null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.setTouchscreenBlocksFocus(z);
    }

    private void read(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.AudioAttributesImplBaseParcelizer.getId()) != null) {
                    read((ViewGroup) childAt, z);
                } else if (!z) {
                    Map<View, Integer> map = this.onAddQueueItem;
                    if (map != null && map.containsKey(childAt)) {
                        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, this.onAddQueueItem.get(childAt).intValue());
                    }
                } else {
                    this.onAddQueueItem.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, 4);
                }
            }
        }
    }

    private static int onRemoveQueueItemAt() {
        return calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.ic_arrow_back_black_24;
    }

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* synthetic */ boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return read((SearchView) view, view2);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private static boolean read(SearchView searchView, View view) {
            if (searchView.AudioAttributesImplApi26Parcelizer() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable editableOnPrepareFromUri = onPrepareFromUri();
        savedState.RemoteActionCompatParcelizer = editableOnPrepareFromUri == null ? null : editableOnPrepareFromUri.toString();
        savedState.read = this.AudioAttributesImplBaseParcelizer.getVisibility();
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
        setText(savedState.RemoteActionCompatParcelizer);
        setVisible(savedState.read == 0);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
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
                return read(i);
            }

            private static SavedState read(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] read(int i) {
                return new SavedState[i];
            }
        };
        String RemoteActionCompatParcelizer;
        int read;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.RemoteActionCompatParcelizer = parcel.readString();
            this.read = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.read);
        }
    }
}

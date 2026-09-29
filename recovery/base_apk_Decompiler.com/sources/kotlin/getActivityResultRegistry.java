package kotlin;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin._init_lambda5;
import kotlin.onActivityResult;
import kotlin.onRequestPermissionsResult;

/* JADX INFO: loaded from: classes.dex */
public final class getActivityResultRegistry extends ActionBar implements ActionBarOverlayLayout.IconCompatParcelizer {
    private static final Interpolator MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new AccelerateInterpolator();
    private static final Interpolator onAddQueueItem = new DecelerateInterpolator();
    boolean AudioAttributesImplApi21Parcelizer;
    ActionBarContextView AudioAttributesImplApi26Parcelizer;
    onActivityResult.write AudioAttributesImplBaseParcelizer;
    ActionBarContainer IconCompatParcelizer;
    onActivityResult MediaBrowserCompatCustomActionResultReceiver;
    onCreatePanelMenu MediaBrowserCompatItemReceiver;
    boolean MediaBrowserCompatMediaItem;
    boolean MediaMetadataCompat;
    ActionBarOverlayLayout RatingCompat;
    View RemoteActionCompatParcelizer;
    private Activity onCommand;
    private ActionBarLayoutParams onFastForward;
    private boolean onMediaButtonEvent;
    private boolean onPlay;
    private boolean onPlayFromMediaId;
    private boolean onPlayFromUri;
    private boolean onPrepareFromMediaId;
    private ScrollingTabContainerView onPrepareFromSearch;
    private Context onRewind;
    Context read;
    read write;
    private ArrayList<Object> onRemoveQueueItemAt = new ArrayList<>();
    private int onPrepare = -1;
    private ArrayList<ActionBar.read> onPause = new ArrayList<>();
    private int handleMediaPlayPauseIfPendingOnHandler = 0;
    boolean AudioAttributesCompatParcelizer = true;
    private boolean onPlayFromSearch = true;
    final NioPathDeserializer MediaDescriptionCompat = new Java7SupportImpl() { // from class: o.getActivityResultRegistry.5
        @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
        public final void RemoteActionCompatParcelizer(View view) {
            if (getActivityResultRegistry.this.AudioAttributesCompatParcelizer && getActivityResultRegistry.this.RemoteActionCompatParcelizer != null) {
                getActivityResultRegistry.this.RemoteActionCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                getActivityResultRegistry.this.IconCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            getActivityResultRegistry.this.IconCompatParcelizer.setVisibility(8);
            getActivityResultRegistry.this.IconCompatParcelizer.setTransitioning(false);
            getActivityResultRegistry.this.MediaBrowserCompatItemReceiver = null;
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer();
            if (getActivityResultRegistry.this.RatingCompat != null) {
                InvalidTypeIdException.onSetRepeatMode(getActivityResultRegistry.this.RatingCompat);
            }
        }
    };
    final NioPathDeserializer MediaBrowserCompatSearchResultReceiver = new Java7SupportImpl() { // from class: o.getActivityResultRegistry.4
        @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
        public final void RemoteActionCompatParcelizer(View view) {
            getActivityResultRegistry.this.MediaBrowserCompatItemReceiver = null;
            getActivityResultRegistry.this.IconCompatParcelizer.requestLayout();
        }
    };
    final OptionalHandlerFactory onCustomAction = new OptionalHandlerFactory() { // from class: o.getActivityResultRegistry.1
        @Override // kotlin.OptionalHandlerFactory
        public final void IconCompatParcelizer() {
            ((View) getActivityResultRegistry.this.IconCompatParcelizer.getParent()).invalidate();
        }
    };

    static boolean AudioAttributesCompatParcelizer(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public getActivityResultRegistry(Activity activity, boolean z) {
        this.onCommand = activity;
        View decorView = activity.getWindow().getDecorView();
        AudioAttributesCompatParcelizer(decorView);
        if (z) {
            return;
        }
        this.RemoteActionCompatParcelizer = decorView.findViewById(R.id.content);
    }

    public getActivityResultRegistry(Dialog dialog) {
        AudioAttributesCompatParcelizer(dialog.getWindow().getDecorView());
    }

    private void AudioAttributesCompatParcelizer(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.decor_content_parent);
        this.RatingCompat = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.onFastForward = read(view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar));
        this.AudioAttributesImplApi26Parcelizer = (ActionBarContextView) view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar_container);
        this.IconCompatParcelizer = actionBarContainer;
        ActionBarLayoutParams actionBarLayoutParams = this.onFastForward;
        if (actionBarLayoutParams == null || this.AudioAttributesImplApi26Parcelizer == null || actionBarContainer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.read = actionBarLayoutParams.AudioAttributesCompatParcelizer();
        if ((this.onFastForward.RemoteActionCompatParcelizer() & 4) != 0) {
            this.onPlay = true;
        }
        getFullyDrawnReporter getfullydrawnreporterRemoteActionCompatParcelizer = getFullyDrawnReporter.RemoteActionCompatParcelizer(this.read);
        getfullydrawnreporterRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver(getfullydrawnreporterRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
        TypedArray typedArrayObtainStyledAttributes = this.read.obtainStyledAttributes(null, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar, _init_lambda5.read.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_hideOnContentScroll, false)) {
            AudioAttributesImplApi21Parcelizer();
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            AudioAttributesCompatParcelizer(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ActionBarLayoutParams read(View view) {
        if (view instanceof ActionBarLayoutParams) {
            return (ActionBarLayoutParams) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).handleMediaPlayPauseIfPendingOnHandler();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(float f) {
        InvalidTypeIdException.write(this.IconCompatParcelizer, f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void IconCompatParcelizer(Configuration configuration) {
        MediaBrowserCompatCustomActionResultReceiver(getFullyDrawnReporter.RemoteActionCompatParcelizer(this.read).MediaBrowserCompatItemReceiver());
    }

    private void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.onMediaButtonEvent = z;
        if (!z) {
            this.onFastForward.RemoteActionCompatParcelizer((ScrollingTabContainerView) null);
            this.IconCompatParcelizer.setTabContainer(this.onPrepareFromSearch);
        } else {
            this.IconCompatParcelizer.setTabContainer(null);
            this.onFastForward.RemoteActionCompatParcelizer(this.onPrepareFromSearch);
        }
        boolean z2 = onCommand() == 2;
        this.onFastForward.IconCompatParcelizer(!this.onMediaButtonEvent && z2);
        this.RatingCompat.setHasNonEmbeddedTabs(!this.onMediaButtonEvent && z2);
    }

    final void AudioAttributesImplApi26Parcelizer() {
        onActivityResult.write writeVar = this.AudioAttributesImplBaseParcelizer;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void write(boolean z) {
        onCreatePanelMenu oncreatepanelmenu;
        this.onPrepareFromMediaId = z;
        if (z || (oncreatepanelmenu = this.MediaBrowserCompatItemReceiver) == null) {
            return;
        }
        oncreatepanelmenu.IconCompatParcelizer();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (z != this.onPlayFromMediaId) {
            this.onPlayFromMediaId = z;
            int size = this.onPause.size();
            for (int i = 0; i < size; i++) {
                this.onPause.get(i);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void RemoteActionCompatParcelizer(boolean z) {
        write(z ? 4 : 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(int i) {
        write(this.read.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void write(CharSequence charSequence) {
        this.onFastForward.IconCompatParcelizer(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        this.onFastForward.write(charSequence);
    }

    private void write(int i) {
        int iRemoteActionCompatParcelizer = this.onFastForward.RemoteActionCompatParcelizer();
        this.onPlay = true;
        this.onFastForward.write((i & 4) | (iRemoteActionCompatParcelizer & (-5)));
    }

    private int onCommand() {
        return this.onFastForward.AudioAttributesImplApi26Parcelizer();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int read() {
        return this.onFastForward.RemoteActionCompatParcelizer();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final onActivityResult write(onActivityResult.write writeVar) {
        read readVar = this.write;
        if (readVar != null) {
            readVar.IconCompatParcelizer();
        }
        this.RatingCompat.setHideOnContentScrollEnabled(false);
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
        read readVar2 = new read(this.AudioAttributesImplApi26Parcelizer.getContext(), writeVar);
        if (!readVar2.read()) {
            return null;
        }
        this.write = readVar2;
        readVar2.AudioAttributesImplApi21Parcelizer();
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(readVar2);
        read(true);
        return readVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.IconCompatParcelizer
    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        if (this.onPlayFromUri) {
            return;
        }
        this.onPlayFromUri = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.RatingCompat;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        MediaBrowserCompatItemReceiver(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.IconCompatParcelizer
    public final void MediaBrowserCompatSearchResultReceiver() {
        if (this.MediaMetadataCompat) {
            this.MediaMetadataCompat = false;
            MediaBrowserCompatItemReceiver(true);
        }
    }

    private void RatingCompat() {
        if (this.onPlayFromUri) {
            this.onPlayFromUri = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.RatingCompat;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            MediaBrowserCompatItemReceiver(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        if (this.MediaMetadataCompat) {
            return;
        }
        this.MediaMetadataCompat = true;
        MediaBrowserCompatItemReceiver(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesImplApi21Parcelizer() {
        if (!this.RatingCompat.read()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.MediaBrowserCompatMediaItem = true;
        this.RatingCompat.setHideOnContentScrollEnabled(true);
    }

    private void MediaBrowserCompatItemReceiver(boolean z) {
        if (AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.MediaMetadataCompat, this.onPlayFromUri)) {
            if (this.onPlayFromSearch) {
                return;
            }
            this.onPlayFromSearch = true;
            AudioAttributesImplBaseParcelizer(z);
            return;
        }
        if (this.onPlayFromSearch) {
            this.onPlayFromSearch = false;
            AudioAttributesImplApi26Parcelizer(z);
        }
    }

    private void AudioAttributesImplBaseParcelizer(boolean z) {
        View view;
        View view2;
        onCreatePanelMenu oncreatepanelmenu = this.MediaBrowserCompatItemReceiver;
        if (oncreatepanelmenu != null) {
            oncreatepanelmenu.IconCompatParcelizer();
        }
        this.IconCompatParcelizer.setVisibility(0);
        if (this.handleMediaPlayPauseIfPendingOnHandler == 0 && (this.onPrepareFromMediaId || z)) {
            this.IconCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f = -this.IconCompatParcelizer.getHeight();
            if (z) {
                this.IconCompatParcelizer.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.IconCompatParcelizer.setTranslationY(f);
            onCreatePanelMenu oncreatepanelmenu2 = new onCreatePanelMenu();
            findTransient findtransientAudioAttributesCompatParcelizer = InvalidTypeIdException.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            findtransientAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.onCustomAction);
            oncreatepanelmenu2.write(findtransientAudioAttributesCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer && (view2 = this.RemoteActionCompatParcelizer) != null) {
                view2.setTranslationY(f);
                oncreatepanelmenu2.write(InvalidTypeIdException.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED));
            }
            oncreatepanelmenu2.AudioAttributesCompatParcelizer(onAddQueueItem);
            oncreatepanelmenu2.read(250L);
            oncreatepanelmenu2.write(this.MediaBrowserCompatSearchResultReceiver);
            this.MediaBrowserCompatItemReceiver = oncreatepanelmenu2;
            oncreatepanelmenu2.write();
        } else {
            this.IconCompatParcelizer.setAlpha(1.0f);
            this.IconCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.AudioAttributesCompatParcelizer && (view = this.RemoteActionCompatParcelizer) != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.RatingCompat;
        if (actionBarOverlayLayout != null) {
            InvalidTypeIdException.onSetRepeatMode(actionBarOverlayLayout);
        }
    }

    private void AudioAttributesImplApi26Parcelizer(boolean z) {
        View view;
        onCreatePanelMenu oncreatepanelmenu = this.MediaBrowserCompatItemReceiver;
        if (oncreatepanelmenu != null) {
            oncreatepanelmenu.IconCompatParcelizer();
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler == 0 && (this.onPrepareFromMediaId || z)) {
            this.IconCompatParcelizer.setAlpha(1.0f);
            this.IconCompatParcelizer.setTransitioning(true);
            onCreatePanelMenu oncreatepanelmenu2 = new onCreatePanelMenu();
            float f = -this.IconCompatParcelizer.getHeight();
            if (z) {
                this.IconCompatParcelizer.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            findTransient findtransientAudioAttributesCompatParcelizer = InvalidTypeIdException.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).AudioAttributesCompatParcelizer(f);
            findtransientAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.onCustomAction);
            oncreatepanelmenu2.write(findtransientAudioAttributesCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer && (view = this.RemoteActionCompatParcelizer) != null) {
                oncreatepanelmenu2.write(InvalidTypeIdException.AudioAttributesCompatParcelizer(view).AudioAttributesCompatParcelizer(f));
            }
            oncreatepanelmenu2.AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            oncreatepanelmenu2.read(250L);
            oncreatepanelmenu2.write(this.MediaDescriptionCompat);
            this.MediaBrowserCompatItemReceiver = oncreatepanelmenu2;
            oncreatepanelmenu2.write();
            return;
        }
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(null);
    }

    public final void read(boolean z) {
        findTransient findtransientWrite;
        findTransient findtransientWrite2;
        if (z) {
            handleMediaPlayPauseIfPendingOnHandler();
        } else {
            RatingCompat();
        }
        if (!MediaBrowserCompatMediaItem()) {
            if (z) {
                this.onFastForward.read(4);
                this.AudioAttributesImplApi26Parcelizer.setVisibility(0);
                return;
            } else {
                this.onFastForward.read(0);
                this.AudioAttributesImplApi26Parcelizer.setVisibility(8);
                return;
            }
        }
        if (z) {
            findtransientWrite = this.onFastForward.IconCompatParcelizer(4, 100L);
            findtransientWrite2 = this.AudioAttributesImplApi26Parcelizer.write(0, 200L);
        } else {
            findTransient findtransientIconCompatParcelizer = this.onFastForward.IconCompatParcelizer(0, 200L);
            findtransientWrite = this.AudioAttributesImplApi26Parcelizer.write(8, 100L);
            findtransientWrite2 = findtransientIconCompatParcelizer;
        }
        onCreatePanelMenu oncreatepanelmenu = new onCreatePanelMenu();
        oncreatepanelmenu.write(findtransientWrite, findtransientWrite2);
        oncreatepanelmenu.write();
    }

    private boolean MediaBrowserCompatMediaItem() {
        return InvalidTypeIdException.onSeekTo(this.IconCompatParcelizer);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context IconCompatParcelizer() {
        if (this.onRewind == null) {
            TypedValue typedValue = new TypedValue();
            this.read.getTheme().resolveAttribute(_init_lambda5.read.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.onRewind = new ContextThemeWrapper(this.read, i);
            } else {
                this.onRewind = this.read;
            }
        }
        return this.onRewind;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.onFastForward.RemoteActionCompatParcelizer(com.marrow.R.drawable.ic_action_arrow_back);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.IconCompatParcelizer
    public final void MediaMetadataCompat() {
        onCreatePanelMenu oncreatepanelmenu = this.MediaBrowserCompatItemReceiver;
        if (oncreatepanelmenu != null) {
            oncreatepanelmenu.IconCompatParcelizer();
            this.MediaBrowserCompatItemReceiver = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean RemoteActionCompatParcelizer() {
        ActionBarLayoutParams actionBarLayoutParams = this.onFastForward;
        if (actionBarLayoutParams == null || !actionBarLayoutParams.MediaBrowserCompatItemReceiver()) {
            return false;
        }
        this.onFastForward.read();
        return true;
    }

    public class read extends onActivityResult implements onRequestPermissionsResult.RemoteActionCompatParcelizer {
        private final Context IconCompatParcelizer;
        private final onRequestPermissionsResult RemoteActionCompatParcelizer;
        private onActivityResult.write read;
        private WeakReference<View> write;

        public read(Context context, onActivityResult.write writeVar) {
            this.IconCompatParcelizer = context;
            this.read = writeVar;
            onRequestPermissionsResult onrequestpermissionsresultHandleMediaPlayPauseIfPendingOnHandler = new onRequestPermissionsResult(context).handleMediaPlayPauseIfPendingOnHandler();
            this.RemoteActionCompatParcelizer = onrequestpermissionsresultHandleMediaPlayPauseIfPendingOnHandler;
            onrequestpermissionsresultHandleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(this);
        }

        @Override // kotlin.onActivityResult
        public final MenuInflater AudioAttributesCompatParcelizer() {
            return new onMenuItemSelected(this.IconCompatParcelizer);
        }

        @Override // kotlin.onActivityResult
        public final Menu RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.onActivityResult
        public final void IconCompatParcelizer() {
            if (getActivityResultRegistry.this.write != this) {
                return;
            }
            if (!getActivityResultRegistry.AudioAttributesCompatParcelizer(getActivityResultRegistry.this.AudioAttributesImplApi21Parcelizer, getActivityResultRegistry.this.MediaMetadataCompat, false)) {
                getActivityResultRegistry.this.MediaBrowserCompatCustomActionResultReceiver = this;
                getActivityResultRegistry.this.AudioAttributesImplBaseParcelizer = this.read;
            } else {
                this.read.RemoteActionCompatParcelizer(this);
            }
            this.read = null;
            getActivityResultRegistry.this.read(false);
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            getActivityResultRegistry.this.RatingCompat.setHideOnContentScrollEnabled(getActivityResultRegistry.this.MediaBrowserCompatMediaItem);
            getActivityResultRegistry.this.write = null;
        }

        @Override // kotlin.onActivityResult
        public final void AudioAttributesImplApi21Parcelizer() {
            if (getActivityResultRegistry.this.write != this) {
                return;
            }
            this.RemoteActionCompatParcelizer.onFastForward();
            try {
                this.read.RemoteActionCompatParcelizer(this, this.RemoteActionCompatParcelizer);
            } finally {
                this.RemoteActionCompatParcelizer.onCustomAction();
            }
        }

        public final boolean read() {
            this.RemoteActionCompatParcelizer.onFastForward();
            try {
                return this.read.AudioAttributesCompatParcelizer(this, this.RemoteActionCompatParcelizer);
            } finally {
                this.RemoteActionCompatParcelizer.onCustomAction();
            }
        }

        @Override // kotlin.onActivityResult
        public final void read(View view) {
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.setCustomView(view);
            this.write = new WeakReference<>(view);
        }

        @Override // kotlin.onActivityResult
        public final void write(CharSequence charSequence) {
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.setSubtitle(charSequence);
        }

        @Override // kotlin.onActivityResult
        public final void RemoteActionCompatParcelizer(CharSequence charSequence) {
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.setTitle(charSequence);
        }

        @Override // kotlin.onActivityResult
        public final void RemoteActionCompatParcelizer(int i) {
            RemoteActionCompatParcelizer((CharSequence) getActivityResultRegistry.this.read.getResources().getString(i));
        }

        @Override // kotlin.onActivityResult
        public final void read(int i) {
            write(getActivityResultRegistry.this.read.getResources().getString(i));
        }

        @Override // kotlin.onActivityResult
        public final CharSequence AudioAttributesImplBaseParcelizer() {
            return getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.onActivityResult
        public final CharSequence MediaBrowserCompatItemReceiver() {
            return getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        }

        @Override // kotlin.onActivityResult
        public final void write(boolean z) {
            super.write(z);
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.setTitleOptional(z);
        }

        @Override // kotlin.onActivityResult
        public final boolean AudioAttributesImplApi26Parcelizer() {
            return getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.write();
        }

        @Override // kotlin.onActivityResult
        public final View write() {
            WeakReference<View> weakReference = this.write;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
        public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
            onActivityResult.write writeVar = this.read;
            if (writeVar != null) {
                return writeVar.IconCompatParcelizer(this, menuItem);
            }
            return false;
        }

        @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
        public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
            if (this.read == null) {
                return;
            }
            AudioAttributesImplApi21Parcelizer();
            getActivityResultRegistry.this.AudioAttributesImplApi26Parcelizer.read();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void IconCompatParcelizer(boolean z) {
        if (this.onPlay) {
            return;
        }
        RemoteActionCompatParcelizer(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean RemoteActionCompatParcelizer(int i, KeyEvent keyEvent) {
        Menu menuRemoteActionCompatParcelizer;
        read readVar = this.write;
        if (readVar == null || (menuRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer()) == null) {
            return false;
        }
        menuRemoteActionCompatParcelizer.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuRemoteActionCompatParcelizer.performShortcut(i, keyEvent, 0);
    }
}

package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin._int;

/* JADX INFO: loaded from: classes2.dex */
public class JdkDeserializers {
    int AudioAttributesCompatParcelizer;
    public float AudioAttributesImplApi21Parcelizer;
    public _int AudioAttributesImplBaseParcelizer;
    public getMapClass IconCompatParcelizer;
    int MediaBrowserCompatCustomActionResultReceiver;
    float MediaBrowserCompatItemReceiver;
    public IconCompatParcelizer[] MediaBrowserCompatSearchResultReceiver;
    private int MediaSessionCompatToken;
    private Object PlaybackStateCompat;
    private String PlaybackStateCompatCustomAction;
    public _int[] RatingCompat;
    protected ArrayList<_int> RemoteActionCompatParcelizer;
    private int ResultReceiver;
    private boolean _init_lambda4;
    private JdkDeserializers _init_lambda5;
    private boolean accessaddObserverForBackInvoker;
    private boolean accessensureViewModelStore;
    private boolean addContentView;
    private boolean[] addObserverForBackInvoker;
    private boolean addObserverForBackInvokerlambda7;
    private int addOnConfigurationChangedListener;
    private int addOnContextAvailableListener;
    private int addOnPictureInPictureModeChangedListener;
    private boolean createFullyDrawnExecutor;
    private boolean getFullyDrawnReporter;
    private String getLastCustomNonConfigurationInstance;
    private boolean getLifecycle;
    private boolean getOnBackPressedDispatcher;
    private JdkDeserializers getSavedStateRegistry;
    private boolean getViewModelStore;
    private int invalidateMenu;
    private int menuHostHelperlambda0;
    private int onBackPressed;
    protected JdkDeserializers[] onCommand;
    protected int onMediaButtonEvent;
    public JdkDeserializers onPlayFromSearch;
    protected JdkDeserializers[] onPlayFromUri;
    protected int onPrepare;
    float onRemoveQueueItem;
    int onRewind;
    protected int onSetCaptioningEnabled;
    public float[] onSetRating;
    protected int onSetRepeatMode;
    public getMapClass onSetShuffleMode;
    public int onSkipToNext;
    private boolean onSkipToQueueItem;
    private boolean onStop;
    private int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private int r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    public int write;
    public boolean onSetPlaybackSpeed = false;
    private NumberDeserializersBigDecimalDeserializer[] onMenuItemSelected = new NumberDeserializersBigDecimalDeserializer[2];
    public NumberDeserializers MediaDescriptionCompat = null;
    public NumberDeserializersBooleanDeserializer onPrepareFromUri = null;
    private boolean[] setSessionImpl = {true, true};
    private boolean addOnUserLeaveHintListener = false;
    private boolean getOnBackPressedDispatcherannotations = true;
    private boolean addOnNewIntentListener = false;
    private boolean addOnMultiWindowModeChangedListener = true;
    private int initializeViewTreeOwners = -1;
    private int _init_lambda2 = -1;
    private _firstHyphenOrUnderscore onSkipToPrevious = new _firstHyphenOrUnderscore(this);
    private boolean addOnTrimMemoryListener = false;
    private boolean getActivityResultRegistry = false;
    private boolean accessgetReportFullyDrawnExecutorp = false;
    private boolean onActivityResult = false;
    public int MediaBrowserCompatMediaItem = -1;
    public int onRemoveQueueItemAt = -1;
    private int onCreate = 0;
    public int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    public int onAddQueueItem = 0;
    public int[] onPrepareFromSearch = new int[2];
    public int onPlayFromMediaId = 0;
    public int handleMediaPlayPauseIfPendingOnHandler = 0;
    public float onFastForward = 1.0f;
    public int onPause = 0;
    public int onCustomAction = 0;
    public float onPlay = 1.0f;
    private int getDefaultViewModelCreationExtras = -1;
    private float getDefaultViewModelProviderFactory = 1.0f;
    private int[] addMenuProvider = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float MediaSessionCompatQueueItem = Float.NaN;
    private boolean _init_lambda3 = false;
    private boolean accessonBackPresseds1027565324 = false;
    private int ensureViewModelStore = 0;
    private int getSavedStateRegistryControllerannotations = 0;
    public _int MediaMetadataCompat = new _int(this, _int.read.LEFT);
    public _int onSeekTo = new _int(this, _int.read.TOP);
    public _int onPrepareFromMediaId = new _int(this, _int.read.RIGHT);
    public _int AudioAttributesImplApi26Parcelizer = new _int(this, _int.read.BOTTOM);
    public _int read = new _int(this, _int.read.BASELINE);
    private _int ParcelableVolumeInfo = new _int(this, _int.read.CENTER_X);
    private _int MediaSessionCompatResultReceiverWrapper = new _int(this, _int.read.CENTER_Y);

    public enum IconCompatParcelizer {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public final NumberDeserializersBigDecimalDeserializer AudioAttributesImplApi21Parcelizer(int i) {
        if (i == 0) {
            return this.MediaDescriptionCompat;
        }
        if (i == 1) {
            return this.onPrepareFromUri;
        }
        return null;
    }

    public final void _init_lambda2() {
        this.MediaMetadataCompat.IconCompatParcelizer(0);
        this.onSetRepeatMode = 0;
    }

    public final void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        this.onSeekTo.IconCompatParcelizer(0);
        this.onSetCaptioningEnabled = 0;
    }

    public final boolean onStop() {
        return this.accessgetReportFullyDrawnExecutorp;
    }

    public final boolean MediaSessionCompatToken() {
        return this.onActivityResult;
    }

    public final void ParcelableVolumeInfo() {
        this.accessgetReportFullyDrawnExecutorp = true;
    }

    public final void MediaSessionCompatQueueItem() {
        this.onActivityResult = true;
    }

    public final void write(int i, int i2) {
        if (this.addOnTrimMemoryListener) {
            return;
        }
        this.MediaMetadataCompat.IconCompatParcelizer(i);
        this.onPrepareFromMediaId.IconCompatParcelizer(i2);
        this.onSetRepeatMode = i;
        this.onBackPressed = i2 - i;
        this.addOnTrimMemoryListener = true;
    }

    public final void IconCompatParcelizer(int i, int i2) {
        if (this.getActivityResultRegistry) {
            return;
        }
        this.onSeekTo.IconCompatParcelizer(i);
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(i2);
        this.onSetCaptioningEnabled = i;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i2 - i;
        if (this._init_lambda3) {
            this.read.IconCompatParcelizer(i + this.AudioAttributesCompatParcelizer);
        }
        this.getActivityResultRegistry = true;
    }

    public final void MediaDescriptionCompat(int i) {
        if (this._init_lambda3) {
            int i2 = i - this.AudioAttributesCompatParcelizer;
            int i3 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            this.onSetCaptioningEnabled = i2;
            this.onSeekTo.IconCompatParcelizer(i2);
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(i3 + i2);
            this.read.IconCompatParcelizer(i);
            this.getActivityResultRegistry = true;
        }
    }

    public boolean AudioAttributesImplApi21Parcelizer() {
        if (this.addOnTrimMemoryListener) {
            return true;
        }
        return this.MediaMetadataCompat.MediaDescriptionCompat() && this.onPrepareFromMediaId.MediaDescriptionCompat();
    }

    public boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (this.getActivityResultRegistry) {
            return true;
        }
        return this.onSeekTo.MediaDescriptionCompat() && this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat();
    }

    public final void PlaybackStateCompatCustomAction() {
        this.addOnTrimMemoryListener = false;
        this.getActivityResultRegistry = false;
        this.accessgetReportFullyDrawnExecutorp = false;
        this.onActivityResult = false;
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            this.RemoteActionCompatParcelizer.get(i).MediaBrowserCompatMediaItem();
        }
    }

    private boolean AudioAttributesCompatParcelizer() {
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (this.RemoteActionCompatParcelizer.get(i).AudioAttributesImplApi21Parcelizer()) {
                return true;
            }
        }
        return false;
    }

    public final boolean MediaBrowserCompatItemReceiver(int i) {
        if (i == 0) {
            return (this.MediaMetadataCompat.read != null ? 1 : 0) + (this.onPrepareFromMediaId.read != null ? 1 : 0) < 2;
        }
        return ((this.onSeekTo.read != null ? 1 : 0) + (this.AudioAttributesImplApi26Parcelizer.read != null ? 1 : 0)) + (this.read.read != null ? 1 : 0) < 2;
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2) {
        if (i == 0) {
            if (this.MediaMetadataCompat.read != null && this.MediaMetadataCompat.read.MediaDescriptionCompat() && this.onPrepareFromMediaId.read != null && this.onPrepareFromMediaId.read.MediaDescriptionCompat()) {
                return (this.onPrepareFromMediaId.read.read() - this.onPrepareFromMediaId.write()) - (this.MediaMetadataCompat.read.read() + this.MediaMetadataCompat.write()) >= i2;
            }
        } else if (this.onSeekTo.read != null && this.onSeekTo.read.MediaDescriptionCompat() && this.AudioAttributesImplApi26Parcelizer.read != null && this.AudioAttributesImplApi26Parcelizer.read.MediaDescriptionCompat()) {
            if ((this.AudioAttributesImplApi26Parcelizer.read.read() - this.AudioAttributesImplApi26Parcelizer.write()) - (this.onSeekTo.read.read() + this.onSeekTo.write()) >= i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean onSkipToPrevious() {
        return this.accessonBackPresseds1027565324;
    }

    public final void _init_lambda3() {
        this.accessonBackPresseds1027565324 = true;
    }

    public final int onFastForward() {
        return this.addMenuProvider[1];
    }

    public final int onPrepare() {
        return this.addMenuProvider[0];
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) {
        this.addMenuProvider[0] = i;
    }

    public final void MediaBrowserCompatMediaItem(int i) {
        this.addMenuProvider[1] = i;
    }

    public final void read(boolean z) {
        this._init_lambda3 = z;
    }

    public final boolean onSkipToQueueItem() {
        return this._init_lambda4;
    }

    public final void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        this._init_lambda4 = true;
    }

    protected final void AudioAttributesCompatParcelizer(int i, boolean z) {
        this.addObserverForBackInvoker[i] = z;
    }

    public final boolean AudioAttributesImplBaseParcelizer(int i) {
        return this.addObserverForBackInvoker[i];
    }

    public final void IconCompatParcelizer(boolean z) {
        this.getOnBackPressedDispatcherannotations = z;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.getOnBackPressedDispatcherannotations && this.invalidateMenu != 8;
    }

    public final void onPlay(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.onCreate = i;
    }

    public final int onPlay() {
        return this.ensureViewModelStore;
    }

    public final int onMediaButtonEvent() {
        return this.getSavedStateRegistryControllerannotations;
    }

    public final void read(int i, int i2) {
        this.ensureViewModelStore = i;
        this.getSavedStateRegistryControllerannotations = i2;
        IconCompatParcelizer(false);
    }

    public void ResultReceiver() {
        this.MediaMetadataCompat.MediaBrowserCompatSearchResultReceiver();
        this.onSeekTo.MediaBrowserCompatSearchResultReceiver();
        this.onPrepareFromMediaId.MediaBrowserCompatSearchResultReceiver();
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver();
        this.read.MediaBrowserCompatSearchResultReceiver();
        this.ParcelableVolumeInfo.MediaBrowserCompatSearchResultReceiver();
        this.MediaSessionCompatResultReceiverWrapper.MediaBrowserCompatSearchResultReceiver();
        this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver();
        this.onPlayFromSearch = null;
        this.MediaSessionCompatQueueItem = Float.NaN;
        this.onBackPressed = 0;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0;
        this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        this.onSetRepeatMode = 0;
        this.onSetCaptioningEnabled = 0;
        this.menuHostHelperlambda0 = 0;
        this.addOnConfigurationChangedListener = 0;
        this.AudioAttributesCompatParcelizer = 0;
        this.onPrepare = 0;
        this.onMediaButtonEvent = 0;
        this.MediaBrowserCompatItemReceiver = 0.5f;
        this.onRemoveQueueItem = 0.5f;
        this.MediaBrowserCompatSearchResultReceiver[0] = IconCompatParcelizer.FIXED;
        this.MediaBrowserCompatSearchResultReceiver[1] = IconCompatParcelizer.FIXED;
        this.PlaybackStateCompat = null;
        this.MediaSessionCompatToken = 0;
        this.invalidateMenu = 0;
        this.getLastCustomNonConfigurationInstance = null;
        this.accessensureViewModelStore = false;
        this.getViewModelStore = false;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.onRewind = 0;
        this.accessaddObserverForBackInvoker = false;
        this.getFullyDrawnReporter = false;
        float[] fArr = this.onSetRating;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.MediaBrowserCompatMediaItem = -1;
        this.onRemoveQueueItemAt = -1;
        int[] iArr = this.addMenuProvider;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        this.onAddQueueItem = 0;
        this.onFastForward = 1.0f;
        this.onPlay = 1.0f;
        this.handleMediaPlayPauseIfPendingOnHandler = Integer.MAX_VALUE;
        this.onCustomAction = Integer.MAX_VALUE;
        this.onPlayFromMediaId = 0;
        this.onPause = 0;
        this.addOnUserLeaveHintListener = false;
        this.getDefaultViewModelCreationExtras = -1;
        this.getDefaultViewModelProviderFactory = 1.0f;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
        boolean[] zArr = this.setSessionImpl;
        zArr[0] = true;
        zArr[1] = true;
        this.accessonBackPresseds1027565324 = false;
        boolean[] zArr2 = this.addObserverForBackInvoker;
        zArr2[0] = false;
        zArr2[1] = false;
        this.getOnBackPressedDispatcherannotations = true;
        int[] iArr2 = this.onPrepareFromSearch;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.initializeViewTreeOwners = -1;
        this._init_lambda2 = -1;
    }

    public final boolean PlaybackStateCompat() {
        return this.MediaBrowserCompatSearchResultReceiver[0] == IconCompatParcelizer.MATCH_CONSTRAINT && this.MediaBrowserCompatSearchResultReceiver[1] == IconCompatParcelizer.MATCH_CONSTRAINT;
    }

    public final boolean onSetPlaybackSpeed() {
        return (this.initializeViewTreeOwners == -1 && this._init_lambda2 == -1) ? false : true;
    }

    public JdkDeserializers() {
        _int _intVar = new _int(this, _int.read.CENTER);
        this.AudioAttributesImplBaseParcelizer = _intVar;
        this.RatingCompat = new _int[]{this.MediaMetadataCompat, this.onPrepareFromMediaId, this.onSeekTo, this.AudioAttributesImplApi26Parcelizer, this.read, _intVar};
        this.RemoteActionCompatParcelizer = new ArrayList<>();
        this.addObserverForBackInvoker = new boolean[2];
        this.MediaBrowserCompatSearchResultReceiver = new IconCompatParcelizer[]{IconCompatParcelizer.FIXED, IconCompatParcelizer.FIXED};
        this.onPlayFromSearch = null;
        this.onBackPressed = 0;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0;
        this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        this.onSetRepeatMode = 0;
        this.onSetCaptioningEnabled = 0;
        this.addOnContextAvailableListener = 0;
        this.addOnPictureInPictureModeChangedListener = 0;
        this.menuHostHelperlambda0 = 0;
        this.addOnConfigurationChangedListener = 0;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = 0.5f;
        this.onRemoveQueueItem = 0.5f;
        this.MediaSessionCompatToken = 0;
        this.invalidateMenu = 0;
        this.onStop = false;
        this.PlaybackStateCompatCustomAction = null;
        this.getLastCustomNonConfigurationInstance = null;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.onRewind = 0;
        this.onSetRating = new float[]{-1.0f, -1.0f};
        this.onCommand = new JdkDeserializers[]{null, null};
        this.onPlayFromUri = new JdkDeserializers[]{null, null};
        this._init_lambda5 = null;
        this.getSavedStateRegistry = null;
        this.write = -1;
        this.onSkipToNext = -1;
        RemoteActionCompatParcelizer();
    }

    public final void x_() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new NumberDeserializers(this);
        }
        if (this.onPrepareFromUri == null) {
            this.onPrepareFromUri = new NumberDeserializersBooleanDeserializer(this);
        }
    }

    public void read(useDefaultValueForUnknownEnum usedefaultvalueforunknownenum) {
        this.MediaMetadataCompat.RatingCompat();
        this.onSeekTo.RatingCompat();
        this.onPrepareFromMediaId.RatingCompat();
        this.AudioAttributesImplApi26Parcelizer.RatingCompat();
        this.read.RatingCompat();
        this.AudioAttributesImplBaseParcelizer.RatingCompat();
        this.ParcelableVolumeInfo.RatingCompat();
        this.MediaSessionCompatResultReceiverWrapper.RatingCompat();
    }

    private void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.add(this.MediaMetadataCompat);
        this.RemoteActionCompatParcelizer.add(this.onSeekTo);
        this.RemoteActionCompatParcelizer.add(this.onPrepareFromMediaId);
        this.RemoteActionCompatParcelizer.add(this.AudioAttributesImplApi26Parcelizer);
        this.RemoteActionCompatParcelizer.add(this.ParcelableVolumeInfo);
        this.RemoteActionCompatParcelizer.add(this.MediaSessionCompatResultReceiverWrapper);
        this.RemoteActionCompatParcelizer.add(this.AudioAttributesImplBaseParcelizer);
        this.RemoteActionCompatParcelizer.add(this.read);
    }

    public final JdkDeserializers onPrepareFromMediaId() {
        return this.onPlayFromSearch;
    }

    public final void write(JdkDeserializers jdkDeserializers) {
        this.onPlayFromSearch = jdkDeserializers;
    }

    public final void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers, float f, int i) {
        AudioAttributesCompatParcelizer(_int.read.CENTER, jdkDeserializers, _int.read.CENTER, i, 0);
        this.MediaSessionCompatQueueItem = f;
    }

    public final void onAddQueueItem(int i) {
        this.invalidateMenu = i;
    }

    public final int onRewind() {
        return this.invalidateMenu;
    }

    public final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        this.onStop = true;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final void IconCompatParcelizer(String str) {
        this.PlaybackStateCompatCustomAction = str;
    }

    public final void write(_getToStringLookup _gettostringlookup) {
        _gettostringlookup.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
        _gettostringlookup.RemoteActionCompatParcelizer(this.onSeekTo);
        _gettostringlookup.RemoteActionCompatParcelizer(this.onPrepareFromMediaId);
        _gettostringlookup.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (this.AudioAttributesCompatParcelizer > 0) {
            _gettostringlookup.RemoteActionCompatParcelizer(this.read);
        }
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        String string2 = "";
        if (this.getLastCustomNonConfigurationInstance != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.getLastCustomNonConfigurationInstance);
            sb2.append(" ");
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        if (this.PlaybackStateCompatCustomAction != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.PlaybackStateCompatCustomAction);
            sb3.append(" ");
            string2 = sb3.toString();
        }
        sb.append(string2);
        sb.append("(");
        sb.append(this.onSetRepeatMode);
        sb.append(", ");
        sb.append(this.onSetCaptioningEnabled);
        sb.append(") - (");
        sb.append(this.onBackPressed);
        sb.append(" x ");
        sb.append(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
        sb.append(")");
        return sb.toString();
    }

    public final int onSetRating() {
        JdkDeserializers jdkDeserializers = this.onPlayFromSearch;
        if (jdkDeserializers != null && (jdkDeserializers instanceof _long)) {
            return ((_long) jdkDeserializers).MediaSessionCompatToken + this.onSetRepeatMode;
        }
        return this.onSetRepeatMode;
    }

    public final int onSetRepeatMode() {
        JdkDeserializers jdkDeserializers = this.onPlayFromSearch;
        if (jdkDeserializers != null && (jdkDeserializers instanceof _long)) {
            return ((_long) jdkDeserializers).PlaybackStateCompat + this.onSetCaptioningEnabled;
        }
        return this.onSetCaptioningEnabled;
    }

    public final int onSetShuffleMode() {
        if (this.invalidateMenu == 8) {
            return 0;
        }
        return this.onBackPressed;
    }

    public final int onAddQueueItem() {
        if (this.invalidateMenu == 8) {
            return 0;
        }
        return this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    public final int IconCompatParcelizer(int i) {
        if (i == 0) {
            return onSetShuffleMode();
        }
        if (i == 1) {
            return onAddQueueItem();
        }
        return 0;
    }

    public final int onPrepareFromSearch() {
        return this.onPrepare;
    }

    public final int onPlayFromSearch() {
        return this.onMediaButtonEvent;
    }

    public final int onPlayFromUri() {
        return onSetRating() + this.onBackPressed;
    }

    public final int MediaDescriptionCompat() {
        return onSetRepeatMode() + this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    public final int onPause() {
        _int _intVar = this.MediaMetadataCompat;
        int i = _intVar != null ? _intVar.AudioAttributesCompatParcelizer : 0;
        _int _intVar2 = this.onPrepareFromMediaId;
        return _intVar2 != null ? i + _intVar2.AudioAttributesCompatParcelizer : i;
    }

    public final int onPrepareFromUri() {
        int i = this.MediaMetadataCompat != null ? this.onSeekTo.AudioAttributesCompatParcelizer : 0;
        return this.onPrepareFromMediaId != null ? i + this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer : i;
    }

    public final float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final float onRemoveQueueItem() {
        return this.onRemoveQueueItem;
    }

    public final float write(int i) {
        if (i == 0) {
            return this.MediaBrowserCompatItemReceiver;
        }
        if (i == 1) {
            return this.onRemoveQueueItem;
        }
        return -1.0f;
    }

    public final boolean onSetCaptioningEnabled() {
        return this._init_lambda3;
    }

    public final int MediaMetadataCompat() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Object RatingCompat() {
        return this.PlaybackStateCompat;
    }

    public final void onPlayFromMediaId(int i) {
        this.onSetRepeatMode = i;
    }

    public final void onMediaButtonEvent(int i) {
        this.onSetCaptioningEnabled = i;
    }

    public final void AudioAttributesImplApi26Parcelizer(int i, int i2) {
        this.onSetRepeatMode = i;
        this.onSetCaptioningEnabled = i2;
    }

    /* JADX INFO: renamed from: o.JdkDeserializers$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[_int.read.values().length];
            write = iArr;
            try {
                iArr[_int.read.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[_int.read.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[_int.read.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[_int.read.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[_int.read.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[_int.read.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[_int.read.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                write[_int.read.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[_int.read.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final void onFastForward(int i) {
        this.onBackPressed = i;
        int i2 = this.onPrepare;
        if (i < i2) {
            this.onBackPressed = i2;
        }
    }

    public final void MediaMetadataCompat(int i) {
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i;
        int i2 = this.onMediaButtonEvent;
        if (i < i2) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i2;
        }
    }

    public final void read(int i, int i2, int i3, float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
        this.onPlayFromMediaId = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = i3;
        this.onFastForward = f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f || i != 0) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 2;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, float f) {
        this.onAddQueueItem = i;
        this.onPause = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.onCustomAction = i3;
        this.onPlay = f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f || i != 0) {
            return;
        }
        this.onAddQueueItem = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[PHI: r0
      0x0082: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:44:0x0082, B:34:0x007b, B:22:0x004d, B:24:0x0053, B:26:0x005f, B:28:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0082 -> B:38:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8c
            int r1 = r9.length()
            if (r1 == 0) goto L8c
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 <= 0) goto L35
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L35
            java.lang.String r6 = r9.substring(r4, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2a
            r3 = r4
            goto L33
        L2a:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L33
            r3 = r5
        L33:
            int r4 = r2 + 1
        L35:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L73
            int r1 = r1 - r5
            if (r2 >= r1) goto L73
            java.lang.String r1 = r9.substring(r4, r2)
            int r2 = r2 + r5
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L82
            int r2 = r9.length()
            if (r2 <= 0) goto L82
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L82
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L82
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L82
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L82
            if (r3 != r5) goto L6d
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L82
            goto L83
        L6d:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L82
            goto L83
        L73:
            java.lang.String r9 = r9.substring(r4)
            int r1 = r9.length()
            if (r1 <= 0) goto L82
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L82
            goto L83
        L82:
            r9 = r0
        L83:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8b
            r8.AudioAttributesImplApi21Parcelizer = r9
            r8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r3
        L8b:
            return
        L8c:
            r8.AudioAttributesImplApi21Parcelizer = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JdkDeserializers.AudioAttributesCompatParcelizer(java.lang.String):void");
    }

    public final float handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int onCommand() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.MediaBrowserCompatItemReceiver = f;
    }

    public final void read(float f) {
        this.onRemoveQueueItem = f;
    }

    public final void onCommand(int i) {
        if (i < 0) {
            this.onPrepare = 0;
        } else {
            this.onPrepare = i;
        }
    }

    public final void onCustomAction(int i) {
        if (i < 0) {
            this.onMediaButtonEvent = 0;
        } else {
            this.onMediaButtonEvent = i;
        }
    }

    private void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.onSetRepeatMode = i;
        this.onSetCaptioningEnabled = i2;
        if (this.invalidateMenu == 8) {
            this.onBackPressed = 0;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0;
            return;
        }
        if (this.MediaBrowserCompatSearchResultReceiver[0] == IconCompatParcelizer.FIXED && i7 < (i6 = this.onBackPressed)) {
            i7 = i6;
        }
        if (this.MediaBrowserCompatSearchResultReceiver[1] == IconCompatParcelizer.FIXED && i8 < (i5 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8)) {
            i8 = i5;
        }
        this.onBackPressed = i7;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i8;
        int i9 = this.onMediaButtonEvent;
        if (i8 < i9) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i9;
        }
        int i10 = this.onPrepare;
        if (i7 < i10) {
            this.onBackPressed = i10;
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler > 0 && this.MediaBrowserCompatSearchResultReceiver[0] == IconCompatParcelizer.MATCH_CONSTRAINT) {
            this.onBackPressed = Math.min(this.onBackPressed, this.handleMediaPlayPauseIfPendingOnHandler);
        }
        if (this.onCustomAction > 0 && this.MediaBrowserCompatSearchResultReceiver[1] == IconCompatParcelizer.MATCH_CONSTRAINT) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = Math.min(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, this.onCustomAction);
        }
        int i11 = this.onBackPressed;
        if (i7 != i11) {
            this.initializeViewTreeOwners = i11;
        }
        int i12 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        if (i8 != i12) {
            this._init_lambda2 = i12;
        }
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2) {
        this.onSetRepeatMode = i;
        int i3 = i2 - i;
        this.onBackPressed = i3;
        int i4 = this.onPrepare;
        if (i3 < i4) {
            this.onBackPressed = i4;
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(int i, int i2) {
        this.onSetCaptioningEnabled = i;
        int i3 = i2 - i;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i3;
        int i4 = this.onMediaButtonEvent;
        if (i3 < i4) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i4;
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver(int i) {
        this.AudioAttributesCompatParcelizer = i;
        this._init_lambda3 = i > 0;
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        this.PlaybackStateCompat = obj;
    }

    public final void write(float f) {
        this.onSetRating[0] = f;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.onSetRating[1] = f;
    }

    public final void RatingCompat(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public final int onCustomAction() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler(int i) {
        this.onRewind = i;
    }

    public final int onRemoveQueueItemAt() {
        return this.onRewind;
    }

    public boolean read() {
        return this.invalidateMenu != 8;
    }

    public final void AudioAttributesCompatParcelizer(_int.read readVar, JdkDeserializers jdkDeserializers, _int.read readVar2, int i, int i2) {
        write(readVar).write(jdkDeserializers.write(readVar2), i, i2, true);
    }

    public final void AudioAttributesCompatParcelizer(_int _intVar, _int _intVar2, int i) {
        if (_intVar.RemoteActionCompatParcelizer() == this) {
            read(_intVar.MediaBrowserCompatCustomActionResultReceiver(), _intVar2.RemoteActionCompatParcelizer(), _intVar2.MediaBrowserCompatCustomActionResultReceiver(), i);
        }
    }

    public final void write(_int.read readVar, JdkDeserializers jdkDeserializers, _int.read readVar2) {
        read(readVar, jdkDeserializers, readVar2, 0);
    }

    private void read(_int.read readVar, JdkDeserializers jdkDeserializers, _int.read readVar2, int i) {
        boolean z;
        if (readVar == _int.read.CENTER) {
            if (readVar2 == _int.read.CENTER) {
                _int _intVarWrite = write(_int.read.LEFT);
                _int _intVarWrite2 = write(_int.read.RIGHT);
                _int _intVarWrite3 = write(_int.read.TOP);
                _int _intVarWrite4 = write(_int.read.BOTTOM);
                boolean z2 = true;
                if ((_intVarWrite == null || !_intVarWrite.MediaMetadataCompat()) && (_intVarWrite2 == null || !_intVarWrite2.MediaMetadataCompat())) {
                    read(_int.read.LEFT, jdkDeserializers, _int.read.LEFT, 0);
                    read(_int.read.RIGHT, jdkDeserializers, _int.read.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((_intVarWrite3 == null || !_intVarWrite3.MediaMetadataCompat()) && (_intVarWrite4 == null || !_intVarWrite4.MediaMetadataCompat())) {
                    read(_int.read.TOP, jdkDeserializers, _int.read.TOP, 0);
                    read(_int.read.BOTTOM, jdkDeserializers, _int.read.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    write(_int.read.CENTER).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.CENTER), 0);
                    return;
                } else if (z) {
                    write(_int.read.CENTER_X).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        write(_int.read.CENTER_Y).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (readVar2 == _int.read.LEFT || readVar2 == _int.read.RIGHT) {
                read(_int.read.LEFT, jdkDeserializers, readVar2, 0);
                read(_int.read.RIGHT, jdkDeserializers, readVar2, 0);
                write(_int.read.CENTER).AudioAttributesCompatParcelizer(jdkDeserializers.write(readVar2), 0);
                return;
            } else {
                if (readVar2 == _int.read.TOP || readVar2 == _int.read.BOTTOM) {
                    read(_int.read.TOP, jdkDeserializers, readVar2, 0);
                    read(_int.read.BOTTOM, jdkDeserializers, readVar2, 0);
                    write(_int.read.CENTER).AudioAttributesCompatParcelizer(jdkDeserializers.write(readVar2), 0);
                    return;
                }
                return;
            }
        }
        if (readVar == _int.read.CENTER_X && (readVar2 == _int.read.LEFT || readVar2 == _int.read.RIGHT)) {
            _int _intVarWrite5 = write(_int.read.LEFT);
            _int _intVarWrite6 = jdkDeserializers.write(readVar2);
            _int _intVarWrite7 = write(_int.read.RIGHT);
            _intVarWrite5.AudioAttributesCompatParcelizer(_intVarWrite6, 0);
            _intVarWrite7.AudioAttributesCompatParcelizer(_intVarWrite6, 0);
            write(_int.read.CENTER_X).AudioAttributesCompatParcelizer(_intVarWrite6, 0);
            return;
        }
        if (readVar == _int.read.CENTER_Y && (readVar2 == _int.read.TOP || readVar2 == _int.read.BOTTOM)) {
            _int _intVarWrite8 = jdkDeserializers.write(readVar2);
            write(_int.read.TOP).AudioAttributesCompatParcelizer(_intVarWrite8, 0);
            write(_int.read.BOTTOM).AudioAttributesCompatParcelizer(_intVarWrite8, 0);
            write(_int.read.CENTER_Y).AudioAttributesCompatParcelizer(_intVarWrite8, 0);
            return;
        }
        if (readVar == _int.read.CENTER_X && readVar2 == _int.read.CENTER_X) {
            write(_int.read.LEFT).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.LEFT), 0);
            write(_int.read.RIGHT).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.RIGHT), 0);
            write(_int.read.CENTER_X).AudioAttributesCompatParcelizer(jdkDeserializers.write(readVar2), 0);
            return;
        }
        if (readVar == _int.read.CENTER_Y && readVar2 == _int.read.CENTER_Y) {
            write(_int.read.TOP).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.TOP), 0);
            write(_int.read.BOTTOM).AudioAttributesCompatParcelizer(jdkDeserializers.write(_int.read.BOTTOM), 0);
            write(_int.read.CENTER_Y).AudioAttributesCompatParcelizer(jdkDeserializers.write(readVar2), 0);
            return;
        }
        _int _intVarWrite9 = write(readVar);
        _int _intVarWrite10 = jdkDeserializers.write(readVar2);
        if (_intVarWrite9.AudioAttributesCompatParcelizer(_intVarWrite10)) {
            if (readVar == _int.read.BASELINE) {
                _int _intVarWrite11 = write(_int.read.TOP);
                _int _intVarWrite12 = write(_int.read.BOTTOM);
                if (_intVarWrite11 != null) {
                    _intVarWrite11.MediaBrowserCompatSearchResultReceiver();
                }
                if (_intVarWrite12 != null) {
                    _intVarWrite12.MediaBrowserCompatSearchResultReceiver();
                }
            } else if (readVar == _int.read.TOP || readVar == _int.read.BOTTOM) {
                _int _intVarWrite13 = write(_int.read.BASELINE);
                if (_intVarWrite13 != null) {
                    _intVarWrite13.MediaBrowserCompatSearchResultReceiver();
                }
                _int _intVarWrite14 = write(_int.read.CENTER);
                if (_intVarWrite14.MediaBrowserCompatItemReceiver() != _intVarWrite10) {
                    _intVarWrite14.MediaBrowserCompatSearchResultReceiver();
                }
                _int _intVarAudioAttributesCompatParcelizer = write(readVar).AudioAttributesCompatParcelizer();
                _int _intVarWrite15 = write(_int.read.CENTER_Y);
                if (_intVarWrite15.MediaMetadataCompat()) {
                    _intVarAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
                    _intVarWrite15.MediaBrowserCompatSearchResultReceiver();
                }
            } else if (readVar == _int.read.LEFT || readVar == _int.read.RIGHT) {
                _int _intVarWrite16 = write(_int.read.CENTER);
                if (_intVarWrite16.MediaBrowserCompatItemReceiver() != _intVarWrite10) {
                    _intVarWrite16.MediaBrowserCompatSearchResultReceiver();
                }
                _int _intVarAudioAttributesCompatParcelizer2 = write(readVar).AudioAttributesCompatParcelizer();
                _int _intVarWrite17 = write(_int.read.CENTER_X);
                if (_intVarWrite17.MediaMetadataCompat()) {
                    _intVarAudioAttributesCompatParcelizer2.MediaBrowserCompatSearchResultReceiver();
                    _intVarWrite17.MediaBrowserCompatSearchResultReceiver();
                }
            }
            _intVarWrite9.AudioAttributesCompatParcelizer(_intVarWrite10, i);
        }
    }

    public final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        read(0.5f);
        RemoteActionCompatParcelizer(0.5f);
    }

    public final void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        JdkDeserializers jdkDeserializersOnPrepareFromMediaId = onPrepareFromMediaId();
        if (jdkDeserializersOnPrepareFromMediaId != null && (jdkDeserializersOnPrepareFromMediaId instanceof _long)) {
        }
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            this.RemoteActionCompatParcelizer.get(i).MediaBrowserCompatSearchResultReceiver();
        }
    }

    public _int write(_int.read readVar) {
        switch (AnonymousClass5.write[readVar.ordinal()]) {
            case 1:
                return this.MediaMetadataCompat;
            case 2:
                return this.onSeekTo;
            case 3:
                return this.onPrepareFromMediaId;
            case 4:
                return this.AudioAttributesImplApi26Parcelizer;
            case 5:
                return this.read;
            case 6:
                return this.AudioAttributesImplBaseParcelizer;
            case 7:
                return this.ParcelableVolumeInfo;
            case 8:
                return this.MediaSessionCompatResultReceiverWrapper;
            case 9:
                return null;
            default:
                throw new AssertionError(readVar.name());
        }
    }

    public final IconCompatParcelizer onPlayFromMediaId() {
        return this.MediaBrowserCompatSearchResultReceiver[0];
    }

    public final IconCompatParcelizer onSeekTo() {
        return this.MediaBrowserCompatSearchResultReceiver[1];
    }

    public final IconCompatParcelizer RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            return onPlayFromMediaId();
        }
        if (i == 1) {
            return onSeekTo();
        }
        return null;
    }

    public final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver[0] = iconCompatParcelizer;
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver[1] = iconCompatParcelizer;
    }

    public final boolean setSessionImpl() {
        if (this.MediaMetadataCompat.read == null || this.MediaMetadataCompat.read.read != this.MediaMetadataCompat) {
            return this.onPrepareFromMediaId.read != null && this.onPrepareFromMediaId.read.read == this.onPrepareFromMediaId;
        }
        return true;
    }

    public final JdkDeserializers AudioAttributesImplApi26Parcelizer(int i) {
        if (i == 0) {
            if (this.MediaMetadataCompat.read == null) {
                return null;
            }
            _int _intVar = this.MediaMetadataCompat.read.read;
            _int _intVar2 = this.MediaMetadataCompat;
            if (_intVar == _intVar2) {
                return _intVar2.read.IconCompatParcelizer;
            }
            return null;
        }
        if (i != 1 || this.onSeekTo.read == null) {
            return null;
        }
        _int _intVar3 = this.onSeekTo.read.read;
        _int _intVar4 = this.onSeekTo;
        if (_intVar3 == _intVar4) {
            return _intVar4.read.IconCompatParcelizer;
        }
        return null;
    }

    public final JdkDeserializers MediaBrowserCompatCustomActionResultReceiver(int i) {
        if (i == 0) {
            if (this.onPrepareFromMediaId.read == null) {
                return null;
            }
            _int _intVar = this.onPrepareFromMediaId.read.read;
            _int _intVar2 = this.onPrepareFromMediaId;
            if (_intVar == _intVar2) {
                return _intVar2.read.IconCompatParcelizer;
            }
            return null;
        }
        if (i != 1 || this.AudioAttributesImplApi26Parcelizer.read == null) {
            return null;
        }
        _int _intVar3 = this.AudioAttributesImplApi26Parcelizer.read.read;
        _int _intVar4 = this.AudioAttributesImplApi26Parcelizer;
        if (_intVar3 == _intVar4) {
            return _intVar4.read.IconCompatParcelizer;
        }
        return null;
    }

    public final boolean onSkipToNext() {
        if (this.onSeekTo.read == null || this.onSeekTo.read.read != this.onSeekTo) {
            return this.AudioAttributesImplApi26Parcelizer.read != null && this.AudioAttributesImplApi26Parcelizer.read.read == this.AudioAttributesImplApi26Parcelizer;
        }
        return true;
    }

    private boolean read(int i) {
        int i2 = i << 1;
        if (this.RatingCompat[i2].read == null) {
            return false;
        }
        _int _intVar = this.RatingCompat[i2].read.read;
        _int[] _intVarArr = this.RatingCompat;
        if (_intVar == _intVarArr[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        return _intVarArr[i3].read != null && this.RatingCompat[i3].read.read == this.RatingCompat[i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05bd  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [o.JdkDeserializers] */
    /* JADX WARN: Type inference failed for: r15v5, types: [o.JdkDeserializers] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r50v0, types: [o.JdkDeserializers] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void IconCompatParcelizer(kotlin._getToStringLookup r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JdkDeserializers.IconCompatParcelizer(o._getToStringLookup, boolean):void");
    }

    final boolean w_() {
        return (this instanceof _readAndBindStringKeyMap) || (this instanceof _deserializeUsingCreator);
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        if (this.getDefaultViewModelCreationExtras == -1) {
            if (z && !z2) {
                this.getDefaultViewModelCreationExtras = 0;
            } else if (!z && z2) {
                this.getDefaultViewModelCreationExtras = 1;
                if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == -1) {
                    this.getDefaultViewModelProviderFactory = 1.0f / this.getDefaultViewModelProviderFactory;
                }
            }
        }
        if (this.getDefaultViewModelCreationExtras == 0 && (!this.onSeekTo.MediaMetadataCompat() || !this.AudioAttributesImplApi26Parcelizer.MediaMetadataCompat())) {
            this.getDefaultViewModelCreationExtras = 1;
        } else if (this.getDefaultViewModelCreationExtras == 1 && (!this.MediaMetadataCompat.MediaMetadataCompat() || !this.onPrepareFromMediaId.MediaMetadataCompat())) {
            this.getDefaultViewModelCreationExtras = 0;
        }
        if (this.getDefaultViewModelCreationExtras == -1 && (!this.onSeekTo.MediaMetadataCompat() || !this.AudioAttributesImplApi26Parcelizer.MediaMetadataCompat() || !this.MediaMetadataCompat.MediaMetadataCompat() || !this.onPrepareFromMediaId.MediaMetadataCompat())) {
            if (this.onSeekTo.MediaMetadataCompat() && this.AudioAttributesImplApi26Parcelizer.MediaMetadataCompat()) {
                this.getDefaultViewModelCreationExtras = 0;
            } else if (this.MediaMetadataCompat.MediaMetadataCompat() && this.onPrepareFromMediaId.MediaMetadataCompat()) {
                this.getDefaultViewModelProviderFactory = 1.0f / this.getDefaultViewModelProviderFactory;
                this.getDefaultViewModelCreationExtras = 1;
            }
        }
        if (this.getDefaultViewModelCreationExtras == -1) {
            int i = this.onPlayFromMediaId;
            if (i > 0 && this.onPause == 0) {
                this.getDefaultViewModelCreationExtras = 0;
            } else {
                if (i != 0 || this.onPause <= 0) {
                    return;
                }
                this.getDefaultViewModelProviderFactory = 1.0f / this.getDefaultViewModelProviderFactory;
                this.getDefaultViewModelCreationExtras = 1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(kotlin._getToStringLookup r37, boolean r38, boolean r39, boolean r40, boolean r41, kotlin.constructSet r42, kotlin.constructSet r43, o.JdkDeserializers.IconCompatParcelizer r44, boolean r45, kotlin._int r46, kotlin._int r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JdkDeserializers.write(o._getToStringLookup, boolean, boolean, boolean, boolean, o.constructSet, o.constructSet, o.JdkDeserializers$IconCompatParcelizer, boolean, o._int, o._int, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void AudioAttributesCompatParcelizer(boolean z) {
        NumberDeserializersBooleanDeserializer numberDeserializersBooleanDeserializer;
        NumberDeserializers numberDeserializers;
        int iAudioAttributesCompatParcelizer = _getToStringLookup.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
        int iAudioAttributesCompatParcelizer2 = _getToStringLookup.AudioAttributesCompatParcelizer(this.onSeekTo);
        int iAudioAttributesCompatParcelizer3 = _getToStringLookup.AudioAttributesCompatParcelizer(this.onPrepareFromMediaId);
        int iAudioAttributesCompatParcelizer4 = _getToStringLookup.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (z && (numberDeserializers = this.MediaDescriptionCompat) != null && numberDeserializers.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer && this.MediaDescriptionCompat.write.AudioAttributesImplBaseParcelizer) {
            iAudioAttributesCompatParcelizer = this.MediaDescriptionCompat.MediaBrowserCompatMediaItem.RatingCompat;
            iAudioAttributesCompatParcelizer3 = this.MediaDescriptionCompat.write.RatingCompat;
        }
        if (z && (numberDeserializersBooleanDeserializer = this.onPrepareFromUri) != null && numberDeserializersBooleanDeserializer.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer && this.onPrepareFromUri.write.AudioAttributesImplBaseParcelizer) {
            iAudioAttributesCompatParcelizer2 = this.onPrepareFromUri.MediaBrowserCompatMediaItem.RatingCompat;
            iAudioAttributesCompatParcelizer4 = this.onPrepareFromUri.write.RatingCompat;
        }
        if (iAudioAttributesCompatParcelizer3 - iAudioAttributesCompatParcelizer < 0 || iAudioAttributesCompatParcelizer4 - iAudioAttributesCompatParcelizer2 < 0 || iAudioAttributesCompatParcelizer == Integer.MIN_VALUE || iAudioAttributesCompatParcelizer == Integer.MAX_VALUE || iAudioAttributesCompatParcelizer2 == Integer.MIN_VALUE || iAudioAttributesCompatParcelizer2 == Integer.MAX_VALUE || iAudioAttributesCompatParcelizer3 == Integer.MIN_VALUE || iAudioAttributesCompatParcelizer3 == Integer.MAX_VALUE || iAudioAttributesCompatParcelizer4 == Integer.MIN_VALUE || iAudioAttributesCompatParcelizer4 == Integer.MAX_VALUE) {
            iAudioAttributesCompatParcelizer = 0;
            iAudioAttributesCompatParcelizer2 = 0;
            iAudioAttributesCompatParcelizer3 = 0;
            iAudioAttributesCompatParcelizer4 = 0;
        }
        IconCompatParcelizer(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer4);
    }

    public void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers, HashMap<JdkDeserializers, JdkDeserializers> map) {
        this.MediaBrowserCompatMediaItem = jdkDeserializers.MediaBrowserCompatMediaItem;
        this.onRemoveQueueItemAt = jdkDeserializers.onRemoveQueueItemAt;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.onAddQueueItem = jdkDeserializers.onAddQueueItem;
        int[] iArr = this.onPrepareFromSearch;
        int[] iArr2 = jdkDeserializers.onPrepareFromSearch;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.onPlayFromMediaId = jdkDeserializers.onPlayFromMediaId;
        this.handleMediaPlayPauseIfPendingOnHandler = jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler;
        this.onPause = jdkDeserializers.onPause;
        this.onCustomAction = jdkDeserializers.onCustomAction;
        this.onPlay = jdkDeserializers.onPlay;
        this.createFullyDrawnExecutor = jdkDeserializers.createFullyDrawnExecutor;
        this.addObserverForBackInvokerlambda7 = jdkDeserializers.addObserverForBackInvokerlambda7;
        this.getDefaultViewModelCreationExtras = jdkDeserializers.getDefaultViewModelCreationExtras;
        this.getDefaultViewModelProviderFactory = jdkDeserializers.getDefaultViewModelProviderFactory;
        int[] iArr3 = jdkDeserializers.addMenuProvider;
        this.addMenuProvider = Arrays.copyOf(iArr3, iArr3.length);
        this.MediaSessionCompatQueueItem = jdkDeserializers.MediaSessionCompatQueueItem;
        this._init_lambda3 = jdkDeserializers._init_lambda3;
        this._init_lambda4 = jdkDeserializers._init_lambda4;
        this.MediaMetadataCompat.MediaBrowserCompatSearchResultReceiver();
        this.onSeekTo.MediaBrowserCompatSearchResultReceiver();
        this.onPrepareFromMediaId.MediaBrowserCompatSearchResultReceiver();
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver();
        this.read.MediaBrowserCompatSearchResultReceiver();
        this.ParcelableVolumeInfo.MediaBrowserCompatSearchResultReceiver();
        this.MediaSessionCompatResultReceiverWrapper.MediaBrowserCompatSearchResultReceiver();
        this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver();
        this.MediaBrowserCompatSearchResultReceiver = (IconCompatParcelizer[]) Arrays.copyOf(this.MediaBrowserCompatSearchResultReceiver, 2);
        this.onPlayFromSearch = this.onPlayFromSearch == null ? null : map.get(jdkDeserializers.onPlayFromSearch);
        this.onBackPressed = jdkDeserializers.onBackPressed;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = jdkDeserializers.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        this.AudioAttributesImplApi21Parcelizer = jdkDeserializers.AudioAttributesImplApi21Parcelizer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = jdkDeserializers.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        this.onSetRepeatMode = jdkDeserializers.onSetRepeatMode;
        this.onSetCaptioningEnabled = jdkDeserializers.onSetCaptioningEnabled;
        this.addOnContextAvailableListener = jdkDeserializers.addOnContextAvailableListener;
        this.addOnPictureInPictureModeChangedListener = jdkDeserializers.addOnPictureInPictureModeChangedListener;
        this.menuHostHelperlambda0 = jdkDeserializers.menuHostHelperlambda0;
        this.addOnConfigurationChangedListener = jdkDeserializers.addOnConfigurationChangedListener;
        this.AudioAttributesCompatParcelizer = jdkDeserializers.AudioAttributesCompatParcelizer;
        this.onPrepare = jdkDeserializers.onPrepare;
        this.onMediaButtonEvent = jdkDeserializers.onMediaButtonEvent;
        this.MediaBrowserCompatItemReceiver = jdkDeserializers.MediaBrowserCompatItemReceiver;
        this.onRemoveQueueItem = jdkDeserializers.onRemoveQueueItem;
        this.PlaybackStateCompat = jdkDeserializers.PlaybackStateCompat;
        this.MediaSessionCompatToken = jdkDeserializers.MediaSessionCompatToken;
        this.invalidateMenu = jdkDeserializers.invalidateMenu;
        this.onStop = jdkDeserializers.onStop;
        this.PlaybackStateCompatCustomAction = jdkDeserializers.PlaybackStateCompatCustomAction;
        this.getLastCustomNonConfigurationInstance = jdkDeserializers.getLastCustomNonConfigurationInstance;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = jdkDeserializers.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = jdkDeserializers.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        this.ResultReceiver = jdkDeserializers.ResultReceiver;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = jdkDeserializers.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        this.addContentView = jdkDeserializers.addContentView;
        this.getOnBackPressedDispatcher = jdkDeserializers.getOnBackPressedDispatcher;
        this.getLifecycle = jdkDeserializers.getLifecycle;
        this.onSkipToQueueItem = jdkDeserializers.onSkipToQueueItem;
        this.accessensureViewModelStore = jdkDeserializers.accessensureViewModelStore;
        this.getViewModelStore = jdkDeserializers.getViewModelStore;
        this.MediaBrowserCompatCustomActionResultReceiver = jdkDeserializers.MediaBrowserCompatCustomActionResultReceiver;
        this.onRewind = jdkDeserializers.onRewind;
        this.accessaddObserverForBackInvoker = jdkDeserializers.accessaddObserverForBackInvoker;
        this.getFullyDrawnReporter = jdkDeserializers.getFullyDrawnReporter;
        float[] fArr = this.onSetRating;
        float[] fArr2 = jdkDeserializers.onSetRating;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        JdkDeserializers[] jdkDeserializersArr = this.onCommand;
        JdkDeserializers[] jdkDeserializersArr2 = jdkDeserializers.onCommand;
        jdkDeserializersArr[0] = jdkDeserializersArr2[0];
        jdkDeserializersArr[1] = jdkDeserializersArr2[1];
        JdkDeserializers[] jdkDeserializersArr3 = this.onPlayFromUri;
        JdkDeserializers[] jdkDeserializersArr4 = jdkDeserializers.onPlayFromUri;
        jdkDeserializersArr3[0] = jdkDeserializersArr4[0];
        jdkDeserializersArr3[1] = jdkDeserializersArr4[1];
        JdkDeserializers jdkDeserializers2 = jdkDeserializers._init_lambda5;
        this._init_lambda5 = jdkDeserializers2 == null ? null : map.get(jdkDeserializers2);
        JdkDeserializers jdkDeserializers3 = jdkDeserializers.getSavedStateRegistry;
        this.getSavedStateRegistry = jdkDeserializers3 != null ? map.get(jdkDeserializers3) : null;
    }

    public void read(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zAudioAttributesImplApi26Parcelizer = z & this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer();
        boolean zAudioAttributesImplApi26Parcelizer2 = z2 & this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer();
        int i3 = this.MediaDescriptionCompat.MediaBrowserCompatMediaItem.RatingCompat;
        int i4 = this.onPrepareFromUri.MediaBrowserCompatMediaItem.RatingCompat;
        int i5 = this.MediaDescriptionCompat.write.RatingCompat;
        int i6 = this.onPrepareFromUri.write.RatingCompat;
        if (i5 - i3 < 0 || i6 - i4 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (zAudioAttributesImplApi26Parcelizer) {
            this.onSetRepeatMode = i3;
        }
        if (zAudioAttributesImplApi26Parcelizer2) {
            this.onSetCaptioningEnabled = i4;
        }
        if (this.invalidateMenu == 8) {
            this.onBackPressed = 0;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0;
            return;
        }
        if (zAudioAttributesImplApi26Parcelizer) {
            if (this.MediaBrowserCompatSearchResultReceiver[0] == IconCompatParcelizer.FIXED && i7 < (i2 = this.onBackPressed)) {
                i7 = i2;
            }
            this.onBackPressed = i7;
            int i9 = this.onPrepare;
            if (i7 < i9) {
                this.onBackPressed = i9;
            }
        }
        if (zAudioAttributesImplApi26Parcelizer2) {
            if (this.MediaBrowserCompatSearchResultReceiver[1] == IconCompatParcelizer.FIXED && i8 < (i = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8)) {
                i8 = i;
            }
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i8;
            int i10 = this.onMediaButtonEvent;
            if (i8 < i10) {
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i10;
            }
        }
    }

    public final void read(_long _longVar, _getToStringLookup _gettostringlookup, HashSet<JdkDeserializers> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            MapDeserializer.IconCompatParcelizer(_longVar, _gettostringlookup, this);
            hashSet.remove(this);
            IconCompatParcelizer(_gettostringlookup, _longVar.AudioAttributesCompatParcelizer(64));
        }
        if (i == 0) {
            HashSet<_int> hashSetIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer();
            if (hashSetIconCompatParcelizer != null) {
                Iterator<_int> it = hashSetIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    it.next().IconCompatParcelizer.read(_longVar, _gettostringlookup, hashSet, i, true);
                }
            }
            HashSet<_int> hashSetIconCompatParcelizer2 = this.onPrepareFromMediaId.IconCompatParcelizer();
            if (hashSetIconCompatParcelizer2 != null) {
                Iterator<_int> it2 = hashSetIconCompatParcelizer2.iterator();
                while (it2.hasNext()) {
                    it2.next().IconCompatParcelizer.read(_longVar, _gettostringlookup, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<_int> hashSetIconCompatParcelizer3 = this.onSeekTo.IconCompatParcelizer();
        if (hashSetIconCompatParcelizer3 != null) {
            Iterator<_int> it3 = hashSetIconCompatParcelizer3.iterator();
            while (it3.hasNext()) {
                it3.next().IconCompatParcelizer.read(_longVar, _gettostringlookup, hashSet, i, true);
            }
        }
        HashSet<_int> hashSetIconCompatParcelizer4 = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        if (hashSetIconCompatParcelizer4 != null) {
            Iterator<_int> it4 = hashSetIconCompatParcelizer4.iterator();
            while (it4.hasNext()) {
                it4.next().IconCompatParcelizer.read(_longVar, _gettostringlookup, hashSet, i, true);
            }
        }
        HashSet<_int> hashSetIconCompatParcelizer5 = this.read.IconCompatParcelizer();
        if (hashSetIconCompatParcelizer5 != null) {
            Iterator<_int> it5 = hashSetIconCompatParcelizer5.iterator();
            while (it5.hasNext()) {
                it5.next().IconCompatParcelizer.read(_longVar, _gettostringlookup, hashSet, i, true);
            }
        }
    }
}

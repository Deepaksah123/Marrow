package kotlin;

import android.graphics.Path;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NioPathSerializer;
import kotlin._handleApos;
import kotlin.onCreateContextMenu;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u000b\u0010\rJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u00108\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u000f\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\t\u0010\u0015R\u001a\u0010\u0013\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R)\u0010\u0018\u001a\u0004\u0018\u00010$2\b\u0010\u0003\u001a\u0004\u0018\u00010$8F@CX\u0087\u008e\u0002¢\u0006\f\n\u0004\b\u001b\u0010%\"\u0004\b\u0014\u0010&R\u001a\u0010+\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u000b\u0010*R\u0014\u0010-\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010\u0016\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010(\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\"R\u0014\u0010.\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\"R\u0014\u00100\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\"R\u0014\u0010\u0019\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\"R\u0014\u0010,\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\"R\u0014\u00101\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u001a\u00102\u001a\u0002048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b\u000f\u00106R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u001a\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00109"}, d2 = {"Lo/onCreateContextMenu;", "", "Landroidx/core/view/WindowInsetsCompat;", "p0", "Landroid/view/View;", "p1", "<init>", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "", "write", "(Landroid/view/View;)V", "RemoteActionCompatParcelizer", "", "(Landroidx/core/view/WindowInsetsCompat;I)V", "(Landroidx/core/view/WindowInsetsCompat;)V", "read", "Lo/ContentLoadingProgressBar;", "AudioAttributesImplBaseParcelizer", "Lo/ContentLoadingProgressBar;", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "()Lo/ContentLoadingProgressBar;", "RatingCompat", "IconCompatParcelizer", "MediaMetadataCompat", "onAddQueueItem", "onMediaButtonEvent", "MediaBrowserCompatItemReceiver", "onPlayFromMediaId", "AudioAttributesImplApi26Parcelizer", "onPlay", "onPlayFromUri", "Lo/onContextItemSelected;", "onPrepare", "Lo/onContextItemSelected;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/removeSoftRefsClearedByGc;", "Lo/InputAccessor;", "(Lo/removeSoftRefsClearedByGc;)V", "Lo/onCreateView;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/onCreateView;", "()Lo/onCreateView;", "MediaBrowserCompatSearchResultReceiver", "onCustomAction", "MediaDescriptionCompat", "onCommand", "MediaBrowserCompatMediaItem", "handleMediaPlayPauseIfPendingOnHandler", "onFastForward", "onPause", "onPrepareFromSearch", "", "Z", "()Z", "I", "Lo/getTargetFragment;", "Lo/getTargetFragment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCreateContextMenu {
    private static boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final ContentLoadingProgressBar AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final onContextItemSelected MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final ContentLoadingProgressBar write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean onPause;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getTargetFragment onMediaButtonEvent;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final onContextItemSelected onFastForward;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final onCreateView MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final onContextItemSelected onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final ContentLoadingProgressBar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final ContentLoadingProgressBar IconCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final onContextItemSelected MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final ContentLoadingProgressBar read;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final onCreateView RatingCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final onCreateView MediaDescriptionCompat;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final onContextItemSelected onCommand;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final ContentLoadingProgressBar AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final onContextItemSelected handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final ContentLoadingProgressBar AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final ContentLoadingProgressBar AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final ContentLoadingProgressBar MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final onContextItemSelected MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final onContextItemSelected onAddQueueItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int onPlayFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final WeakHashMap<View, onCreateContextMenu> IconCompatParcelizer = new WeakHashMap<>();

    /* JADX INFO: renamed from: o.onCreateContextMenu$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019"}, d2 = {"Lo/onCreateContextMenu$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/onCreateContextMenu;", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/onCreateContextMenu;", "Landroid/view/View;", "p0", "IconCompatParcelizer", "(Landroid/view/View;)Lo/onCreateContextMenu;", "Landroidx/core/view/WindowInsetsCompat;", "", "p1", "", "p2", "Lo/ContentLoadingProgressBar;", "read", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Lo/ContentLoadingProgressBar;", "Lo/onContextItemSelected;", "write", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Lo/onContextItemSelected;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "", "Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.onCreateContextMenu$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0126AudioAttributesCompatParcelizer implements _wrapError {
            final /* synthetic */ View AudioAttributesCompatParcelizer;
            final /* synthetic */ onCreateContextMenu write;

            public C0126AudioAttributesCompatParcelizer(onCreateContextMenu oncreatecontextmenu, View view) {
                this.write = oncreatecontextmenu;
                this.AudioAttributesCompatParcelizer = view;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.write.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }

        private Companion() {
        }

        public final onCreateContextMenu RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:574)");
            }
            final View view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
            final onCreateContextMenu oncreatecontextmenuIconCompatParcelizer = IconCompatParcelizer(view);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(oncreatecontextmenuIconCompatParcelizer);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(view);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.onCreateAnimator
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return onCreateContextMenu.Companion.read(oncreatecontextmenuIconCompatParcelizer, view, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.RemoteActionCompatParcelizer(oncreatecontextmenuIconCompatParcelizer, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            return oncreatecontextmenuIconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final _wrapError read(onCreateContextMenu oncreatecontextmenu, View view, StreamConstraintsException streamConstraintsException) {
            oncreatecontextmenu.write(view);
            return new C0126AudioAttributesCompatParcelizer(oncreatecontextmenu, view);
        }

        public final onCreateContextMenu IconCompatParcelizer(View p0) {
            onCreateContextMenu oncreatecontextmenu;
            synchronized (onCreateContextMenu.IconCompatParcelizer) {
                WeakHashMap weakHashMap = onCreateContextMenu.IconCompatParcelizer;
                Object obj = weakHashMap.get(p0);
                Object obj2 = obj;
                if (obj == null) {
                    onCreateContextMenu oncreatecontextmenu2 = new onCreateContextMenu(null, p0, false ? 1 : 0);
                    weakHashMap.put(p0, oncreatecontextmenu2);
                    obj2 = oncreatecontextmenu2;
                }
                oncreatecontextmenu = (onCreateContextMenu) obj2;
            }
            return oncreatecontextmenu;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ContentLoadingProgressBar read(WindowInsetsCompat p0, int p1, String p2) {
            ContentLoadingProgressBar contentLoadingProgressBar = new ContentLoadingProgressBar(p1, p2);
            if (p0 != null) {
                contentLoadingProgressBar.IconCompatParcelizer(p0, p1);
            }
            return contentLoadingProgressBar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final onContextItemSelected write(WindowInsetsCompat p0, int p1, String p2) {
            _verifyEndArrayForSingle _verifyendarrayforsingleRemoteActionCompatParcelizer;
            if (p0 == null || (_verifyendarrayforsingleRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(p1)) == null) {
                _verifyendarrayforsingleRemoteActionCompatParcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
            }
            return onPrimaryNavigationFragmentChanged.RemoteActionCompatParcelizer(_verifyendarrayforsingleRemoteActionCompatParcelizer, p2);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private onCreateContextMenu(WindowInsetsCompat windowInsetsCompat, View view) {
        _fromBytes _frombytesRemoteActionCompatParcelizer;
        Path pathIconCompatParcelizer;
        _fromBytes _frombytesRemoteActionCompatParcelizer2;
        _verifyEndArrayForSingle _verifyendarrayforsingleAudioAttributesImplApi21Parcelizer;
        Companion companion = INSTANCE;
        ContentLoadingProgressBar contentLoadingProgressBar = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), "captionBar");
        this.write = contentLoadingProgressBar;
        ContentLoadingProgressBar contentLoadingProgressBar2 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.read(), "displayCutout");
        this.AudioAttributesCompatParcelizer = contentLoadingProgressBar2;
        ContentLoadingProgressBar contentLoadingProgressBar3 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer(), "ime");
        this.IconCompatParcelizer = contentLoadingProgressBar3;
        ContentLoadingProgressBar contentLoadingProgressBar4 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.write(), "mandatorySystemGestures");
        this.RemoteActionCompatParcelizer = contentLoadingProgressBar4;
        ContentLoadingProgressBar contentLoadingProgressBar5 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(), "navigationBars");
        this.read = contentLoadingProgressBar5;
        ContentLoadingProgressBar contentLoadingProgressBar6 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(), "statusBars");
        this.AudioAttributesImplApi21Parcelizer = contentLoadingProgressBar6;
        ContentLoadingProgressBar contentLoadingProgressBar7 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(), "systemBars");
        this.AudioAttributesImplBaseParcelizer = contentLoadingProgressBar7;
        ContentLoadingProgressBar contentLoadingProgressBar8 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(), "systemGestures");
        this.AudioAttributesImplApi26Parcelizer = contentLoadingProgressBar8;
        ContentLoadingProgressBar contentLoadingProgressBar9 = companion.read(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(), "tappableElement");
        this.MediaBrowserCompatItemReceiver = contentLoadingProgressBar9;
        onContextItemSelected oncontextitemselectedRemoteActionCompatParcelizer = onPrimaryNavigationFragmentChanged.RemoteActionCompatParcelizer((windowInsetsCompat == null || (_frombytesRemoteActionCompatParcelizer2 = windowInsetsCompat.RemoteActionCompatParcelizer()) == null || (_verifyendarrayforsingleAudioAttributesImplApi21Parcelizer = _frombytesRemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer()) == null) ? _verifyEndArrayForSingle.RemoteActionCompatParcelizer : _verifyendarrayforsingleAudioAttributesImplApi21Parcelizer, "waterfall");
        this.MediaBrowserCompatCustomActionResultReceiver = oncontextitemselectedRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = available.RemoteActionCompatParcelizer$default((windowInsetsCompat == null || (_frombytesRemoteActionCompatParcelizer = windowInsetsCompat.RemoteActionCompatParcelizer()) == null || (pathIconCompatParcelizer = _frombytesRemoteActionCompatParcelizer.IconCompatParcelizer()) == null) ? null : writeIndentation.RemoteActionCompatParcelizer(pathIconCompatParcelizer), null, 2, null);
        onCreateView oncreateview = onDestroy.read(onDestroy.read(contentLoadingProgressBar7, contentLoadingProgressBar3), contentLoadingProgressBar2);
        this.MediaBrowserCompatSearchResultReceiver = oncreateview;
        onCreateView oncreateview2 = onDestroy.read(onDestroy.read(onDestroy.read(contentLoadingProgressBar9, contentLoadingProgressBar4), contentLoadingProgressBar8), oncontextitemselectedRemoteActionCompatParcelizer);
        this.MediaDescriptionCompat = oncreateview2;
        this.RatingCompat = onDestroy.read(oncreateview, oncreateview2);
        this.MediaBrowserCompatMediaItem = companion.write(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), "captionBarIgnoringVisibility");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = companion.write(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(), "navigationBarsIgnoringVisibility");
        this.onCommand = companion.write(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(), "statusBarsIgnoringVisibility");
        this.handleMediaPlayPauseIfPendingOnHandler = companion.write(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(), "systemBarsIgnoringVisibility");
        this.onAddQueueItem = companion.write(windowInsetsCompat, WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(), "tappableElementIgnoringVisibility");
        this.onCustomAction = onPrimaryNavigationFragmentChanged.RemoteActionCompatParcelizer(_verifyEndArrayForSingle.RemoteActionCompatParcelizer, "imeAnimationTarget");
        this.onFastForward = onPrimaryNavigationFragmentChanged.RemoteActionCompatParcelizer(_verifyEndArrayForSingle.RemoteActionCompatParcelizer, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(_handleApos.AudioAttributesCompatParcelizer.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.onPause = bool != null ? bool.booleanValue() : false;
        this.onMediaButtonEvent = new getTargetFragment(this);
        WindowInsetsCompat windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(view);
        if (windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler != null) {
            contentLoadingProgressBar.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()));
            contentLoadingProgressBar2.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.read()));
            contentLoadingProgressBar3.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer()));
            contentLoadingProgressBar4.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.write()));
            contentLoadingProgressBar5.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver()));
            contentLoadingProgressBar6.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()));
            contentLoadingProgressBar7.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer()));
            contentLoadingProgressBar8.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()));
            contentLoadingProgressBar9.AudioAttributesCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()));
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final ContentLoadingProgressBar getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final ContentLoadingProgressBar getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final ContentLoadingProgressBar getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final ContentLoadingProgressBar getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc) {
        this.MediaMetadataCompat.write(removesoftrefsclearedbygc);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final onCreateView getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getOnPause() {
        return this.onPause;
    }

    public final void write(View p0) {
        if (this.onPlayFromMediaId == 0) {
            InvalidTypeIdException.read(p0, this.onMediaButtonEvent);
            if (p0.isAttachedToWindow()) {
                p0.requestApplyInsets();
            }
            p0.addOnAttachStateChangeListener(this.onMediaButtonEvent);
            InvalidTypeIdException.IconCompatParcelizer(p0, this.onMediaButtonEvent);
        }
        this.onPlayFromMediaId++;
    }

    public final void RemoteActionCompatParcelizer(View p0) {
        int i = this.onPlayFromMediaId - 1;
        this.onPlayFromMediaId = i;
        if (i == 0) {
            InvalidTypeIdException.read(p0, (finishBranchObject) null);
            InvalidTypeIdException.IconCompatParcelizer(p0, (NioPathSerializer.read) null);
            p0.removeOnAttachStateChangeListener(this.onMediaButtonEvent);
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(onCreateContextMenu oncreatecontextmenu, WindowInsetsCompat windowInsetsCompat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        oncreatecontextmenu.RemoteActionCompatParcelizer(windowInsetsCompat, i);
    }

    public final void RemoteActionCompatParcelizer(WindowInsetsCompat p0, int p1) {
        _verifyEndArrayForSingle _verifyendarrayforsingleAudioAttributesImplApi21Parcelizer;
        Path pathIconCompatParcelizer;
        if (read) {
            WindowInsets windowInsetsMediaBrowserCompatMediaItem = p0.MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.write(windowInsetsMediaBrowserCompatMediaItem);
            p0 = WindowInsetsCompat.IconCompatParcelizer(windowInsetsMediaBrowserCompatMediaItem);
        }
        this.write.IconCompatParcelizer(p0, p1);
        this.IconCompatParcelizer.IconCompatParcelizer(p0, p1);
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1);
        this.read.IconCompatParcelizer(p0, p1);
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(p0, p1);
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(p0, p1);
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(p0, p1);
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(p0, p1);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(p0, p1);
        if (p1 == 0) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer())));
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver())));
            this.onCommand.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver())));
            this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer())));
            this.onAddQueueItem.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer())));
            _fromBytes _frombytesRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
            onContextItemSelected oncontextitemselected = this.MediaBrowserCompatCustomActionResultReceiver;
            if (_frombytesRemoteActionCompatParcelizer == null || (_verifyendarrayforsingleAudioAttributesImplApi21Parcelizer = _frombytesRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) == null) {
                _verifyendarrayforsingleAudioAttributesImplApi21Parcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
            }
            oncontextitemselected.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(_verifyendarrayforsingleAudioAttributesImplApi21Parcelizer));
            AudioAttributesCompatParcelizer((_frombytesRemoteActionCompatParcelizer == null || (pathIconCompatParcelizer = _frombytesRemoteActionCompatParcelizer.IconCompatParcelizer()) == null) ? null : writeIndentation.RemoteActionCompatParcelizer(pathIconCompatParcelizer));
        }
        parseDigitsRecursive.INSTANCE.read();
    }

    public final void RemoteActionCompatParcelizer(WindowInsetsCompat p0) {
        this.onFastForward.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer())));
    }

    public final void read(WindowInsetsCompat p0) {
        this.onCustomAction.AudioAttributesCompatParcelizer(onPrimaryNavigationFragmentChanged.read(p0.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer())));
    }

    public /* synthetic */ onCreateContextMenu(WindowInsetsCompat windowInsetsCompat, View view, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(windowInsetsCompat, view);
    }
}

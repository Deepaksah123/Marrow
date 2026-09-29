package kotlin;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import kotlin.Metadata;
import kotlin.shouldEscapeCharacter;
import kotlin.skipComment;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\fJ\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\u000eJ\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\u000eJ\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u000eJ\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\u000eJ\u000f\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010\u000eJ\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u0010\u000eJ\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u000eJ\u000f\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010\u000eJ\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u000201H\u0016¢\u0006\u0004\b\u0016\u00103J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u000eJ\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000201H\u0014¢\u0006\u0004\b\u0018\u00109J\u000f\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010;J\u000f\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010\u000eJ\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u0010\fJ\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020=H\u0016¢\u0006\u0004\b2\u0010>J\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010?\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010\u000eR\u001b\u0010\u0016\u001a\u00020@8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010A\u001a\u0004\bB\u0010CR\u0014\u00102\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u0014\u0010\u0015\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010GR\u0014\u0010\u000b\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010GR\u0014\u0010&\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010IR\u0014\u0010\u0013\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010KR\u0014\u0010\u0018\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010MR\u0014\u0010/\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010KR\u0014\u0010\u0010\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010KR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010NR\u0014\u0010\u001a\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010PR\u0014\u0010)\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010KR\u0014\u00105\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010IR\u0014\u0010$\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010KR\u0014\u0010+\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010KR\u0014\u0010-\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010KR\u0014\u0010\u001e\u001a\u00020Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010RR\u0014\u0010:\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010GR\u0014\u0010<\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010KR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010NR\u0014\u00106\u001a\u00020S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010TR\u0014\u0010!\u001a\u00020U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010VR\u0014\u00107\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010IR\u0014\u0010\r\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010XR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010NR\u0014\u00100\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010PR\u0014\u0010%\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010ZR\u0014\u0010\u0017\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010KR\u0014\u0010.\u001a\u00020[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\\R\u0014\u0010\u0014\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010KR\u0014\u00108\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010KR\u0014\u0010?\u001a\u00020[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010\\R\u0014\u00104\u001a\u00020[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\\R\u0014\u0010\u000f\u001a\u00020]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010^"}, d2 = {"Lo/DefaultMediaDescriptionAdapter;", "Lo/repositionVerticalCue;", "Lo/skipComment$RemoteActionCompatParcelizer;", "Lo/skipComment$IconCompatParcelizer;", "Landroid/view/View;", "p0", "p1", "<init>", "(Landroid/view/View;Lo/skipComment$RemoteActionCompatParcelizer;)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "onFastForward", "()V", "onPrepareFromUri", "AudioAttributesImplBaseParcelizer", "", "(F)V", "AudioAttributesImplApi26Parcelizer", "onPrepareFromSearch", "write", "RemoteActionCompatParcelizer", "onPrepareFromMediaId", "MediaBrowserCompatItemReceiver", "onSetPlaybackSpeed", "MediaBrowserCompatSearchResultReceiver", "onStop", "onCustomAction", "setSessionImpl", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplApi21Parcelizer", "onSkipToPrevious", "onPause", "onPlay", "onSetRating", "MediaMetadataCompat", "onPlayFromSearch", "IconCompatParcelizer", "onRemoveQueueItemAt", "onSetCaptioningEnabled", "MediaBrowserCompatMediaItem", "onSetRepeatMode", "RatingCompat", "onSetShuffleMode", "handleMediaPlayPauseIfPendingOnHandler", "onPrepare", "MediaBrowserCompatCustomActionResultReceiver", "onPlayFromUri", "", "read", "(I)V", "onRewind", "MediaDescriptionCompat", "onPlayFromMediaId", "onMediaButtonEvent", "onSeekTo", "(I)Landroid/view/View;", "onAddQueueItem", "(FLjava/lang/String;)V", "onCommand", "", "(Z)V", "onRemoveQueueItem", "Lo/isNewerThan;", "Lo/setSessionInfo;", "onSkipToQueueItem", "()Lo/isNewerThan;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "Lcom/marrow/ui/views/CustomTextView;", "Lcom/marrow/ui/views/CustomTextView;", "Landroid/widget/RatingBar;", "Landroid/widget/RatingBar;", "Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "Lcom/marrow/ui/views/CustomButton;", "Lcom/marrow/ui/views/CustomButton;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "Lcom/github/mikephil/charting/charts/PieChart;", "Lcom/github/mikephil/charting/charts/PieChart;", "Landroidx/constraintlayout/widget/Group;", "Landroidx/constraintlayout/widget/Group;", "Lcom/google/android/material/card/MaterialCardView;", "Lcom/google/android/material/card/MaterialCardView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultMediaDescriptionAdapter extends repositionVerticalCue<skipComment.RemoteActionCompatParcelizer> implements skipComment.IconCompatParcelizer {
    private static /* synthetic */ isResolutionNotSupported<Object>[] read = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(DefaultMediaDescriptionAdapter.class, "binding", "getBinding()Lcom/marrow/databinding/ViewLessonCardBinding;", 0))};

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final MaterialCardView onPrepareFromUri;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final CustomTextView MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final View onPlay;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final ImageView write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setSessionInfo RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final CustomTextView MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final TextView onFastForward;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final CustomTextView onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final ProgressBar onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final ShapeableImageView read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final RelativeLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final View onCustomAction;
    private final CustomTextView RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final CustomButton onPause;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final CustomTextView AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final ConstraintLayout MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final ConstraintLayout onPlayFromUri;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final ImageView onAddQueueItem;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final CustomTextView AudioAttributesImplBaseParcelizer;
    private final LinearLayout onMediaButtonEvent;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final PieChart onPlayFromSearch;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final Group onPrepare;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final LinearLayout IconCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final ImageView AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final RatingBar MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final Group onRemoveQueueItem;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final CustomTextView MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final Group onRewind;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final CustomTextView onPrepareFromSearch;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final CustomTextView onSeekTo;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final CustomTextView onPrepareFromMediaId;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final LinearLayout MediaDescriptionCompat;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final CustomTextView handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private final View AudioAttributesImplApi21Parcelizer;

    public static final class read implements getAnswerMap<DefaultMediaDescriptionAdapter, isNewerThan> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.isNewerThan] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ isNewerThan invoke(DefaultMediaDescriptionAdapter defaultMediaDescriptionAdapter) {
            return RemoteActionCompatParcelizer(defaultMediaDescriptionAdapter);
        }

        private static isNewerThan RemoteActionCompatParcelizer(DefaultMediaDescriptionAdapter defaultMediaDescriptionAdapter) {
            toMagicModuleMetaRepoModel.write(defaultMediaDescriptionAdapter, "");
            return isNewerThan.write(defaultMediaDescriptionAdapter.itemView);
        }
    }

    private DefaultMediaDescriptionAdapter(View view, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(view, remoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = new setOrigin(new read());
        ShapeableImageView shapeableImageView = onSkipToQueueItem().write.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(shapeableImageView, "");
        this.read = shapeableImageView;
        ImageView imageView = onSkipToQueueItem().write.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        this.write = imageView;
        ImageView imageView2 = onSkipToQueueItem().write.onPlayFromUri;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        this.AudioAttributesCompatParcelizer = imageView2;
        LinearLayout linearLayout = onSkipToQueueItem().write.onPlay;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        this.IconCompatParcelizer = linearLayout;
        CustomTextView customTextView = onSkipToQueueItem().write.onFastForward;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        this.AudioAttributesImplApi26Parcelizer = customTextView;
        RatingBar ratingBar = onSkipToQueueItem().write.handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(ratingBar, "");
        this.MediaBrowserCompatItemReceiver = ratingBar;
        CustomTextView customTextView2 = onSkipToQueueItem().write.onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView2;
        CustomTextView customTextView3 = onSkipToQueueItem().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
        this.AudioAttributesImplBaseParcelizer = customTextView3;
        View view2 = onSkipToQueueItem().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
        this.AudioAttributesImplApi21Parcelizer = view2;
        ConstraintLayout constraintLayout = onSkipToQueueItem().write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        this.MediaBrowserCompatSearchResultReceiver = constraintLayout;
        CustomTextView customTextView4 = onSkipToQueueItem().write.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
        this.MediaBrowserCompatMediaItem = customTextView4;
        LinearLayout linearLayout2 = onSkipToQueueItem().write.onRewind;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        this.MediaDescriptionCompat = linearLayout2;
        CustomTextView customTextView5 = onSkipToQueueItem().write.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView5, "");
        this.MediaMetadataCompat = customTextView5;
        CustomTextView customTextView6 = onSkipToQueueItem().write.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView6, "");
        this.RatingCompat = customTextView6;
        CustomTextView customTextView7 = onSkipToQueueItem().write.onPlayFromSearch;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView7, "");
        this.handleMediaPlayPauseIfPendingOnHandler = customTextView7;
        RelativeLayout relativeLayout = onSkipToQueueItem().write.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(relativeLayout, "");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = relativeLayout;
        ImageView imageView3 = onSkipToQueueItem().write.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        this.onAddQueueItem = imageView3;
        CustomTextView customTextView8 = onSkipToQueueItem().write.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView8, "");
        this.onCommand = customTextView8;
        View view3 = onSkipToQueueItem().write.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view3, "");
        this.onCustomAction = view3;
        ProgressBar progressBar = onSkipToQueueItem().write.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        this.onPlayFromMediaId = progressBar;
        CustomButton customButton = onSkipToQueueItem().write.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        this.onPause = customButton;
        LinearLayout linearLayout3 = onSkipToQueueItem().write.onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
        this.onMediaButtonEvent = linearLayout3;
        TextView textView = onSkipToQueueItem().write.onPrepareFromMediaId;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        this.onFastForward = textView;
        View view4 = onSkipToQueueItem().write.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view4, "");
        this.onPlay = view4;
        ConstraintLayout constraintLayout2 = onSkipToQueueItem().write.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        this.onPlayFromUri = constraintLayout2;
        PieChart pieChart = onSkipToQueueItem().write.onMediaButtonEvent;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pieChart, "");
        this.onPlayFromSearch = pieChart;
        CustomTextView customTextView9 = onSkipToQueueItem().write.onPrepare;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView9, "");
        this.onPrepareFromMediaId = customTextView9;
        Group group = onSkipToQueueItem().write.onPause;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        this.onPrepare = group;
        CustomTextView customTextView10 = onSkipToQueueItem().write.onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView10, "");
        this.onPrepareFromSearch = customTextView10;
        CustomTextView customTextView11 = onSkipToQueueItem().write.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView11, "");
        this.onSeekTo = customTextView11;
        Group group2 = onSkipToQueueItem().write.onPlayFromMediaId;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
        this.onRemoveQueueItem = group2;
        Group group3 = onSkipToQueueItem().write.onPrepareFromSearch;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group3, "");
        this.onRewind = group3;
        MaterialCardView materialCardView = onSkipToQueueItem().write.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        this.onPrepareFromUri = materialCardView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final isNewerThan onSkipToQueueItem() {
        return (isNewerThan) this.RemoteActionCompatParcelizer.read(this, read[0]);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(String p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, this.read.getTag(R.id.image_ref_id))) {
            return;
        }
        Context context = this.itemView.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        buildDownloadCompletedNotification.write(this.read, p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onFastForward() {
        MaterialCardView materialCardView = this.onPrepareFromUri;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextOnSkipToNext = onSkipToNext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextOnSkipToNext, "");
        materialCardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(contextOnSkipToNext, R.attr.colorSurface, new TypedValue(), true));
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPrepareFromUri() {
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(this.onPlayFromMediaId, this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onPlayFromMediaId, this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplApi26Parcelizer.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(float p0) {
        this.MediaBrowserCompatItemReceiver.setRating(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.MediaBrowserCompatCustomActionResultReceiver.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPrepareFromSearch() {
        PlayerControlViewExternalSyntheticLambda1.write(this.write);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void write() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.write);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onAddQueueItem);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPrepareFromMediaId() {
        PlayerControlViewExternalSyntheticLambda1.write(this.onAddQueueItem);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onCommand.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onSeekTo.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSetPlaybackSpeed() {
        PlayerControlViewExternalSyntheticLambda1.write(this.AudioAttributesCompatParcelizer);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaBrowserCompatSearchResultReceiver() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onStop() {
        PlayerControlViewExternalSyntheticLambda1.write(this.onMediaButtonEvent);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onCustomAction() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void setSessionImpl() {
        PlayerControlViewExternalSyntheticLambda1.write(this.IconCompatParcelizer);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesImplApi21Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplBaseParcelizer.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSkipToPrevious() {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.AudioAttributesImplBaseParcelizer);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPause() {
        this.AudioAttributesImplBaseParcelizer.setTextSize(2, 10.0f);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPlay() {
        this.AudioAttributesImplBaseParcelizer.setTextSize(2, 12.0f);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSetRating() {
        PlayerControlViewExternalSyntheticLambda1.write(this.MediaBrowserCompatSearchResultReceiver);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaMetadataCompat() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPlayFromSearch() {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.MediaBrowserCompatMediaItem);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void IconCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onRemoveQueueItemAt() {
        PlayerControlViewExternalSyntheticLambda1.write(this.MediaDescriptionCompat);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSetCaptioningEnabled() {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.RatingCompat);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaBrowserCompatMediaItem() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.RatingCompat);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RatingCompat.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.MediaMetadataCompat.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSetRepeatMode() {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.MediaMetadataCompat);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void RatingCompat() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSetShuffleMode() {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.handleMediaPlayPauseIfPendingOnHandler);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPrepare() {
        PlayerControlViewExternalSyntheticLambda1.write(this.onPlayFromMediaId);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onPlayFromMediaId);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPlayFromUri() {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.onPause);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onPause);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void read(int p0) {
        this.onPlayFromMediaId.setProgress(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onRewind() {
        PlayerControlViewExternalSyntheticLambda1.write(this.onRemoveQueueItem);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onRemoveQueueItem);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onPlayFromMediaId() {
        this.onPrepareFromUri.setCardBackgroundColor(_isNaN.getColor(onSkipToNext(), R.color.white));
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onMediaButtonEvent() {
        this.onPrepareFromUri.setCardBackgroundColor(_isNaN.getColor(onSkipToNext(), R.color.bg_no_guess));
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(int p0) {
        PlayerControlViewExternalSyntheticLambda1.write((View) this.onFastForward);
        PlayerControlViewExternalSyntheticLambda1.write(this.onPlay);
        if (p0 == 6) {
            this.onFastForward.setTextAppearance(R.style.v1_subtext1);
        } else {
            this.onFastForward.setTextAppearance(R.style.v1_subtext2);
        }
        this.onFastForward.setTextColor(_isNaN.getColor(onSkipToNext(), R.color.cm_dialog_cancel));
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void read() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onFastForward);
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onPlay);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onSeekTo() {
        PlayerControlViewExternalSyntheticLambda1.write(this.onPlayFromUri);
    }

    @Override // kotlin.repositionVerticalCue
    protected final View MediaBrowserCompatItemReceiver(int p0) {
        if (p0 == 1) {
            return this.onPause;
        }
        if (p0 == 4) {
            return this.onFastForward;
        }
        View viewMediaBrowserCompatItemReceiver = super.MediaBrowserCompatItemReceiver(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewMediaBrowserCompatItemReceiver, "");
        return viewMediaBrowserCompatItemReceiver;
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onAddQueueItem() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void write(float p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        dispatchTouchEvent.IconCompatParcelizer(this.onPlayFromSearch, p0);
        PlayerControlViewExternalSyntheticLambda1.write(this.onPrepare);
        this.onPrepareFromSearch.setText(p1);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onCommand() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.onPrepare);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onPrepareFromMediaId.setText(p0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void read(boolean p0) {
        this.onPrepareFromMediaId.setVisibility(p0 ? 0 : 8);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void AudioAttributesImplApi21Parcelizer() {
        this.onPrepareFromUri.setStrokeWidth(0);
    }

    @Override // o.skipComment.IconCompatParcelizer
    public final void onRemoveQueueItem() {
        this.onPrepareFromUri.setStrokeWidth(1);
    }

    /* JADX INFO: renamed from: o.DefaultMediaDescriptionAdapter$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/DefaultMediaDescriptionAdapter$write;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "p0", "Lo/skipComment$RemoteActionCompatParcelizer;", "p1", "Lo/DefaultMediaDescriptionAdapter;", "read", "(Landroid/view/ViewGroup;Lo/skipComment$RemoteActionCompatParcelizer;)Lo/DefaultMediaDescriptionAdapter;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static DefaultMediaDescriptionAdapter read(ViewGroup p0, skipComment.RemoteActionCompatParcelizer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            View viewInflate = LayoutInflater.from(p0.getContext()).inflate(R.layout.view_lesson_card, p0, false);
            viewInflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new DefaultMediaDescriptionAdapter(viewInflate, p1, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ DefaultMediaDescriptionAdapter(View view, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(view, remoteActionCompatParcelizer);
    }

    @getMagicModuleMeta
    public static final DefaultMediaDescriptionAdapter read(ViewGroup viewGroup, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return Companion.read(viewGroup, remoteActionCompatParcelizer);
    }
}

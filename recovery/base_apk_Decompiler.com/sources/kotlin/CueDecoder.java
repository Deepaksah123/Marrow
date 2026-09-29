package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.data.models.plan.PlanGroup;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.ui.activities.base.BaseActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.views.CustomTextView;
import kotlin.Metadata;
import kotlin.applyLegacyRendererOverrides;
import kotlin.getCurrentContentTitle;
import kotlin.getLatestBitrateEstimate;
import kotlin.isNewSubtitleDataAvailable;
import kotlin.setWindowColor;
import kotlin.swap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001$B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\bJ)\u0010$\u001a\u00020\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010*J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020+H\u0014¢\u0006\u0004\b\u0014\u0010,J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b2\u0010\bJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020+H\u0016¢\u0006\u0004\b\u0013\u0010,J\u0017\u0010\n\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\n\u0010\u0011J\u000f\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u000f\u001a\u0002082\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\n\u00109J\u000f\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010\bJ\u000f\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010\bJE\u0010\n\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010<\u001a\u0004\u0018\u00010\"2\u0006\u0010=\u001a\u00020+2\b\u0010>\u001a\u0004\u0018\u00010\u000e2\u0006\u0010?\u001a\u00020+H\u0016¢\u0006\u0004\b\n\u0010@J\u000f\u0010A\u001a\u00020\fH\u0016¢\u0006\u0004\bA\u0010\bJ\u000f\u0010B\u001a\u00020\fH\u0016¢\u0006\u0004\bB\u0010\bJ\u000f\u0010C\u001a\u00020\fH\u0016¢\u0006\u0004\bC\u0010\bJ\u000f\u0010D\u001a\u00020\fH\u0016¢\u0006\u0004\bD\u0010\bJ\u000f\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010\bJ\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bF\u0010\bJ\u000f\u0010G\u001a\u00020\fH\u0016¢\u0006\u0004\bG\u0010\bJ\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010\bJ\u0017\u0010\n\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020IH\u0016¢\u0006\u0004\b\n\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010\bR\u001b\u0010$\u001a\u00020L8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\u001c\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010QR\u0014\u0010\u0014\u001a\u00020R8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010SR\u0016\u0010\u0013\u001a\u00020T8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\r\u0010UR\u0018\u0010\n\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010YR\u001c\u0010W\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010Z"}, d2 = {"Lo/CueDecoder;", "Lcom/marrow/kt/base/BaseDaggerFragment;", "Lo/setWindowColor$AudioAttributesCompatParcelizer;", "Lo/setWindowColor$IconCompatParcelizer;", "Lo/setWindowColor$read;", "Lo/applyLegacyRendererOverrides$RemoteActionCompatParcelizer;", "Lo/getCurrentContentTitle$write;", "<init>", "()V", "", "write", "()I", "", "AudioAttributesImplBaseParcelizer", "", "p0", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;)V", "MediaMetadataCompat", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlayFromUri", "onCommand", "onRewind", "onPlay", "read", "handleMediaPlayPauseIfPendingOnHandler", "onPlayFromSearch", "onPrepareFromSearch", "", "Lcom/marrow/data/models/plan/PlanGroup;", "Lcom/marrow/data/api/models/response/plan/Coupon;", "p1", "AudioAttributesCompatParcelizer", "([Lcom/marrow/data/models/plan/PlanGroup;Lcom/marrow/data/api/models/response/plan/Coupon;)V", "Landroid/view/View;", "Landroid/os/Bundle;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Z)V", "MediaBrowserCompatSearchResultReceiver", "onMediaButtonEvent", "MediaDescriptionCompat", "onPrepare", "onPrepareFromUri", "onPrepareFromMediaId", "onRemoveQueueItemAt", "()Z", "Lcom/marrow/ui/activities/plan/PlanActivity;", "onSkipToNext", "()Lcom/marrow/ui/activities/plan/PlanActivity;", "Lcom/marrow/data/models/user/PhoneNumber;", "(Lcom/marrow/data/models/user/PhoneNumber;Ljava/lang/String;)V", "onSetCaptioningEnabled", "onSkipToQueueItem", "p2", "p3", "p4", "p5", "(Lcom/marrow/data/models/plan/PlanGroup;Lcom/marrow/data/api/models/response/plan/Coupon;Lcom/marrow/data/api/models/response/plan/Coupon;ZLjava/lang/String;Z)V", "onStart", "onFastForward", "onRemoveQueueItem", "ax_", "onPlayFromMediaId", "onCustomAction", "onAddQueueItem", "RatingCompat", "Lcom/marrow/data/api/models/response/plan/RenewEligible;", "(Lcom/marrow/data/api/models/response/plan/RenewEligible;)V", "onDestroyView", "Lo/onTruncatedSegmentParsed;", "Lo/setSessionInfo;", "onSkipToPrevious", "()Lo/onTruncatedSegmentParsed;", "Lo/swap$AudioAttributesCompatParcelizer;", "Lo/swap$AudioAttributesCompatParcelizer;", "Lo/getProtectionElementKeyId;", "Lo/getProtectionElementKeyId;", "Lo/getCurrentContentTitle;", "Lo/getCurrentContentTitle;", "Landroid/os/CountDownTimer;", "AudioAttributesImplApi21Parcelizer", "Landroid/os/CountDownTimer;", "()Lcom/marrow/data/api/models/response/plan/Coupon;", "()[Lcom/marrow/data/models/plan/PlanGroup;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CueDecoder extends setShearDegrees<setWindowColor.AudioAttributesCompatParcelizer> implements setWindowColor.IconCompatParcelizer, setWindowColor.read, applyLegacyRendererOverrides.RemoteActionCompatParcelizer, getCurrentContentTitle.write {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private CountDownTimer write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getCurrentContentTitle IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setSessionInfo AudioAttributesCompatParcelizer = SessionDescription.IconCompatParcelizer(this, new write(), new getAnswerMap() { // from class: o.r8lambdatltvpmKzcxIjtThYilWHbLSF_c
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return CueDecoder.AudioAttributesCompatParcelizer((onTruncatedSegmentParsed) obj);
        }
    });

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getProtectionElementKeyId RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final swap.AudioAttributesCompatParcelizer read;
    private static /* synthetic */ isResolutionNotSupported<Object>[] RemoteActionCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(CueDecoder.class, "binding", "getBinding()Lcom/marrow/databinding/FragmentBuyNowBinding;", 0))};

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.hasSelectionOverride
    public final boolean onRemoveQueueItemAt() {
        return true;
    }

    @Override // com.marrow.kt.base.BaseDaggerFragment, kotlin.hasSelectionOverride
    public final int write() {
        return R.layout.fragment_buy_now;
    }

    public CueDecoder() {
        stripCurlyBraces stripcurlybraces = new stripCurlyBraces();
        this.read = stripcurlybraces;
        this.RemoteActionCompatParcelizer = new getProtectionElementKeyId(stripcurlybraces);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final onTruncatedSegmentParsed onSkipToPrevious() {
        return (onTruncatedSegmentParsed) this.AudioAttributesCompatParcelizer.read(this, RemoteActionCompatParcelizer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(onTruncatedSegmentParsed ontruncatedsegmentparsed) {
        toMagicModuleMetaRepoModel.write(ontruncatedsegmentparsed, "");
        ontruncatedsegmentparsed.MediaDescriptionCompat.setAdapter(null);
        return getShowPopup.INSTANCE;
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer() {
        CustomTextView customTextView = onSkipToPrevious().onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        onSkipToPrevious().onAddQueueItem.setText(p0);
        CustomTextView customTextView = onSkipToPrevious().onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaMetadataCompat() {
        CustomTextView customTextView = onSkipToPrevious().handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        onSkipToPrevious().handleMediaPlayPauseIfPendingOnHandler.setText(p0);
        CustomTextView customTextView = onSkipToPrevious().handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer() {
        CustomTextView customTextView = onSkipToPrevious().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        onSkipToPrevious().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(p0);
        CustomTextView customTextView = onSkipToPrevious().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        CustomTextView customTextView = onSkipToPrevious().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaBrowserCompatItemReceiver(String p0) {
        onSkipToPrevious().RatingCompat.setText(p0);
        CustomTextView customTextView = onSkipToPrevious().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        RecyclerView recyclerView = onSkipToPrevious().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(recyclerView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPlayFromUri() {
        RecyclerView recyclerView = onSkipToPrevious().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(recyclerView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        onTruncatedSegmentParsed ontruncatedsegmentparsedOnSkipToPrevious = onSkipToPrevious();
        ontruncatedsegmentparsedOnSkipToPrevious.IconCompatParcelizer.setBackground(_isNaN.getDrawable(requireContext(), R.drawable.bg_empty_plan_gradient));
        ontruncatedsegmentparsedOnSkipToPrevious.onCommand.setText(p0);
        ImageView imageView = ontruncatedsegmentparsedOnSkipToPrevious.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        TextView textView = ontruncatedsegmentparsedOnSkipToPrevious.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        CustomTextView customTextView = ontruncatedsegmentparsedOnSkipToPrevious.onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        CustomTextView customTextView2 = ontruncatedsegmentparsedOnSkipToPrevious.handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        CustomTextView customTextView3 = ontruncatedsegmentparsedOnSkipToPrevious.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
        CustomTextView customTextView4 = ontruncatedsegmentparsedOnSkipToPrevious.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
        View view = ontruncatedsegmentparsedOnSkipToPrevious.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        Group group = ontruncatedsegmentparsedOnSkipToPrevious.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        FrameLayout frameLayout = ontruncatedsegmentparsedOnSkipToPrevious.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        RecyclerView recyclerView = ontruncatedsegmentparsedOnSkipToPrevious.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        CustomTextView customTextView5 = ontruncatedsegmentparsedOnSkipToPrevious.onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView5, "");
        LinearLayout linearLayout = ontruncatedsegmentparsedOnSkipToPrevious.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        CustomTextView customTextView6 = ontruncatedsegmentparsedOnSkipToPrevious.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView6, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView, textView, customTextView, customTextView2, customTextView3, customTextView4, view, group, frameLayout, recyclerView, customTextView5, linearLayout, customTextView6);
        LinearLayout linearLayoutIconCompatParcelizer = ontruncatedsegmentparsedOnSkipToPrevious.MediaMetadataCompat.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        LinearLayout linearLayout2 = linearLayoutIconCompatParcelizer;
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.onPrepareFromSearch = getResources().getDimensionPixelSize(R.dimen.margin_40);
        linearLayout2.setLayoutParams(layoutParams2);
        Group group2 = ontruncatedsegmentparsedOnSkipToPrevious.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(group2);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onCommand() {
        CustomTextView customTextView = onSkipToPrevious().onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onRewind() {
        CustomTextView customTextView = onSkipToPrevious().onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPlay() {
        FrameLayout frameLayout = onSkipToPrevious().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void read() {
        FrameLayout frameLayout = onSkipToPrevious().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        ConstraintLayout constraintLayout = onSkipToPrevious().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPlayFromSearch() {
        ImageView imageView = onSkipToPrevious().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        PlayerControlViewExternalSyntheticLambda1.write(imageView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPrepareFromSearch() {
        Group group = onSkipToPrevious().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        PlayerControlViewExternalSyntheticLambda1.write(group);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(PlanGroup[] p0, Coupon p1) {
        aD_().RemoteActionCompatParcelizer(p0);
        aD_().read(p1);
    }

    @Override // o.setWindowColor.read
    public final Coupon IconCompatParcelizer() {
        return aD_().onCustomAction();
    }

    @Override // o.setWindowColor.read
    public final PlanGroup[] AudioAttributesCompatParcelizer() {
        return aD_().onFastForward();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        getCurrentContentTitle getcurrentcontenttitle = new getCurrentContentTitle(p0, this);
        getcurrentcontenttitle.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = getcurrentcontenttitle;
        aH_();
        ((setWindowColor.AudioAttributesCompatParcelizer) getMPresenter()).RemoteActionCompatParcelizer(this.read, this);
        ConstraintLayout constraintLayout = onSkipToPrevious().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        AudioAttributesCompatParcelizer(constraintLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.CueTextSizeType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        CustomTextView customTextView = onSkipToPrevious().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        AudioAttributesCompatParcelizer(customTextView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.CueLineType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        CustomTextView customTextView2 = onSkipToPrevious().MediaMetadataCompat.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        AudioAttributesCompatParcelizer(customTextView2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.CueVerticalType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.MediaBrowserCompatItemReceiver(this.read);
            }
        });
        CustomTextView customTextView3 = onSkipToPrevious().MediaMetadataCompat.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
        AudioAttributesCompatParcelizer(customTextView3, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.CueGroupExternalSyntheticLambda0
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer);
            }
        });
        CustomTextView customTextView4 = onSkipToPrevious().MediaMetadataCompat.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
        AudioAttributesCompatParcelizer(customTextView4, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.CueEncoder
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.MediaMetadataCompat(this.RemoteActionCompatParcelizer);
            }
        });
        CustomTextView customTextView5 = onSkipToPrevious().MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView5, "");
        AudioAttributesCompatParcelizer(customTextView5, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.filterOutBitmapCues
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.MediaDescriptionCompat(this.write);
            }
        });
        CustomTextView customTextView6 = onSkipToPrevious().onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView6, "");
        AudioAttributesCompatParcelizer(customTextView6, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.CueGroup
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CueDecoder.RatingCompat(this.read);
            }
        });
        InvalidTypeIdException.RemoteActionCompatParcelizer((View) onSkipToPrevious().MediaDescriptionCompat, false);
        onSkipToPrevious().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setSelected(true);
        onSkipToPrevious().MediaDescriptionCompat.setAdapter(this.RemoteActionCompatParcelizer);
    }

    public static final class write implements getAnswerMap<CueDecoder, onTruncatedSegmentParsed> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.onTruncatedSegmentParsed] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ onTruncatedSegmentParsed invoke(CueDecoder cueDecoder) {
            return IconCompatParcelizer(cueDecoder);
        }

        private static onTruncatedSegmentParsed IconCompatParcelizer(CueDecoder cueDecoder) {
            toMagicModuleMetaRepoModel.write(cueDecoder, "");
            return onTruncatedSegmentParsed.IconCompatParcelizer(cueDecoder.requireView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(CueDecoder cueDecoder) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).read();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(CueDecoder cueDecoder) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).write();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(CueDecoder cueDecoder) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(CueDecoder cueDecoder) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).MediaBrowserCompatItemReceiver();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(CueDecoder cueDecoder) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(CueDecoder cueDecoder) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(CueDecoder cueDecoder) {
        getLatestBitrateEstimate.RatingCompat.write();
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).RatingCompat();
        return getShowPopup.INSTANCE;
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        IconCompatParcelizer(p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(CueDecoder cueDecoder, boolean z) {
        ((setWindowColor.AudioAttributesCompatParcelizer) cueDecoder.getMPresenter()).IconCompatParcelizer(z);
    }

    @Override // kotlin.hasSelectionOverride
    public final void RemoteActionCompatParcelizer(final boolean p0) {
        maybeGetTypeVariable activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: o.ExoplayerCuesDecoderSingleEventSubtitle
                @Override // java.lang.Runnable
                public final void run() {
                    CueDecoder.AudioAttributesCompatParcelizer(this.write, p0);
                }
            });
        }
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaBrowserCompatSearchResultReceiver() {
        LinearLayout linearLayout = onSkipToPrevious().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onMediaButtonEvent() {
        CustomTextView customTextView = onSkipToPrevious().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        CustomTextView customTextView = onSkipToPrevious().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPrepare() {
        LinearLayout linearLayout = onSkipToPrevious().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(linearLayout);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPrepareFromUri() {
        CustomTextView customTextView = onSkipToPrevious().MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPrepareFromMediaId() {
        CustomTextView customTextView = onSkipToPrevious().MediaMetadataCompat.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void IconCompatParcelizer(boolean p0) {
        LinearLayout linearLayoutIconCompatParcelizer = onSkipToPrevious().MediaMetadataCompat.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        linearLayoutIconCompatParcelizer.setVisibility(p0 ? 0 : 8);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context context = getContext();
        String string = getString(R.string.app_name_send_email_title_support_pro_only, p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        scheduleUpdate.AudioAttributesCompatParcelizer(context, "support@marrowmed.com", string, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.hasSelectionOverride
    /* JADX INFO: renamed from: onSkipToNext, reason: merged with bridge method [inline-methods] */
    public PlanActivity aD_() {
        BaseActivity baseActivityAD_ = super.aD_();
        toMagicModuleMetaRepoModel.read(baseActivityAD_, "");
        return (PlanActivity) baseActivityAD_;
    }

    @Override // o.applyLegacyRendererOverrides.RemoteActionCompatParcelizer
    public final void write(PhoneNumber p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ((setWindowColor.AudioAttributesCompatParcelizer) getMPresenter()).read(p0, p1);
    }

    @Override // o.getCurrentContentTitle.write
    public final void onSetCaptioningEnabled() {
        onSkipToQueueItem();
    }

    private final void onSkipToQueueItem() {
        RemoteActionCompatParcelizer();
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        applyLegacyRendererOverrides applylegacyrendereroverrides = new applyLegacyRendererOverrides(contextRequireContext);
        applylegacyrendereroverrides.RemoteActionCompatParcelizer(this);
        this.read = applylegacyrendereroverrides;
        this.read.show();
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void write(PlanGroup p0, Coupon p1, Coupon p2, boolean p3, String p4, boolean p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        isNewSubtitleDataAvailable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isNewSubtitleDataAvailable.read;
        AudioAttributesCompatParcelizer(isNewSubtitleDataAvailable.RemoteActionCompatParcelizer.read(p0, p1, p2, p3, p4, p5));
    }

    /* JADX INFO: renamed from: o.CueDecoder$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/CueDecoder$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "p6", "Lo/CueDecoder;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Lo/CueDecoder;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static CueDecoder IconCompatParcelizer(String p0, String p1, String p2, boolean p3, String p4, boolean p5, String p6) {
            Bundle bundle = new Bundle();
            bundle.putString("key_referral", p0);
            bundle.putString("key_discount", p1);
            bundle.putString("key_origin", p2);
            bundle.putString("key_source", p6);
            bundle.putBoolean("plan_expanded", p3);
            bundle.putString("plan_id", p4);
            bundle.putBoolean("open_default_plan", p5);
            CueDecoder cueDecoder = new CueDecoder();
            cueDecoder.setArguments(bundle);
            return cueDecoder;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // com.marrow.kt.base.BaseDaggerFragment, kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((setWindowColor.AudioAttributesCompatParcelizer) getMPresenter()).AudioAttributesCompatParcelizer(PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(a_("key_origin", "unknown"), "unknown"), PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(a_("key_source", "unknown"), "unknown"));
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onFastForward() {
        CustomTextView customTextView = onSkipToPrevious().MediaMetadataCompat.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        View view = onSkipToPrevious().MediaMetadataCompat.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView, view);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onRemoveQueueItem() {
        CustomTextView customTextView = onSkipToPrevious().MediaMetadataCompat.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        View view = onSkipToPrevious().MediaMetadataCompat.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView, view);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void ax_() {
        CustomTextView customTextView = onSkipToPrevious().MediaMetadataCompat.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onPlayFromMediaId() {
        TextView textView = onSkipToPrevious().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void MediaBrowserCompatItemReceiver() {
        TextView textView = onSkipToPrevious().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        RemoteActionCompatParcelizer();
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.read = new canSelectFormat(contextRequireContext, p0);
        this.read.show();
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onCustomAction() {
        onSkipToPrevious().IconCompatParcelizer.setBackground(_isNaN.getDrawable(requireContext(), R.drawable.e6_5_transition_gradient));
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void onAddQueueItem() {
        onSkipToPrevious().IconCompatParcelizer.setBackground(_isNaN.getDrawable(requireContext(), R.drawable.bg_renewal_gradient));
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void RatingCompat() {
        ImageView imageView = onSkipToPrevious().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
    }

    @Override // o.setWindowColor.IconCompatParcelizer
    public final void write(RenewEligible p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        TextView textView = onSkipToPrevious().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        this.write = dispatchTouchEvent.AudioAttributesCompatParcelizer(p0, textView);
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        CountDownTimer countDownTimer = this.write;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
    }
}

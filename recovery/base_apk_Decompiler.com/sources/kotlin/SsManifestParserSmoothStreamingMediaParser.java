package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import kotlin.Metadata;
import kotlin.swap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\n\u0010\u000fJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00128CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0011\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0010\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\n\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001c\u0010\u0018R\u001b\u0010\u000e\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0018"}, d2 = {"Lo/SsManifestParserSmoothStreamingMediaParser;", "Lo/repositionVerticalCue;", "Lo/swap$AudioAttributesCompatParcelizer;", "Lo/swap$read;", "Landroid/view/View;", "p0", "p1", "<init>", "(Landroid/view/View;Lo/swap$AudioAttributesCompatParcelizer;)V", "", "AudioAttributesCompatParcelizer", "()V", "IconCompatParcelizer", "", "write", "(Ljava/lang/String;)V", "read", "RemoteActionCompatParcelizer", "Landroid/widget/ImageView;", "Lo/RenewEligible;", "AudioAttributesImplApi26Parcelizer", "()Landroid/widget/ImageView;", "Lcom/marrow/ui/views/CustomTextView;", "AudioAttributesImplBaseParcelizer", "()Lcom/marrow/ui/views/CustomTextView;", "Landroid/widget/LinearLayout;", "AudioAttributesImplApi21Parcelizer", "()Landroid/widget/LinearLayout;", "MediaBrowserCompatCustomActionResultReceiver", "MediaDescriptionCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SsManifestParserSmoothStreamingMediaParser extends repositionVerticalCue<swap.AudioAttributesCompatParcelizer> implements swap.read {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read;

    private SsManifestParserSmoothStreamingMediaParser(final View view, swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(view, audioAttributesCompatParcelizer);
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.fourCCToMimeType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SsManifestParserSmoothStreamingMediaParser.AudioAttributesImplApi26Parcelizer(view);
            }
        });
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.SsManifestParserStreamIndexParser
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SsManifestParserSmoothStreamingMediaParser.AudioAttributesImplBaseParcelizer(view);
            }
        });
        this.read = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.parseStreamElementStartTag
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SsManifestParserSmoothStreamingMediaParser.MediaBrowserCompatItemReceiver(view);
            }
        });
        this.AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.buildCodecSpecificData
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SsManifestParserSmoothStreamingMediaParser.AudioAttributesImplApi21Parcelizer(view);
            }
        });
        this.write = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.Cue
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SsManifestParserSmoothStreamingMediaParser.MediaBrowserCompatCustomActionResultReceiver(view);
            }
        });
    }

    private final ImageView AudioAttributesImplApi26Parcelizer() {
        Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (ImageView) objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView AudioAttributesImplApi26Parcelizer(View view) {
        return (ImageView) view.findViewById(R.id.imgFullAccess);
    }

    private final CustomTextView AudioAttributesImplBaseParcelizer() {
        Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (CustomTextView) objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomTextView AudioAttributesImplBaseParcelizer(View view) {
        return (CustomTextView) view.findViewById(R.id.tvPlanTitle);
    }

    private final LinearLayout AudioAttributesImplApi21Parcelizer() {
        Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (LinearLayout) objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout MediaBrowserCompatItemReceiver(View view) {
        return (LinearLayout) view.findViewById(R.id.llcontainerPlanDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomTextView AudioAttributesImplApi21Parcelizer(View view) {
        return (CustomTextView) view.findViewById(R.id.plan_amount_view);
    }

    private final CustomTextView MediaBrowserCompatCustomActionResultReceiver() {
        Object objRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (CustomTextView) objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomTextView MediaBrowserCompatCustomActionResultReceiver(View view) {
        return (CustomTextView) view.findViewById(R.id.tvActualStrikethroughPrice);
    }

    private final CustomTextView MediaDescriptionCompat() {
        Object objRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (CustomTextView) objRemoteActionCompatParcelizer;
    }

    @Override // o.swap.read
    public final void AudioAttributesCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer());
    }

    @Override // o.swap.read
    public final void IconCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer());
    }

    @Override // o.swap.read
    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplBaseParcelizer().setText(p0);
    }

    @Override // o.swap.read
    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatCustomActionResultReceiver().setText(p0);
    }

    @Override // o.swap.read
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaDescriptionCompat().setText(p0);
        MediaDescriptionCompat().setPaintFlags(MediaDescriptionCompat().getPaintFlags() | 16);
    }

    @Override // o.swap.read
    public final void write() {
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(MediaDescriptionCompat());
    }

    @Override // o.swap.read
    public final void RemoteActionCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(MediaDescriptionCompat());
    }

    @Override // o.swap.read
    public final void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewInflate = LayoutInflater.from(onSkipToNext()).inflate(R.layout.view_type_plan_desc_bullet, (ViewGroup) AudioAttributesImplApi21Parcelizer(), false);
        ((TextView) viewInflate.findViewById(R.id.tvPlanDesc)).setText(p0);
        AudioAttributesImplApi21Parcelizer().addView(viewInflate);
    }

    @Override // o.swap.read
    public final void IconCompatParcelizer(String p0) {
        View viewInflate = LayoutInflater.from(onSkipToNext()).inflate(R.layout.view_type_plan_title, (ViewGroup) AudioAttributesImplApi21Parcelizer(), false);
        ((TextView) viewInflate.findViewById(R.id.plan_feature_title)).setText(p0);
        AudioAttributesImplApi21Parcelizer().addView(viewInflate);
    }

    @Override // o.swap.read
    public final void read() {
        AudioAttributesImplApi21Parcelizer().removeAllViews();
    }

    /* JADX INFO: renamed from: o.SsManifestParserSmoothStreamingMediaParser$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/SsManifestParserSmoothStreamingMediaParser$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Lo/swap$AudioAttributesCompatParcelizer;", "p2", "Lo/SsManifestParserSmoothStreamingMediaParser;", "IconCompatParcelizer", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lo/swap$AudioAttributesCompatParcelizer;)Lo/SsManifestParserSmoothStreamingMediaParser;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static SsManifestParserSmoothStreamingMediaParser IconCompatParcelizer(LayoutInflater p0, ViewGroup p1, swap.AudioAttributesCompatParcelizer p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            View viewInflate = p0.inflate(R.layout.view_type_plan, p1, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            return new SsManifestParserSmoothStreamingMediaParser(viewInflate, p2, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ SsManifestParserSmoothStreamingMediaParser(View view, swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(view, audioAttributesCompatParcelizer);
    }
}

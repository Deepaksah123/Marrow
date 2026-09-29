package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import kotlin.Metadata;
import kotlin.skipComment;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u001b\u0010\u000b\u001a\u00020\u00148CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c"}, d2 = {"Lo/createFromCaptionStyleV21;", "Lo/repositionVerticalCue;", "Lo/skipComment$RemoteActionCompatParcelizer;", "Lo/skipComment$read;", "Landroid/view/View;", "p0", "p1", "<init>", "(Landroid/view/View;Lo/skipComment$RemoteActionCompatParcelizer;)V", "", "", "write", "(I)V", "", "read", "(Ljava/lang/String;)V", "", "RemoteActionCompatParcelizer", "(Z)V", "AudioAttributesCompatParcelizer", "Lo/HlsMultivariantPlaylistVariant;", "Lo/setSessionInfo;", "()Lo/HlsMultivariantPlaylistVariant;", "Lcom/marrow/ui/views/CustomTextView;", "MediaBrowserCompatItemReceiver", "Lcom/marrow/ui/views/CustomTextView;", "IconCompatParcelizer", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createFromCaptionStyleV21 extends repositionVerticalCue<skipComment.RemoteActionCompatParcelizer> implements skipComment.read {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final CustomTextView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ProgressBar AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setSessionInfo write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CustomTextView IconCompatParcelizer;
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(createFromCaptionStyleV21.class, "binding", "getBinding()Lcom/marrow/databinding/ViewSuggestedCardBinding;", 0))};

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createFromCaptionStyleV21(View view, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(view, remoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.write = new setOrigin(new read());
        CustomTextView customTextView = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        this.RemoteActionCompatParcelizer = customTextView;
        CustomTextView customTextView2 = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        this.IconCompatParcelizer = customTextView2;
        ProgressBar progressBar = RemoteActionCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        this.AudioAttributesCompatParcelizer = progressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HlsMultivariantPlaylistVariant RemoteActionCompatParcelizer() {
        return (HlsMultivariantPlaylistVariant) this.write.read(this, IconCompatParcelizer[0]);
    }

    /* JADX INFO: renamed from: o.createFromCaptionStyleV21$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/createFromCaptionStyleV21$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "p0", "Lo/skipComment$RemoteActionCompatParcelizer;", "p1", "Lo/createFromCaptionStyleV21;", "IconCompatParcelizer", "(Landroid/view/ViewGroup;Lo/skipComment$RemoteActionCompatParcelizer;)Lo/createFromCaptionStyleV21;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static createFromCaptionStyleV21 IconCompatParcelizer(ViewGroup p0, skipComment.RemoteActionCompatParcelizer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            View viewInflate = LayoutInflater.from(p0.getContext()).inflate(R.layout.view_suggested_card, p0, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new createFromCaptionStyleV21(viewInflate, p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class read implements getAnswerMap<createFromCaptionStyleV21, HlsMultivariantPlaylistVariant> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.HlsMultivariantPlaylistVariant, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ HlsMultivariantPlaylistVariant invoke(createFromCaptionStyleV21 createfromcaptionstylev21) {
            return AudioAttributesCompatParcelizer(createfromcaptionstylev21);
        }

        private static HlsMultivariantPlaylistVariant AudioAttributesCompatParcelizer(createFromCaptionStyleV21 createfromcaptionstylev21) {
            toMagicModuleMetaRepoModel.write(createfromcaptionstylev21, "");
            return HlsMultivariantPlaylistVariant.read(createfromcaptionstylev21.itemView);
        }
    }

    @Override // o.skipComment.read
    public final void write(int p0) {
        this.RemoteActionCompatParcelizer.setText(p0);
    }

    @Override // o.skipComment.read
    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer.setText(p0);
    }

    @Override // o.skipComment.read
    public final void RemoteActionCompatParcelizer(boolean p0) {
        this.AudioAttributesCompatParcelizer.setVisibility(p0 ? 0 : 8);
    }

    @Override // o.skipComment.read
    public final void AudioAttributesCompatParcelizer(int p0) {
        this.AudioAttributesCompatParcelizer.setProgress(p0);
    }

    @getMagicModuleMeta
    public static final createFromCaptionStyleV21 write(ViewGroup viewGroup, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return Companion.IconCompatParcelizer(viewGroup, remoteActionCompatParcelizer);
    }
}

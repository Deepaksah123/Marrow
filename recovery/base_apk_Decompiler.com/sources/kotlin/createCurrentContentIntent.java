package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;
import kotlin.Metadata;
import kotlin.WebvttSubtitleExternalSyntheticLambda0;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0014\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\u0019\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0012\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c"}, d2 = {"Lo/createCurrentContentIntent;", "Lo/repositionVerticalCue;", "Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;", "Lo/WebvttSubtitleExternalSyntheticLambda0$AudioAttributesCompatParcelizer;", "Landroid/view/View;", "p0", "p1", "<init>", "(Landroid/view/View;Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;)V", "", "", "read", "(Ljava/lang/String;)V", "", "(I)V", "write", "()V", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "(I)Landroid/view/View;", "Lo/r8lambdaoPbzlN0fJ81a0qYQJInalmoAM;", "Lo/setSessionInfo;", "AudioAttributesImplApi21Parcelizer", "()Lo/r8lambdaoPbzlN0fJ81a0qYQJInalmoAM;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "AudioAttributesImplBaseParcelizer", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "Landroid/view/View;", "Landroidx/cardview/widget/CardView;", "Landroidx/cardview/widget/CardView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createCurrentContentIntent extends repositionVerticalCue<WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer> implements WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ImageView IconCompatParcelizer;
    private final CardView AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final TextView AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setSessionInfo RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final TextView read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final TextView MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final View write;
    private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(createCurrentContentIntent.class, "binding", "getBinding()Lcom/marrow/databinding/ItemTopicRowBinding;", 0))};

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createCurrentContentIntent(View view, WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer) {
        super(view, iconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = new setOrigin(new IconCompatParcelizer());
        TextView textView = AudioAttributesImplApi21Parcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        this.read = textView;
        TextView textView2 = AudioAttributesImplApi21Parcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        this.AudioAttributesCompatParcelizer = textView2;
        ImageView imageView = AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        this.IconCompatParcelizer = imageView;
        View view2 = AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
        this.write = view2;
        CardView cardViewIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardViewIconCompatParcelizer, "");
        this.AudioAttributesImplApi21Parcelizer = cardViewIconCompatParcelizer;
        TextView textView3 = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        this.MediaBrowserCompatCustomActionResultReceiver = textView3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final r8lambdaoPbzlN0fJ81a0qYQJInalmoAM AudioAttributesImplApi21Parcelizer() {
        return (r8lambdaoPbzlN0fJ81a0qYQJInalmoAM) this.RemoteActionCompatParcelizer.read(this, write[0]);
    }

    public static final class IconCompatParcelizer implements getAnswerMap<createCurrentContentIntent, r8lambdaoPbzlN0fJ81a0qYQJInalmoAM> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.r8lambdaoPbzlN0fJ81a0qYQJInalmoAM] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ r8lambdaoPbzlN0fJ81a0qYQJInalmoAM invoke(createCurrentContentIntent createcurrentcontentintent) {
            return read(createcurrentcontentintent);
        }

        private static r8lambdaoPbzlN0fJ81a0qYQJInalmoAM read(createCurrentContentIntent createcurrentcontentintent) {
            toMagicModuleMetaRepoModel.write(createcurrentcontentintent, "");
            return r8lambdaoPbzlN0fJ81a0qYQJInalmoAM.write(createcurrentcontentintent.itemView);
        }
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.setText(p0);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void read(int p0) {
        this.read.setText(parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(p0));
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void write() {
        PlayerControlViewExternalSyntheticLambda1.write(this.IconCompatParcelizer);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        TextView textView = this.AudioAttributesCompatParcelizer;
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView, textView.getText().toString());
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        PlayerControlViewExternalSyntheticLambda1.write(this.AudioAttributesImplApi21Parcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver.setText(p0);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void read() {
        TextView textView = this.read;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = this.read.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceBlue, new TypedValue(), true));
        this.write.setVisibility(0);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        TextView textView = this.read;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = this.read.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onBackgroundSurface3, new TypedValue(), true));
        this.write.setVisibility(8);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer
    public final void write(int p0) {
        boolean z = p0 == 1;
        this.IconCompatParcelizer.setSelected(z);
        PlayerControlViewExternalSyntheticLambda1.read(this.IconCompatParcelizer, z);
    }

    @Override // kotlin.repositionVerticalCue
    protected final View MediaBrowserCompatItemReceiver(int p0) {
        if (p0 == 2) {
            return this.IconCompatParcelizer;
        }
        return super.MediaBrowserCompatItemReceiver(p0);
    }

    /* JADX INFO: renamed from: o.createCurrentContentIntent$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/createCurrentContentIntent$read;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "p0", "Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;", "p1", "Lo/createCurrentContentIntent;", "RemoteActionCompatParcelizer", "(Landroid/view/ViewGroup;Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;)Lo/createCurrentContentIntent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static createCurrentContentIntent RemoteActionCompatParcelizer(ViewGroup p0, WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            View viewInflate = LayoutInflater.from(p0.getContext()).inflate(R.layout.item_topic_row, p0, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new createCurrentContentIntent(viewInflate, p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}

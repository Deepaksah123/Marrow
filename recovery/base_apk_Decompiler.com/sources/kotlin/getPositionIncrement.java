package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import kotlin.Metadata;
import kotlin.isWebvttHeaderLine;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0012\u001a\u00020\u00148CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\r\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lo/getPositionIncrement;", "Lo/repositionVerticalCue;", "Lo/isWebvttHeaderLine$AudioAttributesCompatParcelizer;", "Lo/isWebvttHeaderLine$write;", "Landroid/view/View;", "p0", "p1", "<init>", "(Landroid/view/View;Lo/isWebvttHeaderLine$AudioAttributesCompatParcelizer;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "write", "IconCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "", "read", "(Z)V", "Lo/mapSampleQueuesToMatchTrackGroups;", "Lo/setSessionInfo;", "()Lo/mapSampleQueuesToMatchTrackGroups;", "Lcom/marrow/ui/views/CustomTextView;", "Lcom/marrow/ui/views/CustomTextView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getPositionIncrement extends repositionVerticalCue<isWebvttHeaderLine.AudioAttributesCompatParcelizer> implements isWebvttHeaderLine.write {
    private final CustomTextView AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final CustomTextView write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setSessionInfo read;
    private static /* synthetic */ isResolutionNotSupported<Object>[] RemoteActionCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(getPositionIncrement.class, "binding", "getBinding()Lcom/marrow/databinding/LayoutDownloadPixelBinding;", 0))};

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private getPositionIncrement(View view, isWebvttHeaderLine.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(view, audioAttributesCompatParcelizer);
        this.read = new setOrigin(new write());
        CustomTextView customTextView = write().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        this.AudioAttributesCompatParcelizer = customTextView;
        CustomTextView customTextView2 = write().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        this.write = customTextView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final mapSampleQueuesToMatchTrackGroups write() {
        return (mapSampleQueuesToMatchTrackGroups) this.read.read(this, RemoteActionCompatParcelizer[0]);
    }

    public static final class write implements getAnswerMap<getPositionIncrement, mapSampleQueuesToMatchTrackGroups> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.mapSampleQueuesToMatchTrackGroups] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ mapSampleQueuesToMatchTrackGroups invoke(getPositionIncrement getpositionincrement) {
            return AudioAttributesCompatParcelizer(getpositionincrement);
        }

        private static mapSampleQueuesToMatchTrackGroups AudioAttributesCompatParcelizer(getPositionIncrement getpositionincrement) {
            toMagicModuleMetaRepoModel.write(getpositionincrement, "");
            return mapSampleQueuesToMatchTrackGroups.RemoteActionCompatParcelizer(getpositionincrement.itemView);
        }
    }

    @Override // o.isWebvttHeaderLine.write
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write.setText(p0);
    }

    @Override // o.isWebvttHeaderLine.write
    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.setText(p0);
    }

    @Override // o.isWebvttHeaderLine.write
    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.setSelected(true);
    }

    @Override // o.isWebvttHeaderLine.write
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.setSelected(false);
    }

    @Override // o.isWebvttHeaderLine.write
    public final void read(boolean p0) {
        this.itemView.setAlpha(p0 ? 1.0f : 0.7f);
    }

    /* JADX INFO: renamed from: o.getPositionIncrement$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getPositionIncrement$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Lo/isWebvttHeaderLine$AudioAttributesCompatParcelizer;", "p2", "Lo/getPositionIncrement;", "AudioAttributesCompatParcelizer", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lo/isWebvttHeaderLine$AudioAttributesCompatParcelizer;)Lo/getPositionIncrement;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getPositionIncrement AudioAttributesCompatParcelizer(LayoutInflater p0, ViewGroup p1, isWebvttHeaderLine.AudioAttributesCompatParcelizer p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            View viewInflate = p0.inflate(R.layout.layout_download_pixel, p1, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new getPositionIncrement(viewInflate, p2, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ getPositionIncrement(View view, isWebvttHeaderLine.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(view, audioAttributesCompatParcelizer);
    }
}

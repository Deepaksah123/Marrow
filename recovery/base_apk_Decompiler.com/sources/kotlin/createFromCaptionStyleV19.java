package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import kotlin.Metadata;
import kotlin.skipComment;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/createFromCaptionStyleV19;", "Lo/repositionVerticalCue;", "Lo/skipComment$RemoteActionCompatParcelizer;", "Lo/skipComment$AudioAttributesCompatParcelizer;", "Landroid/view/View;", "p0", "p1", "<init>", "(Landroid/view/View;Lo/skipComment$RemoteActionCompatParcelizer;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "Lo/HlsSampleStreamWrapperHlsSampleQueue;", "read", "Lo/setSessionInfo;", "()Lo/HlsSampleStreamWrapperHlsSampleQueue;", "AudioAttributesCompatParcelizer", "Lcom/marrow/ui/views/CustomTextView;", "write", "Lcom/marrow/ui/views/CustomTextView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createFromCaptionStyleV19 extends repositionVerticalCue<skipComment.RemoteActionCompatParcelizer> implements skipComment.AudioAttributesCompatParcelizer {
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(createFromCaptionStyleV19.class, "binding", "getBinding()Lcom/marrow/databinding/LayoutLessonListSubjectTitleBinding;", 0))};

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setSessionInfo AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CustomTextView read;

    private createFromCaptionStyleV19(View view, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(view, remoteActionCompatParcelizer);
        this.AudioAttributesCompatParcelizer = new setOrigin(new IconCompatParcelizer());
        CustomTextView customTextView = read().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        this.read = customTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HlsSampleStreamWrapperHlsSampleQueue read() {
        return (HlsSampleStreamWrapperHlsSampleQueue) this.AudioAttributesCompatParcelizer.read(this, IconCompatParcelizer[0]);
    }

    public static final class IconCompatParcelizer implements getAnswerMap<createFromCaptionStyleV19, HlsSampleStreamWrapperHlsSampleQueue> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.HlsSampleStreamWrapperHlsSampleQueue, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ HlsSampleStreamWrapperHlsSampleQueue invoke(createFromCaptionStyleV19 createfromcaptionstylev19) {
            return RemoteActionCompatParcelizer(createfromcaptionstylev19);
        }

        private static HlsSampleStreamWrapperHlsSampleQueue RemoteActionCompatParcelizer(createFromCaptionStyleV19 createfromcaptionstylev19) {
            toMagicModuleMetaRepoModel.write(createfromcaptionstylev19, "");
            return HlsSampleStreamWrapperHlsSampleQueue.RemoteActionCompatParcelizer(createfromcaptionstylev19.itemView);
        }
    }

    @Override // o.skipComment.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read.setText(p0);
    }

    /* JADX INFO: renamed from: o.createFromCaptionStyleV19$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/createFromCaptionStyleV19$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "p0", "Lo/skipComment$RemoteActionCompatParcelizer;", "p1", "Lo/createFromCaptionStyleV19;", "read", "(Landroid/view/ViewGroup;Lo/skipComment$RemoteActionCompatParcelizer;)Lo/createFromCaptionStyleV19;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static createFromCaptionStyleV19 read(ViewGroup p0, skipComment.RemoteActionCompatParcelizer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            View viewInflate = LayoutInflater.from(p0.getContext()).inflate(R.layout.layout_lesson_list_subject_title, p0, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new createFromCaptionStyleV19(viewInflate, p1, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ createFromCaptionStyleV19(View view, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(view, remoteActionCompatParcelizer);
    }

    @getMagicModuleMeta
    public static final createFromCaptionStyleV19 AudioAttributesCompatParcelizer(ViewGroup viewGroup, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return Companion.read(viewGroup, remoteActionCompatParcelizer);
    }
}

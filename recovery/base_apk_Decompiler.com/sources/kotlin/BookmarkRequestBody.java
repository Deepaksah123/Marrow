package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.List;
import kotlin.BookmarkRequestBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u001b\u0019\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/BookmarkRequestBody;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "Lo/BookmarkRequestBody$IconCompatParcelizer;", "p0", "<init>", "(Lo/BookmarkRequestBody$IconCompatParcelizer;)V", "Landroid/view/ViewGroup;", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "Lo/setMcqId;", "IconCompatParcelizer", "(Ljava/util/List;)V", "Lo/BookmarkRequestBody$IconCompatParcelizer;", "write", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookmarkRequestBody extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<? extends AbstractC0202setMcqId> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void read(String str);
    }

    public BookmarkRequestBody(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.write = iconCompatParcelizer;
        this.IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public static final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private static /* synthetic */ isResolutionNotSupported<Object>[] read = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(AudioAttributesCompatParcelizer.class, "binding", "getBinding()Lcom/marrow/databinding/LayoutFreeVideoListItemBinding;", 0))};
        private final setSessionInfo AudioAttributesCompatParcelizer;
        private final TextView AudioAttributesImplApi21Parcelizer;
        private final ImageView IconCompatParcelizer;
        private final TextView RemoteActionCompatParcelizer;
        private final TextView write;

        /* JADX INFO: renamed from: o.BookmarkRequestBody$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        public static final class C0020AudioAttributesCompatParcelizer implements getAnswerMap<AudioAttributesCompatParcelizer, isVideoSampleStream> {
            /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.isVideoSampleStream] */
            @Override // kotlin.getAnswerMap
            public final /* synthetic */ isVideoSampleStream invoke(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                return read(audioAttributesCompatParcelizer);
            }

            private static isVideoSampleStream read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
                return isVideoSampleStream.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.itemView);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesCompatParcelizer = new setOrigin(new C0020AudioAttributesCompatParcelizer());
            ImageView imageView = IconCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            this.IconCompatParcelizer = imageView;
            TextView textView = IconCompatParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            this.RemoteActionCompatParcelizer = textView;
            TextView textView2 = IconCompatParcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            this.AudioAttributesImplApi21Parcelizer = textView2;
            TextView textView3 = IconCompatParcelizer().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            this.write = textView3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private isVideoSampleStream IconCompatParcelizer() {
            return (isVideoSampleStream) this.AudioAttributesCompatParcelizer.read(this, read[0]);
        }

        public final void read(final component11 component11Var, final IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(component11Var, "");
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.RemoteActionCompatParcelizer.setText(component11Var.write());
            this.AudioAttributesImplApi21Parcelizer.setText(component11Var.RemoteActionCompatParcelizer());
            this.write.setText(component11Var.read());
            CmcdHeadersFactoryCmcdSessionBuilder.read(this.IconCompatParcelizer, component11Var.IconCompatParcelizer(), false);
            View view = this.itemView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            bytesRead.IconCompatParcelizer(view, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.MarkVideoCompleteRequestBodyResult
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return BookmarkRequestBody.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer, component11Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, component11 component11Var) {
            iconCompatParcelizer.read(component11Var.AudioAttributesCompatParcelizer());
            return getShowPopup.INSTANCE;
        }
    }

    public static final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(RemoteActionCompatParcelizer.class, "binding", "getBinding()Lcom/marrow/databinding/LayoutFreeVideoListSectionBinding;", 0))};
        private final TextView IconCompatParcelizer;
        private final setSessionInfo read;

        public static final class IconCompatParcelizer implements getAnswerMap<RemoteActionCompatParcelizer, onNewExtractor> {
            /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.onNewExtractor] */
            @Override // kotlin.getAnswerMap
            public final /* synthetic */ onNewExtractor invoke(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return write(remoteActionCompatParcelizer);
            }

            private static onNewExtractor write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
                return onNewExtractor.write(remoteActionCompatParcelizer.itemView);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.read = new setOrigin(new IconCompatParcelizer());
            TextView textView = RemoteActionCompatParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            this.IconCompatParcelizer = textView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private onNewExtractor RemoteActionCompatParcelizer() {
            return (onNewExtractor) this.read.read(this, write[0]);
        }

        public final void read(component10 component10Var) {
            toMagicModuleMetaRepoModel.write(component10Var, "");
            this.IconCompatParcelizer.setText(component10Var.read());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_free_video_list_section, p0, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            return new RemoteActionCompatParcelizer(viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.layout_free_video_list_item, p0, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
        return new AudioAttributesCompatParcelizer(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof AudioAttributesCompatParcelizer) {
            AbstractC0202setMcqId abstractC0202setMcqId = this.IconCompatParcelizer.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0202setMcqId, "");
            ((AudioAttributesCompatParcelizer) p0).read((component11) abstractC0202setMcqId, this.write);
        } else if (p0 instanceof RemoteActionCompatParcelizer) {
            AbstractC0202setMcqId abstractC0202setMcqId2 = this.IconCompatParcelizer.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0202setMcqId2, "");
            ((RemoteActionCompatParcelizer) p0).read((component10) abstractC0202setMcqId2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        AbstractC0202setMcqId abstractC0202setMcqId = this.IconCompatParcelizer.get(p0);
        if (abstractC0202setMcqId instanceof component11) {
            return 2;
        }
        if (abstractC0202setMcqId instanceof component10) {
            return 1;
        }
        throw new RenewEligibleCreator();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void IconCompatParcelizer(List<? extends AbstractC0202setMcqId> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = p0;
    }
}

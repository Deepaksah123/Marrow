package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.ui.common.bookmark.BookmarkPopupWindow;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0239zzaf;
import kotlin.Metadata;
import kotlin.getLatestBitrateEstimate;
import kotlin.registerDeadlineEvent;

/* JADX INFO: renamed from: o.zzaf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 82\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u000289B;\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0016J\u001c\u0010)\u001a\u00020\u00072\n\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010(\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020\u000bH\u0016J,\u0010,\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0016J\u001a\u00101\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u00104\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0016\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR)\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006:"}, d2 = {"Lcom/marrow2/ui/pearl/adapter/PearlListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/marrow2/ui/pearl/adapter/PearlListAdapter$ViewHolder;", "Lcom/marrow2/ui/common/commonview/recyclerview/StickyHeaderInterface;", "onPearlSelect", "Lkotlin/Function1;", "", "", "onBookmarkUpdate", "Lkotlin/Function3;", "Lcom/marrow2/ui/pearl/model/SealedPearlListItem$Pearl;", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getOnPearlSelect", "()Lkotlin/jvm/functions/Function1;", "getOnBookmarkUpdate", "()Lkotlin/jvm/functions/Function3;", "list", "", "Lcom/marrow2/ui/pearl/model/SealedPearlListItem;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "isAllSubjectSelected", "", "()Z", "setAllSubjectSelected", "(Z)V", "highlightedPearlId", "getHighlightedPearlId", "()Ljava/lang/String;", "setHighlightedPearlId", "(Ljava/lang/String;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemViewType", "position", "onBindViewHolder", "holder", "getItemCount", "update", "getHeaderPositionForItem", "itemPosition", "getHeaderLayout", "headerPosition", "bindHeaderData", "header", "Landroid/view/View;", "isHeader", "checkAllOccurrenceAndUpdate", "pearlId", "bookmarkType", "Companion", "ViewHolder", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0239zzaf extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> implements lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private String AudioAttributesCompatParcelizer;
    private final getAnswerMap<String, getShowPopup> AudioAttributesImplBaseParcelizer;
    private final getModuleData<registerDeadlineEvent.RemoteActionCompatParcelizer, Integer, Integer, getShowPopup> IconCompatParcelizer;
    private boolean read;
    private List<? extends registerDeadlineEvent> write;

    @Override // kotlin.lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
    public final int read(int i) {
        return R.layout.layout_pearl_list_subject_title_revamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0239zzaf(getAnswerMap<? super String, getShowPopup> getanswermap, getModuleData<? super registerDeadlineEvent.RemoteActionCompatParcelizer, ? super Integer, ? super Integer, getShowPopup> getmoduledata) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getmoduledata, "");
        this.AudioAttributesImplBaseParcelizer = getanswermap;
        this.IconCompatParcelizer = getmoduledata;
        this.write = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer = "";
    }

    public final getAnswerMap<String, getShowPopup> write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final getModuleData<registerDeadlineEvent.RemoteActionCompatParcelizer, Integer, Integer, getShowPopup> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<registerDeadlineEvent> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.zzaf$RemoteActionCompatParcelizer */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzaf$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public AudioAttributesCompatParcelizer onCreateViewHolder(ViewGroup viewGroup, int i) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View rootView = LayoutInflater.from(viewGroup.getContext()).inflate(i == 0 ? R.layout.layout_pearl_list_subject_title_revamp : R.layout.view_type_pearl_list_item_revamp, viewGroup, false).getRootView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootView, "");
        return new AudioAttributesCompatParcelizer(this, rootView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int position) {
        return !(this.write.get(position) instanceof registerDeadlineEvent.write) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        audioAttributesCompatParcelizer.IconCompatParcelizer(this.write.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.write.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void AudioAttributesCompatParcelizer(C0239zzaf c0239zzaf, List list, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            list = c0239zzaf.write;
        }
        if ((i & 2) != 0) {
            str = c0239zzaf.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            z = c0239zzaf.read;
        }
        c0239zzaf.IconCompatParcelizer(list, str, z);
    }

    private void IconCompatParcelizer(List<? extends registerDeadlineEvent> list, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = list;
        this.AudioAttributesCompatParcelizer = str;
        this.read = z;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.zzaf$AudioAttributesCompatParcelizer */
    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ C0239zzaf write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(C0239zzaf c0239zzaf, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.write = c0239zzaf;
        }

        public final void IconCompatParcelizer(registerDeadlineEvent registerdeadlineevent) {
            toMagicModuleMetaRepoModel.write(registerdeadlineevent, "");
            if (registerdeadlineevent instanceof registerDeadlineEvent.write) {
                IconCompatParcelizer(((registerDeadlineEvent.write) registerdeadlineevent).RemoteActionCompatParcelizer());
            } else {
                if (!(registerdeadlineevent instanceof registerDeadlineEvent.RemoteActionCompatParcelizer)) {
                    throw new RenewEligibleCreator();
                }
                RemoteActionCompatParcelizer((registerDeadlineEvent.RemoteActionCompatParcelizer) registerdeadlineevent);
            }
        }

        private final void IconCompatParcelizer(String str) {
            ((TextView) this.itemView.findViewById(R.id.tvSubjectTitle)).setText(str);
        }

        private final void RemoteActionCompatParcelizer(final registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            String strIconCompatParcelizer;
            View viewFindViewById = this.itemView.findViewById(R.id.tvPearlContent);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.tvSubtitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            TextView textView2 = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(R.id.viewContinueIndicator);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            View viewFindViewById4 = this.itemView.findViewById(R.id.view_bookmarked);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            ImageView imageView = (ImageView) viewFindViewById4;
            final C0239zzaf c0239zzaf = this.write;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) remoteActionCompatParcelizer.read(), (Object) c0239zzaf.getAudioAttributesCompatParcelizer())) {
                bytesRead.AudioAttributesImplApi21Parcelizer(viewFindViewById3);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(viewFindViewById3);
            }
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() > 0) {
                imageView.setSelected(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() > 0);
                bytesToStringUppercase bytestostringuppercase = bytesToStringUppercase.INSTANCE;
                imageView.setImageResource(bytesToStringUppercase.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()));
            } else {
                imageView.setSelected(false);
                imageView.setImageResource(R.drawable.ic_un_bookmark);
            }
            textView.setText(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            if (c0239zzaf.getRead()) {
                String strIconCompatParcelizer2 = remoteActionCompatParcelizer.IconCompatParcelizer();
                String strWrite = remoteActionCompatParcelizer.write();
                StringBuilder sb = new StringBuilder();
                sb.append(strIconCompatParcelizer2);
                sb.append("  -  ");
                sb.append(strWrite);
                strIconCompatParcelizer = sb.toString();
            } else {
                strIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
            }
            textView2.setText(strIconCompatParcelizer);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.zzah
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0239zzaf.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(c0239zzaf, remoteActionCompatParcelizer);
                }
            });
            imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.zzag
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C0239zzaf.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, remoteActionCompatParcelizer, c0239zzaf, remoteActionCompatParcelizer, view);
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.zzai
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0239zzaf.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, c0239zzaf, remoteActionCompatParcelizer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(C0239zzaf c0239zzaf, registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            c0239zzaf.write().invoke(remoteActionCompatParcelizer.read());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, final registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, final C0239zzaf c0239zzaf, final registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Pair<Float, Float> pairAudioAttributesCompatParcelizer = ProjectionSubMesh.AudioAttributesCompatParcelizer(view);
            Context context = audioAttributesCompatParcelizer.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            new BookmarkPopupWindow(context, new getAnswerMap() { // from class: o.zzak
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return C0239zzaf.AudioAttributesCompatParcelizer.read(remoteActionCompatParcelizer, c0239zzaf, remoteActionCompatParcelizer2, ((Integer) obj).intValue());
                }
            }).write(pairAudioAttributesCompatParcelizer.write().floatValue(), pairAudioAttributesCompatParcelizer.IconCompatParcelizer().floatValue());
            getLatestBitrateEstimate.IconCompatParcelizer.write();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, C0239zzaf c0239zzaf, registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, int i) {
            int iMediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            c0239zzaf.read(remoteActionCompatParcelizer2.read(), i);
            c0239zzaf.IconCompatParcelizer().AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, Integer.valueOf(i), Integer.valueOf(iMediaBrowserCompatCustomActionResultReceiver));
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, C0239zzaf c0239zzaf, registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            int iMediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            int i = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() > 0 ? 0 : 1;
            c0239zzaf.read(remoteActionCompatParcelizer2.read(), i);
            c0239zzaf.IconCompatParcelizer().AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, Integer.valueOf(i), Integer.valueOf(iMediaBrowserCompatCustomActionResultReceiver));
        }
    }

    @Override // kotlin.lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
    public final int write(int i) {
        while (!RemoteActionCompatParcelizer(i)) {
            i--;
            if (i < 0) {
                return 0;
            }
        }
        return i;
    }

    @Override // kotlin.lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
    public final void RemoteActionCompatParcelizer(View view, int i) {
        if (view == null) {
            return;
        }
        registerDeadlineEvent registerdeadlineevent = this.write.get(i);
        if (registerdeadlineevent instanceof registerDeadlineEvent.write) {
            View viewFindViewById = view.findViewById(R.id.tvSubjectTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(viewFindViewById);
            ((TextView) view.findViewById(R.id.tvSubjectTitle)).setText(((registerDeadlineEvent.write) registerdeadlineevent).RemoteActionCompatParcelizer());
            return;
        }
        View viewFindViewById2 = view.findViewById(R.id.tvSubjectTitle);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(viewFindViewById2);
    }

    @Override // kotlin.lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
    public final boolean RemoteActionCompatParcelizer(int i) {
        return this.write.get(i) instanceof registerDeadlineEvent.write;
    }

    public final void read(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        List<? extends registerDeadlineEvent> list = this.write;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            registerDeadlineEvent registerdeadlineevent = (registerDeadlineEvent) obj;
            if (registerdeadlineevent instanceof registerDeadlineEvent.RemoteActionCompatParcelizer) {
                registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (registerDeadlineEvent.RemoteActionCompatParcelizer) registerdeadlineevent;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) remoteActionCompatParcelizer.read(), (Object) str)) {
                    remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
                    notifyItemChanged(i2);
                }
            }
            arrayList.add(getShowPopup.INSTANCE);
            i2++;
        }
    }
}

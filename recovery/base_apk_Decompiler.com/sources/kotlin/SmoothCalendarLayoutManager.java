package kotlin;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b$\u0010,"}, d2 = {"Lo/SmoothCalendarLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Lo/setSelection;", "", "p0", "Lo/readBlockToCache;", "p1", "Lo/setUpdatedStatus;", "", "p2", "Lkotlin/Function0;", "", "p3", "Lkotlin/Function2;", "p4", "Lkotlin/Function1;", "p5", "", "p6", "<init>", "(Ljava/lang/String;Lo/readBlockToCache;Lo/setUpdatedStatus;Lo/getCreatedOnDateMs;Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;)V", "Landroid/view/ViewGroup;", "write", "(Landroid/view/ViewGroup;)Lo/setSelection;", "getItemCount", "()I", "AudioAttributesCompatParcelizer", "(Lo/setSelection;I)V", "(Lo/setSelection;)V", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "read", "MediaBrowserCompatCustomActionResultReceiver", "Lo/readBlockToCache;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/getCreatedOnDateMs;", "Lo/MagicModuleSubmissionRequestBody;", "Lo/getAnswerMap;", "AudioAttributesImplBaseParcelizer", "", "Ljava/util/List;", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmoothCalendarLayoutManager extends RecyclerView.IconCompatParcelizer<setSelection> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<String, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<String, Boolean, getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final readBlockToCache write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<String> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<String, Integer, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public SmoothCalendarLayoutManager(String str, readBlockToCache readblocktocache, setUpdatedStatus<Integer> setupdatedstatus, getCreatedOnDateMs<getShowPopup> getcreatedondatems, MagicModuleSubmissionRequestBody<? super String, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super String, getShowPopup> getanswermap, MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        toMagicModuleMetaRepoModel.write(setupdatedstatus, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody2, "");
        this.read = str;
        this.write = readblocktocache;
        this.IconCompatParcelizer = setupdatedstatus;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        this.MediaBrowserCompatCustomActionResultReceiver = getanswermap;
        this.AudioAttributesImplBaseParcelizer = magicModuleSubmissionRequestBody2;
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return write(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onViewRecycled(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesCompatParcelizer((setSelection) onmediabuttonevent);
    }

    public final List<String> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private static setSelection write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        Context context = viewGroup.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(withPropertyNamingStrategy.IconCompatParcelizer.INSTANCE);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new setSelection(composeView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesImplApi26Parcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(setSelection p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.get(p1), this.read, p1, this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
    }

    private static void AudioAttributesCompatParcelizer(setSelection p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
    }
}

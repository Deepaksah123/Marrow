package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.List;
import kotlin.AbstractC0251zzar;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getUvm;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "Lo/getUvm$AudioAttributesCompatParcelizer;", "p0", "", "Lo/zzar;", "p1", "<init>", "(Lo/getUvm$AudioAttributesCompatParcelizer;Ljava/util/List;)V", "", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "getItemCount", "()I", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)V", "Lo/getUvm$AudioAttributesCompatParcelizer;", "write", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getUvm extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    public List<? extends AbstractC0251zzar> write;

    /* JADX INFO: loaded from: classes.dex */
    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(AbstractC0252zzas abstractC0252zzas);
    }

    private getUvm(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, List<? extends AbstractC0251zzar> list) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.write = list;
    }

    public /* synthetic */ getUvm(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(audioAttributesCompatParcelizer, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        AbstractC0251zzar abstractC0251zzar = this.write.get(p0);
        if (abstractC0251zzar instanceof AbstractC0251zzar.AudioAttributesImplBaseParcelizer) {
            return EnumC0247zzan.MediaBrowserCompatCustomActionResultReceiver.getRead();
        }
        if (abstractC0251zzar instanceof AbstractC0251zzar.MediaBrowserCompatItemReceiver) {
            return EnumC0247zzan.MediaBrowserCompatItemReceiver.getRead();
        }
        if (abstractC0251zzar instanceof AbstractC0251zzar.RemoteActionCompatParcelizer) {
            return EnumC0247zzan.write.getRead();
        }
        if (abstractC0251zzar instanceof AbstractC0251zzar.IconCompatParcelizer) {
            return EnumC0247zzan.RemoteActionCompatParcelizer.getRead();
        }
        if (abstractC0251zzar instanceof AbstractC0251zzar.MediaBrowserCompatCustomActionResultReceiver) {
            return EnumC0247zzan.AudioAttributesImplApi26Parcelizer.getRead();
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0251zzar, AbstractC0251zzar.read.INSTANCE)) {
            return EnumC0247zzan.IconCompatParcelizer.getRead();
        }
        if (abstractC0251zzar instanceof AbstractC0251zzar.AudioAttributesCompatParcelizer) {
            return EnumC0247zzan.AudioAttributesCompatParcelizer.getRead();
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0251zzar, AbstractC0251zzar.write.INSTANCE)) {
            return EnumC0247zzan.read.getRead();
        }
        throw new RenewEligibleCreator();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == EnumC0247zzan.MediaBrowserCompatCustomActionResultReceiver.getRead()) {
            getTrackTypeScore gettracktypescoreIconCompatParcelizer = getTrackTypeScore.IconCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettracktypescoreIconCompatParcelizer, "");
            return new C0249zzap(gettracktypescoreIconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.MediaBrowserCompatItemReceiver.getRead()) {
            createTrackGroupArrayWithDrmInfo createtrackgrouparraywithdrminfoIconCompatParcelizer = createTrackGroupArrayWithDrmInfo.IconCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createtrackgrouparraywithdrminfoIconCompatParcelizer, "");
            return new setMatcherProtectionType(createtrackgrouparraywithdrminfoIconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.write.getRead()) {
            HlsSampleStreamWrapperExternalSyntheticLambda0 hlsSampleStreamWrapperExternalSyntheticLambda0RemoteActionCompatParcelizer = HlsSampleStreamWrapperExternalSyntheticLambda0.RemoteActionCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamWrapperExternalSyntheticLambda0RemoteActionCompatParcelizer, "");
            return new UvmEntriesBuilder(hlsSampleStreamWrapperExternalSyntheticLambda0RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.RemoteActionCompatParcelizer.getRead()) {
            buildTracksFromSampleStreams buildtracksfromsamplestreamsRemoteActionCompatParcelizer = buildTracksFromSampleStreams.RemoteActionCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buildtracksfromsamplestreamsRemoteActionCompatParcelizer, "");
            return new UserVerificationMethods(buildtracksfromsamplestreamsRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.IconCompatParcelizer.getRead()) {
            canDiscardUpstreamMediaChunksFromIndex candiscardupstreammediachunksfromindexIconCompatParcelizer = canDiscardUpstreamMediaChunksFromIndex.IconCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(candiscardupstreammediachunksfromindexIconCompatParcelizer, "");
            return new UserVerificationMethodExtension(candiscardupstreammediachunksfromindexIconCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.AudioAttributesImplApi26Parcelizer.getRead()) {
            hasValidSampleQueueIndex hasvalidsamplequeueindexWrite = hasValidSampleQueueIndex.write(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hasvalidsamplequeueindexWrite, "");
            return new setUserVerificationMethod(hasvalidsamplequeueindexWrite, this.AudioAttributesCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.AudioAttributesCompatParcelizer.getRead()) {
            createFakeTrackOutput createfaketrackoutputRemoteActionCompatParcelizer = createFakeTrackOutput.RemoteActionCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createfaketrackoutputRemoteActionCompatParcelizer, "");
            return new setKeyProtectionType(createfaketrackoutputRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        if (p1 == EnumC0247zzan.read.getRead()) {
            createSampleQueue createsamplequeueIconCompatParcelizer = createSampleQueue.IconCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createsamplequeueIconCompatParcelizer, "");
            return new UvmEntry(createsamplequeueIconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_common_card_empty, p0, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new ApiApiOptionsHasAccountOptions(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.write.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int itemViewType = getItemViewType(p1);
        if (itemViewType == EnumC0247zzan.MediaBrowserCompatCustomActionResultReceiver.getRead()) {
            AbstractC0251zzar abstractC0251zzar = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0251zzar, "");
            ((C0249zzap) p0).AudioAttributesCompatParcelizer((AbstractC0251zzar.AudioAttributesImplBaseParcelizer) abstractC0251zzar);
            return;
        }
        if (itemViewType == EnumC0247zzan.MediaBrowserCompatItemReceiver.getRead()) {
            AbstractC0251zzar abstractC0251zzar2 = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0251zzar2, "");
            ((setMatcherProtectionType) p0).AudioAttributesCompatParcelizer((AbstractC0251zzar.MediaBrowserCompatItemReceiver) abstractC0251zzar2);
            return;
        }
        if (itemViewType == EnumC0247zzan.write.getRead()) {
            AbstractC0251zzar abstractC0251zzar3 = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0251zzar3, "");
            ((UvmEntriesBuilder) p0).read((AbstractC0251zzar.RemoteActionCompatParcelizer) abstractC0251zzar3);
            return;
        }
        if (itemViewType == EnumC0247zzan.RemoteActionCompatParcelizer.getRead()) {
            AbstractC0251zzar abstractC0251zzar4 = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0251zzar4, "");
            ((UserVerificationMethods) p0).read((AbstractC0251zzar.IconCompatParcelizer) abstractC0251zzar4);
            return;
        }
        if (itemViewType == EnumC0247zzan.IconCompatParcelizer.getRead()) {
            return;
        }
        if (itemViewType == EnumC0247zzan.AudioAttributesImplApi26Parcelizer.getRead()) {
            AbstractC0251zzar abstractC0251zzar5 = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0251zzar5, "");
            ((setUserVerificationMethod) p0).read((AbstractC0251zzar.MediaBrowserCompatCustomActionResultReceiver) abstractC0251zzar5);
        } else if (itemViewType == EnumC0247zzan.AudioAttributesCompatParcelizer.getRead()) {
            AbstractC0251zzar abstractC0251zzar6 = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(abstractC0251zzar6, "");
            ((setKeyProtectionType) p0).write((AbstractC0251zzar.AudioAttributesCompatParcelizer) abstractC0251zzar6);
        } else if (itemViewType == EnumC0247zzan.read.getRead()) {
            ((UvmEntry) p0).read();
        }
    }

    public final void AudioAttributesCompatParcelizer(List<? extends AbstractC0251zzar> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = p0;
        notifyDataSetChanged();
    }
}

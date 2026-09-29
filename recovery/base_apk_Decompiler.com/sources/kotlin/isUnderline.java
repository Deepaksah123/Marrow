package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.ui.activities.learn.video.overlay.NavKey;
import com.marrow.ui.activities.learn.video.overlay.SettingsItem;
import com.marrow.ui.activities.learn.video.overlay.ToggleKey;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.isUnderline;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f\u001d$BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#"}, d2 = {"Lo/isUnderline;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "p0", "Lkotlin/Function2;", "Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "", "", "p1", "Lkotlin/Function1;", "Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "p2", "<init>", "(Ljava/util/List;Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;)V", "", "", "getItemId", "(I)J", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemCount", "()I", "RemoteActionCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "write", "Lo/getAnswerMap;", "read", "", "Ljava/util/List;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isUnderline extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {
    private final MagicModuleSubmissionRequestBody<ToggleKey, Boolean, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<SettingsItem> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<NavKey, getShowPopup> read;

    /* JADX WARN: Multi-variable type inference failed */
    public isUnderline(List<? extends SettingsItem> list, MagicModuleSubmissionRequestBody<? super ToggleKey, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super NavKey, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        this.read = getanswermap;
        this.write = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final long getItemId(int p0) {
        int iHashCode;
        SettingsItem settingsItem = this.write.get(p0);
        if (settingsItem instanceof SettingsItem.Nav) {
            iHashCode = ((SettingsItem.Nav) settingsItem).getRemoteActionCompatParcelizer().hashCode();
        } else {
            if (!(settingsItem instanceof SettingsItem.Toggle)) {
                throw new RenewEligibleCreator();
            }
            iHashCode = ((SettingsItem.Toggle) settingsItem).getWrite().hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        SettingsItem settingsItem = this.write.get(p0);
        if (settingsItem instanceof SettingsItem.Nav) {
            return 1;
        }
        if (settingsItem instanceof SettingsItem.Toggle) {
            return 2;
        }
        throw new RenewEligibleCreator();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == 2) {
            unbindSampleQueue unbindsamplequeue = unbindSampleQueue.read(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(unbindsamplequeue, "");
            return new write(unbindsamplequeue, this.RemoteActionCompatParcelizer);
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapperRemoteActionCompatParcelizer = HlsSampleStreamWrapper.RemoteActionCompatParcelizer(layoutInflaterFrom, p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamWrapperRemoteActionCompatParcelizer, "");
        return new RemoteActionCompatParcelizer(hlsSampleStreamWrapperRemoteActionCompatParcelizer, this.read);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof write) {
            SettingsItem settingsItem = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(settingsItem, "");
            ((write) p0).IconCompatParcelizer((SettingsItem.Toggle) settingsItem);
        } else if (p0 instanceof RemoteActionCompatParcelizer) {
            SettingsItem settingsItem2 = this.write.get(p1);
            toMagicModuleMetaRepoModel.read(settingsItem2, "");
            ((RemoteActionCompatParcelizer) p0).write((SettingsItem.Nav) settingsItem2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.write.size();
    }

    static final class write extends RecyclerView.onMediaButtonEvent {
        private final MagicModuleSubmissionRequestBody<ToggleKey, Boolean, getShowPopup> RemoteActionCompatParcelizer;
        private final unbindSampleQueue read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public write(unbindSampleQueue unbindsamplequeue, MagicModuleSubmissionRequestBody<? super ToggleKey, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody) {
            super(unbindsamplequeue.write);
            toMagicModuleMetaRepoModel.write(unbindsamplequeue, "");
            toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
            this.read = unbindsamplequeue;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        public final void IconCompatParcelizer(final SettingsItem.Toggle toggle) {
            toMagicModuleMetaRepoModel.write(toggle, "");
            this.read.read.setText(toggle.getIconCompatParcelizer());
            this.read.RemoteActionCompatParcelizer.setOnCheckedChangeListener(null);
            this.read.RemoteActionCompatParcelizer.setChecked(toggle.getRead());
            this.read.RemoteActionCompatParcelizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.hasFontColor
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    isUnderline.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, toggle, z);
                }
            });
            this.read.write.setOnClickListener(new View.OnClickListener() { // from class: o.isLinethrough
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isUnderline.write.IconCompatParcelizer(this.IconCompatParcelizer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(write writeVar, SettingsItem.Toggle toggle, boolean z) {
            writeVar.RemoteActionCompatParcelizer.invoke(toggle.getWrite(), Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(write writeVar) {
            writeVar.read.RemoteActionCompatParcelizer.toggle();
        }
    }

    static final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final getAnswerMap<NavKey, getShowPopup> IconCompatParcelizer;
        private final HlsSampleStreamWrapper write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer(HlsSampleStreamWrapper hlsSampleStreamWrapper, getAnswerMap<? super NavKey, getShowPopup> getanswermap) {
            super(hlsSampleStreamWrapper.read);
            toMagicModuleMetaRepoModel.write(hlsSampleStreamWrapper, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            this.write = hlsSampleStreamWrapper;
            this.IconCompatParcelizer = getanswermap;
        }

        public final void write(final SettingsItem.Nav nav) {
            toMagicModuleMetaRepoModel.write(nav, "");
            this.write.AudioAttributesCompatParcelizer.setText(nav.getIconCompatParcelizer());
            this.write.IconCompatParcelizer.setText(nav.getWrite());
            this.write.read.setOnClickListener(new View.OnClickListener() { // from class: o.hasBackgroundColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isUnderline.RemoteActionCompatParcelizer.write(this.RemoteActionCompatParcelizer, nav);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, SettingsItem.Nav nav) {
            remoteActionCompatParcelizer.IconCompatParcelizer.invoke(nav.getRemoteActionCompatParcelizer());
        }
    }
}

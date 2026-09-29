package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00192\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\f\u0019\u0017B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001a"}, d2 = {"Lo/writePendingIntent;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Lo/writePendingIntent$IconCompatParcelizer;", "Landroid/content/Context;", "p0", "Lo/writePendingIntent$RemoteActionCompatParcelizer;", "p1", "<init>", "(Landroid/content/Context;Lo/writePendingIntent$RemoteActionCompatParcelizer;)V", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "", "IconCompatParcelizer", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "(Landroid/view/ViewGroup;)Lo/writePendingIntent$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/writePendingIntent$IconCompatParcelizer;I)V", "getItemCount", "()I", "write", "Landroid/content/Context;", "RemoteActionCompatParcelizer", "Lo/writePendingIntent$RemoteActionCompatParcelizer;", "read", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writePendingIntent extends RecyclerView.IconCompatParcelizer<IconCompatParcelizer> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private List<UserBasicDetails> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Context AudioAttributesCompatParcelizer;

    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer(int i);
    }

    public writePendingIntent(Context context, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = context;
        this.read = remoteActionCompatParcelizer;
        this.write = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    public final void IconCompatParcelizer(List<UserBasicDetails> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = p0;
        notifyDataSetChanged();
    }

    private IconCompatParcelizer IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_linked_accounts, viewGroup, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        return new IconCompatParcelizer(this, viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(IconCompatParcelizer p0, final int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        UserBasicDetails userBasicDetails = this.write.get(p1);
        String firstName = userBasicDetails.getFirstName();
        String lastName = userBasicDetails.getLastName();
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        p0.IconCompatParcelizer(sb.toString(), userBasicDetails.getEmail(), userBasicDetails.getSubscriptions(), loadBitmap.RemoteActionCompatParcelizer(userBasicDetails.getCreatedOn(), "dd MMM yyyy"));
        p0.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.writeShort
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                writePendingIntent.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(writePendingIntent writependingintent, int i) {
        writependingintent.read.RemoteActionCompatParcelizer(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.write.size();
    }

    public final class IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ writePendingIntent AudioAttributesCompatParcelizer;
        private final TextView AudioAttributesImplApi21Parcelizer;
        private final TextView IconCompatParcelizer;
        private final TextView MediaBrowserCompatItemReceiver;
        private final LinearLayout RemoteActionCompatParcelizer;
        private final TextView read;
        private final TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(writePendingIntent writependingintent, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesCompatParcelizer = writependingintent;
            View viewFindViewById = view.findViewById(R.id.tvUserName);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.MediaBrowserCompatItemReceiver = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tvUserEmail);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.AudioAttributesImplApi21Parcelizer = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tvPlanInfo);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.IconCompatParcelizer = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tvFreePlanText);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.read = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.llPlanContainerView);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.RemoteActionCompatParcelizer = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.tvCreatedOn);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            this.write = (TextView) viewFindViewById6;
        }

        public final void IconCompatParcelizer(String str, String str2, List<String> list, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.MediaBrowserCompatItemReceiver.setText(str);
            this.AudioAttributesImplApi21Parcelizer.setText(str2);
            this.write.setText(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getString(R.string.text_created_on, str3));
            List<String> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
                this.IconCompatParcelizer.setText(RemoteActionCompatParcelizer(list).toString());
            } else {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.read);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        }

        private final StringBuilder RemoteActionCompatParcelizer(List<String> list) {
            StringBuilder sb = new StringBuilder("");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = list.get(i);
                if (TestGroupLSModel.read("mcq", str, true)) {
                    sb.append(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getString(R.string.text_plan_q_bank));
                } else if (TestGroupLSModel.read("test", str, true)) {
                    sb.append(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getString(R.string.text_plan_test_series));
                } else if (TestGroupLSModel.read("video", str, true)) {
                    sb.append(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getString(R.string.text_plan_videos));
                }
                if (i != list.size() - 1 && sb.length() > 0) {
                    sb.append(" + ");
                }
            }
            return sb;
        }
    }
}

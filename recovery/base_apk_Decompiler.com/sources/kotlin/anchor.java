package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.data.user.remote.model.CourseModelV3;
import java.util.ArrayList;
import java.util.List;
import kotlin.anchor;

/* JADX INFO: loaded from: classes4.dex */
public final class anchor extends RecyclerView.IconCompatParcelizer<write> {
    private List<CourseModelV3> IconCompatParcelizer;
    private Integer RemoteActionCompatParcelizer;
    private final getAnswerMap<CourseModelV3, getShowPopup> read;

    /* JADX WARN: Multi-variable type inference failed */
    public anchor(getAnswerMap<? super CourseModelV3, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.read = getanswermap;
        this.IconCompatParcelizer = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer(viewGroup);
    }

    private write RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_onboarding_single_edition, viewGroup, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        return new write(this, viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        boolean z = false;
        if (i > 0 && this.IconCompatParcelizer.get(i).getCourseSection() != this.IconCompatParcelizer.get(i - 1).getCourseSection()) {
            z = true;
        }
        writeVar.RemoteActionCompatParcelizer(this.IconCompatParcelizer.get(i), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }

    public class write extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private final TextView IconCompatParcelizer;
        private /* synthetic */ anchor RemoteActionCompatParcelizer;
        private final RadioButton read;
        private final View write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(anchor anchorVar, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.RemoteActionCompatParcelizer = anchorVar;
            this.read = (RadioButton) view.findViewById(R.id.radio);
            this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(R.id.subtext);
            this.IconCompatParcelizer = (TextView) view.findViewById(R.id.title);
            this.write = view.findViewById(R.id.divider);
        }

        public final void RemoteActionCompatParcelizer(final CourseModelV3 courseModelV3, boolean z) {
            toMagicModuleMetaRepoModel.write(courseModelV3, "");
            View view = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            boolean z2 = false;
            view.setVisibility(z ? 0 : 8);
            this.IconCompatParcelizer.setText(courseModelV3.getTitle());
            if (courseModelV3.getSubTitle().length() == 0) {
                TextView textView = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
            } else {
                this.AudioAttributesCompatParcelizer.setText(courseModelV3.getSubTitle());
                TextView textView2 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
            }
            RadioButton radioButton = this.read;
            int i = Integer.parseInt(courseModelV3.getCourseId());
            Integer num = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            if (num != null && i == num.intValue()) {
                z2 = true;
            }
            radioButton.setChecked(z2);
            View view2 = this.itemView;
            final anchor anchorVar = this.RemoteActionCompatParcelizer;
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.IndoorLevel
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    anchor.write.IconCompatParcelizer(anchorVar, courseModelV3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(anchor anchorVar, CourseModelV3 courseModelV3) {
            anchorVar.RemoteActionCompatParcelizer = Integer.valueOf(Integer.parseInt(courseModelV3.getCourseId()));
            anchorVar.RemoteActionCompatParcelizer(courseModelV3);
        }
    }

    public final void IconCompatParcelizer(List<CourseModelV3> list, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = Integer.valueOf(i);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(CourseModelV3 courseModelV3) {
        notifyDataSetChanged();
        this.read.invoke(courseModelV3);
    }
}

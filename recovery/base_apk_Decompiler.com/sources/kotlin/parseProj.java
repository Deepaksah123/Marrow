package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.data.user.remote.model.EditionsModelV3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.parseProj;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"\u001f'B5\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0016\u0010\u001bJ+\u0010\u001d\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%"}, d2 = {"Lo/parseProj;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "Lkotlin/Function2;", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "", "", "p0", "Lkotlin/Function1;", "p1", "<init>", "(Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;)V", "Landroid/view/ViewGroup;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Landroid/view/View;", "RemoteActionCompatParcelizer", "(Landroid/view/View;Lcom/marrow2/data/user/remote/model/CourseModelV3;)V", "Landroid/widget/TextView;", "", "p2", "(Landroid/widget/TextView;Landroid/view/View;Z)V", "", "IconCompatParcelizer", "(Ljava/util/List;II)V", "read", "(Lcom/marrow2/data/user/remote/model/CourseModelV3;I)V", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "Ljava/util/List;", "Ljava/lang/Integer;", "AudioAttributesImplApi26Parcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseProj extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<CourseModelV3> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Integer write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Integer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<CourseModelV3, Integer, getShowPopup> AudioAttributesCompatParcelizer;
    private final getAnswerMap<CourseModelV3, getShowPopup> read;

    /* JADX WARN: Multi-variable type inference failed */
    public parseProj(MagicModuleSubmissionRequestBody<? super CourseModelV3, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super CourseModelV3, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        this.read = getanswermap;
        this.IconCompatParcelizer = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_course_switch_multi_edition, p0, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new read(this, viewInflate);
        }
        if (p1 == 2) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.layout_course_switch_single_edition, p0, false);
            toMagicModuleMetaRepoModel.write(viewInflate2);
            return new AudioAttributesCompatParcelizer(this, viewInflate2);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        CourseModelV3 courseModelV3 = this.IconCompatParcelizer.get(p1);
        int itemViewType = p0.getItemViewType();
        if (itemViewType == 1) {
            ((read) p0).write(courseModelV3);
        } else {
            if (itemViewType != 2) {
                return;
            }
            ((AudioAttributesCompatParcelizer) p0).write(courseModelV3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.IconCompatParcelizer.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        List<EditionsModelV3> editions = this.IconCompatParcelizer.get(p0).getEditions();
        return (editions == null || editions.isEmpty()) ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r1.isEmpty() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(android.view.View r3, final com.marrow2.data.user.remote.model.CourseModelV3 r4) {
        /*
            r2 = this;
            com.marrow2.data.user.remote.model.LearnMoreModelV3 r0 = r4.getLearnMore()
            if (r0 == 0) goto L3d
            com.marrow2.data.user.remote.model.LearnMoreModelV3 r0 = r4.getLearnMore()
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getIntroPara()
            goto L13
        L12:
            r0 = r1
        L13:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L1d
            int r0 = r0.length()
            if (r0 != 0) goto L31
        L1d:
            com.marrow2.data.user.remote.model.LearnMoreModelV3 r0 = r4.getLearnMore()
            if (r0 == 0) goto L27
            java.util.ArrayList r1 = r0.getCourseComponents()
        L27:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L3d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L3d
        L31:
            kotlin.bytesRead.AudioAttributesImplApi21Parcelizer(r3)
            o.isProj r0 = new o.isProj
            r0.<init>()
            r3.setOnClickListener(r0)
            return
        L3d:
            kotlin.bytesRead.MediaBrowserCompatCustomActionResultReceiver(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseProj.RemoteActionCompatParcelizer(android.view.View, com.marrow2.data.user.remote.model.CourseModelV3):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(parseProj parseproj, CourseModelV3 courseModelV3) {
        parseproj.read.invoke(courseModelV3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(TextView p0, View p1, boolean p2) {
        TextView textView = p0;
        if (p2) {
            bytesRead.AudioAttributesImplApi21Parcelizer(textView);
        } else {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        }
        p1.setPadding(p1.getPaddingLeft(), p2 ? p1.getResources().getDimensionPixelSize(R.dimen.margin_10dp) : 0, p1.getPaddingRight(), p1.getPaddingBottom());
    }

    public class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private final TextView AudioAttributesImplBaseParcelizer;
        private final RadioButton IconCompatParcelizer;
        private final TextView RemoteActionCompatParcelizer;
        private /* synthetic */ parseProj read;
        private final View write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(parseProj parseproj, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.read = parseproj;
            this.IconCompatParcelizer = (RadioButton) view.findViewById(R.id.radio);
            this.AudioAttributesImplBaseParcelizer = (TextView) view.findViewById(R.id.title);
            this.RemoteActionCompatParcelizer = (TextView) view.findViewById(R.id.subtext);
            this.write = view.findViewById(R.id.info);
            this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(R.id.newTag);
        }

        public final void write(final CourseModelV3 courseModelV3) {
            toMagicModuleMetaRepoModel.write(courseModelV3, "");
            this.AudioAttributesImplBaseParcelizer.setText(courseModelV3.getTitle());
            TextView textView = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            View view = this.itemView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            parseProj.RemoteActionCompatParcelizer(textView, view, courseModelV3.isNew());
            parseProj parseproj = this.read;
            View view2 = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            parseproj.RemoteActionCompatParcelizer(view2, courseModelV3);
            if (courseModelV3.getSubTitle().length() == 0) {
                TextView textView2 = this.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
            } else {
                this.RemoteActionCompatParcelizer.setText(courseModelV3.getSubTitle());
                TextView textView3 = this.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
            }
            RadioButton radioButton = this.IconCompatParcelizer;
            int i = Integer.parseInt(courseModelV3.getCourseId());
            Integer num = this.read.RemoteActionCompatParcelizer;
            radioButton.setChecked(num != null && i == num.intValue());
            View view3 = this.itemView;
            final parseProj parseproj2 = this.read;
            view3.setOnClickListener(new View.OnClickListener() { // from class: o.parseMesh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    parseProj.AudioAttributesCompatParcelizer.IconCompatParcelizer(parseproj2, courseModelV3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(parseProj parseproj, CourseModelV3 courseModelV3) {
            parseproj.RemoteActionCompatParcelizer = Integer.valueOf(Integer.parseInt(courseModelV3.getCourseId()));
            parseproj.write = 0;
            parseproj.read(courseModelV3, 0);
        }
    }

    public final void IconCompatParcelizer(List<CourseModelV3> p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = p0;
        this.RemoteActionCompatParcelizer = Integer.valueOf(p1);
        this.write = Integer.valueOf(p2);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(CourseModelV3 p0, int p1) {
        notifyDataSetChanged();
        this.AudioAttributesCompatParcelizer.invoke(p0, Integer.valueOf(p1));
    }

    public class read extends RecyclerView.onMediaButtonEvent {
        private final View AudioAttributesCompatParcelizer;
        private final TextView IconCompatParcelizer;
        private /* synthetic */ parseProj MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private final LinearLayout read;
        private final TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(parseProj parseproj, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.MediaBrowserCompatCustomActionResultReceiver = parseproj;
            this.write = (TextView) view.findViewById(R.id.heading);
            this.read = (LinearLayout) view.findViewById(R.id.radioGroup);
            this.AudioAttributesCompatParcelizer = view.findViewById(R.id.info);
            this.IconCompatParcelizer = (TextView) view.findViewById(R.id.newTag);
            this.RemoteActionCompatParcelizer = R.layout.item_edition;
        }

        public final void write(final CourseModelV3 courseModelV3) {
            toMagicModuleMetaRepoModel.write(courseModelV3, "");
            this.write.setText(courseModelV3.getTitle());
            TextView textView = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            View view = this.itemView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            parseProj.RemoteActionCompatParcelizer(textView, view, courseModelV3.isNew());
            parseProj parseproj = this.MediaBrowserCompatCustomActionResultReceiver;
            View view2 = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            parseproj.RemoteActionCompatParcelizer(view2, courseModelV3);
            this.read.removeAllViews();
            List<EditionsModelV3> editions = courseModelV3.getEditions();
            if (editions != null) {
                final parseProj parseproj2 = this.MediaBrowserCompatCustomActionResultReceiver;
                for (final EditionsModelV3 editionsModelV3 : editions) {
                    boolean z = false;
                    View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(this.RemoteActionCompatParcelizer, (ViewGroup) this.read, false);
                    View viewFindViewById = viewInflate.findViewById(R.id.info);
                    RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.radio);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.subtext);
                    ((TextView) viewInflate.findViewById(R.id.title)).setText(editionsModelV3.getTitle());
                    toMagicModuleMetaRepoModel.write(viewFindViewById);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(viewFindViewById);
                    String subtitle = editionsModelV3.getSubtitle();
                    if (subtitle == null || subtitle.length() == 0) {
                        toMagicModuleMetaRepoModel.write(textView2);
                        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
                    } else {
                        textView2.setText(editionsModelV3.getSubtitle());
                        toMagicModuleMetaRepoModel.write(textView2);
                        bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
                    }
                    int i = Integer.parseInt(courseModelV3.getCourseId());
                    Integer num = parseproj2.RemoteActionCompatParcelizer;
                    if (num != null && i == num.intValue() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(editionsModelV3.getId(), parseproj2.write)) {
                        z = true;
                    }
                    radioButton.setChecked(z);
                    viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.decodeZigZag
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            parseProj.read.IconCompatParcelizer(parseproj2, courseModelV3, editionsModelV3);
                        }
                    });
                    this.read.addView(viewInflate);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(parseProj parseproj, CourseModelV3 courseModelV3, EditionsModelV3 editionsModelV3) {
            parseproj.RemoteActionCompatParcelizer = Integer.valueOf(Integer.parseInt(courseModelV3.getCourseId()));
            parseproj.write = editionsModelV3.getId();
            Integer id = editionsModelV3.getId();
            toMagicModuleMetaRepoModel.write(id);
            parseproj.read(courseModelV3, id.intValue());
        }
    }
}

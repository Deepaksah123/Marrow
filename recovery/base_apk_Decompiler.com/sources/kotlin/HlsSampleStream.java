package kotlin;

import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStream implements getApplicationLabel {
    public static int AudioAttributesImplApi26Parcelizer;
    public static int MediaBrowserCompatCustomActionResultReceiver;
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final RecyclerView IconCompatParcelizer;
    public final TextView MediaBrowserCompatItemReceiver;
    private final CardView MediaBrowserCompatMediaItem;
    private LinearLayout MediaDescriptionCompat;
    private TextView MediaMetadataCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private HlsSampleStream(CardView cardView, ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2, TextView textView4, TextView textView5, TextView textView6) {
        this.MediaBrowserCompatMediaItem = cardView;
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.MediaDescriptionCompat = linearLayout;
        this.IconCompatParcelizer = recyclerView;
        this.read = textView;
        this.write = textView2;
        this.MediaMetadataCompat = textView3;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.MediaBrowserCompatItemReceiver = textView4;
        this.AudioAttributesImplBaseParcelizer = textView5;
        this.AudioAttributesImplApi21Parcelizer = textView6;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static HlsSampleStream RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.item_recent_update1, viewGroup, false));
    }

    private static HlsSampleStream IconCompatParcelizer(View view) {
        int i = R.id.cl_recent_update;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.cl_recent_update);
        if (constraintLayout != null) {
            i = R.id.ll_content;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_content);
            if (linearLayout != null) {
                i = R.id.rv_tags;
                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_tags);
                if (recyclerView != null) {
                    i = R.id.tv_answer;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_answer);
                    if (textView != null) {
                        i = R.id.tv_date;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_date);
                        if (textView2 != null) {
                            i = R.id.tv_divider;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_divider);
                            if (textView3 != null) {
                                i = R.id.tv_label_ref_ll;
                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_label_ref_ll);
                                if (linearLayout2 != null) {
                                    i = R.id.tv_question;
                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_question);
                                    if (textView4 != null) {
                                        i = R.id.tv_reference;
                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_reference);
                                        if (textView5 != null) {
                                            i = R.id.tv_subject;
                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_subject);
                                            if (textView6 != null) {
                                                return new HlsSampleStream((CardView) view, constraintLayout, linearLayout, recyclerView, textView, textView2, textView3, linearLayout2, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static int write() {
        int i = MediaBrowserCompatCustomActionResultReceiver;
        int i2 = i % 7159924;
        MediaBrowserCompatCustomActionResultReceiver = i + 1;
        if (i2 != 0) {
            return AudioAttributesImplApi26Parcelizer;
        }
        int iMyUid = Process.myUid();
        AudioAttributesImplApi26Parcelizer = iMyUid;
        return iMyUid;
    }
}

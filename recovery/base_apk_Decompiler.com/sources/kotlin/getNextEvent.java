package kotlin;

import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import kotlin.skipComment;

/* JADX INFO: loaded from: classes3.dex */
public class getNextEvent extends skipInput<skipComment.RemoteActionCompatParcelizer, repositionVerticalCue<skipComment.RemoteActionCompatParcelizer>> implements lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher {
    public getNextEvent(skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(remoteActionCompatParcelizer);
    }

    @Override // kotlin.skipInput
    public final repositionVerticalCue<skipComment.RemoteActionCompatParcelizer> read(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return createFromCaptionStyleV19.AudioAttributesCompatParcelizer(viewGroup, (skipComment.RemoteActionCompatParcelizer) this.read);
            case 2:
            case 3:
            case 4:
                return DefaultMediaDescriptionAdapter.read(viewGroup, (skipComment.RemoteActionCompatParcelizer) this.read);
            case 5:
                return CaptionStyleCompatEdgeType.IconCompatParcelizer(viewGroup, (skipComment.RemoteActionCompatParcelizer) this.read);
            case 6:
                return getCurrentContentText.AudioAttributesCompatParcelizer(viewGroup, (skipComment.RemoteActionCompatParcelizer) this.read);
            case 7:
                return createFromCaptionStyleV21.write(viewGroup, (skipComment.RemoteActionCompatParcelizer) this.read);
            default:
                return null;
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
    public final int read(int i) {
        if (((skipComment.RemoteActionCompatParcelizer) this.read).AudioAttributesCompatParcelizer(i) == 1) {
            return R.layout.layout_lesson_list_subject_title;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
    public final void RemoteActionCompatParcelizer(View view, int i) {
        if (((skipComment.RemoteActionCompatParcelizer) this.read).write(i).item instanceof String) {
            ((CustomTextView) view.findViewById(R.id.tvSubjectTitle)).setText((String) ((skipComment.RemoteActionCompatParcelizer) this.read).write(i).item);
        }
    }

    @Override // kotlin.lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
    public final boolean RemoteActionCompatParcelizer(int i) {
        return ((skipComment.RemoteActionCompatParcelizer) this.read).AudioAttributesCompatParcelizer(i) == 1 || ((skipComment.RemoteActionCompatParcelizer) this.read).AudioAttributesCompatParcelizer(i) == 5 || ((skipComment.RemoteActionCompatParcelizer) this.read).AudioAttributesCompatParcelizer(i) == 6 || ((skipComment.RemoteActionCompatParcelizer) this.read).AudioAttributesCompatParcelizer(i) == 7;
    }
}

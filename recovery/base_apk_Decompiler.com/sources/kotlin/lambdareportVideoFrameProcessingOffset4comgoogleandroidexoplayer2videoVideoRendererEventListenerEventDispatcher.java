package kotlin;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdareportVideoFrameProcessingOffset4comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher extends RecyclerView.AudioAttributesImplBaseParcelizer {
    private int AudioAttributesCompatParcelizer;
    private final lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher read;

    public lambdareportVideoFrameProcessingOffset4comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher(lambdavideoSizeChanged5comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher lambdavideosizechanged5comgoogleandroidexoplayer2videovideorenderereventlistenereventdispatcher) {
        toMagicModuleMetaRepoModel.write(lambdavideosizechanged5comgoogleandroidexoplayer2videovideorenderereventlistenereventdispatcher, "");
        this.read = lambdavideosizechanged5comgoogleandroidexoplayer2videovideorenderereventlistenereventdispatcher;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void AudioAttributesCompatParcelizer(Canvas canvas, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        int iWrite;
        View viewAudioAttributesCompatParcelizer;
        int iMediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.write(canvas, "");
        toMagicModuleMetaRepoModel.write(recyclerView, "");
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        super.AudioAttributesCompatParcelizer(canvas, recyclerView, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
        int iMediaBrowserCompatItemReceiver2 = ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver2 == -1 || (viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((iWrite = this.read.write(iMediaBrowserCompatItemReceiver2)), recyclerView, recyclerView.getContext().getResources().getBoolean(R.bool.is_tablet))) == null) {
            return;
        }
        IconCompatParcelizer(recyclerView, viewAudioAttributesCompatParcelizer);
        View viewAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(recyclerView, viewAudioAttributesCompatParcelizer.getBottom(), iWrite);
        if (viewAudioAttributesCompatParcelizer2 != null && (iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(viewAudioAttributesCompatParcelizer2)) >= 0 && this.read.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver)) {
            read(canvas, viewAudioAttributesCompatParcelizer, viewAudioAttributesCompatParcelizer2);
        } else {
            AudioAttributesCompatParcelizer(canvas, viewAudioAttributesCompatParcelizer);
        }
    }

    private final View AudioAttributesCompatParcelizer(int i, RecyclerView recyclerView, boolean z) {
        int i2 = this.read.read(i);
        if (i2 < 0) {
            return null;
        }
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(i2, (ViewGroup) recyclerView, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        this.read.RemoteActionCompatParcelizer(viewInflate, i);
        if (z) {
            Context context = recyclerView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(context, viewInflate);
        }
        return viewInflate;
    }

    private static void AudioAttributesCompatParcelizer(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        view.draw(canvas);
        canvas.restore();
    }

    private static void read(Canvas canvas, View view, View view2) {
        canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, view2.getTop() - view.getHeight());
        view.draw(canvas);
        canvas.restore();
    }

    private final View AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        int bottom;
        int childCount = recyclerView.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = recyclerView.getChildAt(i3);
            int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(childAt);
            int height = (i2 == i3 || iMediaBrowserCompatItemReceiver < 0 || !this.read.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver)) ? 0 : this.AudioAttributesCompatParcelizer - childAt.getHeight();
            if (childAt.getTop() > 0) {
                bottom = childAt.getBottom() + height;
            } else {
                bottom = childAt.getBottom();
            }
            if (bottom > i && childAt.getTop() <= i) {
                return childAt;
            }
            i3++;
        }
        return null;
    }

    private final void IconCompatParcelizer(ViewGroup viewGroup, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        view.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        this.AudioAttributesCompatParcelizer = measuredHeight;
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        view.layout(0, 0, measuredWidth, measuredHeight);
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}

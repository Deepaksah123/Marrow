package kotlin;

import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0011J'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a"}, d2 = {"Lo/getVersionCode;", "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;", "", "p0", "p1", "p2", "Lo/getProtocolVersion;", "p3", "<init>", "(IILjava/lang/Integer;Lo/getProtocolVersion;)V", "Landroid/graphics/Canvas;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V", "Landroid/view/View;", "(ILandroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;", "read", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V", "RemoteActionCompatParcelizer", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)V", "(Landroidx/recyclerview/widget/RecyclerView;II)Landroid/view/View;", "Landroid/view/ViewGroup;", "write", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "I", "IconCompatParcelizer", "Ljava/lang/Integer;", "Lo/getProtocolVersion;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getVersionCode extends RecyclerView.AudioAttributesImplBaseParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Integer write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getProtocolVersion RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public getVersionCode(int i, int i2, Integer num, getProtocolVersion getprotocolversion) {
        toMagicModuleMetaRepoModel.write(getprotocolversion, "");
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.write = num;
        this.RemoteActionCompatParcelizer = getprotocolversion;
    }

    public /* synthetic */ getVersionCode(int i, int i2, Integer num, getProtocolVersion getprotocolversion, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : num, getprotocolversion);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void AudioAttributesCompatParcelizer(Canvas p0, RecyclerView p1, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p2) {
        int iIconCompatParcelizer;
        View viewAudioAttributesCompatParcelizer;
        int iMediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        super.AudioAttributesCompatParcelizer(p0, p1, p2);
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = p1.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
        int iMediaBrowserCompatItemReceiver2 = ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver2 == -1 || (viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(iMediaBrowserCompatItemReceiver2)), p1)) == null) {
            return;
        }
        write(p1, viewAudioAttributesCompatParcelizer);
        View viewAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(p1, viewAudioAttributesCompatParcelizer.getBottom(), iIconCompatParcelizer);
        if (viewAudioAttributesCompatParcelizer2 != null && (iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(viewAudioAttributesCompatParcelizer2)) >= 0 && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver)) {
            RemoteActionCompatParcelizer(p0, p1, viewAudioAttributesCompatParcelizer, viewAudioAttributesCompatParcelizer2);
        } else {
            read(p0, p1, viewAudioAttributesCompatParcelizer);
        }
    }

    private final View AudioAttributesCompatParcelizer(int p0, RecyclerView p1) {
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        if (iAudioAttributesCompatParcelizer < 0) {
            return null;
        }
        View viewInflate = LayoutInflater.from(p1.getContext()).inflate(iAudioAttributesCompatParcelizer, (ViewGroup) p1, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        this.RemoteActionCompatParcelizer.write(viewInflate, p0);
        return viewInflate;
    }

    private final void read(Canvas p0, RecyclerView p1, View p2) {
        p0.save();
        p0.translate(this.read + p1.getPaddingLeft(), BitmapDescriptorFactory.HUE_RED);
        p2.draw(p0);
        p0.restore();
    }

    private final void RemoteActionCompatParcelizer(Canvas p0, RecyclerView p1, View p2, View p3) {
        p0.save();
        p0.translate(this.read + p1.getPaddingLeft(), p3.getTop() - p2.getHeight());
        p2.draw(p0);
        p0.restore();
    }

    private final View AudioAttributesCompatParcelizer(RecyclerView p0, int p1, int p2) {
        int bottom;
        int childCount = p0.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = p0.getChildAt(i);
            int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(childAt);
            int height = (p2 == i || iMediaBrowserCompatItemReceiver < 0 || !this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver)) ? 0 : this.AudioAttributesCompatParcelizer - childAt.getHeight();
            if (childAt.getTop() > 0) {
                bottom = childAt.getBottom() + height;
            } else {
                bottom = childAt.getBottom();
            }
            if (bottom > p1 && childAt.getTop() <= p1) {
                return childAt;
            }
            i++;
        }
        return null;
    }

    private final void write(ViewGroup p0, View p1) {
        Integer num = this.write;
        if (num != null) {
            int iIntValue = num.intValue();
            p1.setPadding(p1.getPaddingLeft(), p1.getPaddingTop() + iIntValue, p1.getPaddingRight(), p1.getPaddingBottom());
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(p0.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(p0.getHeight(), 0);
        p1.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, p0.getPaddingLeft() + p0.getPaddingRight(), p1.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, p0.getPaddingTop() + p0.getPaddingBottom(), p1.getLayoutParams().height));
        int measuredWidth = p1.getMeasuredWidth();
        int measuredHeight = p1.getMeasuredHeight();
        this.AudioAttributesCompatParcelizer = measuredHeight;
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        p1.layout(0, 0, measuredWidth, measuredHeight);
    }
}

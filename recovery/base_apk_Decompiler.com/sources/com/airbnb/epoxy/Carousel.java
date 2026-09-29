package com.airbnb.epoxy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.UByteDeserializer;
import kotlin.getCurrentPeriodIndex;
import kotlin.serializeOzbTUA;
import kotlin.setMaxInputSize;

/* JADX INFO: loaded from: classes4.dex */
public class Carousel extends EpoxyRecyclerView {
    private static RemoteActionCompatParcelizer onSkipToNext = new RemoteActionCompatParcelizer() { // from class: com.airbnb.epoxy.Carousel.4
        @Override // com.airbnb.epoxy.Carousel.RemoteActionCompatParcelizer
        public final serializeOzbTUA write() {
            return new UByteDeserializer();
        }
    };
    private static int onSkipToQueueItem = 8;
    private float setSessionImpl;

    public static abstract class RemoteActionCompatParcelizer {
        public abstract serializeOzbTUA write();
    }

    public Carousel(Context context) {
        super(context);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    protected final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        super.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int iOnPlayFromMediaId = onPlayFromMediaId();
        if (iOnPlayFromMediaId >= 0) {
            setItemSpacingDp(iOnPlayFromMediaId);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
                setPaddingDp(iOnPlayFromMediaId);
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerOnFastForward = onFastForward();
        if (remoteActionCompatParcelizerOnFastForward != null) {
            getContext();
            remoteActionCompatParcelizerOnFastForward.write().read(this);
        }
        setRemoveAdapterWhenDetachedFromWindow(false);
    }

    private static RemoteActionCompatParcelizer onFastForward() {
        return onSkipToNext;
    }

    public static void setDefaultGlobalSnapHelperFactory(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        onSkipToNext = remoteActionCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setHasFixedSize(boolean z) {
        super.setHasFixedSize(z);
    }

    public void setNumViewsToShowOnScreen(float f) {
        this.setSessionImpl = f;
        setInitialPrefetchItemCount((int) Math.ceil(f));
    }

    public void setInitialPrefetchItemCount(int i) {
        if (i < 0) {
            throw new IllegalStateException("numItemsToPrefetch must be greater than 0");
        }
        if (i == 0) {
            i = 2;
        }
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer instanceof LinearLayoutManager) {
            ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).AudioAttributesCompatParcelizer(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void AudioAttributesImplApi26Parcelizer(View view) {
        if (this.setSessionImpl > BitmapDescriptorFactory.HUE_RED) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setTag(setMaxInputSize.read.epoxy_recycler_view_child_initial_size_id, Integer.valueOf(layoutParams.width));
            int i = getMediaBrowserCompatCustomActionResultReceiver().read();
            int i2 = i > 0 ? (int) (i * this.setSessionImpl) : 0;
            boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer();
            int i3 = (int) ((read(zAudioAttributesImplApi26Parcelizer) - i2) / this.setSessionImpl);
            if (zAudioAttributesImplApi26Parcelizer) {
                layoutParams.width = i3;
            } else {
                layoutParams.height = i3;
            }
        }
    }

    private int read(boolean z) {
        int iRatingCompat;
        int paddingTop;
        int paddingBottom = 0;
        if (z) {
            iRatingCompat = MediaDescriptionCompat(this);
            paddingTop = getPaddingLeft();
            if (getClipToPadding()) {
                paddingBottom = getPaddingRight();
            }
        } else {
            iRatingCompat = RatingCompat((View) this);
            paddingTop = getPaddingTop();
            if (getClipToPadding()) {
                paddingBottom = getPaddingBottom();
            }
        }
        return (iRatingCompat - paddingTop) - paddingBottom;
    }

    private static int MediaDescriptionCompat(View view) {
        if (view.getWidth() > 0) {
            return view.getWidth();
        }
        if (view.getMeasuredWidth() > 0) {
            return view.getMeasuredWidth();
        }
        return view.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private static int RatingCompat(View view) {
        if (view.getHeight() > 0) {
            return view.getHeight();
        }
        if (view.getMeasuredHeight() > 0) {
            return view.getMeasuredHeight();
        }
        return view.getContext().getResources().getDisplayMetrics().heightPixels;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void MediaBrowserCompatSearchResultReceiver(View view) {
        Object tag = view.getTag(setMaxInputSize.read.epoxy_recycler_view_child_initial_size_id);
        if (tag instanceof Integer) {
            view.getLayoutParams().width = ((Integer) tag).intValue();
            view.setTag(setMaxInputSize.read.epoxy_recycler_view_child_initial_size_id, null);
        }
    }

    public static void setDefaultItemSpacingDp(int i) {
        onSkipToQueueItem = i;
    }

    private static int onPlayFromMediaId() {
        return onSkipToQueueItem;
    }

    public void setPaddingRes(int i) {
        int iMediaDescriptionCompat = MediaDescriptionCompat(i);
        setPadding(iMediaDescriptionCompat, iMediaDescriptionCompat, iMediaDescriptionCompat, iMediaDescriptionCompat);
        setItemSpacingPx(iMediaDescriptionCompat);
    }

    public void setPaddingDp(int i) {
        if (i == -1) {
            i = onPlayFromMediaId();
        }
        int iRatingCompat = RatingCompat(i);
        setPadding(iRatingCompat, iRatingCompat, iRatingCompat, iRatingCompat);
        setItemSpacingPx(iRatingCompat);
    }

    public void setPadding(write writeVar) {
        if (writeVar == null) {
            setPaddingDp(0);
            return;
        }
        if (writeVar.RemoteActionCompatParcelizer == write.read.PX) {
            setPadding(writeVar.write, writeVar.MediaBrowserCompatItemReceiver, writeVar.AudioAttributesCompatParcelizer, writeVar.read);
            setItemSpacingPx(writeVar.IconCompatParcelizer);
            return;
        }
        if (writeVar.RemoteActionCompatParcelizer == write.read.DP) {
            int i = writeVar.write;
            setPadding(RatingCompat(0), RatingCompat(writeVar.MediaBrowserCompatItemReceiver), RatingCompat(writeVar.AudioAttributesCompatParcelizer), RatingCompat(writeVar.read));
            setItemSpacingPx(RatingCompat(writeVar.IconCompatParcelizer));
        } else if (writeVar.RemoteActionCompatParcelizer == write.read.RESOURCE) {
            int i2 = writeVar.write;
            int iMediaDescriptionCompat = MediaDescriptionCompat(0);
            int i3 = writeVar.MediaBrowserCompatItemReceiver;
            int iMediaDescriptionCompat2 = MediaDescriptionCompat(0);
            int i4 = writeVar.AudioAttributesCompatParcelizer;
            int iMediaDescriptionCompat3 = MediaDescriptionCompat(0);
            int i5 = writeVar.read;
            setPadding(iMediaDescriptionCompat, iMediaDescriptionCompat2, iMediaDescriptionCompat3, MediaDescriptionCompat(0));
            setItemSpacingPx(MediaDescriptionCompat(writeVar.IconCompatParcelizer));
        }
    }

    public static class write {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatItemReceiver;
        public final read RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        enum read {
            PX,
            DP,
            RESOURCE
        }

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write writeVar = (write) obj;
            int i = writeVar.write;
            int i2 = writeVar.MediaBrowserCompatItemReceiver;
            int i3 = writeVar.AudioAttributesCompatParcelizer;
            int i4 = writeVar.read;
            int i5 = writeVar.IconCompatParcelizer;
            return true;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public void setModels(List<? extends getCurrentPeriodIndex<?>> list) {
        super.setModels(list);
    }
}

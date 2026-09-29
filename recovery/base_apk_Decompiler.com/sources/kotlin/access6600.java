package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.inbox.CTCarouselViewPager;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
final class access6600 extends SimpleBasePlayerPlaylistTimeline {
    private final TextView MediaBrowserCompatMediaItem;
    private final RelativeLayout MediaBrowserCompatSearchResultReceiver;
    private final LinearLayout MediaDescriptionCompat;
    private final CTCarouselViewPager RatingCompat;

    class read implements ViewPager.RemoteActionCompatParcelizer {
        private final CTInboxMessage AudioAttributesCompatParcelizer;
        private final Context IconCompatParcelizer;
        private final access6600 RemoteActionCompatParcelizer;
        private final ImageView[] read;

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void read(int i, float f) {
        }

        read(Context context, access6600 access6600Var, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.IconCompatParcelizer = context;
            this.RemoteActionCompatParcelizer = access6600Var;
            this.read = imageViewArr;
            this.AudioAttributesCompatParcelizer = cTInboxMessage;
            imageViewArr[0].setImageDrawable(_parseDoublePrimitive.read(context.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_selected_dot, null));
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            for (ImageView imageView : this.read) {
                imageView.setImageDrawable(_parseDoublePrimitive.read(this.IconCompatParcelizer.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_unselected_dot, null));
            }
            this.read[i].setImageDrawable(_parseDoublePrimitive.read(this.IconCompatParcelizer.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_selected_dot, null));
        }
    }

    access6600(View view) {
        super(view);
        this.RatingCompat = (CTCarouselViewPager) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.image_carousel_viewpager);
        this.MediaDescriptionCompat = (LinearLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.sliderDots);
        this.MediaBrowserCompatMediaItem = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.carousel_timestamp);
        this.MediaBrowserCompatSearchResultReceiver = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.body_linear_layout);
    }

    @Override // kotlin.SimpleBasePlayerPlaylistTimeline
    final void write(CTInboxMessage cTInboxMessage, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0, int i) {
        super.write(cTInboxMessage, simpleBasePlayerPositionSupplierExternalSyntheticLambda0, i);
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer = IconCompatParcelizer();
        Context applicationContext = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.RemoteActionCompatParcelizer().get(0);
        this.MediaBrowserCompatMediaItem.setVisibility(0);
        if (cTInboxMessage.MediaBrowserCompatCustomActionResultReceiver()) {
            this.AudioAttributesImplApi21Parcelizer.setVisibility(8);
        } else {
            this.AudioAttributesImplApi21Parcelizer.setVisibility(0);
        }
        this.MediaBrowserCompatMediaItem.setText(AudioAttributesCompatParcelizer(cTInboxMessage.read()));
        this.MediaBrowserCompatMediaItem.setTextColor(Color.parseColor(cTInboxMessageContent.MediaBrowserCompatMediaItem()));
        this.MediaBrowserCompatSearchResultReceiver.setBackgroundColor(Color.parseColor(cTInboxMessage.AudioAttributesCompatParcelizer()));
        this.RatingCompat.setAdapter(new setAdPlaybackState(applicationContext, simpleBasePlayerPositionSupplierExternalSyntheticLambda0, cTInboxMessage, (LinearLayout.LayoutParams) this.RatingCompat.getLayoutParams(), i));
        int size = cTInboxMessage.RemoteActionCompatParcelizer().size();
        if (this.MediaDescriptionCompat.getChildCount() > 0) {
            this.MediaDescriptionCompat.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        RemoteActionCompatParcelizer(imageViewArr, size, applicationContext, this.MediaDescriptionCompat);
        imageViewArr[0].setImageDrawable(_parseDoublePrimitive.read(applicationContext.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_selected_dot, null));
        this.RatingCompat.read(new read(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.MediaBrowserCompatSearchResultReceiver.setOnClickListener(new getConstant(i, cTInboxMessage, simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer, this.RatingCompat));
        AudioAttributesCompatParcelizer(cTInboxMessage, i);
    }
}

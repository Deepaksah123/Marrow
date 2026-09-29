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
final class SimpleBasePlayerPeriodDataBuilder extends SimpleBasePlayerPlaylistTimeline {
    private final LinearLayout MediaBrowserCompatMediaItem;
    private final CTCarouselViewPager MediaBrowserCompatSearchResultReceiver;
    private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final TextView MediaDescriptionCompat;
    private final RelativeLayout RatingCompat;
    private final TextView handleMediaPlayPauseIfPendingOnHandler;

    class RemoteActionCompatParcelizer implements ViewPager.RemoteActionCompatParcelizer {
        private final SimpleBasePlayerPeriodDataBuilder AudioAttributesCompatParcelizer;
        private final ImageView[] IconCompatParcelizer;
        private final CTInboxMessage RemoteActionCompatParcelizer;
        private final Context write;

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void read(int i, float f) {
        }

        RemoteActionCompatParcelizer(Context context, SimpleBasePlayerPeriodDataBuilder simpleBasePlayerPeriodDataBuilder, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.write = context;
            this.AudioAttributesCompatParcelizer = simpleBasePlayerPeriodDataBuilder;
            this.IconCompatParcelizer = imageViewArr;
            this.RemoteActionCompatParcelizer = cTInboxMessage;
            imageViewArr[0].setImageDrawable(_parseDoublePrimitive.read(context.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_selected_dot, null));
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            for (ImageView imageView : this.IconCompatParcelizer) {
                imageView.setImageDrawable(_parseDoublePrimitive.read(this.write.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_unselected_dot, null));
            }
            this.IconCompatParcelizer[i].setImageDrawable(_parseDoublePrimitive.read(this.write.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_selected_dot, null));
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().get(i).MediaBrowserCompatCustomActionResultReceiver());
            this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setTextColor(Color.parseColor(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().get(i).MediaBrowserCompatMediaItem()));
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat.setText(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().get(i).AudioAttributesImplApi26Parcelizer());
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat.setTextColor(Color.parseColor(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().get(i).AudioAttributesImplBaseParcelizer()));
        }
    }

    SimpleBasePlayerPeriodDataBuilder(View view) {
        super(view);
        this.MediaBrowserCompatSearchResultReceiver = (CTCarouselViewPager) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.image_carousel_viewpager);
        this.MediaBrowserCompatMediaItem = (LinearLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.sliderDots);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.messageTitle);
        this.MediaDescriptionCompat = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.messageText);
        this.handleMediaPlayPauseIfPendingOnHandler = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.timestamp);
        this.RatingCompat = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.body_linear_layout);
    }

    @Override // kotlin.SimpleBasePlayerPlaylistTimeline
    final void write(CTInboxMessage cTInboxMessage, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0, int i) {
        super.write(cTInboxMessage, simpleBasePlayerPositionSupplierExternalSyntheticLambda0, i);
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer = IconCompatParcelizer();
        Context applicationContext = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.RemoteActionCompatParcelizer().get(0);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(0);
        this.MediaDescriptionCompat.setVisibility(0);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(cTInboxMessageContent.MediaBrowserCompatCustomActionResultReceiver());
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setTextColor(Color.parseColor(cTInboxMessageContent.MediaBrowserCompatMediaItem()));
        this.MediaDescriptionCompat.setText(cTInboxMessageContent.AudioAttributesImplApi26Parcelizer());
        this.MediaDescriptionCompat.setTextColor(Color.parseColor(cTInboxMessageContent.AudioAttributesImplBaseParcelizer()));
        if (cTInboxMessage.MediaBrowserCompatCustomActionResultReceiver()) {
            this.AudioAttributesImplApi21Parcelizer.setVisibility(8);
        } else {
            this.AudioAttributesImplApi21Parcelizer.setVisibility(0);
        }
        this.handleMediaPlayPauseIfPendingOnHandler.setVisibility(0);
        this.handleMediaPlayPauseIfPendingOnHandler.setText(AudioAttributesCompatParcelizer(cTInboxMessage.read()));
        this.handleMediaPlayPauseIfPendingOnHandler.setTextColor(Color.parseColor(cTInboxMessageContent.MediaBrowserCompatMediaItem()));
        this.RatingCompat.setBackgroundColor(Color.parseColor(cTInboxMessage.AudioAttributesCompatParcelizer()));
        this.MediaBrowserCompatSearchResultReceiver.setAdapter(new setAdPlaybackState(applicationContext, simpleBasePlayerPositionSupplierExternalSyntheticLambda0, cTInboxMessage, (LinearLayout.LayoutParams) this.MediaBrowserCompatSearchResultReceiver.getLayoutParams(), i));
        int size = cTInboxMessage.RemoteActionCompatParcelizer().size();
        if (this.MediaBrowserCompatMediaItem.getChildCount() > 0) {
            this.MediaBrowserCompatMediaItem.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        RemoteActionCompatParcelizer(imageViewArr, size, applicationContext, this.MediaBrowserCompatMediaItem);
        imageViewArr[0].setImageDrawable(_parseDoublePrimitive.read(applicationContext.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_selected_dot, null));
        this.MediaBrowserCompatSearchResultReceiver.read(new RemoteActionCompatParcelizer(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.RatingCompat.setOnClickListener(new getConstant(i, cTInboxMessage, simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver));
        AudioAttributesCompatParcelizer(cTInboxMessage, i);
    }
}

package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleBasePlayerPlaylistTimeline extends RecyclerView.onMediaButtonEvent {
    RelativeLayout AudioAttributesCompatParcelizer;
    protected final ImageView AudioAttributesImplApi21Parcelizer;
    ImageView AudioAttributesImplApi26Parcelizer;
    RelativeLayout AudioAttributesImplBaseParcelizer;
    FrameLayout IconCompatParcelizer;
    RelativeLayout MediaBrowserCompatCustomActionResultReceiver;
    FrameLayout MediaBrowserCompatItemReceiver;
    private CTInboxMessageContent MediaBrowserCompatMediaItem;
    private CTInboxMessage MediaBrowserCompatSearchResultReceiver;
    private WeakReference<SimpleBasePlayerPositionSupplierExternalSyntheticLambda0> MediaDescriptionCompat;
    ImageView MediaMetadataCompat;
    private ImageView RatingCompat;
    Context RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    LinearLayout read;
    LinearLayout write;

    SimpleBasePlayerPlaylistTimeline(View view) {
        super(view);
        this.AudioAttributesImplApi21Parcelizer = (ImageView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.read_circle);
    }

    public final boolean IconCompatParcelizer(float f, final getCreatedOnDateMs<Float> getcreatedondatems, getModuleData<String, Boolean, Boolean, Void> getmoduledata, View view) {
        FrameLayout frameLayoutAudioAttributesImplBaseParcelizer;
        int measuredHeight;
        int iRound;
        if (!this.handleMediaPlayPauseIfPendingOnHandler || (frameLayoutAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer()) == null) {
            return false;
        }
        frameLayoutAudioAttributesImplBaseParcelizer.removeAllViews();
        frameLayoutAudioAttributesImplBaseParcelizer.setVisibility(8);
        Resources resources = this.RemoteActionCompatParcelizer.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (SimpleBasePlayerPlaceholderUid.read == 2) {
            if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer().equalsIgnoreCase(CmcdHeadersFactory.STREAM_TYPE_LIVE)) {
                measuredHeight = Math.round(this.AudioAttributesImplApi26Parcelizer.getMeasuredHeight() * 1.76f);
                iRound = this.AudioAttributesImplApi26Parcelizer.getMeasuredHeight();
            } else {
                measuredHeight = this.MediaMetadataCompat.getMeasuredHeight();
            }
        } else {
            measuredHeight = resources.getDisplayMetrics().widthPixels;
            iRound = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer().equalsIgnoreCase(CmcdHeadersFactory.STREAM_TYPE_LIVE) ? Math.round(measuredHeight * 0.5625f) : measuredHeight;
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(measuredHeight, iRound));
        frameLayoutAudioAttributesImplBaseParcelizer.addView(view);
        frameLayoutAudioAttributesImplBaseParcelizer.setBackgroundColor(Color.parseColor(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer()));
        FrameLayout frameLayout = this.MediaBrowserCompatItemReceiver;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.MediaBrowserCompatMediaItem.onAddQueueItem()) {
            ImageView imageView = new ImageView(this.RemoteActionCompatParcelizer);
            this.RatingCompat = imageView;
            imageView.setVisibility(8);
            read(this.RatingCompat, this.RemoteActionCompatParcelizer, f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, displayMetrics), (int) TypedValue.applyDimension(1, 30.0f, displayMetrics));
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, displayMetrics), (int) TypedValue.applyDimension(1, 2.0f, displayMetrics), 0);
            layoutParams.gravity = 8388613;
            this.RatingCompat.setLayoutParams(layoutParams);
            this.RatingCompat.setOnClickListener(new View.OnClickListener() { // from class: o.getExtrapolating
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.AudioAttributesCompatParcelizer.read(getcreatedondatems);
                }
            });
            frameLayoutAudioAttributesImplBaseParcelizer.addView(this.RatingCompat);
        }
        getmoduledata.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem.IconCompatParcelizer(), Boolean.valueOf(this.MediaBrowserCompatMediaItem.MediaDescriptionCompat()), Boolean.valueOf(this.MediaBrowserCompatMediaItem.onAddQueueItem()));
        return true;
    }

    final /* synthetic */ void read(getCreatedOnDateMs getcreatedondatems) {
        read(this.RatingCompat, this.RemoteActionCompatParcelizer, ((Float) getcreatedondatems.invoke()).floatValue());
    }

    private static void read(ImageView imageView, Context context, float f) {
        int i;
        boolean z = f <= BitmapDescriptorFactory.HUE_RED;
        int i2 = z ? RendererCapabilitiesAdaptiveSupport.read.ct_volume_off : RendererCapabilitiesAdaptiveSupport.read.ct_volume_on;
        if (z) {
            i = RendererCapabilitiesAdaptiveSupport.RemoteActionCompatParcelizer.ct_inbox_mute_button_content_description;
        } else {
            i = RendererCapabilitiesAdaptiveSupport.RemoteActionCompatParcelizer.ct_inbox_unmute_button_content_description;
        }
        imageView.setContentDescription(context.getString(i));
        imageView.setImageDrawable(_parseDoublePrimitive.read(context.getResources(), i2, null));
    }

    static String AudioAttributesCompatParcelizer(long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        if (jCurrentTimeMillis < 60) {
            return "Just Now";
        }
        if (jCurrentTimeMillis > 60 && jCurrentTimeMillis < 3540) {
            StringBuilder sb = new StringBuilder();
            sb.append(jCurrentTimeMillis / 60);
            sb.append(" mins ago");
            return sb.toString();
        }
        if (jCurrentTimeMillis <= 3540 || jCurrentTimeMillis >= 81420) {
            if (jCurrentTimeMillis > 86400 && jCurrentTimeMillis < 172800) {
                return "Yesterday";
            }
            return new SimpleDateFormat("dd MMM").format(new Date(j * 1000));
        }
        long j2 = jCurrentTimeMillis / 3600;
        if (j2 > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j2);
            sb2.append(" hours ago");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j2);
        sb3.append(" hour ago");
        return sb3.toString();
    }

    void write(CTInboxMessage cTInboxMessage, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0, int i) {
        this.RemoteActionCompatParcelizer = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.getContext();
        this.MediaDescriptionCompat = new WeakReference<>(simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        this.MediaBrowserCompatSearchResultReceiver = cTInboxMessage;
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.RemoteActionCompatParcelizer().get(0);
        this.MediaBrowserCompatMediaItem = cTInboxMessageContent;
        this.handleMediaPlayPauseIfPendingOnHandler = cTInboxMessageContent.MediaBrowserCompatSearchResultReceiver();
    }

    final SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 IconCompatParcelizer() {
        return this.MediaDescriptionCompat.get();
    }

    static void AudioAttributesCompatParcelizer(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, BitmapDescriptorFactory.HUE_RED));
    }

    static void RemoteActionCompatParcelizer(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, BitmapDescriptorFactory.HUE_RED));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, BitmapDescriptorFactory.HUE_RED));
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void read() {
        FrameLayout frameLayout = this.MediaBrowserCompatItemReceiver;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesImplBaseParcelizer().setVisibility(0);
        ImageView imageView = this.RatingCompat;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.MediaBrowserCompatItemReceiver;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        FrameLayout frameLayout = this.MediaBrowserCompatItemReceiver;
        if (frameLayout != null) {
            frameLayout.post(new Runnable() { // from class: o.getPeriodCountInMediaItem
                @Override // java.lang.Runnable
                public final void run() {
                    this.read.RemoteActionCompatParcelizer();
                }
            });
        }
        ImageView imageView = this.RatingCompat;
        if (imageView != null) {
            imageView.post(new Runnable() { // from class: o.lambdagetConstant0
                @Override // java.lang.Runnable
                public final void run() {
                    this.RemoteActionCompatParcelizer.write();
                }
            });
        }
        FrameLayout frameLayoutAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (frameLayoutAudioAttributesImplBaseParcelizer != null) {
            frameLayoutAudioAttributesImplBaseParcelizer.removeAllViews();
        }
    }

    final /* synthetic */ void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver.setVisibility(8);
    }

    final /* synthetic */ void write() {
        this.RatingCompat.setVisibility(8);
    }

    static void RemoteActionCompatParcelizer(ImageView[] imageViewArr, int i, Context context, LinearLayout linearLayout) {
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(context);
            imageViewArr[i2] = imageView;
            imageView.setVisibility(0);
            imageViewArr[i2].setImageDrawable(_parseDoublePrimitive.read(context.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_unselected_dot, null));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (linearLayout.getChildCount() < i) {
                linearLayout.addView(imageViewArr[i2], layoutParams);
            }
        }
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatMediaItem.onAddQueueItem();
    }

    private FrameLayout AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesCompatParcelizer(final CTInboxMessage cTInboxMessage, final int i) {
        new Handler().postDelayed(new Runnable() { // from class: o.SimpleBasePlayerPlaylistTimeline.2
            @Override // java.lang.Runnable
            public final void run() {
                maybeGetTypeVariable activity;
                final SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer = SimpleBasePlayerPlaylistTimeline.this.IconCompatParcelizer();
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer == null || (activity = simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer.getActivity()) == null) {
                    return;
                }
                activity.runOnUiThread(new Runnable() { // from class: o.SimpleBasePlayerPlaylistTimeline.2.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (SimpleBasePlayerPlaylistTimeline.this.AudioAttributesImplApi21Parcelizer.getVisibility() == 0) {
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0IconCompatParcelizer.IconCompatParcelizer(i);
                        }
                        SimpleBasePlayerPlaylistTimeline.this.AudioAttributesImplApi21Parcelizer.setVisibility(8);
                        cTInboxMessage.MediaBrowserCompatMediaItem();
                    }
                });
            }
        }, 2000L);
    }
}

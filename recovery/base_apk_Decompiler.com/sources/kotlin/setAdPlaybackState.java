package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.Glide;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class setAdPlaybackState extends getComponentEnabledSetting {
    private final LinearLayout.LayoutParams AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final WeakReference<SimpleBasePlayerPositionSupplierExternalSyntheticLambda0> AudioAttributesImplBaseParcelizer;
    private final CTInboxMessage IconCompatParcelizer;
    private View MediaBrowserCompatItemReceiver;
    private LayoutInflater RemoteActionCompatParcelizer;
    private final Context read;
    private final ArrayList<SimpleBasePlayerState> write;

    @Override // kotlin.getComponentEnabledSetting
    public final boolean RemoteActionCompatParcelizer(View view, Object obj) {
        return view == obj;
    }

    setAdPlaybackState(Context context, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int i) {
        this.read = context;
        this.AudioAttributesImplBaseParcelizer = new WeakReference<>(simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        this.write = cTInboxMessage.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = layoutParams;
        this.IconCompatParcelizer = cTInboxMessage;
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    @Override // kotlin.getComponentEnabledSetting
    public final void IconCompatParcelizer(ViewGroup viewGroup, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // kotlin.getComponentEnabledSetting
    public final int AudioAttributesCompatParcelizer() {
        return this.write.size();
    }

    @Override // kotlin.getComponentEnabledSetting
    public final Object read(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.read.getSystemService("layout_inflater");
        this.RemoteActionCompatParcelizer = layoutInflater;
        this.MediaBrowserCompatItemReceiver = layoutInflater.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inbox_carousel_image_layout, viewGroup, false);
        try {
            if (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().equalsIgnoreCase(CmcdHeadersFactory.STREAM_TYPE_LIVE)) {
                read((ImageView) this.MediaBrowserCompatItemReceiver.findViewById(RendererCapabilitiesAdaptiveSupport.write.imageView), this.MediaBrowserCompatItemReceiver, i, viewGroup);
            } else if (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().equalsIgnoreCase(TtmlNode.TAG_P)) {
                read((ImageView) this.MediaBrowserCompatItemReceiver.findViewById(RendererCapabilitiesAdaptiveSupport.write.squareImageView), this.MediaBrowserCompatItemReceiver, i, viewGroup);
            }
        } catch (NoClassDefFoundError unused) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    private void read(ImageView imageView, View view, final int i, ViewGroup viewGroup) {
        imageView.setVisibility(0);
        String strRemoteActionCompatParcelizer = this.write.get(i).RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.read.getString(RendererCapabilitiesAdaptiveSupport.RemoteActionCompatParcelizer.ct_inbox_image_content_description));
            sb.append(i + 1);
            strRemoteActionCompatParcelizer = sb.toString();
        }
        imageView.setContentDescription(strRemoteActionCompatParcelizer);
        try {
            Glide.write(imageView.getContext()).RemoteActionCompatParcelizer(this.write.get(i).write()).RemoteActionCompatParcelizer(new getPlayingPeriod().RemoteActionCompatParcelizer(RendererCapabilitiesListener.read(this.read, "ct_image")).AudioAttributesCompatParcelizer(RendererCapabilitiesListener.read(this.read, "ct_image"))).RemoteActionCompatParcelizer(imageView);
        } catch (NoSuchMethodError unused) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            Glide.write(imageView.getContext()).RemoteActionCompatParcelizer(this.write.get(i).write()).RemoteActionCompatParcelizer(imageView);
        }
        viewGroup.addView(view, this.AudioAttributesCompatParcelizer);
        view.setOnClickListener(new View.OnClickListener() { // from class: o.setAdPlaybackState.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0AudioAttributesImplBaseParcelizer = setAdPlaybackState.this.AudioAttributesImplBaseParcelizer();
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda0AudioAttributesImplBaseParcelizer != null) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0AudioAttributesImplBaseParcelizer.read(setAdPlaybackState.this.AudioAttributesImplApi21Parcelizer, i);
                }
            }
        });
    }

    final SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.get();
    }
}

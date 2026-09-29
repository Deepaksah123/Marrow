package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
final class access3600 extends SimpleBasePlayerPlaylistTimeline {
    private final Button MediaBrowserCompatMediaItem;
    private final Button MediaBrowserCompatSearchResultReceiver;
    private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final TextView MediaDescriptionCompat;
    private final Button RatingCompat;
    private final TextView onCommand;

    access3600(View view) {
        super(view);
        view.setTag(this);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.messageTitle);
        this.MediaDescriptionCompat = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.messageText);
        this.onCommand = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.timestamp);
        this.RatingCompat = (Button) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_button_1);
        this.MediaBrowserCompatMediaItem = (Button) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_button_2);
        this.MediaBrowserCompatSearchResultReceiver = (Button) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_button_3);
        this.AudioAttributesImplApi26Parcelizer = (ImageView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.media_image);
        this.AudioAttributesImplBaseParcelizer = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.simple_message_relative_layout);
        this.IconCompatParcelizer = (FrameLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.simple_message_frame_layout);
        this.MediaMetadataCompat = (ImageView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.square_media_image);
        this.AudioAttributesCompatParcelizer = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.click_relative_layout);
        this.read = (LinearLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_linear_layout);
        this.write = (LinearLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.body_linear_layout);
        this.MediaBrowserCompatItemReceiver = (FrameLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.simple_progress_frame_layout);
        this.MediaBrowserCompatCustomActionResultReceiver = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.media_layout);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04cb A[Catch: NoClassDefFoundError -> 0x069f, TryCatch #1 {NoClassDefFoundError -> 0x069f, blocks: (B:66:0x03e8, B:68:0x03f7, B:70:0x042f, B:67:0x03f0, B:71:0x044b, B:73:0x045a, B:75:0x0469, B:77:0x0471, B:74:0x0462, B:78:0x048a, B:80:0x0491, B:82:0x04af, B:84:0x04cb, B:86:0x04d6, B:87:0x04df, B:89:0x04e5, B:90:0x04f6, B:92:0x052e, B:93:0x054a, B:95:0x0550, B:96:0x0561, B:98:0x059d, B:99:0x05bd, B:101:0x05c3, B:103:0x05cd, B:104:0x05de, B:106:0x0616, B:107:0x0631, B:109:0x064a, B:110:0x0662, B:112:0x0668, B:114:0x0686), top: B:132:0x02d3, inners: #0, #6, #7, #8 }] */
    @Override // kotlin.SimpleBasePlayerPlaylistTimeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void write(com.clevertap.android.sdk.inbox.CTInboxMessage r20, kotlin.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access3600.write(com.clevertap.android.sdk.inbox.CTInboxMessage, o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0, int):void");
    }
}

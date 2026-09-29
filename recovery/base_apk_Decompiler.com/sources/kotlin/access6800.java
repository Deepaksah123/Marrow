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
final class access6800 extends SimpleBasePlayerPlaylistTimeline {
    private final Button MediaBrowserCompatMediaItem;
    private final RelativeLayout MediaBrowserCompatSearchResultReceiver;
    private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Button MediaDescriptionCompat;
    private final Button RatingCompat;
    private final TextView handleMediaPlayPauseIfPendingOnHandler;
    private final TextView onAddQueueItem;
    private final LinearLayout onCommand;
    private final ImageView onCustomAction;

    access6800(View view) {
        super(view);
        view.setTag(this);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.messageTitle);
        this.onAddQueueItem = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.messageText);
        this.AudioAttributesImplApi26Parcelizer = (ImageView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.media_image);
        this.onCustomAction = (ImageView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.image_icon);
        this.handleMediaPlayPauseIfPendingOnHandler = (TextView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.timestamp);
        this.RatingCompat = (Button) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_button_1);
        this.MediaBrowserCompatMediaItem = (Button) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_button_2);
        this.MediaDescriptionCompat = (Button) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_button_3);
        this.IconCompatParcelizer = (FrameLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.icon_message_frame_layout);
        this.MediaMetadataCompat = (ImageView) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.square_media_image);
        this.MediaBrowserCompatSearchResultReceiver = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.click_relative_layout);
        this.onCommand = (LinearLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.cta_linear_layout);
        this.MediaBrowserCompatItemReceiver = (FrameLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.icon_progress_frame_layout);
        this.MediaBrowserCompatCustomActionResultReceiver = (RelativeLayout) view.findViewById(RendererCapabilitiesAdaptiveSupport.write.media_layout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04f9 A[Catch: NoClassDefFoundError -> 0x06d7, TryCatch #9 {NoClassDefFoundError -> 0x06d7, blocks: (B:72:0x040c, B:74:0x041b, B:76:0x0456, B:73:0x0414, B:77:0x046f, B:79:0x047f, B:81:0x048e, B:83:0x049c, B:80:0x0487, B:84:0x04b5, B:86:0x04bc, B:88:0x04db, B:91:0x04f9, B:93:0x0506, B:94:0x050f, B:96:0x0515, B:97:0x0527, B:99:0x055f, B:100:0x057b, B:102:0x0581, B:103:0x0593, B:105:0x05cf, B:106:0x05ef, B:108:0x05f5, B:110:0x0605, B:111:0x0611, B:113:0x0649, B:114:0x0665, B:116:0x067f, B:117:0x0697, B:119:0x069d, B:121:0x06bc), top: B:169:0x02ef, inners: #2, #5, #8, #13 }] */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.SimpleBasePlayerPlaylistTimeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void write(com.clevertap.android.sdk.inbox.CTInboxMessage r21, kotlin.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access6800.write(com.clevertap.android.sdk.inbox.CTInboxMessage, o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0, int):void");
    }
}

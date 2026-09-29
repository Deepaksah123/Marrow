package kotlin;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin._coercedTypeDesc;
import kotlin.onUpstreamDiscarded;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public class onLoadError extends BroadcastReceiver {
    private static final byte[] $$a = {7, -56, -121, 7, 11, -3, -64, TarConstants.LF_BLK, 8, -8, 16, -18, 12, 1, -20, 14, -67, TarConstants.LF_SYMLINK, 12, -11, 13, -4, -7, -6, -55, 68, -16, 6, -62, 65, 4, -3, -12, 5, 0, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -65, 20, 16, -7, 32, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -38, 36, 5, -16, 8, 5, -34, 17, 12, 3, -14, -7, 1};
    private static final int $$b = 90;
    private CleverTapInstanceConfig MediaBrowserCompatCustomActionResultReceiver;
    private RemoteViews MediaBrowserCompatItemReceiver;
    private RemoteViews MediaBrowserCompatMediaItem;
    private RemoteViews MediaMetadataCompat;
    private RemoteViews RatingCompat;
    private String handleMediaPlayPauseIfPendingOnHandler;
    private String onAddQueueItem;
    private String onCommand;
    private NotificationManager onCustomAction;
    private boolean onFastForward;
    private String onMediaButtonEvent;
    private String onPause;
    private String onPlay;
    private String onPlayFromMediaId;
    private String onPlayFromSearch;
    private String onPlayFromUri;
    private String onPrepare;
    private String onPrepareFromMediaId;
    private String onPrepareFromSearch;
    private String onPrepareFromUri;
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda2 onRemoveQueueItemAt;
    private boolean onRewind;
    private PlayerTimelineChangeReason read;
    private boolean IconCompatParcelizer = true;
    private boolean AudioAttributesCompatParcelizer = true;
    private boolean write = true;
    private boolean AudioAttributesImplApi21Parcelizer = true;
    private boolean AudioAttributesImplBaseParcelizer = true;
    private boolean AudioAttributesImplApi26Parcelizer = true;
    private ArrayList<String> MediaDescriptionCompat = new ArrayList<>();
    private ArrayList<String> MediaBrowserCompatSearchResultReceiver = new ArrayList<>();
    private ArrayList<String> RemoteActionCompatParcelizer = new ArrayList<>();
    private ArrayList<String> onSeekTo = new ArrayList<>();
    private ArrayList<String> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList<>();
    private int onRemoveQueueItem = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 70
            byte[] r0 = kotlin.onLoadError.$$a
            int r8 = r8 * 4
            int r8 = 99 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onLoadError.a(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(context);
        if (intent.getExtras() != null) {
            final Bundle extras = intent.getExtras();
            this.read = PlayerTimelineChangeReason.write(context, extras.getString("wzrk_acct_id"));
            this.onPlayFromMediaId = intent.getStringExtra("pt_id");
            this.onPause = extras.getString("pt_msg");
            this.onPlay = extras.getString("pt_msg_summary");
            this.onPrepareFromUri = extras.getString("pt_title");
            this.onPlayFromUri = extras.getString("pt_default_dl");
            this.MediaBrowserCompatSearchResultReceiver = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(extras);
            this.RemoteActionCompatParcelizer = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(extras);
            this.onSeekTo = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesImplApi26Parcelizer(extras);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesImplBaseParcelizer(extras);
            this.onPrepareFromSearch = extras.getString("pt_product_display_linear");
            this.onCustomAction = (NotificationManager) context.getSystemService("notification");
            this.onAddQueueItem = extras.getString("pt_big_img_alt");
            this.onCommand = extras.getString("pt_big_img_alt_alt_text", context.getString(onUpstreamDiscarded.IconCompatParcelizer.pt_big_image_alt));
            this.onPrepareFromMediaId = extras.getString("pt_small_icon_clr");
            this.onRewind = true;
            this.onFastForward = extras.getBoolean("pt_dismiss_intent", false);
            this.onPrepare = extras.getString("pt_rating_toast");
            this.onPlayFromSearch = extras.getString("pt_subtitle");
            AudioAttributesCompatParcelizer(extras);
            String str = this.onPlayFromMediaId;
            if (str != null) {
                this.onRemoveQueueItemAt = MediaSourceListForwardingEventListenerExternalSyntheticLambda2.read(str);
            }
            PlayerTimelineChangeReason playerTimelineChangeReason = this.read;
            if (playerTimelineChangeReason != null) {
                try {
                    CleverTapInstanceConfig cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer = playerTimelineChangeReason.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer();
                    this.MediaBrowserCompatCustomActionResultReceiver = cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer;
                    TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer).read().read("PushTemplateReceiver#renderNotification", new Callable<Void>() { // from class: o.onLoadError.1
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.util.concurrent.Callable
                        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Void call() throws Exception {
                            try {
                            } catch (Throwable th) {
                                th.getLocalizedMessage();
                                onDrmSessionAcquired.IconCompatParcelizer();
                            }
                            if (!onLoadError.this.onFastForward) {
                                if (onLoadError.this.onRemoveQueueItemAt != null) {
                                    int i = AnonymousClass3.AudioAttributesCompatParcelizer[onLoadError.this.onRemoveQueueItemAt.ordinal()];
                                    if (i == 1) {
                                        onLoadError.this.read(context, extras, intent);
                                    } else if (i == 2) {
                                        onLoadError.this.IconCompatParcelizer(context, extras);
                                    } else if (i == 3) {
                                        onLoadError.this.AudioAttributesCompatParcelizer(context, extras);
                                    } else if (i == 4) {
                                        onLoadError.this.AudioAttributesCompatParcelizer(context, extras, intent);
                                    } else if (i == 5) {
                                        onLoadError.this.write(context, extras);
                                    }
                                }
                                return null;
                            }
                            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(context);
                            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context, intent);
                            return null;
                        }
                    });
                    return;
                } catch (Exception e) {
                    e.getLocalizedMessage();
                    onDrmSessionAcquired.IconCompatParcelizer();
                    return;
                }
            }
            onDrmSessionAcquired.IconCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: o.onLoadError$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi21Parcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatItemReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(Context context, Bundle bundle) {
        int size;
        String str;
        try {
            int i = bundle.getInt("notificationId");
            Notification notificationRemoteActionCompatParcelizer = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(context, i);
            if (notificationRemoteActionCompatParcelizer == null) {
                onDrmSessionAcquired.IconCompatParcelizer();
                return;
            }
            this.MediaMetadataCompat = notificationRemoteActionCompatParcelizer.bigContentView;
            this.RatingCompat = notificationRemoteActionCompatParcelizer.contentView;
            RemoteActionCompatParcelizer(this.MediaMetadataCompat, context);
            boolean z = bundle.getBoolean("right_swipe");
            this.MediaDescriptionCompat = bundle.getStringArrayList("pt_image_list");
            this.MediaBrowserCompatSearchResultReceiver = bundle.getStringArrayList("pt_deeplink_list");
            int i2 = bundle.getInt("pt_manual_carousel_current");
            if (z) {
                this.MediaMetadataCompat.showNext(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image);
                this.MediaMetadataCompat.showNext(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right);
                this.MediaMetadataCompat.showNext(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left);
                size = i2 == this.MediaDescriptionCompat.size() - 1 ? 0 : i2 + 1;
            } else {
                this.MediaMetadataCompat.showPrevious(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image);
                this.MediaMetadataCompat.showPrevious(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right);
                this.MediaMetadataCompat.showPrevious(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left);
                size = i2 == 0 ? this.MediaDescriptionCompat.size() - 1 : i2 - 1;
            }
            ArrayList<String> arrayList = this.MediaBrowserCompatSearchResultReceiver;
            if (arrayList != null && arrayList.size() == this.MediaDescriptionCompat.size()) {
                str = this.MediaBrowserCompatSearchResultReceiver.get(size);
            } else {
                ArrayList<String> arrayList2 = this.MediaBrowserCompatSearchResultReceiver;
                if (arrayList2 != null && arrayList2.size() == 1) {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                } else {
                    ArrayList<String> arrayList3 = this.MediaBrowserCompatSearchResultReceiver;
                    if (arrayList3 != null && arrayList3.size() > size) {
                        str = this.MediaBrowserCompatSearchResultReceiver.get(size);
                    } else {
                        ArrayList<String> arrayList4 = this.MediaBrowserCompatSearchResultReceiver;
                        if (arrayList4 != null && arrayList4.size() < size) {
                            str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                        } else {
                            str = "";
                        }
                    }
                }
            }
            bundle.putInt("pt_manual_carousel_current", size);
            bundle.remove("right_swipe");
            bundle.putString("wzrk_dl", str);
            bundle.putInt("manual_carousel_from", i2);
            this.MediaMetadataCompat.setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.rightArrowPos0, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 4, null));
            this.MediaMetadataCompat.setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.leftArrowPos0, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 5, null));
            PendingIntent pendingIntentIconCompatParcelizer = MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 3, null);
            _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context, notificationRemoteActionCompatParcelizer);
            PendingIntent pendingIntentIconCompatParcelizer2 = MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 6, null);
            AudioAttributesCompatParcelizer(context);
            IconCompatParcelizer(audioAttributesImplBaseParcelizer, this.RatingCompat, this.MediaMetadataCompat, this.onPrepareFromUri, pendingIntentIconCompatParcelizer, pendingIntentIconCompatParcelizer2);
            this.onCustomAction.notify(i, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
        } catch (Throwable unused) {
            onDrmSessionAcquired.read();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(Context context, Bundle bundle, Intent intent) {
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer;
        Intent launchIntentForPackage;
        Bundle bundleIconCompatParcelizer = _findNullProvider.IconCompatParcelizer(intent);
        PendingIntent pendingIntentAudioAttributesCompatParcelizer = MetadataRetrieverMetadataRetrieverInternal.AudioAttributesCompatParcelizer(context, bundle, new Intent(context, (Class<?>) onLoadError.class));
        this.MediaBrowserCompatCustomActionResultReceiver = (CleverTapInstanceConfig) bundle.getParcelable(PaymentConstants.Category.CONFIG);
        if (bundleIconCompatParcelizer != null) {
            CharSequence charSequence = bundleIconCompatParcelizer.getCharSequence("pt_input_reply");
            int i = bundle.getInt("notificationId");
            if (charSequence != null) {
                onDrmSessionAcquired.IconCompatParcelizer();
                bundle.putString("pt_input_reply", charSequence.toString());
                MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(context, this.MediaBrowserCompatCustomActionResultReceiver, bundle, "pt_input_reply");
                if (this.onRewind) {
                    audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context, "pt_silent_sound_channel");
                } else {
                    audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context);
                }
                AudioAttributesCompatParcelizer(context);
                if (Build.VERSION.SDK_INT >= 31) {
                    audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(this.onPlayFromSearch);
                }
                audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(this.onRemoveQueueItem).RemoteActionCompatParcelizer((CharSequence) this.onPrepareFromUri).read((CharSequence) bundle.getString("pt_input_feedback")).IconCompatParcelizer(1300L).IconCompatParcelizer(pendingIntentAudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(System.currentTimeMillis()).RemoteActionCompatParcelizer(true);
                read(this.onAddQueueItem, bundle, context, audioAttributesImplBaseParcelizer, this.onCommand);
                this.onCustomAction.notify(i, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
                if (Build.VERSION.SDK_INT < 31) {
                    if (bundle.getString("pt_input_auto_open") != null || bundle.getBoolean("pt_input_auto_open")) {
                        try {
                            Thread.sleep(1300L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (bundle.containsKey("wzrk_dl") && bundle.getString("wzrk_dl") != null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("wzrk_dl")));
                            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(context, launchIntentForPackage);
                        } else {
                            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                            if (launchIntentForPackage == null) {
                                return;
                            }
                        }
                        launchIntentForPackage.putExtras(bundle);
                        launchIntentForPackage.putExtra("pt_reply", charSequence);
                        launchIntentForPackage.removeExtra("wzrk_acts");
                        launchIntentForPackage.setFlags(872415232);
                        context.startActivity(launchIntentForPackage);
                        return;
                    }
                    return;
                }
                return;
            }
            onDrmSessionAcquired.IconCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(Context context, Bundle bundle, Intent intent) {
        Class<?> cls;
        try {
            int i = bundle.getInt("notificationId");
            if (bundle.getBoolean("default_dl", false)) {
                this.MediaBrowserCompatCustomActionResultReceiver = (CleverTapInstanceConfig) bundle.getParcelable(PaymentConstants.Category.CONFIG);
                this.onCustomAction.cancel(i);
                try {
                    byte[] bArr = $$a;
                    byte b = (byte) (-bArr[13]);
                    byte b2 = bArr[34];
                    Object[] objArr = new Object[1];
                    a(b, b2, b2, objArr);
                    cls = Class.forName((String) objArr[0]);
                } catch (ClassNotFoundException unused) {
                    onDrmSessionAcquired.RemoteActionCompatParcelizer();
                    cls = null;
                }
                if (RendererCapabilitiesListener.IconCompatParcelizer(context, cls)) {
                    Intent intent2 = new Intent(CTNotificationIntentService.MAIN_ACTION);
                    intent2.setPackage(context.getPackageName());
                    intent2.putExtra("ct_type", CTNotificationIntentService.TYPE_BUTTON_CLICK);
                    intent2.putExtras(bundle);
                    intent2.putExtra("dl", this.onPlayFromUri);
                    context.startService(intent2);
                    return;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(this.onPlayFromUri));
                intent3.removeExtra("wzrk_acts");
                intent3.putExtra("wzrk_from", "CTPushNotificationReceiver");
                intent3.setFlags(872415232);
                MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context, bundle, this.MediaBrowserCompatCustomActionResultReceiver);
                intent3.putExtras(bundle);
                intent3.putExtra("wzrk_dl", this.onPlayFromUri);
                context.startActivity(intent3);
                return;
            }
            String str = this.MediaBrowserCompatSearchResultReceiver.get(0);
            if (1 == bundle.getInt("clickedStar", 0)) {
                bundle.putString("wzrk_c2a", "rating_1");
                if (this.MediaBrowserCompatSearchResultReceiver.size() > 0) {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                }
            }
            if (2 == bundle.getInt("clickedStar", 0)) {
                bundle.putString("wzrk_c2a", "rating_2");
                if (this.MediaBrowserCompatSearchResultReceiver.size() > 1) {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(1);
                } else {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                }
            }
            if (3 == bundle.getInt("clickedStar", 0)) {
                bundle.putString("wzrk_c2a", "rating_3");
                if (this.MediaBrowserCompatSearchResultReceiver.size() > 2) {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(2);
                } else {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                }
            }
            if (4 == bundle.getInt("clickedStar", 0)) {
                bundle.putString("wzrk_c2a", "rating_4");
                if (this.MediaBrowserCompatSearchResultReceiver.size() > 3) {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(3);
                } else {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                }
            }
            if (5 == bundle.getInt("clickedStar", 0)) {
                bundle.putString("wzrk_c2a", "rating_5");
                if (this.MediaBrowserCompatSearchResultReceiver.size() > 4) {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(4);
                } else {
                    str = this.MediaBrowserCompatSearchResultReceiver.get(0);
                }
            }
            Notification notificationRemoteActionCompatParcelizer = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(context, i);
            if (notificationRemoteActionCompatParcelizer == null) {
                onDrmSessionAcquired.IconCompatParcelizer();
                return;
            }
            this.MediaBrowserCompatMediaItem = notificationRemoteActionCompatParcelizer.bigContentView;
            this.RatingCompat = notificationRemoteActionCompatParcelizer.contentView;
            if (1 == bundle.getInt("clickedStar", 0)) {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                this.IconCompatParcelizer = false;
            } else {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (2 == bundle.getInt("clickedStar", 0)) {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                this.AudioAttributesCompatParcelizer = false;
            } else {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (3 == bundle.getInt("clickedStar", 0)) {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_filled);
                this.write = false;
            } else {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (4 == bundle.getInt("clickedStar", 0)) {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_filled);
                this.AudioAttributesImplApi21Parcelizer = false;
            } else {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (5 == bundle.getInt("clickedStar", 0)) {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_filled);
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star5, onUpstreamDiscarded.read.pt_star_filled);
                this.AudioAttributesImplBaseParcelizer = false;
            } else {
                this.MediaBrowserCompatMediaItem.setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star5, onUpstreamDiscarded.read.pt_star_outline);
            }
            IconCompatParcelizer(context, intent);
            bundle.putString("wzrk_dl", str);
            this.MediaBrowserCompatMediaItem.setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.tVRatingConfirmation, getAdGroupIndexForPositionUs.write(bundle, context));
            AudioAttributesCompatParcelizer(context);
            _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context, notificationRemoteActionCompatParcelizer);
            PendingIntent pendingIntentAudioAttributesCompatParcelizer = MetadataRetrieverMetadataRetrieverInternal.AudioAttributesCompatParcelizer(context, bundle, new Intent(context, (Class<?>) onLoadError.class));
            if (this.onCustomAction != null) {
                audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(this.onRemoveQueueItem).IconCompatParcelizer(this.RatingCompat).write(this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer((CharSequence) this.onPrepareFromUri).IconCompatParcelizer(pendingIntentAudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(true);
                this.onCustomAction.notify(i, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
            }
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(context, this.MediaBrowserCompatCustomActionResultReceiver, "Rating Submitted", MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(bundle));
            if (Build.VERSION.SDK_INT < 31) {
                read(context, bundle, i, str, this.MediaBrowserCompatCustomActionResultReceiver);
            }
        } catch (Throwable unused2) {
            onDrmSessionAcquired.read();
        }
    }

    private static void IconCompatParcelizer(Context context, Intent intent) {
        for (int i : intent.getIntArrayExtra("requestCodes")) {
            PendingIntent.getBroadcast(context, i, intent, 201326592).cancel();
        }
    }

    private void read(Context context, Bundle bundle, int i, String str, CleverTapInstanceConfig cleverTapInstanceConfig) throws InterruptedException {
        Intent launchIntentForPackage;
        Thread.sleep(1000L);
        this.onCustomAction.cancel(i);
        RemoteActionCompatParcelizer(context, this.onPrepare, cleverTapInstanceConfig);
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        if (bundle.containsKey("wzrk_dl")) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(bundle.getString("wzrk_dl")));
            RendererCapabilitiesListener.RemoteActionCompatParcelizer(context, launchIntentForPackage);
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return;
            }
        }
        launchIntentForPackage.putExtras(bundle);
        launchIntentForPackage.putExtra("wzrk_dl", str);
        launchIntentForPackage.removeExtra("wzrk_acts");
        launchIntentForPackage.putExtra("wzrk_from", "CTPushNotificationReceiver");
        launchIntentForPackage.setFlags(872415232);
        context.startActivity(launchIntentForPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(Context context, Bundle bundle) {
        try {
            int i = bundle.getInt("notificationId");
            Notification notificationRemoteActionCompatParcelizer = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(context, i);
            if (notificationRemoteActionCompatParcelizer == null) {
                onDrmSessionAcquired.IconCompatParcelizer();
                return;
            }
            this.MediaBrowserCompatItemReceiver = notificationRemoteActionCompatParcelizer.bigContentView;
            this.RatingCompat = notificationRemoteActionCompatParcelizer.contentView;
            String str = this.onPrepareFromSearch;
            boolean z = (str == null || str.isEmpty()) ? false : true;
            RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, context);
            if (!z) {
                RemoteActionCompatParcelizer(this.RatingCompat, context);
            }
            int i2 = bundle.getInt("pt_current_position");
            this.MediaBrowserCompatItemReceiver.setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image, i2);
            this.MediaDescriptionCompat = bundle.getStringArrayList("pt_image_list");
            this.MediaBrowserCompatSearchResultReceiver = bundle.getStringArrayList("pt_deeplink_list");
            this.RemoteActionCompatParcelizer = bundle.getStringArrayList("pt_big_text_list");
            this.onSeekTo = bundle.getStringArrayList("pt_small_text_list");
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = bundle.getStringArrayList("pt_price_list");
            String str2 = this.MediaBrowserCompatSearchResultReceiver.get(i2);
            if (!z) {
                this.MediaBrowserCompatItemReceiver.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.title, this.RemoteActionCompatParcelizer.get(i2));
            } else {
                this.MediaBrowserCompatItemReceiver.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_name, this.RemoteActionCompatParcelizer.get(i2));
            }
            this.MediaBrowserCompatItemReceiver.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, this.onSeekTo.get(i2));
            this.MediaBrowserCompatItemReceiver.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_price, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i2));
            bundle.remove("pt_current_position");
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putBoolean("img1", true);
            bundle2.putInt("notificationId", i);
            bundle2.putString("pt_buy_now_dl", str2);
            bundle2.putBoolean("buynow", true);
            this.MediaBrowserCompatItemReceiver.setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_action, MetadataRetrieverMetadataRetrieverInternal.read(context, bundle2, str2, i));
            _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context, notificationRemoteActionCompatParcelizer);
            Bundle bundle3 = (Bundle) bundle.clone();
            bundle3.putString("wzrk_dl", str2);
            PendingIntent pendingIntentIconCompatParcelizer = MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle3, true, 20, null);
            if (this.onCustomAction != null) {
                PendingIntent pendingIntentAudioAttributesCompatParcelizer = MetadataRetrieverMetadataRetrieverInternal.AudioAttributesCompatParcelizer(context, bundle, new Intent(context, (Class<?>) onLoadError.class));
                AudioAttributesCompatParcelizer(context);
                IconCompatParcelizer(audioAttributesImplBaseParcelizer, this.RatingCompat, this.MediaBrowserCompatItemReceiver, this.onPrepareFromUri, pendingIntentIconCompatParcelizer, pendingIntentAudioAttributesCompatParcelizer);
                this.onCustomAction.notify(i, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
            }
        } catch (Throwable unused) {
            onDrmSessionAcquired.read();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(Context context, Bundle bundle) {
        int i = bundle.getInt("notificationId");
        bundle.putString("wzrk_dl", null);
        if (this.AudioAttributesImplApi26Parcelizer == bundle.getBoolean("close")) {
            bundle.putString("wzrk_c2a", "5cta_close");
            this.onCustomAction.cancel(i);
        }
        MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context, bundle, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private void IconCompatParcelizer(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, RemoteViews remoteViews, RemoteViews remoteViews2, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(this.onRemoveQueueItem).IconCompatParcelizer(remoteViews).write(remoteViews2).RemoteActionCompatParcelizer(Html.fromHtml(str)).IconCompatParcelizer(pendingIntent2).read(pendingIntent).RemoteActionCompatParcelizer(5).RemoteActionCompatParcelizer(System.currentTimeMillis()).RemoteActionCompatParcelizer(true);
    }

    private void RemoteActionCompatParcelizer(RemoteViews remoteViews, Context context) {
        remoteViews.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.app_name, MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(context));
        remoteViews.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.timestamp, MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context, System.currentTimeMillis()));
        String str = this.onPlayFromSearch;
        if (str != null && !str.isEmpty()) {
            remoteViews.setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.subtitle, Html.fromHtml(this.onPlayFromSearch, 0));
        } else {
            remoteViews.setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.subtitle, 8);
            remoteViews.setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.sep_subtitle, 8);
        }
        String str2 = this.onMediaButtonEvent;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        remoteViews.setTextColor(onUpstreamDiscarded.AudioAttributesCompatParcelizer.app_name, MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(this.onMediaButtonEvent, "#A6A6A6"));
        remoteViews.setTextColor(onUpstreamDiscarded.AudioAttributesCompatParcelizer.timestamp, MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(this.onMediaButtonEvent, "#A6A6A6"));
        remoteViews.setTextColor(onUpstreamDiscarded.AudioAttributesCompatParcelizer.subtitle, MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(this.onMediaButtonEvent, "#A6A6A6"));
    }

    private static void read(String str, Bundle bundle, Context context, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, String str2) {
        if (str != null && str.startsWith("http")) {
            try {
                Bitmap bitmap = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(str, context);
                if (bitmap == null) {
                    throw new Exception("Failed to fetch big picture!");
                }
                _coercedTypeDesc.read readVarWrite = new _coercedTypeDesc.read().AudioAttributesCompatParcelizer(bundle.getString("pt_input_feedback")).write(bitmap);
                if (Build.VERSION.SDK_INT >= 31) {
                    readVarWrite.read((CharSequence) str2);
                }
                audioAttributesImplBaseParcelizer.read(readVarWrite);
                return;
            } catch (Throwable unused) {
                onDrmSessionAcquired.read();
            }
        }
        audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(bundle.getString("pt_input_feedback")));
    }

    private void AudioAttributesCompatParcelizer(Context context) {
        try {
            String str = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData, "CLEVERTAP_NOTIFICATION_ICON");
            if (str == null) {
                throw new IllegalArgumentException();
            }
            int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
            this.onRemoveQueueItem = identifier;
            if (identifier == 0) {
                throw new IllegalArgumentException();
            }
        } catch (Throwable unused) {
            this.onRemoveQueueItem = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context);
        }
    }

    private void AudioAttributesCompatParcelizer(Bundle bundle) {
        String str = this.onPrepareFromUri;
        if (str == null || str.isEmpty()) {
            this.onPrepareFromUri = bundle.getString("nt");
        }
        String str2 = this.onPause;
        if (str2 == null || str2.isEmpty()) {
            this.onPause = bundle.getString("nm");
        }
        String str3 = this.onPlay;
        if (str3 == null || str3.isEmpty()) {
            this.onPlay = bundle.getString("wzrk_nms");
        }
        String str4 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (str4 == null || str4.isEmpty()) {
            this.handleMediaPlayPauseIfPendingOnHandler = bundle.getString("wzrk_bp");
        }
        String str5 = this.onPlayFromUri;
        if (str5 == null || str5.isEmpty()) {
            this.onPlayFromUri = bundle.getString("wzrk_dl");
        }
        String str6 = this.onMediaButtonEvent;
        if (str6 == null || str6.isEmpty()) {
            this.onMediaButtonEvent = bundle.getString("wzrk_clr");
        }
        String str7 = this.onPrepareFromMediaId;
        if (str7 == null || str7.isEmpty()) {
            this.onPrepareFromMediaId = bundle.getString("wzrk_clr");
        }
        String str8 = this.onPlayFromSearch;
        if (str8 == null || str8.isEmpty()) {
            this.onPlayFromSearch = bundle.getString("wzrk_st");
        }
    }

    private static void RemoteActionCompatParcelizer(Context context, String str, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (str == null || str.isEmpty()) {
            return;
        }
        MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(context, str, cleverTapInstanceConfig);
    }
}

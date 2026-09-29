package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u001c\u0010\u000e\u001a\u00020\u00108\u0005@\u0004X\u0084\f¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u00020\u00108\u0005@\u0004X\u0085\f¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lo/MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallback;", "Lo/MediaSourceListMediaSourceAndListener;", "Landroid/content/Context;", "p0", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "p1", "Landroid/os/Bundle;", "p2", "", "p3", "<init>", "(Landroid/content/Context;Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;Landroid/os/Bundle;I)V", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;", "", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;)V", "", "read", "(ILjava/lang/String;)V", "IconCompatParcelizer", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;", "write", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallback extends MediaSourceListMediaSourceAndListener {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String write;
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[MediaSourceListForwardingEventListenerExternalSyntheticLambda1.values().length];
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda1.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda1.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public /* synthetic */ MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallback(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, bundle, (i2 & 8) != 0 ? onUpstreamDiscarded.RemoteActionCompatParcelizer.product_display_linear_expanded : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallback(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle, int i) {
        super(context, i, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        ArrayList<String> arrayListAudioAttributesImplBaseParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write(arrayListAudioAttributesImplBaseParcelizer);
        int i2 = 0;
        String str = arrayListAudioAttributesImplBaseParcelizer.get(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        this.RemoteActionCompatParcelizer = str;
        ArrayList<String> arrayListMediaBrowserCompatMediaItem = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatMediaItem();
        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatMediaItem);
        String str2 = arrayListMediaBrowserCompatMediaItem.get(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        this.write = str2;
        ArrayList<String> arrayListOnSkipToNext = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onSkipToNext();
        toMagicModuleMetaRepoModel.write(arrayListOnSkipToNext);
        String str3 = arrayListOnSkipToNext.get(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        this.AudioAttributesCompatParcelizer = str3;
        ArrayList<String> arrayListMediaBrowserCompatItemReceiver = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver);
        String str4 = arrayListMediaBrowserCompatItemReceiver.get(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        this.IconCompatParcelizer = str4;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) bundle.getString("extras_from", ""), (Object) "PTReceiver")) {
            i2 = bundle.getInt("pt_current_position", 0);
            ArrayList<String> arrayListAudioAttributesImplBaseParcelizer2 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.write(arrayListAudioAttributesImplBaseParcelizer2);
            this.RemoteActionCompatParcelizer = arrayListAudioAttributesImplBaseParcelizer2.get(i2);
            ArrayList<String> arrayListMediaBrowserCompatMediaItem2 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatMediaItem2);
            this.write = arrayListMediaBrowserCompatMediaItem2.get(i2);
            ArrayList<String> arrayListOnSkipToNext2 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onSkipToNext();
            toMagicModuleMetaRepoModel.write(arrayListOnSkipToNext2);
            this.AudioAttributesCompatParcelizer = arrayListOnSkipToNext2.get(i2);
            ArrayList<String> arrayListMediaBrowserCompatItemReceiver2 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
            toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver2);
            this.IconCompatParcelizer = arrayListMediaBrowserCompatItemReceiver2.get(i2);
        }
        IconCompatParcelizer();
        ArrayList<String> arrayListAudioAttributesImplBaseParcelizer3 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write(arrayListAudioAttributesImplBaseParcelizer3);
        if (!arrayListAudioAttributesImplBaseParcelizer3.isEmpty()) {
            read(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_name, this.RemoteActionCompatParcelizer);
        }
        ArrayList<String> arrayListMediaBrowserCompatMediaItem3 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatMediaItem();
        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatMediaItem3);
        if (!arrayListMediaBrowserCompatMediaItem3.isEmpty()) {
            read(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_price, this.write);
        }
        IconCompatParcelizer(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_action, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getHandleMediaPlayPauseIfPendingOnHandler());
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_big);
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnAddQueueItem(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_action);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnSetShuffleMode(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_action);
        RemoteActionCompatParcelizer(bundle, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw());
        read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image, i2);
        AudioAttributesCompatParcelizer();
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_image1, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 21, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        ArrayList<String> arrayListMediaBrowserCompatItemReceiver3 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver3);
        if (arrayListMediaBrowserCompatItemReceiver3.size() >= 2) {
            read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_image2, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 22, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        }
        ArrayList<String> arrayListMediaBrowserCompatItemReceiver4 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver4);
        if (arrayListMediaBrowserCompatItemReceiver4.size() >= 3) {
            read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_image3, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 23, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        }
        Object objClone = bundle.clone();
        toMagicModuleMetaRepoModel.read(objClone, "");
        Bundle bundle2 = (Bundle) objClone;
        bundle2.putBoolean("img1", true);
        bundle2.putInt("notificationId", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction());
        bundle2.putString("pt_buy_now_dl", this.IconCompatParcelizer);
        bundle2.putBoolean("buynow", true);
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.product_action, MetadataRetrieverMetadataRetrieverInternal.read(context, bundle2, this.IconCompatParcelizer, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction()));
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    protected final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    protected final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(Bundle p0, MediaSourceListForwardingEventListenerExternalSyntheticLambda1 p1) {
        int i;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_image1));
        arrayList.add(Integer.valueOf(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_image2));
        arrayList.add(Integer.valueOf(onUpstreamDiscarded.AudioAttributesCompatParcelizer.small_image3));
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i2 = IconCompatParcelizer.AudioAttributesCompatParcelizer[p1.ordinal()];
        if (i2 == 1) {
            i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image_fitCenter;
        } else {
            if (i2 != 2) {
                throw new RenewEligibleCreator();
            }
            i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image;
        }
        ArrayList<onDrmSessionManagerError> arrayListAudioAttributesImplApi21Parcelizer = write().AudioAttributesImplApi21Parcelizer();
        int i3 = 0;
        if (arrayListAudioAttributesImplApi21Parcelizer != null) {
            int i4 = 0;
            int i5 = 0;
            for (Object obj : arrayListAudioAttributesImplApi21Parcelizer) {
                if (i5 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                onDrmSessionManagerError ondrmsessionmanagererror = (onDrmSessionManagerError) obj;
                String strAudioAttributesCompatParcelizer = ondrmsessionmanagererror.AudioAttributesCompatParcelizer();
                String str = ondrmsessionmanagererror.read();
                Object obj2 = arrayList.get(i4);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj2, "");
                MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(((Number) obj2).intValue(), strAudioAttributesCompatParcelizer, read(), RemoteActionCompatParcelizer(), str);
                RemoteViews remoteViews = new RemoteViews(RemoteActionCompatParcelizer().getPackageName(), onUpstreamDiscarded.RemoteActionCompatParcelizer.image_view_flipper_dynamic);
                MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(i, strAudioAttributesCompatParcelizer, remoteViews, RemoteActionCompatParcelizer(), str);
                if (!MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer()) {
                    remoteViews.setViewVisibility(i, 0);
                    RemoteViews remoteViews2 = read();
                    Object obj3 = arrayList.get(i4);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj3, "");
                    remoteViews2.setViewVisibility(((Number) obj3).intValue(), 0);
                    read().addView(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image, remoteViews);
                    i4++;
                    arrayList2.add(strAudioAttributesCompatParcelizer);
                } else {
                    ArrayList<String> arrayListMediaBrowserCompatItemReceiver = write().MediaBrowserCompatItemReceiver();
                    if (arrayListMediaBrowserCompatItemReceiver != null) {
                        arrayListMediaBrowserCompatItemReceiver.remove(i5);
                    }
                    ArrayList<String> arrayListAudioAttributesImplBaseParcelizer = write().AudioAttributesImplBaseParcelizer();
                    if (arrayListAudioAttributesImplBaseParcelizer != null) {
                        arrayListAudioAttributesImplBaseParcelizer.remove(i5);
                    }
                    ArrayList<String> arrayListOnSkipToNext = write().onSkipToNext();
                    if (arrayListOnSkipToNext != null) {
                        arrayListOnSkipToNext.remove(i5);
                    }
                    ArrayList<String> arrayListMediaBrowserCompatMediaItem = write().MediaBrowserCompatMediaItem();
                    if (arrayListMediaBrowserCompatMediaItem != null) {
                        arrayListMediaBrowserCompatMediaItem.remove(i5);
                    }
                }
                i5++;
            }
            i3 = i4;
        }
        p0.putStringArrayList("pt_image_list", arrayList2);
        p0.putStringArrayList("pt_deeplink_list", write().MediaBrowserCompatItemReceiver());
        p0.putStringArrayList("pt_big_text_list", write().AudioAttributesImplBaseParcelizer());
        p0.putStringArrayList("pt_small_text_list", write().onSkipToNext());
        p0.putStringArrayList("pt_price_list", write().MediaBrowserCompatMediaItem());
        if (i3 <= 1) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    private void read(int p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p1.length() > 0) {
            read().setTextViewText(p0, Html.fromHtml(p1, 0));
        }
    }

    private final void IconCompatParcelizer(int p0, String p1) {
        if (p1 == null || p1.length() <= 0) {
            return;
        }
        read().setTextViewText(p0, Html.fromHtml(p1, 0));
    }
}

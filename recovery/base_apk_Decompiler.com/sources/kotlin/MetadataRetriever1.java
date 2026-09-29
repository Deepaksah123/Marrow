package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataRetriever1 extends MediaSourceListMediaSourceListInfoRefreshListener {

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

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
            write = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRetriever1(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        int i4;
        super(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, onUpstreamDiscarded.RemoteActionCompatParcelizer.manual_carousel);
        String str4 = "";
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRead());
        MediaSourceListForwardingEventListenerExternalSyntheticLambda1 r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        read().setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.leftArrowPos0, 0);
        read().setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.rightArrowPos0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        int i5 = AudioAttributesCompatParcelizer.write[r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.ordinal()];
        if (i5 == 1) {
            i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image_fitCenter;
        } else {
            if (i5 != 2) {
                throw new RenewEligibleCreator();
            }
            i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image;
        }
        ArrayList<onDrmSessionManagerError> arrayListAudioAttributesImplApi21Parcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer();
        if (arrayListAudioAttributesImplApi21Parcelizer != null) {
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            boolean z = false;
            for (Object obj : arrayListAudioAttributesImplApi21Parcelizer) {
                if (i6 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                onDrmSessionManagerError ondrmsessionmanagererror = (onDrmSessionManagerError) obj;
                String strAudioAttributesCompatParcelizer = ondrmsessionmanagererror.AudioAttributesCompatParcelizer();
                String str5 = ondrmsessionmanagererror.read();
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), onUpstreamDiscarded.RemoteActionCompatParcelizer.image_view_flipper_dynamic);
                MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(i, strAudioAttributesCompatParcelizer, remoteViews, context, str4);
                if (!MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer()) {
                    if (z) {
                        i4 = 0;
                    } else {
                        i2 = i6;
                        i4 = 0;
                        z = true;
                    }
                    remoteViews.setViewVisibility(i, i4);
                    RemoteViews remoteViewsClone = remoteViews.clone();
                    str3 = str4;
                    read().addView(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right, remoteViews);
                    read().addView(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left, remoteViews);
                    remoteViewsClone.setContentDescription(i, str5);
                    read().addView(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image, remoteViewsClone);
                    i3++;
                    arrayList.add(strAudioAttributesCompatParcelizer);
                } else {
                    str3 = str4;
                    ArrayList<String> arrayListMediaBrowserCompatItemReceiver = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                    if (arrayListMediaBrowserCompatItemReceiver != null && i3 < arrayListMediaBrowserCompatItemReceiver.size()) {
                        arrayListMediaBrowserCompatItemReceiver.remove(i3);
                    }
                    onDrmSessionAcquired.RemoteActionCompatParcelizer();
                }
                i6++;
                str4 = str3;
            }
            str = str4;
        } else {
            str = "";
            i2 = 0;
            i3 = 0;
        }
        if (mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getParcelableVolumeInfo() == null || !TestGroupLSModel.read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getParcelableVolumeInfo(), "filmstrip", true)) {
            read().setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right, 8);
            read().setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left, 8);
        }
        if (bundle.containsKey("right_swipe")) {
            boolean z2 = bundle.getBoolean("right_swipe");
            int i7 = bundle.getInt("pt_manual_carousel_current");
            int i8 = i7 == arrayList.size() - 1 ? 0 : i7 + 1;
            int size = i7 == 0 ? arrayList.size() - 1 : i7 - 1;
            read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image, i7);
            read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right, i8);
            read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left, size);
            if (z2) {
                read().showNext(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image);
                read().showNext(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right);
                read().showNext(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left);
            } else {
                read().showPrevious(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image);
                read().showPrevious(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right);
                read().showPrevious(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left);
                i8 = size;
            }
            ArrayList<String> arrayListMediaBrowserCompatItemReceiver2 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
            if (arrayListMediaBrowserCompatItemReceiver2 != null && arrayListMediaBrowserCompatItemReceiver2.size() == arrayList.size()) {
                str2 = arrayListMediaBrowserCompatItemReceiver2.get(i8);
            } else if (arrayListMediaBrowserCompatItemReceiver2 != null && arrayListMediaBrowserCompatItemReceiver2.size() == 1) {
                str2 = arrayListMediaBrowserCompatItemReceiver2.get(0);
            } else if (arrayListMediaBrowserCompatItemReceiver2 != null && arrayListMediaBrowserCompatItemReceiver2.size() > i8) {
                str2 = arrayListMediaBrowserCompatItemReceiver2.get(i8);
            } else {
                str2 = (arrayListMediaBrowserCompatItemReceiver2 == null || arrayListMediaBrowserCompatItemReceiver2.size() >= i8) ? str : arrayListMediaBrowserCompatItemReceiver2.get(0);
            }
            bundle.putInt("pt_manual_carousel_current", i8);
            bundle.remove("right_swipe");
            bundle.putString("wzrk_dl", str2);
            bundle.putInt("manual_carousel_from", i7);
            read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.rightArrowPos0, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 4, null));
            read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.leftArrowPos0, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 5, null));
            return;
        }
        read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_right, 1);
        read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image, 0);
        read().setDisplayedChild(onUpstreamDiscarded.AudioAttributesCompatParcelizer.carousel_image_left, arrayList.size() - 1);
        bundle.putInt("pt_manual_carousel_current", i2);
        bundle.putStringArrayList("pt_image_list", arrayList);
        bundle.putStringArrayList("pt_deeplink_list", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver());
        ArrayList<String> arrayListMediaBrowserCompatItemReceiver3 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver3);
        bundle.putString("wzrk_dl", arrayListMediaBrowserCompatItemReceiver3.get(0));
        bundle.putInt("manual_carousel_from", 0);
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.rightArrowPos0, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 4, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.leftArrowPos0, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 5, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        if (i3 < 2) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    private final void read(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        read().setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, Html.fromHtml(str, 0));
    }
}

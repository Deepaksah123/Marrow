package kotlin;

import android.content.Context;
import android.text.Html;
import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public final class retrieveMetadata extends MediaSourceListMediaSourceListInfoRefreshListener {

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] read;

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
            read = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public retrieveMetadata(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, onUpstreamDiscarded.RemoteActionCompatParcelizer.auto_carousel);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRead());
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaSessionCompatQueueItem());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw());
    }

    private final void read(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        read().setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, Html.fromHtml(str, 0));
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        read().setInt(onUpstreamDiscarded.AudioAttributesCompatParcelizer.view_flipper, "setFlipInterval", i);
    }

    private final void RemoteActionCompatParcelizer(MediaSourceListForwardingEventListenerExternalSyntheticLambda1 mediaSourceListForwardingEventListenerExternalSyntheticLambda1) {
        int i;
        int i2 = write.read[mediaSourceListForwardingEventListenerExternalSyntheticLambda1.ordinal()];
        if (i2 == 1) {
            i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image_fitCenter;
        } else {
            if (i2 != 2) {
                throw new RenewEligibleCreator();
            }
            i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.big_image;
        }
        ArrayList<onDrmSessionManagerError> arrayListAudioAttributesImplApi21Parcelizer = write().AudioAttributesImplApi21Parcelizer();
        if (arrayListAudioAttributesImplApi21Parcelizer != null) {
            for (onDrmSessionManagerError ondrmsessionmanagererror : arrayListAudioAttributesImplApi21Parcelizer) {
                String strAudioAttributesCompatParcelizer = ondrmsessionmanagererror.AudioAttributesCompatParcelizer();
                String str = ondrmsessionmanagererror.read();
                RemoteViews remoteViews = new RemoteViews(RemoteActionCompatParcelizer().getPackageName(), onUpstreamDiscarded.RemoteActionCompatParcelizer.image_view_flipper_dynamic);
                MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(i, strAudioAttributesCompatParcelizer, remoteViews, RemoteActionCompatParcelizer(), str);
                if (!MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer()) {
                    remoteViews.setViewVisibility(i, 0);
                    read().addView(onUpstreamDiscarded.AudioAttributesCompatParcelizer.view_flipper, remoteViews);
                } else {
                    onDrmSessionAcquired.RemoteActionCompatParcelizer();
                }
            }
        }
    }
}

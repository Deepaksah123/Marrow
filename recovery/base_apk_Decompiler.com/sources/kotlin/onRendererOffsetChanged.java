package kotlin;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Random;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public final class onRendererOffsetChanged extends MediaSourceListMediaSourceListInfoRefreshListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onRendererOffsetChanged(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, onUpstreamDiscarded.RemoteActionCompatParcelizer.rating);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_outline);
        read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_outline);
        read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_outline);
        read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_outline);
        read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star5, onUpstreamDiscarded.read.pt_star_outline);
        int[] iArr = new int[5];
        for (int i = 0; i < 5; i++) {
            iArr[i] = new Random().nextInt();
        }
        bundle.putIntArray("requestCodes", iArr);
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 8, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 9, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 10, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 11, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star5, MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction(), bundle, false, 12, mediaSourceListForwardingEventListenerExternalSyntheticLambda4));
        if (Build.VERSION.SDK_INT >= 31) {
            read().setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.tVRatingConfirmation, 0);
            bundle.putInt("notificationId", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getPlaybackStateCompatCustomAction());
            read().setOnClickPendingIntent(onUpstreamDiscarded.AudioAttributesCompatParcelizer.tVRatingConfirmation, getAdGroupIndexForPositionUs.write(bundle, context));
        } else {
            read().setViewVisibility(onUpstreamDiscarded.AudioAttributesCompatParcelizer.tVRatingConfirmation, 8);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) bundle.getString("extras_from", ""), (Object) "PTReceiver")) {
            if (1 == bundle.getInt("clickedStar", 0)) {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
            } else {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (2 == bundle.getInt("clickedStar", 0)) {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
            } else {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (3 == bundle.getInt("clickedStar", 0)) {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_filled);
            } else {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (4 == bundle.getInt("clickedStar", 0)) {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_filled);
            } else {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_outline);
            }
            if (5 == bundle.getInt("clickedStar", 0)) {
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star1, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star2, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star3, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star4, onUpstreamDiscarded.read.pt_star_filled);
                read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star5, onUpstreamDiscarded.read.pt_star_filled);
                return;
            }
            read().setImageViewResource(onUpstreamDiscarded.AudioAttributesCompatParcelizer.star5, onUpstreamDiscarded.read.pt_star_outline);
        }
    }
}

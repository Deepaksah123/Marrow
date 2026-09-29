package kotlin;

import android.content.Context;
import android.os.SystemClock;
import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/ParserException;", "Lo/MetadataRetriever;", "Landroid/content/Context;", "p0", "", "p1", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "p2", "p3", "<init>", "(Landroid/content/Context;Ljava/lang/Integer;Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;I)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ParserException extends MetadataRetriever {
    public /* synthetic */ ParserException(Context context, Integer num, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, num, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, (i2 & 8) != 0 ? onUpstreamDiscarded.RemoteActionCompatParcelizer.timer_collapsed : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParserException(Context context, Integer num, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, int i) {
        super(context, i, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        IconCompatParcelizer();
        write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getIconCompatParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRemoteActionCompatParcelizer());
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_small);
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.chronometer);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.title);
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaDescriptionCompat(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatCustomActionResultReceiver(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg);
        RemoteViews remoteViews = read();
        int i2 = onUpstreamDiscarded.AudioAttributesCompatParcelizer.chronometer;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        toMagicModuleMetaRepoModel.write(num);
        remoteViews.setChronometer(i2, jElapsedRealtime + ((long) num.intValue()), null, true);
        read().setChronometerCountDown(onUpstreamDiscarded.AudioAttributesCompatParcelizer.chronometer, true);
        AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer(String p0, String p1) {
        if (onLoadStarted.read(p0)) {
            RemoteActionCompatParcelizer(p0, onUpstreamDiscarded.AudioAttributesCompatParcelizer.chronometer);
        } else if (onLoadStarted.read(p1)) {
            RemoteActionCompatParcelizer(p1, onUpstreamDiscarded.AudioAttributesCompatParcelizer.chronometer);
        }
    }
}

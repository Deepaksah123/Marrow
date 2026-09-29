package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.lambdaonVideoDisabled18;
import kotlin.lambdaonVideoFrameProcessingOffset20;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\t\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0007¢\u0006\u0004\b \u0010\u0003J!\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\t\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\u0011\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u001c\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0006*\u00020-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lo/lambdaonTrackSelectionParametersChanged57;", "", "<init>", "()V", "Lo/lambdaonSkipSilenceEnabledChanged53;", "p0", "Lo/lambdaonUpstreamDiscarded27;", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/lambdaonSkipSilenceEnabledChanged53;Lo/lambdaonUpstreamDiscarded27;)V", "Lo/lambdaonVideoSizeChanged56;", "", "p2", "Lo/lambdaonVideoInputFormatChanged15;", "p3", "Lcom/facebook/GraphRequest;", "read", "(Lo/lambdaonSkipSilenceEnabledChanged53;Lo/lambdaonVideoSizeChanged56;ZLo/lambdaonVideoInputFormatChanged15;)Lcom/facebook/GraphRequest;", "Lo/lambdaonSurfaceSizeChanged22;", "", "IconCompatParcelizer", "(Lo/lambdaonSurfaceSizeChanged22;Lo/lambdaonVideoInputFormatChanged15;)Ljava/util/List;", "Lo/lambdaonVideoEnabled13;", "(Lo/lambdaonVideoEnabled13;)V", "write", "", "AudioAttributesImplApi21Parcelizer", "()Ljava/util/Set;", "Lo/lambdaonPlayerError41;", "p4", "(Lo/lambdaonSkipSilenceEnabledChanged53;Lcom/facebook/GraphRequest;Lo/lambdaonPlayerError41;Lo/lambdaonVideoSizeChanged56;Lo/lambdaonVideoInputFormatChanged15;)V", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/lambdaonVideoEnabled13;Lo/lambdaonSurfaceSizeChanged22;)Lo/lambdaonVideoInputFormatChanged15;", "", "I", "RemoteActionCompatParcelizer", "", "Ljava/lang/String;", "Lo/lambdaonSurfaceSizeChanged22;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/ScheduledFuture;", "AudioAttributesImplBaseParcelizer", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "AudioAttributesImplApi26Parcelizer", "Ljava/util/concurrent/ScheduledExecutorService;"}, k = 1, mv = {1, 4, 0})
public final class lambdaonTrackSelectionParametersChanged57 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final Runnable read;
    private static final ScheduledExecutorService AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static ScheduledFuture<?> write;
    public static final lambdaonTrackSelectionParametersChanged57 INSTANCE = new lambdaonTrackSelectionParametersChanged57();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static volatile lambdaonSurfaceSizeChanged22 IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final int RemoteActionCompatParcelizer;

    static {
        String name = lambdaonTrackSelectionParametersChanged57.class.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        AudioAttributesCompatParcelizer = name;
        RemoteActionCompatParcelizer = 100;
        IconCompatParcelizer = new lambdaonSurfaceSizeChanged22();
        AudioAttributesImplApi26Parcelizer = Executors.newSingleThreadScheduledExecutor();
        read = new Runnable() { // from class: o.lambdaonTrackSelectionParametersChanged57.1
            @Override // java.lang.Runnable
            public final void run() {
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                } catch (Throwable th) {
                    getMinWindowSequenceNumber.read(th, this);
                }
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged57 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                    lambdaonTrackSelectionParametersChanged57.IconCompatParcelizer(null);
                    if (lambdaonVideoDisabled18.read() != lambdaonVideoDisabled18.RemoteActionCompatParcelizer.EXPLICIT_ONLY) {
                        lambdaonTrackSelectionParametersChanged57.write(lambdaonVideoEnabled13.TIMER);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    getMinWindowSequenceNumber.read(th2, this);
                    return;
                }
                getMinWindowSequenceNumber.read(th, this);
            }
        };
    }

    private lambdaonTrackSelectionParametersChanged57() {
    }

    public static final /* synthetic */ ScheduledFuture AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            return write;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(lambdaonSurfaceSizeChanged22 lambdaonsurfacesizechanged22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            IconCompatParcelizer = lambdaonsurfacesizechanged22;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }

    public static final /* synthetic */ lambdaonSurfaceSizeChanged22 IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            return IconCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(ScheduledFuture scheduledFuture) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            write = scheduledFuture;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }

    public static final /* synthetic */ Runnable RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            return read;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledExecutorService read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            return AudioAttributesImplApi26Parcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    public static final /* synthetic */ int write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return 0;
        }
        try {
            return RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return 0;
        }
    }

    @getMagicModuleMeta
    public static final void MediaBrowserCompatCustomActionResultReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            AudioAttributesImplApi26Parcelizer.execute(new Runnable() { // from class: o.lambdaonTrackSelectionParametersChanged57.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged57 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                            lambdaonTimelineChanged29.write(lambdaonTrackSelectionParametersChanged57.IconCompatParcelizer());
                            lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged572 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                            lambdaonTrackSelectionParametersChanged57.AudioAttributesCompatParcelizer(new lambdaonSurfaceSizeChanged22());
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    } catch (Throwable th2) {
                        getMinWindowSequenceNumber.read(th2, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(final lambdaonVideoEnabled13 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            AudioAttributesImplApi26Parcelizer.execute(new Runnable() { // from class: o.lambdaonTrackSelectionParametersChanged57.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            lambdaonTrackSelectionParametersChanged57.write(p0);
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    } catch (Throwable th2) {
                        getMinWindowSequenceNumber.read(th2, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(final lambdaonSkipSilenceEnabledChanged53 p0, final lambdaonUpstreamDiscarded27 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            AudioAttributesImplApi26Parcelizer.execute(new Runnable() { // from class: o.lambdaonTrackSelectionParametersChanged57.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged57 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                            lambdaonTrackSelectionParametersChanged57.IconCompatParcelizer().IconCompatParcelizer(p0, p1);
                            if (lambdaonVideoDisabled18.read() != lambdaonVideoDisabled18.RemoteActionCompatParcelizer.EXPLICIT_ONLY) {
                                lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged572 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                                int i = lambdaonTrackSelectionParametersChanged57.IconCompatParcelizer().read();
                                lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged573 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                                if (i > lambdaonTrackSelectionParametersChanged57.write()) {
                                    lambdaonTrackSelectionParametersChanged57.write(lambdaonVideoEnabled13.EVENT_THRESHOLD);
                                    return;
                                }
                            }
                            lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged574 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                            if (lambdaonTrackSelectionParametersChanged57.AudioAttributesCompatParcelizer() == null) {
                                lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged575 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                                lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged576 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                                ScheduledExecutorService scheduledExecutorService = lambdaonTrackSelectionParametersChanged57.read();
                                lambdaonTrackSelectionParametersChanged57 lambdaontrackselectionparameterschanged577 = lambdaonTrackSelectionParametersChanged57.INSTANCE;
                                lambdaonTrackSelectionParametersChanged57.IconCompatParcelizer(scheduledExecutorService.schedule(lambdaonTrackSelectionParametersChanged57.RemoteActionCompatParcelizer(), 15L, TimeUnit.SECONDS));
                            }
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    } catch (Throwable th2) {
                        getMinWindowSequenceNumber.read(th2, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }

    @getMagicModuleMeta
    public static final Set<lambdaonSkipSilenceEnabledChanged53> AudioAttributesImplApi21Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            return IconCompatParcelizer.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void write(lambdaonVideoEnabled13 p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            IconCompatParcelizer.read(lambdaonTimelineChanged29.write());
            try {
                lambdaonVideoInputFormatChanged15 lambdaonvideoinputformatchanged15Write = write(p0, IconCompatParcelizer);
                if (lambdaonvideoinputformatchanged15Write != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", lambdaonvideoinputformatchanged15Write.AudioAttributesCompatParcelizer());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", lambdaonvideoinputformatchanged15Write.IconCompatParcelizer());
                    getProvider.getInstance(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(intent);
                }
            } catch (Exception e) {
                Exception exc = e;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }

    @getMagicModuleMeta
    private static lambdaonVideoInputFormatChanged15 write(lambdaonVideoEnabled13 p0, lambdaonSurfaceSizeChanged22 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            lambdaonVideoInputFormatChanged15 lambdaonvideoinputformatchanged15 = new lambdaonVideoInputFormatChanged15();
            List<GraphRequest> listIconCompatParcelizer = IconCompatParcelizer(p1, lambdaonvideoinputformatchanged15);
            if (listIconCompatParcelizer.isEmpty()) {
                return null;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, AudioAttributesCompatParcelizer, "Flushing %d events due to %s.", Integer.valueOf(lambdaonvideoinputformatchanged15.AudioAttributesCompatParcelizer()), p0.toString());
            Iterator<GraphRequest> it = listIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().MediaBrowserCompatCustomActionResultReceiver();
            }
            return lambdaonvideoinputformatchanged15;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    @getMagicModuleMeta
    private static List<GraphRequest> IconCompatParcelizer(lambdaonSurfaceSizeChanged22 p0, lambdaonVideoInputFormatChanged15 p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            boolean zIconCompatParcelizer = lambdaonMediaMetadataChanged48.IconCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
            ArrayList arrayList = new ArrayList();
            for (lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53 : p0.IconCompatParcelizer()) {
                lambdaonVideoSizeChanged56 lambdaonvideosizechanged56IconCompatParcelizer = p0.IconCompatParcelizer(lambdaonskipsilenceenabledchanged53);
                if (lambdaonvideosizechanged56IconCompatParcelizer != null) {
                    GraphRequest graphRequest = read(lambdaonskipsilenceenabledchanged53, lambdaonvideosizechanged56IconCompatParcelizer, zIconCompatParcelizer, p1);
                    if (graphRequest != null) {
                        arrayList.add(graphRequest);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    @getMagicModuleMeta
    private static GraphRequest read(final lambdaonSkipSilenceEnabledChanged53 p0, final lambdaonVideoSizeChanged56 p1, boolean p2, final lambdaonVideoInputFormatChanged15 p3) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            String write2 = p0.getWrite();
            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(write2, false);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{write2}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            final GraphRequest graphRequestAudioAttributesCompatParcelizer = GraphRequest.Companion.AudioAttributesCompatParcelizer(null, str, null, null);
            Bundle mediaBrowserCompatMediaItem = graphRequestAudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem();
            if (mediaBrowserCompatMediaItem == null) {
                mediaBrowserCompatMediaItem = new Bundle();
            }
            mediaBrowserCompatMediaItem.putString("access_token", p0.getRead());
            lambdaonVideoFrameProcessingOffset20.Companion companion2 = lambdaonVideoFrameProcessingOffset20.INSTANCE;
            String strWrite = lambdaonVideoFrameProcessingOffset20.Companion.write();
            if (strWrite != null) {
                mediaBrowserCompatMediaItem.putString("device_token", strWrite);
            }
            String strAudioAttributesCompatParcelizer = lambdaonVideoCodecError21.AudioAttributesCompatParcelizer();
            if (strAudioAttributesCompatParcelizer != null) {
                mediaBrowserCompatMediaItem.putString("install_referrer", strAudioAttributesCompatParcelizer);
            }
            graphRequestAudioAttributesCompatParcelizer.read(mediaBrowserCompatMediaItem);
            boolean onCommand = defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer != null ? defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getOnCommand() : false;
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            int iIconCompatParcelizer = p1.IconCompatParcelizer(graphRequestAudioAttributesCompatParcelizer, contextAudioAttributesCompatParcelizer, onCommand, p2);
            if (iIconCompatParcelizer == 0) {
                return null;
            }
            p3.read(p3.AudioAttributesCompatParcelizer() + iIconCompatParcelizer);
            graphRequestAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new GraphRequest.write() { // from class: o.lambdaonTrackSelectionParametersChanged57.2
                @Override // com.facebook.GraphRequest.write
                public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                    toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                    lambdaonTrackSelectionParametersChanged57.write(p0, graphRequestAudioAttributesCompatParcelizer, lambdaonplayererror41, p1, p3);
                }
            });
            return graphRequestAudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void write(final lambdaonSkipSilenceEnabledChanged53 p0, GraphRequest p1, lambdaonPlayerError41 p2, final lambdaonVideoSizeChanged56 p3, lambdaonVideoInputFormatChanged15 p4) {
        String str;
        String string;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonTrackSelectionParametersChanged57.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            FacebookRequestError write2 = p2.getWrite();
            lambdaonVideoDecoderInitialized14 lambdaonvideodecoderinitialized14 = lambdaonVideoDecoderInitialized14.SUCCESS;
            if (write2 == null) {
                str = "Success";
            } else if (write2.getAudioAttributesImplApi21Parcelizer() == -1) {
                lambdaonvideodecoderinitialized14 = lambdaonVideoDecoderInitialized14.NO_CONNECTIVITY;
                str = "Failed: No Connectivity";
            } else {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{p2.toString(), write2.toString()}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                lambdaonvideodecoderinitialized14 = lambdaonVideoDecoderInitialized14.SERVER_ERROR;
            }
            if (lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) p1.getMediaDescriptionCompat()).toString(2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, AudioAttributesCompatParcelizer, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(p1.getMediaBrowserCompatCustomActionResultReceiver()), str, string);
            }
            p3.IconCompatParcelizer(write2 != null);
            if (lambdaonvideodecoderinitialized14 == lambdaonVideoDecoderInitialized14.NO_CONNECTIVITY) {
                lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.lambdaonTrackSelectionParametersChanged57.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                return;
                            }
                            try {
                                lambdaonTimelineChanged29.write(p0, p3);
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        } catch (Throwable th2) {
                            getMinWindowSequenceNumber.read(th2, this);
                        }
                    }
                });
            }
            if (lambdaonvideodecoderinitialized14 == lambdaonVideoDecoderInitialized14.SUCCESS || p4.IconCompatParcelizer() == lambdaonVideoDecoderInitialized14.NO_CONNECTIVITY) {
                return;
            }
            p4.RemoteActionCompatParcelizer(lambdaonvideodecoderinitialized14);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonTrackSelectionParametersChanged57.class);
        }
    }
}

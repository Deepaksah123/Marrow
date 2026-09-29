package kotlin;

import android.content.Context;
import android.util.Pair;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class updateTrackSelectionPlaybackSpeed {
    private final moveMediaSources AudioAttributesCompatParcelizer;
    private final lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal RemoteActionCompatParcelizer;

    public updateTrackSelectionPlaybackSpeed(lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal, moveMediaSources movemediasources) {
        this.RemoteActionCompatParcelizer = lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        this.AudioAttributesCompatParcelizer = movemediasources;
    }

    public final onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> read(Context context, String str, String str2) {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer = IconCompatParcelizer(context, str, str2);
        if (exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer != null) {
            return new onDroppedFrames<>(exoPlayerImplExternalSyntheticLambda19IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder("Animation for ");
        sb.append(str);
        sb.append(" not found in cache. Fetching from network.");
        access3000.write(sb.toString());
        return RemoteActionCompatParcelizer(context, str, str2);
    }

    private ExoPlayerImplExternalSyntheticLambda19 IconCompatParcelizer(Context context, String str, String str2) {
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        Pair<updateLoadControlTrackSelection, InputStream> pairRemoteActionCompatParcelizer;
        onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes;
        if (str2 == null || (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = this.RemoteActionCompatParcelizer) == null || (pairRemoteActionCompatParcelizer = lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal.RemoteActionCompatParcelizer(str)) == null) {
            return null;
        }
        updateLoadControlTrackSelection updateloadcontroltrackselection = (updateLoadControlTrackSelection) pairRemoteActionCompatParcelizer.first;
        InputStream inputStream = (InputStream) pairRemoteActionCompatParcelizer.second;
        int i = AnonymousClass2.RemoteActionCompatParcelizer[updateloadcontroltrackselection.ordinal()];
        if (i == 1) {
            ondroppedframes = ExoPlayerImplExternalSyntheticLambda21.read(context, new ZipInputStream(inputStream), str2);
        } else if (i == 2) {
            try {
                ondroppedframes = ExoPlayerImplExternalSyntheticLambda21.write(new GZIPInputStream(inputStream), str2);
            } catch (IOException e) {
                ondroppedframes = new onDroppedFrames<>(e);
            }
        } else {
            ondroppedframes = ExoPlayerImplExternalSyntheticLambda21.write(inputStream, str2);
        }
        if (ondroppedframes.IconCompatParcelizer() != null) {
            return ondroppedframes.IconCompatParcelizer();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.updateTrackSelectionPlaybackSpeed$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[updateLoadControlTrackSelection.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[updateLoadControlTrackSelection.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[updateLoadControlTrackSelection.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(Context context, String str, String str2) {
        onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes;
        access3000.write("Fetching ".concat(String.valueOf(str)));
        waitUninterruptibly waituninterruptibly = null;
        try {
            try {
                waitUninterruptibly waituninterruptiblyRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
                if (waituninterruptiblyRemoteActionCompatParcelizer.write()) {
                    ondroppedframes = AudioAttributesCompatParcelizer(context, str, waituninterruptiblyRemoteActionCompatParcelizer.read(), waituninterruptiblyRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), str2);
                    StringBuilder sb = new StringBuilder("Completed fetch from network. Success: ");
                    sb.append(ondroppedframes.IconCompatParcelizer() != null);
                    access3000.write(sb.toString());
                } else {
                    ondroppedframes = new onDroppedFrames<>(new IllegalArgumentException(waituninterruptiblyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()));
                }
                try {
                    waituninterruptiblyRemoteActionCompatParcelizer.close();
                    return ondroppedframes;
                } catch (IOException e) {
                    access3000.IconCompatParcelizer("LottieFetchResult close failed ", e);
                    return ondroppedframes;
                }
            } catch (Exception e2) {
                onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframes2 = new onDroppedFrames<>(e2);
                if (0 != 0) {
                    try {
                        waituninterruptibly.close();
                    } catch (IOException e3) {
                        access3000.IconCompatParcelizer("LottieFetchResult close failed ", e3);
                    }
                }
                return ondroppedframes2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    waituninterruptibly.close();
                } catch (IOException e4) {
                    access3000.IconCompatParcelizer("LottieFetchResult close failed ", e4);
                }
            }
            throw th;
        }
    }

    private onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> AudioAttributesCompatParcelizer(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframesRemoteActionCompatParcelizer;
        updateLoadControlTrackSelection updateloadcontroltrackselection;
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            access3000.write("Handling zip response.");
            updateLoadControlTrackSelection updateloadcontroltrackselection2 = updateLoadControlTrackSelection.ZIP;
            ondroppedframesRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, str, inputStream, str3);
            updateloadcontroltrackselection = updateloadcontroltrackselection2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            access3000.write("Handling gzip response.");
            updateloadcontroltrackselection = updateLoadControlTrackSelection.GZIP;
            ondroppedframesRemoteActionCompatParcelizer = IconCompatParcelizer(str, inputStream, str3);
        } else {
            access3000.write("Received json response.");
            updateloadcontroltrackselection = updateLoadControlTrackSelection.JSON;
            ondroppedframesRemoteActionCompatParcelizer = write(str, inputStream, str3);
        }
        if (str3 != null && ondroppedframesRemoteActionCompatParcelizer.IconCompatParcelizer() != null && (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = this.RemoteActionCompatParcelizer) != null) {
            lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal.RemoteActionCompatParcelizer(str, updateloadcontroltrackselection);
        }
        return ondroppedframesRemoteActionCompatParcelizer;
    }

    private onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(Context context, String str, InputStream inputStream, String str2) throws IOException {
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        if (str2 == null || (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = this.RemoteActionCompatParcelizer) == null) {
            return ExoPlayerImplExternalSyntheticLambda21.read(context, new ZipInputStream(inputStream), (String) null);
        }
        return ExoPlayerImplExternalSyntheticLambda21.read(context, new ZipInputStream(new FileInputStream(lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal.read(str, inputStream, updateLoadControlTrackSelection.ZIP))), str);
    }

    private onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> IconCompatParcelizer(String str, InputStream inputStream, String str2) throws IOException {
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        if (str2 == null || (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = this.RemoteActionCompatParcelizer) == null) {
            return ExoPlayerImplExternalSyntheticLambda21.write(new GZIPInputStream(inputStream), (String) null);
        }
        return ExoPlayerImplExternalSyntheticLambda21.write(new GZIPInputStream(new FileInputStream(lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal.read(str, inputStream, updateLoadControlTrackSelection.GZIP))), str);
    }

    private onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> write(String str, InputStream inputStream, String str2) throws IOException {
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        if (str2 == null || (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = this.RemoteActionCompatParcelizer) == null) {
            return ExoPlayerImplExternalSyntheticLambda21.write(inputStream, (String) null);
        }
        return ExoPlayerImplExternalSyntheticLambda21.write(new FileInputStream(lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal.read(str, inputStream, updateLoadControlTrackSelection.JSON).getAbsolutePath()), str);
    }
}

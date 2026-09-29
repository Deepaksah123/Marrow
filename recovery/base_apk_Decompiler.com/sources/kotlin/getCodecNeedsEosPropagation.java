package kotlin;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import kotlin.avcProfileNumberToConst;

/* JADX INFO: loaded from: classes3.dex */
public final class getCodecNeedsEosPropagation extends FragmentManager.IconCompatParcelizer {
    private final sortByScore AudioAttributesCompatParcelizer;
    private final MediaCodecUtilCodecKey IconCompatParcelizer;
    private final getCodecOperatingRate RemoteActionCompatParcelizer;
    private final getCodecOutputMediaFormat read;
    private final WeakHashMap<Fragment, Trace> write = new WeakHashMap<>();

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    public getCodecNeedsEosPropagation(MediaCodecUtilCodecKey mediaCodecUtilCodecKey, sortByScore sortbyscore, getCodecOutputMediaFormat getcodecoutputmediaformat, getCodecOperatingRate getcodecoperatingrate) {
        this.IconCompatParcelizer = mediaCodecUtilCodecKey;
        this.AudioAttributesCompatParcelizer = sortbyscore;
        this.read = getcodecoutputmediaformat;
        this.RemoteActionCompatParcelizer = getcodecoperatingrate;
    }

    private static String RemoteActionCompatParcelizer(Fragment fragment) {
        StringBuilder sb = new StringBuilder("_st_");
        sb.append(fragment.getClass().getSimpleName());
        return sb.toString();
    }

    @Override // androidx.fragment.app.FragmentManager.IconCompatParcelizer
    public final void read(FragmentManager fragmentManager, Fragment fragment) {
        String simpleName;
        super.read(fragmentManager, fragment);
        new Object[]{fragment.getClass().getSimpleName()};
        Trace trace = new Trace(RemoteActionCompatParcelizer(fragment), this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read);
        trace.MediaBrowserCompatMediaItem();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.write("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.write("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.write.put(fragment, trace);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(FragmentManager fragmentManager, Fragment fragment) {
        super.AudioAttributesCompatParcelizer(fragmentManager, fragment);
        new Object[]{fragment.getClass().getSimpleName()};
        if (!this.write.containsKey(fragment)) {
            new Object[]{fragment.getClass().getSimpleName()};
            return;
        }
        Trace trace = this.write.get(fragment);
        this.write.remove(fragment);
        MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(fragment);
        if (!mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            new Object[]{fragment.getClass().getSimpleName()};
        } else {
            getCodecInfoAt.AudioAttributesCompatParcelizer(trace, mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            trace.MediaDescriptionCompat();
        }
    }
}

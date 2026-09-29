package kotlin;

import com.marrow.data.models.video.Timeline;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002À\u0006\u0003"}, d2 = {"Lo/WebvttSubtitleExternalSyntheticLambda0;", "", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WebvttSubtitleExternalSyntheticLambda0 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    public interface AudioAttributesCompatParcelizer extends invokeUpdateOutputInternal {
        void AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(String str);

        void IconCompatParcelizer();

        void MediaBrowserCompatCustomActionResultReceiver();

        void RemoteActionCompatParcelizer();

        void read();

        void read(int i);

        void read(String str);

        void write();

        void write(int i);
    }

    public interface IconCompatParcelizer extends Cea608Decoder<AudioAttributesCompatParcelizer, Timeline> {
        void IconCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(boolean z);

        void write(int i);

        void write(boolean z);
    }

    /* JADX INFO: renamed from: o.WebvttSubtitleExternalSyntheticLambda0$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}

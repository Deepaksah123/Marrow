package kotlin;

import com.marrow.data.models.video.Timeline;
import java.util.List;
import kotlin.WebvttSubtitleExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class getNextChunkDurationUs extends SubtitleInputBuffer<WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer, Timeline> implements WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer {
    private boolean AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private final getSampleFormats read;
    private boolean write;

    @setSdkPayload
    public getNextChunkDurationUs(getSampleFormats getsampleformats) {
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        this.read = getsampleformats;
        this.IconCompatParcelizer = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.SubtitleInputBuffer, kotlin.Cea608Decoder
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(WebvttSubtitleExternalSyntheticLambda0.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        List<String> pytMcqIds;
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        super.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, i);
        Timeline timeline = ((Timeline[]) this.RemoteActionCompatParcelizer)[i];
        audioAttributesCompatParcelizer.read(timeline.getStartTime());
        audioAttributesCompatParcelizer.read(timeline.getTimelineTitle());
        if (this.write) {
            audioAttributesCompatParcelizer.write();
            audioAttributesCompatParcelizer.write(timeline.getBookmarkType());
        } else {
            audioAttributesCompatParcelizer.IconCompatParcelizer();
        }
        if (this.IconCompatParcelizer == i) {
            audioAttributesCompatParcelizer.read();
        } else {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        if (this.AudioAttributesCompatParcelizer && (pytMcqIds = timeline.getPytMcqIds()) != null && !pytMcqIds.isEmpty()) {
            audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (timeline.isUpdateTagVisible()) {
            String tagLabel = timeline.getTagLabel();
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(tagLabel != null ? tagLabel : "");
        } else {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.SubtitleInputBuffer
    public final int[] read(int i) {
        return new int[]{2};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer
    public final void IconCompatParcelizer(int i) {
        ((Timeline[]) this.RemoteActionCompatParcelizer)[i].setBookmarkType(((Timeline[]) this.RemoteActionCompatParcelizer)[i].getBookmarkType() == 0 ? 1 : 0);
        d_(i);
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.write = z;
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer
    public final void write(int i) {
        this.IconCompatParcelizer = i;
        IconCompatParcelizer();
    }

    @Override // o.WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer
    public final void write(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }
}

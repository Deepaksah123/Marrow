package kotlin;

import com.marrow.data.models.common.CourseConfigV2;
import kotlin.buildMediaPresentationDescription;

/* JADX INFO: loaded from: classes3.dex */
public class withSkippedAdGroup implements withLastAdRemoved {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final parseLongAttr write;

    @setSdkPayload
    public withSkippedAdGroup(getStreamPositionUsForContent getstreampositionusforcontent, parseLongAttr parselongattr) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
        this.write = parselongattr;
    }

    @Override // kotlin.withLastAdRemoved
    public CourseConfigV2 IconCompatParcelizer() {
        String strAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("course_config_data");
        String str = strAudioAttributesCompatParcelizer;
        if (str == null || str.length() == 0) {
            this.write.AudioAttributesCompatParcelizer(new RuntimeException("null course config"), "null_course_config");
            AudioAttributesCompatParcelizer(true);
            buildMediaPresentationDescription.Companion companion = buildMediaPresentationDescription.INSTANCE;
            strAudioAttributesCompatParcelizer = buildMediaPresentationDescription.Companion.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.onRemoveQueueItem());
        }
        return CourseConfigV2.INSTANCE.fromJson(strAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.withLastAdRemoved
    public void RemoteActionCompatParcelizer(CourseConfigV2 courseConfigV2) {
        toMagicModuleMetaRepoModel.write(courseConfigV2, "");
        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer("course_config_data_version") != courseConfigV2.getVersion()) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer("course_config_data", CourseConfigV2.INSTANCE.toJson(courseConfigV2));
            AdaptationSet.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, "course_config_data_version", courseConfigV2.getVersion());
        }
    }

    @Override // kotlin.withLastAdRemoved
    public void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.withLastAdRemoved
    public final int AudioAttributesCompatParcelizer() {
        Integer introDurationSeconds;
        CourseConfigV2.VideoProperties videoProperties = IconCompatParcelizer().getVideoProperties();
        if (videoProperties == null || (introDurationSeconds = videoProperties.getIntroDurationSeconds()) == null) {
            return 0;
        }
        return introDurationSeconds.intValue();
    }
}

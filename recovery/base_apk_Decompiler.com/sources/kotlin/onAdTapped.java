package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onAdTapped implements onAdPlaybackState {
    private final setSupportedContentTypes AudioAttributesCompatParcelizer;
    private final onAdClicked read;

    public onAdTapped(setSupportedContentTypes setsupportedcontenttypes, onAdClicked onadclicked) {
        toMagicModuleMetaRepoModel.write(setsupportedcontenttypes, "");
        toMagicModuleMetaRepoModel.write(onadclicked, "");
        this.AudioAttributesCompatParcelizer = setsupportedcontenttypes;
        this.read = onadclicked;
    }

    @Override // kotlin.onAdPlaybackState
    public final LessonIndex RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.write(str);
    }

    @Override // kotlin.onAdPlaybackState
    public final LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> AudioAttributesCompatParcelizer(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> lessonDynamicResponseBody = this.read.read(str, this.AudioAttributesCompatParcelizer.IconCompatParcelizer());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.maybeUpdateAdMediaSources
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onAdTapped.write(this.RemoteActionCompatParcelizer, str, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody lessonDynamicResponseBodyRemoteActionCompatParcelizer = lessonDynamicResponseBody.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.AdsMediaSource
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return onAdTapped.IconCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (setRootSubjectId) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId write(onAdTapped onadtapped, String str, MarrowResponse marrowResponse) {
        LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> lessonDynamicResponseBodyRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = onadtapped.AudioAttributesCompatParcelizer.read(str);
        } else {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(marrowResponse);
        }
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    @Override // kotlin.onAdPlaybackState
    public final LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> MediaBrowserCompatItemReceiver(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> lessonDynamicResponseBodyAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(str, this.AudioAttributesCompatParcelizer.IconCompatParcelizer());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.getAdsLoader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onAdTapped.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, str, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody lessonDynamicResponseBodyRemoteActionCompatParcelizer = lessonDynamicResponseBodyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.lambdaprepareSourceInternal0comgoogleandroidexoplayer2sourceadsAdsMediaSource
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return onAdTapped.RemoteActionCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (setRootSubjectId) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId RemoteActionCompatParcelizer(onAdTapped onadtapped, String str, MarrowResponse marrowResponse) {
        LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> lessonDynamicResponseBodyRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = onadtapped.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(str);
        } else {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(marrowResponse);
        }
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    @Override // kotlin.onAdPlaybackState
    public final accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> write(final String str, final int i, String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> accessgetemptystatecp = this.read.read(str, i, strArr, this.AudioAttributesCompatParcelizer.IconCompatParcelizer());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.maybeUpdateSourceInfo
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onAdTapped.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, str, i, (MarrowResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpWrite = accessgetemptystatecp.write(new getSubjectTitle() { // from class: o.getAdDurationsUs
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return onAdTapped.AudioAttributesImplBaseParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
        return accessgetemptystatecpWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel AudioAttributesImplBaseParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (SchemaCompletionStatusRSModel) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel IconCompatParcelizer(onAdTapped onadtapped, String str, int i, MarrowResponse marrowResponse) {
        accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            accessgetemptystatecpAudioAttributesCompatParcelizer = onadtapped.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, i);
        } else {
            accessgetemptystatecpAudioAttributesCompatParcelizer = accessgetEmptyStatecp.read(marrowResponse);
        }
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.onAdPlaybackState
    public final LessonDynamicResponseBody<LessonIndex> IconCompatParcelizer(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.read(str, z);
    }

    @Override // kotlin.onAdPlaybackState
    public final accessgetEmptyStatecp<List<LessonTabItem<?>>> IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // kotlin.onAdPlaybackState
    public final void RemoteActionCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer.write(str, i);
    }

    @Override // kotlin.onAdPlaybackState
    public final int read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.onAdPlaybackState
    public final int write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.onAdPlaybackState
    public final int IconCompatParcelizer(long j, long j2) {
        return this.AudioAttributesCompatParcelizer.write(j, j2);
    }
}

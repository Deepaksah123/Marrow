package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.getQuote;
import kotlin.setOption5AnsweredCount;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public class getStringMap extends getBooleanMap implements CourseConfigV2SearchItem {
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(getStringMap.class), "fragments", "getFragments()Ljava/util/List;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(getStringMap.class), "empty", "getEmpty()Z"))};
    private final setTags AudioAttributesCompatParcelizer;
    private final isServerContentUpdated AudioAttributesImplApi21Parcelizer;
    private final PageValue RemoteActionCompatParcelizer;
    private final PageValue read;
    private final getNotesCount write;

    @Override // kotlin.CourseConfigV2SearchItem
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final isServerContentUpdated MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.CourseConfigV2SearchItem
    public final getNotesCount read() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStringMap(isServerContentUpdated isservercontentupdated, getNotesCount getnotescount, getMini getmini) {
        super(getQuote.AudioAttributesCompatParcelizer.read(), getnotescount.AudioAttributesImplApi21Parcelizer());
        toMagicModuleMetaRepoModel.write(isservercontentupdated, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getmini, "");
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = isservercontentupdated;
        this.write = getnotescount;
        this.read = getmini.read(new write());
        this.RemoteActionCompatParcelizer = getmini.read(new RemoteActionCompatParcelizer());
        this.AudioAttributesCompatParcelizer = new McqIndexCompanion(getmini, new read());
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends getShouldShowEmptyPlanScreen>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public List<getShouldShowEmptyPlanScreen> invoke() {
            return getSubjectPrefix.AudioAttributesCompatParcelizer(getStringMap.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver(), getStringMap.this.read());
        }

        write() {
            super(0);
        }
    }

    @Override // kotlin.CourseConfigV2SearchItem
    public final List<getShouldShowEmptyPlanScreen> write() {
        return (List) Pearl.RemoteActionCompatParcelizer(this.read, IconCompatParcelizer[0]);
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(getSubjectPrefix.RemoteActionCompatParcelizer(getStringMap.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver(), getStringMap.this.read()));
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return ((Boolean) Pearl.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, IconCompatParcelizer[1])).booleanValue();
    }

    @Override // kotlin.CourseConfigV2SearchItem
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<setTags> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public setTags invoke() {
            if (getStringMap.this.MediaBrowserCompatCustomActionResultReceiver()) {
                return setTags.write.RemoteActionCompatParcelizer;
            }
            List<getShouldShowEmptyPlanScreen> listWrite = getStringMap.this.write();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
            Iterator<T> it = listWrite.iterator();
            while (it.hasNext()) {
                arrayList.add(((getShouldShowEmptyPlanScreen) it.next()).write());
            }
            List list = IntermediateLoginResponseBody.read((Collection<? extends getSkippedCount>) arrayList, new getSkippedCount(getStringMap.this.MediaBrowserCompatItemReceiver(), getStringMap.this.read()));
            setOption5AnsweredCount.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setOption5AnsweredCount.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("package view scope for ");
            sb.append(getStringMap.this.read());
            sb.append(" in ");
            sb.append(getStringMap.this.MediaBrowserCompatItemReceiver().aQ_());
            return setOption5AnsweredCount.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(sb.toString(), list);
        }

        read() {
            super(0);
        }
    }

    @Override // kotlin.CourseConfigV2SearchItem
    public final setTags IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getVariant
    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2SearchItem AudioAttributesImplApi21Parcelizer() {
        if (read().read()) {
            return null;
        }
        isServerContentUpdated isservercontentupdatedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        getNotesCount getnotescountAudioAttributesCompatParcelizer = read().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
        return isservercontentupdatedMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(getnotescountAudioAttributesCompatParcelizer);
    }

    public boolean equals(Object obj) {
        CourseConfigV2SearchItem courseConfigV2SearchItem = obj instanceof CourseConfigV2SearchItem ? (CourseConfigV2SearchItem) obj : null;
        return courseConfigV2SearchItem != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(read(), courseConfigV2SearchItem.read()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver(), courseConfigV2SearchItem.MediaBrowserCompatItemReceiver());
    }

    public int hashCode() {
        return (MediaBrowserCompatItemReceiver().hashCode() * 31) + read().hashCode();
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemAddVideo, "");
        return courseConfigV2NavDrawerItemAddVideo.RemoteActionCompatParcelizer(this, d);
    }
}

package kotlin;

import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.lesson.LessonIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AdPlaybackState1 implements withRemovedAdGroupCount {
    private final setSupportedContentTypes AudioAttributesCompatParcelizer;
    private final ServerSideAdInsertionMediaSourceSharedMediaPeriod IconCompatParcelizer;
    private final getNextChunk MediaBrowserCompatItemReceiver;
    private final ServerSideAdInsertionMediaSourceMediaPeriodImpl RemoteActionCompatParcelizer;
    private final getStreamPositionUsForContent read;
    private final isIndexExplicit write;

    @setSdkPayload
    public AdPlaybackState1(isIndexExplicit isindexexplicit, setSupportedContentTypes setsupportedcontenttypes, getNextChunk getnextchunk, ServerSideAdInsertionMediaSourceSharedMediaPeriod serverSideAdInsertionMediaSourceSharedMediaPeriod, ServerSideAdInsertionMediaSourceMediaPeriodImpl serverSideAdInsertionMediaSourceMediaPeriodImpl, getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(isindexexplicit, "");
        toMagicModuleMetaRepoModel.write(setsupportedcontenttypes, "");
        toMagicModuleMetaRepoModel.write(getnextchunk, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSharedMediaPeriod, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceMediaPeriodImpl, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.write = isindexexplicit;
        this.AudioAttributesCompatParcelizer = setsupportedcontenttypes;
        this.MediaBrowserCompatItemReceiver = getnextchunk;
        this.IconCompatParcelizer = serverSideAdInsertionMediaSourceSharedMediaPeriod;
        this.RemoteActionCompatParcelizer = serverSideAdInsertionMediaSourceMediaPeriodImpl;
        this.read = getstreampositionusforcontent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.withRemovedAdGroupCount
    public final List<FeaturedCard> write() {
        FeaturedCard[] featuredCardArr = (FeaturedCard[]) this.write.a_("SELECT * FROM featured_card ORDER BY sort_order ASC");
        if (featuredCardArr != null) {
            ArrayList arrayList = new ArrayList();
            for (FeaturedCard featuredCard : featuredCardArr) {
                toMagicModuleMetaRepoModel.write(featuredCard);
                if (AudioAttributesCompatParcelizer(featuredCard)) {
                    if (RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard))) {
                        featuredCard.mcqContentDetails = this.RemoteActionCompatParcelizer.read(featuredCard.subContentId);
                    }
                    arrayList.add(featuredCard);
                }
            }
            return arrayList;
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.withRemovedAdGroupCount
    public final void RemoteActionCompatParcelizer() {
        this.write.ah_();
    }

    @Override // kotlin.withRemovedAdGroupCount
    public final void write(FeaturedCard featuredCard) {
        toMagicModuleMetaRepoModel.write(featuredCard, "");
        this.write.AudioAttributesCompatParcelizer(featuredCard);
    }

    private final boolean AudioAttributesCompatParcelizer(FeaturedCard featuredCard) {
        if (r8lambdacxeJ6djgVH5CZKEdmoij_s2DJ8.AudioAttributesCompatParcelizer(featuredCard)) {
            return IconCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard));
        }
        if (r8lambdacxeJ6djgVH5CZKEdmoij_s2DJ8.read(featuredCard)) {
            return AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard));
        }
        if (r8lambdacxeJ6djgVH5CZKEdmoij_s2DJ8.write(featuredCard)) {
            return read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard));
        }
        return true;
    }

    private boolean IconCompatParcelizer(List<? extends FeaturedCard> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        int iOnPrepareFromUri = this.read.onPrepareFromUri();
        for (FeaturedCard featuredCard : list) {
            if (RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(featuredCard))) {
                return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(featuredCard.subContentId);
            }
            setSupportedContentTypes setsupportedcontenttypes = this.AudioAttributesCompatParcelizer;
            String str = featuredCard.contentId;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            LessonIndex lessonIndexWrite = setsupportedcontenttypes.write(str);
            if (lessonIndexWrite == null) {
                return false;
            }
            if (lessonIndexWrite.hasVideo() && iOnPrepareFromUri != lessonIndexWrite.getEditionValue()) {
                return false;
            }
        }
        return true;
    }

    private boolean read(List<? extends FeaturedCard> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<? extends FeaturedCard> it = list.iterator();
        while (it.hasNext()) {
            if (this.IconCompatParcelizer.IconCompatParcelizer(it.next().contentId) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean AudioAttributesCompatParcelizer(List<? extends FeaturedCard> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<? extends FeaturedCard> it = list.iterator();
        while (it.hasNext()) {
            if (this.MediaBrowserCompatItemReceiver.write(it.next().contentId) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.withRemovedAdGroupCount
    public final boolean RemoteActionCompatParcelizer(List<? extends FeaturedCard> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        for (FeaturedCard featuredCard : list) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, (Object) featuredCard.contentType) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "mcq", (Object) featuredCard.subContentType)) {
                return false;
            }
        }
        return true;
    }
}

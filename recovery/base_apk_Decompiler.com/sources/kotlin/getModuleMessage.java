package kotlin;

import android.os.Process;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getModuleMessage {
    public static int AudioAttributesCompatParcelizer;
    public static int write;

    public static final CourseConfigV2NavDrawerItemFreeExtension IconCompatParcelizer(DataSet dataSet) {
        toMagicModuleMetaRepoModel.write(dataSet, "");
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionIconCompatParcelizer = NestfputmThumbnailHeight.IconCompatParcelizer(dataSet);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionIconCompatParcelizer, "");
        return courseConfigV2NavDrawerItemFreeExtensionIconCompatParcelizer;
    }

    public static final boolean RemoteActionCompatParcelizer(getMediaId getmediaid) {
        toMagicModuleMetaRepoModel.write(getmediaid, "");
        return getmediaid.RemoteActionCompatParcelizer().invoke(NestfputmThumbnailUrl.RemoteActionCompatParcelizer()) == getExamDurationSeconds.STRICT;
    }

    public static final boolean AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        return (gettestheadertitle instanceof CourseConfigV2NavDrawerItemRateUs) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gettestheadertitle.IconCompatParcelizer(setUserInitiatedExamStartedOn.IconCompatParcelizer), Boolean.TRUE);
    }

    public static final dummyEditor AudioAttributesCompatParcelizer(getFeaturedCards getfeaturedcards, TestSubModelCompanion testSubModelCompanion) {
        dummyEditor next;
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(testSubModelCompanion, "");
        if (testSubModelCompanion.write() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
        }
        Iterator<dummyEditor> it = new HomeCardModel(getfeaturedcards, testSubModelCompanion).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            dummyEditor dummyeditor = next;
            for (getNotesCount getnotescount : NestfputmThumbnailUrl.write()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dummyeditor.write(), getnotescount)) {
                    break loop0;
                }
            }
        }
        return next;
    }

    public static int IconCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 8742529;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        write = elapsedCpuTime;
        return elapsedCpuTime;
    }
}

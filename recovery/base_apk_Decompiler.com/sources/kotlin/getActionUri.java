package kotlin;

import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.test.TestIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getActionUri {

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[CourseConfigV2.TestTabItem.values().length];
            try {
                iArr[CourseConfigV2.TestTabItem.MCQ_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.GRAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.MINI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.SUBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            read = iArr;
        }
    }

    public static final String read(CourseConfigV2.TestTabItem testTabItem) {
        toMagicModuleMetaRepoModel.write(testTabItem, "");
        int i = AudioAttributesCompatParcelizer.read[testTabItem.ordinal()];
        if (i == 1) {
            return TestIndex.TEST_TYPE_200_MCQ_PATTERN;
        }
        if (i == 2) {
            return "grand";
        }
        if (i == 3) {
            return "all";
        }
        if (i == 4) {
            return "mini";
        }
        if (i != 5) {
            throw new RenewEligibleCreator();
        }
        return "subject";
    }

    public static final List<getBody> write(List<? extends getBody> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<? extends getBody> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (getBody.write writeVarWrite : list2) {
            if (!(writeVarWrite instanceof getBody.read)) {
                if (writeVarWrite instanceof getBody.MediaBrowserCompatItemReceiver) {
                    getBody.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (getBody.MediaBrowserCompatItemReceiver) writeVarWrite;
                    writeVarWrite = getBody.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(true, mediaBrowserCompatItemReceiver.IconCompatParcelizer, mediaBrowserCompatItemReceiver.write, mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer, mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer);
                } else if (writeVarWrite instanceof getBody.AudioAttributesCompatParcelizer) {
                    getBody.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (getBody.AudioAttributesCompatParcelizer) writeVarWrite;
                    writeVarWrite = getBody.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer, true, audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                } else if (writeVarWrite instanceof getBody.write) {
                    writeVarWrite = getBody.write.write(((getBody.write) writeVarWrite).IconCompatParcelizer, false);
                }
            } else {
                writeVarWrite = getBody.read.AudioAttributesCompatParcelizer(true, ((getBody.read) writeVarWrite).read);
            }
            arrayList.add(writeVarWrite);
        }
        return arrayList;
    }

    public static final boolean AudioAttributesCompatParcelizer(List<? extends getBody> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((getBody) it.next()) instanceof getBody.RemoteActionCompatParcelizer) {
                return true;
            }
        }
        return false;
    }
}

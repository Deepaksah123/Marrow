package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a\u007f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\u0003*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/addAudioOffloadListener;", "T", "Lo/setSkipSilenceEnabled;", "", "p0", "p1", "", "p2", "Lo/setWindowTitle;", "p3", "p4", "p5", "p6", "p7", "Lkotlin/Function1;", "p8", "", "RemoteActionCompatParcelizer", "(Lo/setSkipSilenceEnabled;IILjava/util/List;Lo/setWindowTitle;IIIILo/getAnswerMap;)Ljava/util/List;", "AudioAttributesCompatParcelizer", "(Lo/addAudioOffloadListener;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getVideoComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(addAudioOffloadListener addaudiooffloadlistener) {
        long j = addaudiooffloadlistener.read(0);
        return addaudiooffloadlistener.MediaBrowserCompatSearchResultReceiver() ? hasReferringProperties.AudioAttributesCompatParcelizer(j) : hasReferringProperties.IconCompatParcelizer(j);
    }

    public static final <T extends addAudioOffloadListener> List<T> RemoteActionCompatParcelizer(setSkipSilenceEnabled setskipsilenceenabled, int i, int i2, List<T> list, setWindowTitle setwindowtitle, int i3, int i4, int i5, int i6, getAnswerMap<? super Integer, ? extends T> getanswermap) {
        T tRemove;
        if (setskipsilenceenabled != null) {
            List<T> list2 = list;
            if (!list2.isEmpty() && setwindowtitle.AudioAttributesCompatParcelizer != 0) {
                setWindowTitle setwindowtitleWrite = setskipsilenceenabled.write(i, i2, setwindowtitle);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    T t = list.get(i7);
                    if (setwindowtitle.write(t.read())) {
                        arrayList2.add(t);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                int[] iArr = setwindowtitleWrite.RemoteActionCompatParcelizer;
                int i8 = setwindowtitleWrite.AudioAttributesCompatParcelizer;
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = iArr[i9];
                    Iterator<T> it = list.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (it.next().read() == i10) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 == -1) {
                        tRemove = getanswermap.invoke(Integer.valueOf(i10));
                    } else {
                        tRemove = list.remove(i11);
                    }
                    T t2 = tRemove;
                    int iRemoteActionCompatParcelizer = setskipsilenceenabled.RemoteActionCompatParcelizer(arrayList3, i10, t2.MediaBrowserCompatCustomActionResultReceiver(), i11 == -1 ? Integer.MIN_VALUE : AudioAttributesCompatParcelizer(t2), i3, i4, i5, i6);
                    t2.IconCompatParcelizer(true);
                    t2.write(iRemoteActionCompatParcelizer, 0, i5, i6);
                    arrayList.add(t2);
                }
                return arrayList;
            }
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }
}

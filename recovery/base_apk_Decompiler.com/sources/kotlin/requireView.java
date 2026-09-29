package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u001a\u008d\u0002\u0010.\u001a\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0004\u0012\u00020+0'H\u0000¢\u0006\u0004\b.\u0010/\u001aI\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u0018002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b1\u00102\u001a;\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b3\u00104\u001a\u0093\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020\u0018002\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106"}, d2 = {"", "p0", "Lo/setArguments;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "Lo/PropertyValueAny;", "p9", "", "p10", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "p11", "Lo/WindowInsetsCompatImpl30$write;", "p12", "p13", "Lo/bufferMapProperty;", "p14", "Lo/stopLoading;", "Lo/setAllowReturnTransitionOverlap;", "p15", "p16", "", "p17", "p18", "p19", "Lo/TopUserCompanion;", "p20", "Lo/setAuxEffectInfo;", "p21", "Lo/buf;", "p22", "Lo/setSkipSilenceEnabled;", "p23", "Lkotlin/Function3;", "Lkotlin/Function1;", "Lo/_parser$IconCompatParcelizer;", "", "Lo/withHandlersFrom;", "p24", "Lo/setEnterTransition;", "write", "(ILo/setArguments;IIIIIIFJZLo/WindowInsetsCompatImpl30$RatingCompat;Lo/WindowInsetsCompatImpl30$write;ZLo/bufferMapProperty;Lo/stopLoading;ILjava/util/List;ZZLo/TopUserCompanion;Lo/InputAccessor;Lo/buf;Lo/setSkipSilenceEnabled;Lo/getModuleData;)Lo/setEnterTransition;", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Lo/setArguments;IILjava/util/List;)Ljava/util/List;", "RemoteActionCompatParcelizer", "(ILo/setArguments;ILjava/util/List;)Ljava/util/List;", "IconCompatParcelizer", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLo/WindowInsetsCompatImpl30$RatingCompat;Lo/WindowInsetsCompatImpl30$write;ZLo/bufferMapProperty;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requireView {
    private static final int IconCompatParcelizer(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setAllowReturnTransitionOverlap AudioAttributesCompatParcelizer(setArguments setarguments, int i) {
        return setArguments.read$default(setarguments, i, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(InputAccessor inputAccessor, final List list, final List list2, final boolean z, _parser.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.setAllowEnterTransitionOverlap
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return requireView.read(list, list2, z, (_parser.IconCompatParcelizer) obj);
            }
        });
        setAuxEffectInfo.write(inputAccessor);
        return getShowPopup.INSTANCE;
    }

    private static final List<setAllowReturnTransitionOverlap> AudioAttributesCompatParcelizer(List<setAllowReturnTransitionOverlap> list, setArguments setarguments, int i, int i2, List<Integer> list2) {
        int iMin = Math.min(((setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).getIconCompatParcelizer() + i2, i - 1);
        int iconCompatParcelizer = ((setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).getIconCompatParcelizer() + 1;
        ArrayList arrayList = null;
        if (iconCompatParcelizer <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(setArguments.read$default(setarguments, iconCompatParcelizer, 0L, 2, null));
                if (iconCompatParcelizer == iMin) {
                    break;
                }
                iconCompatParcelizer++;
            }
        }
        if (arrayList != null && ((setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) arrayList)).getIconCompatParcelizer() > iMin) {
            iMin = ((setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) arrayList)).getIconCompatParcelizer();
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = list2.get(i3).intValue();
            if (iIntValue > iMin) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(setArguments.read$default(setarguments, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
    }

    private static final List<setAllowReturnTransitionOverlap> RemoteActionCompatParcelizer(int i, setArguments setarguments, int i2, List<Integer> list) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(setArguments.read$default(setarguments, i3, 0L, 2, null));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(setArguments.read$default(setarguments, iIntValue, 0L, 2, null));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
    }

    private static final List<setAllowReturnTransitionOverlap> IconCompatParcelizer(List<setAllowReturnTransitionOverlap> list, List<setAllowReturnTransitionOverlap> list2, List<setAllowReturnTransitionOverlap> list3, int i, int i2, int i3, int i4, int i5, boolean z, WindowInsetsCompatImpl30.RatingCompat ratingCompat, WindowInsetsCompatImpl30.write writeVar, boolean z2, bufferMapProperty buffermapproperty) {
        int i6 = z ? i2 : i;
        int i7 = 0;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            getRootStableInsets.AudioAttributesCompatParcelizer("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                getRootStableInsets.RemoteActionCompatParcelizer("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i7 < size) {
                iArr[i7] = list.get(IconCompatParcelizer(i7, z2, size)).getOnAddQueueItem();
                i7++;
            }
            int[] iArr2 = new int[size];
            if (z) {
                if (ratingCompat != null) {
                    ratingCompat.write(buffermapproperty, i6, iArr, iArr2);
                } else {
                    getRootStableInsets.read("null verticalArrangement when isVertical == true");
                    throw new PlanDetailsCreator();
                }
            } else if (writeVar != null) {
                writeVar.AudioAttributesCompatParcelizer(buffermapproperty, i6, iArr, tryToResolveUnresolved.write, iArr2);
            } else {
                getRootStableInsets.read("null horizontalArrangement when isVertical == false");
                throw new PlanDetailsCreator();
            }
            newEncryptedObject newencryptedobjectRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(iArr2);
            if (z2) {
                newencryptedobjectRemoteActionCompatParcelizer = getQues.write(newencryptedobjectRemoteActionCompatParcelizer);
            }
            int read = newencryptedobjectRemoteActionCompatParcelizer.getRead();
            int audioAttributesCompatParcelizer = newencryptedobjectRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
            int iconCompatParcelizer = newencryptedobjectRemoteActionCompatParcelizer.getIconCompatParcelizer();
            if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
                while (true) {
                    int onAddQueueItem = iArr2[read];
                    setAllowReturnTransitionOverlap setallowreturntransitionoverlap = list.get(IconCompatParcelizer(read, z2, size));
                    if (z2) {
                        onAddQueueItem = (i6 - onAddQueueItem) - setallowreturntransitionoverlap.getOnAddQueueItem();
                    }
                    setallowreturntransitionoverlap.AudioAttributesCompatParcelizer(onAddQueueItem, i, i2);
                    arrayList.add(setallowreturntransitionoverlap);
                    if (read == audioAttributesCompatParcelizer) {
                        break;
                    }
                    read += iconCompatParcelizer;
                }
            }
        } else {
            int size2 = list2.size();
            int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5;
            for (int i8 = 0; i8 < size2; i8++) {
                setAllowReturnTransitionOverlap setallowreturntransitionoverlap2 = list2.get(i8);
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver -= setallowreturntransitionoverlap2.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                setallowreturntransitionoverlap2.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i, i2);
                arrayList.add(setallowreturntransitionoverlap2);
            }
            int size3 = list.size();
            int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = i5;
            for (int i9 = 0; i9 < size3; i9++) {
                setAllowReturnTransitionOverlap setallowreturntransitionoverlap3 = list.get(i9);
                setallowreturntransitionoverlap3.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2, i, i2);
                arrayList.add(setallowreturntransitionoverlap3);
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 += setallowreturntransitionoverlap3.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            int size4 = list3.size();
            while (i7 < size4) {
                setAllowReturnTransitionOverlap setallowreturntransitionoverlap4 = list3.get(i7);
                setallowreturntransitionoverlap4.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2, i, i2);
                arrayList.add(setallowreturntransitionoverlap4);
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 += setallowreturntransitionoverlap4.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                i7++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.setEnterTransition write(int r40, final kotlin.setArguments r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, long r49, boolean r51, o.WindowInsetsCompatImpl30.RatingCompat r52, o.WindowInsetsCompatImpl30.write r53, boolean r54, kotlin.bufferMapProperty r55, kotlin.stopLoading<kotlin.setAllowReturnTransitionOverlap> r56, int r57, java.util.List<java.lang.Integer> r58, boolean r59, final boolean r60, kotlin.TopUserCompanion r61, final kotlin.InputAccessor<kotlin.getShowPopup> r62, kotlin.buf r63, kotlin.setSkipSilenceEnabled r64, kotlin.getModuleData<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.getAnswerMap<? super o._parser.IconCompatParcelizer, kotlin.getShowPopup>, ? extends kotlin.withHandlersFrom> r65) {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requireView.write(int, o.setArguments, int, int, int, int, int, int, float, long, boolean, o.WindowInsetsCompatImpl30$RatingCompat, o.WindowInsetsCompatImpl30$write, boolean, o.bufferMapProperty, o.stopLoading, int, java.util.List, boolean, boolean, o.TopUserCompanion, o.InputAccessor, o.buf, o.setSkipSilenceEnabled, o.getModuleData):o.setEnterTransition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(List list, List list2, boolean z, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((setAllowReturnTransitionOverlap) list.get(i)).IconCompatParcelizer(iconCompatParcelizer, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((setAllowReturnTransitionOverlap) list2.get(i2)).IconCompatParcelizer(iconCompatParcelizer, z);
        }
        return getShowPopup.INSTANCE;
    }
}

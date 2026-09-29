package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u001a\u0085\u0002\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2*\u0010(\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$\u0012\u0004\u0012\u00020'0#2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0000¢\u0006\u0004\b-\u0010.\u001aO\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020/0$H\u0002¢\u0006\u0004\b0\u00101\u001aG\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020/0$H\u0002¢\u0006\u0004\b2\u00103\u001aO\u00102\u001a\u0004\u0018\u00010/2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b2\u00104\u001a{\u00100\u001a\u00020/*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u0002052\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0002¢\u0006\u0004\b0\u00106\u001a\u0093\u0001\u00108\u001a\b\u0012\u0004\u0012\u00020/07*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020/0\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020/0\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b8\u00109"}, d2 = {"Lo/Mp4LocationData;", "", "p0", "Lo/disable;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "Lo/PropertyValueAny;", "p8", "Lo/superDispatchKeyEvent;", "p9", "Lo/_skipWSOrEnd$read;", "p10", "Lo/_skipWSOrEnd$write;", "p11", "", "p12", "Lo/hasReferringProperties;", "p13", "p14", "p15", "", "p16", "Lo/getInsetsIgnoringVisibility;", "p17", "Lo/setAuxEffectInfo;", "p18", "Lo/TopUserCompanion;", "p19", "Lo/bufferMapProperty;", "p20", "Lkotlin/Function3;", "Lkotlin/Function1;", "Lo/_parser$IconCompatParcelizer;", "", "Lo/withHandlersFrom;", "p21", "Lo/setProvider;", "Lo/_parser;", "p22", "Lo/removeEventListener;", "AudioAttributesCompatParcelizer", "(Lo/Mp4LocationData;ILo/disable;IIIIIIJLo/superDispatchKeyEvent;Lo/_skipWSOrEnd$read;Lo/_skipWSOrEnd$write;ZJIILjava/util/List;Lo/getInsetsIgnoringVisibility;Lo/InputAccessor;Lo/TopUserCompanion;Lo/bufferMapProperty;Lo/getModuleData;Lo/setProvider;)Lo/removeEventListener;", "Lo/getMediaItem;", "IconCompatParcelizer", "(IIILjava/util/List;Lo/getAnswerMap;)Ljava/util/List;", "write", "(IILjava/util/List;Lo/getAnswerMap;)Ljava/util/List;", "(ILjava/util/List;IIILo/getInsetsIgnoringVisibility;I)Lo/getMediaItem;", "Lo/tryToResolveUnresolved;", "(Lo/Mp4LocationData;IJLo/disable;JLo/superDispatchKeyEvent;Lo/_skipWSOrEnd$write;Lo/_skipWSOrEnd$read;Lo/tryToResolveUnresolved;ZILo/setProvider;)Lo/getMediaItem;", "", "RemoteActionCompatParcelizer", "(Lo/Mp4LocationData;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILo/superDispatchKeyEvent;ZLo/bufferMapProperty;II)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class removeDrmEventListener {
    private static final int RemoteActionCompatParcelizer(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getMediaItem IconCompatParcelizer(Mp4LocationData mp4LocationData, long j, disable disableVar, long j2, superDispatchKeyEvent superdispatchkeyevent, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, boolean z, int i, setProvider setprovider, int i2) {
        return IconCompatParcelizer(mp4LocationData, i2, j, disableVar, j2, superdispatchkeyevent, writeVar, readVar, mp4LocationData.getAudioAttributesCompatParcelizer(), z, i, setprovider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getMediaItem read(Mp4LocationData mp4LocationData, long j, disable disableVar, long j2, superDispatchKeyEvent superdispatchkeyevent, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, boolean z, int i, setProvider setprovider, int i2) {
        return IconCompatParcelizer(mp4LocationData, i2, j, disableVar, j2, superdispatchkeyevent, writeVar, readVar, mp4LocationData.getAudioAttributesCompatParcelizer(), z, i, setprovider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, final List list, _parser.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.VideoDecoderGLSurfaceView
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return removeDrmEventListener.read(list, (_parser.IconCompatParcelizer) obj);
            }
        });
        setAuxEffectInfo.write(inputAccessor);
        return getShowPopup.INSTANCE;
    }

    private static final List<getMediaItem> IconCompatParcelizer(int i, int i2, int i3, List<Integer> list, getAnswerMap<? super Integer, getMediaItem> getanswermap) {
        int iMin = Math.min(i3, (i2 - i) - 1) + i;
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(getanswermap.invoke(Integer.valueOf(i4)));
                if (i4 == iMin) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(getanswermap.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
    }

    private static final List<getMediaItem> write(int i, int i2, List<Integer> list, getAnswerMap<? super Integer, getMediaItem> getanswermap) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(getanswermap.invoke(Integer.valueOf(i3)));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iIntValue = list.get(i4).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(getanswermap.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
    }

    private static final getMediaItem IconCompatParcelizer(Mp4LocationData mp4LocationData, int i, long j, disable disableVar, long j2, superDispatchKeyEvent superdispatchkeyevent, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, tryToResolveUnresolved trytoresolveunresolved, boolean z, int i2, setProvider<List<_parser>> setprovider) {
        List<_parser> list;
        Object objIconCompatParcelizer = disableVar.IconCompatParcelizer(i);
        List<_parser> listAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(i);
        if (listAudioAttributesCompatParcelizer != null) {
            list = listAudioAttributesCompatParcelizer;
        } else {
            List<isTypeOrSuperTypeOf> listRemoteActionCompatParcelizer = mp4LocationData.RemoteActionCompatParcelizer(i);
            int size = listRemoteActionCompatParcelizer.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listRemoteActionCompatParcelizer.get(i3).write(j));
            }
            ArrayList arrayList2 = arrayList;
            setprovider.write(i, arrayList2);
            list = arrayList2;
        }
        return new getMediaItem(i, i2, list, j2, objIconCompatParcelizer, superdispatchkeyevent, writeVar, readVar, trytoresolveunresolved, z, null);
    }

    private static final List<getMediaItem> RemoteActionCompatParcelizer(Mp4LocationData mp4LocationData, List<getMediaItem> list, List<getMediaItem> list2, List<getMediaItem> list3, int i, int i2, int i3, int i4, int i5, superDispatchKeyEvent superdispatchkeyevent, boolean z, bufferMapProperty buffermapproperty, int i6, int i7) {
        int i8;
        int i9;
        ArrayList arrayList;
        int i10 = i7 + i6;
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        int i11 = 0;
        boolean z2 = i3 < Math.min(i9, i8);
        if (z2 && i5 != 0) {
            getRootStableInsets.AudioAttributesCompatParcelizer("non-zero pagesScrollOffset=".concat(String.valueOf(i5)));
        }
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                getRootStableInsets.RemoteActionCompatParcelizer("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = i7;
                i11++;
            }
            int[] iArr2 = new int[size];
            WindowInsetsCompatImpl30.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer = WindowInsetsCompatImpl30.RemoteActionCompatParcelizer.INSTANCE.RemoteActionCompatParcelizer(mp4LocationData.b_(i6));
            if (superdispatchkeyevent == superDispatchKeyEvent.write) {
                mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer.write(buffermapproperty, i9, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                mediaBrowserCompatItemReceiverRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(buffermapproperty, i9, iArr, tryToResolveUnresolved.write, iArr2);
            }
            newEncryptedObject newencryptedobjectRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(iArr2);
            if (z) {
                newencryptedobjectRemoteActionCompatParcelizer = getQues.write(newencryptedobjectRemoteActionCompatParcelizer);
            }
            int read = newencryptedobjectRemoteActionCompatParcelizer.getRead();
            int audioAttributesCompatParcelizer = newencryptedobjectRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
            int iconCompatParcelizer = newencryptedobjectRemoteActionCompatParcelizer.getIconCompatParcelizer();
            if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
                while (true) {
                    int remoteActionCompatParcelizer = iArr2[read];
                    getMediaItem getmediaitem = list.get(RemoteActionCompatParcelizer(read, z, size));
                    if (z) {
                        remoteActionCompatParcelizer = (i9 - remoteActionCompatParcelizer) - getmediaitem.getRemoteActionCompatParcelizer();
                    }
                    getmediaitem.IconCompatParcelizer(remoteActionCompatParcelizer, i, i2);
                    arrayList.add(getmediaitem);
                    if (read == audioAttributesCompatParcelizer) {
                        break;
                    }
                    read += iconCompatParcelizer;
                }
            }
        } else {
            arrayList = arrayList2;
            int size2 = list2.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size2; i13++) {
                getMediaItem getmediaitem2 = list2.get(i13);
                i12 -= i10;
                getmediaitem2.IconCompatParcelizer(i12, i, i2);
                arrayList.add(getmediaitem2);
            }
            int size3 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size3; i15++) {
                getMediaItem getmediaitem3 = list.get(i15);
                getmediaitem3.IconCompatParcelizer(i14, i, i2);
                arrayList.add(getmediaitem3);
                i14 += i10;
            }
            int size4 = list3.size();
            while (i11 < size4) {
                getMediaItem getmediaitem4 = list3.get(i11);
                getmediaitem4.IconCompatParcelizer(i14, i, i2);
                arrayList.add(getmediaitem4);
                i14 += i10;
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final removeEventListener AudioAttributesCompatParcelizer(final Mp4LocationData mp4LocationData, int i, final disable disableVar, int i2, int i3, int i4, int i5, int i6, int i7, long j, final superDispatchKeyEvent superdispatchkeyevent, final _skipWSOrEnd.read readVar, final _skipWSOrEnd.write writeVar, final boolean z, final long j2, final int i8, int i9, List<Integer> list, getInsetsIgnoringVisibility getinsetsignoringvisibility, final InputAccessor<getShowPopup> inputAccessor, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, getModuleData<? super Integer, ? super Integer, ? super getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup>, ? extends withHandlersFrom> getmoduledata, final setProvider<List<_parser>> setprovider) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j3;
        List<getMediaItem> list2;
        ArrayList arrayListRemoteActionCompatParcelizer;
        ArrayList arrayListRemoteActionCompatParcelizer2;
        int i15;
        int mediaBrowserCompatMediaItem;
        if (i3 < 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("negative beforeContentPadding");
        }
        if (i4 < 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("negative afterContentPadding");
        }
        int i16 = 0;
        int iWrite = getQues.write(i8 + i5, 0);
        int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(i9, i);
        final long j4 = PropertyValueBuffer.read$default(0, superdispatchkeyevent == superDispatchKeyEvent.write ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : i8, 0, superdispatchkeyevent != superDispatchKeyEvent.write ? PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) : i8, 5, null);
        if (i <= 0) {
            return new removeEventListener(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), i8, i5, i4, superdispatchkeyevent, -i3, i2 + i4, false, iRemoteActionCompatParcelizer, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, getinsetsignoringvisibility, getmoduledata.AudioAttributesCompatParcelizer(Integer.valueOf(PropertyValueAny.MediaBrowserCompatItemReceiver(j)), Integer.valueOf(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j)), new getAnswerMap() { // from class: o.refreshSourceInfo
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return removeDrmEventListener.RemoteActionCompatParcelizer((_parser.IconCompatParcelizer) obj);
                }
            }), false, null, null, topUserCompanion, buffermapproperty, j4, 393216, null);
        }
        int i17 = iRemoteActionCompatParcelizer;
        int i18 = i6;
        int i19 = i7;
        while (i18 > 0 && i19 > 0) {
            i18--;
            i19 -= iWrite;
        }
        int i20 = -i19;
        if (i18 >= i) {
            i18 = i - 1;
            i20 = 0;
        }
        setCardContent setcardcontent = new setCardContent();
        int i21 = -i3;
        int i22 = (i5 < 0 ? i5 : 0) + i21;
        int i23 = i20 + i22;
        int iMax = 0;
        while (i23 < 0 && i18 > 0) {
            int i24 = i18 - 1;
            setCardContent setcardcontent2 = setcardcontent;
            int i25 = iWrite;
            int i26 = i16;
            getMediaItem getmediaitemIconCompatParcelizer = IconCompatParcelizer(mp4LocationData, i24, j4, disableVar, j2, superdispatchkeyevent, writeVar, readVar, mp4LocationData.getAudioAttributesCompatParcelizer(), z, i8, setprovider);
            setcardcontent2.add(i26, getmediaitemIconCompatParcelizer);
            iMax = Math.max(iMax, getmediaitemIconCompatParcelizer.getMediaDescriptionCompat());
            i23 += i25;
            i22 = i22;
            iWrite = i25;
            setcardcontent = setcardcontent2;
            i16 = i26;
            i18 = i24;
            i21 = i21;
            i17 = i17;
        }
        int i27 = i23;
        int i28 = i21;
        int i29 = i22;
        setCardContent setcardcontent3 = setcardcontent;
        int i30 = iWrite;
        int i31 = i17;
        int i32 = i16;
        int i33 = (i27 < i29 ? i29 : i27) - i29;
        int i34 = i2 + i4;
        int iWrite2 = getQues.write(i34, i32);
        int i35 = -i33;
        int i36 = i32;
        int i37 = i36;
        int i38 = i18;
        while (i36 < setcardcontent3.size()) {
            if (i35 >= iWrite2) {
                setcardcontent3.remove(i36);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                i37 = 1;
            } else {
                i38++;
                i35 += i30;
                i36++;
            }
        }
        int i39 = i18;
        int i40 = i33;
        int i41 = i37;
        int i42 = i38;
        int i43 = i35;
        while (i42 < i && (i43 < iWrite2 || i43 <= 0 || setcardcontent3.isEmpty())) {
            int i44 = i34;
            int i45 = i43;
            int i46 = i42;
            int i47 = iWrite2;
            getMediaItem getmediaitemIconCompatParcelizer2 = IconCompatParcelizer(mp4LocationData, i42, j4, disableVar, j2, superdispatchkeyevent, writeVar, readVar, mp4LocationData.getAudioAttributesCompatParcelizer(), z, i8, setprovider);
            int i48 = i - 1;
            i43 = (i46 == i48 ? i8 : i30) + i45;
            if (i43 <= i29 && i46 != i48) {
                i40 -= i30;
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                i39 = i46 + 1;
                i41 = 1;
            } else {
                iMax = Math.max(iMax, getmediaitemIconCompatParcelizer2.getMediaDescriptionCompat());
                setcardcontent3.add(getmediaitemIconCompatParcelizer2);
            }
            i42 = i46 + 1;
            i34 = i44;
            iWrite2 = i47;
        }
        int i49 = i34;
        int i50 = i43;
        int i51 = i42;
        if (i50 < i2) {
            int i52 = i2 - i50;
            int i53 = i40 - i52;
            int i54 = i52 + i50;
            int i55 = i3;
            int i56 = i53;
            int i57 = 0;
            while (i56 < i55 && i39 > 0) {
                i39--;
                int i58 = i51;
                int i59 = i57;
                getMediaItem getmediaitemIconCompatParcelizer3 = IconCompatParcelizer(mp4LocationData, i39, j4, disableVar, j2, superdispatchkeyevent, writeVar, readVar, mp4LocationData.getAudioAttributesCompatParcelizer(), z, i8, setprovider);
                setcardcontent3.add(i59, getmediaitemIconCompatParcelizer3);
                iMax = Math.max(iMax, getmediaitemIconCompatParcelizer3.getMediaDescriptionCompat());
                i56 += i30;
                i55 = i3;
                i57 = i59;
                i51 = i58;
            }
            i10 = i51;
            i11 = i57;
            if (i56 < 0) {
                i13 = i11;
                i50 = i54 + i56;
            } else {
                i13 = i56;
                i50 = i54;
            }
            i12 = i39;
        } else {
            i10 = i51;
            i11 = 0;
            i12 = i39;
            i13 = i40;
        }
        if (i13 < 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("invalid currentFirstPageScrollOffset");
        }
        int i60 = -i13;
        getMediaItem getmediaitem = (getMediaItem) setcardcontent3.read();
        if (i3 > 0 || i5 < 0) {
            int size = setcardcontent3.size();
            int i61 = i11;
            while (i61 < size && i13 != 0 && i30 <= i13 && i61 != IntermediateLoginResponseBody.write((List) setcardcontent3)) {
                i13 -= i30;
                i61++;
                getmediaitem = (getMediaItem) setcardcontent3.get(i61);
            }
        }
        int i62 = i13;
        getMediaItem getmediaitem2 = getmediaitem;
        List<getMediaItem> listWrite = write(i12, i31, list, new getAnswerMap() { // from class: o.prepareSourceCalled
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return removeDrmEventListener.IconCompatParcelizer(mp4LocationData, j4, disableVar, j2, superdispatchkeyevent, writeVar, readVar, z, i8, setprovider, ((Integer) obj).intValue());
            }
        });
        int size2 = listWrite.size();
        int iMax2 = iMax;
        for (int i63 = 0; i63 < size2; i63++) {
            iMax2 = Math.max(iMax2, listWrite.get(i63).getMediaDescriptionCompat());
        }
        int i64 = i50;
        List<getMediaItem> listIconCompatParcelizer = IconCompatParcelizer(((getMediaItem) setcardcontent3.AudioAttributesCompatParcelizer()).getWrite(), i, i31, list, new getAnswerMap() { // from class: o.prepareSource
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return removeDrmEventListener.read(mp4LocationData, j4, disableVar, j2, superdispatchkeyevent, writeVar, readVar, z, i8, setprovider, ((Integer) obj).intValue());
            }
        });
        int size3 = listIconCompatParcelizer.size();
        int iMax3 = iMax2;
        for (int i65 = 0; i65 < size3; i65++) {
            iMax3 = Math.max(iMax3, listIconCompatParcelizer.get(i65).getMediaDescriptionCompat());
        }
        boolean z2 = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getmediaitem2, setcardcontent3.read()) && listWrite.isEmpty() && listIconCompatParcelizer.isEmpty();
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            j3 = j;
            i14 = iMax3;
        } else {
            i14 = i64;
            j3 = j;
        }
        int iIconCompatParcelizer = PropertyValueBuffer.IconCompatParcelizer(j3, i14);
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            iMax3 = i64;
        }
        int iRemoteActionCompatParcelizer2 = PropertyValueBuffer.RemoteActionCompatParcelizer(j3, iMax3);
        final List<getMediaItem> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mp4LocationData, setcardcontent3, listWrite, listIconCompatParcelizer, iIconCompatParcelizer, iRemoteActionCompatParcelizer2, i64, i2, i60, superdispatchkeyevent, z, mp4LocationData, i5, i8);
        if (z2) {
            list2 = listRemoteActionCompatParcelizer;
        } else {
            ArrayList arrayList = new ArrayList(listRemoteActionCompatParcelizer.size());
            int size4 = listRemoteActionCompatParcelizer.size();
            for (int i66 = 0; i66 < size4; i66++) {
                getMediaItem getmediaitem3 = listRemoteActionCompatParcelizer.get(i66);
                getMediaItem getmediaitem4 = getmediaitem3;
                if (getmediaitem4.getWrite() >= ((getMediaItem) setcardcontent3.read()).getWrite() && getmediaitem4.getWrite() <= ((getMediaItem) setcardcontent3.AudioAttributesCompatParcelizer()).getWrite()) {
                    arrayList.add(getmediaitem3);
                }
            }
            list2 = arrayList;
        }
        if (listWrite.isEmpty()) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList2 = new ArrayList(listRemoteActionCompatParcelizer.size());
            int size5 = listRemoteActionCompatParcelizer.size();
            for (int i67 = 0; i67 < size5; i67++) {
                getMediaItem getmediaitem5 = listRemoteActionCompatParcelizer.get(i67);
                if (getmediaitem5.getWrite() < ((getMediaItem) setcardcontent3.read()).getWrite()) {
                    arrayList2.add(getmediaitem5);
                }
            }
            arrayListRemoteActionCompatParcelizer = arrayList2;
        }
        List list3 = arrayListRemoteActionCompatParcelizer;
        if (listIconCompatParcelizer.isEmpty()) {
            arrayListRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList3 = new ArrayList(listRemoteActionCompatParcelizer.size());
            int size6 = listRemoteActionCompatParcelizer.size();
            for (int i68 = 0; i68 < size6; i68++) {
                getMediaItem getmediaitem6 = listRemoteActionCompatParcelizer.get(i68);
                if (getmediaitem6.getWrite() > ((getMediaItem) setcardcontent3.AudioAttributesCompatParcelizer()).getWrite()) {
                    arrayList3.add(getmediaitem6);
                }
            }
            arrayListRemoteActionCompatParcelizer2 = arrayList3;
        }
        List list4 = arrayListRemoteActionCompatParcelizer2;
        int i69 = i2 + i3 + i4;
        int i70 = i10;
        getMediaItem getmediaitemWrite = write(i69, list2, i3, i4, i8, getinsetsignoringvisibility, i);
        int iWrite3 = getinsetsignoringvisibility.write(i69, i8, i3, i4, getmediaitemWrite != null ? getmediaitemWrite.getWrite() : 0, i);
        if (getmediaitemWrite != null) {
            mediaBrowserCompatMediaItem = getmediaitemWrite.getMediaBrowserCompatMediaItem();
            i15 = i30;
        } else {
            i15 = i30;
            mediaBrowserCompatMediaItem = 0;
        }
        return new removeEventListener(list2, i8, i5, i4, superdispatchkeyevent, i28, i49, z, i31, getmediaitem2, getmediaitemWrite, i15 == 0 ? BitmapDescriptorFactory.HUE_RED : getQues.read((iWrite3 - mediaBrowserCompatMediaItem) / i15, -0.5f, 0.5f), i62, i70 < i || i64 > i2, getinsetsignoringvisibility, getmoduledata.AudioAttributesCompatParcelizer(Integer.valueOf(iIconCompatParcelizer), Integer.valueOf(iRemoteActionCompatParcelizer2), new getAnswerMap() { // from class: o.releaseSource
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return removeDrmEventListener.AudioAttributesCompatParcelizer(inputAccessor, listRemoteActionCompatParcelizer, (_parser.IconCompatParcelizer) obj);
            }
        }), i41, list3, list4, topUserCompanion, buffermapproperty, j4, null);
    }

    private static final getMediaItem write(int i, List<getMediaItem> list, int i2, int i3, int i4, getInsetsIgnoringVisibility getinsetsignoringvisibility, int i5) {
        getMediaItem getmediaitem;
        if (list.isEmpty()) {
            getmediaitem = null;
        } else {
            getMediaItem getmediaitem2 = list.get(0);
            getMediaItem getmediaitem3 = getmediaitem2;
            float f = -Math.abs(getStableInsets.IconCompatParcelizer(i, i2, i3, i4, getmediaitem3.getMediaBrowserCompatMediaItem(), getmediaitem3.getWrite(), getinsetsignoringvisibility, i5));
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i6 = 1;
                while (true) {
                    getMediaItem getmediaitem4 = list.get(i6);
                    getMediaItem getmediaitem5 = getmediaitem4;
                    float f2 = -Math.abs(getStableInsets.IconCompatParcelizer(i, i2, i3, i4, getmediaitem5.getMediaBrowserCompatMediaItem(), getmediaitem5.getWrite(), getinsetsignoringvisibility, i5));
                    if (Float.compare(f, f2) < 0) {
                        getmediaitem2 = getmediaitem4;
                        f = f2;
                    }
                    if (i6 == iWrite) {
                        break;
                    }
                    i6++;
                }
            }
            getmediaitem = getmediaitem2;
        }
        return getmediaitem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(List list, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((getMediaItem) list.get(i)).write(iconCompatParcelizer);
        }
        return getShowPopup.INSTANCE;
    }
}

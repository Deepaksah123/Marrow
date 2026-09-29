package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\u001aÙ\u0002\u00105\u001a\u0002042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2$\u0010+\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0*0\u001d0)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000)2\b\u0010.\u001a\u0004\u0018\u00010-2*\u00103\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010)\u0012\u0004\u0012\u0002020/H\u0000¢\u0006\u0004\b5\u00106\u001aM\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002070\u001d2\b\u0010\b\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b8\u00109\u001a\u0093\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0:2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002070\u001d2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u0010;\u001a-\u00105\u001a\u000201\"\u0004\b\u0000\u0010<*\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0002¢\u0006\u0004\b5\u0010>"}, d2 = {"", "p0", "Lo/internalPathIteratorHasNext;", "p1", "Lo/internalConicToQuadratics;", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "", "p9", "Lo/PropertyValueAny;", "p10", "", "p11", "Lo/WindowInsetsCompatImpl30$RatingCompat;", "p12", "Lo/WindowInsetsCompatImpl30$write;", "p13", "p14", "Lo/bufferMapProperty;", "p15", "Lo/stopLoading;", "Lo/createInternalPathIterator;", "p16", "p17", "", "p18", "p19", "p20", "Lo/FragmentManagerState;", "p21", "Lo/TopUserCompanion;", "p22", "Lo/setAuxEffectInfo;", "p23", "Lo/buf;", "p24", "Lkotlin/Function1;", "Lo/getSubscriptionExpiresOn;", "p25", "p26", "Lo/setSkipSilenceEnabled;", "p27", "Lkotlin/Function3;", "Lo/_parser$IconCompatParcelizer;", "", "Lo/withHandlersFrom;", "p28", "Lo/destroyInternalPathIterator;", "RemoteActionCompatParcelizer", "(ILo/internalPathIteratorHasNext;Lo/internalConicToQuadratics;IIIIIIFJZLo/WindowInsetsCompatImpl30$RatingCompat;Lo/WindowInsetsCompatImpl30$write;ZLo/bufferMapProperty;Lo/stopLoading;ILjava/util/List;ZZLo/FragmentManagerState;Lo/TopUserCompanion;Lo/InputAccessor;Lo/buf;Lo/getAnswerMap;Lo/getAnswerMap;Lo/setSkipSilenceEnabled;Lo/getModuleData;)Lo/destroyInternalPathIterator;", "Lo/PathIteratorPreApi34Impl;", "IconCompatParcelizer", "(IILo/internalPathIteratorHasNext;ZLjava/util/List;Lo/FragmentManagerState;)Ljava/util/List;", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLo/WindowInsetsCompatImpl30$RatingCompat;Lo/WindowInsetsCompatImpl30$write;ZLo/bufferMapProperty;)Ljava/util/List;", "T", "", "(Ljava/util/List;[Ljava/lang/Object;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setup {
    private static final int IconCompatParcelizer(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createInternalPathIterator read(internalPathIteratorHasNext internalpathiteratorhasnext, internalConicToQuadratics internalconictoquadratics, int i) {
        int iRemoteActionCompatParcelizer = internalpathiteratorhasnext.RemoteActionCompatParcelizer(i);
        return internalconictoquadratics.RemoteActionCompatParcelizer(i, 0, iRemoteActionCompatParcelizer, internalpathiteratorhasnext.read(0, iRemoteActionCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, final List list, final List list2, final boolean z, _parser.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.ConicConverter
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setup.IconCompatParcelizer(list, list2, z, (_parser.IconCompatParcelizer) obj);
            }
        });
        setAuxEffectInfo.write(inputAccessor);
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[LOOP:1: B:24:0x0071->B:37:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1 A[EDGE_INSN: B:47:0x00b1->B:38:0x00b1 BREAK  A[LOOP:1: B:24:0x0071->B:37:0x00ae], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List<kotlin.PathIteratorPreApi34Impl> IconCompatParcelizer(int r6, int r7, kotlin.internalPathIteratorHasNext r8, boolean r9, java.util.List<kotlin.PathIteratorPreApi34Impl> r10, kotlin.FragmentManagerState r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Lb1
            if (r11 == 0) goto Lb1
            java.util.List r9 = r11.AudioAttributesImplApi21Parcelizer()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lb1
            java.util.List r9 = r11.AudioAttributesImplApi21Parcelizer()
            int r1 = r9.size()
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L43
            java.lang.Object r2 = r9.get(r1)
            o.onResumeFragments r2 = (kotlin.onResumeFragments) r2
            int r2 = r2.getIconCompatParcelizer()
            if (r2 <= r6) goto L40
            if (r1 == 0) goto L39
            int r2 = r1 + (-1)
            java.lang.Object r2 = r9.get(r2)
            o.onResumeFragments r2 = (kotlin.onResumeFragments) r2
            int r2 = r2.getIconCompatParcelizer()
            if (r2 > r6) goto L40
        L39:
            java.lang.Object r6 = r9.get(r1)
            o.onResumeFragments r6 = (kotlin.onResumeFragments) r6
            goto L44
        L40:
            int r1 = r1 + (-1)
            goto L1b
        L43:
            r6 = r0
        L44:
            java.util.List r9 = r11.AudioAttributesImplApi21Parcelizer()
            java.lang.Object r9 = kotlin.IntermediateLoginResponseBody.MediaBrowserCompatMediaItem(r9)
            o.onResumeFragments r9 = (kotlin.onResumeFragments) r9
            java.lang.Object r10 = kotlin.IntermediateLoginResponseBody.MediaMetadataCompat(r10)
            o.PathIteratorPreApi34Impl r10 = (kotlin.PathIteratorPreApi34Impl) r10
            r11 = 0
            if (r10 == 0) goto L5e
            int r10 = r10.getIconCompatParcelizer()
            int r10 = r10 + 1
            goto L5f
        L5e:
            r10 = r11
        L5f:
            if (r6 == 0) goto Lb1
            int r6 = r6.getIconCompatParcelizer()
            int r9 = r9.getIconCompatParcelizer()
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto Lb1
        L71:
            if (r0 == 0) goto L99
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r1 = r11
        L7b:
            if (r1 >= r9) goto L99
            java.lang.Object r2 = r0.get(r1)
            o.PathIteratorPreApi34Impl r2 = (kotlin.PathIteratorPreApi34Impl) r2
            o.createInternalPathIterator[] r2 = r2.getRead()
            int r3 = r2.length
            r4 = r11
        L89:
            if (r4 >= r3) goto L96
            r5 = r2[r4]
            int r5 = r5.getIconCompatParcelizer()
            if (r5 == r6) goto Lac
            int r4 = r4 + 1
            goto L89
        L96:
            int r1 = r1 + 1
            goto L7b
        L99:
            if (r0 != 0) goto La3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = r9
            java.util.List r0 = (java.util.List) r0
        La3:
            o.PathIteratorPreApi34Impl r9 = r8.read(r10)
            int r10 = r10 + 1
            r0.add(r9)
        Lac:
            if (r6 == r7) goto Lb1
            int r6 = r6 + 1
            goto L71
        Lb1:
            if (r0 != 0) goto Lb8
            java.util.List r6 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer()
            return r6
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setup.IconCompatParcelizer(int, int, o.internalPathIteratorHasNext, boolean, java.util.List, o.FragmentManagerState):java.util.List");
    }

    private static final List<createInternalPathIterator> RemoteActionCompatParcelizer(List<PathIteratorPreApi34Impl> list, List<createInternalPathIterator> list2, List<createInternalPathIterator> list3, int i, int i2, int i3, int i4, int i5, boolean z, WindowInsetsCompatImpl30.RatingCompat ratingCompat, WindowInsetsCompatImpl30.write writeVar, boolean z2, bufferMapProperty buffermapproperty) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            getRootStableInsets.AudioAttributesCompatParcelizer("non-zero firstLineScrollOffset");
        }
        List<PathIteratorPreApi34Impl> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getRead().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                getRootStableInsets.RemoteActionCompatParcelizer("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = list.get(IconCompatParcelizer(i8, z2, size2)).getAudioAttributesImplApi26Parcelizer();
            }
            int[] iArr2 = new int[size2];
            if (z) {
                if (ratingCompat != null) {
                    ratingCompat.write(buffermapproperty, i6, iArr, iArr2);
                } else {
                    getRootStableInsets.read("null verticalArrangement");
                    throw new PlanDetailsCreator();
                }
            } else if (writeVar != null) {
                writeVar.AudioAttributesCompatParcelizer(buffermapproperty, i6, iArr, tryToResolveUnresolved.write, iArr2);
            } else {
                getRootStableInsets.read("null horizontalArrangement");
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
                    int audioAttributesImplApi26Parcelizer = iArr2[read];
                    PathIteratorPreApi34Impl pathIteratorPreApi34Impl = list.get(IconCompatParcelizer(read, z2, size2));
                    if (z2) {
                        audioAttributesImplApi26Parcelizer = (i6 - audioAttributesImplApi26Parcelizer) - pathIteratorPreApi34Impl.getAudioAttributesImplApi26Parcelizer();
                    }
                    RemoteActionCompatParcelizer(arrayList, pathIteratorPreApi34Impl.IconCompatParcelizer(audioAttributesImplApi26Parcelizer, i, i2));
                    if (read == audioAttributesCompatParcelizer) {
                        break;
                    }
                    read += iconCompatParcelizer;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5;
                while (true) {
                    int i9 = size3 - 1;
                    createInternalPathIterator createinternalpathiterator = list2.get(size3);
                    mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver -= createinternalpathiterator.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    createinternalpathiterator.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 0, i, i2);
                    arrayList.add(createinternalpathiterator);
                    if (i9 < 0) {
                        break;
                    }
                    size3 = i9;
                }
            }
            int size4 = list4.size();
            int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = i5;
            for (int i10 = 0; i10 < size4; i10++) {
                PathIteratorPreApi34Impl pathIteratorPreApi34Impl2 = list.get(i10);
                RemoteActionCompatParcelizer(arrayList, pathIteratorPreApi34Impl2.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2, i, i2));
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 += pathIteratorPreApi34Impl2.getMediaBrowserCompatItemReceiver();
            }
            int size5 = list3.size();
            for (int i11 = 0; i11 < size5; i11++) {
                createInternalPathIterator createinternalpathiterator2 = list3.get(i11);
                createinternalpathiterator2.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2, 0, i, i2);
                arrayList.add(createinternalpathiterator2);
                mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 += createinternalpathiterator2.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        }
        return arrayList;
    }

    private static final <T> void RemoteActionCompatParcelizer(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.destroyInternalPathIterator RemoteActionCompatParcelizer(int r39, final kotlin.internalPathIteratorHasNext r40, final kotlin.internalConicToQuadratics r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, long r49, boolean r51, o.WindowInsetsCompatImpl30.RatingCompat r52, o.WindowInsetsCompatImpl30.write r53, boolean r54, kotlin.bufferMapProperty r55, kotlin.stopLoading<kotlin.createInternalPathIterator> r56, int r57, java.util.List<java.lang.Integer> r58, boolean r59, boolean r60, kotlin.FragmentManagerState r61, kotlin.TopUserCompanion r62, final kotlin.InputAccessor<kotlin.getShowPopup> r63, kotlin.buf r64, kotlin.getAnswerMap<? super java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.Integer, kotlin.PropertyValueAny>>> r65, kotlin.getAnswerMap<? super java.lang.Integer, java.lang.Integer> r66, kotlin.setSkipSilenceEnabled r67, kotlin.getModuleData<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.getAnswerMap<? super o._parser.IconCompatParcelizer, kotlin.getShowPopup>, ? extends kotlin.withHandlersFrom> r68) {
        /*
            Method dump skipped, instruction units count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setup.RemoteActionCompatParcelizer(int, o.internalPathIteratorHasNext, o.internalConicToQuadratics, int, int, int, int, int, int, float, long, boolean, o.WindowInsetsCompatImpl30$RatingCompat, o.WindowInsetsCompatImpl30$write, boolean, o.bufferMapProperty, o.stopLoading, int, java.util.List, boolean, boolean, o.FragmentManagerState, o.TopUserCompanion, o.InputAccessor, o.buf, o.getAnswerMap, o.getAnswerMap, o.setSkipSilenceEnabled, o.getModuleData):o.destroyInternalPathIterator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, List list2, boolean z, _parser.IconCompatParcelizer iconCompatParcelizer) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((createInternalPathIterator) list.get(i)).read(iconCompatParcelizer, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((createInternalPathIterator) list2.get(i2)).read(iconCompatParcelizer, z);
        }
        return getShowPopup.INSTANCE;
    }
}

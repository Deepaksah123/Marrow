package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001aH\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a`\u0010\b\u001a\u00020\t*\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u000eH\u0002\u001aL\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0012H\u0000\u001aL\u0010\u0013\u001a\u00020\u00052:\u0010\u0014\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00150\u000bj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u0015`\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002\"&\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c0\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\" \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"subtreeSortedByGeometryGrouping", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "isVisible", "Lkotlin/Function1;", "", "isFocusableContainer", "listToSort", "geometryDepthFirstSearch", "", "geometryList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "containerMapToChildren", "Landroidx/collection/MutableIntObjectMap;", "sortByGeometryGroupings", "parentListToSort", "containerChildrenMapping", "Landroidx/collection/IntObjectMap;", "placedEntryRowOverlaps", "rowGroupings", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "node", "semanticComparators", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "[Ljava/util/Comparator;", "UnmergedConfigComparator", "Lkotlin/Function2;", "", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class introspectClassAnnotations {
    private static final MagicModuleSubmissionRequestBody<valueInstantiatorInstance, valueInstantiatorInstance, Integer> RemoteActionCompatParcelizer;
    private static final Comparator<valueInstantiatorInstance>[] read;

    public static final List<valueInstantiatorInstance> IconCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap2, List<valueInstantiatorInstance> list) {
        setProvider setproviderWrite = ActionMenuView.write();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(list.get(i), arrayList, getanswermap, getanswermap2, setproviderWrite);
        }
        return AudioAttributesCompatParcelizer(valueinstantiatorinstance, arrayList, getanswermap2, setproviderWrite);
    }

    /* JADX INFO: renamed from: o.introspectClassAnnotations$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        public static final AnonymousClass2 write = new AnonymousClass2();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }

        AnonymousClass2() {
            super(0);
        }
    }

    private static final void RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, ArrayList<valueInstantiatorInstance> arrayList, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap2, setProvider<List<valueInstantiatorInstance>> setprovider) {
        boolean zBooleanValue = ((Boolean) valueinstantiatorinstance.getWrite().IconCompatParcelizer(_this.INSTANCE.onPause(), AnonymousClass2.write)).booleanValue();
        if ((zBooleanValue || getanswermap2.invoke(valueinstantiatorinstance).booleanValue()) && getanswermap.invoke(valueinstantiatorinstance).booleanValue()) {
            arrayList.add(valueinstantiatorinstance);
        }
        if (zBooleanValue) {
            setprovider.write(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer(), IconCompatParcelizer(valueinstantiatorinstance, getanswermap, getanswermap2, valueinstantiatorinstance.MediaBrowserCompatItemReceiver()));
            return;
        }
        List<valueInstantiatorInstance> listMediaBrowserCompatItemReceiver = valueinstantiatorinstance.MediaBrowserCompatItemReceiver();
        int size = listMediaBrowserCompatItemReceiver.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(listMediaBrowserCompatItemReceiver.get(i), arrayList, getanswermap, getanswermap2, setprovider);
        }
    }

    public static final List<valueInstantiatorInstance> AudioAttributesCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, List<valueInstantiatorInstance> list, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap, setExpandedActionViewsExclusive<List<valueInstantiatorInstance>> setexpandedactionviewsexclusive) {
        int size = 0;
        char c = valueinstantiatorinstance.MediaBrowserCompatCustomActionResultReceiver().getOnStop() == tryToResolveUnresolved.RemoteActionCompatParcelizer ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int iWrite = IntermediateLoginResponseBody.write((List) list);
        if (iWrite >= 0) {
            int i = 0;
            while (true) {
                valueInstantiatorInstance valueinstantiatorinstance2 = list.get(i);
                if (i == 0 || !IconCompatParcelizer(arrayList, valueinstantiatorinstance2)) {
                    arrayList.add(new Pair(valueinstantiatorinstance2.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.write(valueinstantiatorinstance2)));
                }
                if (i == iWrite) {
                    break;
                }
                i++;
            }
        }
        ArrayList arrayList2 = arrayList;
        IntermediateLoginResponseBody.IconCompatParcelizer(arrayList2, findMixInClassFor.RemoteActionCompatParcelizer);
        ArrayList arrayList3 = new ArrayList();
        Comparator<valueInstantiatorInstance> comparator = read[c ^ 1];
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) arrayList2.get(i2);
            IntermediateLoginResponseBody.IconCompatParcelizer((List) pair.IconCompatParcelizer(), comparator);
            arrayList3.addAll((Collection) pair.IconCompatParcelizer());
        }
        ArrayList arrayList4 = arrayList3;
        final MagicModuleSubmissionRequestBody<valueInstantiatorInstance, valueInstantiatorInstance, Integer> magicModuleSubmissionRequestBody = RemoteActionCompatParcelizer;
        IntermediateLoginResponseBody.IconCompatParcelizer(arrayList4, new Comparator() { // from class: o.getDefaultVisibilityChecker
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return introspectClassAnnotations.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, obj, obj2);
            }
        });
        while (size <= IntermediateLoginResponseBody.write((List) arrayList4)) {
            List<valueInstantiatorInstance> listAudioAttributesCompatParcelizer = setexpandedactionviewsexclusive.AudioAttributesCompatParcelizer(((valueInstantiatorInstance) arrayList3.get(size)).getAudioAttributesImplApi21Parcelizer());
            if (listAudioAttributesCompatParcelizer != null) {
                if (getanswermap.invoke(arrayList3.get(size)).booleanValue()) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, listAudioAttributesCompatParcelizer);
                size += listAudioAttributesCompatParcelizer.size();
            } else {
                size++;
            }
        }
        return arrayList4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        return ((Number) magicModuleSubmissionRequestBody.invoke(obj, obj2)).intValue();
    }

    private static final boolean IconCompatParcelizer(ArrayList<Pair<WritableTypeIdInclusion, List<valueInstantiatorInstance>>> arrayList, valueInstantiatorInstance valueinstantiatorinstance) {
        float remoteActionCompatParcelizer = valueinstantiatorinstance.RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
        float iconCompatParcelizer = valueinstantiatorinstance.RemoteActionCompatParcelizer().getIconCompatParcelizer();
        boolean z = remoteActionCompatParcelizer >= iconCompatParcelizer;
        int iWrite = IntermediateLoginResponseBody.write((List) arrayList);
        if (iWrite >= 0) {
            int i = 0;
            while (true) {
                WritableTypeIdInclusion writableTypeIdInclusionWrite = arrayList.get(i).write();
                boolean z2 = writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer() >= writableTypeIdInclusionWrite.getIconCompatParcelizer();
                if (!z && !z2 && Math.max(remoteActionCompatParcelizer, writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer()) < Math.min(iconCompatParcelizer, writableTypeIdInclusionWrite.getIconCompatParcelizer())) {
                    arrayList.set(i, new Pair<>(writableTypeIdInclusionWrite.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, remoteActionCompatParcelizer, Float.POSITIVE_INFINITY, iconCompatParcelizer), arrayList.get(i).IconCompatParcelizer()));
                    arrayList.get(i).IconCompatParcelizer().add(valueinstantiatorinstance);
                    return true;
                }
                if (i == iWrite) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    static {
        Comparator comparator;
        Comparator<valueInstantiatorInstance>[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                comparator = hasKeyDeserializers.read;
            } else {
                comparator = hasDeserializerModifiers.RemoteActionCompatParcelizer;
            }
            final Comparator comparator2 = comparator;
            final Comparator<_assertNotNull> comparator3 = _assertNotNull.INSTANCE.read();
            final Comparator comparator4 = new Comparator() { // from class: o.introspectClassAnnotations.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator2.compare(t, t2);
                    return iCompare != 0 ? iCompare : comparator3.compare(((valueInstantiatorInstance) t).getIconCompatParcelizer(), ((valueInstantiatorInstance) t2).getIconCompatParcelizer());
                }
            };
            comparatorArr[i] = new Comparator() { // from class: o.introspectClassAnnotations.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator4.compare(t, t2);
                    return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Integer.valueOf(((valueInstantiatorInstance) t).getAudioAttributesImplApi21Parcelizer()), Integer.valueOf(((valueInstantiatorInstance) t2).getAudioAttributesImplApi21Parcelizer()));
                }
            };
        }
        read = comparatorArr;
        RemoteActionCompatParcelizer = AnonymousClass4.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.introspectClassAnnotations$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "p1", "", "write", "(Lo/valueInstantiatorInstance;Lo/valueInstantiatorInstance;)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<valueInstantiatorInstance, valueInstantiatorInstance, Integer> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        /* JADX INFO: renamed from: o.introspectClassAnnotations$4$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Float> {
            public static final AnonymousClass5 RemoteActionCompatParcelizer = new AnonymousClass5();

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            }

            AnonymousClass5() {
                super(0);
            }
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(valueInstantiatorInstance valueinstantiatorinstance, valueInstantiatorInstance valueinstantiatorinstance2) {
            return Integer.valueOf(Float.compare(((Number) valueinstantiatorinstance.getWrite().IconCompatParcelizer(_this.INSTANCE.setSessionImpl(), AnonymousClass5.RemoteActionCompatParcelizer)).floatValue(), ((Number) valueinstantiatorinstance2.getWrite().IconCompatParcelizer(_this.INSTANCE.setSessionImpl(), AnonymousClass3.IconCompatParcelizer)).floatValue()));
        }

        /* JADX INFO: renamed from: o.introspectClassAnnotations$4$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Float> {
            public static final AnonymousClass3 IconCompatParcelizer = new AnonymousClass3();

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            }

            AnonymousClass3() {
                super(0);
            }
        }

        AnonymousClass4() {
            super(2);
        }
    }
}

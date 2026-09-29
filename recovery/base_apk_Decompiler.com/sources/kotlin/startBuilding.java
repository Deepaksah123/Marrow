package kotlin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aw\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u000f22\u0010\u0001\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00102\u0006\u0010\u0003\u001a\u00020\u00132\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u0004\u001a\u00020\u0007*\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0019\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\u001a\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u000e\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u001d\u001a9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u0003\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H\u0002¢\u0006\u0004\b\u000b\u0010 \u001a9\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u0003\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H\u0002¢\u0006\u0004\b!\u0010 \u001aA\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\u0017\u0010&\u001a+\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0'2\u0006\u0010\u0003\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*\u001a!\u0010!\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030+2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010,\"\u001a\u0010\u0004\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b\u0004\u0010.\"\u0014\u0010\u0017\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100\"\u0014\u0010\u000b\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u00100"}, d2 = {"", "p0", "Lo/PropertyValue;", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Lo/PropertyValue;)Lo/PropertyValue;", "Lo/JsonReadFeature;", "Lo/ObjectIdReferenceProperty;", "(Lo/JsonReadFeature;Lo/PropertyValue;)Lo/ObjectIdReferenceProperty;", "Lo/isEnumImplType;", "Lo/appendReferring;", "RemoteActionCompatParcelizer", "(Lo/isEnumImplType;)Lo/appendReferring;", "T", "R", "Lo/JsonReadContext;", "Lkotlin/Function4;", "Lo/PropertyBasedObjectIdGenerator;", "", "Lo/PropertyBasedCreator;", "", "", "p2", "write", "(Lo/JsonReadContext;Lo/getMagicModuleStat;Lo/PropertyBasedCreator;Ljava/util/Map;)Ljava/lang/Object;", "(Lo/JsonReadContext;)Lo/ObjectIdReferenceProperty;", "(Lo/appendReferring;Lo/appendReferring;)Lo/appendReferring;", "", "Lo/assign;", "(Ljava/util/List;Lo/PropertyValue;)Ljava/util/List;", "Ljava/lang/reflect/Field;", "Lo/_nextTokenNotInObject;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", "AudioAttributesCompatParcelizer", "", "p3", "p4", "p5", "(Ljava/lang/reflect/Field;Ljava/lang/Object;IIILo/_nextTokenNotInObject;)Lo/assign;", "", "", "read", "([Ljava/lang/reflect/Field;Z)Ljava/util/List;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "Lo/appendReferring;", "()Lo/appendReferring;", "Lo/newYearNameItem;", "Lo/newYearNameItem;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class startBuilding {
    private static final appendReferring IconCompatParcelizer = new appendReferring(0, 0, 0, 0);
    private static final newYearNameItem RemoteActionCompatParcelizer = new newYearNameItem("^f\\$\\d+$");
    private static final newYearNameItem AudioAttributesCompatParcelizer = new newYearNameItem("^\\$([^$]+)$|\\$\\$.*?\\$-([^$]+)\\$\\d+$");

    public static final appendReferring IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    static /* synthetic */ PropertyValue IconCompatParcelizer$default(String str, PropertyValue propertyValue, int i, Object obj) {
        if ((i & 2) != 0) {
            propertyValue = null;
        }
        return IconCompatParcelizer(str, propertyValue);
    }

    private static final PropertyValue IconCompatParcelizer(String str, PropertyValue propertyValue) {
        String str2;
        int i;
        _skipCComment _skipccommentWrite = _skipAfterComma2.write(str);
        Integer numValueOf = null;
        if (_skipccommentWrite == null) {
            return null;
        }
        String write = _skipccommentWrite.getWrite();
        String read = _skipccommentWrite.getRead();
        if (read != null) {
            str2 = read;
        } else if (propertyValue != null) {
            read = propertyValue.getAudioAttributesCompatParcelizer();
            str2 = read;
        } else {
            str2 = null;
        }
        if (_skipccommentWrite.getRead() != null) {
            String mediaBrowserCompatCustomActionResultReceiver = _skipccommentWrite.getMediaBrowserCompatCustomActionResultReceiver();
            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                numValueOf = TestGroupLSModel.read(mediaBrowserCompatCustomActionResultReceiver, 36);
            }
        } else if (propertyValue != null) {
            numValueOf = Integer.valueOf(propertyValue.getRead());
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        List<_parseFloat> list = _skipccommentWrite.read();
        Iterator<_parseFloat> it = _skipccommentWrite.read().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getRemoteActionCompatParcelizer()) {
                i = i2;
                break;
            }
            i2++;
        }
        return new PropertyValue(write, str2, iIntValue, list, i, _skipccommentWrite.IconCompatParcelizer(), _skipccommentWrite.getRemoteActionCompatParcelizer(), _skipccommentWrite.getAudioAttributesCompatParcelizer());
    }

    private static final ObjectIdReferenceProperty IconCompatParcelizer(JsonReadFeature jsonReadFeature, PropertyValue propertyValue) {
        List<getAbsentValue> listRemoteActionCompatParcelizer;
        appendReferring appendreferringRemoteActionCompatParcelizer;
        Object objRemoteActionCompatParcelizer = jsonReadFeature.getWrite();
        String strAudioAttributesImplBaseParcelizer = jsonReadFeature.AudioAttributesImplBaseParcelizer();
        PropertyValue propertyValueIconCompatParcelizer = strAudioAttributesImplBaseParcelizer != null ? IconCompatParcelizer(strAudioAttributesImplBaseParcelizer, propertyValue) : null;
        Object objIconCompatParcelizer = jsonReadFeature.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = arrayList;
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList3, (Iterable) jsonReadFeature.AudioAttributesCompatParcelizer());
        Iterator<JsonReadFeature> it = jsonReadFeature.read().iterator();
        while (it.hasNext()) {
            arrayList2.add(IconCompatParcelizer(it.next(), propertyValueIconCompatParcelizer));
        }
        boolean z = objIconCompatParcelizer instanceof isEnumImplType;
        if (z) {
            listRemoteActionCompatParcelizer = ((isEnumImplType) objIconCompatParcelizer).AudioAttributesImplApi21Parcelizer();
        } else {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (z) {
            appendreferringRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((isEnumImplType) objIconCompatParcelizer);
        } else if (arrayList2.isEmpty()) {
            appendreferringRemoteActionCompatParcelizer = IconCompatParcelizer;
        } else {
            ArrayList arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((ObjectIdReferenceProperty) it2.next()).getIconCompatParcelizer());
            }
            Iterator it3 = arrayList5.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = RemoteActionCompatParcelizer((appendReferring) it3.next(), (appendReferring) next);
            }
            appendreferringRemoteActionCompatParcelizer = (appendReferring) next;
        }
        PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMapAudioAttributesImplApi26Parcelizer = (propertyValueIconCompatParcelizer == null || !propertyValueIconCompatParcelizer.getMediaBrowserCompatItemReceiver() || propertyValue == null) ? null : propertyValue.AudioAttributesImplApi26Parcelizer();
        if (objIconCompatParcelizer != null) {
            return new findCreatorProperty(objRemoteActionCompatParcelizer, objIconCompatParcelizer, appendreferringRemoteActionCompatParcelizer, arrayList3, listRemoteActionCompatParcelizer, arrayList2);
        }
        String iconCompatParcelizer = propertyValueIconCompatParcelizer != null ? propertyValueIconCompatParcelizer.getIconCompatParcelizer() : null;
        String iconCompatParcelizer2 = propertyValueIconCompatParcelizer != null ? propertyValueIconCompatParcelizer.getIconCompatParcelizer() : null;
        return new getIdType(objRemoteActionCompatParcelizer, iconCompatParcelizer, appendreferringRemoteActionCompatParcelizer, propertyBasedCreatorCaseInsensitiveMapAudioAttributesImplApi26Parcelizer, (iconCompatParcelizer2 == null || iconCompatParcelizer2.length() == 0 || (appendreferringRemoteActionCompatParcelizer.getIconCompatParcelizer() - appendreferringRemoteActionCompatParcelizer.getWrite() <= 0 && appendreferringRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() - appendreferringRemoteActionCompatParcelizer.getRead() <= 0)) ? null : jsonReadFeature.write(), IconCompatParcelizer(arrayList, propertyValueIconCompatParcelizer), arrayList3, arrayList2, propertyValueIconCompatParcelizer != null && propertyValueIconCompatParcelizer.getAudioAttributesImplApi21Parcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final appendReferring RemoteActionCompatParcelizer(isEnumImplType isenumimpltype) {
        isAbstract isabstractRemoteActionCompatParcelizer = isenumimpltype.RemoteActionCompatParcelizer();
        if (!isenumimpltype.AudioAttributesImplApi26Parcelizer() || !isabstractRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
            return new appendReferring(0, 0, isenumimpltype.MediaBrowserCompatCustomActionResultReceiver(), isenumimpltype.IconCompatParcelizer());
        }
        long jAudioAttributesImplApi26Parcelizer = hasRawClass.AudioAttributesImplApi26Parcelizer(isabstractRemoteActionCompatParcelizer);
        if ((((9223372034707292159L & jAudioAttributesImplApi26Parcelizer) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return new appendReferring(0, 0, isenumimpltype.MediaBrowserCompatCustomActionResultReceiver(), isenumimpltype.IconCompatParcelizer());
        }
        long jWrite = isabstractRemoteActionCompatParcelizer.write();
        int iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (jAudioAttributesImplApi26Parcelizer >> 32)));
        int iRemoteActionCompatParcelizer2 = getOnline.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) jAudioAttributesImplApi26Parcelizer));
        return new appendReferring(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, ((int) (jWrite >> 32)) + iRemoteActionCompatParcelizer, ((int) jWrite) + iRemoteActionCompatParcelizer2);
    }

    public static final <T, R> T write(JsonReadContext jsonReadContext, getMagicModuleStat<? super JsonReadFeature, ? super PropertyBasedObjectIdGenerator, ? super List<? extends T>, ? super List<? extends R>, ? extends T> getmagicmodulestat, PropertyBasedCreator propertyBasedCreator, Map<JsonReadFeature, List<R>> map) {
        JsonReadFeature jsonReadFeature = (JsonReadFeature) IntermediateLoginResponseBody.MediaMetadataCompat(jsonReadContext.read());
        if (jsonReadFeature == null) {
            return null;
        }
        getDeserializer getdeserializer = new getDeserializer(getmagicmodulestat, propertyBasedCreator.AudioAttributesCompatParcelizer(), map);
        ArrayList arrayList = new ArrayList();
        getdeserializer.IconCompatParcelizer(jsonReadFeature, 0, arrayList);
        return (T) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList);
    }

    public static final ObjectIdReferenceProperty IconCompatParcelizer(JsonReadContext jsonReadContext) {
        ObjectIdReferenceProperty objectIdReferencePropertyIconCompatParcelizer;
        JsonReadFeature jsonReadFeature = (JsonReadFeature) IntermediateLoginResponseBody.MediaMetadataCompat(jsonReadContext.read());
        return (jsonReadFeature == null || (objectIdReferencePropertyIconCompatParcelizer = IconCompatParcelizer(jsonReadFeature, (PropertyValue) null)) == null) ? ObjectIdReferencePropertyPropertyReferring.INSTANCE : objectIdReferencePropertyIconCompatParcelizer;
    }

    public static final appendReferring RemoteActionCompatParcelizer(appendReferring appendreferring, appendReferring appendreferring2) {
        appendReferring appendreferring3 = IconCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(appendreferring, appendreferring3)) {
            return appendreferring2;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(appendreferring2, appendreferring3)) {
            return appendreferring;
        }
        return new appendReferring(Math.min(appendreferring.getRead(), appendreferring2.getRead()), Math.min(appendreferring.getWrite(), appendreferring2.getWrite()), Math.max(appendreferring.getAudioAttributesCompatParcelizer(), appendreferring2.getAudioAttributesCompatParcelizer()), Math.max(appendreferring.getIconCompatParcelizer(), appendreferring2.getIconCompatParcelizer()));
    }

    private static final List<assign> IconCompatParcelizer(List<? extends Object> list, PropertyValue propertyValue) {
        Object next;
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && TestGroupLSModel.AudioAttributesImplApi21Parcelizer(next.getClass().getName(), ".RecomposeScopeImpl")) {
                break;
            }
        }
        if (next == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Field fieldAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(next.getClass(), "block");
        if (fieldAudioAttributesCompatParcelizer == null || (obj = fieldAudioAttributesCompatParcelizer.get(next)) == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<_nextTokenNotInObject> listRemoteActionCompatParcelizer = propertyValue != null ? propertyValue.RemoteActionCompatParcelizer() : null;
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Class<?> cls = obj.getClass();
        try {
            List<Field> list2 = read(cls.getDeclaredFields(), true);
            if (!list2.isEmpty()) {
                return RemoteActionCompatParcelizer(list2, obj, listRemoteActionCompatParcelizer);
            }
            return AudioAttributesCompatParcelizer(read(cls.getDeclaredFields(), false), obj, listRemoteActionCompatParcelizer);
        } catch (Exception unused) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
    }

    private static final List<assign> RemoteActionCompatParcelizer(List<Field> list, Object obj, List<_nextTokenNotInObject> list2) {
        boolean z;
        Object next;
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list, new Comparator() { // from class: o.startBuilding.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String name = ((Field) t).getName();
                Integer numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(TestGroupLSModel.read(name, "f$", name));
                Integer numValueOf = Integer.valueOf(numAudioAttributesImplApi26Parcelizer != null ? numAudioAttributesImplApi26Parcelizer.intValue() : Integer.MAX_VALUE);
                String name2 = ((Field) t2).getName();
                Integer numAudioAttributesImplApi26Parcelizer2 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(TestGroupLSModel.read(name2, "f$", name2));
                return getConfigExpirySeconds.read(numValueOf, Integer.valueOf(numAudioAttributesImplApi26Parcelizer2 != null ? numAudioAttributesImplApi26Parcelizer2.intValue() : Integer.MAX_VALUE));
            }
        });
        if (list2.isEmpty()) {
            z = true;
            break;
        }
        List<_nextTokenNotInObject> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((_nextTokenNotInObject) it.next()).getRemoteActionCompatParcelizer() != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List listWrite = z ? IntermediateLoginResponseBody.write((Iterable) listAudioAttributesCompatParcelizer, list2.size()) : listAudioAttributesCompatParcelizer;
        int size = z ? list2.size() : listAudioAttributesCompatParcelizer.size();
        Field field = (Field) IntermediateLoginResponseBody.read(listAudioAttributesCompatParcelizer, size);
        Object obj2 = field != null ? field.get(obj) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field field2 = (Field) IntermediateLoginResponseBody.read(listAudioAttributesCompatParcelizer, size + 1);
        Object obj3 = field2 != null ? field2.get(obj) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list4 = listWrite;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list4, 10));
        int i = 0;
        for (Object obj4 : list4) {
            int i2 = i + 1;
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            Field field3 = (Field) obj4;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((_nextTokenNotInObject) next).getWrite() == i) {
                    break;
                }
            }
            arrayList.add(write(field3, obj, i, iIntValue2, iIntValue, (_nextTokenNotInObject) next));
            i = i2;
        }
        return arrayList;
    }

    private static final List<assign> AudioAttributesCompatParcelizer(List<Field> list, Object obj, List<_nextTokenNotInObject> list2) throws IllegalAccessException {
        List<_nextTokenNotInObject> listAudioAttributesCompatParcelizer;
        int i;
        assign assignVarWrite;
        Class<?> cls = obj.getClass();
        Field fieldAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(cls, "$$default");
        Object obj2 = fieldAudioAttributesCompatParcelizer != null ? fieldAudioAttributesCompatParcelizer.get(obj) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field fieldAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(cls, "$$changed");
        Object obj3 = fieldAudioAttributesCompatParcelizer2 != null ? fieldAudioAttributesCompatParcelizer2.get(obj) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (!list2.isEmpty()) {
            List<_nextTokenNotInObject> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (((_nextTokenNotInObject) it.next()).getRemoteActionCompatParcelizer() != null) {
                        listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list2, new Comparator() { // from class: o.startBuilding.2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return getConfigExpirySeconds.read(((_nextTokenNotInObject) t).getRemoteActionCompatParcelizer(), ((_nextTokenNotInObject) t2).getRemoteActionCompatParcelizer());
                            }
                        });
                        break;
                    }
                }
            }
            listAudioAttributesCompatParcelizer = list2;
        } else {
            listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list2, new Comparator() { // from class: o.startBuilding.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getConfigExpirySeconds.read(((_nextTokenNotInObject) t).getRemoteActionCompatParcelizer(), ((_nextTokenNotInObject) t2).getRemoteActionCompatParcelizer());
                }
            });
            break;
        }
        List listAudioAttributesCompatParcelizer2 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list, new Comparator() { // from class: o.startBuilding.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read(startBuilding.AudioAttributesCompatParcelizer((Field) t), startBuilding.AudioAttributesCompatParcelizer((Field) t2));
            }
        });
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj4 : listAudioAttributesCompatParcelizer2) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            _nextTokenNotInObject _nexttokennotinobject = (_nextTokenNotInObject) IntermediateLoginResponseBody.read((List) listAudioAttributesCompatParcelizer, i2);
            if (_nexttokennotinobject == null) {
                _nexttokennotinobject = new _nextTokenNotInObject(i2, null, null, 6, null);
            }
            int write = _nexttokennotinobject.getWrite();
            if (write >= list.size()) {
                i = i2;
                assignVarWrite = null;
            } else {
                Field field = (Field) listAudioAttributesCompatParcelizer2.get(write);
                i = i2;
                assignVarWrite = write(field, obj, i2, iIntValue, iIntValue2, _nexttokennotinobject.getRemoteActionCompatParcelizer() == null ? new _nextTokenNotInObject(write, AudioAttributesCompatParcelizer(field), _nexttokennotinobject.getIconCompatParcelizer()) : _nexttokennotinobject);
            }
            if (assignVarWrite != null) {
                arrayList.add(assignVarWrite);
            }
            i2 = i + 1;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(Field field) {
        setTestBeginTimestamp settestbegintimestampRemoteActionCompatParcelizer;
        newPrevYearTestContainer newprevyeartestcontainer = newYearNameItem.read(AudioAttributesCompatParcelizer, field.getName());
        newHeaderTestItem newheadertestitemRemoteActionCompatParcelizer = newprevyeartestcontainer != null ? newprevyeartestcontainer.RemoteActionCompatParcelizer() : null;
        if (newheadertestitemRemoteActionCompatParcelizer == null || (settestbegintimestampRemoteActionCompatParcelizer = newheadertestitemRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1)) == null) {
            settestbegintimestampRemoteActionCompatParcelizer = newheadertestitemRemoteActionCompatParcelizer != null ? newheadertestitemRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(2) : null;
        }
        if (settestbegintimestampRemoteActionCompatParcelizer != null) {
            return settestbegintimestampRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
        return null;
    }

    private static final assign write(Field field, Object obj, int i, int i2, int i3, _nextTokenNotInObject _nexttokennotinobject) throws IllegalAccessException {
        String str;
        String remoteActionCompatParcelizer;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        boolean z = ((1 << i) & i2) != 0;
        int i4 = (i * 3) + 1;
        int i5 = (i3 & (7 << i4)) >> i4;
        int i6 = i5 & 3;
        boolean z2 = i6 == 3;
        boolean z3 = i6 == 0;
        boolean z4 = (i5 & 4) == 0;
        if (_nexttokennotinobject == null || (remoteActionCompatParcelizer = _nexttokennotinobject.getRemoteActionCompatParcelizer()) == null) {
            String strSubstring = field.getName().substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            str = strSubstring;
        } else {
            str = remoteActionCompatParcelizer;
        }
        return new assign(str, obj2, z, z2, z3 && !z, _nexttokennotinobject != null ? _nexttokennotinobject.getIconCompatParcelizer() : null, z4);
    }

    private static final Field AudioAttributesCompatParcelizer(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) field.getName(), (Object) str)) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    private static final List<Field> read(Field[] fieldArr, boolean z) {
        boolean zWrite;
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            if (z) {
                zWrite = RemoteActionCompatParcelizer.write(name);
            } else {
                zWrite = AudioAttributesCompatParcelizer.write(name);
            }
            if (zWrite && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, "$jacoco")) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }
}

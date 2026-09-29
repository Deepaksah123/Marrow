package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.getOption8AnsweredCount;
import kotlin.setActiveRecallQbankId;
import kotlin.setMsInterimHtmlEndTime;
import kotlin.setVideoId;

/* JADX INFO: loaded from: classes4.dex */
public final class getCourseStrings {
    private static final getNotesCount IconCompatParcelizer = new getNotesCount("kotlin.jvm.JvmStatic");

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getShowNotesWatermark.values().length];
            try {
                iArr[getShowNotesWatermark.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getShowNotesWatermark.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getShowNotesWatermark.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getShowNotesWatermark.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getShowNotesWatermark.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getShowNotesWatermark.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getShowNotesWatermark.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getShowNotesWatermark.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            write = iArr;
        }
    }

    public static final getNotesCount read() {
        return IconCompatParcelizer;
    }

    public static final Class<?> AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        getIntroDurationSeconds getintrodurationsecondsRatingCompat = courseConfigV2CustomModuleQuestionSource.RatingCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationsecondsRatingCompat, "");
        if (getintrodurationsecondsRatingCompat instanceof getLessonReadTimeText) {
            getMasterOrder getmasterorderRemoteActionCompatParcelizer = ((getLessonReadTimeText) getintrodurationsecondsRatingCompat).RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(getmasterorderRemoteActionCompatParcelizer, "");
            return ((getMsInterimHtmlStartTime) getmasterorderRemoteActionCompatParcelizer).IconCompatParcelizer();
        }
        if (getintrodurationsecondsRatingCompat instanceof setMsInterimHtmlEndTime.write) {
            hasImageCitation hasimagecitationWrite = ((setMsInterimHtmlEndTime.write) getintrodurationsecondsRatingCompat).write();
            toMagicModuleMetaRepoModel.read(hasimagecitationWrite, "");
            return ((getImageCitation) hasimagecitationWrite).RemoteActionCompatParcelizer();
        }
        RevisionSubjectStatusModel revisionSubjectStatusModel = setLocked.read((getQuestionLimit) courseConfigV2CustomModuleQuestionSource);
        if (revisionSubjectStatusModel == null) {
            return null;
        }
        return IconCompatParcelizer(getFinalImageUrl.read(courseConfigV2CustomModuleQuestionSource.getClass()), revisionSubjectStatusModel, 0);
    }

    private static /* synthetic */ Class AudioAttributesCompatParcelizer(ClassLoader classLoader, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        return IconCompatParcelizer(classLoader, revisionSubjectStatusModel, 0);
    }

    private static final Class<?> IconCompatParcelizer(ClassLoader classLoader, RevisionSubjectStatusModel revisionSubjectStatusModel, int i) {
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        getSlidesCount getslidescountAudioAttributesImplApi26Parcelizer = revisionSubjectStatusModel.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer, "");
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer = CourseConfigV2AnnouncementBanner.IconCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer);
        if (revisionSubjectStatusModelIconCompatParcelizer != null) {
            revisionSubjectStatusModel = revisionSubjectStatusModelIconCompatParcelizer;
        }
        String strRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String strRemoteActionCompatParcelizer2 = revisionSubjectStatusModel.IconCompatParcelizer().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2, "");
        return RemoteActionCompatParcelizer(classLoader, strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2, i);
    }

    private static final Class<?> RemoteActionCompatParcelizer(ClassLoader classLoader, String str, String str2, int i) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('.');
            sb.append(sb2.toString());
        }
        sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(str2, '.', '$', false));
        if (i > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return getMsInterimHtmlEndTime.write(classLoader, string);
    }

    public static final Class<?> IconCompatParcelizer(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final List<Annotation> RemoteActionCompatParcelizer(fromJSONArray fromjsonarray) {
        Annotation annotationAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(fromjsonarray, "");
        getQuote getquoteRemoteActionCompatParcelizer = fromjsonarray.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (dummyEditor dummyeditor : getquoteRemoteActionCompatParcelizer) {
            getIntroDurationSeconds getintrodurationsecondsIconCompatParcelizer = dummyeditor.IconCompatParcelizer();
            if (getintrodurationsecondsIconCompatParcelizer instanceof getReadableHtml) {
                annotationAudioAttributesCompatParcelizer = ((getReadableHtml) getintrodurationsecondsIconCompatParcelizer).read();
            } else if (getintrodurationsecondsIconCompatParcelizer instanceof setMsInterimHtmlEndTime.write) {
                hasImageCitation hasimagecitationWrite = ((setMsInterimHtmlEndTime.write) getintrodurationsecondsIconCompatParcelizer).write();
                getAspectRatio getaspectratio = hasimagecitationWrite instanceof getAspectRatio ? (getAspectRatio) hasimagecitationWrite : null;
                annotationAudioAttributesCompatParcelizer = getaspectratio != null ? getaspectratio.RemoteActionCompatParcelizer() : null;
            } else {
                annotationAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(dummyeditor);
            }
            if (annotationAudioAttributesCompatParcelizer != null) {
                arrayList.add(annotationAudioAttributesCompatParcelizer);
            }
        }
        return IconCompatParcelizer((List<? extends Annotation>) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Annotation> IconCompatParcelizer(List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listRemoteActionCompatParcelizer;
        List<? extends Annotation> list2 = list;
        if (list2.isEmpty()) {
            return list;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer((Annotation) it.next())).getSimpleName(), (Object) "Container")) {
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : list2) {
                    Class clsIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation));
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) clsIconCompatParcelizer.getSimpleName(), (Object) "Container") && clsIconCompatParcelizer.getAnnotation(MagicModuleUseCaseImplExternalSyntheticLambda1.class) != null) {
                        Object objInvoke = clsIconCompatParcelizer.getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.VALUE, new Class[0]).invoke(annotation, new Object[0]);
                        toMagicModuleMetaRepoModel.read(objInvoke, "");
                        listRemoteActionCompatParcelizer = getOrderDetails.read((Annotation[]) objInvoke);
                    } else {
                        listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(annotation);
                    }
                    IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) listRemoteActionCompatParcelizer);
                }
                return arrayList;
            }
        }
        return list;
    }

    private static final Annotation AudioAttributesCompatParcelizer(dummyEditor dummyeditor) {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = setLocked.RemoteActionCompatParcelizer(dummyeditor);
        Class<?> clsAudioAttributesCompatParcelizer = courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer != null ? AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer) : null;
        if (!(clsAudioAttributesCompatParcelizer instanceof Class)) {
            clsAudioAttributesCompatParcelizer = null;
        }
        if (clsAudioAttributesCompatParcelizer == null) {
            return null;
        }
        Set<Map.Entry<getRelatedLessonId, getMagicLine<?>>> setEntrySet = dummyeditor.read().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            getRelatedLessonId getrelatedlessonid = (getRelatedLessonId) entry.getKey();
            getMagicLine getmagicline = (getMagicLine) entry.getValue();
            ClassLoader classLoader = clsAudioAttributesCompatParcelizer.getClassLoader();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(classLoader, "");
            Object objWrite = write((getMagicLine<?>) getmagicline, classLoader);
            Pair pairWrite = objWrite != null ? setAction.write(getrelatedlessonid.AudioAttributesCompatParcelizer(), objWrite) : null;
            if (pairWrite != null) {
                arrayList.add(pairWrite);
            }
        }
        return (Annotation) getDeeplinks.RemoteActionCompatParcelizer(clsAudioAttributesCompatParcelizer, VideoTimelineResponseBody.read(arrayList));
    }

    private static final Object write(getMagicLine<?> getmagicline, ClassLoader classLoader) {
        if (getmagicline instanceof getActiveLessonId) {
            return AudioAttributesCompatParcelizer(((getActiveLessonId) getmagicline).AudioAttributesCompatParcelizer());
        }
        if (getmagicline instanceof getAnswerPointer) {
            return write((getAnswerPointer) getmagicline, classLoader);
        }
        if (getmagicline instanceof getMcqType) {
            Pair<? extends RevisionSubjectStatusModel, ? extends getRelatedLessonId> pairAudioAttributesCompatParcelizer = ((getMcqType) getmagicline).AudioAttributesCompatParcelizer();
            RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = pairAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            getRelatedLessonId getrelatedlessonid = pairAudioAttributesCompatParcelizer.read();
            Class clsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(classLoader, revisionSubjectStatusModelRemoteActionCompatParcelizer);
            if (clsAudioAttributesCompatParcelizer != null) {
                return getAcademicYears.write(clsAudioAttributesCompatParcelizer, getrelatedlessonid.AudioAttributesCompatParcelizer());
            }
            return null;
        }
        if (getmagicline instanceof getOption8AnsweredCount) {
            getOption8AnsweredCount.write writeVarAudioAttributesCompatParcelizer = ((getOption8AnsweredCount) getmagicline).AudioAttributesCompatParcelizer();
            if (writeVarAudioAttributesCompatParcelizer instanceof getOption8AnsweredCount.write.read) {
                getOption8AnsweredCount.write.read readVar = (getOption8AnsweredCount.write.read) writeVarAudioAttributesCompatParcelizer;
                return IconCompatParcelizer(classLoader, readVar.RemoteActionCompatParcelizer(), readVar.AudioAttributesCompatParcelizer());
            }
            if (!(writeVarAudioAttributesCompatParcelizer instanceof getOption8AnsweredCount.write.C0098write)) {
                throw new RenewEligibleCreator();
            }
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = ((getOption8AnsweredCount.write.C0098write) writeVarAudioAttributesCompatParcelizer).write().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
            if (courseConfigV2CustomModuleQuestionSource != null) {
                return AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource);
            }
            return null;
        }
        if ((getmagicline instanceof getOption1AnsweredCount) || (getmagicline instanceof getReferences)) {
            return null;
        }
        return getmagicline.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object write(getAnswerPointer getanswerpointer, ClassLoader classLoader) {
        getLink getlinkIconCompatParcelizer;
        Class clsAudioAttributesCompatParcelizer;
        isActiveLessonPaid isactivelessonpaid = getanswerpointer instanceof isActiveLessonPaid ? (isActiveLessonPaid) getanswerpointer : null;
        if (isactivelessonpaid == null || (getlinkIconCompatParcelizer = isactivelessonpaid.IconCompatParcelizer()) == null) {
            return null;
        }
        List<? extends getMagicLine<?>> listAudioAttributesCompatParcelizer = getanswerpointer.AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(write((getMagicLine<?>) it.next(), classLoader));
        }
        ArrayList arrayList2 = arrayList;
        getShowNotesWatermark getshownoteswatermark = getTestTabItems.read(getlinkIconCompatParcelizer);
        int i = 0;
        switch (getshownoteswatermark == null ? -1 : AudioAttributesCompatParcelizer.write[getshownoteswatermark.ordinal()]) {
            case -1:
                if (!getTestTabItems.RemoteActionCompatParcelizer(getlinkIconCompatParcelizer)) {
                    throw new IllegalStateException("Not an array type: ".concat(String.valueOf(getlinkIconCompatParcelizer)).toString());
                }
                getLink getlinkAudioAttributesCompatParcelizer = ((setDefault) IntermediateLoginResponseBody.onCommand((List) getlinkIconCompatParcelizer.bb_())).AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
                if (courseConfigV2CustomModuleQuestionSource == null) {
                    throw new IllegalStateException("Not a class type: ".concat(String.valueOf(getlinkAudioAttributesCompatParcelizer)).toString());
                }
                if (getTestTabItems.MediaBrowserCompatMediaItem(getlinkAudioAttributesCompatParcelizer)) {
                    int size = getanswerpointer.AudioAttributesCompatParcelizer().size();
                    String[] strArr = new String[size];
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        toMagicModuleMetaRepoModel.read(obj, "");
                        strArr[i] = obj;
                        i++;
                    }
                    return strArr;
                }
                if (getTestTabItems.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource)) {
                    int size2 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                    Class[] clsArr = new Class[size2];
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        toMagicModuleMetaRepoModel.read(obj2, "");
                        clsArr[i] = obj2;
                        i++;
                    }
                    return clsArr;
                }
                RevisionSubjectStatusModel revisionSubjectStatusModel = setLocked.read((getQuestionLimit) courseConfigV2CustomModuleQuestionSource);
                if (revisionSubjectStatusModel == null || (clsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(classLoader, revisionSubjectStatusModel)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsAudioAttributesCompatParcelizer, getanswerpointer.AudioAttributesCompatParcelizer().size());
                toMagicModuleMetaRepoModel.read(objNewInstance, "");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList2.size();
                while (i < size3) {
                    objArr[i] = arrayList2.get(i);
                    i++;
                }
                return objArr;
            case 0:
            default:
                throw new RenewEligibleCreator();
            case 1:
                int size4 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                boolean[] zArr = new boolean[size4];
                while (i < size4) {
                    Object obj3 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj3, "");
                    zArr[i] = ((Boolean) obj3).booleanValue();
                    i++;
                }
                return zArr;
            case 2:
                int size5 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                char[] cArr = new char[size5];
                while (i < size5) {
                    Object obj4 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj4, "");
                    cArr[i] = ((Character) obj4).charValue();
                    i++;
                }
                return cArr;
            case 3:
                int size6 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                byte[] bArr = new byte[size6];
                while (i < size6) {
                    Object obj5 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj5, "");
                    bArr[i] = ((Byte) obj5).byteValue();
                    i++;
                }
                return bArr;
            case 4:
                int size7 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                short[] sArr = new short[size7];
                while (i < size7) {
                    Object obj6 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj6, "");
                    sArr[i] = ((Short) obj6).shortValue();
                    i++;
                }
                return sArr;
            case 5:
                int size8 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                int[] iArr = new int[size8];
                while (i < size8) {
                    Object obj7 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj7, "");
                    iArr[i] = ((Integer) obj7).intValue();
                    i++;
                }
                return iArr;
            case 6:
                int size9 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                float[] fArr = new float[size9];
                while (i < size9) {
                    Object obj8 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj8, "");
                    fArr[i] = ((Float) obj8).floatValue();
                    i++;
                }
                return fArr;
            case 7:
                int size10 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                long[] jArr = new long[size10];
                while (i < size10) {
                    Object obj9 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj9, "");
                    jArr[i] = ((Long) obj9).longValue();
                    i++;
                }
                return jArr;
            case 8:
                int size11 = getanswerpointer.AudioAttributesCompatParcelizer().size();
                double[] dArr = new double[size11];
                while (i < size11) {
                    Object obj10 = arrayList2.get(i);
                    toMagicModuleMetaRepoModel.read(obj10, "");
                    dArr[i] = ((Double) obj10).doubleValue();
                    i++;
                }
                return dArr;
        }
    }

    public static final component17 read(Object obj) {
        component17 component17Var = obj instanceof component17 ? (component17) obj : null;
        if (component17Var != null) {
            return component17Var;
        }
        MagicModuleRepoModelsKt magicModuleRepoModelsKt = obj instanceof MagicModuleRepoModelsKt ? (MagicModuleRepoModelsKt) obj : null;
        isKycAuditIncomplete iskycauditincompleteAudioAttributesImplApi21Parcelizer = magicModuleRepoModelsKt != null ? magicModuleRepoModelsKt.AudioAttributesImplApi21Parcelizer() : null;
        if (iskycauditincompleteAudioAttributesImplApi21Parcelizer instanceof component17) {
            return (component17) iskycauditincompleteAudioAttributesImplApi21Parcelizer;
        }
        return null;
    }

    public static final component22<?> AudioAttributesCompatParcelizer(Object obj) {
        component22<?> component22Var = obj instanceof component22 ? (component22) obj : null;
        if (component22Var != null) {
            return component22Var;
        }
        MagicModuleUseCaseImpl magicModuleUseCaseImpl = obj instanceof MagicModuleUseCaseImpl ? (MagicModuleUseCaseImpl) obj : null;
        isKycAuditIncomplete iskycauditincompleteAudioAttributesImplApi21Parcelizer = magicModuleUseCaseImpl != null ? magicModuleUseCaseImpl.AudioAttributesImplApi21Parcelizer() : null;
        if (iskycauditincompleteAudioAttributesImplApi21Parcelizer instanceof component22) {
            return (component22) iskycauditincompleteAudioAttributesImplApi21Parcelizer;
        }
        return null;
    }

    public static final CourseConfigSerializerWhenMappings<?> IconCompatParcelizer(Object obj) {
        CourseConfigSerializerWhenMappings<?> courseConfigSerializerWhenMappings = obj instanceof CourseConfigSerializerWhenMappings ? (CourseConfigSerializerWhenMappings) obj : null;
        if (courseConfigSerializerWhenMappings != null) {
            return courseConfigSerializerWhenMappings;
        }
        component17 component17Var = read(obj);
        return component17Var != null ? component17Var : AudioAttributesCompatParcelizer(obj);
    }

    public static final CourseConfigV2TestTabItem RemoteActionCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        if (getvideopagenotestitle.write() == null) {
            return null;
        }
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getvideopagenotestitle.onPlayFromMediaId();
        toMagicModuleMetaRepoModel.read(getvariantAudioAttributesImplApi21Parcelizer, "");
        return ((CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer).onPlayFromSearch();
    }

    public static final <M extends BookReference, D extends getVideoPageNotesTitle> D read(Class<?> cls, M m, setRatingCount setratingcount, setTagActive settagactive, setPublishedTime setpublishedtime, MagicModuleSubmissionRequestBody<? super allFilterItem, ? super M, ? extends D> magicModuleSubmissionRequestBody) {
        List<setActiveRecallQbankId.onCustomAction> listOnCustomAction;
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(m, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        setImagesInfo setimagesinfoAudioAttributesCompatParcelizer = component30.AudioAttributesCompatParcelizer(cls);
        if (m instanceof setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) {
            listOnCustomAction = ((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) m).onCommand();
        } else {
            if (!(m instanceof setActiveRecallQbankId.MediaBrowserCompatMediaItem)) {
                throw new IllegalStateException("Unsupported message: ".concat(String.valueOf(m)).toString());
            }
            listOnCustomAction = ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) m).onCustomAction();
        }
        List<setActiveRecallQbankId.onCustomAction> list = listOnCustomAction;
        getPearlId getpearlidWrite = setimagesinfoAudioAttributesCompatParcelizer.write();
        getTopSection gettopsectionAudioAttributesCompatParcelizer = setimagesinfoAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        setVideoId.IconCompatParcelizer iconCompatParcelizer = setVideoId.AudioAttributesCompatParcelizer;
        setVideoId setvideoidRemoteActionCompatParcelizer = setVideoId.IconCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
        return magicModuleSubmissionRequestBody.invoke(new allFilterItem(new McqTimeSpent(getpearlidWrite, setratingcount, gettopsectionAudioAttributesCompatParcelizer, settagactive, setvideoidRemoteActionCompatParcelizer, setpublishedtime, null, null, list)), m);
    }

    public static final boolean read(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        getLink getlinkAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(deleteofflinedownloadedfiles, "");
        component26 component26Var = deleteofflinedownloadedfiles instanceof component26 ? (component26) deleteofflinedownloadedfiles : null;
        return (component26Var == null || (getlinkAudioAttributesCompatParcelizer = component26Var.AudioAttributesCompatParcelizer()) == null || !getOption3.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer)) ? false : true;
    }

    public static final Object IconCompatParcelizer(Type type) {
        toMagicModuleMetaRepoModel.write(type, "");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Character.TYPE)) {
            return (char) 0;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Short.TYPE)) {
            return (short) 0;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Integer.TYPE)) {
            return 0;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Float.TYPE)) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Long.TYPE)) {
            return 0L;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: ".concat(String.valueOf(type)));
    }
}

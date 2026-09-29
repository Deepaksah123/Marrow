package kotlin;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin._explicitClassOrOb;
import kotlin._ignorableAnnotation;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationCollectorEmptyCollector extends emptyAnnotations<_explicitClassOrOb.read> {
    AnnotationCollectorEmptyCollector() {
    }

    @Override // kotlin.emptyAnnotations
    final boolean AudioAttributesCompatParcelizer(constructPropertyCollector constructpropertycollector) {
        return constructpropertycollector instanceof _explicitClassOrOb.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.emptyAnnotations
    final isPresent<_explicitClassOrOb.read> read(Object obj) {
        return ((_explicitClassOrOb.RemoteActionCompatParcelizer) obj).extensions;
    }

    @Override // kotlin.emptyAnnotations
    final isPresent<_explicitClassOrOb.read> RemoteActionCompatParcelizer(Object obj) {
        return ((_explicitClassOrOb.RemoteActionCompatParcelizer) obj).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.emptyAnnotations
    final void AudioAttributesCompatParcelizer(Object obj) {
        read(obj).AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.emptyAnnotations
    final <UT, UB> UB AudioAttributesCompatParcelizer(getGetter getgetter, Object obj, asAnnotations asannotations, isPresent<_explicitClassOrOb.read> ispresent, UB ub, hasName<UT, UB> hasname) throws IOException {
        Object objValueOf;
        Object objIconCompatParcelizer;
        ArrayList arrayList;
        _explicitClassOrOb.write writeVar = (_explicitClassOrOb.write) obj;
        int i = writeVar.read();
        if (writeVar.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && writeVar.RemoteActionCompatParcelizer.write()) {
            switch (AnonymousClass2.AudioAttributesCompatParcelizer[writeVar.write().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    getgetter.IconCompatParcelizer(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    getgetter.AudioAttributesImplApi26Parcelizer(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    getgetter.AudioAttributesImplBaseParcelizer(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    getgetter.onCommand(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    getgetter.MediaBrowserCompatItemReceiver(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    getgetter.AudioAttributesImplApi21Parcelizer(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    getgetter.RemoteActionCompatParcelizer(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    getgetter.write(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    getgetter.handleMediaPlayPauseIfPendingOnHandler(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    getgetter.MediaBrowserCompatCustomActionResultReceiver(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    getgetter.MediaMetadataCompat(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    getgetter.MediaDescriptionCompat(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    getgetter.MediaBrowserCompatSearchResultReceiver(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    getgetter.read(arrayList);
                    ub = (UB) hasField.read(i, arrayList, writeVar.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), ub, hasname);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Type cannot be packed: ");
                    sb.append(writeVar.RemoteActionCompatParcelizer.IconCompatParcelizer());
                    throw new IllegalStateException(sb.toString());
            }
            ispresent.AudioAttributesCompatParcelizer(writeVar.RemoteActionCompatParcelizer, arrayList);
            return ub;
        }
        if (writeVar.write() == _ignorableAnnotation.IconCompatParcelizer.ENUM) {
            int iAudioAttributesImplApi26Parcelizer = getgetter.AudioAttributesImplApi26Parcelizer();
            if (writeVar.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer() == null) {
                return (UB) hasField.AudioAttributesCompatParcelizer(i, iAudioAttributesImplApi26Parcelizer, ub, hasname);
            }
            objValueOf = Integer.valueOf(iAudioAttributesImplApi26Parcelizer);
        } else {
            switch (AnonymousClass2.AudioAttributesCompatParcelizer[writeVar.write().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(getgetter.RemoteActionCompatParcelizer());
                    break;
                case 2:
                    objValueOf = Float.valueOf(getgetter.MediaBrowserCompatItemReceiver());
                    break;
                case 3:
                    objValueOf = Long.valueOf(getgetter.MediaBrowserCompatMediaItem());
                    break;
                case 4:
                    objValueOf = Long.valueOf(getgetter.handleMediaPlayPauseIfPendingOnHandler());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(getgetter.AudioAttributesImplApi26Parcelizer());
                    break;
                case 6:
                    objValueOf = Long.valueOf(getgetter.MediaBrowserCompatCustomActionResultReceiver());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(getgetter.AudioAttributesImplBaseParcelizer());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(getgetter.write());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(getgetter.onAddQueueItem());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(getgetter.MediaDescriptionCompat());
                    break;
                case 11:
                    objValueOf = Long.valueOf(getgetter.MediaMetadataCompat());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(getgetter.RatingCompat());
                    break;
                case 13:
                    objValueOf = Long.valueOf(getgetter.MediaBrowserCompatSearchResultReceiver());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = getgetter.AudioAttributesCompatParcelizer();
                    break;
                case 16:
                    objValueOf = getgetter.onCustomAction();
                    break;
                case 17:
                    objValueOf = getgetter.write(writeVar.AudioAttributesCompatParcelizer().getClass(), asannotations);
                    break;
                case 18:
                    objValueOf = getgetter.AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer().getClass(), asannotations);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        }
        if (writeVar.RemoteActionCompatParcelizer()) {
            ispresent.write(writeVar.RemoteActionCompatParcelizer, objValueOf);
            return ub;
        }
        int i2 = AnonymousClass2.AudioAttributesCompatParcelizer[writeVar.write().ordinal()];
        if ((i2 == 17 || i2 == 18) && (objIconCompatParcelizer = ispresent.IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer)) != null) {
            objValueOf = forDeserialization.RemoteActionCompatParcelizer(objIconCompatParcelizer, objValueOf);
        }
        ispresent.AudioAttributesCompatParcelizer(writeVar.RemoteActionCompatParcelizer, objValueOf);
        return ub;
    }

    /* JADX INFO: renamed from: o.AnnotationCollectorEmptyCollector$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[_ignorableAnnotation.IconCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[_ignorableAnnotation.IconCompatParcelizer.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AudioAttributesCompatParcelizer[_ignorableAnnotation.IconCompatParcelizer.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // kotlin.emptyAnnotations
    final int AudioAttributesCompatParcelizer(Map.Entry<?, ?> entry) {
        return ((_explicitClassOrOb.read) entry.getKey()).read();
    }

    @Override // kotlin.emptyAnnotations
    final void AudioAttributesCompatParcelizer(CollectorBase collectorBase, Map.Entry<?, ?> entry) throws IOException {
        _explicitClassOrOb.read readVar = (_explicitClassOrOb.read) entry.getKey();
        if (readVar.RemoteActionCompatParcelizer()) {
            switch (AnonymousClass2.AudioAttributesCompatParcelizer[readVar.IconCompatParcelizer().ordinal()]) {
                case 1:
                    hasField.AudioAttributesCompatParcelizer(readVar.read(), (List<Double>) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 2:
                    hasField.AudioAttributesImplApi26Parcelizer(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 3:
                    hasField.AudioAttributesImplApi21Parcelizer(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 4:
                    hasField.MediaBrowserCompatSearchResultReceiver(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 5:
                    hasField.MediaBrowserCompatCustomActionResultReceiver(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 6:
                    hasField.RemoteActionCompatParcelizer(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 7:
                    hasField.write(readVar.read(), (List<Integer>) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 8:
                    hasField.IconCompatParcelizer(readVar.read(), (List<Boolean>) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 9:
                    hasField.MediaMetadataCompat(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 10:
                    hasField.AudioAttributesImplBaseParcelizer(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 11:
                    hasField.MediaBrowserCompatItemReceiver(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 12:
                    hasField.MediaBrowserCompatMediaItem(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 13:
                    hasField.MediaDescriptionCompat(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 14:
                    hasField.MediaBrowserCompatCustomActionResultReceiver(readVar.read(), (List) entry.getValue(), collectorBase, readVar.write());
                    break;
                case 15:
                    hasField.IconCompatParcelizer(readVar.read(), (List<AnnotatedWithParams>) entry.getValue(), collectorBase);
                    break;
                case 16:
                    hasField.write(readVar.read(), (List<String>) entry.getValue(), collectorBase);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        hasField.AudioAttributesCompatParcelizer(readVar.read(), (List<?>) entry.getValue(), collectorBase, getAccessor.IconCompatParcelizer().read(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        hasField.IconCompatParcelizer(readVar.read(), (List<?>) entry.getValue(), collectorBase, getAccessor.IconCompatParcelizer().read(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (AnonymousClass2.AudioAttributesCompatParcelizer[readVar.IconCompatParcelizer().ordinal()]) {
            case 1:
                collectorBase.write(readVar.read(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                collectorBase.RemoteActionCompatParcelizer(readVar.read(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                collectorBase.IconCompatParcelizer(readVar.read(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                collectorBase.AudioAttributesCompatParcelizer(readVar.read(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                collectorBase.read(readVar.read(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                collectorBase.RemoteActionCompatParcelizer(readVar.read(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                collectorBase.RemoteActionCompatParcelizer(readVar.read(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                collectorBase.IconCompatParcelizer(readVar.read(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                collectorBase.AudioAttributesImplBaseParcelizer(readVar.read(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                collectorBase.IconCompatParcelizer(readVar.read(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                collectorBase.write(readVar.read(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                collectorBase.AudioAttributesCompatParcelizer(readVar.read(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                collectorBase.read(readVar.read(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                collectorBase.read(readVar.read(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                collectorBase.IconCompatParcelizer(readVar.read(), (AnnotatedWithParams) entry.getValue());
                break;
            case 16:
                collectorBase.IconCompatParcelizer(readVar.read(), (String) entry.getValue());
                break;
            case 17:
                collectorBase.AudioAttributesCompatParcelizer(readVar.read(), entry.getValue(), getAccessor.IconCompatParcelizer().read(entry.getValue().getClass()));
                break;
            case 18:
                collectorBase.IconCompatParcelizer(readVar.read(), entry.getValue(), getAccessor.IconCompatParcelizer().read(entry.getValue().getClass()));
                break;
        }
    }

    @Override // kotlin.emptyAnnotations
    final Object IconCompatParcelizer(asAnnotations asannotations, constructPropertyCollector constructpropertycollector, int i) {
        return asannotations.write(constructpropertycollector, i);
    }

    @Override // kotlin.emptyAnnotations
    final void read(getGetter getgetter, Object obj, asAnnotations asannotations, isPresent<_explicitClassOrOb.read> ispresent) throws IOException {
        _explicitClassOrOb.write writeVar = (_explicitClassOrOb.write) obj;
        ispresent.AudioAttributesCompatParcelizer(writeVar.RemoteActionCompatParcelizer, getgetter.AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer().getClass(), asannotations));
    }

    @Override // kotlin.emptyAnnotations
    final void write(AnnotatedWithParams annotatedWithParams, Object obj, asAnnotations asannotations, isPresent<_explicitClassOrOb.read> ispresent) throws IOException {
        _explicitClassOrOb.write writeVar = (_explicitClassOrOb.write) obj;
        constructPropertyCollector constructpropertycollector = writeVar.AudioAttributesCompatParcelizer().onMediaButtonEvent().read();
        AnnotatedParameter annotatedParameterAudioAttributesCompatParcelizer = AnnotatedParameter.AudioAttributesCompatParcelizer(ByteBuffer.wrap(annotatedWithParams.IconCompatParcelizer()));
        getAccessor.IconCompatParcelizer().RemoteActionCompatParcelizer(constructpropertycollector, annotatedParameterAudioAttributesCompatParcelizer, asannotations);
        ispresent.AudioAttributesCompatParcelizer(writeVar.RemoteActionCompatParcelizer, constructpropertycollector);
        if (annotatedParameterAudioAttributesCompatParcelizer.IconCompatParcelizer() != Integer.MAX_VALUE) {
            throw _add.IconCompatParcelizer();
        }
    }
}

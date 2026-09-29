package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a\u001d\u0010\u000b\u001a\u00020\b2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000b\u001a\u0006*\u00020\u000e0\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u0006*\u00020\u00110\u0011*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0012\u001a\u00020\b*\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "Lo/hasSuperClassStartingWith;", "p1", "", "write", "(Lo/valueInstantiatorInstance;Lo/hasSuperClassStartingWith;)V", "RemoteActionCompatParcelizer", "", "(Lo/valueInstantiatorInstance;)Z", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)Z", "Lo/deserializerModifiers;", "Lo/hasSuperClassStartingWith$RemoteActionCompatParcelizer;", "(Lo/deserializerModifiers;)Lo/hasSuperClassStartingWith$RemoteActionCompatParcelizer;", "Lo/deserializers;", "Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;", "IconCompatParcelizer", "(Lo/deserializers;Lo/valueInstantiatorInstance;)Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;", "(Lo/deserializerModifiers;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSetterInfo {
    public static final void write(valueInstantiatorInstance valueinstantiatorinstance, hasSuperClassStartingWith hassuperclassstartingwith) {
        deserializerModifiers deserializermodifiers = (deserializerModifiers) withDeserializerModifier.read(valueinstantiatorinstance.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.AudioAttributesCompatParcelizer());
        if (deserializermodifiers != null) {
            hassuperclassstartingwith.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(deserializermodifiers));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (withDeserializerModifier.read(valueinstantiatorinstance.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.onSeekTo()) != null) {
            List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = valueinstantiatorinstance.MediaBrowserCompatSearchResultReceiver();
            int size = listMediaBrowserCompatSearchResultReceiver.size();
            for (int i = 0; i < size; i++) {
                valueInstantiatorInstance valueinstantiatorinstance2 = listMediaBrowserCompatSearchResultReceiver.get(i);
                if (valueinstantiatorinstance2.AudioAttributesImplBaseParcelizer().read(_this.INSTANCE.onPrepareFromUri())) {
                    arrayList.add(valueinstantiatorinstance2);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(arrayList);
        hassuperclassstartingwith.RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(zAudioAttributesCompatParcelizer ? 1 : arrayList2.size(), zAudioAttributesCompatParcelizer ? arrayList2.size() : 1, false, 0));
    }

    public static final void RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, hasSuperClassStartingWith hassuperclassstartingwith) {
        C0168deserializers c0168deserializers = (C0168deserializers) withDeserializerModifier.read(valueinstantiatorinstance.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.read());
        if (c0168deserializers != null) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(IconCompatParcelizer(c0168deserializers, valueinstantiatorinstance));
        }
        valueInstantiatorInstance valueinstantiatorinstanceMediaBrowserCompatMediaItem = valueinstantiatorinstance.MediaBrowserCompatMediaItem();
        if (valueinstantiatorinstanceMediaBrowserCompatMediaItem == null || withDeserializerModifier.read(valueinstantiatorinstanceMediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.onSeekTo()) == null) {
            return;
        }
        deserializerModifiers deserializermodifiers = (deserializerModifiers) withDeserializerModifier.read(valueinstantiatorinstanceMediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.AudioAttributesCompatParcelizer());
        if ((deserializermodifiers == null || !IconCompatParcelizer(deserializermodifiers)) && valueinstantiatorinstance.AudioAttributesImplBaseParcelizer().read(_this.INSTANCE.onPrepareFromUri())) {
            ArrayList arrayList = new ArrayList();
            List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = valueinstantiatorinstanceMediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver();
            int size = listMediaBrowserCompatSearchResultReceiver.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                valueInstantiatorInstance valueinstantiatorinstance2 = listMediaBrowserCompatSearchResultReceiver.get(i2);
                if (valueinstantiatorinstance2.AudioAttributesImplBaseParcelizer().read(_this.INSTANCE.onPrepareFromUri())) {
                    arrayList.add(valueinstantiatorinstance2);
                    if (valueinstantiatorinstance2.getIconCompatParcelizer().accessaddObserverForBackInvoker() < valueinstantiatorinstance.getIconCompatParcelizer().accessaddObserverForBackInvoker()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(arrayList);
            hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(zAudioAttributesCompatParcelizer ? 0 : i, 1, !zAudioAttributesCompatParcelizer ? 0 : i, 1, false, ((Boolean) valueinstantiatorinstance.AudioAttributesImplBaseParcelizer().IconCompatParcelizer(_this.INSTANCE.onPrepareFromUri(), AnonymousClass2.read)).booleanValue());
            if (audioAttributesImplBaseParcelizer != null) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer);
            }
        }
    }

    /* JADX INFO: renamed from: o.getSetterInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        public static final AnonymousClass2 read = new AnonymousClass2();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }

        AnonymousClass2() {
            super(0);
        }
    }

    public static final boolean write(valueInstantiatorInstance valueinstantiatorinstance) {
        return (withDeserializerModifier.read(valueinstantiatorinstance.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.AudioAttributesCompatParcelizer()) == null && withDeserializerModifier.read(valueinstantiatorinstance.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.onSeekTo()) == null) ? false : true;
    }

    private static final boolean AudioAttributesCompatParcelizer(List<valueInstantiatorInstance> list) {
        List listRemoteActionCompatParcelizer;
        long write;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList = new ArrayList();
            valueInstantiatorInstance valueinstantiatorinstance = list.get(0);
            int i = 0;
            for (int iWrite = IntermediateLoginResponseBody.write((List) list); i < iWrite; iWrite = iWrite) {
                i++;
                valueInstantiatorInstance valueinstantiatorinstance2 = list.get(i);
                valueInstantiatorInstance valueinstantiatorinstance3 = valueinstantiatorinstance2;
                valueInstantiatorInstance valueinstantiatorinstance4 = valueinstantiatorinstance;
                float fAbs = Math.abs(Float.intBitsToFloat((int) (valueinstantiatorinstance4.IconCompatParcelizer().read() >> 32)) - Float.intBitsToFloat((int) (valueinstantiatorinstance3.IconCompatParcelizer().read() >> 32)));
                float fAbs2 = Math.abs(Float.intBitsToFloat((int) valueinstantiatorinstance4.IconCompatParcelizer().read()) - Float.intBitsToFloat((int) valueinstantiatorinstance3.IconCompatParcelizer().read()));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fAbs);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fAbs2);
                long j = -1;
                arrayList.add(getReferencedType.read(getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & jFloatToRawIntBits2) | (jFloatToRawIntBits << 32))));
                valueinstantiatorinstance = valueinstantiatorinstance2;
            }
            listRemoteActionCompatParcelizer = arrayList;
        }
        if (listRemoteActionCompatParcelizer.size() == 1) {
            write = ((getReferencedType) IntermediateLoginResponseBody.RatingCompat(listRemoteActionCompatParcelizer)).getWrite();
        } else {
            if (listRemoteActionCompatParcelizer.isEmpty()) {
                ArrayBlockingQueueDeserializer.write("Empty collection can't be reduced.");
            }
            Object objRatingCompat = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) listRemoteActionCompatParcelizer);
            int iWrite2 = IntermediateLoginResponseBody.write(listRemoteActionCompatParcelizer);
            if (iWrite2 > 0) {
                int i2 = 1;
                while (true) {
                    objRatingCompat = getReferencedType.read(getReferencedType.RemoteActionCompatParcelizer(((getReferencedType) objRatingCompat).getWrite(), ((getReferencedType) listRemoteActionCompatParcelizer.get(i2)).getWrite()));
                    if (i2 == iWrite2) {
                        break;
                    }
                    i2++;
                }
            }
            write = ((getReferencedType) objRatingCompat).getWrite();
        }
        long j2 = -1;
        return Float.intBitsToFloat((int) (write & ((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)))) < Float.intBitsToFloat((int) (write >> 32));
    }

    private static final boolean IconCompatParcelizer(deserializerModifiers deserializermodifiers) {
        return deserializermodifiers.getIconCompatParcelizer() < 0 || deserializermodifiers.getWrite() < 0;
    }

    private static final hasSuperClassStartingWith.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(deserializerModifiers deserializermodifiers) {
        return hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(deserializermodifiers.getIconCompatParcelizer(), deserializermodifiers.getWrite(), false, 0);
    }

    private static final hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer IconCompatParcelizer(C0168deserializers c0168deserializers, valueInstantiatorInstance valueinstantiatorinstance) {
        return hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(c0168deserializers.getIconCompatParcelizer(), c0168deserializers.getWrite(), c0168deserializers.getRemoteActionCompatParcelizer(), c0168deserializers.getAudioAttributesCompatParcelizer(), false, ((Boolean) valueinstantiatorinstance.AudioAttributesImplBaseParcelizer().IconCompatParcelizer(_this.INSTANCE.onPrepareFromUri(), AnonymousClass1.IconCompatParcelizer)).booleanValue());
    }

    /* JADX INFO: renamed from: o.getSetterInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        public static final AnonymousClass1 IconCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }

        AnonymousClass1() {
            super(0);
        }
    }
}

package kotlin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\n\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\n\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aK\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00132\u0016\u0010\u0003\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0017\u001a\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u0018\"\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019"}, d2 = {"", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findPropertyUnwrapper;", "p0", "Lo/_findCustomCollectionLikeDeserializer;", "p1", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "read", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lo/AbstractDeserializer;", "AudioAttributesCompatParcelizer", "(Lo/AbstractDeserializer;Lo/_findCustomCollectionLikeDeserializer;)Ljava/util/List;", "", "Lkotlin/Function1;", "", "p2", "(Lo/AbstractDeserializer;IILo/getAnswerMap;)Ljava/util/List;", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer;II)Lo/AbstractDeserializer;", "T", "write", "(Ljava/util/List;II)Ljava/util/List;", "p3", "(IIII)Z", "()Lo/AbstractDeserializer;", "Lo/AbstractDeserializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withAdditionalKeySerializers {
    private static final AbstractDeserializer read = new AbstractDeserializer("", null, 2, 0 == true ? 1 : 0);

    public static final boolean RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        boolean z = i == i2;
        boolean z2 = i3 == i4;
        return ((i < i4) & (i3 < i2)) | ((z | z2) & (i == i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> read(List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer, _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializer) {
        List listRemoteActionCompatParcelizer;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> listAudioAttributesCompatParcelizer = abstractDeserializer.AudioAttributesCompatParcelizer();
        if (listAudioAttributesCompatParcelizer == null || (listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, new Comparator() { // from class: o.withAdditionalKeySerializers.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read(Integer.valueOf(((AbstractDeserializer.AudioAttributesCompatParcelizer) t).AudioAttributesImplBaseParcelizer()), Integer.valueOf(((AbstractDeserializer.AudioAttributesCompatParcelizer) t2).AudioAttributesImplBaseParcelizer()));
            }
        })) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        setCardContent setcardcontent = new setCardContent();
        int size = listRemoteActionCompatParcelizer.size();
        int audioAttributesCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (AbstractDeserializer.AudioAttributesCompatParcelizer) listRemoteActionCompatParcelizer.get(i);
            AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default = AbstractDeserializer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer$default(audioAttributesCompatParcelizer2, _findcustomcollectionlikedeserializer.IconCompatParcelizer((_findCustomCollectionLikeDeserializer) audioAttributesCompatParcelizer2.IconCompatParcelizer()), 0, 0, null, 14, null);
            while (audioAttributesCompatParcelizer < audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer()) {
                setCardContent setcardcontent2 = setcardcontent;
                if (setcardcontent2.isEmpty()) {
                    break;
                }
                AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = (AbstractDeserializer.AudioAttributesCompatParcelizer) setcardcontent.AudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer() < audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer()) {
                    arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer3.IconCompatParcelizer(), audioAttributesCompatParcelizer, audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer()));
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer();
                } else {
                    arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer3.IconCompatParcelizer(), audioAttributesCompatParcelizer, audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer()));
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer();
                    while (!setcardcontent2.isEmpty() && audioAttributesCompatParcelizer == ((AbstractDeserializer.AudioAttributesCompatParcelizer) setcardcontent.AudioAttributesCompatParcelizer()).getAudioAttributesCompatParcelizer()) {
                        setcardcontent.removeLast();
                    }
                }
            }
            if (audioAttributesCompatParcelizer < audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer()) {
                arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(_findcustomcollectionlikedeserializer, audioAttributesCompatParcelizer, audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer()));
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer();
            }
            AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer4 = (AbstractDeserializer.AudioAttributesCompatParcelizer) setcardcontent.IconCompatParcelizer();
            if (audioAttributesCompatParcelizer4 != null) {
                if (audioAttributesCompatParcelizer4.AudioAttributesImplBaseParcelizer() == audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer() && audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer() == audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.getAudioAttributesCompatParcelizer()) {
                    setcardcontent.removeLast();
                    setcardcontent.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(((_findCustomCollectionLikeDeserializer) audioAttributesCompatParcelizer4.IconCompatParcelizer()).IconCompatParcelizer((_findCustomCollectionLikeDeserializer) audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.IconCompatParcelizer()), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.getAudioAttributesCompatParcelizer()));
                } else if (audioAttributesCompatParcelizer4.AudioAttributesImplBaseParcelizer() == audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer()) {
                    arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer4.IconCompatParcelizer(), audioAttributesCompatParcelizer4.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer()));
                    setcardcontent.removeLast();
                    setcardcontent.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.IconCompatParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.getAudioAttributesCompatParcelizer()));
                } else {
                    if (audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer() < audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.getAudioAttributesCompatParcelizer()) {
                        throw new IllegalArgumentException();
                    }
                    setcardcontent.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(((_findCustomCollectionLikeDeserializer) audioAttributesCompatParcelizer4.IconCompatParcelizer()).IconCompatParcelizer((_findCustomCollectionLikeDeserializer) audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.IconCompatParcelizer()), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.getAudioAttributesCompatParcelizer()));
                }
            } else {
                setcardcontent.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.IconCompatParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer$default.getAudioAttributesCompatParcelizer()));
            }
        }
        while (audioAttributesCompatParcelizer <= abstractDeserializer.getIconCompatParcelizer().length()) {
            setCardContent setcardcontent3 = setcardcontent;
            if (setcardcontent3.isEmpty()) {
                break;
            }
            AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer5 = (AbstractDeserializer.AudioAttributesCompatParcelizer) setcardcontent.AudioAttributesCompatParcelizer();
            arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer5.IconCompatParcelizer(), audioAttributesCompatParcelizer, audioAttributesCompatParcelizer5.getAudioAttributesCompatParcelizer()));
            audioAttributesCompatParcelizer = audioAttributesCompatParcelizer5.getAudioAttributesCompatParcelizer();
            while (!setcardcontent3.isEmpty() && audioAttributesCompatParcelizer == ((AbstractDeserializer.AudioAttributesCompatParcelizer) setcardcontent.AudioAttributesCompatParcelizer()).getAudioAttributesCompatParcelizer()) {
                setcardcontent.removeLast();
            }
        }
        if (audioAttributesCompatParcelizer < abstractDeserializer.getIconCompatParcelizer().length()) {
            arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(_findcustomcollectionlikedeserializer, audioAttributesCompatParcelizer, abstractDeserializer.getIconCompatParcelizer().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(_findcustomcollectionlikedeserializer, 0, 0));
        }
        return arrayList;
    }

    static /* synthetic */ List AudioAttributesCompatParcelizer$default(AbstractDeserializer abstractDeserializer, int i, int i2, getAnswerMap getanswermap, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            getanswermap = null;
        }
        return AudioAttributesCompatParcelizer(abstractDeserializer, i, i2, getanswermap);
    }

    private static final List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer, int i, int i2, getAnswerMap<? super AbstractDeserializer.RemoteActionCompatParcelizer, Boolean> getanswermap) {
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> listWrite;
        if (i == i2 || (listWrite = abstractDeserializer.write()) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= abstractDeserializer.getIconCompatParcelizer().length()) {
            if (getanswermap == null) {
                return listWrite;
            }
            ArrayList arrayList = new ArrayList(listWrite.size());
            int size = listWrite.size();
            while (i3 < size) {
                AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = listWrite.get(i3);
                if (getanswermap.invoke(audioAttributesCompatParcelizer.IconCompatParcelizer()).booleanValue()) {
                    arrayList.add(audioAttributesCompatParcelizer);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(listWrite.size());
        int size2 = listWrite.size();
        while (i3 < size2) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer2 = listWrite.get(i3);
            if ((getanswermap == null || getanswermap.invoke(audioAttributesCompatParcelizer2.IconCompatParcelizer()).booleanValue()) && RemoteActionCompatParcelizer(i, i2, audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer())) {
                arrayList2.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer2.IconCompatParcelizer(), getQues.write(audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer(), i, i2) - i, getQues.write(audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer(), i, i2) - i, audioAttributesCompatParcelizer2.getRemoteActionCompatParcelizer()));
            }
            i3++;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer RemoteActionCompatParcelizer(AbstractDeserializer abstractDeserializer, int i, int i2) {
        String str = "";
        if (i != i2) {
            String strSubstring = abstractDeserializer.getIconCompatParcelizer().substring(i, i2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            str = strSubstring;
        }
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(abstractDeserializer, i, i2, new getAnswerMap() { // from class: o.constructForNonPOJO
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(withAdditionalKeySerializers.read((AbstractDeserializer.RemoteActionCompatParcelizer) obj));
            }
        });
        if (listAudioAttributesCompatParcelizer == null) {
            listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new AbstractDeserializer(str, listAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(AbstractDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return !(remoteActionCompatParcelizer instanceof _findCustomCollectionLikeDeserializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AbstractDeserializer.AudioAttributesCompatParcelizer<T>> write(List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends T>> list, int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(i);
            sb.append(") should be less than or equal to end (");
            sb.append(i2);
            sb.append(')');
            withStackTrace.read(sb.toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<? extends T> audioAttributesCompatParcelizer = list.get(i3);
            if (RemoteActionCompatParcelizer(i, i2, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())) {
                arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer(), Math.max(i, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()) - i, Math.min(i2, audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) - i, audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
            }
        }
        ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? null : arrayList2;
    }

    public static final AbstractDeserializer AudioAttributesCompatParcelizer() {
        return read;
    }
}

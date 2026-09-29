package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/DataFormatReadersAccessorForReader;", "", "<init>", "()V", "", "Lo/deserializeAndSet;", "p0", "Lo/getDataStream;", "p1", "Lo/withValueDeserializer;", "p2", "RemoteActionCompatParcelizer", "(Ljava/util/List;Lo/getDataStream;I)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataFormatReadersAccessorForReader {
    public final List<deserializeAndSet> RemoteActionCompatParcelizer(List<? extends deserializeAndSet> p0, getDataStream p1, int p2) {
        ArrayList arrayList = new ArrayList(p0.size());
        List<? extends deserializeAndSet> list = p0;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            deserializeAndSet deserializeandset = p0.get(i2);
            deserializeAndSet deserializeandset2 = deserializeandset;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializeandset2.read(), p1) && withValueDeserializer.write(deserializeandset2.IconCompatParcelizer(), p2)) {
                arrayList.add(deserializeandset);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(p0.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            deserializeAndSet deserializeandset3 = p0.get(i3);
            if (withValueDeserializer.write(deserializeandset3.IconCompatParcelizer(), p2)) {
                arrayList3.add(deserializeandset3);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            p0 = arrayList4;
        }
        List<? extends deserializeAndSet> list2 = p0;
        getDataStream getdatastream = null;
        if (p1.compareTo(getDataStream.INSTANCE.write()) >= 0) {
            if (p1.compareTo(getDataStream.INSTANCE.AudioAttributesImplApi21Parcelizer()) <= 0) {
                getDataStream getdatastreamAudioAttributesImplApi21Parcelizer = getDataStream.INSTANCE.AudioAttributesImplApi21Parcelizer();
                List<? extends deserializeAndSet> list3 = list2;
                int size3 = list3.size();
                getDataStream getdatastream2 = null;
                getDataStream getdatastream3 = null;
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    getDataStream getdatastream4 = ((deserializeAndSet) list2.get(i4)).read();
                    if (getdatastreamAudioAttributesImplApi21Parcelizer == null || getdatastream4.compareTo(getdatastreamAudioAttributesImplApi21Parcelizer) <= 0) {
                        if (getdatastream4.compareTo(p1) < 0) {
                            if (getdatastream2 == null || getdatastream4.compareTo(getdatastream2) > 0) {
                                getdatastream2 = getdatastream4;
                            }
                        } else {
                            if (getdatastream4.compareTo(p1) <= 0) {
                                getdatastream2 = getdatastream4;
                                getdatastream3 = getdatastream2;
                                break;
                            }
                            if (getdatastream3 == null || getdatastream4.compareTo(getdatastream3) < 0) {
                                getdatastream3 = getdatastream4;
                            }
                        }
                    }
                    i4++;
                }
                if (getdatastream3 != null) {
                    getdatastream2 = getdatastream3;
                }
                ArrayList arrayList5 = new ArrayList(list2.size());
                int size4 = list3.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj = list2.get(i5);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((deserializeAndSet) obj).read(), getdatastream2)) {
                        arrayList5.add(obj);
                    }
                }
                ArrayList arrayList6 = arrayList5;
                if (arrayList6.isEmpty()) {
                    getDataStream getdatastreamAudioAttributesImplApi21Parcelizer2 = getDataStream.INSTANCE.AudioAttributesImplApi21Parcelizer();
                    int size5 = list3.size();
                    getDataStream getdatastream5 = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            break;
                        }
                        getDataStream getdatastream6 = ((deserializeAndSet) list2.get(i6)).read();
                        if (getdatastreamAudioAttributesImplApi21Parcelizer2 == null || getdatastream6.compareTo(getdatastreamAudioAttributesImplApi21Parcelizer2) >= 0) {
                            if (getdatastream6.compareTo(p1) < 0) {
                                if (getdatastream5 == null || getdatastream6.compareTo(getdatastream5) > 0) {
                                    getdatastream5 = getdatastream6;
                                }
                            } else {
                                if (getdatastream6.compareTo(p1) <= 0) {
                                    getdatastream = getdatastream6;
                                    getdatastream5 = getdatastream;
                                    break;
                                }
                                if (getdatastream == null || getdatastream6.compareTo(getdatastream) < 0) {
                                    getdatastream = getdatastream6;
                                }
                            }
                        }
                        i6++;
                    }
                    if (getdatastream == null) {
                        getdatastream = getdatastream5;
                    }
                    ArrayList arrayList7 = new ArrayList(list2.size());
                    int size6 = list3.size();
                    while (i < size6) {
                        Object obj2 = list2.get(i);
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((deserializeAndSet) obj2).read(), getdatastream)) {
                            arrayList7.add(obj2);
                        }
                        i++;
                    }
                    arrayList6 = arrayList7;
                }
                return arrayList6;
            }
            List<? extends deserializeAndSet> list4 = list2;
            int size7 = list4.size();
            getDataStream getdatastream7 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                getDataStream getdatastream8 = ((deserializeAndSet) list2.get(i7)).read();
                if (getdatastream8.compareTo(p1) < 0) {
                    if (getdatastream7 == null || getdatastream8.compareTo(getdatastream7) > 0) {
                        getdatastream7 = getdatastream8;
                    }
                } else {
                    if (getdatastream8.compareTo(p1) <= 0) {
                        getdatastream = getdatastream8;
                        getdatastream7 = getdatastream;
                        break;
                    }
                    if (getdatastream == null || getdatastream8.compareTo(getdatastream) < 0) {
                        getdatastream = getdatastream8;
                    }
                }
                i7++;
            }
            if (getdatastream == null) {
                getdatastream = getdatastream7;
            }
            ArrayList arrayList8 = new ArrayList(list2.size());
            int size8 = list4.size();
            while (i < size8) {
                Object obj3 = list2.get(i);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((deserializeAndSet) obj3).read(), getdatastream)) {
                    arrayList8.add(obj3);
                }
                i++;
            }
            return arrayList8;
        }
        List<? extends deserializeAndSet> list5 = list2;
        int size9 = list5.size();
        getDataStream getdatastream9 = null;
        int i8 = 0;
        while (true) {
            if (i8 >= size9) {
                break;
            }
            getDataStream getdatastream10 = ((deserializeAndSet) list2.get(i8)).read();
            if (getdatastream10.compareTo(p1) < 0) {
                if (getdatastream9 == null || getdatastream10.compareTo(getdatastream9) > 0) {
                    getdatastream9 = getdatastream10;
                }
            } else {
                if (getdatastream10.compareTo(p1) <= 0) {
                    getdatastream = getdatastream10;
                    getdatastream9 = getdatastream;
                    break;
                }
                if (getdatastream == null || getdatastream10.compareTo(getdatastream) < 0) {
                    getdatastream = getdatastream10;
                }
            }
            i8++;
        }
        if (getdatastream9 != null) {
            getdatastream = getdatastream9;
        }
        ArrayList arrayList9 = new ArrayList(list2.size());
        int size10 = list5.size();
        while (i < size10) {
            Object obj4 = list2.get(i);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((deserializeAndSet) obj4).read(), getdatastream)) {
                arrayList9.add(obj4);
            }
            i++;
        }
        return arrayList9;
    }
}

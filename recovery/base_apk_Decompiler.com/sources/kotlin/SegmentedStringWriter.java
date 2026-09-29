package kotlin;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "Lo/setTextAppearance;", "Lo/setDropDownBackgroundResource;", "AudioAttributesCompatParcelizer", "(Lo/setTextAppearance;)Lo/setDropDownBackgroundResource;", "", "K", "Lkotlin/Function1;", "p0", "RemoteActionCompatParcelizer", "(Lo/setTextAppearance;Lo/getAnswerMap;)Lo/setTextAppearance;", "", "read", "(Lo/setTextAppearance;Lo/getAnswerMap;)Z", "", "write", "(Lo/setDropDownBackgroundResource;Lo/getAnswerMap;)V", "IconCompatParcelizer", "(Lo/setDropDownBackgroundResource;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SegmentedStringWriter {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> setDropDownBackgroundResource<T> AudioAttributesCompatParcelizer(setTextAppearance<T> settextappearance) {
        setDropDownBackgroundResource<T> setdropdownbackgroundresource = (setDropDownBackgroundResource<T>) new setDropDownBackgroundResource(settextappearance.getRemoteActionCompatParcelizer());
        Object[] objArr = settextappearance.IconCompatParcelizer;
        int i = settextappearance.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            setdropdownbackgroundresource.AudioAttributesCompatParcelizer(objArr[i2]);
        }
        return setdropdownbackgroundresource;
    }

    public static final <T, K extends Comparable<? super K>> setTextAppearance<T> RemoteActionCompatParcelizer(setTextAppearance<T> settextappearance, getAnswerMap<? super T, ? extends K> getanswermap) {
        if (read(settextappearance, getanswermap)) {
            return settextappearance;
        }
        setDropDownBackgroundResource setdropdownbackgroundresourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(settextappearance);
        write(setdropdownbackgroundresourceAudioAttributesCompatParcelizer, getanswermap);
        return setdropdownbackgroundresourceAudioAttributesCompatParcelizer;
    }

    public static final <T, K extends Comparable<? super K>> boolean read(setTextAppearance<T> settextappearance, getAnswerMap<? super T, ? extends K> getanswermap) {
        if (settextappearance.getRemoteActionCompatParcelizer() <= 1) {
            return true;
        }
        K kInvoke = getanswermap.invoke(settextappearance.read(0));
        if (kInvoke == null) {
            return false;
        }
        int remoteActionCompatParcelizer = settextappearance.getRemoteActionCompatParcelizer();
        int i = 1;
        while (i < remoteActionCompatParcelizer) {
            K kInvoke2 = getanswermap.invoke(settextappearance.read(i));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T, K extends Comparable<? super K>> void write(setDropDownBackgroundResource<T> setdropdownbackgroundresource, final getAnswerMap<? super T, ? extends K> getanswermap) {
        List<T> listAudioAttributesCompatParcelizer = setdropdownbackgroundresource.AudioAttributesCompatParcelizer();
        if (listAudioAttributesCompatParcelizer.size() > 1) {
            IntermediateLoginResponseBody.IconCompatParcelizer(listAudioAttributesCompatParcelizer, new Comparator() { // from class: o.SegmentedStringWriter.3
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    getAnswerMap getanswermap2 = getanswermap;
                    return getConfigExpirySeconds.read((Comparable) getanswermap2.invoke(t), (Comparable) getanswermap2.invoke(t2));
                }
            });
        }
    }

    public static final <T> T IconCompatParcelizer(setDropDownBackgroundResource<T> setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource.AudioAttributesImplApi21Parcelizer()) {
            throw new NoSuchElementException("List is empty.");
        }
        int remoteActionCompatParcelizer = setdropdownbackgroundresource.getRemoteActionCompatParcelizer() - 1;
        T t = setdropdownbackgroundresource.read(remoteActionCompatParcelizer);
        setdropdownbackgroundresource.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        return t;
    }
}

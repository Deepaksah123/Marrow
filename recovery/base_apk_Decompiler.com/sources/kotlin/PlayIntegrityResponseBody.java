package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class PlayIntegrityResponseBody extends TextSearchBodyResponse {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class RemoteActionCompatParcelizer<T> implements getTopRankers<T> {
        private /* synthetic */ Iterable RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(Iterable iterable) {
            this.RemoteActionCompatParcelizer = iterable;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<T> write() {
            return this.RemoteActionCompatParcelizer.iterator();
        }
    }

    public static final <T> boolean AudioAttributesCompatParcelizer(Iterable<? extends T> iterable, T t) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, t) >= 0;
    }

    public static final <T> T RatingCompat(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            return (T) IntermediateLoginResponseBody.RatingCompat((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return it.next();
    }

    public static final <T> T RatingCompat(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T MediaMetadataCompat(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> T MediaBrowserCompatSearchResultReceiver(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T read(List<? extends T> list, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final <T> int RemoteActionCompatParcelizer(Iterable<? extends T> iterable, T t) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int RemoteActionCompatParcelizer(List<? extends T> list, T t) {
        toMagicModuleMetaRepoModel.write(list, "");
        return list.indexOf(t);
    }

    public static final <T> T MediaDescriptionCompat(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            return (T) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T MediaBrowserCompatMediaItem(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(IntermediateLoginResponseBody.write((List) list));
    }

    public static final <T> T MediaBrowserCompatSearchResultReceiver(Iterable<? extends T> iterable) {
        T next;
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final <T> T MediaMetadataCompat(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> T MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            return (T) IntermediateLoginResponseBody.onCommand((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T onCommand(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> T onCommand(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> T MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T> List<T> IconCompatParcelizer(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Comparable comparableValueOf;
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            if (size == 1) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.MediaDescriptionCompat(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 > 0) {
                comparableValueOf = Boolean.valueOf(arrayList.add(t));
            } else {
                i2++;
                comparableValueOf = Integer.valueOf(i2);
            }
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((List) arrayList);
    }

    public static final <T> List<T> MediaDescriptionCompat(List<? extends T> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return IntermediateLoginResponseBody.write((Iterable) list, getQues.write(list.size() - 1, 0));
    }

    public static final <T> List<T> read(Iterable<? extends T> iterable, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (getanswermap.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> AudioAttributesImplApi26Parcelizer(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return (List) IntermediateLoginResponseBody.IconCompatParcelizer((Iterable) iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C IconCompatParcelizer(Iterable<? extends T> iterable, C c) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(c, "");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T> List<T> AudioAttributesCompatParcelizer(List<? extends T> list, newEncryptedObject newencryptedobject) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(newencryptedobject, "");
        return newencryptedobject.AudioAttributesImplApi26Parcelizer() ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : IntermediateLoginResponseBody.onPlay(list.subList(newencryptedobject.write().intValue(), newencryptedobject.IconCompatParcelizer().intValue() + 1));
    }

    public static final <T> List<T> write(Iterable<? extends T> iterable, int i) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return IntermediateLoginResponseBody.onPlay(iterable);
            }
            if (i == 1) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RatingCompat(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((List) arrayList);
    }

    public static final <T> List<T> AudioAttributesCompatParcelizer(List<? extends T> list, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        int size = list.size();
        if (i >= size) {
            return IntermediateLoginResponseBody.onPlay(list);
        }
        if (i == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> handleMediaPlayPauseIfPendingOnHandler(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return IntermediateLoginResponseBody.onPlay(iterable);
        }
        List<T> listOnFastForward = IntermediateLoginResponseBody.onFastForward(iterable);
        IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer((List) listOnFastForward);
        return listOnFastForward;
    }

    public static final <T extends Comparable<? super T>> List<T> onPause(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return IntermediateLoginResponseBody.onPlay(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            getOrderDetails.AudioAttributesCompatParcelizer((Comparable[]) array);
            return getOrderDetails.read(array);
        }
        List<T> listOnFastForward = IntermediateLoginResponseBody.onFastForward(iterable);
        IntermediateLoginResponseBody.IconCompatParcelizer((List) listOnFastForward);
        return listOnFastForward;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> AudioAttributesCompatParcelizer(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return IntermediateLoginResponseBody.onPlay(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            getOrderDetails.IconCompatParcelizer(array, (Comparator) comparator);
            return getOrderDetails.read(array);
        }
        List<T> listOnFastForward = IntermediateLoginResponseBody.onFastForward(iterable);
        IntermediateLoginResponseBody.IconCompatParcelizer(listOnFastForward, comparator);
        return listOnFastForward;
    }

    public static final byte[] write(Collection<Byte> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static final float[] AudioAttributesCompatParcelizer(Collection<Float> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static final int[] IconCompatParcelizer(Collection<Integer> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static final long[] RemoteActionCompatParcelizer(Collection<Long> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static final <T, C extends Collection<? super T>> C write(Iterable<? extends T> iterable, C c) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(c, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static final <T> HashSet<T> onMediaButtonEvent(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return (HashSet) IntermediateLoginResponseBody.write((Iterable) iterable, new HashSet(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 12))));
    }

    public static final <T> List<T> onPlay(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            if (size != 1) {
                return IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver(collection);
            }
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.onFastForward(iterable));
    }

    public static final <T> List<T> onFastForward(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            return IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) iterable);
        }
        return (List) IntermediateLoginResponseBody.write((Iterable) iterable, new ArrayList());
    }

    public static final <T> List<T> MediaBrowserCompatItemReceiver(Collection<? extends T> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> onPlayFromUri(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return getKycMessage.read();
            }
            if (size != 1) {
                return (Set) IntermediateLoginResponseBody.write((Iterable) iterable, new LinkedHashSet(VideoTimelineResponseBody.read(collection.size())));
            }
            return getKycMessage.read(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return getKycMessage.read((Set) IntermediateLoginResponseBody.write((Iterable) iterable, new LinkedHashSet()));
    }

    public static final <T, R> List<R> write(Iterable<? extends T> iterable, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(getanswermap.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C read(Iterable<? extends T> iterable, C c, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(c, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(getanswermap.invoke(it.next()));
        }
        return c;
    }

    public static final <T> Iterable<SyncResult<T>> onPlayFromSearch(final Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return new TestResponseBody(new getCreatedOnDateMs() { // from class: o.getTestType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return PlayIntegrityResponseBody.onPrepare(iterable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator onPrepare(Iterable iterable) {
        return iterable.iterator();
    }

    public static final <T> List<T> MediaBrowserCompatCustomActionResultReceiver(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return IntermediateLoginResponseBody.onPlay(IntermediateLoginResponseBody.onPlayFromMediaId(iterable));
    }

    public static final <T> Set<T> AudioAttributesCompatParcelizer(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(iterable2, "");
        Set<T> setOnPlayFromMediaId = IntermediateLoginResponseBody.onPlayFromMediaId(iterable);
        IntermediateLoginResponseBody.read((Collection) setOnPlayFromMediaId, (Iterable) iterable2);
        return setOnPlayFromMediaId;
    }

    public static final <T> Set<T> IconCompatParcelizer(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(iterable2, "");
        Set<T> setOnPlayFromMediaId = IntermediateLoginResponseBody.onPlayFromMediaId(iterable);
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Collection) setOnPlayFromMediaId, (Iterable) iterable2);
        return setOnPlayFromMediaId;
    }

    public static final <T> Set<T> onPlayFromMediaId(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) IntermediateLoginResponseBody.write((Iterable) iterable, new LinkedHashSet());
    }

    public static final <T> Set<T> write(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(iterable2, "");
        Set<T> setOnPlayFromMediaId = IntermediateLoginResponseBody.onPlayFromMediaId(iterable);
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) setOnPlayFromMediaId, (Iterable) iterable2);
        return setOnPlayFromMediaId;
    }

    public static final <T> boolean IconCompatParcelizer(Iterable<? extends T> iterable, getAnswerMap<? super T, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!getanswermap.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Float MediaBrowserCompatMediaItem(Iterable<Float> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float onCustomAction(Iterable<Float> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final <T extends Comparable<? super T>> T onAddQueueItem(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> List<List<T>> MediaBrowserCompatItemReceiver(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(iterable, 5, 5);
    }

    public static final <T> List<T> write(Iterable<? extends T> iterable, T t) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> RemoteActionCompatParcelizer(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(iterable2, "");
        Collection collectionAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) iterable2);
        if (collectionAudioAttributesCompatParcelizer.isEmpty()) {
            return IntermediateLoginResponseBody.onPlay(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collectionAudioAttributesCompatParcelizer.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> read(Iterable<? extends T> iterable, T t) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            return IntermediateLoginResponseBody.read((Collection) iterable, (Object) t);
        }
        ArrayList arrayList = new ArrayList();
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) iterable);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> read(Collection<? extends T> collection, T t) {
        toMagicModuleMetaRepoModel.write(collection, "");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> read(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(iterable2, "");
        if (iterable instanceof Collection) {
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) iterable, (Iterable) iterable2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) iterable);
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) iterable2);
        return arrayList;
    }

    public static final <T> List<T> AudioAttributesCompatParcelizer(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) iterable);
        return arrayList2;
    }

    public static final <T> List<List<T>> AudioAttributesCompatParcelizer(Iterable<? extends T> iterable, int i, int i2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        LoggedUserResponse.IconCompatParcelizer(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            int i3 = 0;
            while (i3 >= 0 && i3 < size) {
                int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(i, size - i3);
                ArrayList arrayList2 = new ArrayList(iRemoteActionCompatParcelizer);
                for (int i4 = 0; i4 < iRemoteActionCompatParcelizer; i4++) {
                    arrayList2.add(list.get(i4 + i3));
                }
                arrayList.add(arrayList2);
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = LoggedUserResponse.read(iterable.iterator(), i, i2, true, false);
        while (it.hasNext()) {
            arrayList3.add((List) it.next());
        }
        return arrayList3;
    }

    public static final <T, R> List<R> RemoteActionCompatParcelizer(Iterable<? extends T> iterable, getAnswerMap<? super List<? extends T>, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        LoggedUserResponse.IconCompatParcelizer(2, 1);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            KYCMetaV1 kYCMetaV1 = new KYCMetaV1(list);
            for (int i = 0; i >= 0 && i < size; i++) {
                int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(2, size - i);
                if (iRemoteActionCompatParcelizer < 2) {
                    break;
                }
                kYCMetaV1.write(i, iRemoteActionCompatParcelizer + i);
                arrayList.add(getanswermap.invoke(kYCMetaV1));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = LoggedUserResponse.read(iterable.iterator(), 2, 1, false, true);
        while (it.hasNext()) {
            arrayList2.add(getanswermap.invoke((List) it.next()));
        }
        return arrayList2;
    }

    public static final <T, A extends Appendable> A write(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) throws IOException {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(a, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            TestGroupLSModel.RemoteActionCompatParcelizer(a, t, getanswermap);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String RemoteActionCompatParcelizer(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap getanswermap, int i2) {
        if ((i2 & 1) != 0) {
        }
        CharSequence charSequence5 = charSequence;
        if ((i2 & 2) != 0) {
        }
        CharSequence charSequence6 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        CharSequence charSequence7 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
        }
        CharSequence charSequence8 = charSequence4;
        if ((i2 & 32) != 0) {
            getanswermap = null;
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(iterable, charSequence5, charSequence6, charSequence7, i3, charSequence8, getanswermap);
    }

    public static final <T> String AudioAttributesCompatParcelizer(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(charSequence2, "");
        toMagicModuleMetaRepoModel.write(charSequence3, "");
        toMagicModuleMetaRepoModel.write(charSequence4, "");
        return ((StringBuilder) IntermediateLoginResponseBody.write(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, getanswermap)).toString();
    }

    public static final <T> getTopRankers<T> AudioAttributesImplBaseParcelizer(Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        return new RemoteActionCompatParcelizer(iterable);
    }

    public static final double AudioAttributesImplApi21Parcelizer(Iterable<Float> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i++;
            if (i < 0) {
                IntermediateLoginResponseBody.write();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static final <T, R> List<Pair<T, R>> AudioAttributesImplApi26Parcelizer(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(setAction.write(it.next(), it2.next()));
        }
        return arrayList;
    }
}

package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.verifyApplicationThread;

/* JADX INFO: loaded from: classes5.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        verifyApplicationThread verifyapplicationthread = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            verifyapplicationthread.add(arrayList.get(i).freeze());
        }
        return verifyapplicationthread;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        verifyApplicationThread verifyapplicationthread = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            verifyapplicationthread.add(it.next().freeze());
        }
        return verifyapplicationthread;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        verifyApplicationThread verifyapplicationthread = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            verifyapplicationthread.add(e.freeze());
        }
        return verifyapplicationthread;
    }
}

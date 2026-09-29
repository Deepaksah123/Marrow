package com.fasterxml.jackson.databind.util;

/* JADX INFO: loaded from: classes2.dex */
public interface LookupCache<K, V> {
    V get(Object obj);

    V putIfAbsent(K k, V v);
}

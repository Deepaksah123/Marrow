package com.marrow.data.models.pearl;

import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class PearlListItem<T> {
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_PEARL = 2;
    public int count;
    public String id;
    public T item;
    public int type;
    public int typePosition;

    public boolean equals(Object obj) {
        if (!(obj instanceof PearlListItem)) {
            return super.equals(obj);
        }
        PearlListItem pearlListItem = (PearlListItem) obj;
        return this.type == pearlListItem.type && this.typePosition == pearlListItem.typePosition && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.id, pearlListItem.id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PearlListItem newInstance(String str, PearlListModel pearlListModel) {
        PearlListItem pearlListItem = new PearlListItem();
        pearlListItem.type = 2;
        pearlListItem.item = pearlListModel;
        pearlListItem.id = str;
        return pearlListItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PearlListItem newHeaderInstance(String str, String str2, int i) {
        PearlListItem pearlListItem = new PearlListItem();
        pearlListItem.type = 1;
        pearlListItem.item = str2;
        pearlListItem.id = str;
        pearlListItem.count = i;
        return pearlListItem;
    }
}
